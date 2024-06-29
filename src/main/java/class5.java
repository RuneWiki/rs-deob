import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[[I")
    private int[][] field67;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Ldj;")
    private static class44 field61 = class89.method650(255, "skill)2");

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Ldj;")
    public static class44 field69 = field61;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Ldj;")
    public static class44 field72 = class89.method650(255, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Ldj;")
    public static class44 field75 = null;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field60 = 0;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lwc;")
    public static class233 field78;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I")
    public final int method30(int arg0, byte arg1) {
        if (arg1 != 43) {
            field75 = null;
        }
        field62++;
        if (this.field67 != null) {
            arg0 = (int) ((long) this.field73 * (long) arg0 / (long) this.field65) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method31(byte arg0) {
        if (arg0 > -29) {
            field61 = null;
        }
        field61 = null;
        field72 = null;
        field69 = null;
        field75 = null;
        field78 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILmi;)V")
    public static final void method32(int arg0, int arg1, class140 arg2) {
        field64++;
        Object[] var3 = arg2.field2506;
        int var4 = (Integer) var3[0];
        class117 var5 = class152.method983(-126, var4);
        if (var5 == null) {
            return;
        }
        if (arg1 < 10) {
            field61 = null;
        }
        class118.field2108 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field2096;
        int[] var10 = var5.field2091;
        byte var11 = -1;
        try {
            class158.field2746 = new class44[var5.field2098];
            int var12 = 0;
            class103.field1880 = new int[var5.field2082];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field2505;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field2503;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field2507 == null ? -1 : arg2.field2507.field4040;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field2504;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field2507 == null ? -1 : arg2.field2507.field4085;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field2518 == null ? -1 : arg2.field2518.field4040;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field2518 == null ? -1 : arg2.field2518.field4085;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field2513;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field2515;
                    }
                    class103.field1880[var12++] = var16;
                } else if (var3[var14] instanceof class44) {
                    class44 var15 = (class44) var3[var14];
                    if (var15.method314(class39.field730, -34)) {
                        var15 = arg2.field2509;
                    }
                    class158.field2746[var13++] = var15;
                }
            }
            int var17 = 0;
            label2420: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var365 = var9[var8];
                if (var365 < 100) {
                    if (var365 == 0) {
                        class39.field745[var6++] = var10[var8];
                        continue;
                    }
                    if (var365 == 1) {
                        int var18 = var10[var8];
                        class39.field745[var6++] = class136.field2435[var18];
                        continue;
                    }
                    if (var365 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class136.field2435[var19] = class39.field745[var6];
                        continue;
                    }
                    if (var365 == 3) {
                        class103.field1876[var7++] = var5.field2084[var8];
                        continue;
                    }
                    if (var365 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var365 == 7) {
                        var6 -= 2;
                        if (class39.field745[var6 + 1] != class39.field745[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 8) {
                        var6 -= 2;
                        if (class39.field745[var6 + 1] == class39.field745[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 9) {
                        var6 -= 2;
                        if (class39.field745[var6 + 1] > class39.field745[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 10) {
                        var6 -= 2;
                        if (class39.field745[var6] > class39.field745[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 21) {
                        if (class118.field2108 == 0) {
                            return;
                        }
                        class158 var20 = class208.field3734[--class118.field2108];
                        var5 = var20.field2756;
                        var9 = var5.field2096;
                        var10 = var5.field2091;
                        class158.field2746 = var20.field2745;
                        class103.field1880 = var20.field2757;
                        var8 = var20.field2750;
                        continue;
                    }
                    if (var365 == 25) {
                        int var21 = var10[var8];
                        class39.field745[var6++] = class47.method350(95, var21);
                        continue;
                    }
                    if (var365 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class105.method766(var22, class39.field745[var6], (byte) 6);
                        continue;
                    }
                    if (var365 == 31) {
                        var6 -= 2;
                        if (class39.field745[var6] <= class39.field745[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 32) {
                        var6 -= 2;
                        if (class39.field745[var6] >= class39.field745[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 33) {
                        class39.field745[var6++] = class103.field1880[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var365 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class103.field1880[var10001] = class39.field745[var6];
                        continue;
                    }
                    if (var365 == 35) {
                        class103.field1876[var7++] = class158.field2746[var10[var8]];
                        continue;
                    }
                    if (var365 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class158.field2746[var10001] = class103.field1876[var7];
                        continue;
                    }
                    if (var365 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class44 var24 = class166.method1059(-24702, var23, class103.field1876, var7);
                        class103.field1876[var7++] = var24;
                        continue;
                    }
                    if (var365 == 38) {
                        var6--;
                        continue;
                    }
                    if (var365 == 39) {
                        var7--;
                        continue;
                    }
                    if (var365 == 40) {
                        int var25 = var10[var8];
                        class117 var26 = class152.method983(11, var25);
                        class44[] var27 = new class44[var26.field2098];
                        int[] var28 = new int[var26.field2082];
                        for (int var29 = 0; var29 < var26.field2083; var29++) {
                            var28[var29] = class39.field745[var6 + var29 - var26.field2083];
                        }
                        for (int var30 = 0; var30 < var26.field2081; var30++) {
                            var27[var30] = class103.field1876[var7 + var30 - var26.field2081];
                        }
                        var7 -= var26.field2081;
                        var6 -= var26.field2083;
                        class158 var31 = new class158();
                        var31.field2750 = var8;
                        var31.field2745 = class158.field2746;
                        var31.field2757 = class103.field1880;
                        var31.field2756 = var5;
                        if (class118.field2108 >= class208.field3734.length) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        var5 = var26;
                        class208.field3734[class118.field2108++] = var31;
                        var9 = var26.field2096;
                        class158.field2746 = var27;
                        var10 = var26.field2091;
                        class103.field1880 = var28;
                        continue;
                    }
                    if (var365 == 42) {
                        class39.field745[var6++] = class27.field488[var10[var8]];
                        continue;
                    }
                    if (var365 == 43) {
                        var10001 = var10[var8];
                        var6--;
                        class27.field488[var10001] = class39.field745[var6];
                        continue;
                    }
                    if (var365 == 44) {
                        int var32 = var10[var8] >> 16;
                        int var33 = var10[var8] & 0xFFFF;
                        var6--;
                        int var34 = class39.field745[var6];
                        if (var34 >= 0 && var34 <= 5000) {
                            byte var35 = -1;
                            if (var33 == 105) {
                                var35 = 0;
                            }
                            class48.field900[var32] = var34;
                            int var36 = 0;
                            while (true) {
                                if (var34 <= var36) {
                                    continue label2420;
                                }
                                class112.field2020[var32][var36] = var35;
                                var36++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 45) {
                        var6--;
                        int var37 = class39.field745[var6];
                        int var38 = var10[var8];
                        if (var37 >= 0 && class48.field900[var38] > var37) {
                            class39.field745[var6++] = class112.field2020[var38][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 46) {
                        var6 -= 2;
                        int var39 = var10[var8];
                        int var40 = class39.field745[var6];
                        if (var40 >= 0 && var40 < class48.field900[var39]) {
                            class112.field2020[var39][var40] = class39.field745[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 47) {
                        class44 var41 = class95.field1762[var10[var8]];
                        if (var41 == null) {
                            var41 = class95.field1768;
                        }
                        class103.field1876[var7++] = var41;
                        continue;
                    }
                    if (var365 == 48) {
                        var10001 = var10[var8];
                        var7--;
                        class95.field1762[var10001] = class103.field1876[var7];
                        continue;
                    }
                    if (var365 == 51) {
                        class120 var42 = var5.field2093[var10[var8]];
                        var6--;
                        class222 var43 = (class222) var42.method828((long) class39.field745[var6], (byte) -40);
                        if (var43 != null) {
                            var8 += var43.field4014;
                        }
                        continue;
                    }
                }
                boolean var44;
                if (var10[var8] == 1) {
                    var44 = true;
                } else {
                    var44 = false;
                }
                if (var365 < 300) {
                    if (var365 == 100) {
                        var6 -= 3;
                        int var45 = class39.field745[var6];
                        int var46 = class39.field745[var6 + 1];
                        int var47 = class39.field745[var6 + 2];
                        if (var46 == 0) {
                            throw new RuntimeException();
                        }
                        class223 var48 = class213.method1379(var45, -10051);
                        if (var48.field4169 == null) {
                            var48.field4169 = new class223[var47 + 1];
                        }
                        if (var48.field4169.length <= var47) {
                            class223[] var49 = new class223[var47 + 1];
                            for (int var50 = 0; var50 < var48.field4169.length; var50++) {
                                var49[var50] = var48.field4169[var50];
                            }
                            var48.field4169 = var49;
                        }
                        if (var47 > 0 && var48.field4169[var47 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var47 - 1));
                        }
                        class223 var51 = new class223();
                        var51.field4076 = var46;
                        var51.field4170 = var51.field4040 = var48.field4040;
                        var51.field4118 = true;
                        var51.field4085 = var47;
                        var48.field4169[var47] = var51;
                        if (var44) {
                            class31.field547 = var51;
                        } else {
                            class223.field4063 = var51;
                        }
                        class225.method1457(-92, var48);
                        continue;
                    }
                    if (var365 == 101) {
                        class223 var52 = var44 ? class31.field547 : class223.field4063;
                        if (var52.field4085 == -1) {
                            if (!var44) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class223 var53 = class213.method1379(var52.field4040, -10051);
                        var53.field4169[var52.field4085] = null;
                        class225.method1457(106, var53);
                        continue;
                    }
                    if (var365 == 102) {
                        var6--;
                        class223 var54 = class213.method1379(class39.field745[var6], -10051);
                        var54.field4169 = null;
                        class225.method1457(74, var54);
                        continue;
                    }
                    if (var365 == 200) {
                        var6 -= 2;
                        int var55 = class39.field745[var6];
                        int var56 = class39.field745[var6 + 1];
                        class223 var57 = class96.method678(true, var55, var56);
                        if (var57 != null && var56 != -1) {
                            class39.field745[var6++] = 1;
                            if (var44) {
                                class31.field547 = var57;
                            } else {
                                class223.field4063 = var57;
                            }
                            continue;
                        }
                        class39.field745[var6++] = 0;
                        continue;
                    }
                    if (var365 == 201) {
                        var6--;
                        int var58 = class39.field745[var6];
                        class223 var59 = class213.method1379(var58, -10051);
                        if (var59 == null) {
                            class39.field745[var6++] = 0;
                        } else {
                            class39.field745[var6++] = 1;
                            if (var44) {
                                class31.field547 = var59;
                            } else {
                                class223.field4063 = var59;
                            }
                        }
                        continue;
                    }
                } else if (var365 < 500) {
                    if (var365 == 403) {
                        var6 -= 2;
                        int var60 = class39.field745[var6];
                        if (var60 >= 7) {
                            var60 -= 7;
                        }
                        int var61 = class39.field745[var6 + 1];
                        class96.field1774.field407.method245(var61, var60, (byte) -83);
                        continue;
                    }
                    if (var365 == 404) {
                        var6 -= 2;
                        int var62 = class39.field745[var6];
                        int var63 = class39.field745[var6 + 1];
                        class96.field1774.field407.method252(var62, 265199749, var63);
                        continue;
                    }
                    if (var365 == 410) {
                        var6--;
                        boolean var64 = class39.field745[var6] != 0;
                        class96.field1774.field407.method251(var64, -1001308768);
                        continue;
                    }
                } else if (var365 >= 1000 && var365 < 1100 || var365 >= 2000 && var365 < 2100) {
                    class223 var65;
                    if (var365 < 2000) {
                        var65 = var44 ? class31.field547 : class223.field4063;
                    } else {
                        var6--;
                        var65 = class213.method1379(class39.field745[var6], -10051);
                        var365 -= 1000;
                    }
                    if (var365 == 1000) {
                        var65.field4142 = 0;
                        var6 -= 2;
                        var65.field4039 = var65.field4059 = class39.field745[var6];
                        var65.field4110 = 0;
                        var65.field4043 = var65.field4163 = class39.field745[var6 + 1];
                        class225.method1457(-84, var65);
                        continue;
                    }
                    if (var365 == 1001) {
                        var6 -= 2;
                        var65.field4140 = 0;
                        var65.field4130 = var65.field4136 = class39.field745[var6];
                        var65.field4056 = 0;
                        var65.field4037 = 0;
                        var65.field4134 = var65.field4158 = class39.field745[var6 + 1];
                        var65.field4144 = 0;
                        class225.method1457(76, var65);
                        if (var65.field4076 == 0) {
                            class116.method818((byte) 76, var65);
                        }
                        continue;
                    }
                    if (var365 == 1003) {
                        var6--;
                        boolean var66 = class39.field745[var6] == 1;
                        if (var65.field4173 != var66) {
                            var65.field4173 = var66;
                            class225.method1457(127, var65);
                        }
                        continue;
                    }
                } else if (var365 >= 1100 && var365 < 1200 || !(var365 < 2100 || var365 >= 2200)) {
                    class223 var357;
                    if (var365 >= 2000) {
                        var6--;
                        var357 = class213.method1379(class39.field745[var6], -10051);
                        var365 -= 1000;
                    } else {
                        var357 = var44 ? class31.field547 : class223.field4063;
                    }
                    if (var365 == 1100) {
                        var6 -= 2;
                        var357.field4132 = class39.field745[var6];
                        if (var357.field4067 - var357.field4130 < var357.field4132) {
                            var357.field4132 = var357.field4067 - var357.field4130;
                        }
                        if (var357.field4132 < 0) {
                            var357.field4132 = 0;
                        }
                        var357.field4026 = class39.field745[var6 + 1];
                        if (var357.field4026 > var357.field4025 - var357.field4134) {
                            var357.field4026 = var357.field4025 - var357.field4134;
                        }
                        if (var357.field4026 < 0) {
                            var357.field4026 = 0;
                        }
                        class225.method1457(-82, var357);
                        continue;
                    }
                    if (var365 == 1101) {
                        var6--;
                        var357.field4080 = class39.field745[var6];
                        class225.method1457(-117, var357);
                        continue;
                    }
                    if (var365 == 1102) {
                        var6--;
                        var357.field4091 = class39.field745[var6] == 1;
                        class225.method1457(-65, var357);
                        continue;
                    }
                    if (var365 == 1103) {
                        var6--;
                        var357.field4102 = class39.field745[var6];
                        class225.method1457(99, var357);
                        continue;
                    }
                    if (var365 == 1104) {
                        var6--;
                        var357.field4143 = class39.field745[var6];
                        class225.method1457(88, var357);
                        continue;
                    }
                    if (var365 == 1105) {
                        var6--;
                        var357.field4046 = class39.field745[var6];
                        class225.method1457(87, var357);
                        continue;
                    }
                    if (var365 == 1106) {
                        var6--;
                        var357.field4079 = class39.field745[var6];
                        class225.method1457(-87, var357);
                        continue;
                    }
                    if (var365 == 1107) {
                        var6--;
                        var357.field4171 = class39.field745[var6] == 1;
                        class225.method1457(96, var357);
                        continue;
                    }
                    if (var365 == 1108) {
                        var357.field4052 = 1;
                        var6--;
                        var357.field4050 = class39.field745[var6];
                        class225.method1457(76, var357);
                        continue;
                    }
                    if (var365 == 1109) {
                        var6 -= 6;
                        var357.field4094 = class39.field745[var6];
                        var357.field4077 = class39.field745[var6 + 1];
                        var357.field4036 = class39.field745[var6 + 2];
                        var357.field4081 = class39.field745[var6 + 3];
                        var357.field4133 = class39.field745[var6 + 4];
                        var357.field4135 = class39.field745[var6 + 5];
                        class225.method1457(-72, var357);
                        continue;
                    }
                    if (var365 == 1110) {
                        var6--;
                        int var358 = class39.field745[var6];
                        if (var357.field4105 != var358) {
                            var357.field4105 = var358;
                            var357.field4096 = 0;
                            var357.field4044 = 0;
                            class225.method1457(-84, var357);
                        }
                        continue;
                    }
                    if (var365 == 1111) {
                        var6--;
                        var357.field4042 = class39.field745[var6] == 1;
                        class225.method1457(-100, var357);
                        continue;
                    }
                    if (var365 == 1112) {
                        var7--;
                        class44 var359 = class103.field1876[var7];
                        if (!var359.method314(var357.field4071, -59)) {
                            var357.field4071 = var359;
                            class225.method1457(-55, var357);
                        }
                        continue;
                    }
                    if (var365 == 1113) {
                        var6--;
                        var357.field4103 = class39.field745[var6];
                        class225.method1457(83, var357);
                        continue;
                    }
                    if (var365 == 1114) {
                        var6 -= 3;
                        var357.field4099 = class39.field745[var6];
                        var357.field4021 = class39.field745[var6 + 1];
                        var357.field4073 = class39.field745[var6 + 2];
                        class225.method1457(-116, var357);
                        continue;
                    }
                    if (var365 == 1115) {
                        var6--;
                        var357.field4121 = class39.field745[var6] == 1;
                        class225.method1457(102, var357);
                        continue;
                    }
                    if (var365 == 1116) {
                        var6--;
                        var357.field4104 = class39.field745[var6];
                        class225.method1457(123, var357);
                        continue;
                    }
                    if (var365 == 1117) {
                        var6--;
                        var357.field4122 = class39.field745[var6];
                        class225.method1457(-100, var357);
                        continue;
                    }
                    if (var365 == 1118) {
                        var6--;
                        var357.field4083 = class39.field745[var6] == 1;
                        class225.method1457(-113, var357);
                        continue;
                    }
                    if (var365 == 1119) {
                        var6--;
                        var357.field4074 = class39.field745[var6] == 1;
                        class225.method1457(-104, var357);
                        continue;
                    }
                    if (var365 == 1120) {
                        var6 -= 2;
                        var357.field4067 = class39.field745[var6];
                        var357.field4025 = class39.field745[var6 + 1];
                        class225.method1457(-69, var357);
                        if (var357.field4076 == 0) {
                            class116.method818((byte) 48, var357);
                        }
                        continue;
                    }
                } else if (var365 >= 1200 && var365 < 1300 || !(var365 < 2200 || var365 >= 2300)) {
                    class223 var67;
                    if (var365 >= 2000) {
                        var6--;
                        var67 = class213.method1379(class39.field745[var6], -10051);
                        var365 -= 1000;
                    } else {
                        var67 = var44 ? class31.field547 : class223.field4063;
                    }
                    class225.method1457(98, var67);
                    if (var365 == 1200 || var365 == 1205) {
                        var6 -= 2;
                        int var68 = class39.field745[var6 + 1];
                        int var69 = class39.field745[var6];
                        if (var69 == -1) {
                            var67.field4052 = 1;
                            var67.field4078 = -1;
                            var67.field4050 = -1;
                        } else {
                            var67.field4024 = var68;
                            var67.field4078 = var69;
                            class214 var70 = class192.method1227(-31700, var69);
                            var67.field4081 = var70.field3846;
                            var67.field4094 = var70.field3856;
                            if (var365 == 1205) {
                                var67.field4164 = false;
                            } else {
                                var67.field4164 = true;
                            }
                            var67.field4135 = var70.field3892;
                            var67.field4133 = var70.field3890;
                            var67.field4077 = var70.field3850;
                            if (var67.field4037 > 0) {
                                var67.field4135 = var67.field4135 * 32 / var67.field4037;
                            } else if (var67.field4136 > 0) {
                                var67.field4135 = var67.field4135 * 32 / var67.field4136;
                            }
                            var67.field4036 = var70.field3877;
                        }
                        continue;
                    }
                    if (var365 == 1201) {
                        var67.field4052 = 2;
                        var6--;
                        var67.field4050 = class39.field745[var6];
                        continue;
                    }
                    if (var365 == 1202) {
                        var67.field4052 = 3;
                        var67.field4050 = class96.field1774.field407.method249((byte) 28);
                        continue;
                    }
                    if (var365 == 1203) {
                        var67.field4052 = 6;
                        var6--;
                        var67.field4050 = class39.field745[var6];
                        continue;
                    }
                    if (var365 == 1204) {
                        var67.field4052 = 5;
                        var6--;
                        var67.field4050 = class39.field745[var6];
                        continue;
                    }
                } else if (var365 >= 1300 && var365 < 1400 || var365 >= 2300 && var365 < 2400) {
                    class223 var71;
                    if (var365 >= 2000) {
                        var6--;
                        var71 = class213.method1379(class39.field745[var6], -10051);
                        var365 -= 1000;
                    } else {
                        var71 = var44 ? class31.field547 : class223.field4063;
                    }
                    if (var365 == 1300) {
                        var6--;
                        int var72 = class39.field745[var6] - 1;
                        if (var72 >= 0 && var72 <= 9) {
                            var7--;
                            var71.method1441(var72, class103.field1876[var7], -125);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var365 == 1301) {
                        var6 -= 2;
                        int var73 = class39.field745[var6];
                        int var74 = class39.field745[var6 + 1];
                        var71.field4148 = class96.method678(true, var73, var74);
                        continue;
                    }
                    if (var365 == 1302) {
                        var6--;
                        var71.field4114 = class39.field745[var6] == 1;
                        continue;
                    }
                    if (var365 == 1303) {
                        var6--;
                        var71.field4066 = class39.field745[var6];
                        continue;
                    }
                    if (var365 == 1304) {
                        var6--;
                        var71.field4070 = class39.field745[var6];
                        continue;
                    }
                    if (var365 == 1305) {
                        var7--;
                        var71.field4127 = class103.field1876[var7];
                        continue;
                    }
                    if (var365 == 1306) {
                        var7--;
                        var71.field4120 = class103.field1876[var7];
                        continue;
                    }
                    if (var365 == 1307) {
                        var71.field4051 = null;
                        continue;
                    }
                } else {
                    if (var365 >= 1400 && var365 < 1500 || var365 >= 2400 && var365 < 2500) {
                        class223 var350;
                        if (var365 >= 2000) {
                            var365 -= 1000;
                            var6--;
                            var350 = class213.method1379(class39.field745[var6], -10051);
                        } else {
                            var350 = var44 ? class31.field547 : class223.field4063;
                        }
                        var7--;
                        class44 var351 = class103.field1876[var7];
                        int[] var352 = null;
                        if (var351.method340(3) > 0 && var351.method302(-12540, var351.method340(3) - 1) == 89) {
                            var6--;
                            int var353 = class39.field745[var6];
                            if (var353 > 0) {
                                var352 = new int[var353];
                                while (var353-- > 0) {
                                    var6--;
                                    var352[var353] = class39.field745[var6];
                                }
                            }
                            var351 = var351.method318(125, var351.method340(3) - 1, 0);
                        }
                        Object[] var354 = new Object[var351.method340(3) + 1];
                        for (int var355 = var354.length - 1; var355 >= 1; var355--) {
                            if (var351.method302(-12540, var355 - 1) == 115) {
                                var7--;
                                var354[var355] = class103.field1876[var7];
                            } else {
                                var6--;
                                var354[var355] = Integer.valueOf(class39.field745[var6]);
                            }
                        }
                        var6--;
                        int var356 = class39.field745[var6];
                        if (var356 == -1) {
                            var354 = null;
                        } else {
                            var354[0] = Integer.valueOf(var356);
                        }
                        if (var365 == 1405) {
                            var350.field4057 = var354;
                        }
                        if (var365 == 1417) {
                            var350.field4031 = var354;
                        }
                        if (var365 == 1404) {
                            var350.field4069 = var354;
                        }
                        if (var365 == 1421) {
                            var350.field4154 = var354;
                        }
                        if (var365 == 1407) {
                            var350.field4159 = var352;
                            var350.field4029 = var354;
                        }
                        if (var365 == 1410) {
                            var350.field4088 = var354;
                        }
                        if (var365 == 1400) {
                            var350.field4129 = var354;
                        }
                        if (var365 == 1402) {
                            var350.field4131 = var354;
                        }
                        if (var365 == 1418) {
                            var350.field4054 = var354;
                        }
                        if (var365 == 1420) {
                            var350.field4049 = var354;
                        }
                        if (var365 == 1423) {
                            var350.field4041 = var354;
                        }
                        if (var365 == 1409) {
                            var350.field4095 = var354;
                        }
                        if (var365 == 1401) {
                            var350.field4032 = var354;
                        }
                        if (var365 == 1415) {
                            var350.field4167 = var352;
                            var350.field4082 = var354;
                        }
                        if (var365 == 1412) {
                            var350.field4084 = var354;
                        }
                        if (var365 == 1411) {
                            var350.field4152 = var354;
                        }
                        if (var365 == 1422) {
                            var350.field4172 = var354;
                        }
                        if (var365 == 1403) {
                            var350.field4113 = var354;
                        }
                        if (var365 == 1406) {
                            var350.field4097 = var354;
                        }
                        if (var365 == 1424) {
                            var350.field4048 = var354;
                        }
                        var350.field4125 = true;
                        if (var365 == 1414) {
                            var350.field4112 = var354;
                            var350.field4053 = var352;
                        }
                        if (var365 == 1425) {
                            var350.field4100 = var354;
                        }
                        if (var365 == 1416) {
                            var350.field4123 = var354;
                        }
                        if (var365 == 1419) {
                            var350.field4141 = var354;
                        }
                        if (var365 == 1408) {
                            var350.field4065 = var354;
                        }
                        continue;
                    }
                    if (var365 < 1600) {
                        class223 var349 = var44 ? class31.field547 : class223.field4063;
                        if (var365 == 1500) {
                            class39.field745[var6++] = var349.field4039;
                            continue;
                        }
                        if (var365 == 1501) {
                            class39.field745[var6++] = var349.field4043;
                            continue;
                        }
                        if (var365 == 1502) {
                            class39.field745[var6++] = var349.field4130;
                            continue;
                        }
                        if (var365 == 1503) {
                            class39.field745[var6++] = var349.field4134;
                            continue;
                        }
                        if (var365 == 1504) {
                            class39.field745[var6++] = var349.field4173 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 1505) {
                            class39.field745[var6++] = var349.field4170;
                            continue;
                        }
                    } else if (var365 < 1700) {
                        class223 var348 = var44 ? class31.field547 : class223.field4063;
                        if (var365 == 1600) {
                            class39.field745[var6++] = var348.field4132;
                            continue;
                        }
                        if (var365 == 1601) {
                            class39.field745[var6++] = var348.field4026;
                            continue;
                        }
                        if (var365 == 1602) {
                            class103.field1876[var7++] = var348.field4071;
                            continue;
                        }
                        if (var365 == 1603) {
                            class39.field745[var6++] = var348.field4067;
                            continue;
                        }
                        if (var365 == 1604) {
                            class39.field745[var6++] = var348.field4025;
                            continue;
                        }
                        if (var365 == 1605) {
                            class39.field745[var6++] = var348.field4135;
                            continue;
                        }
                        if (var365 == 1606) {
                            class39.field745[var6++] = var348.field4036;
                            continue;
                        }
                        if (var365 == 1607) {
                            class39.field745[var6++] = var348.field4133;
                            continue;
                        }
                        if (var365 == 1608) {
                            class39.field745[var6++] = var348.field4081;
                            continue;
                        }
                        if (var365 == 1609) {
                            class39.field745[var6++] = var348.field4102;
                            continue;
                        }
                    } else if (var365 < 1800) {
                        class223 var347 = var44 ? class31.field547 : class223.field4063;
                        if (var365 == 1700) {
                            class39.field745[var6++] = var347.field4078;
                            continue;
                        }
                        if (var365 == 1701) {
                            if (var347.field4078 == -1) {
                                class39.field745[var6++] = 0;
                            } else {
                                class39.field745[var6++] = var347.field4024;
                            }
                            continue;
                        }
                        if (var365 == 1702) {
                            class39.field745[var6++] = var347.field4085;
                            continue;
                        }
                    } else if (var365 < 1900) {
                        class223 var75 = var44 ? class31.field547 : class223.field4063;
                        if (var365 == 1800) {
                            class39.field745[var6++] = client.method228(class117.method821(var75, 21064), 17458);
                            continue;
                        }
                        if (var365 == 1801) {
                            var6--;
                            int var76 = class39.field745[var6];
                            int var366 = var76 - 1;
                            if (var75.field4051 != null && var75.field4051.length > var366 && var75.field4051[var366] != null) {
                                class103.field1876[var7++] = var75.field4051[var366];
                                continue;
                            }
                            class103.field1876[var7++] = client.field608;
                            continue;
                        }
                        if (var365 == 1802) {
                            if (var75.field4127 == null) {
                                class103.field1876[var7++] = client.field608;
                            } else {
                                class103.field1876[var7++] = var75.field4127;
                            }
                            continue;
                        }
                    } else if (var365 < 2600) {
                        var6--;
                        class223 var346 = class213.method1379(class39.field745[var6], -10051);
                        if (var365 == 2500) {
                            class39.field745[var6++] = var346.field4039;
                            continue;
                        }
                        if (var365 == 2501) {
                            class39.field745[var6++] = var346.field4043;
                            continue;
                        }
                        if (var365 == 2502) {
                            class39.field745[var6++] = var346.field4130;
                            continue;
                        }
                        if (var365 == 2503) {
                            class39.field745[var6++] = var346.field4134;
                            continue;
                        }
                        if (var365 == 2504) {
                            class39.field745[var6++] = var346.field4173 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 2505) {
                            class39.field745[var6++] = var346.field4170;
                            continue;
                        }
                    } else if (var365 < 2700) {
                        var6--;
                        class223 var345 = class213.method1379(class39.field745[var6], -10051);
                        if (var365 == 2600) {
                            class39.field745[var6++] = var345.field4132;
                            continue;
                        }
                        if (var365 == 2601) {
                            class39.field745[var6++] = var345.field4026;
                            continue;
                        }
                        if (var365 == 2602) {
                            class103.field1876[var7++] = var345.field4071;
                            continue;
                        }
                        if (var365 == 2603) {
                            class39.field745[var6++] = var345.field4067;
                            continue;
                        }
                        if (var365 == 2604) {
                            class39.field745[var6++] = var345.field4025;
                            continue;
                        }
                        if (var365 == 2605) {
                            class39.field745[var6++] = var345.field4135;
                            continue;
                        }
                        if (var365 == 2606) {
                            class39.field745[var6++] = var345.field4036;
                            continue;
                        }
                        if (var365 == 2607) {
                            class39.field745[var6++] = var345.field4133;
                            continue;
                        }
                        if (var365 == 2608) {
                            class39.field745[var6++] = var345.field4081;
                            continue;
                        }
                        if (var365 == 2609) {
                            class39.field745[var6++] = var345.field4102;
                            continue;
                        }
                    } else if (var365 < 2800) {
                        if (var365 == 2700) {
                            var6--;
                            class223 var77 = class213.method1379(class39.field745[var6], -10051);
                            class39.field745[var6++] = var77.field4078;
                            continue;
                        }
                        if (var365 == 2701) {
                            var6--;
                            class223 var78 = class213.method1379(class39.field745[var6], -10051);
                            if (var78.field4078 == -1) {
                                class39.field745[var6++] = 0;
                            } else {
                                class39.field745[var6++] = var78.field4024;
                            }
                            continue;
                        }
                        if (var365 == 2702) {
                            var6--;
                            int var79 = class39.field745[var6];
                            class104 var80 = (class104) class129.field2294.method828((long) var79, (byte) -40);
                            if (var80 == null) {
                                class39.field745[var6++] = 0;
                            } else {
                                class39.field745[var6++] = 1;
                            }
                            continue;
                        }
                        if (var365 == 2703) {
                            var6--;
                            class223 var81 = class213.method1379(class39.field745[var6], -10051);
                            if (var81.field4169 == null) {
                                class39.field745[var6++] = 0;
                                continue;
                            }
                            int var82 = var81.field4169.length;
                            for (int var83 = 0; var83 < var81.field4169.length; var83++) {
                                if (var81.field4169[var83] == null) {
                                    var82 = var83;
                                    break;
                                }
                            }
                            class39.field745[var6++] = var82;
                            continue;
                        }
                        if (var365 == 2704 || var365 == 2705) {
                            var6 -= 2;
                            int var84 = class39.field745[var6];
                            int var85 = class39.field745[var6 + 1];
                            class104 var86 = (class104) class129.field2294.method828((long) var84, (byte) -40);
                            if (var86 != null && var86.field1893 == var85) {
                                class39.field745[var6++] = 1;
                                continue;
                            }
                            class39.field745[var6++] = 0;
                            continue;
                        }
                    } else if (var365 < 2900) {
                        var6--;
                        class223 var87 = class213.method1379(class39.field745[var6], -10051);
                        if (var365 == 2800) {
                            class39.field745[var6++] = client.method228(class117.method821(var87, 21064), 17458);
                            continue;
                        }
                        if (var365 == 2801) {
                            var6--;
                            int var88 = class39.field745[var6];
                            int var367 = var88 - 1;
                            if (var87.field4051 != null && var87.field4051.length > var367 && var87.field4051[var367] != null) {
                                class103.field1876[var7++] = var87.field4051[var367];
                                continue;
                            }
                            class103.field1876[var7++] = client.field608;
                            continue;
                        }
                        if (var365 == 2802) {
                            if (var87.field4127 == null) {
                                class103.field1876[var7++] = client.field608;
                            } else {
                                class103.field1876[var7++] = var87.field4127;
                            }
                            continue;
                        }
                    } else if (var365 < 3200) {
                        if (var365 == 3100) {
                            var7--;
                            class44 var89 = class103.field1876[var7];
                            class226.method1484(var89, 0, 0, client.field608);
                            continue;
                        }
                        if (var365 == 3101) {
                            var6 -= 2;
                            class180.method1135(class96.field1774, class39.field745[var6 + 1], 98, class39.field745[var6]);
                            continue;
                        }
                        if (var365 == 3103) {
                            class170.method1081((byte) 117);
                            continue;
                        }
                        if (var365 == 3104) {
                            var7--;
                            class44 var90 = class103.field1876[var7];
                            int var91 = 0;
                            class7.field140++;
                            if (var90.method305(10)) {
                                var91 = var90.method331((byte) -83);
                            }
                            class200.field3542.method1170(181, (byte) -121);
                            class200.field3542.method489(var91, -57);
                            continue;
                        }
                        if (var365 == 3105) {
                            class190.field3290++;
                            var7--;
                            class44 var92 = class103.field1876[var7];
                            class200.field3542.method1170(25, (byte) -105);
                            class200.field3542.method536(var92.method306(-58), 85);
                            continue;
                        }
                        if (var365 == 3106) {
                            class103.field1891++;
                            var7--;
                            class44 var93 = class103.field1876[var7];
                            class200.field3542.method1170(13, (byte) -75);
                            class200.field3542.method488(122, var93.method340(3) + 1);
                            class200.field3542.method492(7527, var93);
                            continue;
                        }
                        if (var365 == 3107) {
                            var7--;
                            class44 var94 = class103.field1876[var7];
                            var6--;
                            int var95 = class39.field745[var6];
                            class188.method1168(var95, var94, 126);
                            continue;
                        }
                        if (var365 == 3108) {
                            var6 -= 3;
                            int var96 = class39.field745[var6 + 2];
                            int var97 = class39.field745[var6 + 1];
                            int var98 = class39.field745[var6];
                            class223 var99 = class213.method1379(var96, -10051);
                            class183.method1151(var98, var97, (byte) 63, var99);
                            continue;
                        }
                        if (var365 == 3109) {
                            var6 -= 2;
                            int var100 = class39.field745[var6];
                            int var101 = class39.field745[var6 + 1];
                            class223 var102 = var44 ? class31.field547 : class223.field4063;
                            class183.method1151(var100, var101, (byte) 122, var102);
                            continue;
                        }
                        if (var365 == 3110) {
                            class73.field1383++;
                            var6--;
                            int var103 = class39.field745[var6];
                            class200.field3542.method1170(44, (byte) -114);
                            class200.field3542.method510((byte) -93, var103);
                            continue;
                        }
                    } else if (var365 < 3300) {
                        if (var365 == 3200) {
                            var6 -= 3;
                            class66.method521(class39.field745[var6 + 2], -1, class39.field745[var6], class39.field745[var6 + 1]);
                            continue;
                        }
                        if (var365 == 3201) {
                            var6--;
                            class87.method644(0, class39.field745[var6]);
                            continue;
                        }
                        if (var365 == 3202) {
                            var6 -= 2;
                            class178.method1125(class39.field745[var6 + 1], 122, class39.field745[var6]);
                            continue;
                        }
                    } else if (var365 < 3400) {
                        if (var365 == 3300) {
                            class39.field745[var6++] = class46.field868;
                            continue;
                        }
                        if (var365 == 3301) {
                            var6 -= 2;
                            int var323 = class39.field745[var6 + 1];
                            int var324 = class39.field745[var6];
                            class39.field745[var6++] = class114.method804(false, var323, var324);
                            continue;
                        }
                        if (var365 == 3302) {
                            var6 -= 2;
                            int var325 = class39.field745[var6 + 1];
                            int var326 = class39.field745[var6];
                            class39.field745[var6++] = class27.method195(104, var325, var326);
                            continue;
                        }
                        if (var365 == 3303) {
                            var6 -= 2;
                            int var327 = class39.field745[var6];
                            int var328 = class39.field745[var6 + 1];
                            class39.field745[var6++] = class73.method568(var327, var328, 0);
                            continue;
                        }
                        if (var365 == 3304) {
                            var6--;
                            int var329 = class39.field745[var6];
                            class39.field745[var6++] = class237.method1539((byte) -52, var329).field325;
                            continue;
                        }
                        if (var365 == 3305) {
                            var6--;
                            int var330 = class39.field745[var6];
                            class39.field745[var6++] = class136.field2432[var330];
                            continue;
                        }
                        if (var365 == 3306) {
                            var6--;
                            int var331 = class39.field745[var6];
                            class39.field745[var6++] = class33.field584[var331];
                            continue;
                        }
                        if (var365 == 3307) {
                            var6--;
                            int var332 = class39.field745[var6];
                            class39.field745[var6++] = class156.field2716[var332];
                            continue;
                        }
                        if (var365 == 3308) {
                            int var333 = class194.field3403;
                            int var334 = (class96.field1774.field2195 >> 7) + class143.field2550;
                            int var335 = (class96.field1774.field2260 >> 7) + class222.field4020;
                            class39.field745[var6++] = (var333 << 28) + var334 + (var335 << 14);
                            continue;
                        }
                        if (var365 == 3309) {
                            var6--;
                            int var336 = class39.field745[var6];
                            class39.field745[var6++] = class29.method202(var336 >> 14, 16383);
                            continue;
                        }
                        if (var365 == 3310) {
                            var6--;
                            int var337 = class39.field745[var6];
                            class39.field745[var6++] = var337 >> 28;
                            continue;
                        }
                        if (var365 == 3311) {
                            var6--;
                            int var338 = class39.field745[var6];
                            class39.field745[var6++] = class29.method202(16383, var338);
                            continue;
                        }
                        if (var365 == 3312) {
                            class39.field745[var6++] = class178.field3064 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3313) {
                            var6 -= 2;
                            int var339 = class39.field745[var6] + 32768;
                            int var340 = class39.field745[var6 + 1];
                            class39.field745[var6++] = class114.method804(false, var340, var339);
                            continue;
                        }
                        if (var365 == 3314) {
                            var6 -= 2;
                            int var341 = class39.field745[var6] + 32768;
                            int var342 = class39.field745[var6 + 1];
                            class39.field745[var6++] = class27.method195(85, var342, var341);
                            continue;
                        }
                        if (var365 == 3315) {
                            var6 -= 2;
                            int var343 = class39.field745[var6] + 32768;
                            int var344 = class39.field745[var6 + 1];
                            class39.field745[var6++] = class73.method568(var343, var344, 0);
                            continue;
                        }
                        if (var365 == 3316) {
                            if (class30.field543 >= 2) {
                                class39.field745[var6++] = class30.field543;
                            } else {
                                class39.field745[var6++] = 0;
                            }
                            continue;
                        }
                        if (var365 == 3317) {
                            class39.field745[var6++] = class172.field2995;
                            continue;
                        }
                        if (var365 == 3318) {
                            class39.field745[var6++] = class186.field3209;
                            continue;
                        }
                        if (var365 == 3321) {
                            class39.field745[var6++] = class181.field3158;
                            continue;
                        }
                        if (var365 == 3322) {
                            class39.field745[var6++] = class72.field1373;
                            continue;
                        }
                        if (var365 == 3323) {
                            if (class81.field1578 >= 5 && class81.field1578 <= 9) {
                                class39.field745[var6++] = 1;
                                continue;
                            }
                            class39.field745[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3324) {
                            if (class81.field1578 >= 5 && class81.field1578 <= 9) {
                                class39.field745[var6++] = class81.field1578;
                                continue;
                            }
                            class39.field745[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3325) {
                            if (class28.field492 <= 0) {
                                class39.field745[var6++] = 0;
                            } else {
                                class39.field745[var6++] = 1;
                            }
                            continue;
                        }
                        if (var365 == 3326) {
                            class39.field745[var6++] = class96.field1774.field406;
                            continue;
                        }
                        if (var365 == 3327) {
                            class39.field745[var6++] = class96.field1774.field407.field642 ? 1 : 0;
                            continue;
                        }
                    } else if (var365 < 3500) {
                        if (var365 == 3400) {
                            var6 -= 2;
                            int var315 = class39.field745[var6];
                            int var316 = class39.field745[var6 + 1];
                            class2 var317 = class235.method1531(58, var315);
                            class103.field1876[var7++] = var317.method18(true, var316);
                            continue;
                        }
                        if (var365 == 3408) {
                            var6 -= 4;
                            int var318 = class39.field745[var6];
                            int var319 = class39.field745[var6 + 1];
                            int var320 = class39.field745[var6 + 3];
                            int var321 = class39.field745[var6 + 2];
                            class2 var322 = class235.method1531(45, var321);
                            if (var322.field21 == var318 && var322.field31 == var319) {
                                if (var319 == 115) {
                                    class103.field1876[var7++] = var322.method18(true, var320);
                                } else {
                                    class39.field745[var6++] = var322.method10(4547, var320);
                                }
                                continue;
                            }
                            if (var319 == 115) {
                                class103.field1876[var7++] = class95.field1768;
                            } else {
                                class39.field745[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var365 < 3700) {
                        if (var365 == 3600) {
                            if (class218.field3955 == 0) {
                                class39.field745[var6++] = -2;
                            } else if (class218.field3955 == 1) {
                                class39.field745[var6++] = -1;
                            } else {
                                class39.field745[var6++] = class117.field2085;
                            }
                            continue;
                        }
                        if (var365 == 3601) {
                            var6--;
                            int var104 = class39.field745[var6];
                            if (class218.field3955 == 2 && class117.field2085 > var104) {
                                class103.field1876[var7++] = class174.field3026[var104];
                                continue;
                            }
                            class103.field1876[var7++] = client.field608;
                            continue;
                        }
                        if (var365 == 3602) {
                            var6--;
                            int var105 = class39.field745[var6];
                            if (class218.field3955 == 2 && var105 < class117.field2085) {
                                class39.field745[var6++] = class37.field657[var105];
                                continue;
                            }
                            class39.field745[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3603) {
                            var6--;
                            int var106 = class39.field745[var6];
                            if (class218.field3955 == 2 && class117.field2085 > var106) {
                                class39.field745[var6++] = class60.field1131[var106];
                                continue;
                            }
                            class39.field745[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3604) {
                            var7--;
                            class44 var107 = class103.field1876[var7];
                            var6--;
                            int var108 = class39.field745[var6];
                            class204.method1315(var108, (byte) 22, var107);
                            continue;
                        }
                        if (var365 == 3605) {
                            var7--;
                            class44 var109 = class103.field1876[var7];
                            class1.method7(var109.method306(-58), (byte) 8);
                            continue;
                        }
                        if (var365 == 3606) {
                            var7--;
                            class44 var110 = class103.field1876[var7];
                            class74.method576(-30879, var110.method306(-58));
                            continue;
                        }
                        if (var365 == 3607) {
                            var7--;
                            class44 var111 = class103.field1876[var7];
                            class223.method1447(var111.method306(-58), 31904);
                            continue;
                        }
                        if (var365 == 3608) {
                            var7--;
                            class44 var112 = class103.field1876[var7];
                            class71.method560(var112.method306(-58), -1);
                            continue;
                        }
                        if (var365 == 3609) {
                            var7--;
                            class44 var113 = class103.field1876[var7];
                            if (var113.method323(true, class58.field1083) || var113.method323(true, class13.field237)) {
                                var113 = var113.method332(7, (byte) 77);
                            }
                            class39.field745[var6++] = class146.method956(var113, 0) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3610) {
                            var6--;
                            int var114 = class39.field745[var6];
                            if (class218.field3955 == 2 && class117.field2085 > var114) {
                                class103.field1876[var7++] = class122.field2161[var114];
                                continue;
                            }
                            class103.field1876[var7++] = client.field608;
                            continue;
                        }
                        if (var365 == 3611) {
                            if (class19.field317 == null) {
                                class103.field1876[var7++] = client.field608;
                            } else {
                                class103.field1876[var7++] = class19.field317.method320(false);
                            }
                            continue;
                        }
                        if (var365 == 3612) {
                            if (class19.field317 == null) {
                                class39.field745[var6++] = 0;
                            } else {
                                class39.field745[var6++] = class151.field2634;
                            }
                            continue;
                        }
                        if (var365 == 3613) {
                            var6--;
                            int var115 = class39.field745[var6];
                            if (class19.field317 != null && class151.field2634 > var115) {
                                class103.field1876[var7++] = class28.field496[var115].field4331.method320(false);
                                continue;
                            }
                            class103.field1876[var7++] = client.field608;
                            continue;
                        }
                        if (var365 == 3614) {
                            var6--;
                            int var116 = class39.field745[var6];
                            if (class19.field317 != null && class151.field2634 > var116) {
                                class39.field745[var6++] = class28.field496[var116].field4330;
                                continue;
                            }
                            class39.field745[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3615) {
                            var6--;
                            int var117 = class39.field745[var6];
                            if (class19.field317 != null && var117 < class151.field2634) {
                                class39.field745[var6++] = class28.field496[var117].field4329;
                                continue;
                            }
                            class39.field745[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3616) {
                            class39.field745[var6++] = class1.field3;
                            continue;
                        }
                        if (var365 == 3617) {
                            var7--;
                            class44 var118 = class103.field1876[var7];
                            class123.method844((byte) -107, var118);
                            continue;
                        }
                        if (var365 == 3618) {
                            class39.field745[var6++] = class179.field3103;
                            continue;
                        }
                        if (var365 == 3619) {
                            var7--;
                            class44 var119 = class103.field1876[var7];
                            class230.method1508(0, var119.method306(-58));
                            continue;
                        }
                        if (var365 == 3620) {
                            class116.method817((byte) 48);
                            continue;
                        }
                        if (var365 == 3621) {
                            if (class218.field3955 == 0) {
                                class39.field745[var6++] = -1;
                            } else {
                                class39.field745[var6++] = class37.field664;
                            }
                            continue;
                        }
                        if (var365 == 3622) {
                            var6--;
                            int var120 = class39.field745[var6];
                            if (class218.field3955 != 0 && class37.field664 > var120) {
                                class103.field1876[var7++] = class38.method263((byte) 3, class154.field2686[var120]).method320(false);
                                continue;
                            }
                            class103.field1876[var7++] = client.field608;
                            continue;
                        }
                        if (var365 == 3623) {
                            var7--;
                            class44 var121 = class103.field1876[var7];
                            if (var121.method323(true, class58.field1083) || var121.method323(true, class13.field237)) {
                                var121 = var121.method332(7, (byte) 29);
                            }
                            class39.field745[var6++] = class35.method243(var121, (byte) 107) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3624) {
                            var6--;
                            int var122 = class39.field745[var6];
                            if (class28.field496 != null && var122 < class151.field2634 && class28.field496[var122].field4331.method330(class96.field1774.field395, true)) {
                                class39.field745[var6++] = 1;
                                continue;
                            }
                            class39.field745[var6++] = 0;
                            continue;
                        }
                        if (var365 == 3625) {
                            if (class207.field3721 == null) {
                                class103.field1876[var7++] = client.field608;
                            } else {
                                class103.field1876[var7++] = class207.field3721.method320(false);
                            }
                            continue;
                        }
                        if (var365 == 3626) {
                            var6--;
                            int var123 = class39.field745[var6];
                            if (class19.field317 != null && var123 < class151.field2634) {
                                class103.field1876[var7++] = class28.field496[var123].field4326;
                                continue;
                            }
                            class103.field1876[var7++] = client.field608;
                            continue;
                        }
                    } else if (var365 < 4000) {
                        if (var365 == 3903) {
                            var6--;
                            int var301 = class39.field745[var6];
                            class39.field745[var6++] = class84.field1632[var301].method1243(126);
                            continue;
                        }
                        if (var365 == 3904) {
                            var6--;
                            int var302 = class39.field745[var6];
                            class39.field745[var6++] = class84.field1632[var302].field3404;
                            continue;
                        }
                        if (var365 == 3905) {
                            var6--;
                            int var303 = class39.field745[var6];
                            class39.field745[var6++] = class84.field1632[var303].field3413;
                            continue;
                        }
                        if (var365 == 3906) {
                            var6--;
                            int var304 = class39.field745[var6];
                            class39.field745[var6++] = class84.field1632[var304].field3392;
                            continue;
                        }
                        if (var365 == 3907) {
                            var6--;
                            int var305 = class39.field745[var6];
                            class39.field745[var6++] = class84.field1632[var305].field3402;
                            continue;
                        }
                        if (var365 == 3908) {
                            var6--;
                            int var306 = class39.field745[var6];
                            class39.field745[var6++] = class84.field1632[var306].field3411;
                            continue;
                        }
                        if (var365 == 3910) {
                            var6--;
                            int var307 = class39.field745[var6];
                            int var308 = class84.field1632[var307].method1241(-104);
                            class39.field745[var6++] = var308 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3911) {
                            var6--;
                            int var309 = class39.field745[var6];
                            int var310 = class84.field1632[var309].method1241(-128);
                            class39.field745[var6++] = var310 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3912) {
                            var6--;
                            int var311 = class39.field745[var6];
                            int var312 = class84.field1632[var311].method1241(63);
                            class39.field745[var6++] = var312 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 3913) {
                            var6--;
                            int var313 = class39.field745[var6];
                            int var314 = class84.field1632[var313].method1241(-90);
                            class39.field745[var6++] = var314 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var365 < 4100) {
                        if (var365 == 4000) {
                            var6 -= 2;
                            int var124 = class39.field745[var6 + 1];
                            int var125 = class39.field745[var6];
                            class39.field745[var6++] = var124 + var125;
                            continue;
                        }
                        if (var365 == 4001) {
                            var6 -= 2;
                            int var126 = class39.field745[var6];
                            int var127 = class39.field745[var6 + 1];
                            class39.field745[var6++] = var126 - var127;
                            continue;
                        }
                        if (var365 == 4002) {
                            var6 -= 2;
                            int var128 = class39.field745[var6 + 1];
                            int var129 = class39.field745[var6];
                            class39.field745[var6++] = var128 * var129;
                            continue;
                        }
                        if (var365 == 4003) {
                            var6 -= 2;
                            int var130 = class39.field745[var6 + 1];
                            int var131 = class39.field745[var6];
                            class39.field745[var6++] = var131 / var130;
                            continue;
                        }
                        if (var365 == 4004) {
                            var6--;
                            int var132 = class39.field745[var6];
                            class39.field745[var6++] = (int) ((double) var132 * Math.random());
                            continue;
                        }
                        if (var365 == 4005) {
                            var6--;
                            int var133 = class39.field745[var6];
                            class39.field745[var6++] = (int) ((double) (var133 + 1) * Math.random());
                            continue;
                        }
                        if (var365 == 4006) {
                            var6 -= 5;
                            int var134 = class39.field745[var6];
                            int var135 = class39.field745[var6 + 1];
                            int var136 = class39.field745[var6 + 2];
                            int var137 = class39.field745[var6 + 3];
                            int var138 = class39.field745[var6 + 4];
                            class39.field745[var6++] = (var135 - var134) * (-var136 + var138) / (var137 - var136) + var134;
                            continue;
                        }
                        if (var365 == 4007) {
                            var6 -= 2;
                            long var139 = (long) class39.field745[var6];
                            long var141 = (long) class39.field745[var6 + 1];
                            class39.field745[var6++] = (int) (var139 * var141 / 100L + var139);
                            continue;
                        }
                        if (var365 == 4008) {
                            var6 -= 2;
                            int var143 = class39.field745[var6 + 1];
                            int var144 = class39.field745[var6];
                            class39.field745[var6++] = class238.method1545(0x1 << var143, var144);
                            continue;
                        }
                        if (var365 == 4009) {
                            var6 -= 2;
                            int var145 = class39.field745[var6 + 1];
                            int var146 = class39.field745[var6];
                            class39.field745[var6++] = class29.method202(var146, -(0x1 << var145) - 1);
                            continue;
                        }
                        if (var365 == 4010) {
                            var6 -= 2;
                            int var147 = class39.field745[var6];
                            int var148 = class39.field745[var6 + 1];
                            class39.field745[var6++] = class29.method202(0x1 << var148, var147) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var365 == 4011) {
                            var6 -= 2;
                            int var149 = class39.field745[var6 + 1];
                            int var150 = class39.field745[var6];
                            class39.field745[var6++] = var150 % var149;
                            continue;
                        }
                        if (var365 == 4012) {
                            var6 -= 2;
                            int var151 = class39.field745[var6];
                            int var152 = class39.field745[var6 + 1];
                            if (var151 == 0) {
                                class39.field745[var6++] = 0;
                            } else {
                                class39.field745[var6++] = (int) Math.pow((double) var151, (double) var152);
                            }
                            continue;
                        }
                        if (var365 == 4013) {
                            var6 -= 2;
                            int var153 = class39.field745[var6];
                            int var154 = class39.field745[var6 + 1];
                            if (var153 == 0) {
                                class39.field745[var6++] = 0;
                            } else if (var154 == 0) {
                                class39.field745[var6++] = Integer.MAX_VALUE;
                            } else {
                                class39.field745[var6++] = (int) Math.pow((double) var153, 1.0D / (double) var154);
                            }
                            continue;
                        }
                        if (var365 == 4014) {
                            var6 -= 2;
                            int var155 = class39.field745[var6];
                            int var156 = class39.field745[var6 + 1];
                            class39.field745[var6++] = class29.method202(var155, var156);
                            continue;
                        }
                        if (var365 == 4015) {
                            var6 -= 2;
                            int var157 = class39.field745[var6 + 1];
                            int var158 = class39.field745[var6];
                            class39.field745[var6++] = class238.method1545(var157, var158);
                            continue;
                        }
                        if (var365 == 4016) {
                            var6 -= 2;
                            int var159 = class39.field745[var6];
                            int var160 = class39.field745[var6 + 1];
                            class39.field745[var6++] = var159 >= var160 ? var160 : var159;
                            continue;
                        }
                        if (var365 == 4017) {
                            var6 -= 2;
                            int var161 = class39.field745[var6];
                            int var162 = class39.field745[var6 + 1];
                            class39.field745[var6++] = var162 < var161 ? var161 : var162;
                            continue;
                        }
                        if (var365 == 4018) {
                            var6 -= 3;
                            long var163 = (long) class39.field745[var6];
                            long var165 = (long) class39.field745[var6 + 1];
                            long var167 = (long) class39.field745[var6 + 2];
                            class39.field745[var6++] = (int) (var163 * var167 / var165);
                            continue;
                        }
                    } else if (var365 < 4200) {
                        if (var365 == 4100) {
                            var7--;
                            class44 var249 = class103.field1876[var7];
                            var6--;
                            int var250 = class39.field745[var6];
                            class103.field1876[var7++] = class70.method555(new class44[] { var249, class199.method1287(var250, -1) }, -3);
                            continue;
                        }
                        if (var365 == 4101) {
                            var7 -= 2;
                            class44 var251 = class103.field1876[var7 + 1];
                            class44 var252 = class103.field1876[var7];
                            class103.field1876[var7++] = class70.method555(new class44[] { var252, var251 }, -3);
                            continue;
                        }
                        if (var365 == 4102) {
                            var7--;
                            class44 var253 = class103.field1876[var7];
                            var6--;
                            int var254 = class39.field745[var6];
                            class103.field1876[var7++] = class70.method555(new class44[] { var253, class53.method379(true, -6, var254) }, -3);
                            continue;
                        }
                        if (var365 == 4103) {
                            var7--;
                            class44 var255 = class103.field1876[var7];
                            class103.field1876[var7++] = var255.method312(65);
                            continue;
                        }
                        if (var365 == 4104) {
                            var6--;
                            int var256 = class39.field745[var6];
                            long var257 = ((long) var256 + 11745L) * 86400000L;
                            class184.field3201.setTime(new Date(var257));
                            int var259 = class184.field3201.get(5);
                            int var260 = class184.field3201.get(2);
                            int var261 = class184.field3201.get(1);
                            class103.field1876[var7++] = class70.method555(new class44[] { class199.method1287(var259, -1), class129.field2307, class8.field169[var260], class129.field2307, class199.method1287(var261, -1) }, -3);
                            continue;
                        }
                        if (var365 == 4105) {
                            var7 -= 2;
                            class44 var262 = class103.field1876[var7];
                            class44 var263 = class103.field1876[var7 + 1];
                            if (class96.field1774.field407 != null && class96.field1774.field407.field642) {
                                class103.field1876[var7++] = var263;
                                continue;
                            }
                            class103.field1876[var7++] = var262;
                            continue;
                        }
                        if (var365 == 4106) {
                            var6--;
                            int var264 = class39.field745[var6];
                            class103.field1876[var7++] = class199.method1287(var264, -1);
                            continue;
                        }
                        if (var365 == 4107) {
                            var7 -= 2;
                            class39.field745[var6++] = class103.field1876[var7].method313(class103.field1876[var7 + 1], -4986);
                            continue;
                        }
                        if (var365 == 4108) {
                            var6 -= 2;
                            var7--;
                            class44 var265 = class103.field1876[var7];
                            int var266 = class39.field745[var6];
                            int var267 = class39.field745[var6 + 1];
                            byte[] var268 = class145.field2559.method1466(var267, 0, (byte) -128);
                            class69 var269 = new class69(var268);
                            var269.method427(class36.field650, null);
                            class39.field745[var6++] = var269.method410(var265, var266);
                            continue;
                        }
                        if (var365 == 4109) {
                            var6 -= 2;
                            var7--;
                            class44 var270 = class103.field1876[var7];
                            int var271 = class39.field745[var6 + 1];
                            int var272 = class39.field745[var6];
                            byte[] var273 = class145.field2559.method1466(var271, 0, (byte) -119);
                            class69 var274 = new class69(var273);
                            var274.method427(class36.field650, null);
                            class39.field745[var6++] = var274.method416(var270, var272);
                            continue;
                        }
                        if (var365 == 4110) {
                            var7 -= 2;
                            class44 var275 = class103.field1876[var7];
                            class44 var276 = class103.field1876[var7 + 1];
                            var6--;
                            if (class39.field745[var6] == 1) {
                                class103.field1876[var7++] = var275;
                            } else {
                                class103.field1876[var7++] = var276;
                            }
                            continue;
                        }
                        if (var365 == 4111) {
                            var7--;
                            class44 var277 = class103.field1876[var7];
                            class103.field1876[var7++] = class56.method419(var277);
                            continue;
                        }
                        if (var365 == 4112) {
                            var7--;
                            class44 var278 = class103.field1876[var7];
                            var6--;
                            int var279 = class39.field745[var6];
                            if (var279 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class103.field1876[var7++] = var278.method338(16227, var279);
                            continue;
                        }
                        if (var365 == 4113) {
                            var6--;
                            int var280 = class39.field745[var6];
                            class39.field745[var6++] = class68.method544(17904, var280) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4114) {
                            var6--;
                            int var281 = class39.field745[var6];
                            class39.field745[var6++] = class32.method220(var281, -127) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4115) {
                            var6--;
                            int var282 = class39.field745[var6];
                            class39.field745[var6++] = class98.method684(var282, 90) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4116) {
                            var6--;
                            int var283 = class39.field745[var6];
                            class39.field745[var6++] = class204.method1317(57, var283) ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4117) {
                            var7--;
                            class44 var284 = class103.field1876[var7];
                            if (var284 == null) {
                                class39.field745[var6++] = 0;
                            } else {
                                class39.field745[var6++] = var284.method340(3);
                            }
                            continue;
                        }
                        if (var365 == 4118) {
                            var6 -= 2;
                            var7--;
                            class44 var285 = class103.field1876[var7];
                            int var286 = class39.field745[var6];
                            int var287 = class39.field745[var6 + 1];
                            class103.field1876[var7++] = var285.method318(126, var287, var286);
                            continue;
                        }
                        if (var365 == 4119) {
                            boolean var288 = false;
                            var7--;
                            class44 var289 = class103.field1876[var7];
                            class44 var290 = class136.method918(var289.method340(3), (byte) 116);
                            for (int var291 = 0; var289.method340(3) > var291; var291++) {
                                int var292 = var289.method302(-12540, var291);
                                if (var292 == 60) {
                                    var288 = true;
                                } else if (var292 == 62) {
                                    var288 = false;
                                } else if (!var288) {
                                    var290.method307(1, var292);
                                }
                            }
                            var290.method311((byte) -118);
                            class103.field1876[var7++] = var290;
                            continue;
                        }
                        if (var365 == 4120) {
                            var7--;
                            class44 var293 = class103.field1876[var7];
                            var6 -= 2;
                            int var294 = class39.field745[var6];
                            int var295 = class39.field745[var6 + 1];
                            class39.field745[var6++] = var293.method324(-128, var295, var294);
                            continue;
                        }
                        if (var365 == 4121) {
                            var7 -= 2;
                            var6--;
                            int var296 = class39.field745[var6];
                            class44 var297 = class103.field1876[var7 + 1];
                            class44 var298 = class103.field1876[var7];
                            class39.field745[var6++] = var298.method326((byte) -61, var296, var297);
                            continue;
                        }
                        if (var365 == 4122) {
                            var6--;
                            int var299 = class39.field745[var6];
                            class39.field745[var6++] = class154.method995(true, var299);
                            continue;
                        }
                        if (var365 == 4123) {
                            var6--;
                            int var300 = class39.field745[var6];
                            class39.field745[var6++] = class181.method1143((byte) 121, var300);
                            continue;
                        }
                    } else if (var365 < 4300) {
                        if (var365 == 4200) {
                            var6--;
                            int var169 = class39.field745[var6];
                            class103.field1876[var7++] = class192.method1227(-31700, var169).field3837;
                            continue;
                        }
                        if (var365 == 4201) {
                            var6 -= 2;
                            int var170 = class39.field745[var6];
                            int var171 = class39.field745[var6 + 1];
                            class214 var172 = class192.method1227(-31700, var170);
                            if (var171 >= 1 && var171 <= 5 && var172.field3880[var171 - 1] != null) {
                                class103.field1876[var7++] = var172.field3880[var171 - 1];
                                continue;
                            }
                            class103.field1876[var7++] = client.field608;
                            continue;
                        }
                        if (var365 == 4202) {
                            var6 -= 2;
                            int var173 = class39.field745[var6];
                            int var174 = class39.field745[var6 + 1];
                            class214 var175 = class192.method1227(-31700, var173);
                            if (var174 >= 1 && var174 <= 5 && var175.field3844[var174 - 1] != null) {
                                class103.field1876[var7++] = var175.field3844[var174 - 1];
                                continue;
                            }
                            class103.field1876[var7++] = client.field608;
                            continue;
                        }
                        if (var365 == 4203) {
                            var6--;
                            int var176 = class39.field745[var6];
                            class39.field745[var6++] = class192.method1227(-31700, var176).field3849;
                            continue;
                        }
                        if (var365 == 4204) {
                            var6--;
                            int var177 = class39.field745[var6];
                            class39.field745[var6++] = class192.method1227(-31700, var177).field3853 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4205) {
                            var6--;
                            int var178 = class39.field745[var6];
                            class214 var179 = class192.method1227(-31700, var178);
                            if (var179.field3864 == -1 && var179.field3832 >= 0) {
                                class39.field745[var6++] = var179.field3832;
                                continue;
                            }
                            class39.field745[var6++] = var178;
                            continue;
                        }
                        if (var365 == 4206) {
                            var6--;
                            int var180 = class39.field745[var6];
                            class214 var181 = class192.method1227(-31700, var180);
                            if (var181.field3864 >= 0 && var181.field3832 >= 0) {
                                class39.field745[var6++] = var181.field3832;
                                continue;
                            }
                            class39.field745[var6++] = var180;
                            continue;
                        }
                        if (var365 == 4207) {
                            var6--;
                            int var182 = class39.field745[var6];
                            class39.field745[var6++] = class192.method1227(-31700, var182).field3831 ? 1 : 0;
                            continue;
                        }
                        if (var365 == 4210) {
                            var7--;
                            class44 var183 = class103.field1876[var7];
                            var6--;
                            int var184 = class39.field745[var6];
                            class49.method360(var184 == 1, 0, var183);
                            class39.field745[var6++] = class151.field2638;
                            continue;
                        }
                        if (var365 == 4211) {
                            if (class2.field25 != null && class151.field2638 > class145.field2558) {
                                class39.field745[var6++] = class29.method202(class2.field25[class145.field2558++], 65535);
                                continue;
                            }
                            class39.field745[var6++] = -1;
                            continue;
                        }
                        if (var365 == 4212) {
                            class145.field2558 = 0;
                            continue;
                        }
                    } else if (var365 < 5100) {
                        if (var365 == 5000) {
                            class39.field745[var6++] = class108.field1975;
                            continue;
                        }
                        if (var365 == 5001) {
                            class147.field2584++;
                            var6 -= 3;
                            class108.field1975 = class39.field745[var6];
                            class95.field1765 = class39.field745[var6 + 1];
                            class230.field4316 = class39.field745[var6 + 2];
                            class200.field3542.method1170(102, (byte) -116);
                            class200.field3542.method488(119, class108.field1975);
                            class200.field3542.method488(124, class95.field1765);
                            class200.field3542.method488(124, class230.field4316);
                            continue;
                        }
                        if (var365 == 5002) {
                            var7--;
                            class44 var185 = class103.field1876[var7];
                            class132.field2373++;
                            var6 -= 2;
                            int var186 = class39.field745[var6 + 1];
                            int var187 = class39.field745[var6];
                            class200.field3542.method1170(193, (byte) -103);
                            class200.field3542.method536(var185.method306(-58), 53);
                            class200.field3542.method488(125, var187 - 1);
                            class200.field3542.method488(123, var186);
                            continue;
                        }
                        if (var365 == 5003) {
                            var6--;
                            int var188 = class39.field745[var6];
                            class44 var189 = null;
                            if (var188 < 100) {
                                var189 = class115.field2056[var188];
                            }
                            if (var189 == null) {
                                var189 = client.field608;
                            }
                            class103.field1876[var7++] = var189;
                            continue;
                        }
                        if (var365 == 5004) {
                            var6--;
                            int var190 = class39.field745[var6];
                            int var191 = -1;
                            if (var190 < 100 && class115.field2056[var190] != null) {
                                var191 = class202.field3606[var190];
                            }
                            class39.field745[var6++] = var191;
                            continue;
                        }
                        if (var365 == 5005) {
                            class39.field745[var6++] = class95.field1765;
                            continue;
                        }
                        if (var365 == 5008) {
                            var7--;
                            class44 var192 = class103.field1876[var7];
                            if (var192.method323(true, class124.field2220)) {
                                class207.method1350(var192, -23357);
                            } else {
                                class171.field2980++;
                                byte var193 = 0;
                                class44 var194 = var192.method312(65);
                                if (var194.method323(true, class19.field330)) {
                                    var192 = var192.method332(class19.field330.method340(3), (byte) 82);
                                    var193 = 0;
                                } else if (var194.method323(true, class157.field2737)) {
                                    var192 = var192.method332(class157.field2737.method340(3), (byte) 117);
                                    var193 = 1;
                                } else if (var194.method323(true, class191.field3294)) {
                                    var193 = 2;
                                    var192 = var192.method332(class191.field3294.method340(3), (byte) 73);
                                } else if (var194.method323(true, class30.field527)) {
                                    var193 = 3;
                                    var192 = var192.method332(class30.field527.method340(3), (byte) 52);
                                } else if (var194.method323(true, class219.field3969)) {
                                    var192 = var192.method332(class219.field3969.method340(3), (byte) 26);
                                    var193 = 4;
                                } else if (var194.method323(true, class72.field1369)) {
                                    var193 = 5;
                                    var192 = var192.method332(class72.field1369.method340(3), (byte) 3);
                                } else if (var194.method323(true, class33.field574)) {
                                    var192 = var192.method332(class33.field574.method340(3), (byte) 47);
                                    var193 = 6;
                                } else if (var194.method323(true, class146.field2567)) {
                                    var193 = 7;
                                    var192 = var192.method332(class146.field2567.method340(3), (byte) 31);
                                } else if (var194.method323(true, class94.field1753)) {
                                    var193 = 8;
                                    var192 = var192.method332(class94.field1753.method340(3), (byte) 108);
                                } else if (var194.method323(true, class181.field3147)) {
                                    var193 = 9;
                                    var192 = var192.method332(class181.field3147.method340(3), (byte) 64);
                                } else if (var194.method323(true, class207.field3719)) {
                                    var193 = 10;
                                    var192 = var192.method332(class207.field3719.method340(3), (byte) 77);
                                } else if (var194.method323(true, class115.field2058)) {
                                    var192 = var192.method332(class115.field2058.method340(3), (byte) 28);
                                    var193 = 11;
                                } else if (class119.field2119 != 0) {
                                    if (var194.method323(true, class19.field331)) {
                                        var192 = var192.method332(class19.field331.method340(3), (byte) 108);
                                        var193 = 0;
                                    } else if (var194.method323(true, class157.field2739)) {
                                        var193 = 1;
                                        var192 = var192.method332(class157.field2739.method340(3), (byte) 63);
                                    } else if (var194.method323(true, class191.field3299)) {
                                        var193 = 2;
                                        var192 = var192.method332(class191.field3299.method340(3), (byte) 25);
                                    } else if (var194.method323(true, class30.field537)) {
                                        var193 = 3;
                                        var192 = var192.method332(class30.field537.method340(3), (byte) 67);
                                    } else if (var194.method323(true, class219.field3974)) {
                                        var193 = 4;
                                        var192 = var192.method332(class219.field3974.method340(3), (byte) 66);
                                    } else if (var194.method323(true, class72.field1368)) {
                                        var193 = 5;
                                        var192 = var192.method332(class72.field1368.method340(3), (byte) 7);
                                    } else if (var194.method323(true, class33.field587)) {
                                        var193 = 6;
                                        var192 = var192.method332(class33.field587.method340(3), (byte) 64);
                                    } else if (var194.method323(true, class146.field2572)) {
                                        var192 = var192.method332(class146.field2572.method340(3), (byte) 91);
                                        var193 = 7;
                                    } else if (var194.method323(true, class94.field1742)) {
                                        var192 = var192.method332(class94.field1742.method340(3), (byte) 19);
                                        var193 = 8;
                                    } else if (var194.method323(true, class181.field3134)) {
                                        var192 = var192.method332(class181.field3134.method340(3), (byte) 91);
                                        var193 = 9;
                                    } else if (var194.method323(true, class207.field3716)) {
                                        var192 = var192.method332(class207.field3716.method340(3), (byte) 26);
                                        var193 = 10;
                                    } else if (var194.method323(true, class115.field2066)) {
                                        var193 = 11;
                                        var192 = var192.method332(class115.field2066.method340(3), (byte) 33);
                                    }
                                }
                                byte var195 = 0;
                                class44 var196 = var192.method312(65);
                                if (var196.method323(true, class79.field1526)) {
                                    var192 = var192.method332(class79.field1526.method340(3), (byte) 114);
                                    var195 = 1;
                                } else if (var196.method323(true, class73.field1398)) {
                                    var192 = var192.method332(class73.field1398.method340(3), (byte) 51);
                                    var195 = 2;
                                } else if (var196.method323(true, class19.field315)) {
                                    var195 = 3;
                                    var192 = var192.method332(class19.field315.method340(3), (byte) 44);
                                } else if (var196.method323(true, class15.field291)) {
                                    var192 = var192.method332(class15.field291.method340(3), (byte) 126);
                                    var195 = 4;
                                } else if (var196.method323(true, class53.field944)) {
                                    var195 = 5;
                                    var192 = var192.method332(class53.field944.method340(3), (byte) 50);
                                } else if (class119.field2119 != 0) {
                                    if (var196.method323(true, class79.field1533)) {
                                        var192 = var192.method332(class79.field1533.method340(3), (byte) 86);
                                        var195 = 1;
                                    } else if (var196.method323(true, class73.field1395)) {
                                        var195 = 2;
                                        var192 = var192.method332(class73.field1395.method340(3), (byte) 69);
                                    } else if (var196.method323(true, class19.field319)) {
                                        var195 = 3;
                                        var192 = var192.method332(class19.field319.method340(3), (byte) 66);
                                    } else if (var196.method323(true, class15.field270)) {
                                        var192 = var192.method332(class15.field270.method340(3), (byte) 82);
                                        var195 = 4;
                                    } else if (var196.method323(true, class53.field945)) {
                                        var192 = var192.method332(class53.field945.method340(3), (byte) 70);
                                        var195 = 5;
                                    }
                                }
                                class200.field3542.method1170(222, (byte) -115);
                                class200.field3542.method488(120, 0);
                                int var197 = class200.field3542.field1195;
                                class200.field3542.method488(119, var193);
                                class200.field3542.method488(126, var195);
                                class132.method895((byte) -111, var192, class200.field3542);
                                class200.field3542.method508(-1, class200.field3542.field1195 - var197);
                            }
                            continue;
                        }
                        if (var365 == 5009) {
                            var7 -= 2;
                            class13.field250++;
                            class44 var198 = class103.field1876[var7];
                            class44 var199 = class103.field1876[var7 + 1];
                            class200.field3542.method1170(243, (byte) -93);
                            class200.field3542.method488(125, 0);
                            int var200 = class200.field3542.field1195;
                            class200.field3542.method536(var198.method306(-58), 105);
                            class132.method895((byte) -121, var199, class200.field3542);
                            class200.field3542.method508(-1, class200.field3542.field1195 - var200);
                            continue;
                        }
                        if (var365 == 5010) {
                            var6--;
                            int var201 = class39.field745[var6];
                            class44 var202 = null;
                            if (var201 < 100) {
                                var202 = class8.field166[var201];
                            }
                            if (var202 == null) {
                                var202 = client.field608;
                            }
                            class103.field1876[var7++] = var202;
                            continue;
                        }
                        if (var365 == 5011) {
                            var6--;
                            int var203 = class39.field745[var6];
                            class44 var204 = null;
                            if (var203 < 100) {
                                var204 = class105.field1922[var203];
                            }
                            if (var204 == null) {
                                var204 = client.field608;
                            }
                            class103.field1876[var7++] = var204;
                            continue;
                        }
                        if (var365 == 5012) {
                            int var205 = -1;
                            var6--;
                            int var206 = class39.field745[var6];
                            if (var206 < 100) {
                                var205 = class71.field1348[var206];
                            }
                            class39.field745[var6++] = var205;
                            continue;
                        }
                        if (var365 == 5015) {
                            class44 var207;
                            if (class96.field1774 == null || class96.field1774.field395 == null) {
                                var207 = class182.field3177;
                            } else {
                                var207 = class96.field1774.field395;
                            }
                            class103.field1876[var7++] = var207;
                            continue;
                        }
                        if (var365 == 5016) {
                            class39.field745[var6++] = class230.field4316;
                            continue;
                        }
                        if (var365 == 5017) {
                            class39.field745[var6++] = class139.field2485;
                            continue;
                        }
                        if (var365 == 5050) {
                            var6--;
                            int var208 = class39.field745[var6];
                            class103.field1876[var7++] = class216.method1412(var208, 82).field1613;
                            continue;
                        }
                        if (var365 == 5051) {
                            var6--;
                            int var209 = class39.field745[var6];
                            class83 var210 = class216.method1412(var209, 113);
                            if (var210.field1623 == null) {
                                class39.field745[var6++] = 0;
                            } else {
                                class39.field745[var6++] = var210.field1623.length;
                            }
                            continue;
                        }
                        if (var365 == 5052) {
                            var6 -= 2;
                            int var211 = class39.field745[var6];
                            int var212 = class39.field745[var6 + 1];
                            class39.field745[var6++] = class216.method1412(var211, 111).field1623[var212];
                            continue;
                        }
                        if (var365 == 5053) {
                            var6--;
                            int var213 = class39.field745[var6];
                            class83 var214 = class216.method1412(var213, 90);
                            if (var214.field1621 == null) {
                                class39.field745[var6++] = 0;
                            } else {
                                class39.field745[var6++] = var214.field1621.length;
                            }
                            continue;
                        }
                        if (var365 == 5054) {
                            var6 -= 2;
                            int var215 = class39.field745[var6];
                            int var216 = class39.field745[var6 + 1];
                            class39.field745[var6++] = class216.method1412(var215, 99).field1621[var216];
                            continue;
                        }
                        if (var365 == 5055) {
                            var6--;
                            int var217 = class39.field745[var6];
                            class103.field1876[var7++] = class63.method473((byte) -75, var217).method437(-40);
                            continue;
                        }
                        if (var365 == 5056) {
                            var6--;
                            int var218 = class39.field745[var6];
                            class57 var219 = class63.method473((byte) -107, var218);
                            if (var219.field1070 == null) {
                                class39.field745[var6++] = 0;
                            } else {
                                class39.field745[var6++] = var219.field1070.length;
                            }
                            continue;
                        }
                        if (var365 == 5057) {
                            var6 -= 2;
                            int var220 = class39.field745[var6];
                            int var221 = class39.field745[var6 + 1];
                            class39.field745[var6++] = class63.method473((byte) -105, var220).field1070[var221];
                            continue;
                        }
                        if (var365 == 5058) {
                            class228.field4280 = new class151();
                            var6--;
                            class228.field4280.field2628 = class39.field745[var6];
                            class228.field4280.field2635 = class63.method473((byte) -58, class228.field4280.field2628);
                            class228.field4280.field2623 = new int[class228.field4280.field2635.method434(8)];
                            continue;
                        }
                        if (var365 == 5059) {
                            class200.field3542.method1170(51, (byte) -95);
                            class200.field3542.method488(119, 0);
                            class187.field3226++;
                            int var222 = class200.field3542.field1195;
                            class200.field3542.method488(120, 0);
                            class200.field3542.method510((byte) -41, class228.field4280.field2628);
                            class228.field4280.field2635.method438(class200.field3542, class228.field4280.field2623, 8);
                            class200.field3542.method508(-1, class200.field3542.field1195 - var222);
                            continue;
                        }
                        if (var365 == 5060) {
                            class194.field3400++;
                            var7--;
                            class44 var223 = class103.field1876[var7];
                            class200.field3542.method1170(232, (byte) -101);
                            class200.field3542.method488(127, 0);
                            int var224 = class200.field3542.field1195;
                            class200.field3542.method536(var223.method306(-58), 77);
                            class200.field3542.method510((byte) -106, class228.field4280.field2628);
                            class228.field4280.field2635.method438(class200.field3542, class228.field4280.field2623, 8);
                            class200.field3542.method508(-1, class200.field3542.field1195 - var224);
                            continue;
                        }
                        if (var365 == 5061) {
                            class200.field3542.method1170(51, (byte) -74);
                            class200.field3542.method488(127, 0);
                            class187.field3226++;
                            int var225 = class200.field3542.field1195;
                            class200.field3542.method488(127, 1);
                            class200.field3542.method510((byte) 93, class228.field4280.field2628);
                            class228.field4280.field2635.method438(class200.field3542, class228.field4280.field2623, 8);
                            class200.field3542.method508(-1, class200.field3542.field1195 - var225);
                            continue;
                        }
                        if (var365 == 5062) {
                            var6 -= 2;
                            int var226 = class39.field745[var6 + 1];
                            int var227 = class39.field745[var6];
                            class39.field745[var6++] = class216.method1412(var227, 107).field1616[var226];
                            continue;
                        }
                        if (var365 == 5063) {
                            var6 -= 2;
                            int var228 = class39.field745[var6];
                            int var229 = class39.field745[var6 + 1];
                            class39.field745[var6++] = class216.method1412(var228, 76).field1625[var229];
                            continue;
                        }
                        if (var365 == 5064) {
                            var6 -= 2;
                            int var230 = class39.field745[var6];
                            int var231 = class39.field745[var6 + 1];
                            if (var231 == -1) {
                                class39.field745[var6++] = -1;
                            } else {
                                class39.field745[var6++] = class216.method1412(var230, 100).method625(true, var231);
                            }
                            continue;
                        }
                        if (var365 == 5065) {
                            var6 -= 2;
                            int var232 = class39.field745[var6];
                            int var233 = class39.field745[var6 + 1];
                            if (var233 == -1) {
                                class39.field745[var6++] = -1;
                            } else {
                                class39.field745[var6++] = class216.method1412(var232, 119).method624(var233, (byte) -5);
                            }
                            continue;
                        }
                        if (var365 == 5066) {
                            var6--;
                            int var234 = class39.field745[var6];
                            class39.field745[var6++] = class63.method473((byte) -57, var234).method434(8);
                            continue;
                        }
                        if (var365 == 5067) {
                            var6 -= 2;
                            int var235 = class39.field745[var6];
                            int var236 = class39.field745[var6 + 1];
                            int var237 = class63.method473((byte) -75, var235).method433(108, var236);
                            System.out.println("chatphrase_getdynamiccommand=" + var237);
                            class39.field745[var6++] = var237;
                            continue;
                        }
                        if (var365 == 5068) {
                            var6 -= 2;
                            int var238 = class39.field745[var6];
                            int var239 = class39.field745[var6 + 1];
                            class228.field4280.field2623[var238] = var239;
                            continue;
                        }
                        if (var365 == 5069) {
                            var6 -= 2;
                            int var240 = class39.field745[var6];
                            int var241 = class39.field745[var6 + 1];
                            class228.field4280.field2623[var240] = var241;
                            continue;
                        }
                        if (var365 == 5070) {
                            var6 -= 3;
                            int var242 = class39.field745[var6];
                            int var243 = class39.field745[var6 + 1];
                            int var244 = class39.field745[var6 + 2];
                            class57 var245 = class63.method473((byte) -91, var242);
                            if (var245.method433(-55, var243) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class39.field745[var6++] = var245.method429(var243, var244, 99);
                            continue;
                        }
                    } else if (var365 < 5200) {
                        if (var365 == 5100) {
                            if (class130.field2324[86]) {
                                class39.field745[var6++] = 1;
                            } else {
                                class39.field745[var6++] = 0;
                            }
                            continue;
                        }
                        if (var365 == 5101) {
                            if (class130.field2324[82]) {
                                class39.field745[var6++] = 1;
                            } else {
                                class39.field745[var6++] = 0;
                            }
                            continue;
                        }
                        if (var365 == 5102) {
                            if (class130.field2324[81]) {
                                class39.field745[var6++] = 1;
                            } else {
                                class39.field745[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var365 < 5300) {
                        if (var365 == 5200) {
                            var6--;
                            class143.method945(class39.field745[var6], true);
                            continue;
                        }
                        if (var365 == 5201) {
                            class39.field745[var6++] = class118.method823(-5827);
                            continue;
                        }
                        if (var365 == 5202) {
                            var6--;
                            class200.method1291((byte) -51, class39.field745[var6]);
                            continue;
                        }
                        if (var365 == 5203) {
                            var7--;
                            class13.method115((byte) -113, class103.field1876[var7]);
                            continue;
                        }
                        if (var365 == 5204) {
                            class103.field1876[var7 - 1] = class203.method1313(class103.field1876[var7 - 1], 123);
                            continue;
                        }
                        if (var365 == 5205) {
                            var7--;
                            class102.method754(-122, class103.field1876[var7]);
                            continue;
                        }
                    } else if (var365 < 5400) {
                        if (var365 == 5304) {
                            class39.field745[var6++] = 0;
                            continue;
                        }
                    } else if (var365 < 5500) {
                        if (var365 == 5400) {
                            var7 -= 2;
                            class168.field2876++;
                            class44 var246 = class103.field1876[var7];
                            var6--;
                            int var247 = class39.field745[var6];
                            class44 var248 = class103.field1876[var7 + 1];
                            class200.field3542.method1170(248, (byte) -110);
                            class200.field3542.method488(119, class32.method221(125, var246) + class32.method221(107, var248) + 1);
                            class200.field3542.method492(7527, var246);
                            class200.field3542.method492(7527, var248);
                            class200.field3542.method488(119, var247);
                            continue;
                        }
                        if (var365 == 5401) {
                            var6 -= 2;
                            class3.field43[class39.field745[var6]] = (short) class146.method955(class39.field745[var6 + 1], -42);
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var364) {
            if (var5.field2095 == null) {
                if (class239.field4422 != 0) {
                    class226.method1484(class160.field2761, 0, 0, client.field608);
                }
                class173.method1099(103, "CS2 - scr:" + var5.field3186 + " op:" + var11, var364);
            } else {
                class44 var361 = class136.method918(30, (byte) 121);
                var361.method337(class64.field1187, false).method337(var5.field2095, false);
                for (int var362 = class118.field2108 - 1; var362 >= 0; var362--) {
                    var361.method337(class186.field3218, false).method337(class208.field3734[var362].field2756.field2095, false);
                }
                if (var11 == 40) {
                    int var363 = var10[var8];
                    var361.method337(class122.field2175, false).method337(class199.method1287(var363, -1), false);
                }
                if (class239.field4422 != 0) {
                    class226.method1484(class70.method555(new class44[] { class44.field787, var5.field2095 }, -3), 0, 0, client.field608);
                }
                class173.method1099(117, "CS2 - scr:" + var5.field3186 + " op:" + var11 + new String(var361.method327((byte) 97)), var364);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)I")
    public final int method33(boolean arg0, int arg1) {
        if (this.field67 != null) {
            arg1 = (int) ((long) this.field73 * (long) arg1 / (long) this.field65);
        }
        if (arg0) {
            field77++;
            return arg1;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
    public static final void method34(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 9154) {
            field72 = null;
        }
        field70++;
        if (arg3 <= arg4) {
            for (int var5 = arg3; var5 < arg4; var5++) {
                class108.field1979[var5][arg0] = arg1;
            }
        } else {
            for (int var6 = arg4; var6 < arg3; var6++) {
                class108.field1979[var6][arg0] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BB)[B")
    public final byte[] method35(byte[] arg0, byte arg1) {
        field76++;
        if (arg1 != 84) {
            field60 = 35;
        }
        if (this.field67 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field73 / (long) this.field65) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field67[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field73 + var6;
                int var14 = var13 / this.field65;
                var5 += var14;
                var6 = var13 - this.field65 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZI)V")
    public static final void method36(int arg0, boolean arg1, int arg2) {
        field63++;
        if (class122.method835(arg0, 31)) {
            class19.method154(class4.field52[arg0], (byte) 126, arg2);
            if (!arg1) {
                field69 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BI)Lgb;")
    public static final class69 method37(byte[] arg0, int arg1) {
        field71++;
        if (arg0 == null) {
            return null;
        }
        class69 var2 = new class69(arg0, class88.field1684, class38.field672, class94.field1745, class175.field3039, class170.field2933, class58.field1082);
        if (arg1 != -18328) {
            method31((byte) -57);
        }
        class122.method840(-33);
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field79++;
        int var8 = class201.method1296(class14.field267, -125, arg2, class57.field1068);
        int var9 = class201.method1296(class14.field267, -127, arg0, class57.field1068);
        int var10 = class201.method1296(class70.field1337, arg7 + 353950695, arg4, class70.field1321);
        int var11 = class201.method1296(class70.field1337, arg7 + 353950692, arg5, class70.field1321);
        if (arg7 != -353950820) {
            method36(-45, true, 13);
        }
        int var12 = class201.method1296(class14.field267, arg7 + 353950692, arg2 + arg6, class57.field1068);
        int var13 = class201.method1296(class14.field267, -127, arg0 - arg6, class57.field1068);
        for (int var14 = var8; var14 < var12; var14++) {
            class42.method290(class108.field1979[var14], -7, var10, var11, arg3);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class42.method290(class108.field1979[var15], -7, var10, var11, arg3);
        }
        int var16 = class201.method1296(class70.field1337, arg7 + 353950694, arg4 + arg6, class70.field1321);
        int var17 = class201.method1296(class70.field1337, -127, arg5 - arg6, class70.field1321);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class108.field1979[var18];
            class42.method290(var19, -7, var10, var16, arg3);
            class42.method290(var19, -7, var16, var17, arg1);
            class42.method290(var19, -7, var17, var11, arg3);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(II)V")
    public class5(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class188.method1167(arg1, arg0, 41);
            int var4 = arg0 / var3;
            this.field65 = var4;
            int var5 = arg1 / var3;
            this.field73 = var5;
            this.field67 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field67[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var5 / (double) var4;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
