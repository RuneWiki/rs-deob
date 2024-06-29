import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class122 extends class282 {

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "Ldk;")
    public static class214 field2157 = new class214();

    @OriginalMember(owner = "client!ld", name = "ib", descriptor = "Ljf;")
    private static class229 field2164 = class212.method1457((byte) 73, "Loaded update list");

    @OriginalMember(owner = "client!ld", name = "gb", descriptor = "Ljf;")
    public static class229 field2162 = field2164;

    @OriginalMember(owner = "client!ld", name = "jb", descriptor = "Lni;")
    public static class24 field2165 = new class24(4);

    @OriginalMember(owner = "client!ld", name = "kb", descriptor = "Ljf;")
    private static class229 field2166 = class212.method1457((byte) 61, "Cancel");

    @OriginalMember(owner = "client!ld", name = "lb", descriptor = "Ljf;")
    public static class229 field2167 = field2166;

    @OriginalMember(owner = "client!ld", name = "nb", descriptor = "Ljf;")
    public static class229 field2169 = class212.method1457((byte) 90, "Angreifen");

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public int field2154;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!ld", name = "hb", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ld", name = "mb", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "Ljf;")
    public class229 field2145;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "[Z")
    public static boolean[] field2148;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "[[Z")
    public static boolean[][] field2161;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 14)
    public final void method862(int arg0) {
        this.field4845 |= Long.MIN_VALUE;
        if (this.method871((byte) -128) == 0L) {
            client.field4451.method375(42, this);
        }
        if (arg0 != -29044) {
            field2169 = (class229) null;
        }
        field2150++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lvc;IB)V", line = 30)
    public static final void method863(class192 arg0, int arg1, byte arg2) {
        field2152++;
        if (arg2 != 5) {
            method873((byte) -115);
        }
        Object[] var3 = arg0.field3324;
        int var4 = (Integer) var3[0];
        class57 var5 = class44.method374(var4, (byte) 79);
        if (var5 == null) {
            return;
        }
        class137.field2384 = 0;
        int var6 = 0;
        int var7 = -1;
        int var8 = 0;
        int[] var9 = var5.field1004;
        int[] var10 = var5.field1015;
        byte var11 = -1;
        try {
            class238.field4155 = new class229[var5.field1011];
            int var12 = 0;
            class173.field3010 = new int[var5.field1008];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field3325;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field3322;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field3327 == null ? -1 : arg0.field3327.field1247;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field3336;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field3327 == null ? -1 : arg0.field3327.field1193;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field3332 == null ? -1 : arg0.field3332.field1247;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field3332 == null ? -1 : arg0.field3332.field1193;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field3323;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field3330;
                    }
                    class173.field3010[var13++] = var16;
                } else if (var3[var14] instanceof class229) {
                    class229 var15 = (class229) var3[var14];
                    if (var15.method1641((byte) -64, class18.field286)) {
                        var15 = arg0.field3329;
                    }
                    class238.field4155[var12++] = var15;
                }
            }
            int var17 = 0;
            label4138: while (true) {
                var17++;
                if (arg1 < var17) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var498 = var9[var7];
                if (var498 < 100) {
                    if (var498 == 0) {
                        class222.field3790[var8++] = var10[var7];
                        continue;
                    }
                    if (var498 == 1) {
                        int var18 = var10[var7];
                        class222.field3790[var8++] = class286.field4908[var18];
                        continue;
                    }
                    if (var498 == 2) {
                        int var19 = var10[var7];
                        int var10000 = arg2 + 123;
                        var8--;
                        class249.method1797(var10000, class222.field3790[var8], var19);
                        continue;
                    }
                    if (var498 == 3) {
                        class24.field440[var6++] = var5.field1012[var7];
                        continue;
                    }
                    if (var498 == 6) {
                        var7 += var10[var7];
                        continue;
                    }
                    if (var498 == 7) {
                        var8 -= 2;
                        if (class222.field3790[var8 + 1] != class222.field3790[var8]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var498 == 8) {
                        var8 -= 2;
                        if (class222.field3790[var8 + 1] == class222.field3790[var8]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var498 == 9) {
                        var8 -= 2;
                        if (class222.field3790[var8 + 1] > class222.field3790[var8]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var498 == 10) {
                        var8 -= 2;
                        if (class222.field3790[var8 + 1] < class222.field3790[var8]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var498 == 21) {
                        if (class137.field2384 == 0) {
                            return;
                        }
                        class241 var20 = class170.field2970[--class137.field2384];
                        var7 = var20.field4254;
                        var5 = var20.field4247;
                        class238.field4155 = var20.field4256;
                        var10 = var5.field1015;
                        var9 = var5.field1004;
                        class173.field3010 = var20.field4251;
                        continue;
                    }
                    if (var498 == 25) {
                        int var21 = var10[var7];
                        class222.field3790[var8++] = class214.method1467(15, var21);
                        continue;
                    }
                    if (var498 == 27) {
                        int var22 = var10[var7];
                        var8--;
                        class270.method1905(class222.field3790[var8], (byte) -104, var22);
                        continue;
                    }
                    if (var498 == 31) {
                        var8 -= 2;
                        if (class222.field3790[var8] <= class222.field3790[var8 + 1]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var498 == 32) {
                        var8 -= 2;
                        if (class222.field3790[var8 + 1] <= class222.field3790[var8]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var498 == 33) {
                        class222.field3790[var8++] = class173.field3010[var10[var7]];
                        continue;
                    }
                    int var10001;
                    if (var498 == 34) {
                        var10001 = var10[var7];
                        var8--;
                        class173.field3010[var10001] = class222.field3790[var8];
                        continue;
                    }
                    if (var498 == 35) {
                        class24.field440[var6++] = class238.field4155[var10[var7]];
                        continue;
                    }
                    if (var498 == 36) {
                        var10001 = var10[var7];
                        var6--;
                        class238.field4155[var10001] = class24.field440[var6];
                        continue;
                    }
                    if (var498 == 37) {
                        int var23 = var10[var7];
                        var6 -= var23;
                        class229 var24 = class63.method473(var23, var6, (byte) -102, class24.field440);
                        class24.field440[var6++] = var24;
                        continue;
                    }
                    if (var498 == 38) {
                        var8--;
                        continue;
                    }
                    if (var498 == 39) {
                        var6--;
                        continue;
                    }
                    if (var498 == 40) {
                        int var25 = var10[var7];
                        class57 var26 = class44.method374(var25, (byte) 111);
                        int[] var27 = new int[var26.field1008];
                        class229[] var28 = new class229[var26.field1011];
                        for (int var29 = 0; var29 < var26.field1006; var29++) {
                            var27[var29] = class222.field3790[var8 - (var26.field1006 - var29)];
                        }
                        for (int var30 = 0; var30 < var26.field1007; var30++) {
                            var28[var30] = class24.field440[var6 + var30 - var26.field1007];
                        }
                        var8 -= var26.field1006;
                        var6 -= var26.field1007;
                        class241 var31 = new class241();
                        var31.field4256 = class238.field4155;
                        var31.field4251 = class173.field3010;
                        var31.field4247 = var5;
                        var31.field4254 = var7;
                        if (class170.field2970.length <= class137.field2384) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class170.field2970[class137.field2384++] = var31;
                        class173.field3010 = var27;
                        var10 = var26.field1015;
                        var9 = var26.field1004;
                        class238.field4155 = var28;
                        var7 = -1;
                        continue;
                    }
                    if (var498 == 42) {
                        class222.field3790[var8++] = class230.field4004[var10[var7]];
                        continue;
                    }
                    if (var498 == 43) {
                        int var32 = var10[var7];
                        var8--;
                        class230.field4004[var32] = class222.field3790[var8];
                        class269.method1900(var32, (byte) 11);
                        continue;
                    }
                    if (var498 == 44) {
                        int var33 = var10[var7] >> 16;
                        int var34 = var10[var7] & 0xFFFF;
                        var8--;
                        int var35 = class222.field3790[var8];
                        if (var35 >= 0 && var35 <= 5000) {
                            class303.field5151[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label4138;
                                }
                                class188.field3285[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 45) {
                        int var38 = var10[var7];
                        var8--;
                        int var39 = class222.field3790[var8];
                        if (var39 >= 0 && class303.field5151[var38] > var39) {
                            class222.field3790[var8++] = class188.field3285[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 46) {
                        var8 -= 2;
                        int var40 = class222.field3790[var8];
                        int var41 = var10[var7];
                        if (var40 >= 0 && var40 < class303.field5151[var41]) {
                            class188.field3285[var41][var40] = class222.field3790[var8 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 47) {
                        class229 var42 = class66.field1128[var10[var7]];
                        if (var42 == null) {
                            var42 = class277.field4766;
                        }
                        class24.field440[var6++] = var42;
                        continue;
                    }
                    if (var498 == 48) {
                        int var43 = var10[var7];
                        var6--;
                        class66.field1128[var43] = class24.field440[var6];
                        class288.method2013(var43, 2);
                        continue;
                    }
                    if (var498 == 51) {
                        class268 var44 = var5.field1010[var10[var7]];
                        var8--;
                        class93 var45 = (class93) var44.method1890((long) class222.field3790[var8], -101);
                        if (var45 != null) {
                            var7 += var45.field1678;
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
                if (var498 < 300) {
                    if (var498 == 100) {
                        var8 -= 3;
                        int var47 = class222.field3790[var8 + 1];
                        int var48 = class222.field3790[var8 + 2];
                        int var49 = class222.field3790[var8];
                        if (var47 != 0) {
                            class67 var50 = class96.method662(var49, true);
                            if (var50.field1243 == null) {
                                var50.field1243 = new class67[var48 + 1];
                            }
                            if (var50.field1243.length <= var48) {
                                class67[] var51 = new class67[var48 + 1];
                                for (int var52 = 0; var52 < var50.field1243.length; var52++) {
                                    var51[var52] = var50.field1243[var52];
                                }
                                var50.field1243 = var51;
                            }
                            if (var48 > 0 && var50.field1243[var48 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var48 - 1));
                            }
                            class67 var53 = new class67();
                            var53.field1249 = true;
                            var53.field1211 = var53.field1247 = var50.field1247;
                            var53.field1267 = var47;
                            var53.field1193 = var48;
                            var50.field1243[var48] = var53;
                            if (var46) {
                                class50.field888 = var53;
                            } else {
                                class151.field2606 = var53;
                            }
                            class194.method1328((byte) -124, var50);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var498 == 101) {
                        class67 var54 = var46 ? class50.field888 : class151.field2606;
                        if (var54.field1193 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class67 var55 = class96.method662(var54.field1247, true);
                        var55.field1243[var54.field1193] = null;
                        class194.method1328((byte) -123, var55);
                        continue;
                    }
                    if (var498 == 102) {
                        var8--;
                        class67 var56 = class96.method662(class222.field3790[var8], true);
                        var56.field1243 = null;
                        class194.method1328((byte) -89, var56);
                        continue;
                    }
                    if (var498 == 200) {
                        var8 -= 2;
                        int var57 = class222.field3790[var8 + 1];
                        int var58 = class222.field3790[var8];
                        class67 var59 = class189.method1305(var57, 2048, var58);
                        if (var59 != null && var57 != -1) {
                            class222.field3790[var8++] = 1;
                            if (var46) {
                                class50.field888 = var59;
                            } else {
                                class151.field2606 = var59;
                            }
                            continue;
                        }
                        class222.field3790[var8++] = 0;
                        continue;
                    }
                    if (var498 == 201) {
                        var8--;
                        int var60 = class222.field3790[var8];
                        class67 var61 = class96.method662(var60, true);
                        if (var61 == null) {
                            class222.field3790[var8++] = 0;
                        } else {
                            class222.field3790[var8++] = 1;
                            if (var46) {
                                class50.field888 = var61;
                            } else {
                                class151.field2606 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var498 < 500) {
                    if (var498 == 403) {
                        var8 -= 2;
                        int var487 = class222.field3790[var8];
                        if (var487 >= 7) {
                            var487 -= 7;
                        }
                        int var488 = class222.field3790[var8 + 1];
                        class301.field5124.field613.method1472((byte) 124, var487, var488);
                        continue;
                    }
                    if (var498 == 404) {
                        var8 -= 2;
                        int var489 = class222.field3790[var8 + 1];
                        int var490 = class222.field3790[var8];
                        class301.field5124.field613.method1471(32274, var490, var489);
                        continue;
                    }
                    if (var498 == 410) {
                        var8--;
                        boolean var491 = class222.field3790[var8] != 0;
                        class301.field5124.field613.method1470(var491, arg2 ^ 0xFFFFFEAC);
                        continue;
                    }
                } else if (var498 >= 1000 && var498 < 1100 || var498 >= 2000 && var498 < 2100) {
                    class67 var481;
                    if (var498 >= 2000) {
                        var8--;
                        var481 = class96.method662(class222.field3790[var8], true);
                        var498 -= 1000;
                    } else {
                        var481 = var46 ? class50.field888 : class151.field2606;
                    }
                    if (var498 == 1000) {
                        var8 -= 4;
                        var481.field1238 = class222.field3790[var8];
                        var481.field1294 = class222.field3790[var8 + 1];
                        int var482 = class222.field3790[var8 + 2];
                        if (var482 < 0) {
                            var482 = 0;
                        } else if (var482 > 5) {
                            var482 = 5;
                        }
                        int var483 = class222.field3790[var8 + 3];
                        if (var483 < 0) {
                            var483 = 0;
                        } else if (var483 > 5) {
                            var483 = 5;
                        }
                        var481.field1188 = (byte) var483;
                        var481.field1154 = (byte) var482;
                        class194.method1328((byte) -117, var481);
                        class274.method1922(var481, -18984);
                        if (var481.field1193 == -1) {
                            class157.method1051(var481.field1247, (byte) 97);
                        }
                        continue;
                    }
                    if (var498 == 1001) {
                        var8 -= 4;
                        var481.field1176 = class222.field3790[var8];
                        var481.field1241 = class222.field3790[var8 + 1];
                        var481.field1234 = 0;
                        var481.field1236 = 0;
                        int var484 = class222.field3790[var8 + 3];
                        int var485 = class222.field3790[var8 + 2];
                        if (var484 < 0) {
                            var484 = 0;
                        } else if (var484 > 4) {
                            var484 = 4;
                        }
                        var481.field1214 = (byte) var484;
                        if (var485 < 0) {
                            var485 = 0;
                        } else if (var485 > 4) {
                            var485 = 4;
                        }
                        var481.field1183 = (byte) var485;
                        class194.method1328((byte) -124, var481);
                        class274.method1922(var481, -18984);
                        if (var481.field1267 == 0) {
                            class243.method1755(var481, false, arg2 ^ 0xFFFFFFFA);
                        }
                        continue;
                    }
                    if (var498 == 1003) {
                        var8--;
                        boolean var486 = class222.field3790[var8] == 1;
                        if (var486 != var481.field1210) {
                            var481.field1210 = var486;
                            class194.method1328((byte) -116, var481);
                        }
                        if (var481.field1193 == -1) {
                            class331.method2259(var481.field1247, arg2 - 89);
                        }
                        continue;
                    }
                    if (var498 == 1004) {
                        var8 -= 2;
                        var481.field1156 = class222.field3790[var8];
                        var481.field1159 = class222.field3790[var8 + 1];
                        class194.method1328((byte) -104, var481);
                        class274.method1922(var481, arg2 - 18989);
                        if (var481.field1267 == 0) {
                            class243.method1755(var481, false, arg2 - 6);
                        }
                        continue;
                    }
                } else if (!(var498 < 1100 || var498 >= 1200) || !(var498 < 2100 || var498 >= 2200)) {
                    class67 var62;
                    if (var498 < 2000) {
                        var62 = var46 ? class50.field888 : class151.field2606;
                    } else {
                        var8--;
                        var62 = class96.method662(class222.field3790[var8], true);
                        var498 -= 1000;
                    }
                    if (var498 == 1100) {
                        var8 -= 2;
                        var62.field1297 = class222.field3790[var8];
                        if (var62.field1215 - var62.field1258 < var62.field1297) {
                            var62.field1297 = var62.field1215 - var62.field1258;
                        }
                        if (var62.field1297 < 0) {
                            var62.field1297 = 0;
                        }
                        var62.field1167 = class222.field3790[var8 + 1];
                        if (var62.field1167 > (var62.field1200 - var62.field1295)) {
                            var62.field1167 = var62.field1200 - var62.field1295;
                        }
                        if (var62.field1167 < 0) {
                            var62.field1167 = 0;
                        }
                        class194.method1328((byte) -70, var62);
                        if (var62.field1193 == -1) {
                            class84.method608(var62.field1247, -12586);
                        }
                        continue;
                    }
                    if (var498 == 1101) {
                        var8--;
                        var62.field1292 = class222.field3790[var8];
                        class194.method1328((byte) -116, var62);
                        if (var62.field1193 == -1) {
                            class183.method1249(var62.field1247, -122);
                        }
                        continue;
                    }
                    if (var498 == 1102) {
                        var8--;
                        var62.field1184 = class222.field3790[var8] == 1;
                        class194.method1328((byte) -123, var62);
                        continue;
                    }
                    if (var498 == 1103) {
                        var8--;
                        var62.field1133 = class222.field3790[var8];
                        class194.method1328((byte) -100, var62);
                        continue;
                    }
                    if (var498 == 1104) {
                        var8--;
                        var62.field1189 = class222.field3790[var8];
                        class194.method1328((byte) -55, var62);
                        continue;
                    }
                    if (var498 == 1105) {
                        var8--;
                        var62.field1274 = class222.field3790[var8];
                        class194.method1328((byte) -67, var62);
                        continue;
                    }
                    if (var498 == 1106) {
                        var8--;
                        var62.field1255 = class222.field3790[var8];
                        class194.method1328((byte) -55, var62);
                        continue;
                    }
                    if (var498 == 1107) {
                        var8--;
                        var62.field1260 = class222.field3790[var8] == 1;
                        class194.method1328((byte) -105, var62);
                        continue;
                    }
                    if (var498 == 1108) {
                        var62.field1134 = 1;
                        var8--;
                        var62.field1288 = class222.field3790[var8];
                        class194.method1328((byte) -80, var62);
                        if (var62.field1193 == -1) {
                            class225.method1555(arg2 ^ 0x7602, var62.field1247);
                        }
                        continue;
                    }
                    if (var498 == 1109) {
                        var8 -= 6;
                        var62.field1179 = class222.field3790[var8];
                        var62.field1143 = class222.field3790[var8 + 1];
                        var62.field1231 = class222.field3790[var8 + 2];
                        var62.field1209 = class222.field3790[var8 + 3];
                        var62.field1285 = class222.field3790[var8 + 4];
                        var62.field1171 = class222.field3790[var8 + 5];
                        class194.method1328((byte) -61, var62);
                        if (var62.field1193 == -1) {
                            class76.method545(90, var62.field1247);
                            class280.method1962(138318040, var62.field1247);
                        }
                        continue;
                    }
                    if (var498 == 1110) {
                        var8--;
                        int var63 = class222.field3790[var8];
                        if (var62.field1276 != var63) {
                            var62.field1293 = 0;
                            var62.field1276 = var63;
                            var62.field1252 = 0;
                            class194.method1328((byte) -120, var62);
                        }
                        if (var62.field1193 == -1) {
                            class306.method2087(127, var62.field1247);
                        }
                        continue;
                    }
                    if (var498 == 1111) {
                        var8--;
                        var62.field1248 = class222.field3790[var8] == 1;
                        class194.method1328((byte) -111, var62);
                        continue;
                    }
                    if (var498 == 1112) {
                        var6--;
                        class229 var64 = class24.field440[var6];
                        if (!var64.method1641((byte) -64, var62.field1235)) {
                            var62.field1235 = var64;
                            class194.method1328((byte) -112, var62);
                        }
                        if (var62.field1193 == -1) {
                            class23.method224(var62.field1247, (byte) -67);
                        }
                        continue;
                    }
                    if (var498 == 1113) {
                        var8--;
                        var62.field1141 = class222.field3790[var8];
                        class194.method1328((byte) -121, var62);
                        continue;
                    }
                    if (var498 == 1114) {
                        var8 -= 3;
                        var62.field1194 = class222.field3790[var8];
                        var62.field1254 = class222.field3790[var8 + 1];
                        var62.field1246 = class222.field3790[var8 + 2];
                        class194.method1328((byte) -78, var62);
                        continue;
                    }
                    if (var498 == 1115) {
                        var8--;
                        var62.field1286 = class222.field3790[var8] == 1;
                        class194.method1328((byte) -60, var62);
                        continue;
                    }
                    if (var498 == 1116) {
                        var8--;
                        var62.field1178 = class222.field3790[var8];
                        class194.method1328((byte) -108, var62);
                        continue;
                    }
                    if (var498 == 1117) {
                        var8--;
                        var62.field1196 = class222.field3790[var8];
                        class194.method1328((byte) -109, var62);
                        continue;
                    }
                    if (var498 == 1118) {
                        var8--;
                        var62.field1145 = class222.field3790[var8] == 1;
                        class194.method1328((byte) -68, var62);
                        continue;
                    }
                    if (var498 == 1119) {
                        var8--;
                        var62.field1185 = class222.field3790[var8] == 1;
                        class194.method1328((byte) -74, var62);
                        continue;
                    }
                    if (var498 == 1120) {
                        var8 -= 2;
                        var62.field1215 = class222.field3790[var8];
                        var62.field1200 = class222.field3790[var8 + 1];
                        class194.method1328((byte) -123, var62);
                        if (var62.field1267 == 0) {
                            class243.method1755(var62, false, -1);
                        }
                        continue;
                    }
                    if (var498 == 1121) {
                        var8 -= 2;
                        var62.field1269 = (short) class222.field3790[var8];
                        var62.field1163 = (short) class222.field3790[var8 + 1];
                        class194.method1328((byte) -116, var62);
                        continue;
                    }
                    if (var498 == 1122) {
                        var8--;
                        var62.field1229 = class222.field3790[var8] == 1;
                        class194.method1328((byte) -92, var62);
                        continue;
                    }
                    if (var498 == 1123) {
                        var8--;
                        var62.field1171 = class222.field3790[var8];
                        class194.method1328((byte) -96, var62);
                        if (var62.field1193 == -1) {
                            class76.method545(107, var62.field1247);
                        }
                        continue;
                    }
                } else if (!(var498 < 1200 || var498 >= 1300) || !(var498 < 2200 || var498 >= 2300)) {
                    class67 var65;
                    if (var498 < 2000) {
                        var65 = var46 ? class50.field888 : class151.field2606;
                    } else {
                        var8--;
                        var65 = class96.method662(class222.field3790[var8], true);
                        var498 -= 1000;
                    }
                    class194.method1328((byte) -79, var65);
                    if (var498 == 1200 || var498 == 1205) {
                        var8 -= 2;
                        int var66 = class222.field3790[var8];
                        int var67 = class222.field3790[var8 + 1];
                        if (var65.field1193 == -1) {
                            class52.method419(var65.field1247, arg2 + 98);
                            class76.method545(arg2 + 47, var65.field1247);
                            class280.method1962(138318040, var65.field1247);
                        }
                        if (var66 == -1) {
                            var65.field1165 = -1;
                            var65.field1134 = 1;
                            var65.field1288 = -1;
                        } else {
                            var65.field1165 = var66;
                            var65.field1273 = var67;
                            class313 var68 = class113.method799(var66, (byte) 50);
                            var65.field1171 = var68.field5326;
                            if (var65.field1234 > 0) {
                                var65.field1171 = var65.field1171 * 32 / var65.field1234;
                            } else if (var65.field1176 > 0) {
                                var65.field1171 = var65.field1171 * 32 / var65.field1176;
                            }
                            var65.field1209 = var68.field5317;
                            var65.field1143 = var68.field5331;
                            var65.field1285 = var68.field5279;
                            var65.field1179 = var68.field5308;
                            if (var498 == 1205) {
                                var65.field1213 = false;
                            } else {
                                var65.field1213 = true;
                            }
                            var65.field1231 = var68.field5330;
                        }
                        continue;
                    }
                    if (var498 == 1201) {
                        var65.field1134 = 2;
                        var8--;
                        var65.field1288 = class222.field3790[var8];
                        if (var65.field1193 == -1) {
                            class225.method1555(30215, var65.field1247);
                        }
                        continue;
                    }
                    if (var498 == 1202) {
                        var65.field1134 = 3;
                        var65.field1288 = class301.field5124.field613.method1466(true);
                        if (var65.field1193 == -1) {
                            class225.method1555(30215, var65.field1247);
                        }
                        continue;
                    }
                    if (var498 == 1203) {
                        var65.field1134 = 6;
                        var8--;
                        var65.field1288 = class222.field3790[var8];
                        if (var65.field1193 == -1) {
                            class225.method1555(30215, var65.field1247);
                        }
                        continue;
                    }
                    if (var498 == 1204) {
                        var65.field1134 = 5;
                        var8--;
                        var65.field1288 = class222.field3790[var8];
                        if (var65.field1193 == -1) {
                            class225.method1555(arg2 + 30210, var65.field1247);
                        }
                        continue;
                    }
                } else if (var498 >= 1300 && var498 < 1400 || var498 >= 2300 && var498 < 2400) {
                    class67 var477;
                    if (var498 < 2000) {
                        var477 = var46 ? class50.field888 : class151.field2606;
                    } else {
                        var8--;
                        var477 = class96.method662(class222.field3790[var8], true);
                        var498 -= 1000;
                    }
                    if (var498 == 1300) {
                        var8--;
                        int var478 = class222.field3790[var8] - 1;
                        if (var478 >= 0 && var478 <= 9) {
                            var6--;
                            var477.method493(var478, (byte) 1, class24.field440[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var498 == 1301) {
                        var8 -= 2;
                        int var479 = class222.field3790[var8];
                        int var480 = class222.field3790[var8 + 1];
                        var477.field1169 = class189.method1305(var480, arg2 + 2043, var479);
                        continue;
                    }
                    if (var498 == 1302) {
                        var8--;
                        var477.field1270 = class222.field3790[var8] == 1;
                        continue;
                    }
                    if (var498 == 1303) {
                        var8--;
                        var477.field1256 = class222.field3790[var8];
                        continue;
                    }
                    if (var498 == 1304) {
                        var8--;
                        var477.field1275 = class222.field3790[var8];
                        continue;
                    }
                    if (var498 == 1305) {
                        var6--;
                        var477.field1219 = class24.field440[var6];
                        continue;
                    }
                    if (var498 == 1306) {
                        var6--;
                        var477.field1291 = class24.field440[var6];
                        continue;
                    }
                    if (var498 == 1307) {
                        var477.field1257 = null;
                        continue;
                    }
                } else {
                    if (var498 >= 1400 && var498 < 1500 || var498 >= 2400 && var498 < 2500) {
                        class67 var470;
                        if (var498 >= 2000) {
                            var8--;
                            var470 = class96.method662(class222.field3790[var8], true);
                            var498 -= 1000;
                        } else {
                            var470 = var46 ? class50.field888 : class151.field2606;
                        }
                        int[] var471 = null;
                        var6--;
                        class229 var472 = class24.field440[var6];
                        if (var472.method1626(arg2 - 102) > 0 && var472.method1642(92, var472.method1626(-85) - 1) == 89) {
                            var8--;
                            int var473 = class222.field3790[var8];
                            if (var473 > 0) {
                                var471 = new int[var473];
                                while ((var473--) > 0) {
                                    var8--;
                                    var471[var473] = class222.field3790[var8];
                                }
                            }
                            var472 = var472.method1639((byte) -20, var472.method1626(-92) - 1, 0);
                        }
                        Object[] var474 = new Object[var472.method1626(47) + 1];
                        for (int var475 = var474.length - 1; var475 >= 1; var475--) {
                            if (var472.method1642(92, var475 - 1) == 115) {
                                var6--;
                                var474[var475] = class24.field440[var6];
                            } else {
                                var8--;
                                var474[var475] = Integer.valueOf(class222.field3790[var8]);
                            }
                        }
                        var8--;
                        int var476 = class222.field3790[var8];
                        if (var476 == -1) {
                            var474 = null;
                        } else {
                            var474[0] = Integer.valueOf(var476);
                        }
                        if (var498 == 1400) {
                            var470.field1242 = var474;
                        } else if (var498 == 1401) {
                            var470.field1161 = var474;
                        } else if (var498 == 1402) {
                            var470.field1157 = var474;
                        } else if (var498 == 1403) {
                            var470.field1198 = var474;
                        } else if (var498 == 1404) {
                            var470.field1278 = var474;
                        } else if (var498 == 1405) {
                            var470.field1164 = var474;
                        } else if (var498 == 1406) {
                            var470.field1142 = var474;
                        } else if (var498 == 1407) {
                            var470.field1282 = var474;
                            var470.field1190 = var471;
                        } else if (var498 == 1408) {
                            var470.field1155 = var474;
                        } else if (var498 == 1409) {
                            var470.field1223 = var474;
                        } else if (var498 == 1410) {
                            var470.field1232 = var474;
                        } else if (var498 == 1411) {
                            var470.field1203 = var474;
                        } else if (var498 == 1412) {
                            var470.field1140 = var474;
                        } else if (var498 == 1414) {
                            var470.field1173 = var474;
                            var470.field1262 = var471;
                        } else if (var498 == 1415) {
                            var470.field1212 = var471;
                            var470.field1220 = var474;
                        } else if (var498 == 1416) {
                            var470.field1172 = var474;
                        } else if (var498 == 1417) {
                            var470.field1150 = var474;
                        } else if (var498 == 1418) {
                            var470.field1239 = var474;
                        } else if (var498 == 1419) {
                            var470.field1149 = var474;
                        } else if (var498 == 1420) {
                            var470.field1259 = var474;
                        } else if (var498 == 1421) {
                            var470.field1191 = var474;
                        } else if (var498 == 1422) {
                            var470.field1228 = var474;
                        } else if (var498 == 1423) {
                            var470.field1148 = var474;
                        } else if (var498 == 1424) {
                            var470.field1175 = var474;
                        } else if (var498 == 1425) {
                            var470.field1284 = var474;
                        } else if (var498 == 1426) {
                            var470.field1217 = var474;
                        } else if (var498 == 1427) {
                            var470.field1138 = var474;
                        } else if (var498 == 1428) {
                            var470.field1180 = var471;
                            var470.field1137 = var474;
                        } else if (var498 == 1429) {
                            var470.field1230 = var471;
                            var470.field1151 = var474;
                        }
                        var470.field1197 = true;
                        continue;
                    }
                    if (var498 < 1600) {
                        class67 var69 = var46 ? class50.field888 : class151.field2606;
                        if (var498 == 1500) {
                            class222.field3790[var8++] = var69.field1195;
                            continue;
                        }
                        if (var498 == 1501) {
                            class222.field3790[var8++] = var69.field1207;
                            continue;
                        }
                        if (var498 == 1502) {
                            class222.field3790[var8++] = var69.field1258;
                            continue;
                        }
                        if (var498 == 1503) {
                            class222.field3790[var8++] = var69.field1295;
                            continue;
                        }
                        if (var498 == 1504) {
                            class222.field3790[var8++] = var69.field1210 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 1505) {
                            class222.field3790[var8++] = var69.field1211;
                            continue;
                        }
                    } else if (var498 < 1700) {
                        class67 var469 = var46 ? class50.field888 : class151.field2606;
                        if (var498 == 1600) {
                            class222.field3790[var8++] = var469.field1297;
                            continue;
                        }
                        if (var498 == 1601) {
                            class222.field3790[var8++] = var469.field1167;
                            continue;
                        }
                        if (var498 == 1602) {
                            class24.field440[var6++] = var469.field1235;
                            continue;
                        }
                        if (var498 == 1603) {
                            class222.field3790[var8++] = var469.field1215;
                            continue;
                        }
                        if (var498 == 1604) {
                            class222.field3790[var8++] = var469.field1200;
                            continue;
                        }
                        if (var498 == 1605) {
                            class222.field3790[var8++] = var469.field1171;
                            continue;
                        }
                        if (var498 == 1606) {
                            class222.field3790[var8++] = var469.field1231;
                            continue;
                        }
                        if (var498 == 1607) {
                            class222.field3790[var8++] = var469.field1285;
                            continue;
                        }
                        if (var498 == 1608) {
                            class222.field3790[var8++] = var469.field1209;
                            continue;
                        }
                        if (var498 == 1609) {
                            class222.field3790[var8++] = var469.field1133;
                            continue;
                        }
                        if (var498 == 1610) {
                            class222.field3790[var8++] = var469.field1179;
                            continue;
                        }
                        if (var498 == 1611) {
                            class222.field3790[var8++] = var469.field1143;
                            continue;
                        }
                    } else if (var498 < 1800) {
                        class67 var468 = var46 ? class50.field888 : class151.field2606;
                        if (var498 == 1700) {
                            class222.field3790[var8++] = var468.field1165;
                            continue;
                        }
                        if (var498 == 1701) {
                            if (var468.field1165 == -1) {
                                class222.field3790[var8++] = 0;
                            } else {
                                class222.field3790[var8++] = var468.field1273;
                            }
                            continue;
                        }
                        if (var498 == 1702) {
                            class222.field3790[var8++] = var468.field1193;
                            continue;
                        }
                    } else if (var498 < 1900) {
                        class67 var70 = var46 ? class50.field888 : class151.field2606;
                        if (var498 == 1800) {
                            class222.field3790[var8++] = class93.method651((byte) 108, client.method1820(var70));
                            continue;
                        }
                        if (var498 == 1801) {
                            var8--;
                            int var71 = class222.field3790[var8];
                            int var499 = var71 - 1;
                            if (var70.field1257 != null && var499 < var70.field1257.length && var70.field1257[var499] != null) {
                                class24.field440[var6++] = var70.field1257[var499];
                                continue;
                            }
                            class24.field440[var6++] = class260.field4522;
                            continue;
                        }
                        if (var498 == 1802) {
                            if (var70.field1219 == null) {
                                class24.field440[var6++] = class260.field4522;
                            } else {
                                class24.field440[var6++] = var70.field1219;
                            }
                            continue;
                        }
                    } else if (var498 < 2600) {
                        var8--;
                        class67 var467 = class96.method662(class222.field3790[var8], true);
                        if (var498 == 2500) {
                            class222.field3790[var8++] = var467.field1195;
                            continue;
                        }
                        if (var498 == 2501) {
                            class222.field3790[var8++] = var467.field1207;
                            continue;
                        }
                        if (var498 == 2502) {
                            class222.field3790[var8++] = var467.field1258;
                            continue;
                        }
                        if (var498 == 2503) {
                            class222.field3790[var8++] = var467.field1295;
                            continue;
                        }
                        if (var498 == 2504) {
                            class222.field3790[var8++] = var467.field1210 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 2505) {
                            class222.field3790[var8++] = var467.field1211;
                            continue;
                        }
                    } else if (var498 < 2700) {
                        var8--;
                        class67 var72 = class96.method662(class222.field3790[var8], true);
                        if (var498 == 2600) {
                            class222.field3790[var8++] = var72.field1297;
                            continue;
                        }
                        if (var498 == 2601) {
                            class222.field3790[var8++] = var72.field1167;
                            continue;
                        }
                        if (var498 == 2602) {
                            class24.field440[var6++] = var72.field1235;
                            continue;
                        }
                        if (var498 == 2603) {
                            class222.field3790[var8++] = var72.field1215;
                            continue;
                        }
                        if (var498 == 2604) {
                            class222.field3790[var8++] = var72.field1200;
                            continue;
                        }
                        if (var498 == 2605) {
                            class222.field3790[var8++] = var72.field1171;
                            continue;
                        }
                        if (var498 == 2606) {
                            class222.field3790[var8++] = var72.field1231;
                            continue;
                        }
                        if (var498 == 2607) {
                            class222.field3790[var8++] = var72.field1285;
                            continue;
                        }
                        if (var498 == 2608) {
                            class222.field3790[var8++] = var72.field1209;
                            continue;
                        }
                        if (var498 == 2609) {
                            class222.field3790[var8++] = var72.field1133;
                            continue;
                        }
                        if (var498 == 2610) {
                            class222.field3790[var8++] = var72.field1179;
                            continue;
                        }
                        if (var498 == 2611) {
                            class222.field3790[var8++] = var72.field1143;
                            continue;
                        }
                    } else if (var498 < 2800) {
                        if (var498 == 2700) {
                            var8--;
                            class67 var73 = class96.method662(class222.field3790[var8], true);
                            class222.field3790[var8++] = var73.field1165;
                            continue;
                        }
                        if (var498 != 2701) {
                            if (var498 == 2702) {
                                var8--;
                                int var75 = class222.field3790[var8];
                                class321 var76 = (class321) class151.field2618.method1890((long) var75, -92);
                                if (var76 == null) {
                                    class222.field3790[var8++] = 0;
                                } else {
                                    class222.field3790[var8++] = 1;
                                }
                                continue;
                            }
                            if (var498 == 2703) {
                                var8--;
                                class67 var77 = class96.method662(class222.field3790[var8], true);
                                if (var77.field1243 == null) {
                                    class222.field3790[var8++] = 0;
                                    continue;
                                }
                                int var78 = var77.field1243.length;
                                for (int var79 = 0; var79 < var77.field1243.length; var79++) {
                                    if (var77.field1243[var79] == null) {
                                        var78 = var79;
                                        break;
                                    }
                                }
                                class222.field3790[var8++] = var78;
                                continue;
                            }
                            if (var498 != 2704 && var498 != 2705) {
                                throw new IllegalStateException();
                            }
                            var8 -= 2;
                            int var80 = class222.field3790[var8];
                            int var81 = class222.field3790[var8 + 1];
                            class321 var82 = (class321) class151.field2618.method1890((long) var80, -121);
                            if (var82 != null && var82.field5432 == var81) {
                                class222.field3790[var8++] = 1;
                                continue;
                            }
                            class222.field3790[var8++] = 0;
                            continue;
                        }
                        var8--;
                        class67 var74 = class96.method662(class222.field3790[var8], true);
                        if (var74.field1165 == -1) {
                            class222.field3790[var8++] = 0;
                        } else {
                            class222.field3790[var8++] = var74.field1273;
                        }
                        continue;
                    } else if (var498 < 2900) {
                        var8--;
                        class67 var83 = class96.method662(class222.field3790[var8], true);
                        if (var498 == 2800) {
                            class222.field3790[var8++] = class93.method651((byte) 108, client.method1820(var83));
                            continue;
                        }
                        if (var498 == 2801) {
                            var8--;
                            int var84 = class222.field3790[var8];
                            int var500 = var84 - 1;
                            if (var83.field1257 != null && var83.field1257.length > var500 && var83.field1257[var500] != null) {
                                class24.field440[var6++] = var83.field1257[var500];
                                continue;
                            }
                            class24.field440[var6++] = class260.field4522;
                            continue;
                        }
                        if (var498 == 2802) {
                            if (var83.field1219 == null) {
                                class24.field440[var6++] = class260.field4522;
                            } else {
                                class24.field440[var6++] = var83.field1219;
                            }
                            continue;
                        }
                    } else if (var498 < 3200) {
                        if (var498 == 3100) {
                            var6--;
                            class229 var85 = class24.field440[var6];
                            class28.method245((byte) -75, 0, class260.field4522, var85);
                            continue;
                        }
                        if (var498 == 3101) {
                            var8 -= 2;
                            class95.method658(class301.field5124, -1, class222.field3790[var8 + 1], class222.field3790[var8]);
                            continue;
                        }
                        if (var498 == 3103) {
                            class115.method829(arg2 - 125);
                            continue;
                        }
                        if (var498 == 3104) {
                            class41.field744++;
                            var6--;
                            class229 var86 = class24.field440[var6];
                            int var87 = 0;
                            if (var86.method1620((byte) -41)) {
                                var87 = var86.method1629(43);
                            }
                            class84.field1608.method1397(20, arg2 ^ 0x5);
                            class84.field1608.method100(var87, 65280);
                            continue;
                        }
                        if (var498 == 3105) {
                            class52.field911++;
                            var6--;
                            class229 var88 = class24.field440[var6];
                            class84.field1608.method1397(3, 0);
                            class84.field1608.method118(var88.method1617(88), (byte) -126);
                            continue;
                        }
                        if (var498 == 3106) {
                            class179.field3103++;
                            var6--;
                            class229 var89 = class24.field440[var6];
                            class84.field1608.method1397(120, 0);
                            class84.field1608.method140(var89.method1626(-125) + 1, (byte) 75);
                            class84.field1608.method107((byte) -21, var89);
                            continue;
                        }
                        if (var498 == 3107) {
                            var6--;
                            class229 var90 = class24.field440[var6];
                            var8--;
                            int var91 = class222.field3790[var8];
                            class189.method1306(var91, (byte) -122, var90);
                            continue;
                        }
                        if (var498 == 3108) {
                            var8 -= 3;
                            int var92 = class222.field3790[var8 + 1];
                            int var93 = class222.field3790[var8];
                            int var94 = class222.field3790[var8 + 2];
                            class67 var95 = class96.method662(var94, true);
                            class290.method2021(arg2 - 26926, var92, var93, var95);
                            continue;
                        }
                        if (var498 == 3109) {
                            var8 -= 2;
                            int var96 = class222.field3790[var8];
                            class67 var97 = var46 ? class50.field888 : class151.field2606;
                            int var98 = class222.field3790[var8 + 1];
                            class290.method2021(-26921, var98, var96, var97);
                            continue;
                        }
                        if (var498 == 3110) {
                            class283.field4862++;
                            var8--;
                            int var99 = class222.field3790[var8];
                            class84.field1608.method1397(181, arg2 - 5);
                            class84.field1608.method125(-25369, var99);
                            continue;
                        }
                    } else if (var498 < 3300) {
                        if (var498 == 3200) {
                            var8 -= 3;
                            class193.method1321(class222.field3790[var8 + 2], class222.field3790[var8 + 1], arg2 ^ 0xFFFFFFA2, class222.field3790[var8]);
                            continue;
                        }
                        if (var498 == 3201) {
                            var8--;
                            class180.method1241(class222.field3790[var8], (byte) -85);
                            continue;
                        }
                        if (var498 == 3202) {
                            var8 -= 2;
                            class161.method1084(class222.field3790[var8], class222.field3790[var8 + 1], arg2 ^ 0xFFFFFFFA);
                            continue;
                        }
                    } else if (var498 < 3400) {
                        if (var498 == 3300) {
                            class222.field3790[var8++] = class199.field3475;
                            continue;
                        }
                        if (var498 == 3301) {
                            var8 -= 2;
                            int var100 = class222.field3790[var8 + 1];
                            int var101 = class222.field3790[var8];
                            class222.field3790[var8++] = class283.method1992(var100, (byte) -98, var101);
                            continue;
                        }
                        if (var498 == 3302) {
                            var8 -= 2;
                            int var102 = class222.field3790[var8 + 1];
                            int var103 = class222.field3790[var8];
                            class222.field3790[var8++] = class125.method882(var102, arg2 - 2, var103);
                            continue;
                        }
                        if (var498 == 3303) {
                            var8 -= 2;
                            int var104 = class222.field3790[var8];
                            int var105 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = class142.method993(123, var105, var104);
                            continue;
                        }
                        if (var498 == 3304) {
                            var8--;
                            int var106 = class222.field3790[var8];
                            class222.field3790[var8++] = class41.method350(5, var106).field52;
                            continue;
                        }
                        if (var498 == 3305) {
                            var8--;
                            int var107 = class222.field3790[var8];
                            class222.field3790[var8++] = class236.field4081[var107];
                            continue;
                        }
                        if (var498 == 3306) {
                            var8--;
                            int var108 = class222.field3790[var8];
                            class222.field3790[var8++] = class297.field5081[var108];
                            continue;
                        }
                        if (var498 == 3307) {
                            var8--;
                            int var109 = class222.field3790[var8];
                            class222.field3790[var8++] = class193.field3347[var109];
                            continue;
                        }
                        if (var498 == 3308) {
                            int var110 = class16.field254;
                            int var111 = (class301.field5124.field1983 >> 7) + class258.field4503;
                            int var112 = (class301.field5124.field2028 >> 7) + class213.field3649;
                            class222.field3790[var8++] = (var111 << 14) + (var110 << 28) + var112;
                            continue;
                        }
                        if (var498 == 3309) {
                            var8--;
                            int var113 = class222.field3790[var8];
                            class222.field3790[var8++] = class305.method2086(268430273, var113) >> 14;
                            continue;
                        }
                        if (var498 == 3310) {
                            var8--;
                            int var114 = class222.field3790[var8];
                            class222.field3790[var8++] = var114 >> 28;
                            continue;
                        }
                        if (var498 == 3311) {
                            var8--;
                            int var115 = class222.field3790[var8];
                            class222.field3790[var8++] = class305.method2086(var115, 16383);
                            continue;
                        }
                        if (var498 == 3312) {
                            class222.field3790[var8++] = class323.field5456 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3313) {
                            var8 -= 2;
                            int var116 = class222.field3790[var8] + 32768;
                            int var117 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = class283.method1992(var117, (byte) 104, var116);
                            continue;
                        }
                        if (var498 == 3314) {
                            var8 -= 2;
                            int var118 = class222.field3790[var8] + 32768;
                            int var119 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = class125.method882(var119, 3, var118);
                            continue;
                        }
                        if (var498 == 3315) {
                            var8 -= 2;
                            int var120 = class222.field3790[var8] + 32768;
                            int var121 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = class142.method993(123, var121, var120);
                            continue;
                        }
                        if (var498 == 3316) {
                            if (class200.field3500 >= 2) {
                                class222.field3790[var8++] = class200.field3500;
                            } else {
                                class222.field3790[var8++] = 0;
                            }
                            continue;
                        }
                        if (var498 == 3317) {
                            class222.field3790[var8++] = class208.field3612;
                            continue;
                        }
                        if (var498 == 3318) {
                            class222.field3790[var8++] = class3.field14;
                            continue;
                        }
                        if (var498 == 3321) {
                            class222.field3790[var8++] = class200.field3496;
                            continue;
                        }
                        if (var498 == 3322) {
                            class222.field3790[var8++] = class160.field2713;
                            continue;
                        }
                        if (var498 == 3323) {
                            if (class187.field3283 >= 5 && class187.field3283 <= 9) {
                                class222.field3790[var8++] = 1;
                                continue;
                            }
                            class222.field3790[var8++] = 0;
                            continue;
                        }
                        if (var498 == 3324) {
                            if (class187.field3283 >= 5 && class187.field3283 <= 9) {
                                class222.field3790[var8++] = class187.field3283;
                                continue;
                            }
                            class222.field3790[var8++] = 0;
                            continue;
                        }
                        if (var498 == 3325) {
                            class222.field3790[var8++] = class24.field450 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3326) {
                            class222.field3790[var8++] = class301.field5124.field623;
                            continue;
                        }
                        if (var498 == 3327) {
                            class222.field3790[var8++] = class301.field5124.field613.field3668 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3328) {
                            class222.field3790[var8++] = class283.field4852 && !class281.field4808 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3329) {
                            class222.field3790[var8++] = class252.field4402 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3330) {
                            var8--;
                            int var122 = class222.field3790[var8];
                            class222.field3790[var8++] = class132.method918(var122, true);
                            continue;
                        }
                        if (var498 == 3331) {
                            var8 -= 2;
                            int var123 = class222.field3790[var8];
                            int var124 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = class205.method1426(false, class260.method1850(arg2, -32067), var124, var123);
                            continue;
                        }
                        if (var498 == 3332) {
                            var8 -= 2;
                            int var125 = class222.field3790[var8];
                            int var126 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = class205.method1426(true, -32072, var126, var125);
                            continue;
                        }
                        if (var498 == 3333) {
                            class222.field3790[var8++] = class71.field1369;
                            continue;
                        }
                        if (var498 == 3335) {
                            class222.field3790[var8++] = class128.field2290;
                            continue;
                        }
                    } else if (var498 < 3500) {
                        if (var498 == 3400) {
                            var8 -= 2;
                            int var450 = class222.field3790[var8 + 1];
                            int var451 = class222.field3790[var8];
                            class16 var452 = class289.method2016(var451, 128);
                            if (var452.field247 != 115) {
                            }
                            class24.field440[var6++] = var452.method154(var450, (byte) 82);
                            continue;
                        }
                        if (var498 == 3408) {
                            var8 -= 4;
                            int var453 = class222.field3790[var8];
                            int var454 = class222.field3790[var8 + 1];
                            int var455 = class222.field3790[var8 + 2];
                            int var456 = class222.field3790[var8 + 3];
                            class16 var457 = class289.method2016(var455, 128);
                            if (var457.field265 == var453 && var457.field247 == var454) {
                                if (var454 == 115) {
                                    class24.field440[var6++] = var457.method154(var456, (byte) 82);
                                } else {
                                    class222.field3790[var8++] = var457.method156(var456, 13);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var498 == 3409) {
                            var8 -= 3;
                            int var458 = class222.field3790[var8];
                            int var459 = class222.field3790[var8 + 1];
                            int var460 = class222.field3790[var8 + 2];
                            if (var459 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class16 var461 = class289.method2016(var459, arg2 + 123);
                            if (var461.field247 != var458) {
                                throw new RuntimeException("C3409-1");
                            }
                            class222.field3790[var8++] = var461.method159(var460, (byte) 9) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3410) {
                            var8--;
                            int var462 = class222.field3790[var8];
                            var6--;
                            class229 var463 = class24.field440[var6];
                            if (var462 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class16 var464 = class289.method2016(var462, 128);
                            if (var464.field247 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class222.field3790[var8++] = var464.method163((byte) 38, var463) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3411) {
                            var8--;
                            int var465 = class222.field3790[var8];
                            class16 var466 = class289.method2016(var465, 128);
                            class222.field3790[var8++] = var466.field245.method1895(0);
                            continue;
                        }
                    } else if (var498 < 3700) {
                        if (var498 == 3600) {
                            if (class185.field3243 == 0) {
                                class222.field3790[var8++] = -2;
                            } else if (class185.field3243 == 1) {
                                class222.field3790[var8++] = -1;
                            } else {
                                class222.field3790[var8++] = class113.field2044;
                            }
                            continue;
                        }
                        if (var498 == 3601) {
                            var8--;
                            int var127 = class222.field3790[var8];
                            if (class185.field3243 == 2 && var127 < class113.field2044) {
                                class24.field440[var6++] = class74.field1403[var127];
                                continue;
                            }
                            class24.field440[var6++] = class260.field4522;
                            continue;
                        }
                        if (var498 == 3602) {
                            var8--;
                            int var128 = class222.field3790[var8];
                            if (class185.field3243 == 2 && class113.field2044 > var128) {
                                class222.field3790[var8++] = class12.field145[var128];
                                continue;
                            }
                            class222.field3790[var8++] = 0;
                            continue;
                        }
                        if (var498 == 3603) {
                            var8--;
                            int var129 = class222.field3790[var8];
                            if (class185.field3243 == 2 && var129 < class113.field2044) {
                                class222.field3790[var8++] = class240.field4231[var129];
                                continue;
                            }
                            class222.field3790[var8++] = 0;
                            continue;
                        }
                        if (var498 == 3604) {
                            var6--;
                            class229 var130 = class24.field440[var6];
                            var8--;
                            int var131 = class222.field3790[var8];
                            class282.method1980((byte) -126, var131, var130);
                            continue;
                        }
                        if (var498 == 3605) {
                            var6--;
                            class229 var132 = class24.field440[var6];
                            class292.method2028((byte) 54, var132.method1617(arg2 + 84));
                            continue;
                        }
                        if (var498 == 3606) {
                            var6--;
                            class229 var133 = class24.field440[var6];
                            class321.method2161(var133.method1617(arg2 + 90), -1);
                            continue;
                        }
                        if (var498 == 3607) {
                            var6--;
                            class229 var134 = class24.field440[var6];
                            class128.method903(var134.method1617(118), true);
                            continue;
                        }
                        if (var498 == 3608) {
                            var6--;
                            class229 var135 = class24.field440[var6];
                            class294.method2040(var135.method1617(86), true);
                            continue;
                        }
                        if (var498 == 3609) {
                            var6--;
                            class229 var136 = class24.field440[var6];
                            if (var136.method1654(2, class279.field4785) || var136.method1654(16, class34.field655)) {
                                var136 = var136.method1625(true, 7);
                            }
                            class222.field3790[var8++] = class106.method713(5449, var136) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3610) {
                            var8--;
                            int var137 = class222.field3790[var8];
                            if (class185.field3243 == 2 && class113.field2044 > var137) {
                                class24.field440[var6++] = class321.field5426[var137];
                                continue;
                            }
                            class24.field440[var6++] = class260.field4522;
                            continue;
                        }
                        if (var498 == 3611) {
                            if (class46.field854 == null) {
                                class24.field440[var6++] = class260.field4522;
                            } else {
                                class24.field440[var6++] = class46.field854.method1606((byte) 118);
                            }
                            continue;
                        }
                        if (var498 == 3612) {
                            if (class46.field854 == null) {
                                class222.field3790[var8++] = 0;
                            } else {
                                class222.field3790[var8++] = class52.field923;
                            }
                            continue;
                        }
                        if (var498 == 3613) {
                            var8--;
                            int var138 = class222.field3790[var8];
                            if (class46.field854 != null && var138 < class52.field923) {
                                class24.field440[var6++] = class137.field2376[var138].field2366.method1606((byte) 97);
                                continue;
                            }
                            class24.field440[var6++] = class260.field4522;
                            continue;
                        }
                        if (var498 == 3614) {
                            var8--;
                            int var139 = class222.field3790[var8];
                            if (class46.field854 != null && var139 < class52.field923) {
                                class222.field3790[var8++] = class137.field2376[var139].field2369;
                                continue;
                            }
                            class222.field3790[var8++] = 0;
                            continue;
                        }
                        if (var498 == 3615) {
                            var8--;
                            int var140 = class222.field3790[var8];
                            if (class46.field854 != null && var140 < class52.field923) {
                                class222.field3790[var8++] = class137.field2376[var140].field2375;
                                continue;
                            }
                            class222.field3790[var8++] = 0;
                            continue;
                        }
                        if (var498 == 3616) {
                            class222.field3790[var8++] = class68.field1299;
                            continue;
                        }
                        if (var498 == 3617) {
                            var6--;
                            class229 var141 = class24.field440[var6];
                            class83.method592(var141, true);
                            continue;
                        }
                        if (var498 == 3618) {
                            class222.field3790[var8++] = class183.field3183;
                            continue;
                        }
                        if (var498 == 3619) {
                            var6--;
                            class229 var142 = class24.field440[var6];
                            class244.method1764(var142.method1617(114), -6520);
                            continue;
                        }
                        if (var498 == 3620) {
                            class261.method1856(arg2 + 32638);
                            continue;
                        }
                        if (var498 == 3621) {
                            if (class185.field3243 == 0) {
                                class222.field3790[var8++] = -1;
                            } else {
                                class222.field3790[var8++] = class162.field2753;
                            }
                            continue;
                        }
                        if (var498 == 3622) {
                            var8--;
                            int var143 = class222.field3790[var8];
                            if (class185.field3243 != 0 && class162.field2753 > var143) {
                                class24.field440[var6++] = class252.method1800(false, class212.field3643[var143]).method1606((byte) 119);
                                continue;
                            }
                            class24.field440[var6++] = class260.field4522;
                            continue;
                        }
                        if (var498 == 3623) {
                            var6--;
                            class229 var144 = class24.field440[var6];
                            if (var144.method1654(68, class279.field4785) || var144.method1654(-119, class34.field655)) {
                                var144 = var144.method1625(true, 7);
                            }
                            class222.field3790[var8++] = class165.method1130(var144, -1) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3624) {
                            var8--;
                            int var145 = class222.field3790[var8];
                            if (class137.field2376 != null && class52.field923 > var145 && class137.field2376[var145].field2366.method1653(class301.field5124.field621, false)) {
                                class222.field3790[var8++] = 1;
                                continue;
                            }
                            class222.field3790[var8++] = 0;
                            continue;
                        }
                        if (var498 == 3625) {
                            if (class280.field4793 == null) {
                                class24.field440[var6++] = class260.field4522;
                            } else {
                                class24.field440[var6++] = class280.field4793.method1606((byte) 122);
                            }
                            continue;
                        }
                        if (var498 == 3626) {
                            var8--;
                            int var146 = class222.field3790[var8];
                            if (class46.field854 != null && class52.field923 > var146) {
                                class24.field440[var6++] = class137.field2376[var146].field2370;
                                continue;
                            }
                            class24.field440[var6++] = class260.field4522;
                            continue;
                        }
                        if (var498 == 3627) {
                            var8--;
                            int var147 = class222.field3790[var8];
                            if (class185.field3243 == 2 && var147 >= 0 && class113.field2044 > var147) {
                                class222.field3790[var8++] = class48.field873[var147] ? 1 : 0;
                                continue;
                            }
                            class222.field3790[var8++] = 0;
                            continue;
                        }
                        if (var498 == 3628) {
                            var6--;
                            class229 var148 = class24.field440[var6];
                            if (var148.method1654(3, class279.field4785) || var148.method1654(-125, class34.field655)) {
                                var148 = var148.method1625(true, 7);
                            }
                            class222.field3790[var8++] = class42.method363(-103, var148);
                            continue;
                        }
                        if (var498 == 3629) {
                            class222.field3790[var8++] = class55.field962;
                            continue;
                        }
                    } else if (var498 < 4000) {
                        if (var498 == 3903) {
                            var8--;
                            int var149 = class222.field3790[var8];
                            class222.field3790[var8++] = class70.field1338[var149].method445(1);
                            continue;
                        }
                        if (var498 == 3904) {
                            var8--;
                            int var150 = class222.field3790[var8];
                            class222.field3790[var8++] = class70.field1338[var150].field989;
                            continue;
                        }
                        if (var498 == 3905) {
                            var8--;
                            int var151 = class222.field3790[var8];
                            class222.field3790[var8++] = class70.field1338[var151].field997;
                            continue;
                        }
                        if (var498 == 3906) {
                            var8--;
                            int var152 = class222.field3790[var8];
                            class222.field3790[var8++] = class70.field1338[var152].field1003;
                            continue;
                        }
                        if (var498 == 3907) {
                            var8--;
                            int var153 = class222.field3790[var8];
                            class222.field3790[var8++] = class70.field1338[var153].field1001;
                            continue;
                        }
                        if (var498 == 3908) {
                            var8--;
                            int var154 = class222.field3790[var8];
                            class222.field3790[var8++] = class70.field1338[var154].field988;
                            continue;
                        }
                        if (var498 == 3910) {
                            var8--;
                            int var155 = class222.field3790[var8];
                            int var156 = class70.field1338[var155].method442((byte) 98);
                            class222.field3790[var8++] = var156 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3911) {
                            var8--;
                            int var157 = class222.field3790[var8];
                            int var158 = class70.field1338[var157].method442((byte) 98);
                            class222.field3790[var8++] = var158 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3912) {
                            var8--;
                            int var159 = class222.field3790[var8];
                            int var160 = class70.field1338[var159].method442((byte) 98);
                            class222.field3790[var8++] = var160 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 3913) {
                            var8--;
                            int var161 = class222.field3790[var8];
                            int var162 = class70.field1338[var161].method442((byte) 98);
                            class222.field3790[var8++] = var162 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var498 < 4100) {
                        if (var498 == 4000) {
                            var8 -= 2;
                            int var405 = class222.field3790[var8];
                            int var406 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = var405 + var406;
                            continue;
                        }
                        if (var498 == 4001) {
                            var8 -= 2;
                            int var407 = class222.field3790[var8 + 1];
                            int var408 = class222.field3790[var8];
                            class222.field3790[var8++] = var408 - var407;
                            continue;
                        }
                        if (var498 == 4002) {
                            var8 -= 2;
                            int var409 = class222.field3790[var8];
                            int var410 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = var409 * var410;
                            continue;
                        }
                        if (var498 == 4003) {
                            var8 -= 2;
                            int var411 = class222.field3790[var8];
                            int var412 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = var411 / var412;
                            continue;
                        }
                        if (var498 == 4004) {
                            var8--;
                            int var413 = class222.field3790[var8];
                            class222.field3790[var8++] = (int) ((double) var413 * Math.random());
                            continue;
                        }
                        if (var498 == 4005) {
                            var8--;
                            int var414 = class222.field3790[var8];
                            class222.field3790[var8++] = (int) (Math.random() * (double) (var414 + 1));
                            continue;
                        }
                        if (var498 == 4006) {
                            var8 -= 5;
                            int var415 = class222.field3790[var8];
                            int var416 = class222.field3790[var8 + 1];
                            int var417 = class222.field3790[var8 + 4];
                            int var418 = class222.field3790[var8 + 3];
                            int var419 = class222.field3790[var8 + 2];
                            class222.field3790[var8++] = (var416 - var415) * (var417 - var419) / (var418 - var419) + var415;
                            continue;
                        }
                        if (var498 == 4007) {
                            var8 -= 2;
                            long var420 = (long) class222.field3790[var8 + 1];
                            long var422 = (long) class222.field3790[var8];
                            class222.field3790[var8++] = (int) (var420 * var422 / 100L + var422);
                            continue;
                        }
                        if (var498 == 4008) {
                            var8 -= 2;
                            int var424 = class222.field3790[var8];
                            int var425 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = class97.method665(0x1 << var425, var424);
                            continue;
                        }
                        if (var498 == 4009) {
                            var8 -= 2;
                            int var426 = class222.field3790[var8 + 1];
                            int var427 = class222.field3790[var8];
                            class222.field3790[var8++] = class305.method2086(var427, -(0x1 << var426) - 1);
                            continue;
                        }
                        if (var498 == 4010) {
                            var8 -= 2;
                            int var428 = class222.field3790[var8];
                            int var429 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = class305.method2086(var428, 0x1 << var429) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var498 == 4011) {
                            var8 -= 2;
                            int var430 = class222.field3790[var8];
                            int var431 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = var430 % var431;
                            continue;
                        }
                        if (var498 == 4012) {
                            var8 -= 2;
                            int var432 = class222.field3790[var8 + 1];
                            int var433 = class222.field3790[var8];
                            if (var433 == 0) {
                                class222.field3790[var8++] = 0;
                            } else {
                                class222.field3790[var8++] = (int) Math.pow((double) var433, (double) var432);
                            }
                            continue;
                        }
                        if (var498 == 4013) {
                            var8 -= 2;
                            int var434 = class222.field3790[var8 + 1];
                            int var435 = class222.field3790[var8];
                            if (var435 == 0) {
                                class222.field3790[var8++] = 0;
                            } else if (var434 == 0) {
                                class222.field3790[var8++] = Integer.MAX_VALUE;
                            } else {
                                class222.field3790[var8++] = (int) Math.pow((double) var435, 1.0D / (double) var434);
                            }
                            continue;
                        }
                        if (var498 == 4014) {
                            var8 -= 2;
                            int var436 = class222.field3790[var8 + 1];
                            int var437 = class222.field3790[var8];
                            class222.field3790[var8++] = class305.method2086(var436, var437);
                            continue;
                        }
                        if (var498 == 4015) {
                            var8 -= 2;
                            int var438 = class222.field3790[var8];
                            int var439 = class222.field3790[var8 + 1];
                            class222.field3790[var8++] = class97.method665(var438, var439);
                            continue;
                        }
                        if (var498 == 4016) {
                            var8 -= 2;
                            int var440 = class222.field3790[var8 + 1];
                            int var441 = class222.field3790[var8];
                            class222.field3790[var8++] = var441 < var440 ? var441 : var440;
                            continue;
                        }
                        if (var498 == 4017) {
                            var8 -= 2;
                            int var442 = class222.field3790[var8 + 1];
                            int var443 = class222.field3790[var8];
                            class222.field3790[var8++] = var442 < var443 ? var443 : var442;
                            continue;
                        }
                        if (var498 == 4018) {
                            var8 -= 3;
                            long var444 = (long) class222.field3790[var8];
                            long var446 = (long) class222.field3790[var8 + 1];
                            long var448 = (long) class222.field3790[var8 + 2];
                            class222.field3790[var8++] = (int) (var444 * var448 / var446);
                            continue;
                        }
                    } else if (var498 < 4200) {
                        if (var498 == 4100) {
                            var6--;
                            class229 var353 = class24.field440[var6];
                            var8--;
                            int var354 = class222.field3790[var8];
                            class24.field440[var6++] = class142.method989(new class229[] { var353, class84.method607(84, var354) }, arg2 - 94);
                            continue;
                        }
                        if (var498 == 4101) {
                            var6 -= 2;
                            class229 var355 = class24.field440[var6];
                            class229 var356 = class24.field440[var6 + 1];
                            class24.field440[var6++] = class142.method989(new class229[] { var355, var356 }, arg2 - 90);
                            continue;
                        }
                        if (var498 == 4102) {
                            var6--;
                            class229 var357 = class24.field440[var6];
                            var8--;
                            int var358 = class222.field3790[var8];
                            class24.field440[var6++] = class142.method989(new class229[] { var357, class242.method1749((byte) 104, true, var358) }, arg2 - 40);
                            continue;
                        }
                        if (var498 == 4103) {
                            var6--;
                            class229 var359 = class24.field440[var6];
                            class24.field440[var6++] = var359.method1608(class260.method1850(arg2, -196));
                            continue;
                        }
                        if (var498 == 4104) {
                            var8--;
                            int var360 = class222.field3790[var8];
                            long var361 = ((long) var360 + 11745L) * 86400000L;
                            class73.field1386.setTime(new Date(var361));
                            int var363 = class73.field1386.get(5);
                            int var364 = class73.field1386.get(2);
                            int var365 = class73.field1386.get(1);
                            class24.field440[var6++] = class142.method989(new class229[] { class84.method607(125, var363), class81.field1492, class81.field1489[var364], class81.field1492, class84.method607(83, var365) }, -103);
                            continue;
                        }
                        if (var498 == 4105) {
                            var6 -= 2;
                            class229 var366 = class24.field440[var6 + 1];
                            class229 var367 = class24.field440[var6];
                            if (class301.field5124.field613 != null && class301.field5124.field613.field3668) {
                                class24.field440[var6++] = var366;
                                continue;
                            }
                            class24.field440[var6++] = var367;
                            continue;
                        }
                        if (var498 == 4106) {
                            var8--;
                            int var368 = class222.field3790[var8];
                            class24.field440[var6++] = class84.method607(arg2 + 96, var368);
                            continue;
                        }
                        if (var498 == 4107) {
                            var6 -= 2;
                            class222.field3790[var8++] = class24.field440[var6].method1619(class24.field440[var6 + 1], 115);
                            continue;
                        }
                        if (var498 == 4108) {
                            var6--;
                            class229 var369 = class24.field440[var6];
                            var8 -= 2;
                            int var370 = class222.field3790[var8 + 1];
                            int var371 = class222.field3790[var8];
                            byte[] var372 = class106.field1840.method1275(0, var370, -5211);
                            class77 var373 = new class77(var372);
                            var373.method940(class305.field5169, (int[]) null);
                            class222.field3790[var8++] = var373.method955(var369, var371);
                            continue;
                        }
                        if (var498 == 4109) {
                            var6--;
                            class229 var374 = class24.field440[var6];
                            var8 -= 2;
                            int var375 = class222.field3790[var8];
                            int var376 = class222.field3790[var8 + 1];
                            byte[] var377 = class106.field1840.method1275(0, var376, -5211);
                            class77 var378 = new class77(var377);
                            var378.method940(class305.field5169, (int[]) null);
                            class222.field3790[var8++] = var378.method942(var374, var375);
                            continue;
                        }
                        if (var498 == 4110) {
                            var6 -= 2;
                            class229 var379 = class24.field440[var6];
                            class229 var380 = class24.field440[var6 + 1];
                            var8--;
                            if (class222.field3790[var8] == 1) {
                                class24.field440[var6++] = var379;
                            } else {
                                class24.field440[var6++] = var380;
                            }
                            continue;
                        }
                        if (var498 == 4111) {
                            var6--;
                            class229 var381 = class24.field440[var6];
                            class24.field440[var6++] = class138.method946(var381);
                            continue;
                        }
                        if (var498 == 4112) {
                            var6--;
                            class229 var382 = class24.field440[var6];
                            var8--;
                            int var383 = class222.field3790[var8];
                            if (var383 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class24.field440[var6++] = var382.method1638((byte) 20, var383);
                            continue;
                        }
                        if (var498 == 4113) {
                            var8--;
                            int var384 = class222.field3790[var8];
                            class222.field3790[var8++] = class269.method1901(-13693, var384) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4114) {
                            var8--;
                            int var385 = class222.field3790[var8];
                            class222.field3790[var8++] = class10.method58(-58, var385) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4115) {
                            var8--;
                            int var386 = class222.field3790[var8];
                            class222.field3790[var8++] = class220.method1521(var386, -123) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4116) {
                            var8--;
                            int var387 = class222.field3790[var8];
                            class222.field3790[var8++] = class185.method1263(var387, -128) ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4117) {
                            var6--;
                            class229 var388 = class24.field440[var6];
                            if (var388 == null) {
                                class222.field3790[var8++] = 0;
                            } else {
                                class222.field3790[var8++] = var388.method1626(74);
                            }
                            continue;
                        }
                        if (var498 == 4118) {
                            var8 -= 2;
                            var6--;
                            class229 var389 = class24.field440[var6];
                            int var390 = class222.field3790[var8];
                            int var391 = class222.field3790[var8 + 1];
                            class24.field440[var6++] = var389.method1639((byte) -20, var391, var390);
                            continue;
                        }
                        if (var498 == 4119) {
                            var6--;
                            class229 var392 = class24.field440[var6];
                            class229 var393 = class4.method19(var392.method1626(arg2 - 93), -102);
                            boolean var394 = false;
                            for (int var395 = 0; var395 < var392.method1626(-92); var395++) {
                                int var396 = var392.method1642(92, var395);
                                if (var396 == 60) {
                                    var394 = true;
                                } else if (var396 == 62) {
                                    var394 = false;
                                } else if (!var394) {
                                    var393.method1647(var396, -3989);
                                }
                            }
                            var393.method1616(false);
                            class24.field440[var6++] = var393;
                            continue;
                        }
                        if (var498 == 4120) {
                            var6--;
                            class229 var397 = class24.field440[var6];
                            var8 -= 2;
                            int var398 = class222.field3790[var8 + 1];
                            int var399 = class222.field3790[var8];
                            class222.field3790[var8++] = var397.method1632((byte) 82, var398, var399);
                            continue;
                        }
                        if (var498 == 4121) {
                            var8--;
                            int var400 = class222.field3790[var8];
                            var6 -= 2;
                            class229 var401 = class24.field440[var6];
                            class229 var402 = class24.field440[var6 + 1];
                            class222.field3790[var8++] = var401.method1623(var400, class260.method1850(arg2, -109), var402);
                            continue;
                        }
                        if (var498 == 4122) {
                            var8--;
                            int var403 = class222.field3790[var8];
                            class222.field3790[var8++] = class187.method1303(class260.method1850(arg2, 154), var403);
                            continue;
                        }
                        if (var498 == 4123) {
                            var8--;
                            int var404 = class222.field3790[var8];
                            class222.field3790[var8++] = class206.method1437(var404, -114);
                            continue;
                        }
                    } else if (var498 < 4300) {
                        if (var498 == 4200) {
                            var8--;
                            int var334 = class222.field3790[var8];
                            class24.field440[var6++] = class113.method799(var334, (byte) 50).field5281;
                            continue;
                        }
                        if (var498 == 4201) {
                            var8 -= 2;
                            int var335 = class222.field3790[var8 + 1];
                            int var336 = class222.field3790[var8];
                            class313 var337 = class113.method799(var336, (byte) 50);
                            if (var335 >= 1 && var335 <= 5 && var337.field5305[var335 - 1] != null) {
                                class24.field440[var6++] = var337.field5305[var335 - 1];
                                continue;
                            }
                            class24.field440[var6++] = class260.field4522;
                            continue;
                        }
                        if (var498 == 4202) {
                            var8 -= 2;
                            int var338 = class222.field3790[var8];
                            int var339 = class222.field3790[var8 + 1];
                            class313 var340 = class113.method799(var338, (byte) 50);
                            if (var339 >= 1 && var339 <= 5 && var340.field5265[var339 - 1] != null) {
                                class24.field440[var6++] = var340.field5265[var339 - 1];
                                continue;
                            }
                            class24.field440[var6++] = class260.field4522;
                            continue;
                        }
                        if (var498 == 4203) {
                            var8--;
                            int var341 = class222.field3790[var8];
                            class222.field3790[var8++] = class113.method799(var341, (byte) 50).field5300;
                            continue;
                        }
                        if (var498 == 4204) {
                            var8--;
                            int var342 = class222.field3790[var8];
                            class222.field3790[var8++] = class113.method799(var342, (byte) 50).field5298 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4205) {
                            var8--;
                            int var343 = class222.field3790[var8];
                            class313 var344 = class113.method799(var343, (byte) 50);
                            if (var344.field5303 == -1 && var344.field5304 >= 0) {
                                class222.field3790[var8++] = var344.field5304;
                                continue;
                            }
                            class222.field3790[var8++] = var343;
                            continue;
                        }
                        if (var498 == 4206) {
                            var8--;
                            int var345 = class222.field3790[var8];
                            class313 var346 = class113.method799(var345, (byte) 50);
                            if (var346.field5303 >= 0 && var346.field5304 >= 0) {
                                class222.field3790[var8++] = var346.field5304;
                                continue;
                            }
                            class222.field3790[var8++] = var345;
                            continue;
                        }
                        if (var498 == 4207) {
                            var8--;
                            int var347 = class222.field3790[var8];
                            class222.field3790[var8++] = class113.method799(var347, (byte) 50).field5299 ? 1 : 0;
                            continue;
                        }
                        if (var498 == 4208) {
                            var8 -= 2;
                            int var348 = class222.field3790[var8 + 1];
                            int var349 = class222.field3790[var8];
                            class254 var350 = class200.method1405(var348, -9);
                            if (var350.method1809(arg2 ^ 0xFFFFFF96)) {
                                class24.field440[var6++] = class113.method799(var349, (byte) 50).method2127(var350.field4424, false, var348);
                            } else {
                                class222.field3790[var8++] = class113.method799(var349, (byte) 50).method2121(class260.method1850(arg2, -15494), var350.field4425, var348);
                            }
                            continue;
                        }
                        if (var498 == 4210) {
                            var6--;
                            class229 var351 = class24.field440[var6];
                            var8--;
                            int var352 = class222.field3790[var8];
                            class319.method2150((byte) -5, var352 == 1, var351);
                            class222.field3790[var8++] = class111.field1950;
                            continue;
                        }
                        if (var498 == 4211) {
                            if (class327.field5492 != null && class228.field3923 < class111.field1950) {
                                class222.field3790[var8++] = class305.method2086(65535, class327.field5492[class228.field3923++]);
                                continue;
                            }
                            class222.field3790[var8++] = -1;
                            continue;
                        }
                        if (var498 == 4212) {
                            class228.field3923 = 0;
                            continue;
                        }
                    } else if (var498 < 4400) {
                        if (var498 == 4300) {
                            var8 -= 2;
                            int var324 = class222.field3790[var8];
                            int var325 = class222.field3790[var8 + 1];
                            class254 var326 = class200.method1405(var325, -9);
                            if (var326.method1809(-119)) {
                                class24.field440[var6++] = class224.method1541((byte) 20, var324).method1148(var326.field4424, -22503, var325);
                            } else {
                                class222.field3790[var8++] = class224.method1541((byte) 20, var324).method1152(var325, arg2 - 5, var326.field4425);
                            }
                            continue;
                        }
                        if (var498 == 4301) {
                            var8--;
                            int var327 = class222.field3790[var8];
                            class222.field3790[var8++] = class224.method1541((byte) 20, var327).field2913;
                            continue;
                        }
                        if (var498 == 4302) {
                            var8--;
                            int var328 = class222.field3790[var8];
                            class222.field3790[var8++] = class224.method1541((byte) 20, var328).field2929;
                            continue;
                        }
                        if (var498 == 4303) {
                            var8--;
                            int var329 = class222.field3790[var8];
                            class222.field3790[var8++] = class224.method1541((byte) 20, var329).field2932;
                            continue;
                        }
                        if (var498 == 4304) {
                            var8--;
                            int var330 = class222.field3790[var8];
                            class222.field3790[var8++] = class224.method1541((byte) 20, var330).field2949;
                            continue;
                        }
                        if (var498 == 4305) {
                            var8--;
                            int var331 = class222.field3790[var8];
                            class222.field3790[var8++] = class224.method1541((byte) 20, var331).field2918;
                            continue;
                        }
                        if (var498 == 4306) {
                            var8--;
                            int var332 = class222.field3790[var8];
                            class222.field3790[var8++] = class224.method1541((byte) 20, var332).field2959;
                            continue;
                        }
                        if (var498 == 4307) {
                            var8--;
                            int var333 = class222.field3790[var8];
                            class222.field3790[var8++] = class224.method1541((byte) 20, var333).field2942;
                            continue;
                        }
                    } else if (var498 < 4500) {
                        if (var498 == 4400) {
                            var8 -= 2;
                            int var163 = class222.field3790[var8 + 1];
                            int var164 = class222.field3790[var8];
                            class254 var165 = class200.method1405(var163, -9);
                            if (var165.method1809(-111)) {
                                class24.field440[var6++] = class271.method1909(112, var164).method594(var165.field4424, class260.method1850(arg2, 4), var163);
                            } else {
                                class222.field3790[var8++] = class271.method1909(-123, var164).method590(var165.field4425, var163, true);
                            }
                            continue;
                        }
                    } else if (var498 >= 4600) {
                        if (var498 < 5100) {
                            if (var498 == 5000) {
                                class222.field3790[var8++] = class185.field3231;
                                continue;
                            }
                            if (var498 == 5001) {
                                class257.field4488++;
                                var8 -= 3;
                                class185.field3231 = class222.field3790[var8];
                                class124.field2181 = class222.field3790[var8 + 1];
                                class314.field5334 = class222.field3790[var8 + 2];
                                class84.field1608.method1397(7, 0);
                                class84.field1608.method140(class185.field3231, (byte) 75);
                                class84.field1608.method140(class124.field2181, (byte) 75);
                                class84.field1608.method140(class314.field5334, (byte) 75);
                                continue;
                            }
                            if (var498 == 5002) {
                                var6--;
                                class229 var166 = class24.field440[var6];
                                var8 -= 2;
                                class96.field1702++;
                                int var167 = class222.field3790[var8 + 1];
                                int var168 = class222.field3790[var8];
                                class84.field1608.method1397(168, 0);
                                class84.field1608.method118(var166.method1617(arg2 ^ 0x5E), (byte) -128);
                                class84.field1608.method140(var168 - 1, (byte) 75);
                                class84.field1608.method140(var167, (byte) 75);
                                continue;
                            }
                            if (var498 == 5003) {
                                class229 var169 = null;
                                var8--;
                                int var170 = class222.field3790[var8];
                                if (var170 < 100) {
                                    var169 = class243.field4291[var170];
                                }
                                if (var169 == null) {
                                    var169 = class260.field4522;
                                }
                                class24.field440[var6++] = var169;
                                continue;
                            }
                            if (var498 == 5004) {
                                int var171 = -1;
                                var8--;
                                int var172 = class222.field3790[var8];
                                if (var172 < 100 && class243.field4291[var172] != null) {
                                    var171 = class319.field5396[var172];
                                }
                                class222.field3790[var8++] = var171;
                                continue;
                            }
                            if (var498 == 5005) {
                                class222.field3790[var8++] = class124.field2181;
                                continue;
                            }
                            if (var498 == 5008) {
                                var6--;
                                class229 var173 = class24.field440[var6];
                                if (var173.method1654(-126, class240.field4238)) {
                                    class260.method1852((byte) -124, var173);
                                    continue;
                                }
                                if (class200.field3500 == 0 && (class283.field4852 && !class281.field4808 || class252.field4402)) {
                                    continue;
                                }
                                class229.field3968++;
                                byte var174 = 0;
                                byte var175 = 0;
                                class229 var176 = var173.method1608(-199);
                                if (var176.method1654(arg2 ^ 0xFFFFFF84, class111.field1961)) {
                                    var173 = var173.method1625(true, class111.field1961.method1626(arg2 + 101));
                                    var174 = 0;
                                } else if (var176.method1654(arg2 ^ 0xFFFFFF81, class158.field2703)) {
                                    var173 = var173.method1625(true, class158.field2703.method1626(-86));
                                    var174 = 1;
                                } else if (var176.method1654(-125, class143.field2482)) {
                                    var174 = 2;
                                    var173 = var173.method1625(true, class143.field2482.method1626(arg2 - 103));
                                } else if (var176.method1654(-117, class70.field1341)) {
                                    var174 = 3;
                                    var173 = var173.method1625(true, class70.field1341.method1626(-120));
                                } else if (var176.method1654(arg2 + 35, class296.field5066)) {
                                    var174 = 4;
                                    var173 = var173.method1625(true, class296.field5066.method1626(-79));
                                } else if (var176.method1654(-127, class52.field918)) {
                                    var174 = 5;
                                    var173 = var173.method1625(true, class52.field918.method1626(arg2 + 37));
                                } else if (var176.method1654(84, class268.field4591)) {
                                    var173 = var173.method1625(true, class268.field4591.method1626(83));
                                    var174 = 6;
                                } else if (var176.method1654(10, class78.field1437)) {
                                    var173 = var173.method1625(true, class78.field1437.method1626(arg2 ^ 0x32));
                                    var174 = 7;
                                } else if (var176.method1654(84, class64.field1109)) {
                                    var173 = var173.method1625(true, class64.field1109.method1626(-128));
                                    var174 = 8;
                                } else if (var176.method1654(-1, class175.field3060)) {
                                    var174 = 9;
                                    var173 = var173.method1625(true, class175.field3060.method1626(arg2 - 84));
                                } else if (var176.method1654(-117, class222.field3789)) {
                                    var173 = var173.method1625(true, class222.field3789.method1626(-119));
                                    var174 = 10;
                                } else if (var176.method1654(arg2 + 8, class288.field4937)) {
                                    var174 = 11;
                                    var173 = var173.method1625(true, class288.field4937.method1626(-112));
                                } else if (class128.field2290 != 0) {
                                    if (var176.method1654(-117, class111.field1959)) {
                                        var174 = 0;
                                        var173 = var173.method1625(true, class111.field1959.method1626(-107));
                                    } else if (var176.method1654(-124, class158.field2700)) {
                                        var173 = var173.method1625(true, class158.field2700.method1626(113));
                                        var174 = 1;
                                    } else if (var176.method1654(arg2 ^ 0x36, class143.field2494)) {
                                        var174 = 2;
                                        var173 = var173.method1625(true, class143.field2494.method1626(64));
                                    } else if (var176.method1654(arg2 + 74, class70.field1346)) {
                                        var174 = 3;
                                        var173 = var173.method1625(true, class70.field1346.method1626(arg2 + 69));
                                    } else if (var176.method1654(arg2 ^ 0xFFFFFF8F, class296.field5065)) {
                                        var174 = 4;
                                        var173 = var173.method1625(true, class296.field5065.method1626(arg2 ^ 0x2F));
                                    } else if (var176.method1654(109, class52.field912)) {
                                        var173 = var173.method1625(true, class52.field912.method1626(-112));
                                        var174 = 5;
                                    } else if (var176.method1654(-128, class268.field4589)) {
                                        var173 = var173.method1625(true, class268.field4589.method1626(54));
                                        var174 = 6;
                                    } else if (var176.method1654(52, class78.field1435)) {
                                        var174 = 7;
                                        var173 = var173.method1625(true, class78.field1435.method1626(arg2 ^ 0x51));
                                    } else if (var176.method1654(arg2 + 93, class64.field1116)) {
                                        var173 = var173.method1625(true, class64.field1116.method1626(17));
                                        var174 = 8;
                                    } else if (var176.method1654(116, class175.field3050)) {
                                        var173 = var173.method1625(true, class175.field3050.method1626(-107));
                                        var174 = 9;
                                    } else if (var176.method1654(76, class222.field3788)) {
                                        var174 = 10;
                                        var173 = var173.method1625(true, class222.field3788.method1626(-119));
                                    } else if (var176.method1654(arg2 ^ 0xFFFFFF82, class288.field4935)) {
                                        var173 = var173.method1625(true, class288.field4935.method1626(113));
                                        var174 = 11;
                                    }
                                }
                                class229 var177 = var173.method1608(arg2 - 204);
                                if (var177.method1654(57, class144.field2500)) {
                                    var175 = 1;
                                    var173 = var173.method1625(true, class144.field2500.method1626(arg2 + 117));
                                } else if (var177.method1654(-116, class293.field5022)) {
                                    var173 = var173.method1625(true, class293.field5022.method1626(-73));
                                    var175 = 2;
                                } else if (var177.method1654(arg2 ^ 0xFFFFFF8D, class169.field2904)) {
                                    var175 = 3;
                                    var173 = var173.method1625(true, class169.field2904.method1626(-83));
                                } else if (var177.method1654(103, class232.field4012)) {
                                    var175 = 4;
                                    var173 = var173.method1625(true, class232.field4012.method1626(-73));
                                } else if (var177.method1654(-125, class290.field4956)) {
                                    var175 = 5;
                                    var173 = var173.method1625(true, class290.field4956.method1626(91));
                                } else if (class128.field2290 != 0) {
                                    if (var177.method1654(-120, class144.field2505)) {
                                        var173 = var173.method1625(true, class144.field2505.method1626(115));
                                        var175 = 1;
                                    } else if (var177.method1654(10, class293.field5019)) {
                                        var175 = 2;
                                        var173 = var173.method1625(true, class293.field5019.method1626(58));
                                    } else if (var177.method1654(-17, class169.field2924)) {
                                        var175 = 3;
                                        var173 = var173.method1625(true, class169.field2924.method1626(125));
                                    } else if (var177.method1654(64, class232.field4032)) {
                                        var175 = 4;
                                        var173 = var173.method1625(true, class232.field4032.method1626(-98));
                                    } else if (var177.method1654(arg2 ^ 0x21, class290.field4974)) {
                                        var173 = var173.method1625(true, class290.field4974.method1626(-89));
                                        var175 = 5;
                                    }
                                }
                                class84.field1608.method1397(191, 0);
                                class84.field1608.method140(0, (byte) 75);
                                int var178 = class84.field1608.field195;
                                class84.field1608.method140(var174, (byte) 75);
                                class84.field1608.method140(var175, (byte) 75);
                                class15.method149(class84.field1608, var173, (byte) 118);
                                class84.field1608.method110(class84.field1608.field195 - var178, (byte) 0);
                                continue;
                            }
                            if (var498 == 5009) {
                                var6 -= 2;
                                class229 var179 = class24.field440[var6 + 1];
                                class229 var180 = class24.field440[var6];
                                if (class200.field3500 != 0 || (!class283.field4852 || class281.field4808) && !class252.field4402) {
                                    class172.field2979++;
                                    class84.field1608.method1397(219, arg2 - 5);
                                    class84.field1608.method140(0, (byte) 75);
                                    int var181 = class84.field1608.field195;
                                    class84.field1608.method118(var180.method1617(115), (byte) -127);
                                    class15.method149(class84.field1608, var179, (byte) 77);
                                    class84.field1608.method110(class84.field1608.field195 - var181, (byte) 0);
                                }
                                continue;
                            }
                            if (var498 == 5010) {
                                class229 var182 = null;
                                var8--;
                                int var183 = class222.field3790[var8];
                                if (var183 < 100) {
                                    var182 = class27.field490[var183];
                                }
                                if (var182 == null) {
                                    var182 = class260.field4522;
                                }
                                class24.field440[var6++] = var182;
                                continue;
                            }
                            if (var498 == 5011) {
                                class229 var184 = null;
                                var8--;
                                int var185 = class222.field3790[var8];
                                if (var185 < 100) {
                                    var184 = class287.field4917[var185];
                                }
                                if (var184 == null) {
                                    var184 = class260.field4522;
                                }
                                class24.field440[var6++] = var184;
                                continue;
                            }
                            if (var498 == 5012) {
                                var8--;
                                int var186 = class222.field3790[var8];
                                int var187 = -1;
                                if (var186 < 100) {
                                    var187 = class150.field2579[var186];
                                }
                                class222.field3790[var8++] = var187;
                                continue;
                            }
                            if (var498 == 5015) {
                                class229 var188;
                                if (class301.field5124 == null || class301.field5124.field621 == null) {
                                    var188 = class331.field5629;
                                } else {
                                    var188 = class301.field5124.method304(24930);
                                }
                                class24.field440[var6++] = var188;
                                continue;
                            }
                            if (var498 == 5016) {
                                class222.field3790[var8++] = class314.field5334;
                                continue;
                            }
                            if (var498 == 5017) {
                                class222.field3790[var8++] = class34.field652;
                                continue;
                            }
                            if (var498 == 5050) {
                                var8--;
                                int var189 = class222.field3790[var8];
                                class24.field440[var6++] = class56.method446(class260.method1850(arg2, -5), var189).field728;
                                continue;
                            }
                            if (var498 == 5051) {
                                var8--;
                                int var190 = class222.field3790[var8];
                                class39 var191 = class56.method446(-2, var190);
                                if (var191.field716 == null) {
                                    class222.field3790[var8++] = 0;
                                } else {
                                    class222.field3790[var8++] = var191.field716.length;
                                }
                                continue;
                            }
                            if (var498 == 5052) {
                                var8 -= 2;
                                int var192 = class222.field3790[var8 + 1];
                                int var193 = class222.field3790[var8];
                                class39 var194 = class56.method446(-2, var193);
                                int var195 = var194.field716[var192];
                                class222.field3790[var8++] = var195;
                                continue;
                            }
                            if (var498 == 5053) {
                                var8--;
                                int var196 = class222.field3790[var8];
                                class39 var197 = class56.method446(arg2 ^ 0xFFFFFFFB, var196);
                                if (var197.field719 == null) {
                                    class222.field3790[var8++] = 0;
                                } else {
                                    class222.field3790[var8++] = var197.field719.length;
                                }
                                continue;
                            }
                            if (var498 == 5054) {
                                var8 -= 2;
                                int var198 = class222.field3790[var8 + 1];
                                int var199 = class222.field3790[var8];
                                class222.field3790[var8++] = class56.method446(-2, var199).field719[var198];
                                continue;
                            }
                            if (var498 == 5055) {
                                var8--;
                                int var200 = class222.field3790[var8];
                                class24.field440[var6++] = class27.method242(var200, -30280).method359(-111);
                                continue;
                            }
                            if (var498 == 5056) {
                                var8--;
                                int var201 = class222.field3790[var8];
                                class42 var202 = class27.method242(var201, -30280);
                                if (var202.field763 == null) {
                                    class222.field3790[var8++] = 0;
                                } else {
                                    class222.field3790[var8++] = var202.field763.length;
                                }
                                continue;
                            }
                            if (var498 == 5057) {
                                var8 -= 2;
                                int var203 = class222.field3790[var8];
                                int var204 = class222.field3790[var8 + 1];
                                class222.field3790[var8++] = class27.method242(var203, -30280).field763[var204];
                                continue;
                            }
                            if (var498 == 5058) {
                                class194.field3367 = new class252();
                                var8--;
                                class194.field3367.field4410 = class222.field3790[var8];
                                class194.field3367.field4403 = class27.method242(class194.field3367.field4410, -30280);
                                class194.field3367.field4407 = new int[class194.field3367.field4403.method357(arg2 ^ 0xFFFFFFFA)];
                                continue;
                            }
                            if (var498 == 5059) {
                                class84.field1608.method1397(82, 0);
                                class84.field1608.method140(0, (byte) 75);
                                int var205 = class84.field1608.field195;
                                class84.field1608.method140(0, (byte) 75);
                                class261.field4530++;
                                class84.field1608.method125(-25369, class194.field3367.field4410);
                                class194.field3367.field4403.method367(class194.field3367.field4407, class84.field1608, (byte) 30);
                                class84.field1608.method110(class84.field1608.field195 - var205, (byte) 0);
                                continue;
                            }
                            if (var498 == 5060) {
                                class294.field5027++;
                                var6--;
                                class229 var206 = class24.field440[var6];
                                class84.field1608.method1397(241, 0);
                                class84.field1608.method140(0, (byte) 75);
                                int var207 = class84.field1608.field195;
                                class84.field1608.method118(var206.method1617(100), (byte) -126);
                                class84.field1608.method125(-25369, class194.field3367.field4410);
                                class194.field3367.field4403.method367(class194.field3367.field4407, class84.field1608, (byte) -121);
                                class84.field1608.method110(class84.field1608.field195 - var207, (byte) 0);
                                continue;
                            }
                            if (var498 == 5061) {
                                class261.field4530++;
                                class84.field1608.method1397(82, 0);
                                class84.field1608.method140(0, (byte) 75);
                                int var208 = class84.field1608.field195;
                                class84.field1608.method140(1, (byte) 75);
                                class84.field1608.method125(-25369, class194.field3367.field4410);
                                class194.field3367.field4403.method367(class194.field3367.field4407, class84.field1608, (byte) -126);
                                class84.field1608.method110(class84.field1608.field195 - var208, (byte) 0);
                                continue;
                            }
                            if (var498 == 5062) {
                                var8 -= 2;
                                int var209 = class222.field3790[var8 + 1];
                                int var210 = class222.field3790[var8];
                                class222.field3790[var8++] = class56.method446(class260.method1850(arg2, -5), var210).field727[var209];
                                continue;
                            }
                            if (var498 == 5063) {
                                var8 -= 2;
                                int var211 = class222.field3790[var8];
                                int var212 = class222.field3790[var8 + 1];
                                class222.field3790[var8++] = class56.method446(-2, var211).field725[var212];
                                continue;
                            }
                            if (var498 == 5064) {
                                var8 -= 2;
                                int var213 = class222.field3790[var8];
                                int var214 = class222.field3790[var8 + 1];
                                if (var214 == -1) {
                                    class222.field3790[var8++] = -1;
                                } else {
                                    class222.field3790[var8++] = class56.method446(class260.method1850(arg2, -5), var213).method345((byte) -14, var214);
                                }
                                continue;
                            }
                            if (var498 == 5065) {
                                var8 -= 2;
                                int var215 = class222.field3790[var8];
                                int var216 = class222.field3790[var8 + 1];
                                if (var216 == -1) {
                                    class222.field3790[var8++] = -1;
                                } else {
                                    class222.field3790[var8++] = class56.method446(arg2 - 7, var215).method344(103, var216);
                                }
                                continue;
                            }
                            if (var498 == 5066) {
                                var8--;
                                int var217 = class222.field3790[var8];
                                class222.field3790[var8++] = class27.method242(var217, -30280).method357(-1);
                                continue;
                            }
                            if (var498 == 5067) {
                                var8 -= 2;
                                int var218 = class222.field3790[var8];
                                int var219 = class222.field3790[var8 + 1];
                                int var220 = class27.method242(var218, arg2 - 30285).method356(var219, (byte) -70);
                                class222.field3790[var8++] = var220;
                                continue;
                            }
                            if (var498 == 5068) {
                                var8 -= 2;
                                int var221 = class222.field3790[var8];
                                int var222 = class222.field3790[var8 + 1];
                                class194.field3367.field4407[var221] = var222;
                                continue;
                            }
                            if (var498 == 5069) {
                                var8 -= 2;
                                int var223 = class222.field3790[var8];
                                int var224 = class222.field3790[var8 + 1];
                                class194.field3367.field4407[var223] = var224;
                                continue;
                            }
                            if (var498 == 5070) {
                                var8 -= 3;
                                int var225 = class222.field3790[var8 + 1];
                                int var226 = class222.field3790[var8];
                                int var227 = class222.field3790[var8 + 2];
                                class42 var228 = class27.method242(var226, arg2 - 30285);
                                if (var228.method356(var225, (byte) -104) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class222.field3790[var8++] = var228.method370(var225, (byte) 73, var227);
                                continue;
                            }
                            if (var498 == 5071) {
                                var6--;
                                class229 var229 = class24.field440[var6];
                                var8--;
                                boolean var230 = class222.field3790[var8] == 1;
                                class28.method247(106, var229, var230);
                                class222.field3790[var8++] = class111.field1950;
                                continue;
                            }
                            if (var498 == 5072) {
                                if (class327.field5492 != null && class111.field1950 > class228.field3923) {
                                    class222.field3790[var8++] = class305.method2086(65535, class327.field5492[class228.field3923++]);
                                    continue;
                                }
                                class222.field3790[var8++] = -1;
                                continue;
                            }
                            if (var498 == 5073) {
                                class228.field3923 = 0;
                                continue;
                            }
                        } else if (var498 < 5200) {
                            if (var498 == 5100) {
                                if (class84.field1613[86]) {
                                    class222.field3790[var8++] = 1;
                                } else {
                                    class222.field3790[var8++] = 0;
                                }
                                continue;
                            }
                            if (var498 == 5101) {
                                if (class84.field1613[82]) {
                                    class222.field3790[var8++] = 1;
                                } else {
                                    class222.field3790[var8++] = 0;
                                }
                                continue;
                            }
                            if (var498 == 5102) {
                                if (class84.field1613[81]) {
                                    class222.field3790[var8++] = 1;
                                } else {
                                    class222.field3790[var8++] = 0;
                                }
                                continue;
                            }
                        } else if (var498 < 5300) {
                            if (var498 == 5200) {
                                var8--;
                                class59.method449(0, class222.field3790[var8]);
                                continue;
                            }
                            if (var498 == 5201) {
                                class222.field3790[var8++] = class18.method173((byte) 117);
                                continue;
                            }
                            if (var498 == 5202) {
                                var8--;
                                class30.method259(class222.field3790[var8], true);
                                continue;
                            }
                            if (var498 == 5203) {
                                var6--;
                                class83.method593(class24.field440[var6], false);
                                continue;
                            }
                            if (var498 == 5204) {
                                class24.field440[var6 - 1] = class221.method1525((byte) 70, class24.field440[var6 - 1]);
                                continue;
                            }
                            if (var498 == 5205) {
                                var6--;
                                class30.method258(class24.field440[var6], (byte) -5);
                                continue;
                            }
                            if (var498 == 5206) {
                                var8--;
                                int var231 = class222.field3790[var8];
                                class161 var232 = class282.method1987(var231 >> 14 & 0x3FFF, (byte) -95, var231 & 0x3FFF);
                                if (var232 == null) {
                                    class24.field440[var6++] = class260.field4522;
                                } else {
                                    class24.field440[var6++] = var232.field2723;
                                }
                                continue;
                            }
                            if (var498 == 5207) {
                                var6--;
                                class161 var233 = class282.method1982(class24.field440[var6], 1);
                                if (var233 != null && var233.field2726 != null) {
                                    class24.field440[var6++] = var233.field2726;
                                    continue;
                                }
                                class24.field440[var6++] = class260.field4522;
                                continue;
                            }
                            if (var498 == 5208) {
                                class222.field3790[var8++] = class315.field5337;
                                class222.field3790[var8++] = class140.field2439;
                                continue;
                            }
                            if (var498 == 5209) {
                                class222.field3790[var8++] = class151.field2619 + class290.field4953;
                                class222.field3790[var8++] = class254.field4432 + class127.field2269 - class42.field768 - 1;
                                continue;
                            }
                            if (var498 == 5210) {
                                class161 var234 = class10.method56((byte) -105);
                                if (var234 == null) {
                                    class222.field3790[var8++] = 0;
                                    class222.field3790[var8++] = 0;
                                } else {
                                    class222.field3790[var8++] = var234.field2742 * 64;
                                    class222.field3790[var8++] = var234.field2733 * 64;
                                }
                                continue;
                            }
                            if (var498 == 5211) {
                                class161 var235 = class10.method56((byte) -110);
                                if (var235 == null) {
                                    class222.field3790[var8++] = 0;
                                    class222.field3790[var8++] = 0;
                                } else {
                                    class222.field3790[var8++] = var235.field2725 - var235.field2734;
                                    class222.field3790[var8++] = var235.field2737 - var235.field2731;
                                }
                                continue;
                            }
                            if (var498 == 5212) {
                                int var236 = class331.method2257((byte) 67);
                                int var237 = 0;
                                class229 var238;
                                if (var236 == -1) {
                                    var238 = class260.field4522;
                                } else {
                                    var238 = class124.field2183.field5618[var236];
                                    var237 = class124.field2183.method2252(false, var236);
                                }
                                class229 var239 = var238.method1633(class296.field5069, (byte) -89, class3.field26);
                                class24.field440[var6++] = var239;
                                class222.field3790[var8++] = var237;
                                continue;
                            }
                            if (var498 == 5213) {
                                int var240 = class140.method982(1);
                                int var241 = 0;
                                class229 var242;
                                if (var240 == -1) {
                                    var242 = class260.field4522;
                                } else {
                                    var242 = class124.field2183.field5618[var240];
                                    var241 = class124.field2183.method2252(false, var240);
                                }
                                class229 var243 = var242.method1633(class296.field5069, (byte) -89, class3.field26);
                                class24.field440[var6++] = var243;
                                class222.field3790[var8++] = var241;
                                continue;
                            }
                            if (var498 == 5214) {
                                var8--;
                                int var244 = class222.field3790[var8];
                                class208.method1446(var244 >> 14 & 0x3FFF, var244 & 0x3FFF, false);
                                continue;
                            }
                        } else if (var498 < 5400) {
                            if (var498 == 5300) {
                                var8 -= 2;
                                int var245 = class222.field3790[var8];
                                int var246 = class222.field3790[var8 + 1];
                                class156.method1044(3, var245, false, (byte) 111, var246);
                                class222.field3790[var8++] = class155.field2641 == null ? 0 : 1;
                                continue;
                            }
                            if (var498 == 5301) {
                                if (class155.field2641 != null) {
                                    class156.method1044(class186.field3269, -1, false, (byte) 111, -1);
                                }
                                continue;
                            }
                            if (var498 == 5302) {
                                class312[] var247 = class119.method845(14791);
                                class222.field3790[var8++] = var247.length;
                                continue;
                            }
                            if (var498 == 5303) {
                                var8--;
                                int var248 = class222.field3790[var8];
                                class312[] var249 = class119.method845(14791);
                                class222.field3790[var8++] = var249[var248].field5255;
                                class222.field3790[var8++] = var249[var248].field5239;
                                continue;
                            }
                            if (var498 == 5305) {
                                int var250 = class221.field3771;
                                int var251 = class70.field1347;
                                int var252 = -1;
                                class312[] var253 = class119.method845(14791);
                                for (int var254 = 0; var254 < var253.length; var254++) {
                                    class312 var255 = var253[var254];
                                    if (var255.field5255 == var250 && var255.field5239 == var251) {
                                        var252 = var254;
                                        break;
                                    }
                                }
                                class222.field3790[var8++] = var252;
                                continue;
                            }
                            if (var498 == 5306) {
                                class222.field3790[var8++] = class165.method1132((byte) 97);
                                continue;
                            }
                            if (var498 == 5307) {
                                var8--;
                                int var256 = class222.field3790[var8];
                                if (var256 < 0 || var256 > 2) {
                                    var256 = 0;
                                }
                                class156.method1044(var256, -1, false, (byte) 117, -1);
                                continue;
                            }
                            if (var498 == 5308) {
                                class222.field3790[var8++] = class186.field3269;
                                continue;
                            }
                            if (var498 == 5309) {
                                var8--;
                                int var257 = class222.field3790[var8];
                                if (var257 < 0 || var257 > 2) {
                                    var257 = 0;
                                }
                                class186.field3269 = var257;
                                class244.method1772(class215.field3689, 127);
                                continue;
                            }
                        } else if (var498 < 5500) {
                            if (var498 == 5400) {
                                var6 -= 2;
                                class229 var299 = class24.field440[var6];
                                class229 var300 = class24.field440[var6 + 1];
                                class249.field4382++;
                                var8--;
                                int var301 = class222.field3790[var8];
                                class84.field1608.method1397(190, 0);
                                class84.field1608.method140(class226.method1561((byte) 123, var299) + class226.method1561((byte) 77, var300) + 1, (byte) 75);
                                class84.field1608.method107((byte) -21, var299);
                                class84.field1608.method107((byte) -21, var300);
                                class84.field1608.method140(var301, (byte) 75);
                                continue;
                            }
                            if (var498 == 5401) {
                                var8 -= 2;
                                class211.field3637[class222.field3790[var8]] = (short) class259.method1844(class222.field3790[var8 + 1], false);
                                class287.method2007(arg2 + 11185);
                                class186.method1298(true);
                                class236.method1691(arg2 ^ 0x7);
                                class165.method1129(arg2 ^ 0x10FB);
                                class98.method671(1);
                                continue;
                            }
                            if (var498 == 5405) {
                                var8 -= 2;
                                int var302 = class222.field3790[var8];
                                int var303 = class222.field3790[var8 + 1];
                                if (var302 >= 0 && var302 < 2) {
                                    class41.field732[var302] = new int[var303 << 1][4];
                                }
                                continue;
                            }
                            if (var498 == 5406) {
                                var8 -= 7;
                                int var304 = class222.field3790[var8];
                                int var305 = class222.field3790[var8 + 1] << 1;
                                int var306 = class222.field3790[var8 + 2];
                                int var307 = class222.field3790[var8 + 5];
                                int var308 = class222.field3790[var8 + 3];
                                int var309 = class222.field3790[var8 + 6];
                                int var310 = class222.field3790[var8 + 4];
                                if (var304 >= 0 && var304 < 2 && class41.field732[var304] != null && var305 >= 0 && var305 < class41.field732[var304].length) {
                                    class41.field732[var304][var305] = new int[] { (class305.method2086(268434031, var306) >> 14) * 128, var308, class305.method2086(var306, 16383) * 128, var309 };
                                    class41.field732[var304][var305 + 1] = new int[] { class305.method2086(16383, var310 >> 14) * 128, var307, class305.method2086(16383, var310) * 128 };
                                }
                                continue;
                            }
                            if (var498 == 5407) {
                                var8--;
                                int var311 = class41.field732[class222.field3790[var8]].length >> 1;
                                class222.field3790[var8++] = var311;
                                continue;
                            }
                            if (var498 == 5411) {
                                if (class155.field2641 != null) {
                                    class156.method1044(class186.field3269, -1, false, (byte) 114, -1);
                                }
                                if (class112.field2031 == null) {
                                    class98.method673(arg2 - 4, class59.method455(116), false);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var498 == 5419) {
                                class229 var312 = class260.field4522;
                                if (class169.field2903 != null) {
                                    var312 = class270.method1904(arg2 + 118, class169.field2903.field4008);
                                    try {
                                        if (class169.field2903.field4009 != null) {
                                            byte[] var313 = ((String) class169.field2903.field4009).getBytes("ISO-8859-1");
                                            var312 = class102.method686(var313.length, 0, true, var313);
                                        }
                                    } catch (UnsupportedEncodingException var496) {
                                    }
                                }
                                class24.field440[var6++] = var312;
                                continue;
                            }
                            if (var498 == 5420) {
                                class222.field3790[var8++] = class198.field3455 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 5421) {
                                if (class155.field2641 != null) {
                                    class156.method1044(class186.field3269, -1, false, (byte) 125, -1);
                                }
                                var6--;
                                class229 var315 = class24.field440[var6];
                                var8--;
                                boolean var316 = class222.field3790[var8] == 1;
                                class229 var317 = class142.method989(new class229[] { class59.method455(102), var315 }, arg2 ^ 0xFFFFFFCF);
                                if (class112.field2031 != null || var316 && class198.field3455 != 3 && class198.field3453.startsWith("win") && !class312.field5250) {
                                    class173.field3009 = var317;
                                    class168.field2880 = var316;
                                    class57.field1014 = class215.field3689.method1371(75, new String(var317.method1614((byte) 44), "ISO-8859-1"));
                                    continue;
                                }
                                class98.method673(arg2 ^ 0x4, var317, var316);
                                continue;
                            }
                            if (var498 == 5422) {
                                var6 -= 2;
                                class229 var318 = class24.field440[var6];
                                class229 var319 = class24.field440[var6 + 1];
                                var8--;
                                int var320 = class222.field3790[var8];
                                if (var318.method1626(arg2 + 61) > 0) {
                                    if (class104.field1813 == null) {
                                        class104.field1813 = new class229[class271.field4651[class98.field1739]];
                                    }
                                    class104.field1813[var320] = var318;
                                }
                                if (var319.method1626(arg2 ^ 0x17) > 0) {
                                    if (class96.field1710 == null) {
                                        class96.field1710 = new class229[class271.field4651[class98.field1739]];
                                    }
                                    class96.field1710[var320] = var319;
                                }
                                continue;
                            }
                            if (var498 == 5423) {
                                var6--;
                                class24.field440[var6].method1622(false);
                                continue;
                            }
                        } else if (var498 < 5600) {
                            if (var498 == 5500) {
                                var8 -= 4;
                                int var258 = class222.field3790[var8];
                                int var259 = class222.field3790[var8 + 3];
                                int var260 = class222.field3790[var8 + 1];
                                int var261 = class222.field3790[var8 + 2];
                                class292.method2026((var258 & 0x3FFF) - class213.field3649, false, ((var258 & 0xFFFD73C) >> 14) - class258.field4503, var259, var261, 487899496, var260);
                                continue;
                            }
                            if (var498 == 5501) {
                                var8 -= 4;
                                int var262 = class222.field3790[var8];
                                int var263 = class222.field3790[var8 + 3];
                                int var264 = class222.field3790[var8 + 2];
                                int var265 = class222.field3790[var8 + 1];
                                class193.method1319((var262 & 0x3FFF) - class213.field3649, var265, (byte) -118, var264, var263, (var262 >> 14 & 0x3FFF) - class258.field4503);
                                continue;
                            }
                            if (var498 == 5502) {
                                var8 -= 6;
                                int var266 = class222.field3790[var8];
                                if (var266 >= 2) {
                                    throw new RuntimeException();
                                }
                                class329.field5601 = var266;
                                int var267 = class222.field3790[var8 + 1];
                                if ((class41.field732[class329.field5601].length >> 1) <= (var267 + 1)) {
                                    throw new RuntimeException();
                                }
                                class89.field1642 = 0;
                                class30.field519 = var267;
                                class156.field2662 = class222.field3790[var8 + 2];
                                class5.field47 = class222.field3790[var8 + 3];
                                int var268 = class222.field3790[var8 + 4];
                                if (var268 >= 2) {
                                    throw new RuntimeException();
                                }
                                class30.field521 = var268;
                                int var269 = class222.field3790[var8 + 5];
                                if ((class41.field732[class30.field521].length >> 1) <= (var269 + 1)) {
                                    throw new RuntimeException();
                                }
                                class124.field2185 = var269;
                                class74.field1405 = 3;
                                continue;
                            }
                            if (var498 == 5503) {
                                class21.method203((byte) 7);
                                continue;
                            }
                            if (var498 == 5504) {
                                var8 -= 2;
                                class293.field5021 = class222.field3790[var8];
                                class229.field3939 = class222.field3790[var8 + 1];
                                class42.method366(false);
                                continue;
                            }
                            if (var498 == 5505) {
                                class222.field3790[var8++] = class293.field5021;
                                continue;
                            }
                            if (var498 == 5506) {
                                class222.field3790[var8++] = class229.field3939;
                                continue;
                            }
                        } else if (var498 < 5700) {
                            if (var498 == 5600) {
                                var8--;
                                int var295 = class222.field3790[var8];
                                var6 -= 2;
                                class229 var296 = class24.field440[var6];
                                class229 var297 = class24.field440[var6 + 1];
                                if (class325.field5482 == 10 && class312.field5253 == 0 && class16.field253 == 0 && class252.field4409 == 0 && class301.field5129 == 0) {
                                    class235.method1677(var295, -13352, var296, var297);
                                }
                                continue;
                            }
                            if (var498 == 5601) {
                                class184.method1255((byte) 54);
                                continue;
                            }
                            if (var498 == 5602) {
                                if (class16.field253 == 0) {
                                    class4.field27 = -2;
                                }
                                continue;
                            }
                            if (var498 == 5603) {
                                var8 -= 4;
                                if (class325.field5482 == 10 && class312.field5253 == 0 && class16.field253 == 0 && class252.field4409 == 0 && class301.field5129 == 0) {
                                    class318.method2144(true, class222.field3790[var8], class222.field3790[var8 + 3], class222.field3790[var8 + 2], class222.field3790[var8 + 1]);
                                }
                                continue;
                            }
                            if (var498 == 5604) {
                                var6--;
                                if (class325.field5482 == 10 && class312.field5253 == 0 && class16.field253 == 0 && class252.field4409 == 0 && class301.field5129 == 0) {
                                    class110.method780(class24.field440[var6].method1617(96), (byte) -31);
                                }
                                continue;
                            }
                            if (var498 == 5605) {
                                var8 -= 4;
                                var6 -= 2;
                                if (class325.field5482 == 10 && class312.field5253 == 0 && class16.field253 == 0 && class252.field4409 == 0 && class301.field5129 == 0) {
                                    class106.method708(class24.field440[var6 + 1], 0, class24.field440[var6].method1617(arg2 ^ 0x66), class222.field3790[var8 + 2], class222.field3790[var8], class222.field3790[var8 + 3], class222.field3790[var8 + 1]);
                                }
                                continue;
                            }
                            if (var498 == 5606) {
                                if (class252.field4409 == 0) {
                                    class169.field2893 = -2;
                                }
                                continue;
                            }
                            if (var498 == 5607) {
                                class222.field3790[var8++] = class4.field27;
                                continue;
                            }
                            if (var498 == 5608) {
                                class222.field3790[var8++] = class47.field865;
                                continue;
                            }
                            if (var498 == 5609) {
                                class222.field3790[var8++] = class169.field2893;
                                continue;
                            }
                            if (var498 == 5610) {
                                for (int var298 = 0; var298 < 5; var298++) {
                                    class24.field440[var6++] = class131.field2319.length > var298 ? class131.field2319[var298].method1606((byte) 125) : class260.field4522;
                                }
                                class131.field2319 = null;
                                continue;
                            }
                            if (var498 == 5611) {
                                class222.field3790[var8++] = class243.field4299;
                                continue;
                            }
                        } else if (var498 < 6100) {
                            if (var498 == 6001) {
                                var8--;
                                int var270 = class222.field3790[var8];
                                if (var270 < 1) {
                                    var270 = 1;
                                }
                                if (var270 > 4) {
                                    var270 = 4;
                                }
                                class281.field4822 = var270;
                                if (!class108.field1900 || !class329.field5607) {
                                    if (class281.field4822 == 1) {
                                        class227.method1593(0.9F);
                                    }
                                    if (class281.field4822 == 2) {
                                        class227.method1593(0.8F);
                                    }
                                    if (class281.field4822 == 3) {
                                        class227.method1593(0.7F);
                                    }
                                    if (class281.field4822 == 4) {
                                        class227.method1593(0.6F);
                                    }
                                }
                                if (class108.field1900) {
                                    class185.method1258((byte) -74);
                                    if (!class329.field5607) {
                                        class283.method1993(13823);
                                    }
                                }
                                class186.method1298(true);
                                class244.method1772(class215.field3689, 126);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6002) {
                                var8--;
                                class44.method387(class222.field3790[var8] == 1, 1);
                                class73.method536((byte) 99);
                                class283.method1993(13823);
                                method867(1104);
                                class244.method1772(class215.field3689, 127);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6003) {
                                var8--;
                                class320.field5415 = class222.field3790[var8] == 1;
                                method867(1104);
                                class244.method1772(class215.field3689, arg2 + 121);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6005) {
                                var8--;
                                class41.field735 = class222.field3790[var8] == 1;
                                class283.method1993(arg2 + 13818);
                                class244.method1772(class215.field3689, 126);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6006) {
                                var8--;
                                class302.field5140 = class222.field3790[var8] == 1;
                                ((class275) class227.field3904).method1926(24962, !class302.field5140);
                                class244.method1772(class215.field3689, 126);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6007) {
                                var8--;
                                class308.field5212 = class222.field3790[var8] == 1;
                                class244.method1772(class215.field3689, 126);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6008) {
                                var8--;
                                class329.field5605 = class222.field3790[var8] == 1;
                                class244.method1772(class215.field3689, arg2 ^ 0x7B);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6009) {
                                var8--;
                                class38.field713 = class222.field3790[var8] == 1;
                                class244.method1772(class215.field3689, 127);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6010) {
                                var8--;
                                class45.field825 = class222.field3790[var8] == 1;
                                class244.method1772(class215.field3689, arg2 + 122);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6011) {
                                var8--;
                                int var271 = class222.field3790[var8];
                                if (var271 < 0 || var271 > 2) {
                                    var271 = 0;
                                }
                                class243.field4293 = var271;
                                class244.method1772(class215.field3689, 126);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6012) {
                                if (class108.field1900) {
                                    class257.method1832((byte) 94, 0, 0);
                                }
                                var8--;
                                class329.field5607 = class222.field3790[var8] == 1;
                                if (class108.field1900 && class329.field5607) {
                                    class227.method1593(0.7F);
                                } else {
                                    if (class281.field4822 == 1) {
                                        class227.method1593(0.9F);
                                    }
                                    if (class281.field4822 == 2) {
                                        class227.method1593(0.8F);
                                    }
                                    if (class281.field4822 == 3) {
                                        class227.method1593(0.7F);
                                    }
                                    if (class281.field4822 == 4) {
                                        class227.method1593(0.6F);
                                    }
                                }
                                class283.method1993(13823);
                                class244.method1772(class215.field3689, 127);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6014) {
                                var8--;
                                class98.field1750 = class222.field3790[var8] == 1;
                                if (class108.field1900) {
                                    class283.method1993(13823);
                                }
                                class244.method1772(class215.field3689, arg2 ^ 0x7A);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6015) {
                                var8--;
                                class201.field3527 = class222.field3790[var8] == 1;
                                if (class108.field1900) {
                                    class185.method1258((byte) -74);
                                }
                                class244.method1772(class215.field3689, 127);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6016) {
                                var8--;
                                int var272 = class222.field3790[var8];
                                if (class108.field1900) {
                                    class205.field3568 = true;
                                }
                                if (var272 < 0 || var272 > 2) {
                                    var272 = 0;
                                }
                                class252.field4406 = var272;
                                continue;
                            }
                            if (var498 == 6017) {
                                var8--;
                                class15.field218 = class222.field3790[var8] == 1;
                                class160.method1077(126);
                                class244.method1772(class215.field3689, 126);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6018) {
                                var8--;
                                int var273 = class222.field3790[var8];
                                if (var273 < 0) {
                                    var273 = 0;
                                }
                                if (var273 > 127) {
                                    var273 = 127;
                                }
                                class298.field5083 = var273;
                                class244.method1772(class215.field3689, 127);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6019) {
                                var8--;
                                int var274 = class222.field3790[var8];
                                if (var274 < 0) {
                                    var274 = 0;
                                }
                                if (var274 > 255) {
                                    var274 = 255;
                                }
                                if (class27.field487 != var274) {
                                    if (class27.field487 == 0 && class232.field4020 != -1) {
                                        class127.method901(class259.field4506, false, class232.field4020, var274, 0, true);
                                        class269.field4620 = false;
                                    } else if (var274 == 0) {
                                        class20.method193(true);
                                        class269.field4620 = false;
                                    } else {
                                        class71.method528(var274, arg2 + 115);
                                    }
                                    class27.field487 = var274;
                                }
                                class244.method1772(class215.field3689, 127);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6020) {
                                var8--;
                                int var275 = class222.field3790[var8];
                                if (var275 < 0) {
                                    var275 = 0;
                                }
                                if (var275 > 127) {
                                    var275 = 127;
                                }
                                class31.field531 = var275;
                                class244.method1772(class215.field3689, 126);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6021) {
                                var8--;
                                class205.field3563 = class222.field3790[var8] == 1;
                                method867(1104);
                                continue;
                            }
                            if (var498 == 6023) {
                                var8--;
                                int var276 = class222.field3790[var8];
                                if (var276 < 0) {
                                    var276 = 0;
                                }
                                if (var276 > 2) {
                                    var276 = 2;
                                }
                                class164.method1127(var276);
                                class244.method1772(class215.field3689, 127);
                                class16.field241 = false;
                                continue;
                            }
                            if (var498 == 6024) {
                                var8--;
                                int var277 = class222.field3790[var8];
                                if (var277 < 0 || var277 > 2) {
                                    var277 = 0;
                                }
                                class327.field5494 = var277;
                                class244.method1772(class215.field3689, 127);
                                continue;
                            }
                        } else if (var498 < 6200) {
                            if (var498 == 6101) {
                                class222.field3790[var8++] = class281.field4822;
                                continue;
                            }
                            if (var498 == 6102) {
                                class222.field3790[var8++] = class110.method781((byte) 127) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6103) {
                                class222.field3790[var8++] = class320.field5415 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6105) {
                                class222.field3790[var8++] = class41.field735 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6106) {
                                class222.field3790[var8++] = class302.field5140 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6107) {
                                class222.field3790[var8++] = class308.field5212 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6108) {
                                class222.field3790[var8++] = class329.field5605 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6109) {
                                class222.field3790[var8++] = class38.field713 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6110) {
                                class222.field3790[var8++] = class45.field825 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6111) {
                                class222.field3790[var8++] = class243.field4293;
                                continue;
                            }
                            if (var498 == 6112) {
                                class222.field3790[var8++] = class329.field5607 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6114) {
                                class222.field3790[var8++] = class98.field1750 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6115) {
                                class222.field3790[var8++] = class201.field3527 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6116) {
                                class222.field3790[var8++] = class252.field4406;
                                continue;
                            }
                            if (var498 == 6117) {
                                class222.field3790[var8++] = class15.field218 ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6118) {
                                class222.field3790[var8++] = class298.field5083;
                                continue;
                            }
                            if (var498 == 6119) {
                                class222.field3790[var8++] = class27.field487;
                                continue;
                            }
                            if (var498 == 6120) {
                                class222.field3790[var8++] = class31.field531;
                                continue;
                            }
                            if (var498 == 6121) {
                                if (class108.field1900) {
                                    class222.field3790[var8++] = class108.field1923 ? 1 : 0;
                                } else {
                                    class222.field3790[var8++] = 0;
                                }
                                continue;
                            }
                            if (var498 == 6123) {
                                class222.field3790[var8++] = class164.method1112();
                                continue;
                            }
                            if (var498 == 6124) {
                                class222.field3790[var8++] = class327.field5494;
                                continue;
                            }
                        } else if (var498 < 6300) {
                            if (var498 == 6200) {
                                var8 -= 2;
                                class172.field2986 = (short) class222.field3790[var8];
                                if (class172.field2986 <= 0) {
                                    class172.field2986 = 256;
                                }
                                class93.field1686 = (short) class222.field3790[var8 + 1];
                                if (class93.field1686 <= 0) {
                                    class93.field1686 = 205;
                                }
                                continue;
                            }
                            if (var498 == 6201) {
                                var8 -= 2;
                                class44.field808 = (short) class222.field3790[var8];
                                if (class44.field808 <= 0) {
                                    class44.field808 = 256;
                                }
                                class238.field4163 = (short) class222.field3790[var8 + 1];
                                if (class238.field4163 <= 0) {
                                    class238.field4163 = 320;
                                }
                                continue;
                            }
                            if (var498 == 6202) {
                                var8 -= 4;
                                class186.field3271 = (short) class222.field3790[var8];
                                if (class186.field3271 <= 0) {
                                    class186.field3271 = 1;
                                }
                                class146.field2538 = (short) class222.field3790[var8 + 1];
                                if (class146.field2538 <= 0) {
                                    class146.field2538 = 32767;
                                } else if (class146.field2538 < class186.field3271) {
                                    class146.field2538 = class186.field3271;
                                }
                                class24.field443 = (short) class222.field3790[var8 + 2];
                                if (class24.field443 <= 0) {
                                    class24.field443 = 1;
                                }
                                class64.field1106 = (short) class222.field3790[var8 + 3];
                                if (class64.field1106 <= 0) {
                                    class64.field1106 = 32767;
                                } else if (class64.field1106 < class24.field443) {
                                    class64.field1106 = class24.field443;
                                }
                                continue;
                            }
                            if (var498 == 6203) {
                                class309.method2102(false, 512, class10.field128.field1295, 0, class10.field128.field1258, 0);
                                class222.field3790[var8++] = class195.field3394;
                                class222.field3790[var8++] = class309.field5216;
                                continue;
                            }
                            if (var498 == 6204) {
                                class222.field3790[var8++] = class44.field808;
                                class222.field3790[var8++] = class238.field4163;
                                continue;
                            }
                            if (var498 == 6205) {
                                class222.field3790[var8++] = class172.field2986;
                                class222.field3790[var8++] = class93.field1686;
                                continue;
                            }
                        } else if (var498 < 6400) {
                            if (var498 == 6300) {
                                class222.field3790[var8++] = (int) (class153.method1032(105) / 60000L);
                                continue;
                            }
                            if (var498 == 6301) {
                                class222.field3790[var8++] = (int) (class153.method1032(116) / 86400000L) - 11745;
                                continue;
                            }
                            if (var498 == 6302) {
                                var8 -= 3;
                                int var290 = class222.field3790[var8 + 1];
                                int var291 = class222.field3790[var8];
                                int var292 = class222.field3790[var8 + 2];
                                class73.field1386.clear();
                                class73.field1386.set(11, 12);
                                class73.field1386.set(var292, var290, var291);
                                class222.field3790[var8++] = (int) (class73.field1386.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var498 == 6303) {
                                class73.field1386.clear();
                                class73.field1386.setTime(new Date(class153.method1032(105)));
                                class222.field3790[var8++] = class73.field1386.get(1);
                                continue;
                            }
                            if (var498 == 6304) {
                                var8--;
                                int var293 = class222.field3790[var8];
                                boolean var294 = true;
                                if (var293 < 0) {
                                    var294 = ((var293 + 1) % 4) == 0;
                                } else if (var293 < 1582) {
                                    var294 = var293 % 4 == 0;
                                } else if ((var293 % 4) != 0) {
                                    var294 = false;
                                } else if (var293 % 100 != 0) {
                                    var294 = true;
                                } else if (var293 % 400 != 0) {
                                    var294 = false;
                                }
                                class222.field3790[var8++] = var294 ? 1 : 0;
                                continue;
                            }
                        } else if (var498 < 6500) {
                            if (var498 == 6405) {
                                class222.field3790[var8++] = class149.method1022(107) ? 1 : 0;
                                continue;
                            }
                            if (var498 == 6406) {
                                class222.field3790[var8++] = class168.method1141(true) ? 1 : 0;
                                continue;
                            }
                        } else if (var498 < 6600) {
                            if (var498 == 6500) {
                                if (class325.field5482 == 10 && class312.field5253 == 0 && class16.field253 == 0 && class252.field4409 == 0) {
                                    class222.field3790[var8++] = class165.method1134(1002) == -1 ? 0 : 1;
                                    continue;
                                }
                                class222.field3790[var8++] = 1;
                                continue;
                            }
                            if (var498 == 6501) {
                                class222 var278 = class321.method2160(25589);
                                if (var278 == null) {
                                    class222.field3790[var8++] = -1;
                                    class222.field3790[var8++] = 0;
                                    class24.field440[var6++] = class260.field4522;
                                    class222.field3790[var8++] = 0;
                                    class24.field440[var6++] = class260.field4522;
                                    class222.field3790[var8++] = 0;
                                } else {
                                    class222.field3790[var8++] = var278.field3798;
                                    class222.field3790[var8++] = var278.field4863;
                                    class24.field440[var6++] = var278.field3794;
                                    class140 var279 = var278.method1530((byte) -100);
                                    class222.field3790[var8++] = var279.field2443;
                                    class24.field440[var6++] = var279.field2440;
                                    class222.field3790[var8++] = var278.field4854;
                                }
                                continue;
                            }
                            if (var498 == 6502) {
                                class222 var280 = class10.method57((byte) 59);
                                if (var280 == null) {
                                    class222.field3790[var8++] = -1;
                                    class222.field3790[var8++] = 0;
                                    class24.field440[var6++] = class260.field4522;
                                    class222.field3790[var8++] = 0;
                                    class24.field440[var6++] = class260.field4522;
                                    class222.field3790[var8++] = 0;
                                } else {
                                    class222.field3790[var8++] = var280.field3798;
                                    class222.field3790[var8++] = var280.field4863;
                                    class24.field440[var6++] = var280.field3794;
                                    class140 var281 = var280.method1530((byte) -100);
                                    class222.field3790[var8++] = var281.field2443;
                                    class24.field440[var6++] = var281.field2440;
                                    class222.field3790[var8++] = var280.field4854;
                                }
                                continue;
                            }
                            if (var498 == 6503) {
                                var8--;
                                int var282 = class222.field3790[var8];
                                if (class325.field5482 == 10 && class312.field5253 == 0 && class16.field253 == 0 && class252.field4409 == 0) {
                                    class222.field3790[var8++] = class323.method2173(-1, var282) ? 1 : 0;
                                    continue;
                                }
                                class222.field3790[var8++] = 0;
                                continue;
                            }
                            if (var498 == 6504) {
                                var8--;
                                class1.field6 = class222.field3790[var8];
                                class244.method1772(class215.field3689, 127);
                                continue;
                            }
                            if (var498 == 6505) {
                                class222.field3790[var8++] = class1.field6;
                                continue;
                            }
                            if (var498 == 6506) {
                                var8--;
                                int var283 = class222.field3790[var8];
                                class222 var284 = class120.method848(var283, (byte) 118);
                                if (var284 == null) {
                                    class222.field3790[var8++] = -1;
                                    class24.field440[var6++] = class260.field4522;
                                    class222.field3790[var8++] = 0;
                                    class24.field440[var6++] = class260.field4522;
                                    class222.field3790[var8++] = 0;
                                } else {
                                    class222.field3790[var8++] = var284.field4863;
                                    class24.field440[var6++] = var284.field3794;
                                    class140 var285 = var284.method1530((byte) -100);
                                    class222.field3790[var8++] = var285.field2443;
                                    class24.field440[var6++] = var285.field2440;
                                    class222.field3790[var8++] = var284.field4854;
                                }
                                continue;
                            }
                            if (var498 == 6507) {
                                var8 -= 4;
                                boolean var286 = class222.field3790[var8 + 1] == 1;
                                int var287 = class222.field3790[var8];
                                int var288 = class222.field3790[var8 + 2];
                                boolean var289 = class222.field3790[var8 + 3] == 1;
                                class151.method1028(28449, var286, var287, var289, var288);
                                continue;
                            }
                        } else if (var498 < 6700) {
                            if (var498 == 6600) {
                                var8--;
                                class282.field4836 = class222.field3790[var8] == 1;
                                class244.method1772(class215.field3689, arg2 + 122);
                                continue;
                            }
                            if (var498 == 6601) {
                                class222.field3790[var8++] = class282.field4836 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var498 == 4500) {
                        var8 -= 2;
                        int var321 = class222.field3790[var8 + 1];
                        int var322 = class222.field3790[var8];
                        class254 var323 = class200.method1405(var321, -9);
                        if (var323.method1809(-69)) {
                            class24.field440[var6++] = class202.method1412(var322, -122).method1679(var323.field4424, var321, (byte) 1);
                        } else {
                            class222.field3790[var8++] = class202.method1412(var322, -92).method1680(var321, 0, var323.field4425);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var497) {
            if (var5.field1005 == null) {
                if (class329.field5599 != 0) {
                    class28.method245((byte) -75, 0, class260.field4522, class111.field1954);
                }
                class201.method1407(1, "CS2 - scr:" + var5.field4265 + " op:" + var11, var497);
            } else {
                class229 var493 = class4.method19(30, arg2 - 84);
                var493.method1652(class100.field1760, -12501).method1652(var5.field1005, -12501);
                for (int var494 = class137.field2384 - 1; var494 >= 0; var494--) {
                    var493.method1652(class327.field5491, -12501).method1652(class170.field2970[var494].field4247.field1005, -12501);
                }
                if (var11 == 40) {
                    int var495 = var10[var7];
                    var493.method1652(class15.field225, -12501).method1652(class84.method607(arg2 ^ 0x53, var495), -12501);
                }
                if (class329.field5599 != 0) {
                    class28.method245((byte) -75, 0, class260.field4522, class142.method989(new class229[] { class64.field1107, var5.field1005 }, -72));
                }
                class201.method1407(arg2 - 4, "CS2 - scr:" + var5.field4265 + " op:" + var11 + new String(var493.method1614((byte) 44)), var497);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)J", line = 6119)
    public static final long method864(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2201; var4++) {
            class104 var5 = var3.field2204[var4];
            if ((var5.field1814 >> 29 & 0x3L) == 2L && var5.field1800 == arg1 && var5.field1791 == arg2) {
                return var5.field1814;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V", line = 6144)
    public final void method865(int arg0) {
        field2153++;
        this.field4845 = class153.method1032(125) + 500L | Long.MIN_VALUE & this.field4845;
        if (arg0 >= -30) {
            method872(91, 106, 113, 104, 24);
        }
        class201.field3517.method375(42, this);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILek;II)Lsm;", line = 6159)
    public static final class159 method866(int arg0, class185 arg1, int arg2, int arg3) {
        if (arg0 <= 24) {
            field2167 = (class229) null;
        }
        field2158++;
        return class208.method1444(arg3, -28236, arg2, arg1) ? class6.method38(false) : null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(II)V", line = 6175)
    public class122(int arg0, int arg1) {
        this.field4265 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V", line = 6195)
    public static final void method867(int arg0) {
        if (arg0 != 1104) {
            method866(122, (class185) null, 46, -76);
        }
        field2159++;
        int var1 = class269.method1903(-24433);
        if (var1 == 0) {
            class288.field4933 = (byte[][][]) null;
            class224.method1538(1508, 0);
        } else if (var1 == 1) {
            class217.method1503(-107, (byte) 0);
            class224.method1538(1508, 512);
            class98.method670(arg0 - 30348);
        } else {
            class217.method1503(112, (byte) (class295.field5049 - 4 & 0xFF));
            class224.method1538(arg0 + 404, 2);
        }
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V", line = 6225)
    public static void method868(int arg0) {
        field2169 = null;
        field2162 = null;
        field2148 = null;
        field2164 = null;
        field2157 = null;
        if (arg0 == 1300) {
            field2167 = null;
            field2166 = null;
            field2161 = (boolean[][]) null;
            field2165 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)I", line = 6243)
    public final int method869(int arg0) {
        field2146++;
        if (arg0 != -2195) {
            this.method870(97);
        }
        return (int) this.field4265;
    }

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)I", line = 6272)
    public final int method870(int arg0) {
        field2151++;
        if (arg0 >= -125) {
            field2164 = (class229) null;
        }
        return (int) (this.field4265 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)J", line = 6288)
    public final long method871(byte arg0) {
        field2149++;
        return arg0 > -124 ? -81L : Long.MAX_VALUE & this.field4845;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V", line = 6299)
    public static final void method872(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2163++;
        for (int var5 = arg3; var5 < class241.field4250; var5++) {
            if (arg0 < (class305.field5167[var5] + class124.field2178[var5]) && class305.field5167[var5] < (arg0 + arg2) && class162.field2764[var5] + class143.field2499[var5] > arg1 && class162.field2764[var5] < arg1 + arg4) {
                class244.field4341[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)I", line = 6322)
    public static final int method873(byte arg0) {
        field2156++;
        if (arg0 != 87) {
            field2148 = (boolean[]) null;
        }
        return class293.field5020;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Lra;", line = 6334)
    public static final class323 method874(int arg0, int arg1) {
        field2155++;
        class323 var2 = (class323) class52.field907.method229((long) arg1, arg0 + 2688);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -2702) {
            field2148 = (boolean[]) null;
        }
        byte[] var3 = class90.field1648.method1275(arg1, 4, -5211);
        class323 var4 = new class323();
        if (var3 != null) {
            var4.method2180(new class14(var3), arg1, 77);
        }
        class52.field907.method227(-25077, var4, (long) arg1);
        return var4;
    }
}
