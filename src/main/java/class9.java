import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class9 extends class59 {

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "[Z")
    public boolean[] field125;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "[I")
    public int[] field116;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "[[I")
    public int[][] field123;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field114 = 0;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "Lok;")
    private static class41 field122 = class137.method956("M", 45);

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Lok;")
    public static class41 field117 = field122;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "Lok;")
    public static class41 field121 = field122;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
    public static int field126 = 0;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 4)
    public static void method33(boolean arg0) {
        if (!arg0) {
            method36(-90, true, (class73) null);
        }
        field117 = null;
        field122 = null;
        field121 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Z", line = 17)
    private static final boolean method34(int arg0, int arg1) {
        field124++;
        if (arg0 != 31181) {
            field118 = -73;
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V", line = 36)
    public static final void method35(boolean arg0) {
        field113++;
        class160.field2508 = new class212();
        if (!arg0) {
            method36(109, true, (class73) null);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZLpe;)V", line = 50)
    public static final void method36(int arg0, boolean arg1, class73 arg2) {
        field119++;
        Object[] var3 = arg2.field1083;
        int var4 = (Integer) var3[0];
        class137 var5 = class277.method1961(var4, 104952679);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = -1;
        class246.field3952 = 0;
        int[] var8 = var5.field2043;
        int var9 = 0;
        int[] var10 = var5.field2047;
        byte var11 = -1;
        try {
            class307.field5177 = new int[var5.field2052];
            class307.field5151 = new class41[var5.field2042];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field1088;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field1071;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field1079 == null ? -1 : arg2.field1079.field4910;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field1082;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field1079 == null ? -1 : arg2.field1079.field4996;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field1072 == null ? -1 : arg2.field1072.field4910;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field1072 == null ? -1 : arg2.field1072.field4996;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field1080;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field1084;
                    }
                    class307.field5177[var12++] = var16;
                } else if (var3[var14] instanceof class41) {
                    class41 var15 = (class41) var3[var14];
                    if (var15.method268(class43.field686, 1631)) {
                        var15 = arg2.field1086;
                    }
                    class307.field5151[var13++] = var15;
                }
            }
            if (!arg1) {
                method36(-52, true, (class73) null);
            }
            int var17 = 0;
            label4110: while (true) {
                var17++;
                if (arg0 < var17) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var485 = var8[var7];
                if (var485 < 100) {
                    if (var485 == 0) {
                        class140.field2159[var9++] = var10[var7];
                        continue;
                    }
                    if (var485 == 1) {
                        int var18 = var10[var7];
                        class140.field2159[var9++] = class60.field885[var18];
                        continue;
                    }
                    if (var485 == 2) {
                        int var19 = var10[var7];
                        var9--;
                        class15.method69(var19, class140.field2159[var9], -10);
                        continue;
                    }
                    if (var485 == 3) {
                        class301.field4877[var6++] = var5.field2049[var7];
                        continue;
                    }
                    if (var485 == 6) {
                        var7 += var10[var7];
                        continue;
                    }
                    if (var485 == 7) {
                        var9 -= 2;
                        if (class140.field2159[var9 + 1] != class140.field2159[var9]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var485 == 8) {
                        var9 -= 2;
                        if (class140.field2159[var9 + 1] == class140.field2159[var9]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var485 == 9) {
                        var9 -= 2;
                        if (class140.field2159[var9 + 1] > class140.field2159[var9]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var485 == 10) {
                        var9 -= 2;
                        if (class140.field2159[var9 + 1] < class140.field2159[var9]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var485 == 21) {
                        if (class246.field3952 == 0) {
                            return;
                        }
                        class264 var20 = class285.field4643[--class246.field3952];
                        var7 = var20.field4190;
                        class307.field5177 = var20.field4189;
                        class307.field5151 = var20.field4184;
                        var5 = var20.field4179;
                        var10 = var5.field2047;
                        var8 = var5.field2043;
                        continue;
                    }
                    if (var485 == 25) {
                        int var21 = var10[var7];
                        class140.field2159[var9++] = class260.method1831(var21, 11526);
                        continue;
                    }
                    if (var485 == 27) {
                        int var22 = var10[var7];
                        var9--;
                        class176.method1261(90, class140.field2159[var9], var22);
                        continue;
                    }
                    if (var485 == 31) {
                        var9 -= 2;
                        if (class140.field2159[var9] <= class140.field2159[var9 + 1]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var485 == 32) {
                        var9 -= 2;
                        if (class140.field2159[var9] >= class140.field2159[var9 + 1]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var485 == 33) {
                        class140.field2159[var9++] = class307.field5177[var10[var7]];
                        continue;
                    }
                    int var10001;
                    if (var485 == 34) {
                        var10001 = var10[var7];
                        var9--;
                        class307.field5177[var10001] = class140.field2159[var9];
                        continue;
                    }
                    if (var485 == 35) {
                        class301.field4877[var6++] = class307.field5151[var10[var7]];
                        continue;
                    }
                    if (var485 == 36) {
                        var10001 = var10[var7];
                        var6--;
                        class307.field5151[var10001] = class301.field4877[var6];
                        continue;
                    }
                    if (var485 == 37) {
                        int var23 = var10[var7];
                        var6 -= var23;
                        class41 var24 = class262.method1839(var23, 4961, class301.field4877, var6);
                        class301.field4877[var6++] = var24;
                        continue;
                    }
                    if (var485 == 38) {
                        var9--;
                        continue;
                    }
                    if (var485 == 39) {
                        var6--;
                        continue;
                    }
                    if (var485 == 40) {
                        int var25 = var10[var7];
                        class137 var26 = class277.method1961(var25, 104952679);
                        int[] var27 = new int[var26.field2052];
                        class41[] var28 = new class41[var26.field2042];
                        for (int var29 = 0; var29 < var26.field2054; var29++) {
                            var27[var29] = class140.field2159[var29 + var9 - var26.field2054];
                        }
                        for (int var30 = 0; var30 < var26.field2044; var30++) {
                            var28[var30] = class301.field4877[var30 + var6 - var26.field2044];
                        }
                        var6 -= var26.field2044;
                        var9 -= var26.field2054;
                        class264 var31 = new class264();
                        var31.field4179 = var5;
                        var31.field4190 = var7;
                        var31.field4189 = class307.field5177;
                        var31.field4184 = class307.field5151;
                        if (class246.field3952 >= class285.field4643.length) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        var7 = -1;
                        class285.field4643[class246.field3952++] = var31;
                        var10 = var26.field2047;
                        var8 = var26.field2043;
                        class307.field5151 = var28;
                        class307.field5177 = var27;
                        continue;
                    }
                    if (var485 == 42) {
                        class140.field2159[var9++] = class203.field3280[var10[var7]];
                        continue;
                    }
                    if (var485 == 43) {
                        int var32 = var10[var7];
                        var9--;
                        class203.field3280[var32] = class140.field2159[var9];
                        class22.method148(false, var32);
                        continue;
                    }
                    if (var485 == 44) {
                        int var33 = var10[var7] >> 16;
                        var9--;
                        int var34 = class140.field2159[var9];
                        int var35 = var10[var7] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            class8.field108[var33] = var34;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var34) {
                                    continue label4110;
                                }
                                class216.field3470[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var485 == 45) {
                        int var38 = var10[var7];
                        var9--;
                        int var39 = class140.field2159[var9];
                        if (var39 >= 0 && var39 < class8.field108[var38]) {
                            class140.field2159[var9++] = class216.field3470[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var485 == 46) {
                        int var40 = var10[var7];
                        var9 -= 2;
                        int var41 = class140.field2159[var9];
                        if (var41 >= 0 && var41 < class8.field108[var40]) {
                            class216.field3470[var40][var41] = class140.field2159[var9 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var485 == 47) {
                        class41 var42 = class137.field2045[var10[var7]];
                        if (var42 == null) {
                            var42 = class245.field3911;
                        }
                        class301.field4877[var6++] = var42;
                        continue;
                    }
                    if (var485 == 48) {
                        int var43 = var10[var7];
                        var6--;
                        class137.field2045[var43] = class301.field4877[var6];
                        class165.method1154(var43, 112);
                        continue;
                    }
                    if (var485 == 51) {
                        class86 var44 = var5.field2055[var10[var7]];
                        var9--;
                        class55 var45 = (class55) var44.method617((long) class140.field2159[var9], !arg1);
                        if (var45 != null) {
                            var7 += var45.field804;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var485 < 300) {
                    if (var485 == 100) {
                        var9 -= 3;
                        int var464 = class140.field2159[var9];
                        int var465 = class140.field2159[var9 + 1];
                        int var466 = class140.field2159[var9 + 2];
                        if (var465 == 0) {
                            throw new RuntimeException();
                        }
                        class302 var467 = class165.method1157(!arg1, var464);
                        if (var467.field4988 == null) {
                            var467.field4988 = new class302[var466 + 1];
                        }
                        if (var467.field4988.length <= var466) {
                            class302[] var468 = new class302[var466 + 1];
                            for (int var469 = 0; var469 < var467.field4988.length; var469++) {
                                var468[var469] = var467.field4988[var469];
                            }
                            var467.field4988 = var468;
                        }
                        if (var466 > 0 && var467.field4988[var466 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var466 - 1));
                        }
                        class302 var470 = new class302();
                        var470.field4999 = var470.field4910 = var467.field4910;
                        var470.field4951 = var465;
                        var470.field4996 = var466;
                        var470.field4964 = true;
                        var467.field4988[var466] = var470;
                        if (var46) {
                            class315.field5314 = var470;
                        } else {
                            class86.field1254 = var470;
                        }
                        class18.method91(28515, var467);
                        continue;
                    }
                    if (var485 == 101) {
                        class302 var471 = var46 ? class315.field5314 : class86.field1254;
                        if (var471.field4996 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class302 var472 = class165.method1157(false, var471.field4910);
                        var472.field4988[var471.field4996] = null;
                        class18.method91(28515, var472);
                        continue;
                    }
                    if (var485 == 102) {
                        var9--;
                        class302 var473 = class165.method1157(false, class140.field2159[var9]);
                        var473.field4988 = null;
                        class18.method91(28515, var473);
                        continue;
                    }
                    if (var485 == 200) {
                        var9 -= 2;
                        int var474 = class140.field2159[var9 + 1];
                        int var475 = class140.field2159[var9];
                        class302 var476 = class79.method567(-120, var475, var474);
                        if (var476 != null && var474 != -1) {
                            class140.field2159[var9++] = 1;
                            if (var46) {
                                class315.field5314 = var476;
                            } else {
                                class86.field1254 = var476;
                            }
                            continue;
                        }
                        class140.field2159[var9++] = 0;
                        continue;
                    }
                    if (var485 == 201) {
                        var9--;
                        int var477 = class140.field2159[var9];
                        class302 var478 = class165.method1157(!arg1, var477);
                        if (var478 == null) {
                            class140.field2159[var9++] = 0;
                        } else {
                            class140.field2159[var9++] = 1;
                            if (var46) {
                                class315.field5314 = var478;
                            } else {
                                class86.field1254 = var478;
                            }
                        }
                        continue;
                    }
                } else if (var485 < 500) {
                    if (var485 == 403) {
                        var9 -= 2;
                        int var47 = class140.field2159[var9 + 1];
                        int var48 = class140.field2159[var9];
                        if (var48 >= 7) {
                            var48 -= 7;
                        }
                        class62.field913.field3946.method500(var47, Integer.MIN_VALUE, var48);
                        continue;
                    }
                    if (var485 == 404) {
                        var9 -= 2;
                        int var49 = class140.field2159[var9];
                        int var50 = class140.field2159[var9 + 1];
                        class62.field913.field3946.method502(var49, var50, -2904);
                        continue;
                    }
                    if (var485 == 410) {
                        var9--;
                        boolean var51 = class140.field2159[var9] != 0;
                        class62.field913.field3946.method510(0, var51);
                        continue;
                    }
                } else {
                    boolean var10000;
                    if (var485 >= 1000 && var485 < 1100 || var485 >= 2000 && var485 < 2100) {
                        class302 var458;
                        if (var485 < 2000) {
                            var458 = var46 ? class315.field5314 : class86.field1254;
                        } else {
                            var485 -= 1000;
                            var10000 = !arg1;
                            var9--;
                            var458 = class165.method1157(var10000, class140.field2159[var9]);
                        }
                        if (var485 == 1000) {
                            var9 -= 4;
                            var458.field5030 = class140.field2159[var9];
                            var458.field5059 = class140.field2159[var9 + 1];
                            int var459 = class140.field2159[var9 + 2];
                            int var460 = class140.field2159[var9 + 3];
                            if (var460 < 0) {
                                var460 = 0;
                            } else if (var460 > 5) {
                                var460 = 5;
                            }
                            if (var459 < 0) {
                                var459 = 0;
                            } else if (var459 > 5) {
                                var459 = 5;
                            }
                            var458.field4892 = (byte) var460;
                            var458.field4922 = (byte) var459;
                            class18.method91(28515, var458);
                            class249.method1768(var458, 4);
                            if (var458.field4996 == -1) {
                                class246.method1758(var458.field4910, 31089);
                            }
                            continue;
                        }
                        if (var485 == 1001) {
                            var9 -= 4;
                            var458.field5041 = class140.field2159[var9];
                            var458.field4921 = class140.field2159[var9 + 1];
                            var458.field5046 = 0;
                            var458.field5054 = 0;
                            int var461 = class140.field2159[var9 + 3];
                            int var462 = class140.field2159[var9 + 2];
                            if (var461 < 0) {
                                var461 = 0;
                            } else if (var461 > 4) {
                                var461 = 4;
                            }
                            if (var462 < 0) {
                                var462 = 0;
                            } else if (var462 > 4) {
                                var462 = 4;
                            }
                            var458.field4893 = (byte) var462;
                            var458.field5005 = (byte) var461;
                            class18.method91(28515, var458);
                            class249.method1768(var458, 4);
                            if (var458.field4951 == 0) {
                                class148.method1027(var458, (byte) -118, false);
                            }
                            continue;
                        }
                        if (var485 == 1003) {
                            var9--;
                            boolean var463 = class140.field2159[var9] == 1;
                            if (var458.field4984 != var463) {
                                var458.field4984 = var463;
                                class18.method91(28515, var458);
                            }
                            if (var458.field4996 == -1) {
                                class28.method182(7, var458.field4910);
                            }
                            continue;
                        }
                        if (var485 == 1004) {
                            var9 -= 2;
                            var458.field4906 = class140.field2159[var9];
                            var458.field4990 = class140.field2159[var9 + 1];
                            class18.method91(28515, var458);
                            class249.method1768(var458, 4);
                            if (var458.field4951 == 0) {
                                class148.method1027(var458, (byte) -118, false);
                            }
                            continue;
                        }
                    } else if (!(var485 < 1100 || var485 >= 1200) || !(var485 < 2100 || var485 >= 2200)) {
                        class302 var52;
                        if (var485 >= 2000) {
                            var485 -= 1000;
                            var10000 = !arg1;
                            var9--;
                            var52 = class165.method1157(var10000, class140.field2159[var9]);
                        } else {
                            var52 = var46 ? class315.field5314 : class86.field1254;
                        }
                        if (var485 == 1100) {
                            var9 -= 2;
                            var52.field4912 = class140.field2159[var9];
                            if (var52.field4912 > (var52.field5043 - var52.field4936)) {
                                var52.field4912 = var52.field5043 - var52.field4936;
                            }
                            if (var52.field4912 < 0) {
                                var52.field4912 = 0;
                            }
                            var52.field4918 = class140.field2159[var9 + 1];
                            if ((var52.field4952 - var52.field4949) < var52.field4918) {
                                var52.field4918 = var52.field4952 - var52.field4949;
                            }
                            if (var52.field4918 < 0) {
                                var52.field4918 = 0;
                            }
                            class18.method91(28515, var52);
                            if (var52.field4996 == -1) {
                                class150.method1037(-32, var52.field4910);
                            }
                            continue;
                        }
                        if (var485 == 1101) {
                            var9--;
                            var52.field4972 = class140.field2159[var9];
                            class18.method91(28515, var52);
                            if (var52.field4996 == -1) {
                                class244.method1747((byte) -128, var52.field4910);
                            }
                            continue;
                        }
                        if (var485 == 1102) {
                            var9--;
                            var52.field5004 = class140.field2159[var9] == 1;
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1103) {
                            var9--;
                            var52.field5006 = class140.field2159[var9];
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1104) {
                            var9--;
                            var52.field4907 = class140.field2159[var9];
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1105) {
                            var9--;
                            var52.field4905 = class140.field2159[var9];
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1106) {
                            var9--;
                            var52.field4928 = class140.field2159[var9];
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1107) {
                            var9--;
                            var52.field4946 = class140.field2159[var9] == 1;
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1108) {
                            var52.field4909 = 1;
                            var9--;
                            var52.field4968 = class140.field2159[var9];
                            class18.method91(28515, var52);
                            if (var52.field4996 == -1) {
                                class139.method976(96, var52.field4910);
                            }
                            continue;
                        }
                        if (var485 == 1109) {
                            var9 -= 6;
                            var52.field5007 = class140.field2159[var9];
                            var52.field4932 = class140.field2159[var9 + 1];
                            var52.field4889 = class140.field2159[var9 + 2];
                            var52.field5009 = class140.field2159[var9 + 3];
                            var52.field4973 = class140.field2159[var9 + 4];
                            var52.field5048 = class140.field2159[var9 + 5];
                            class18.method91(28515, var52);
                            if (var52.field4996 == -1) {
                                class116.method824(var52.field4910, 5055);
                                class186.method1345((byte) -102, var52.field4910);
                            }
                            continue;
                        }
                        if (var485 == 1110) {
                            var9--;
                            int var53 = class140.field2159[var9];
                            if (var52.field4915 != var53) {
                                var52.field4994 = 0;
                                var52.field4914 = 0;
                                var52.field4915 = var53;
                                class18.method91(28515, var52);
                            }
                            if (var52.field4996 == -1) {
                                class275.method1952(var52.field4910, (byte) 71);
                            }
                            continue;
                        }
                        if (var485 == 1111) {
                            var9--;
                            var52.field5035 = class140.field2159[var9] == 1;
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1112) {
                            var6--;
                            class41 var54 = class301.field4877[var6];
                            if (!var54.method268(var52.field4969, 1631)) {
                                var52.field4969 = var54;
                                class18.method91(28515, var52);
                            }
                            if (var52.field4996 == -1) {
                                class73.method539(65535, var52.field4910);
                            }
                            continue;
                        }
                        if (var485 == 1113) {
                            var9--;
                            var52.field4995 = class140.field2159[var9];
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1114) {
                            var9 -= 3;
                            var52.field5000 = class140.field2159[var9];
                            var52.field4962 = class140.field2159[var9 + 1];
                            var52.field4966 = class140.field2159[var9 + 2];
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1115) {
                            var9--;
                            var52.field4895 = class140.field2159[var9] == 1;
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1116) {
                            var9--;
                            var52.field4913 = class140.field2159[var9];
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1117) {
                            var9--;
                            var52.field4987 = class140.field2159[var9];
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1118) {
                            var9--;
                            var52.field4888 = class140.field2159[var9] == 1;
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1119) {
                            var9--;
                            var52.field5015 = class140.field2159[var9] == 1;
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1120) {
                            var9 -= 2;
                            var52.field5043 = class140.field2159[var9];
                            var52.field4952 = class140.field2159[var9 + 1];
                            class18.method91(28515, var52);
                            if (var52.field4951 == 0) {
                                class148.method1027(var52, (byte) -118, false);
                            }
                            continue;
                        }
                        if (var485 == 1121) {
                            var9 -= 2;
                            var52.field4939 = (short) class140.field2159[var9];
                            var52.field5016 = (short) class140.field2159[var9 + 1];
                            class18.method91(28515, var52);
                            continue;
                        }
                        if (var485 == 1122) {
                            var9--;
                            var52.field4937 = class140.field2159[var9] == 1;
                            class18.method91(28515, var52);
                            continue;
                        }
                    } else if (!(var485 < 1200 || var485 >= 1300) || !(var485 < 2200 || var485 >= 2300)) {
                        class302 var454;
                        if (var485 < 2000) {
                            var454 = var46 ? class315.field5314 : class86.field1254;
                        } else {
                            var485 -= 1000;
                            var9--;
                            var454 = class165.method1157(false, class140.field2159[var9]);
                        }
                        class18.method91(28515, var454);
                        if (var485 == 1200 || var485 == 1205) {
                            var9 -= 2;
                            int var455 = class140.field2159[var9];
                            int var456 = class140.field2159[var9 + 1];
                            if (var454.field4996 == -1) {
                                class256.method1819(var454.field4910, (byte) 123);
                                class116.method824(var454.field4910, 5055);
                                class186.method1345((byte) -102, var454.field4910);
                            }
                            if (var455 == -1) {
                                var454.field4965 = -1;
                                var454.field4909 = 1;
                                var454.field4968 = -1;
                            } else {
                                var454.field4965 = var455;
                                var454.field4970 = var456;
                                class138 var457 = class130.method918(var455, -62);
                                var454.field4889 = var457.field2059;
                                var454.field5007 = var457.field2127;
                                var454.field5009 = var457.field2119;
                                var454.field4973 = var457.field2074;
                                var454.field5048 = var457.field2101;
                                if (var454.field5046 > 0) {
                                    var454.field5048 = var454.field5048 * 32 / var454.field5046;
                                } else if (var454.field5041 > 0) {
                                    var454.field5048 = var454.field5048 * 32 / var454.field5041;
                                }
                                if (var485 == 1205) {
                                    var454.field5001 = false;
                                } else {
                                    var454.field5001 = true;
                                }
                                var454.field4932 = var457.field2067;
                            }
                            continue;
                        }
                        if (var485 == 1201) {
                            var454.field4909 = 2;
                            var9--;
                            var454.field4968 = class140.field2159[var9];
                            if (var454.field4996 == -1) {
                                class139.method976(121, var454.field4910);
                            }
                            continue;
                        }
                        if (var485 == 1202) {
                            var454.field4909 = 3;
                            var454.field4968 = class62.field913.field3946.method503(305419896);
                            if (var454.field4996 == -1) {
                                class139.method976(126, var454.field4910);
                            }
                            continue;
                        }
                        if (var485 == 1203) {
                            var454.field4909 = 6;
                            var9--;
                            var454.field4968 = class140.field2159[var9];
                            if (var454.field4996 == -1) {
                                class139.method976(116, var454.field4910);
                            }
                            continue;
                        }
                        if (var485 == 1204) {
                            var454.field4909 = 5;
                            var9--;
                            var454.field4968 = class140.field2159[var9];
                            if (var454.field4996 == -1) {
                                class139.method976(117, var454.field4910);
                            }
                            continue;
                        }
                    } else if ((var485 < 1300 || var485 >= 1400) && (var485 < 2300 || var485 >= 2400)) {
                        if (var485 >= 1400 && var485 < 1500 || var485 >= 2400 && var485 < 2500) {
                            class302 var55;
                            if (var485 < 2000) {
                                var55 = var46 ? class315.field5314 : class86.field1254;
                            } else {
                                var10000 = !arg1;
                                var9--;
                                var55 = class165.method1157(var10000, class140.field2159[var9]);
                                var485 -= 1000;
                            }
                            var6--;
                            class41 var56 = class301.field4877[var6];
                            int[] var57 = null;
                            if (var56.method275(false) > 0 && var56.method281(var56.method275(false) - 1, (byte) 123) == 89) {
                                var9--;
                                int var58 = class140.field2159[var9];
                                if (var58 > 0) {
                                    var57 = new int[var58];
                                    while (var58-- > 0) {
                                        var9--;
                                        var57[var58] = class140.field2159[var9];
                                    }
                                }
                                var56 = var56.method308(var56.method275(false) - 1, 0, -84);
                            }
                            Object[] var59 = new Object[var56.method275(!arg1) + 1];
                            for (int var60 = var59.length - 1; var60 >= 1; var60--) {
                                if (var56.method281(var60 - 1, (byte) 119) == 115) {
                                    var6--;
                                    var59[var60] = class301.field4877[var6];
                                } else {
                                    var9--;
                                    var59[var60] = Integer.valueOf(class140.field2159[var9]);
                                }
                            }
                            var9--;
                            int var61 = class140.field2159[var9];
                            if (var61 == -1) {
                                var59 = null;
                            } else {
                                var59[0] = Integer.valueOf(var61);
                            }
                            var55.field4920 = true;
                            if (var485 == 1400) {
                                var55.field4947 = var59;
                            } else if (var485 == 1401) {
                                var55.field4938 = var59;
                            } else if (var485 == 1402) {
                                var55.field4979 = var59;
                            } else if (var485 == 1403) {
                                var55.field4991 = var59;
                            } else if (var485 == 1404) {
                                var55.field4981 = var59;
                            } else if (var485 == 1405) {
                                var55.field5055 = var59;
                            } else if (var485 == 1406) {
                                var55.field5037 = var59;
                            } else if (var485 == 1407) {
                                var55.field5026 = var59;
                                var55.field4927 = var57;
                            } else if (var485 == 1408) {
                                var55.field4974 = var59;
                            } else if (var485 == 1409) {
                                var55.field5008 = var59;
                            } else if (var485 == 1410) {
                                var55.field4976 = var59;
                            } else if (var485 == 1411) {
                                var55.field4985 = var59;
                            } else if (var485 == 1412) {
                                var55.field4916 = var59;
                            } else if (var485 == 1414) {
                                var55.field4989 = var59;
                                var55.field4933 = var57;
                            } else if (var485 == 1415) {
                                var55.field4897 = var57;
                                var55.field4956 = var59;
                            } else if (var485 == 1416) {
                                var55.field4896 = var59;
                            } else if (var485 == 1417) {
                                var55.field5042 = var59;
                            } else if (var485 == 1418) {
                                var55.field4978 = var59;
                            } else if (var485 == 1419) {
                                var55.field4955 = var59;
                            } else if (var485 == 1420) {
                                var55.field5022 = var59;
                            } else if (var485 == 1421) {
                                var55.field5019 = var59;
                            } else if (var485 == 1422) {
                                var55.field4925 = var59;
                            } else if (var485 == 1423) {
                                var55.field4942 = var59;
                            } else if (var485 == 1424) {
                                var55.field4954 = var59;
                            } else if (var485 == 1425) {
                                var55.field4917 = var59;
                            } else if (var485 == 1426) {
                                var55.field4971 = var59;
                            } else if (var485 == 1427) {
                                var55.field5013 = var59;
                            } else if (var485 == 1428) {
                                var55.field5010 = var59;
                                var55.field5028 = var57;
                            } else if (var485 == 1429) {
                                var55.field5047 = var59;
                                var55.field4940 = var57;
                            }
                            continue;
                        }
                        if (var485 < 1600) {
                            class302 var449 = var46 ? class315.field5314 : class86.field1254;
                            if (var485 == 1500) {
                                class140.field2159[var9++] = var449.field4944;
                                continue;
                            }
                            if (var485 == 1501) {
                                class140.field2159[var9++] = var449.field4953;
                                continue;
                            }
                            if (var485 == 1502) {
                                class140.field2159[var9++] = var449.field4936;
                                continue;
                            }
                            if (var485 == 1503) {
                                class140.field2159[var9++] = var449.field4949;
                                continue;
                            }
                            if (var485 == 1504) {
                                class140.field2159[var9++] = var449.field4984 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 1505) {
                                class140.field2159[var9++] = var449.field4999;
                                continue;
                            }
                        } else if (var485 < 1700) {
                            class302 var448 = var46 ? class315.field5314 : class86.field1254;
                            if (var485 == 1600) {
                                class140.field2159[var9++] = var448.field4912;
                                continue;
                            }
                            if (var485 == 1601) {
                                class140.field2159[var9++] = var448.field4918;
                                continue;
                            }
                            if (var485 == 1602) {
                                class301.field4877[var6++] = var448.field4969;
                                continue;
                            }
                            if (var485 == 1603) {
                                class140.field2159[var9++] = var448.field5043;
                                continue;
                            }
                            if (var485 == 1604) {
                                class140.field2159[var9++] = var448.field4952;
                                continue;
                            }
                            if (var485 == 1605) {
                                class140.field2159[var9++] = var448.field5048;
                                continue;
                            }
                            if (var485 == 1606) {
                                class140.field2159[var9++] = var448.field4889;
                                continue;
                            }
                            if (var485 == 1607) {
                                class140.field2159[var9++] = var448.field4973;
                                continue;
                            }
                            if (var485 == 1608) {
                                class140.field2159[var9++] = var448.field5009;
                                continue;
                            }
                            if (var485 == 1609) {
                                class140.field2159[var9++] = var448.field5006;
                                continue;
                            }
                        } else if (var485 < 1800) {
                            class302 var447 = var46 ? class315.field5314 : class86.field1254;
                            if (var485 == 1700) {
                                class140.field2159[var9++] = var447.field4965;
                                continue;
                            }
                            if (var485 == 1701) {
                                if (var447.field4965 == -1) {
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = var447.field4970;
                                }
                                continue;
                            }
                            if (var485 == 1702) {
                                class140.field2159[var9++] = var447.field4996;
                                continue;
                            }
                        } else if (var485 < 1900) {
                            class302 var445 = var46 ? class315.field5314 : class86.field1254;
                            if (var485 == 1800) {
                                class140.field2159[var9++] = class278.method1963(client.method2119(var445), -1691001909);
                                continue;
                            }
                            if (var485 == 1801) {
                                var9--;
                                int var446 = class140.field2159[var9];
                                int var487 = var446 - 1;
                                if (var445.field5040 != null && var445.field5040.length > var487 && var445.field5040[var487] != null) {
                                    class301.field4877[var6++] = var445.field5040[var487];
                                    continue;
                                }
                                class301.field4877[var6++] = class169.field2690;
                                continue;
                            }
                            if (var485 == 1802) {
                                if (var445.field4945 == null) {
                                    class301.field4877[var6++] = class169.field2690;
                                } else {
                                    class301.field4877[var6++] = var445.field4945;
                                }
                                continue;
                            }
                        } else if (var485 < 2600) {
                            var9--;
                            class302 var444 = class165.method1157(false, class140.field2159[var9]);
                            if (var485 == 2500) {
                                class140.field2159[var9++] = var444.field4944;
                                continue;
                            }
                            if (var485 == 2501) {
                                class140.field2159[var9++] = var444.field4953;
                                continue;
                            }
                            if (var485 == 2502) {
                                class140.field2159[var9++] = var444.field4936;
                                continue;
                            }
                            if (var485 == 2503) {
                                class140.field2159[var9++] = var444.field4949;
                                continue;
                            }
                            if (var485 == 2504) {
                                class140.field2159[var9++] = var444.field4984 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 2505) {
                                class140.field2159[var9++] = var444.field4999;
                                continue;
                            }
                        } else if (var485 < 2700) {
                            var9--;
                            class302 var62 = class165.method1157(false, class140.field2159[var9]);
                            if (var485 == 2600) {
                                class140.field2159[var9++] = var62.field4912;
                                continue;
                            }
                            if (var485 == 2601) {
                                class140.field2159[var9++] = var62.field4918;
                                continue;
                            }
                            if (var485 == 2602) {
                                class301.field4877[var6++] = var62.field4969;
                                continue;
                            }
                            if (var485 == 2603) {
                                class140.field2159[var9++] = var62.field5043;
                                continue;
                            }
                            if (var485 == 2604) {
                                class140.field2159[var9++] = var62.field4952;
                                continue;
                            }
                            if (var485 == 2605) {
                                class140.field2159[var9++] = var62.field5048;
                                continue;
                            }
                            if (var485 == 2606) {
                                class140.field2159[var9++] = var62.field4889;
                                continue;
                            }
                            if (var485 == 2607) {
                                class140.field2159[var9++] = var62.field4973;
                                continue;
                            }
                            if (var485 == 2608) {
                                class140.field2159[var9++] = var62.field5009;
                                continue;
                            }
                            if (var485 == 2609) {
                                class140.field2159[var9++] = var62.field5006;
                                continue;
                            }
                        } else if (var485 < 2800) {
                            if (var485 == 2700) {
                                var9--;
                                class302 var63 = class165.method1157(false, class140.field2159[var9]);
                                class140.field2159[var9++] = var63.field4965;
                                continue;
                            }
                            if (var485 == 2701) {
                                var9--;
                                class302 var64 = class165.method1157(false, class140.field2159[var9]);
                                if (var64.field4965 == -1) {
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = var64.field4970;
                                }
                                continue;
                            }
                            if (var485 == 2702) {
                                var9--;
                                int var65 = class140.field2159[var9];
                                class187 var66 = (class187) class113.field1658.method617((long) var65, false);
                                if (var66 == null) {
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = 1;
                                }
                                continue;
                            }
                            if (var485 == 2703) {
                                var10000 = !arg1;
                                var9--;
                                class302 var67 = class165.method1157(var10000, class140.field2159[var9]);
                                if (var67.field4988 == null) {
                                    class140.field2159[var9++] = 0;
                                    continue;
                                }
                                int var68 = var67.field4988.length;
                                for (int var69 = 0; var69 < var67.field4988.length; var69++) {
                                    if (var67.field4988[var69] == null) {
                                        var68 = var69;
                                        break;
                                    }
                                }
                                class140.field2159[var9++] = var68;
                                continue;
                            }
                            if (var485 == 2704 || var485 == 2705) {
                                var9 -= 2;
                                int var70 = class140.field2159[var9];
                                int var71 = class140.field2159[var9 + 1];
                                class187 var72 = (class187) class113.field1658.method617((long) var70, !arg1);
                                if (var72 != null && var72.field3052 == var71) {
                                    class140.field2159[var9++] = 1;
                                    continue;
                                }
                                class140.field2159[var9++] = 0;
                                continue;
                            }
                        } else if (var485 < 2900) {
                            var9--;
                            class302 var73 = class165.method1157(false, class140.field2159[var9]);
                            if (var485 == 2800) {
                                class140.field2159[var9++] = class278.method1963(client.method2119(var73), -1691001909);
                                continue;
                            }
                            if (var485 == 2801) {
                                var9--;
                                int var74 = class140.field2159[var9];
                                int var486 = var74 - 1;
                                if (var73.field5040 != null && var486 < var73.field5040.length && var73.field5040[var486] != null) {
                                    class301.field4877[var6++] = var73.field5040[var486];
                                    continue;
                                }
                                class301.field4877[var6++] = class169.field2690;
                                continue;
                            }
                            if (var485 == 2802) {
                                if (var73.field4945 == null) {
                                    class301.field4877[var6++] = class169.field2690;
                                } else {
                                    class301.field4877[var6++] = var73.field4945;
                                }
                                continue;
                            }
                        } else if (var485 < 3200) {
                            if (var485 == 3100) {
                                var6--;
                                class41 var75 = class301.field4877[var6];
                                class262.method1843(var75, 0, class169.field2690, 65);
                                continue;
                            }
                            if (var485 == 3101) {
                                var9 -= 2;
                                class242.method1732(class62.field913, false, class140.field2159[var9 + 1], class140.field2159[var9]);
                                continue;
                            }
                            if (var485 == 3103) {
                                class216.method1562(206);
                                continue;
                            }
                            if (var485 == 3104) {
                                var6--;
                                class41 var76 = class301.field4877[var6];
                                int var77 = 0;
                                if (var76.method276(true)) {
                                    var77 = var76.method301((byte) -124);
                                }
                                class207.field3355++;
                                class285.field4642.method844(-4, 184);
                                class285.field4642.method787(853918096, var77);
                                continue;
                            }
                            if (var485 == 3105) {
                                class199.field3198++;
                                var6--;
                                class41 var78 = class301.field4877[var6];
                                class285.field4642.method844(-4, 32);
                                class285.field4642.method800(var78.method291((byte) 65), (byte) -113);
                                continue;
                            }
                            if (var485 == 3106) {
                                var6--;
                                class41 var79 = class301.field4877[var6];
                                class316.field5352++;
                                class285.field4642.method844(-4, 235);
                                class285.field4642.method797(var79.method275(false) + 1, -22096);
                                class285.field4642.method776(341440880, var79);
                                continue;
                            }
                            if (var485 == 3107) {
                                var9--;
                                int var80 = class140.field2159[var9];
                                var6--;
                                class41 var81 = class301.field4877[var6];
                                class27.method173(var80, 2809, var81);
                                continue;
                            }
                            if (var485 == 3108) {
                                var9 -= 3;
                                int var82 = class140.field2159[var9];
                                int var83 = class140.field2159[var9 + 2];
                                int var84 = class140.field2159[var9 + 1];
                                class302 var85 = class165.method1157(false, var83);
                                class307.method2132(-109, var82, var85, var84);
                                continue;
                            }
                            if (var485 == 3109) {
                                var9 -= 2;
                                int var86 = class140.field2159[var9];
                                int var87 = class140.field2159[var9 + 1];
                                class302 var88 = var46 ? class315.field5314 : class86.field1254;
                                class307.method2132(-86, var86, var88, var87);
                                continue;
                            }
                            if (var485 == 3110) {
                                class33.field510++;
                                var9--;
                                int var89 = class140.field2159[var9];
                                class285.field4642.method844(-4, 68);
                                class285.field4642.method778(var89, (byte) -4);
                                continue;
                            }
                        } else if (var485 < 3300) {
                            if (var485 == 3200) {
                                var9 -= 3;
                                class201.method1431(class140.field2159[var9], class140.field2159[var9 + 1], class140.field2159[var9 + 2], -7685);
                                continue;
                            }
                            if (var485 == 3201) {
                                var9--;
                                class121.method862(-100, class140.field2159[var9]);
                                continue;
                            }
                            if (var485 == 3202) {
                                var9 -= 2;
                                class312.method2162(class140.field2159[var9 + 1], (byte) -109, class140.field2159[var9]);
                                continue;
                            }
                        } else if (var485 < 3400) {
                            if (var485 == 3300) {
                                class140.field2159[var9++] = class18.field234;
                                continue;
                            }
                            if (var485 == 3301) {
                                var9 -= 2;
                                int var90 = class140.field2159[var9 + 1];
                                int var91 = class140.field2159[var9];
                                class140.field2159[var9++] = class83.method588(var91, var90, -128);
                                continue;
                            }
                            if (var485 == 3302) {
                                var9 -= 2;
                                int var92 = class140.field2159[var9];
                                int var93 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = class159.method1122(var92, var93, -20007);
                                continue;
                            }
                            if (var485 == 3303) {
                                var9 -= 2;
                                int var94 = class140.field2159[var9 + 1];
                                int var95 = class140.field2159[var9];
                                class140.field2159[var9++] = class130.method917(var95, (byte) 118, var94);
                                continue;
                            }
                            if (var485 == 3304) {
                                var9--;
                                int var96 = class140.field2159[var9];
                                class140.field2159[var9++] = class149.method1033((byte) 0, var96).field1950;
                                continue;
                            }
                            if (var485 == 3305) {
                                var9--;
                                int var97 = class140.field2159[var9];
                                class140.field2159[var9++] = class206.field3340[var97];
                                continue;
                            }
                            if (var485 == 3306) {
                                var9--;
                                int var98 = class140.field2159[var9];
                                class140.field2159[var9++] = class64.field938[var98];
                                continue;
                            }
                            if (var485 == 3307) {
                                var9--;
                                int var99 = class140.field2159[var9];
                                class140.field2159[var9++] = class85.field1246[var99];
                                continue;
                            }
                            if (var485 == 3308) {
                                int var100 = class55.field807;
                                int var101 = (class62.field913.field4280 >> 7) + class88.field1300;
                                int var102 = (class62.field913.field4311 >> 7) + class55.field809;
                                class140.field2159[var9++] = (var100 << 28) + (var101 << 14) + var102;
                                continue;
                            }
                            if (var485 == 3309) {
                                var9--;
                                int var103 = class140.field2159[var9];
                                class140.field2159[var9++] = class217.method1563(268427948, var103) >> 14;
                                continue;
                            }
                            if (var485 == 3310) {
                                var9--;
                                int var104 = class140.field2159[var9];
                                class140.field2159[var9++] = var104 >> 28;
                                continue;
                            }
                            if (var485 == 3311) {
                                var9--;
                                int var105 = class140.field2159[var9];
                                class140.field2159[var9++] = class217.method1563(var105, 16383);
                                continue;
                            }
                            if (var485 == 3312) {
                                class140.field2159[var9++] = class230.field3649 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3313) {
                                var9 -= 2;
                                int var106 = class140.field2159[var9 + 1];
                                int var107 = class140.field2159[var9] + 32768;
                                class140.field2159[var9++] = class83.method588(var107, var106, -123);
                                continue;
                            }
                            if (var485 == 3314) {
                                var9 -= 2;
                                int var108 = class140.field2159[var9 + 1];
                                int var109 = class140.field2159[var9] + 32768;
                                class140.field2159[var9++] = class159.method1122(var109, var108, -20007);
                                continue;
                            }
                            if (var485 == 3315) {
                                var9 -= 2;
                                int var110 = class140.field2159[var9 + 1];
                                int var111 = class140.field2159[var9] + 32768;
                                class140.field2159[var9++] = class130.method917(var111, (byte) 107, var110);
                                continue;
                            }
                            if (var485 == 3316) {
                                if (class62.field919 >= 2) {
                                    class140.field2159[var9++] = class62.field919;
                                } else {
                                    class140.field2159[var9++] = 0;
                                }
                                continue;
                            }
                            if (var485 == 3317) {
                                class140.field2159[var9++] = class38.field586;
                                continue;
                            }
                            if (var485 == 3318) {
                                class140.field2159[var9++] = class218.field3495;
                                continue;
                            }
                            if (var485 == 3321) {
                                class140.field2159[var9++] = class266.field4231;
                                continue;
                            }
                            if (var485 == 3322) {
                                class140.field2159[var9++] = class236.field3790;
                                continue;
                            }
                            if (var485 == 3323) {
                                if (class121.field1796 >= 5 && class121.field1796 <= 9) {
                                    class140.field2159[var9++] = 1;
                                    continue;
                                }
                                class140.field2159[var9++] = 0;
                                continue;
                            }
                            if (var485 == 3324) {
                                if (class121.field1796 >= 5 && class121.field1796 <= 9) {
                                    class140.field2159[var9++] = class121.field1796;
                                    continue;
                                }
                                class140.field2159[var9++] = 0;
                                continue;
                            }
                            if (var485 == 3325) {
                                class140.field2159[var9++] = class275.field4507 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3326) {
                                class140.field2159[var9++] = class62.field913.field3942;
                                continue;
                            }
                            if (var485 == 3327) {
                                class140.field2159[var9++] = class62.field913.field3946.field1031 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3328) {
                                class140.field2159[var9++] = class164.field2595 && !class62.field907 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3329) {
                                class140.field2159[var9++] = class169.field2696 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3330) {
                                var9--;
                                int var112 = class140.field2159[var9];
                                class140.field2159[var9++] = class274.method1942((byte) -92, var112);
                                continue;
                            }
                            if (var485 == 3331) {
                                var9 -= 2;
                                int var113 = class140.field2159[var9];
                                int var114 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = class14.method61(31, var114, false, var113);
                                continue;
                            }
                            if (var485 == 3332) {
                                var9 -= 2;
                                int var115 = class140.field2159[var9];
                                int var116 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = class14.method61(31, var116, true, var115);
                                continue;
                            }
                            if (var485 == 3333) {
                                class140.field2159[var9++] = class124.field1837;
                                continue;
                            }
                            if (var485 == 3335) {
                                class140.field2159[var9++] = class246.field3954;
                                continue;
                            }
                        } else if (var485 < 3500) {
                            if (var485 == 3400) {
                                var9 -= 2;
                                int var117 = class140.field2159[var9];
                                int var118 = class140.field2159[var9 + 1];
                                class88 var119 = class236.method1696(var117, 243971376);
                                if (var119.field1277 != 115) {
                                }
                                class301.field4877[var6++] = var119.method629(var118, 121);
                                continue;
                            }
                            if (var485 == 3408) {
                                var9 -= 4;
                                int var120 = class140.field2159[var9 + 1];
                                int var121 = class140.field2159[var9];
                                int var122 = class140.field2159[var9 + 3];
                                int var123 = class140.field2159[var9 + 2];
                                class88 var124 = class236.method1696(var123, 243971376);
                                if (var124.field1290 == var121 && var124.field1277 == var120) {
                                    if (var120 == 115) {
                                        class301.field4877[var6++] = var124.method629(var122, 65);
                                    } else {
                                        class140.field2159[var9++] = var124.method621(128, var122);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var485 == 3409) {
                                var9 -= 3;
                                int var125 = class140.field2159[var9];
                                int var126 = class140.field2159[var9 + 2];
                                int var127 = class140.field2159[var9 + 1];
                                if (var127 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class88 var128 = class236.method1696(var127, 243971376);
                                if (var128.field1277 != var125) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class140.field2159[var9++] = var128.method625(var126, -104) ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3410) {
                                var9--;
                                int var129 = class140.field2159[var9];
                                var6--;
                                class41 var130 = class301.field4877[var6];
                                if (var129 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class88 var131 = class236.method1696(var129, 243971376);
                                if (var131.field1277 != 115) {
                                    throw new RuntimeException("C3410-1");
                                }
                                class140.field2159[var9++] = var131.method631((byte) -76, var130) ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3411) {
                                var9--;
                                int var132 = class140.field2159[var9];
                                class88 var133 = class236.method1696(var132, 243971376);
                                class140.field2159[var9++] = var133.field1288.method614(-122);
                                continue;
                            }
                        } else if (var485 < 3700) {
                            if (var485 == 3600) {
                                if (class289.field4697 == 0) {
                                    class140.field2159[var9++] = -2;
                                } else if (class289.field4697 == 1) {
                                    class140.field2159[var9++] = -1;
                                } else {
                                    class140.field2159[var9++] = class118.field1741;
                                }
                                continue;
                            }
                            if (var485 == 3601) {
                                var9--;
                                int var422 = class140.field2159[var9];
                                if (class289.field4697 == 2 && var422 < class118.field1741) {
                                    class301.field4877[var6++] = class78.field1147[var422];
                                    continue;
                                }
                                class301.field4877[var6++] = class169.field2690;
                                continue;
                            }
                            if (var485 == 3602) {
                                var9--;
                                int var423 = class140.field2159[var9];
                                if (class289.field4697 == 2 && class118.field1741 > var423) {
                                    class140.field2159[var9++] = class159.field2496[var423];
                                    continue;
                                }
                                class140.field2159[var9++] = 0;
                                continue;
                            }
                            if (var485 == 3603) {
                                var9--;
                                int var424 = class140.field2159[var9];
                                if (class289.field4697 == 2 && class118.field1741 > var424) {
                                    class140.field2159[var9++] = class109.field1521[var424];
                                    continue;
                                }
                                class140.field2159[var9++] = 0;
                                continue;
                            }
                            if (var485 == 3604) {
                                var6--;
                                class41 var425 = class301.field4877[var6];
                                var9--;
                                int var426 = class140.field2159[var9];
                                class273.method1932(var426, -26900, var425);
                                continue;
                            }
                            if (var485 == 3605) {
                                var6--;
                                class41 var427 = class301.field4877[var6];
                                class147.method1021(var427.method291((byte) 65), 100);
                                continue;
                            }
                            if (var485 == 3606) {
                                var6--;
                                class41 var428 = class301.field4877[var6];
                                class110.method748((byte) -109, var428.method291((byte) 65));
                                continue;
                            }
                            if (var485 == 3607) {
                                var6--;
                                class41 var429 = class301.field4877[var6];
                                class307.method2129(123, var429.method291((byte) 65));
                                continue;
                            }
                            if (var485 == 3608) {
                                var6--;
                                class41 var430 = class301.field4877[var6];
                                class53.method361(var430.method291((byte) 65), 38);
                                continue;
                            }
                            if (var485 == 3609) {
                                var6--;
                                class41 var431 = class301.field4877[var6];
                                if (var431.method309(class14.field178, 0) || var431.method309(client.field5140, 0)) {
                                    var431 = var431.method279(7, (byte) -67);
                                }
                                class140.field2159[var9++] = class153.method1091(var431, 0) ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3610) {
                                var9--;
                                int var432 = class140.field2159[var9];
                                if (class289.field4697 == 2 && class118.field1741 > var432) {
                                    class301.field4877[var6++] = class278.field4547[var432];
                                    continue;
                                }
                                class301.field4877[var6++] = class169.field2690;
                                continue;
                            }
                            if (var485 == 3611) {
                                if (class152.field2422 == null) {
                                    class301.field4877[var6++] = class169.field2690;
                                } else {
                                    class301.field4877[var6++] = class152.field2422.method288((byte) -124);
                                }
                                continue;
                            }
                            if (var485 == 3612) {
                                if (class152.field2422 == null) {
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = class88.field1299;
                                }
                                continue;
                            }
                            if (var485 == 3613) {
                                var9--;
                                int var433 = class140.field2159[var9];
                                if (class152.field2422 != null && class88.field1299 > var433) {
                                    class301.field4877[var6++] = class271.field4379[var433].field4595.method288((byte) -122);
                                    continue;
                                }
                                class301.field4877[var6++] = class169.field2690;
                                continue;
                            }
                            if (var485 == 3614) {
                                var9--;
                                int var434 = class140.field2159[var9];
                                if (class152.field2422 != null && class88.field1299 > var434) {
                                    class140.field2159[var9++] = class271.field4379[var434].field4593;
                                    continue;
                                }
                                class140.field2159[var9++] = 0;
                                continue;
                            }
                            if (var485 == 3615) {
                                var9--;
                                int var435 = class140.field2159[var9];
                                if (class152.field2422 != null && class88.field1299 > var435) {
                                    class140.field2159[var9++] = class271.field4379[var435].field4597;
                                    continue;
                                }
                                class140.field2159[var9++] = 0;
                                continue;
                            }
                            if (var485 == 3616) {
                                class140.field2159[var9++] = class2.field33;
                                continue;
                            }
                            if (var485 == 3617) {
                                var6--;
                                class41 var436 = class301.field4877[var6];
                                class264.method1871((byte) 64, var436);
                                continue;
                            }
                            if (var485 == 3618) {
                                class140.field2159[var9++] = class302.field4899;
                                continue;
                            }
                            if (var485 == 3619) {
                                var6--;
                                class41 var437 = class301.field4877[var6];
                                class239.method1716((byte) 28, var437.method291((byte) 65));
                                continue;
                            }
                            if (var485 == 3620) {
                                class228.method1632((byte) -119);
                                continue;
                            }
                            if (var485 == 3621) {
                                if (class289.field4697 == 0) {
                                    class140.field2159[var9++] = -1;
                                } else {
                                    class140.field2159[var9++] = class281.field4576;
                                }
                                continue;
                            }
                            if (var485 == 3622) {
                                var9--;
                                int var438 = class140.field2159[var9];
                                if (class289.field4697 != 0 && var438 < class281.field4576) {
                                    class301.field4877[var6++] = class235.method1690(class273.field4436[var438], (byte) -124).method288((byte) -127);
                                    continue;
                                }
                                class301.field4877[var6++] = class169.field2690;
                                continue;
                            }
                            if (var485 == 3623) {
                                var6--;
                                class41 var439 = class301.field4877[var6];
                                if (var439.method309(class14.field178, 0) || var439.method309(client.field5140, 0)) {
                                    var439 = var439.method279(7, (byte) -127);
                                }
                                class140.field2159[var9++] = class69.method501(var439, 125) ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3624) {
                                var9--;
                                int var440 = class140.field2159[var9];
                                if (class271.field4379 != null && var440 < class88.field1299 && class271.field4379[var440].field4595.method306(class62.field913.field3933, 27080)) {
                                    class140.field2159[var9++] = 1;
                                    continue;
                                }
                                class140.field2159[var9++] = 0;
                                continue;
                            }
                            if (var485 == 3625) {
                                if (class15.field196 == null) {
                                    class301.field4877[var6++] = class169.field2690;
                                } else {
                                    class301.field4877[var6++] = class15.field196.method288((byte) -128);
                                }
                                continue;
                            }
                            if (var485 == 3626) {
                                var9--;
                                int var441 = class140.field2159[var9];
                                if (class152.field2422 != null && var441 < class88.field1299) {
                                    class301.field4877[var6++] = class271.field4379[var441].field4592;
                                    continue;
                                }
                                class301.field4877[var6++] = class169.field2690;
                                continue;
                            }
                            if (var485 == 3627) {
                                var9--;
                                int var442 = class140.field2159[var9];
                                if (class289.field4697 == 2 && var442 >= 0 && class118.field1741 > var442) {
                                    class140.field2159[var9++] = class238.field3813[var442] ? 1 : 0;
                                    continue;
                                }
                                class140.field2159[var9++] = 0;
                                continue;
                            }
                            if (var485 == 3628) {
                                var6--;
                                class41 var443 = class301.field4877[var6];
                                if (var443.method309(class14.field178, 0) || var443.method309(client.field5140, 0)) {
                                    var443 = var443.method279(7, (byte) -70);
                                }
                                class140.field2159[var9++] = class273.method1928(var443, 4096);
                                continue;
                            }
                        } else if (var485 < 4000) {
                            if (var485 == 3903) {
                                var9--;
                                int var408 = class140.field2159[var9];
                                class140.field2159[var9++] = class28.field423[var408].method1987(0);
                                continue;
                            }
                            if (var485 == 3904) {
                                var9--;
                                int var409 = class140.field2159[var9];
                                class140.field2159[var9++] = class28.field423[var409].field4579;
                                continue;
                            }
                            if (var485 == 3905) {
                                var9--;
                                int var410 = class140.field2159[var9];
                                class140.field2159[var9++] = class28.field423[var410].field4588;
                                continue;
                            }
                            if (var485 == 3906) {
                                var9--;
                                int var411 = class140.field2159[var9];
                                class140.field2159[var9++] = class28.field423[var411].field4586;
                                continue;
                            }
                            if (var485 == 3907) {
                                var9--;
                                int var412 = class140.field2159[var9];
                                class140.field2159[var9++] = class28.field423[var412].field4577;
                                continue;
                            }
                            if (var485 == 3908) {
                                var9--;
                                int var413 = class140.field2159[var9];
                                class140.field2159[var9++] = class28.field423[var413].field4578;
                                continue;
                            }
                            if (var485 == 3910) {
                                var9--;
                                int var414 = class140.field2159[var9];
                                int var415 = class28.field423[var414].method1990((byte) -92);
                                class140.field2159[var9++] = var415 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3911) {
                                var9--;
                                int var416 = class140.field2159[var9];
                                int var417 = class28.field423[var416].method1990((byte) 59);
                                class140.field2159[var9++] = var417 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3912) {
                                var9--;
                                int var418 = class140.field2159[var9];
                                int var419 = class28.field423[var418].method1990((byte) 84);
                                class140.field2159[var9++] = var419 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 3913) {
                                var9--;
                                int var420 = class140.field2159[var9];
                                int var421 = class28.field423[var420].method1990((byte) -114);
                                class140.field2159[var9++] = var421 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var485 < 4100) {
                            if (var485 == 4000) {
                                var9 -= 2;
                                int var134 = class140.field2159[var9];
                                int var135 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = var134 + var135;
                                continue;
                            }
                            if (var485 == 4001) {
                                var9 -= 2;
                                int var136 = class140.field2159[var9];
                                int var137 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = var136 - var137;
                                continue;
                            }
                            if (var485 == 4002) {
                                var9 -= 2;
                                int var138 = class140.field2159[var9];
                                int var139 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = var138 * var139;
                                continue;
                            }
                            if (var485 == 4003) {
                                var9 -= 2;
                                int var140 = class140.field2159[var9];
                                int var141 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = var140 / var141;
                                continue;
                            }
                            if (var485 == 4004) {
                                var9--;
                                int var142 = class140.field2159[var9];
                                class140.field2159[var9++] = (int) (Math.random() * (double) var142);
                                continue;
                            }
                            if (var485 == 4005) {
                                var9--;
                                int var143 = class140.field2159[var9];
                                class140.field2159[var9++] = (int) (Math.random() * (double) (var143 + 1));
                                continue;
                            }
                            if (var485 == 4006) {
                                var9 -= 5;
                                int var144 = class140.field2159[var9];
                                int var145 = class140.field2159[var9 + 1];
                                int var146 = class140.field2159[var9 + 2];
                                int var147 = class140.field2159[var9 + 3];
                                int var148 = class140.field2159[var9 + 4];
                                class140.field2159[var9++] = (var145 - var144) * (var148 - var146) / (var147 - var146) + var144;
                                continue;
                            }
                            if (var485 == 4007) {
                                var9 -= 2;
                                long var149 = (long) class140.field2159[var9];
                                long var151 = (long) class140.field2159[var9 + 1];
                                class140.field2159[var9++] = (int) (var149 + (var149 * var151 / 100L));
                                continue;
                            }
                            if (var485 == 4008) {
                                var9 -= 2;
                                int var153 = class140.field2159[var9 + 1];
                                int var154 = class140.field2159[var9];
                                class140.field2159[var9++] = class255.method1813(0x1 << var153, var154);
                                continue;
                            }
                            if (var485 == 4009) {
                                var9 -= 2;
                                int var155 = class140.field2159[var9 + 1];
                                int var156 = class140.field2159[var9];
                                class140.field2159[var9++] = class217.method1563(-(0x1 << var155) - 1, var156);
                                continue;
                            }
                            if (var485 == 4010) {
                                var9 -= 2;
                                int var157 = class140.field2159[var9];
                                int var158 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = class217.method1563(var157, 0x1 << var158) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var485 == 4011) {
                                var9 -= 2;
                                int var159 = class140.field2159[var9];
                                int var160 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = var159 % var160;
                                continue;
                            }
                            if (var485 == 4012) {
                                var9 -= 2;
                                int var161 = class140.field2159[var9];
                                int var162 = class140.field2159[var9 + 1];
                                if (var161 == 0) {
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = (int) Math.pow((double) var161, (double) var162);
                                }
                                continue;
                            }
                            if (var485 == 4013) {
                                var9 -= 2;
                                int var163 = class140.field2159[var9];
                                int var164 = class140.field2159[var9 + 1];
                                if (var163 == 0) {
                                    class140.field2159[var9++] = 0;
                                } else if (var164 == 0) {
                                    class140.field2159[var9++] = Integer.MAX_VALUE;
                                } else {
                                    class140.field2159[var9++] = (int) Math.pow((double) var163, 1.0D / (double) var164);
                                }
                                continue;
                            }
                            if (var485 == 4014) {
                                var9 -= 2;
                                int var165 = class140.field2159[var9];
                                int var166 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = class217.method1563(var165, var166);
                                continue;
                            }
                            if (var485 == 4015) {
                                var9 -= 2;
                                int var167 = class140.field2159[var9 + 1];
                                int var168 = class140.field2159[var9];
                                class140.field2159[var9++] = class255.method1813(var167, var168);
                                continue;
                            }
                            if (var485 == 4016) {
                                var9 -= 2;
                                int var169 = class140.field2159[var9];
                                int var170 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = var170 <= var169 ? var170 : var169;
                                continue;
                            }
                            if (var485 == 4017) {
                                var9 -= 2;
                                int var171 = class140.field2159[var9];
                                int var172 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = var172 >= var171 ? var172 : var171;
                                continue;
                            }
                            if (var485 == 4018) {
                                var9 -= 3;
                                long var173 = (long) class140.field2159[var9];
                                long var175 = (long) class140.field2159[var9 + 1];
                                long var177 = (long) class140.field2159[var9 + 2];
                                class140.field2159[var9++] = (int) (var173 * var177 / var175);
                                continue;
                            }
                        } else if (var485 < 4200) {
                            if (var485 == 4100) {
                                var6--;
                                class41 var356 = class301.field4877[var6];
                                var9--;
                                int var357 = class140.field2159[var9];
                                class301.field4877[var6++] = class187.method1346(new class41[] { var356, class1.method4(var357, (byte) 42) }, 0);
                                continue;
                            }
                            if (var485 == 4101) {
                                var6 -= 2;
                                class41 var358 = class301.field4877[var6];
                                class41 var359 = class301.field4877[var6 + 1];
                                class301.field4877[var6++] = class187.method1346(new class41[] { var358, var359 }, 0);
                                continue;
                            }
                            if (var485 == 4102) {
                                var6--;
                                class41 var360 = class301.field4877[var6];
                                var9--;
                                int var361 = class140.field2159[var9];
                                class301.field4877[var6++] = class187.method1346(new class41[] { var360, class117.method836(var361, (byte) -115, true) }, 0);
                                continue;
                            }
                            if (var485 == 4103) {
                                var6--;
                                class41 var362 = class301.field4877[var6];
                                class301.field4877[var6++] = var362.method294(1);
                                continue;
                            }
                            if (var485 == 4104) {
                                var9--;
                                int var363 = class140.field2159[var9];
                                long var364 = (long) var363 * 86400000L + 1014768000000L;
                                class93.field1369.setTime(new Date(var364));
                                int var366 = class93.field1369.get(5);
                                int var367 = class93.field1369.get(2);
                                int var368 = class93.field1369.get(1);
                                class301.field4877[var6++] = class187.method1346(new class41[] { class1.method4(var366, (byte) 89), class224.field3591, class276.field4524[var367], class224.field3591, class1.method4(var368, (byte) 70) }, 0);
                                continue;
                            }
                            if (var485 == 4105) {
                                var6 -= 2;
                                class41 var369 = class301.field4877[var6];
                                class41 var370 = class301.field4877[var6 + 1];
                                if (class62.field913.field3946 != null && class62.field913.field3946.field1031) {
                                    class301.field4877[var6++] = var370;
                                    continue;
                                }
                                class301.field4877[var6++] = var369;
                                continue;
                            }
                            if (var485 == 4106) {
                                var9--;
                                int var371 = class140.field2159[var9];
                                class301.field4877[var6++] = class1.method4(var371, (byte) 30);
                                continue;
                            }
                            if (var485 == 4107) {
                                var6 -= 2;
                                class140.field2159[var9++] = class301.field4877[var6].method286(class301.field4877[var6 + 1], (byte) -122);
                                continue;
                            }
                            if (var485 == 4108) {
                                var6--;
                                class41 var372 = class301.field4877[var6];
                                var9 -= 2;
                                int var373 = class140.field2159[var9];
                                int var374 = class140.field2159[var9 + 1];
                                byte[] var375 = class181.field2937.method454(var374, 0, 0);
                                class82 var376 = new class82(var375);
                                var376.method1802(class53.field790, (int[]) null);
                                class140.field2159[var9++] = var376.method1807(var372, var373);
                                continue;
                            }
                            if (var485 == 4109) {
                                var9 -= 2;
                                var6--;
                                class41 var377 = class301.field4877[var6];
                                int var378 = class140.field2159[var9 + 1];
                                int var379 = class140.field2159[var9];
                                byte[] var380 = class181.field2937.method454(var378, 0, 0);
                                class82 var381 = new class82(var380);
                                var381.method1802(class53.field790, (int[]) null);
                                class140.field2159[var9++] = var381.method1786(var377, var379);
                                continue;
                            }
                            if (var485 == 4110) {
                                var6 -= 2;
                                class41 var382 = class301.field4877[var6 + 1];
                                class41 var383 = class301.field4877[var6];
                                var9--;
                                if (class140.field2159[var9] == 1) {
                                    class301.field4877[var6++] = var383;
                                } else {
                                    class301.field4877[var6++] = var382;
                                }
                                continue;
                            }
                            if (var485 == 4111) {
                                var6--;
                                class41 var384 = class301.field4877[var6];
                                class301.field4877[var6++] = class253.method1797(var384);
                                continue;
                            }
                            if (var485 == 4112) {
                                var9--;
                                int var385 = class140.field2159[var9];
                                var6--;
                                class41 var386 = class301.field4877[var6];
                                if (var385 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class301.field4877[var6++] = var386.method303(var385, -111);
                                continue;
                            }
                            if (var485 == 4113) {
                                var9--;
                                int var387 = class140.field2159[var9];
                                class140.field2159[var9++] = class238.method1702(true, var387) ? 1 : 0;
                                continue;
                            }
                            if (var485 == 4114) {
                                var9--;
                                int var388 = class140.field2159[var9];
                                class140.field2159[var9++] = class292.method2025(-3581, var388) ? 1 : 0;
                                continue;
                            }
                            if (var485 == 4115) {
                                var9--;
                                int var389 = class140.field2159[var9];
                                class140.field2159[var9++] = method34(31181, var389) ? 1 : 0;
                                continue;
                            }
                            if (var485 == 4116) {
                                var9--;
                                int var390 = class140.field2159[var9];
                                class140.field2159[var9++] = class237.method1699((byte) -68, var390) ? 1 : 0;
                                continue;
                            }
                            if (var485 == 4117) {
                                var6--;
                                class41 var391 = class301.field4877[var6];
                                if (var391 == null) {
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = var391.method275(false);
                                }
                                continue;
                            }
                            if (var485 == 4118) {
                                var6--;
                                class41 var392 = class301.field4877[var6];
                                var9 -= 2;
                                int var393 = class140.field2159[var9];
                                int var394 = class140.field2159[var9 + 1];
                                class301.field4877[var6++] = var392.method308(var394, var393, -126);
                                continue;
                            }
                            if (var485 == 4119) {
                                var6--;
                                class41 var395 = class301.field4877[var6];
                                class41 var396 = class230.method1645(var395.method275(false), (byte) -117);
                                boolean var397 = false;
                                for (int var398 = 0; var398 < var395.method275(false); var398++) {
                                    int var399 = var395.method281(var398, (byte) 10);
                                    if (var399 == 60) {
                                        var397 = true;
                                    } else if (var399 == 62) {
                                        var397 = false;
                                    } else if (!var397) {
                                        var396.method274((byte) 70, var399);
                                    }
                                }
                                var396.method271((byte) -95);
                                class301.field4877[var6++] = var396;
                                continue;
                            }
                            if (var485 == 4120) {
                                var9 -= 2;
                                var6--;
                                class41 var400 = class301.field4877[var6];
                                int var401 = class140.field2159[var9 + 1];
                                int var402 = class140.field2159[var9];
                                class140.field2159[var9++] = var400.method314(var402, -1, var401);
                                continue;
                            }
                            if (var485 == 4121) {
                                var6 -= 2;
                                class41 var403 = class301.field4877[var6];
                                class41 var404 = class301.field4877[var6 + 1];
                                var9--;
                                int var405 = class140.field2159[var9];
                                class140.field2159[var9++] = var403.method293(var404, (byte) 70, var405);
                                continue;
                            }
                            if (var485 == 4122) {
                                var9--;
                                int var406 = class140.field2159[var9];
                                class140.field2159[var9++] = class217.method1565(var406, -101);
                                continue;
                            }
                            if (var485 == 4123) {
                                var9--;
                                int var407 = class140.field2159[var9];
                                class140.field2159[var9++] = class13.method56(var407, (byte) 35);
                                continue;
                            }
                        } else if (var485 < 4300) {
                            if (var485 == 4200) {
                                var9--;
                                int var337 = class140.field2159[var9];
                                class301.field4877[var6++] = class130.method918(var337, -67).field2120;
                                continue;
                            }
                            if (var485 == 4201) {
                                var9 -= 2;
                                int var338 = class140.field2159[var9 + 1];
                                int var339 = class140.field2159[var9];
                                class138 var340 = class130.method918(var339, -65);
                                if (var338 >= 1 && var338 <= 5 && var340.field2094[var338 - 1] != null) {
                                    class301.field4877[var6++] = var340.field2094[var338 - 1];
                                    continue;
                                }
                                class301.field4877[var6++] = class169.field2690;
                                continue;
                            }
                            if (var485 == 4202) {
                                var9 -= 2;
                                int var341 = class140.field2159[var9];
                                int var342 = class140.field2159[var9 + 1];
                                class138 var343 = class130.method918(var341, -56);
                                if (var342 >= 1 && var342 <= 5 && var343.field2130[var342 - 1] != null) {
                                    class301.field4877[var6++] = var343.field2130[var342 - 1];
                                    continue;
                                }
                                class301.field4877[var6++] = class169.field2690;
                                continue;
                            }
                            if (var485 == 4203) {
                                var9--;
                                int var344 = class140.field2159[var9];
                                class140.field2159[var9++] = class130.method918(var344, -102).field2071;
                                continue;
                            }
                            if (var485 == 4204) {
                                var9--;
                                int var345 = class140.field2159[var9];
                                class140.field2159[var9++] = class130.method918(var345, -57).field2122 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 4205) {
                                var9--;
                                int var346 = class140.field2159[var9];
                                class138 var347 = class130.method918(var346, -47);
                                if (var347.field2078 == -1 && var347.field2110 >= 0) {
                                    class140.field2159[var9++] = var347.field2110;
                                    continue;
                                }
                                class140.field2159[var9++] = var346;
                                continue;
                            }
                            if (var485 == 4206) {
                                var9--;
                                int var348 = class140.field2159[var9];
                                class138 var349 = class130.method918(var348, -80);
                                if (var349.field2078 >= 0 && var349.field2110 >= 0) {
                                    class140.field2159[var9++] = var349.field2110;
                                    continue;
                                }
                                class140.field2159[var9++] = var348;
                                continue;
                            }
                            if (var485 == 4207) {
                                var9--;
                                int var350 = class140.field2159[var9];
                                class140.field2159[var9++] = class130.method918(var350, -92).field2072 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 4208) {
                                var9 -= 2;
                                int var351 = class140.field2159[var9 + 1];
                                int var352 = class140.field2159[var9];
                                class37 var353 = class141.method985(var351, -125);
                                if (var353.method252(37)) {
                                    class301.field4877[var6++] = class130.method918(var352, -62).method971(var351, var353.field570, (byte) 84);
                                } else {
                                    class140.field2159[var9++] = class130.method918(var352, -67).method965((byte) 47, var353.field577, var351);
                                }
                                continue;
                            }
                            if (var485 == 4210) {
                                var6--;
                                class41 var354 = class301.field4877[var6];
                                var9--;
                                int var355 = class140.field2159[var9];
                                class255.method1815(var355 == 1, (byte) -99, var354);
                                class140.field2159[var9++] = class195.field3147;
                                continue;
                            }
                            if (var485 == 4211) {
                                if (class206.field3337 != null && class30.field440 < class195.field3147) {
                                    class140.field2159[var9++] = class217.method1563(class206.field3337[class30.field440++], 65535);
                                    continue;
                                }
                                class140.field2159[var9++] = -1;
                                continue;
                            }
                            if (var485 == 4212) {
                                class30.field440 = 0;
                                continue;
                            }
                        } else if (var485 < 4400) {
                            if (var485 == 4300) {
                                var9 -= 2;
                                int var179 = class140.field2159[var9];
                                int var180 = class140.field2159[var9 + 1];
                                class37 var181 = class141.method985(var180, -121);
                                if (var181.method252(37)) {
                                    class301.field4877[var6++] = class165.method1156(var179, (byte) -104).method1012(var180, 100, var181.field570);
                                } else {
                                    class140.field2159[var9++] = class165.method1156(var179, (byte) -101).method1022(var181.field577, -10056, var180);
                                }
                                continue;
                            }
                            if (var485 == 4301) {
                                var9--;
                                int var182 = class140.field2159[var9];
                                class140.field2159[var9++] = class165.method1156(var182, (byte) -123).field2266;
                                continue;
                            }
                            if (var485 == 4302) {
                                var9--;
                                int var183 = class140.field2159[var9];
                                class140.field2159[var9++] = class165.method1156(var183, (byte) -89).field2255;
                                continue;
                            }
                            if (var485 == 4303) {
                                var9--;
                                int var184 = class140.field2159[var9];
                                class140.field2159[var9++] = class165.method1156(var184, (byte) -124).field2239;
                                continue;
                            }
                            if (var485 == 4304) {
                                var9--;
                                int var185 = class140.field2159[var9];
                                class140.field2159[var9++] = class165.method1156(var185, (byte) -104).field2283;
                                continue;
                            }
                            if (var485 == 4305) {
                                var9--;
                                int var186 = class140.field2159[var9];
                                class140.field2159[var9++] = class165.method1156(var186, (byte) -123).field2270;
                                continue;
                            }
                            if (var485 == 4306) {
                                var9--;
                                int var187 = class140.field2159[var9];
                                class140.field2159[var9++] = class165.method1156(var187, (byte) -121).field2287;
                                continue;
                            }
                            if (var485 == 4307) {
                                var9--;
                                int var188 = class140.field2159[var9];
                                class140.field2159[var9++] = class165.method1156(var188, (byte) -117).field2273;
                                continue;
                            }
                        } else if (var485 < 4500) {
                            if (var485 == 4400) {
                                var9 -= 2;
                                int var189 = class140.field2159[var9];
                                int var190 = class140.field2159[var9 + 1];
                                class37 var191 = class141.method985(var190, -123);
                                if (var191.method252(37)) {
                                    class301.field4877[var6++] = class234.method1684(-2441, var189).method1225(115, var190, var191.field570);
                                } else {
                                    class140.field2159[var9++] = class234.method1684(-2441, var189).method1223(var190, var191.field577, 8);
                                }
                                continue;
                            }
                        } else if (var485 < 4600) {
                            if (var485 == 4500) {
                                var9 -= 2;
                                int var192 = class140.field2159[var9];
                                int var193 = class140.field2159[var9 + 1];
                                class37 var194 = class141.method985(var193, -123);
                                if (var194.method252(37)) {
                                    class301.field4877[var6++] = class192.method1378(22051, var192).method1712((byte) -103, var194.field570, var193);
                                } else {
                                    class140.field2159[var9++] = class192.method1378(22051, var192).method1718(0, var194.field577, var193);
                                }
                                continue;
                            }
                        } else if (var485 < 5100) {
                            if (var485 == 5000) {
                                class140.field2159[var9++] = field126;
                                continue;
                            }
                            if (var485 == 5001) {
                                var9 -= 3;
                                class38.field581++;
                                field126 = class140.field2159[var9];
                                class127.field1882 = class140.field2159[var9 + 1];
                                class273.field4454 = class140.field2159[var9 + 2];
                                class285.field4642.method844(-4, 169);
                                class285.field4642.method797(field126, -22096);
                                class285.field4642.method797(class127.field1882, -22096);
                                class285.field4642.method797(class273.field4454, -22096);
                                continue;
                            }
                            if (var485 == 5002) {
                                var6--;
                                class41 var272 = class301.field4877[var6];
                                var9 -= 2;
                                int var273 = class140.field2159[var9 + 1];
                                class225.field3603++;
                                int var274 = class140.field2159[var9];
                                class285.field4642.method844(-4, 88);
                                class285.field4642.method800(var272.method291((byte) 65), (byte) -113);
                                class285.field4642.method797(var274 - 1, -22096);
                                class285.field4642.method797(var273, -22096);
                                continue;
                            }
                            if (var485 == 5003) {
                                class41 var275 = null;
                                var9--;
                                int var276 = class140.field2159[var9];
                                if (var276 < 100) {
                                    var275 = class16.field215[var276];
                                }
                                if (var275 == null) {
                                    var275 = class169.field2690;
                                }
                                class301.field4877[var6++] = var275;
                                continue;
                            }
                            if (var485 == 5004) {
                                var9--;
                                int var277 = class140.field2159[var9];
                                int var278 = -1;
                                if (var277 < 100 && class16.field215[var277] != null) {
                                    var278 = class76.field1126[var277];
                                }
                                class140.field2159[var9++] = var278;
                                continue;
                            }
                            if (var485 == 5005) {
                                class140.field2159[var9++] = class127.field1882;
                                continue;
                            }
                            if (var485 == 5008) {
                                var6--;
                                class41 var279 = class301.field4877[var6];
                                if (var279.method309(class120.field1758, 0)) {
                                    class282.method1988(var279, -26612);
                                    continue;
                                }
                                if (class62.field919 == 0 && (class164.field2595 && !class62.field907 || class169.field2696)) {
                                    continue;
                                }
                                class41 var280 = var279.method294(1);
                                class24.field368++;
                                byte var281 = 0;
                                if (var280.method309(class310.field5230, 0)) {
                                    var279 = var279.method279(class310.field5230.method275(!arg1), (byte) -51);
                                    var281 = 0;
                                } else if (var280.method309(class256.field4116, 0)) {
                                    var279 = var279.method279(class256.field4116.method275(false), (byte) -58);
                                    var281 = 1;
                                } else if (var280.method309(class156.field2474, 0)) {
                                    var279 = var279.method279(class156.field2474.method275(false), (byte) -26);
                                    var281 = 2;
                                } else if (var280.method309(class32.field482, 0)) {
                                    var281 = 3;
                                    var279 = var279.method279(class32.field482.method275(false), (byte) -74);
                                } else if (var280.method309(class284.field4615, 0)) {
                                    var279 = var279.method279(class284.field4615.method275(false), (byte) -97);
                                    var281 = 4;
                                } else if (var280.method309(class80.field1176, 0)) {
                                    var279 = var279.method279(class80.field1176.method275(false), (byte) -116);
                                    var281 = 5;
                                } else if (var280.method309(class292.field4725, 0)) {
                                    var279 = var279.method279(class292.field4725.method275(false), (byte) -19);
                                    var281 = 6;
                                } else if (var280.method309(class173.field2817, 0)) {
                                    var279 = var279.method279(class173.field2817.method275(false), (byte) -80);
                                    var281 = 7;
                                } else if (var280.method309(class297.field4802, 0)) {
                                    var281 = 8;
                                    var279 = var279.method279(class297.field4802.method275(false), (byte) -36);
                                } else if (var280.method309(class259.field4126, 0)) {
                                    var279 = var279.method279(class259.field4126.method275(false), (byte) -78);
                                    var281 = 9;
                                } else if (var280.method309(class288.field4676, 0)) {
                                    var281 = 10;
                                    var279 = var279.method279(class288.field4676.method275(false), (byte) -8);
                                } else if (var280.method309(class302.field5031, 0)) {
                                    var279 = var279.method279(class302.field5031.method275(false), (byte) -84);
                                    var281 = 11;
                                } else if (class246.field3954 != 0) {
                                    if (var280.method309(class310.field5217, 0)) {
                                        var281 = 0;
                                        var279 = var279.method279(class310.field5217.method275(false), (byte) -80);
                                    } else if (var280.method309(class256.field4105, 0)) {
                                        var279 = var279.method279(class256.field4105.method275(false), (byte) -63);
                                        var281 = 1;
                                    } else if (var280.method309(class156.field2471, 0)) {
                                        var279 = var279.method279(class156.field2471.method275(!arg1), (byte) -65);
                                        var281 = 2;
                                    } else if (var280.method309(class32.field478, 0)) {
                                        var279 = var279.method279(class32.field478.method275(false), (byte) -110);
                                        var281 = 3;
                                    } else if (var280.method309(class284.field4611, 0)) {
                                        var281 = 4;
                                        var279 = var279.method279(class284.field4611.method275(false), (byte) -38);
                                    } else if (var280.method309(class80.field1182, 0)) {
                                        var281 = 5;
                                        var279 = var279.method279(class80.field1182.method275(false), (byte) -58);
                                    } else if (var280.method309(class292.field4730, 0)) {
                                        var281 = 6;
                                        var279 = var279.method279(class292.field4730.method275(false), (byte) -64);
                                    } else if (var280.method309(class173.field2813, 0)) {
                                        var279 = var279.method279(class173.field2813.method275(false), (byte) -85);
                                        var281 = 7;
                                    } else if (var280.method309(class297.field4814, 0)) {
                                        var279 = var279.method279(class297.field4814.method275(false), (byte) -63);
                                        var281 = 8;
                                    } else if (var280.method309(class259.field4129, 0)) {
                                        var279 = var279.method279(class259.field4129.method275(false), (byte) -13);
                                        var281 = 9;
                                    } else if (var280.method309(class288.field4661, 0)) {
                                        var281 = 10;
                                        var279 = var279.method279(class288.field4661.method275(!arg1), (byte) -111);
                                    } else if (var280.method309(class302.field4961, 0)) {
                                        var281 = 11;
                                        var279 = var279.method279(class302.field4961.method275(false), (byte) -44);
                                    }
                                }
                                byte var282 = 0;
                                class41 var283 = var279.method294(1);
                                if (var283.method309(class63.field923, 0)) {
                                    var279 = var279.method279(class63.field923.method275(false), (byte) -35);
                                    var282 = 1;
                                } else if (var283.method309(class169.field2693, 0)) {
                                    var282 = 2;
                                    var279 = var279.method279(class169.field2693.method275(false), (byte) -55);
                                } else if (var283.method309(class195.field3142, 0)) {
                                    var282 = 3;
                                    var279 = var279.method279(class195.field3142.method275(!arg1), (byte) -42);
                                } else if (var283.method309(class5.field59, 0)) {
                                    var279 = var279.method279(class5.field59.method275(false), (byte) -59);
                                    var282 = 4;
                                } else if (var283.method309(class147.field2237, 0)) {
                                    var279 = var279.method279(class147.field2237.method275(false), (byte) -109);
                                    var282 = 5;
                                } else if (class246.field3954 != 0) {
                                    if (var283.method309(class63.field924, 0)) {
                                        var279 = var279.method279(class63.field924.method275(false), (byte) -122);
                                        var282 = 1;
                                    } else if (var283.method309(class169.field2699, 0)) {
                                        var279 = var279.method279(class169.field2699.method275(false), (byte) -88);
                                        var282 = 2;
                                    } else if (var283.method309(class195.field3149, 0)) {
                                        var279 = var279.method279(class195.field3149.method275(false), (byte) -14);
                                        var282 = 3;
                                    } else if (var283.method309(class5.field51, 0)) {
                                        var282 = 4;
                                        var279 = var279.method279(class5.field51.method275(false), (byte) -28);
                                    } else if (var283.method309(class147.field2294, 0)) {
                                        var279 = var279.method279(class147.field2294.method275(false), (byte) -30);
                                        var282 = 5;
                                    }
                                }
                                class285.field4642.method844(-4, 20);
                                class285.field4642.method797(0, -22096);
                                int var284 = class285.field4642.field1640;
                                class285.field4642.method797(var281, -22096);
                                class285.field4642.method797(var282, -22096);
                                class123.method875(0, class285.field4642, var279);
                                class285.field4642.method769(32618, class285.field4642.field1640 - var284);
                                continue;
                            }
                            if (var485 == 5009) {
                                var6 -= 2;
                                class41 var285 = class301.field4877[var6];
                                class41 var286 = class301.field4877[var6 + 1];
                                if (class62.field919 != 0 || (!class164.field2595 || class62.field907) && !class169.field2696) {
                                    class285.field4642.method844(-4, 134);
                                    class285.field4642.method797(0, -22096);
                                    int var287 = class285.field4642.field1640;
                                    class285.field4642.method800(var285.method291((byte) 65), (byte) -113);
                                    class123.method875(0, class285.field4642, var286);
                                    class285.field4642.method769(32618, class285.field4642.field1640 - var287);
                                    class274.field4468++;
                                }
                                continue;
                            }
                            if (var485 == 5010) {
                                class41 var288 = null;
                                var9--;
                                int var289 = class140.field2159[var9];
                                if (var289 < 100) {
                                    var288 = class202.field3248[var289];
                                }
                                if (var288 == null) {
                                    var288 = class169.field2690;
                                }
                                class301.field4877[var6++] = var288;
                                continue;
                            }
                            if (var485 == 5011) {
                                class41 var290 = null;
                                var9--;
                                int var291 = class140.field2159[var9];
                                if (var291 < 100) {
                                    var290 = class246.field3951[var291];
                                }
                                if (var290 == null) {
                                    var290 = class169.field2690;
                                }
                                class301.field4877[var6++] = var290;
                                continue;
                            }
                            if (var485 == 5012) {
                                var9--;
                                int var292 = class140.field2159[var9];
                                int var293 = -1;
                                if (var292 < 100) {
                                    var293 = class302.field4926[var292];
                                }
                                class140.field2159[var9++] = var293;
                                continue;
                            }
                            if (var485 == 5015) {
                                class41 var294;
                                if (class62.field913 == null || class62.field913.field3933 == null) {
                                    var294 = class266.field4236;
                                } else {
                                    var294 = class62.field913.method1755(1774);
                                }
                                class301.field4877[var6++] = var294;
                                continue;
                            }
                            if (var485 == 5016) {
                                class140.field2159[var9++] = class273.field4454;
                                continue;
                            }
                            if (var485 == 5017) {
                                class140.field2159[var9++] = class95.field1414;
                                continue;
                            }
                            if (var485 == 5050) {
                                var9--;
                                int var295 = class140.field2159[var9];
                                class301.field4877[var6++] = class116.method831(var295, false).field4154;
                                continue;
                            }
                            if (var485 == 5051) {
                                var9--;
                                int var296 = class140.field2159[var9];
                                class262 var297 = class116.method831(var296, false);
                                if (var297.field4157 == null) {
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = var297.field4157.length;
                                }
                                continue;
                            }
                            if (var485 == 5052) {
                                var9 -= 2;
                                int var298 = class140.field2159[var9];
                                int var299 = class140.field2159[var9 + 1];
                                class262 var300 = class116.method831(var298, false);
                                int var301 = var300.field4157[var299];
                                class140.field2159[var9++] = var301;
                                continue;
                            }
                            if (var485 == 5053) {
                                var9--;
                                int var302 = class140.field2159[var9];
                                class262 var303 = class116.method831(var302, false);
                                if (var303.field4155 == null) {
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = var303.field4155.length;
                                }
                                continue;
                            }
                            if (var485 == 5054) {
                                var9 -= 2;
                                int var304 = class140.field2159[var9];
                                int var305 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = class116.method831(var304, !arg1).field4155[var305];
                                continue;
                            }
                            if (var485 == 5055) {
                                var9--;
                                int var306 = class140.field2159[var9];
                                class301.field4877[var6++] = class195.method1397((byte) -79, var306).method1250((byte) 92);
                                continue;
                            }
                            if (var485 == 5056) {
                                var9--;
                                int var307 = class140.field2159[var9];
                                class174 var308 = class195.method1397((byte) -21, var307);
                                if (var308.field2828 == null) {
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = var308.field2828.length;
                                }
                                continue;
                            }
                            if (var485 == 5057) {
                                var9 -= 2;
                                int var309 = class140.field2159[var9 + 1];
                                int var310 = class140.field2159[var9];
                                class140.field2159[var9++] = class195.method1397((byte) -49, var310).field2828[var309];
                                continue;
                            }
                            if (var485 == 5058) {
                                class195.field3152 = new class146();
                                var9--;
                                class195.field3152.field2226 = class140.field2159[var9];
                                class195.field3152.field2223 = class195.method1397((byte) -54, class195.field3152.field2226);
                                class195.field3152.field2219 = new int[class195.field3152.field2223.method1244((byte) -117)];
                                continue;
                            }
                            if (var485 == 5059) {
                                class285.field4642.method844(-4, 104);
                                class10.field127++;
                                class285.field4642.method797(0, -22096);
                                int var311 = class285.field4642.field1640;
                                class285.field4642.method797(0, -22096);
                                class285.field4642.method778(class195.field3152.field2226, (byte) -4);
                                class195.field3152.field2223.method1249(80, class285.field4642, class195.field3152.field2219);
                                class285.field4642.method769(32618, class285.field4642.field1640 - var311);
                                continue;
                            }
                            if (var485 == 5060) {
                                class91.field1314++;
                                var6--;
                                class41 var312 = class301.field4877[var6];
                                class285.field4642.method844(-4, 220);
                                class285.field4642.method797(0, -22096);
                                int var313 = class285.field4642.field1640;
                                class285.field4642.method800(var312.method291((byte) 65), (byte) -113);
                                class285.field4642.method778(class195.field3152.field2226, (byte) -4);
                                class195.field3152.field2223.method1249(80, class285.field4642, class195.field3152.field2219);
                                class285.field4642.method769(32618, class285.field4642.field1640 - var313);
                                continue;
                            }
                            if (var485 == 5061) {
                                class285.field4642.method844(-4, 104);
                                class10.field127++;
                                class285.field4642.method797(0, -22096);
                                int var314 = class285.field4642.field1640;
                                class285.field4642.method797(1, -22096);
                                class285.field4642.method778(class195.field3152.field2226, (byte) -4);
                                class195.field3152.field2223.method1249(80, class285.field4642, class195.field3152.field2219);
                                class285.field4642.method769(32618, class285.field4642.field1640 - var314);
                                continue;
                            }
                            if (var485 == 5062) {
                                var9 -= 2;
                                int var315 = class140.field2159[var9 + 1];
                                int var316 = class140.field2159[var9];
                                class140.field2159[var9++] = class116.method831(var316, false).field4167[var315];
                                continue;
                            }
                            if (var485 == 5063) {
                                var9 -= 2;
                                int var317 = class140.field2159[var9];
                                int var318 = class140.field2159[var9 + 1];
                                class140.field2159[var9++] = class116.method831(var317, false).field4156[var318];
                                continue;
                            }
                            if (var485 == 5064) {
                                var9 -= 2;
                                int var319 = class140.field2159[var9];
                                int var320 = class140.field2159[var9 + 1];
                                if (var320 == -1) {
                                    class140.field2159[var9++] = -1;
                                } else {
                                    class140.field2159[var9++] = class116.method831(var319, false).method1842(true, var320);
                                }
                                continue;
                            }
                            if (var485 == 5065) {
                                var9 -= 2;
                                int var321 = class140.field2159[var9];
                                int var322 = class140.field2159[var9 + 1];
                                if (var322 == -1) {
                                    class140.field2159[var9++] = -1;
                                } else {
                                    class140.field2159[var9++] = class116.method831(var321, false).method1850((byte) 5, var322);
                                }
                                continue;
                            }
                            if (var485 == 5066) {
                                var9--;
                                int var323 = class140.field2159[var9];
                                class140.field2159[var9++] = class195.method1397((byte) -28, var323).method1244((byte) -121);
                                continue;
                            }
                            if (var485 == 5067) {
                                var9 -= 2;
                                int var324 = class140.field2159[var9 + 1];
                                int var325 = class140.field2159[var9];
                                int var326 = class195.method1397((byte) -40, var325).method1251((byte) -75, var324);
                                class140.field2159[var9++] = var326;
                                continue;
                            }
                            if (var485 == 5068) {
                                var9 -= 2;
                                int var327 = class140.field2159[var9];
                                int var328 = class140.field2159[var9 + 1];
                                class195.field3152.field2219[var327] = var328;
                                continue;
                            }
                            if (var485 == 5069) {
                                var9 -= 2;
                                int var329 = class140.field2159[var9];
                                int var330 = class140.field2159[var9 + 1];
                                class195.field3152.field2219[var329] = var330;
                                continue;
                            }
                            if (var485 == 5070) {
                                var9 -= 3;
                                int var331 = class140.field2159[var9];
                                int var332 = class140.field2159[var9 + 1];
                                int var333 = class140.field2159[var9 + 2];
                                class174 var334 = class195.method1397((byte) -66, var331);
                                if (var334.method1251((byte) -71, var332) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class140.field2159[var9++] = var334.method1253(var333, var332, (byte) -93);
                                continue;
                            }
                            if (var485 == 5071) {
                                var9--;
                                boolean var335 = class140.field2159[var9] == 1;
                                var6--;
                                class41 var336 = class301.field4877[var6];
                                class79.method564(var336, var335, !arg1);
                                class140.field2159[var9++] = class195.field3147;
                                continue;
                            }
                            if (var485 == 5072) {
                                if (class206.field3337 != null && class30.field440 < class195.field3147) {
                                    class140.field2159[var9++] = class217.method1563(class206.field3337[class30.field440++], 65535);
                                    continue;
                                }
                                class140.field2159[var9++] = -1;
                                continue;
                            }
                            if (var485 == 5073) {
                                class30.field440 = 0;
                                continue;
                            }
                        } else if (var485 < 5200) {
                            if (var485 == 5100) {
                                if (class85.field1225[86]) {
                                    class140.field2159[var9++] = 1;
                                } else {
                                    class140.field2159[var9++] = 0;
                                }
                                continue;
                            }
                            if (var485 == 5101) {
                                if (class85.field1225[82]) {
                                    class140.field2159[var9++] = 1;
                                } else {
                                    class140.field2159[var9++] = 0;
                                }
                                continue;
                            }
                            if (var485 == 5102) {
                                if (class85.field1225[81]) {
                                    class140.field2159[var9++] = 1;
                                } else {
                                    class140.field2159[var9++] = 0;
                                }
                                continue;
                            }
                        } else if (var485 < 5300) {
                            if (var485 == 5200) {
                                var9--;
                                class37.method253(class140.field2159[var9], -76);
                                continue;
                            }
                            if (var485 == 5201) {
                                class140.field2159[var9++] = class196.method1403(true);
                                continue;
                            }
                            if (var485 == 5202) {
                                var9--;
                                class226.method1623(26, class140.field2159[var9]);
                                continue;
                            }
                            if (var485 == 5203) {
                                var6--;
                                class77.method559(class301.field4877[var6], -26557);
                                continue;
                            }
                            if (var485 == 5204) {
                                class301.field4877[var6 - 1] = class26.method167(class301.field4877[var6 - 1], 3);
                                continue;
                            }
                            if (var485 == 5205) {
                                var6--;
                                class176.method1262((byte) 123, class301.field4877[var6]);
                                continue;
                            }
                            if (var485 == 5206) {
                                var9--;
                                int var195 = class140.field2159[var9];
                                class161 var196 = class212.method1494((var195 & 0xFFFE11A) >> 14, var195 & 0x3FFF, (byte) -89);
                                if (var196 == null) {
                                    class301.field4877[var6++] = class169.field2690;
                                } else {
                                    class301.field4877[var6++] = var196.field2565;
                                }
                                continue;
                            }
                            if (var485 == 5207) {
                                var6--;
                                class161 var197 = class107.method731(126, class301.field4877[var6]);
                                if (var197 != null && var197.field2558 != null) {
                                    class301.field4877[var6++] = var197.field2558;
                                    continue;
                                }
                                class301.field4877[var6++] = class169.field2690;
                                continue;
                            }
                        } else if (var485 < 5400) {
                            if (var485 == 5300) {
                                var9 -= 2;
                                int var259 = class140.field2159[var9];
                                int var260 = class140.field2159[var9 + 1];
                                class105.method725(var259, false, 3, false, var260);
                                class140.field2159[var9++] = class55.field803 == null ? 0 : 1;
                                continue;
                            }
                            if (var485 == 5301) {
                                if (class55.field803 != null) {
                                    class105.method725(-1, !arg1, class314.field5298, false, -1);
                                }
                                continue;
                            }
                            if (var485 == 5302) {
                                class83[] var261 = class164.method1149(false);
                                class140.field2159[var9++] = var261.length;
                                continue;
                            }
                            if (var485 == 5303) {
                                var9--;
                                int var262 = class140.field2159[var9];
                                class83[] var263 = class164.method1149(false);
                                class140.field2159[var9++] = var263[var262].field1209;
                                class140.field2159[var9++] = var263[var262].field1204;
                                continue;
                            }
                            if (var485 == 5305) {
                                int var264 = class226.field3616;
                                int var265 = -1;
                                int var266 = class167.field2655;
                                class83[] var267 = class164.method1149(!arg1);
                                for (int var268 = 0; var268 < var267.length; var268++) {
                                    class83 var269 = var267[var268];
                                    if (var269.field1209 == var266 && var269.field1204 == var264) {
                                        var265 = var268;
                                        break;
                                    }
                                }
                                class140.field2159[var9++] = var265;
                                continue;
                            }
                            if (var485 == 5306) {
                                class140.field2159[var9++] = class33.method228((byte) 119);
                                continue;
                            }
                            if (var485 == 5307) {
                                var9--;
                                int var270 = class140.field2159[var9];
                                if (var270 < 0 || var270 > 2) {
                                    var270 = 0;
                                }
                                class105.method725(-1, !arg1, var270, false, -1);
                                continue;
                            }
                            if (var485 == 5308) {
                                class140.field2159[var9++] = class314.field5298;
                                continue;
                            }
                            if (var485 == 5309) {
                                var9--;
                                int var271 = class140.field2159[var9];
                                if (var271 < 0 || var271 > 2) {
                                    var271 = 0;
                                }
                                class314.field5298 = var271;
                                class246.method1760((byte) 48, class138.field2065);
                                continue;
                            }
                        } else if (var485 < 5500) {
                            if (var485 == 5400) {
                                class176.field2863++;
                                var9--;
                                int var237 = class140.field2159[var9];
                                var6 -= 2;
                                class41 var238 = class301.field4877[var6];
                                class41 var239 = class301.field4877[var6 + 1];
                                class285.field4642.method844(-4, 155);
                                class285.field4642.method797(class188.method1351(var238, true) + class188.method1351(var239, arg1) + 1, -22096);
                                class285.field4642.method776(341440880, var238);
                                class285.field4642.method776(341440880, var239);
                                class285.field4642.method797(var237, -22096);
                                continue;
                            }
                            if (var485 == 5401) {
                                var9 -= 2;
                                class24.field365[class140.field2159[var9]] = (short) class132.method927(860920833, class140.field2159[var9 + 1]);
                                class142.method990(29430);
                                class70.method511(0);
                                class2.method6(1);
                                class92.method645((byte) -101);
                                class92.method656(-115);
                                continue;
                            }
                            if (var485 == 5405) {
                                var9 -= 2;
                                int var240 = class140.field2159[var9 + 1];
                                int var241 = class140.field2159[var9];
                                if (var241 >= 0 && var241 < 2) {
                                    class142.field2176[var241] = new int[var240 << 1][4];
                                }
                                continue;
                            }
                            if (var485 == 5406) {
                                var9 -= 7;
                                int var242 = class140.field2159[var9 + 1] << 1;
                                int var243 = class140.field2159[var9 + 2];
                                int var244 = class140.field2159[var9 + 4];
                                int var245 = class140.field2159[var9];
                                int var246 = class140.field2159[var9 + 6];
                                int var247 = class140.field2159[var9 + 5];
                                int var248 = class140.field2159[var9 + 3];
                                if (var245 >= 0 && var245 < 2 && class142.field2176[var245] != null && var242 >= 0 && var242 < class142.field2176[var245].length) {
                                    class142.field2176[var245][var242] = new int[] { class217.method1563(var243 >> 14, 16383) * 128, var248, class217.method1563(var243, 16383) * 128, var246 };
                                    class142.field2176[var245][var242 + 1] = new int[] { (class217.method1563(var244, 268429096) >> 14) * 128, var247, class217.method1563(var244, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var485 == 5407) {
                                var9--;
                                int var249 = class142.field2176[class140.field2159[var9]].length >> 1;
                                class140.field2159[var9++] = var249;
                                continue;
                            }
                            if (var485 == 5411) {
                                if (class55.field803 != null) {
                                    class105.method725(-1, !arg1, class314.field5298, false, -1);
                                }
                                if (class238.field3817 == null) {
                                    class144.method997(false, class302.method2079((byte) 103), (byte) 77);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var485 == 5419) {
                                class41 var250 = class169.field2690;
                                if (class138.field2075 != null) {
                                    var250 = class311.method2153(class138.field2075.field2946, -100);
                                    try {
                                        if (class138.field2075.field2945 != null) {
                                            byte[] var251 = ((String) class138.field2075.field2945).getBytes("ISO-8859-1");
                                            var250 = class213.method1507(var251.length, 0, false, var251);
                                        }
                                    } catch (UnsupportedEncodingException var483) {
                                    }
                                }
                                class301.field4877[var6++] = var250;
                                continue;
                            }
                            if (var485 == 5420) {
                                class140.field2159[var9++] = class211.field3397 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 5421) {
                                if (class55.field803 != null) {
                                    class105.method725(-1, !arg1, class314.field5298, false, -1);
                                }
                                var9--;
                                boolean var253 = class140.field2159[var9] == 1;
                                var6--;
                                class41 var254 = class301.field4877[var6];
                                class41 var255 = class187.method1346(new class41[] { class302.method2079((byte) -74), var254 }, 0);
                                if (class238.field3817 != null || var253 && class211.field3397 != 3 && class211.field3400.startsWith("win") && !class126.field1881) {
                                    class265.field4201 = var253;
                                    class77.field1146 = var255;
                                    class308.field5183 = class138.field2065.method1477((byte) 69, new String(var255.method317(false), "ISO-8859-1"));
                                    continue;
                                }
                                class144.method997(var253, var255, (byte) 77);
                                continue;
                            }
                            if (var485 == 5422) {
                                var6 -= 2;
                                class41 var256 = class301.field4877[var6 + 1];
                                class41 var257 = class301.field4877[var6];
                                var9--;
                                int var258 = class140.field2159[var9];
                                if (var257.method275(false) > 0) {
                                    if (class119.field1752 == null) {
                                        class119.field1752 = new class41[class164.field2596[class110.field1564]];
                                    }
                                    class119.field1752[var258] = var257;
                                }
                                if (var256.method275(false) > 0) {
                                    if (class127.field1883 == null) {
                                        class127.field1883 = new class41[class164.field2596[class110.field1564]];
                                    }
                                    class127.field1883[var258] = var256;
                                }
                                continue;
                            }
                            if (var485 == 5423) {
                                var6--;
                                class301.field4877[var6].method287((byte) -113);
                                continue;
                            }
                        } else if (var485 < 5600) {
                            if (var485 == 5500) {
                                var9 -= 4;
                                int var225 = class140.field2159[var9];
                                int var226 = class140.field2159[var9 + 1];
                                int var227 = class140.field2159[var9 + 2];
                                int var228 = class140.field2159[var9 + 3];
                                class41.method296(-7057, (var225 >> 14 & 0x3FFF) - class88.field1300, false, var226, (var225 & 0x3FFF) - class55.field809, var227, var228);
                                continue;
                            }
                            if (var485 == 5501) {
                                var9 -= 4;
                                int var229 = class140.field2159[var9];
                                int var230 = class140.field2159[var9 + 2];
                                int var231 = class140.field2159[var9 + 1];
                                int var232 = class140.field2159[var9 + 3];
                                class33.method229(((var229 & 0xFFFF030) >> 14) - class88.field1300, var232, var231, (var229 & 0x3FFF) - class55.field809, (byte) -82, var230);
                                continue;
                            }
                            if (var485 == 5502) {
                                var9 -= 6;
                                int var233 = class140.field2159[var9];
                                if (var233 >= 2) {
                                    throw new RuntimeException();
                                }
                                class120.field1762 = var233;
                                int var234 = class140.field2159[var9 + 1];
                                if (class142.field2176[class120.field1762].length >> 1 <= var234 + 1) {
                                    throw new RuntimeException();
                                }
                                class175.field2845 = 0;
                                class140.field2148 = var234;
                                class222.field3552 = class140.field2159[var9 + 2];
                                class305.field5110 = class140.field2159[var9 + 3];
                                int var235 = class140.field2159[var9 + 4];
                                if (var235 >= 2) {
                                    throw new RuntimeException();
                                }
                                class306.field5134 = var235;
                                int var236 = class140.field2159[var9 + 5];
                                if ((var236 + 1) >= (class142.field2176[class306.field5134].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class28.field416 = 3;
                                class274.field4484 = var236;
                                continue;
                            }
                            if (var485 == 5503) {
                                class226.method1624(-7844);
                                continue;
                            }
                            if (var485 == 5504) {
                                var9 -= 2;
                                class286.field4658 = class140.field2159[var9];
                                class8.field101 = class140.field2159[var9 + 1];
                                class140.method978((byte) -46);
                                continue;
                            }
                            if (var485 == 5505) {
                                class140.field2159[var9++] = class286.field4658;
                                continue;
                            }
                            if (var485 == 5506) {
                                class140.field2159[var9++] = class8.field101;
                                continue;
                            }
                        } else if (var485 < 5700) {
                            if (var485 == 5600) {
                                var6 -= 2;
                                class41 var221 = class301.field4877[var6];
                                var9--;
                                int var222 = class140.field2159[var9];
                                class41 var223 = class301.field4877[var6 + 1];
                                if (class94.field1377 == 10 && class32.field485 == 0 && class259.field4132 == 0 && class32.field479 == 0 && class50.field763 == 0) {
                                    class55.method390(var223, var222, true, var221);
                                }
                                continue;
                            }
                            if (var485 == 5601) {
                                class86.method620(3066);
                                continue;
                            }
                            if (var485 == 5602) {
                                if (class259.field4132 == 0) {
                                    class134.field2001 = -2;
                                }
                                continue;
                            }
                            if (var485 == 5603) {
                                var9 -= 4;
                                if (class94.field1377 == 10 && class32.field485 == 0 && class259.field4132 == 0 && class32.field479 == 0 && class50.field763 == 0) {
                                    class265.method1873(class140.field2159[var9 + 2], class140.field2159[var9 + 3], 98, class140.field2159[var9 + 1], class140.field2159[var9]);
                                }
                                continue;
                            }
                            if (var485 == 5604) {
                                var6--;
                                if (class94.field1377 == 10 && class32.field485 == 0 && class259.field4132 == 0 && class32.field479 == 0 && class50.field763 == 0) {
                                    class310.method2146(class301.field4877[var6].method291((byte) 65), -3);
                                }
                                continue;
                            }
                            if (var485 == 5605) {
                                var6 -= 2;
                                var9 -= 4;
                                if (class94.field1377 == 10 && class32.field485 == 0 && class259.field4132 == 0 && class32.field479 == 0 && class50.field763 == 0) {
                                    class262.method1849(true, class140.field2159[var9 + 3], class301.field4877[var6].method291((byte) 65), class140.field2159[var9 + 1], class140.field2159[var9], class301.field4877[var6 + 1], class140.field2159[var9 + 2]);
                                }
                                continue;
                            }
                            if (var485 == 5606) {
                                if (class32.field479 == 0) {
                                    class32.field471 = -2;
                                }
                                continue;
                            }
                            if (var485 == 5607) {
                                class140.field2159[var9++] = class134.field2001;
                                continue;
                            }
                            if (var485 == 5608) {
                                class140.field2159[var9++] = class178.field2883;
                                continue;
                            }
                            if (var485 == 5609) {
                                class140.field2159[var9++] = class32.field471;
                                continue;
                            }
                            if (var485 == 5610) {
                                for (int var224 = 0; var224 < 5; var224++) {
                                    class301.field4877[var6++] = var224 >= class132.field1974.length ? class169.field2690 : class132.field1974[var224].method288((byte) -127);
                                }
                                class132.field1974 = null;
                                continue;
                            }
                            if (var485 == 5611) {
                                class140.field2159[var9++] = class164.field2606;
                                continue;
                            }
                        } else if (var485 < 6100) {
                            if (var485 == 6001) {
                                var9--;
                                int var198 = class140.field2159[var9];
                                if (var198 < 1) {
                                    var198 = 1;
                                }
                                if (var198 > 4) {
                                    var198 = 4;
                                }
                                class262.field4171 = var198;
                                if (!class166.field2625 || !class66.field1006) {
                                    if (class262.field4171 == 1) {
                                        class31.method207(0.9F);
                                    }
                                    if (class262.field4171 == 2) {
                                        class31.method207(0.8F);
                                    }
                                    if (class262.field4171 == 3) {
                                        class31.method207(0.7F);
                                    }
                                    if (class262.field4171 == 4) {
                                        class31.method207(0.6F);
                                    }
                                }
                                if (class166.field2625) {
                                    class13.method58(-4);
                                    if (!class66.field1006) {
                                        class315.method2178(-240);
                                    }
                                }
                                class70.method511(0);
                                class246.method1760((byte) 84, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6002) {
                                var9--;
                                class290.method2019(class140.field2159[var9] == 1, (byte) -106);
                                class160.method1134((byte) -94);
                                class315.method2178(-240);
                                class265.method1874(122);
                                class246.method1760((byte) 39, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6003) {
                                var9--;
                                class33.field499 = class140.field2159[var9] == 1;
                                class265.method1874(4);
                                class246.method1760((byte) 57, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6005) {
                                var9--;
                                class296.field4778 = class140.field2159[var9] == 1;
                                class315.method2178(-240);
                                class246.method1760((byte) 44, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6006) {
                                var9--;
                                class81.field1200 = class140.field2159[var9] == 1;
                                ((class305) class31.field461).method2109(77, !class81.field1200);
                                class246.method1760((byte) 14, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6007) {
                                var9--;
                                class207.field3359 = class140.field2159[var9] == 1;
                                class246.method1760((byte) 63, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6008) {
                                var9--;
                                class14.field181 = class140.field2159[var9] == 1;
                                class246.method1760((byte) 41, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6009) {
                                var9--;
                                class241.field3863 = class140.field2159[var9] == 1;
                                class246.method1760((byte) 120, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6010) {
                                var9--;
                                class46.field722 = class140.field2159[var9] == 1;
                                class246.method1760((byte) 92, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6011) {
                                var9--;
                                int var199 = class140.field2159[var9];
                                if (var199 < 0 || var199 > 2) {
                                    var199 = 0;
                                }
                                class152.field2419 = var199;
                                class246.method1760((byte) 83, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6012) {
                                if (class166.field2625) {
                                    class274.method1934(0, 0, (byte) -123);
                                }
                                var9--;
                                class66.field1006 = class140.field2159[var9] == 1;
                                if (class166.field2625 && class66.field1006) {
                                    class31.method207(0.7F);
                                } else {
                                    if (class262.field4171 == 1) {
                                        class31.method207(0.9F);
                                    }
                                    if (class262.field4171 == 2) {
                                        class31.method207(0.8F);
                                    }
                                    if (class262.field4171 == 3) {
                                        class31.method207(0.7F);
                                    }
                                    if (class262.field4171 == 4) {
                                        class31.method207(0.6F);
                                    }
                                }
                                class315.method2178(-240);
                                class246.method1760((byte) 48, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6014) {
                                var9--;
                                class27.field393 = class140.field2159[var9] == 1;
                                if (class166.field2625) {
                                    class315.method2178(-240);
                                }
                                class246.method1760((byte) 103, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6015) {
                                var9--;
                                class296.field4787 = class140.field2159[var9] == 1;
                                if (class166.field2625) {
                                    class13.method58(-4);
                                }
                                class246.method1760((byte) 116, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6016) {
                                var9--;
                                int var200 = class140.field2159[var9];
                                if (class166.field2625) {
                                    class85.field1224 = true;
                                }
                                if (var200 < 0 || var200 > 2) {
                                    var200 = 0;
                                }
                                class285.field4641 = var200;
                                class246.method1760((byte) 11, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6017) {
                                var9--;
                                class235.field3760 = class140.field2159[var9] == 1;
                                class3.method9(-69);
                                class246.method1760((byte) 79, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6018) {
                                var9--;
                                int var201 = class140.field2159[var9];
                                if (var201 < 0) {
                                    var201 = 0;
                                }
                                if (var201 > 127) {
                                    var201 = 127;
                                }
                                class1.field3 = var201;
                                class246.method1760((byte) 105, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6019) {
                                var9--;
                                int var202 = class140.field2159[var9];
                                if (var202 < 0) {
                                    var202 = 0;
                                }
                                if (var202 > 255) {
                                    var202 = 255;
                                }
                                if (class244.field3900 != var202) {
                                    if (class244.field3900 == 0 && class237.field3805 != -1) {
                                        class271.method1916(16611, class294.field4763, var202, false, 0, class237.field3805);
                                        class265.field4193 = false;
                                    } else if (var202 == 0) {
                                        class127.method892(1);
                                        class265.field4193 = false;
                                    } else {
                                        class160.method1126(81, var202);
                                    }
                                    class244.field3900 = var202;
                                }
                                class246.method1760((byte) 97, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6020) {
                                var9--;
                                int var203 = class140.field2159[var9];
                                if (var203 < 0) {
                                    var203 = 0;
                                }
                                if (var203 > 127) {
                                    var203 = 127;
                                }
                                class225.field3606 = var203;
                                class246.method1760((byte) 116, class138.field2065);
                                class36.field552 = false;
                                continue;
                            }
                            if (var485 == 6021) {
                                var9--;
                                class268.field4318 = class140.field2159[var9] == 1;
                                class265.method1874(-125);
                                continue;
                            }
                        } else if (var485 < 6200) {
                            if (var485 == 6101) {
                                class140.field2159[var9++] = class262.field4171;
                                continue;
                            }
                            if (var485 == 6102) {
                                class140.field2159[var9++] = class75.method553(23987) ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6103) {
                                class140.field2159[var9++] = class33.field499 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6105) {
                                class140.field2159[var9++] = class296.field4778 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6106) {
                                class140.field2159[var9++] = class81.field1200 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6107) {
                                class140.field2159[var9++] = class207.field3359 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6108) {
                                class140.field2159[var9++] = class14.field181 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6109) {
                                class140.field2159[var9++] = class241.field3863 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6110) {
                                class140.field2159[var9++] = class46.field722 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6111) {
                                class140.field2159[var9++] = class152.field2419;
                                continue;
                            }
                            if (var485 == 6112) {
                                class140.field2159[var9++] = class66.field1006 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6114) {
                                class140.field2159[var9++] = class27.field393 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6115) {
                                class140.field2159[var9++] = class296.field4787 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6116) {
                                class140.field2159[var9++] = class285.field4641;
                                continue;
                            }
                            if (var485 == 6117) {
                                class140.field2159[var9++] = class235.field3760 ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6118) {
                                class140.field2159[var9++] = class1.field3;
                                continue;
                            }
                            if (var485 == 6119) {
                                class140.field2159[var9++] = class244.field3900;
                                continue;
                            }
                            if (var485 == 6120) {
                                class140.field2159[var9++] = class225.field3606;
                                continue;
                            }
                            if (var485 == 6121) {
                                if (class166.field2625) {
                                    class140.field2159[var9++] = class166.field2647 ? 1 : 0;
                                } else {
                                    class140.field2159[var9++] = 0;
                                }
                                continue;
                            }
                        } else if (var485 < 6300) {
                            if (var485 == 6200) {
                                var9 -= 2;
                                class13.field158 = (short) class140.field2159[var9];
                                if (class13.field158 <= 0) {
                                    class13.field158 = 256;
                                }
                                class142.field2178 = (short) class140.field2159[var9 + 1];
                                if (class142.field2178 <= 0) {
                                    class142.field2178 = 205;
                                }
                                continue;
                            }
                            if (var485 == 6201) {
                                var9 -= 2;
                                class14.field177 = (short) class140.field2159[var9];
                                if (class14.field177 <= 0) {
                                    class14.field177 = 256;
                                }
                                class206.field3334 = (short) class140.field2159[var9 + 1];
                                if (class206.field3334 <= 0) {
                                    class206.field3334 = 320;
                                }
                                continue;
                            }
                            if (var485 == 6202) {
                                var9 -= 4;
                                class88.field1301 = (short) class140.field2159[var9];
                                if (class88.field1301 <= 0) {
                                    class88.field1301 = 1;
                                }
                                class292.field4734 = (short) class140.field2159[var9 + 1];
                                if (class292.field4734 <= 0) {
                                    class292.field4734 = 32767;
                                } else if (class88.field1301 > class292.field4734) {
                                    class292.field4734 = class88.field1301;
                                }
                                class1.field6 = (short) class140.field2159[var9 + 2];
                                if (class1.field6 <= 0) {
                                    class1.field6 = 1;
                                }
                                class204.field3293 = (short) class140.field2159[var9 + 3];
                                if (class204.field3293 <= 0) {
                                    class204.field3293 = 32767;
                                } else if (class204.field3293 < class1.field6) {
                                    class204.field3293 = class1.field6;
                                }
                                continue;
                            }
                            if (var485 == 6203) {
                                class152.method1056(0, false, class186.field3039.field4936, (byte) -86, 0, class186.field3039.field4949);
                                class140.field2159[var9++] = class22.field344;
                                class140.field2159[var9++] = class139.field2142;
                                continue;
                            }
                            if (var485 == 6204) {
                                class140.field2159[var9++] = class14.field177;
                                class140.field2159[var9++] = class206.field3334;
                                continue;
                            }
                            if (var485 == 6205) {
                                class140.field2159[var9++] = class13.field158;
                                class140.field2159[var9++] = class142.field2178;
                                continue;
                            }
                        } else if (var485 < 6400) {
                            if (var485 == 6300) {
                                class140.field2159[var9++] = (int) (class247.method1762(19166) / 60000L);
                                continue;
                            }
                            if (var485 == 6301) {
                                class140.field2159[var9++] = (int) (class247.method1762(19166) / 86400000L) - 11745;
                                continue;
                            }
                            if (var485 == 6302) {
                                var9 -= 3;
                                int var216 = class140.field2159[var9];
                                int var217 = class140.field2159[var9 + 2];
                                int var218 = class140.field2159[var9 + 1];
                                class93.field1369.clear();
                                class93.field1369.set(11, 12);
                                class93.field1369.set(var217, var218, var216);
                                class140.field2159[var9++] = (int) (class93.field1369.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var485 == 6303) {
                                class93.field1369.clear();
                                class93.field1369.setTime(new Date(class247.method1762(19166)));
                                class140.field2159[var9++] = class93.field1369.get(1);
                                continue;
                            }
                            if (var485 == 6304) {
                                var9--;
                                int var219 = class140.field2159[var9];
                                boolean var220 = true;
                                if (var219 < 0) {
                                    var220 = ((var219 + 1) % 4) == 0;
                                } else if (var219 < 1582) {
                                    var220 = var219 % 4 == 0;
                                } else if (var219 % 4 != 0) {
                                    var220 = false;
                                } else if ((var219 % 100) != 0) {
                                    var220 = true;
                                } else if (var219 % 400 != 0) {
                                    var220 = false;
                                }
                                class140.field2159[var9++] = var220 ? 1 : 0;
                                continue;
                            }
                        } else if (var485 < 6500) {
                            if (var485 == 6405) {
                                class140.field2159[var9++] = class101.method704(10) ? 1 : 0;
                                continue;
                            }
                            if (var485 == 6406) {
                                class140.field2159[var9++] = class255.method1812(0) ? 1 : 0;
                                continue;
                            }
                        } else if (var485 < 6600) {
                            if (var485 == 6500) {
                                if (class94.field1377 == 10 && class32.field485 == 0 && class259.field4132 == 0 && class32.field479 == 0) {
                                    class140.field2159[var9++] = class28.method183(-1) == -1 ? 0 : 1;
                                    continue;
                                }
                                class140.field2159[var9++] = 1;
                                continue;
                            }
                            if (var485 == 6501) {
                                class79 var204 = class228.method1631(108);
                                if (var204 == null) {
                                    class140.field2159[var9++] = -1;
                                    class140.field2159[var9++] = 0;
                                    class301.field4877[var6++] = class169.field2690;
                                    class140.field2159[var9++] = 0;
                                    class301.field4877[var6++] = class169.field2690;
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = var204.field1168;
                                    class140.field2159[var9++] = var204.field3114;
                                    class301.field4877[var6++] = var204.field1160;
                                    class156 var205 = var204.method570(0);
                                    class140.field2159[var9++] = var205.field2463;
                                    class301.field4877[var6++] = var205.field2470;
                                    class140.field2159[var9++] = var204.field3116;
                                }
                                continue;
                            }
                            if (var485 == 6502) {
                                class79 var206 = class60.method424((byte) 21);
                                if (var206 == null) {
                                    class140.field2159[var9++] = -1;
                                    class140.field2159[var9++] = 0;
                                    class301.field4877[var6++] = class169.field2690;
                                    class140.field2159[var9++] = 0;
                                    class301.field4877[var6++] = class169.field2690;
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = var206.field1168;
                                    class140.field2159[var9++] = var206.field3114;
                                    class301.field4877[var6++] = var206.field1160;
                                    class156 var207 = var206.method570(0);
                                    class140.field2159[var9++] = var207.field2463;
                                    class301.field4877[var6++] = var207.field2470;
                                    class140.field2159[var9++] = var206.field3116;
                                }
                                continue;
                            }
                            if (var485 == 6503) {
                                var9--;
                                int var208 = class140.field2159[var9];
                                if (class94.field1377 == 10 && class32.field485 == 0 && class259.field4132 == 0 && class32.field479 == 0) {
                                    class140.field2159[var9++] = class281.method1981(0, var208) ? 1 : 0;
                                    continue;
                                }
                                class140.field2159[var9++] = 0;
                                continue;
                            }
                            if (var485 == 6504) {
                                var9--;
                                class178.field2888 = class140.field2159[var9];
                                class246.method1760((byte) 111, class138.field2065);
                                continue;
                            }
                            if (var485 == 6505) {
                                class140.field2159[var9++] = class178.field2888;
                                continue;
                            }
                            if (var485 == 6506) {
                                var9--;
                                int var209 = class140.field2159[var9];
                                class79 var210 = class116.method827((byte) 104, var209);
                                if (var210 == null) {
                                    class140.field2159[var9++] = -1;
                                    class301.field4877[var6++] = class169.field2690;
                                    class140.field2159[var9++] = 0;
                                    class301.field4877[var6++] = class169.field2690;
                                    class140.field2159[var9++] = 0;
                                } else {
                                    class140.field2159[var9++] = var210.field3114;
                                    class301.field4877[var6++] = var210.field1160;
                                    class156 var211 = var210.method570(0);
                                    class140.field2159[var9++] = var211.field2463;
                                    class301.field4877[var6++] = var211.field2470;
                                    class140.field2159[var9++] = var210.field3116;
                                }
                                continue;
                            }
                            if (var485 == 6507) {
                                var9 -= 4;
                                int var212 = class140.field2159[var9];
                                boolean var213 = class140.field2159[var9 + 1] == 1;
                                int var214 = class140.field2159[var9 + 2];
                                boolean var215 = class140.field2159[var9 + 3] == 1;
                                class296.method2044(92, var214, var213, var212, var215);
                                continue;
                            }
                        }
                    } else {
                        class302 var450;
                        if (var485 < 2000) {
                            var450 = var46 ? class315.field5314 : class86.field1254;
                        } else {
                            var9--;
                            var450 = class165.method1157(false, class140.field2159[var9]);
                            var485 -= 1000;
                        }
                        if (var485 == 1300) {
                            var9--;
                            int var451 = class140.field2159[var9] - 1;
                            if (var451 >= 0 && var451 <= 9) {
                                var6--;
                                var450.method2081(class301.field4877[var6], -63, var451);
                                continue;
                            }
                            var6--;
                            continue;
                        }
                        if (var485 == 1301) {
                            var9 -= 2;
                            int var452 = class140.field2159[var9];
                            int var453 = class140.field2159[var9 + 1];
                            var450.field5052 = class79.method567(-121, var452, var453);
                            continue;
                        }
                        if (var485 == 1302) {
                            var9--;
                            var450.field4903 = class140.field2159[var9] == 1;
                            continue;
                        }
                        if (var485 == 1303) {
                            var9--;
                            var450.field4908 = class140.field2159[var9];
                            continue;
                        }
                        if (var485 == 1304) {
                            var9--;
                            var450.field5044 = class140.field2159[var9];
                            continue;
                        }
                        if (var485 == 1305) {
                            var6--;
                            var450.field4945 = class301.field4877[var6];
                            continue;
                        }
                        if (var485 == 1306) {
                            var6--;
                            var450.field5020 = class301.field4877[var6];
                            continue;
                        }
                        if (var485 == 1307) {
                            var450.field5040 = null;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var484) {
            if (var5.field2056 == null) {
                if (class51.field774 != 0) {
                    class262.method1843(class313.field5285, 0, class169.field2690, 76);
                }
                class104.method719("CS2 - scr:" + var5.field844 + " op:" + var11, var484, !arg1);
            } else {
                class41 var480 = class230.method1645(30, (byte) -122);
                var480.method266(class305.field5080, 0).method266(var5.field2056, 0);
                for (int var481 = class246.field3952 - 1; var481 >= 0; var481--) {
                    var480.method266(class101.field1446, 0).method266(class285.field4643[var481].field4179.field2056, 0);
                }
                if (var11 == 40) {
                    int var482 = var10[var7];
                    var480.method266(class130.field1955, 0).method266(class1.method4(var482, (byte) 99), 0);
                }
                if (class51.field774 != 0) {
                    class262.method1843(class187.method1346(new class41[] { class225.field3594, var5.field2056 }, 0), 0, class169.field2690, 79);
                }
                class104.method719("CS2 - scr:" + var5.field844 + " op:" + var11 + new String(var480.method317(!arg1)), var484, false);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I[B)V", line = 5938)
    public class9(int arg0, byte[] arg1) {
        this.field120 = arg0;
        class112 var3 = new class112(arg1);
        this.field115 = var3.method792(2);
        this.field125 = new boolean[this.field115];
        this.field116 = new int[this.field115];
        this.field123 = new int[this.field115][];
        for (int var4 = 0; var4 < this.field115; var4++) {
            this.field116[var4] = var3.method792(2);
        }
        for (int var5 = 0; var5 < this.field115; var5++) {
            this.field125[var5] = var3.method792(2) == 1;
        }
        for (int var6 = 0; var6 < this.field115; var6++) {
            this.field123[var6] = new int[var3.method792(2)];
        }
        for (int var7 = 0; var7 < this.field115; var7++) {
            for (int var8 = 0; var8 < this.field123[var7].length; var8++) {
                this.field123[var7][var8] = var3.method792(2);
            }
        }
    }
}
