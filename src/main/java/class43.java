import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class43 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lui;")
    private class236 field562 = new class236(256);

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lui;")
    private class236 field571 = new class236(256);

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Loe;")
    private class256 field564;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Loe;")
    private class256 field567;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lqe;")
    public static class168 field565 = class66.method448(")3runescape)3com)4l=", -109);

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lqe;")
    public static class168 field566 = class66.method448("", 110);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field561 = 0;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static void method285(boolean arg0) {
        field565 = null;
        field566 = null;
        if (arg0) {
            method285(false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([IIZ)Lkh;")
    public final class220 method286(int[] arg0, int arg1, boolean arg2) {
        field568++;
        if (this.field564.method1698(118) == 1) {
            return this.method288(arg1, 0, (byte) -91, arg0);
        } else if (this.field564.method1694(arg1, 28851) == 1) {
            return this.method288(0, arg1, (byte) -92, arg0);
        } else if (arg2) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BILaa;)V")
    public static final void method287(byte arg0, int arg1, class147 arg2) {
        field563++;
        Object[] var3 = arg2.field2566;
        int var4 = (Integer) var3[0];
        class182 var5 = class252.method1668(var4, (byte) -56);
        if (var5 == null) {
            return;
        }
        class92.field1459 = 0;
        int var6 = 0;
        int[] var7 = var5.field3228;
        int[] var8 = var5.field3235;
        int var9 = -1;
        int var10 = 0;
        byte var11 = -1;
        try {
            class249.field4307 = new class168[var5.field3233];
            int var12 = 0;
            class89.field1383 = new int[var5.field3232];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field2553;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field2557;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field2552 == null ? -1 : arg2.field2552.field2222;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field2573;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field2552 == null ? -1 : arg2.field2552.field2123;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field2571 == null ? -1 : arg2.field2571.field2222;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field2571 == null ? -1 : arg2.field2571.field2123;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field2568;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field2572;
                    }
                    class89.field1383[var12++] = var15;
                } else if (var3[var14] instanceof class168) {
                    class168 var16 = (class168) var3[var14];
                    if (var16.method1111(103, class109.field1743)) {
                        var16 = arg2.field2559;
                    }
                    class249.field4307[var13++] = var16;
                }
            }
            int var17 = 0;
            if (arg0 != -6) {
                field566 = null;
            }
            label3285: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var9++;
                int var434 = var8[var9];
                if (var434 < 100) {
                    if (var434 == 0) {
                        class124.field2047[var6++] = var7[var9];
                        continue;
                    }
                    if (var434 == 1) {
                        int var18 = var7[var9];
                        class124.field2047[var6++] = class92.field1441[var18];
                        continue;
                    }
                    if (var434 == 2) {
                        int var19 = var7[var9];
                        var6--;
                        class125.method853(var19, class124.field2047[var6], 31);
                        continue;
                    }
                    if (var434 == 3) {
                        class27.field324[var10++] = var5.field3234[var9];
                        continue;
                    }
                    if (var434 == 6) {
                        var9 += var7[var9];
                        continue;
                    }
                    if (var434 == 7) {
                        var6 -= 2;
                        if (class124.field2047[var6 + 1] != class124.field2047[var6]) {
                            var9 += var7[var9];
                        }
                        continue;
                    }
                    if (var434 == 8) {
                        var6 -= 2;
                        if (class124.field2047[var6 + 1] == class124.field2047[var6]) {
                            var9 += var7[var9];
                        }
                        continue;
                    }
                    if (var434 == 9) {
                        var6 -= 2;
                        if (class124.field2047[var6] < class124.field2047[var6 + 1]) {
                            var9 += var7[var9];
                        }
                        continue;
                    }
                    if (var434 == 10) {
                        var6 -= 2;
                        if (class124.field2047[var6 + 1] < class124.field2047[var6]) {
                            var9 += var7[var9];
                        }
                        continue;
                    }
                    if (var434 == 21) {
                        if (class92.field1459 == 0) {
                            return;
                        }
                        class33 var20 = class134.field2344[--class92.field1459];
                        class89.field1383 = var20.field412;
                        var5 = var20.field414;
                        var7 = var5.field3228;
                        class249.field4307 = var20.field410;
                        var9 = var20.field408;
                        var8 = var5.field3235;
                        continue;
                    }
                    if (var434 == 25) {
                        int var21 = var7[var9];
                        class124.field2047[var6++] = class80.method531(-56, var21);
                        continue;
                    }
                    if (var434 == 27) {
                        int var22 = var7[var9];
                        var6--;
                        class253.method1672((byte) -116, var22, class124.field2047[var6]);
                        continue;
                    }
                    if (var434 == 31) {
                        var6 -= 2;
                        if (class124.field2047[var6 + 1] >= class124.field2047[var6]) {
                            var9 += var7[var9];
                        }
                        continue;
                    }
                    if (var434 == 32) {
                        var6 -= 2;
                        if (class124.field2047[var6 + 1] <= class124.field2047[var6]) {
                            var9 += var7[var9];
                        }
                        continue;
                    }
                    if (var434 == 33) {
                        class124.field2047[var6++] = class89.field1383[var7[var9]];
                        continue;
                    }
                    int var10001;
                    if (var434 == 34) {
                        var10001 = var7[var9];
                        var6--;
                        class89.field1383[var10001] = class124.field2047[var6];
                        continue;
                    }
                    if (var434 == 35) {
                        class27.field324[var10++] = class249.field4307[var7[var9]];
                        continue;
                    }
                    if (var434 == 36) {
                        var10001 = var7[var9];
                        var10--;
                        class249.field4307[var10001] = class27.field324[var10];
                        continue;
                    }
                    if (var434 == 37) {
                        int var23 = var7[var9];
                        var10 -= var23;
                        class168 var24 = class142.method973((byte) -125, var23, var10, class27.field324);
                        class27.field324[var10++] = var24;
                        continue;
                    }
                    if (var434 == 38) {
                        var6--;
                        continue;
                    }
                    if (var434 == 39) {
                        var10--;
                        continue;
                    }
                    if (var434 == 40) {
                        int var25 = var7[var9];
                        class182 var26 = class252.method1668(var25, (byte) -56);
                        int[] var27 = new int[var26.field3232];
                        class168[] var28 = new class168[var26.field3233];
                        for (int var29 = 0; var29 < var26.field3231; var29++) {
                            var27[var29] = class124.field2047[var6 + var29 - var26.field3231];
                        }
                        for (int var30 = 0; var30 < var26.field3227; var30++) {
                            var28[var30] = class27.field324[var10 + var30 - var26.field3227];
                        }
                        var10 -= var26.field3227;
                        var6 -= var26.field3231;
                        class33 var31 = new class33();
                        var31.field414 = var5;
                        var31.field408 = var9;
                        var31.field412 = class89.field1383;
                        var31.field410 = class249.field4307;
                        if (class134.field2344.length <= class92.field1459) {
                            throw new RuntimeException();
                        }
                        class134.field2344[class92.field1459++] = var31;
                        var5 = var26;
                        class249.field4307 = var28;
                        var8 = var26.field3235;
                        class89.field1383 = var27;
                        var7 = var26.field3228;
                        var9 = -1;
                        continue;
                    }
                    if (var434 == 42) {
                        class124.field2047[var6++] = class131.field2315[var7[var9]];
                        continue;
                    }
                    if (var434 == 43) {
                        int var32 = var7[var9];
                        var6--;
                        class131.field2315[var32] = class124.field2047[var6];
                        class143.method978(var32, arg0 ^ 0x5);
                        continue;
                    }
                    if (var434 == 44) {
                        int var33 = var7[var9] >> 16;
                        int var34 = var7[var9] & 0xFFFF;
                        var6--;
                        int var35 = class124.field2047[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            class103.field1658[var33] = var35;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label3285;
                                }
                                class178.field3145[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var434 == 45) {
                        var6--;
                        int var38 = class124.field2047[var6];
                        int var39 = var7[var9];
                        if (var38 >= 0 && var38 < class103.field1658[var39]) {
                            class124.field2047[var6++] = class178.field3145[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var434 == 46) {
                        int var40 = var7[var9];
                        var6 -= 2;
                        int var41 = class124.field2047[var6];
                        if (var41 >= 0 && class103.field1658[var40] > var41) {
                            class178.field3145[var40][var41] = class124.field2047[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var434 == 47) {
                        class168 var42 = class1.field8[var7[var9]];
                        if (var42 == null) {
                            var42 = class25.field306;
                        }
                        class27.field324[var10++] = var42;
                        continue;
                    }
                    if (var434 == 48) {
                        int var43 = var7[var9];
                        var10--;
                        class1.field8[var43] = class27.field324[var10];
                        class181.method1200(true, var43);
                        continue;
                    }
                    if (var434 == 51) {
                        class236 var44 = var5.field3230[var7[var9]];
                        var6--;
                        class172 var45 = (class172) var44.method1527((long) class124.field2047[var6], (byte) -80);
                        if (var45 != null) {
                            var9 += var45.field2991;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var7[var9] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var434 < 300) {
                    if (var434 == 100) {
                        var6 -= 3;
                        int var47 = class124.field2047[var6 + 1];
                        int var48 = class124.field2047[var6];
                        int var49 = class124.field2047[var6 + 2];
                        if (var47 == 0) {
                            throw new RuntimeException();
                        }
                        class129 var50 = class257.method1713(var48, 127);
                        if (var50.field2263 == null) {
                            var50.field2263 = new class129[var49 + 1];
                        }
                        if (var49 >= var50.field2263.length) {
                            class129[] var51 = new class129[var49 + 1];
                            for (int var52 = 0; var52 < var50.field2263.length; var52++) {
                                var51[var52] = var50.field2263[var52];
                            }
                            var50.field2263 = var51;
                        }
                        if (var49 > 0 && var50.field2263[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class129 var53 = new class129();
                        var53.field2258 = true;
                        var53.field2276 = var53.field2222 = var50.field2222;
                        var53.field2230 = var47;
                        var53.field2123 = var49;
                        var50.field2263[var49] = var53;
                        if (var46) {
                            class155.field2700 = var53;
                        } else {
                            class102.field1625 = var53;
                        }
                        class65.method443(var50, 0);
                        continue;
                    }
                    if (var434 == 101) {
                        class129 var54 = var46 ? class155.field2700 : class102.field1625;
                        if (var54.field2123 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class129 var55 = class257.method1713(var54.field2222, 127);
                        var55.field2263[var54.field2123] = null;
                        class65.method443(var55, 0);
                        continue;
                    }
                    if (var434 == 102) {
                        var6--;
                        class129 var56 = class257.method1713(class124.field2047[var6], arg0 + 133);
                        var56.field2263 = null;
                        class65.method443(var56, 0);
                        continue;
                    }
                    if (var434 == 200) {
                        var6 -= 2;
                        int var57 = class124.field2047[var6];
                        int var58 = class124.field2047[var6 + 1];
                        class129 var59 = class58.method404(var58, false, var57);
                        if (var59 != null && var58 != -1) {
                            class124.field2047[var6++] = 1;
                            if (var46) {
                                class155.field2700 = var59;
                            } else {
                                class102.field1625 = var59;
                            }
                            continue;
                        }
                        class124.field2047[var6++] = 0;
                        continue;
                    }
                    if (var434 == 201) {
                        var6--;
                        int var60 = class124.field2047[var6];
                        class129 var61 = class257.method1713(var60, 126);
                        if (var61 == null) {
                            class124.field2047[var6++] = 0;
                        } else {
                            class124.field2047[var6++] = 1;
                            if (var46) {
                                class155.field2700 = var61;
                            } else {
                                class102.field1625 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var434 < 500) {
                    if (var434 == 403) {
                        var6 -= 2;
                        int var62 = class124.field2047[var6];
                        int var63 = class124.field2047[var6 + 1];
                        if (var62 >= 7) {
                            var62 -= 7;
                        }
                        class7.field85.field2001.method950(var62, (byte) -125, var63);
                        continue;
                    }
                    if (var434 == 404) {
                        var6 -= 2;
                        int var64 = class124.field2047[var6 + 1];
                        int var65 = class124.field2047[var6];
                        class7.field85.field2001.method957(-56, var64, var65);
                        continue;
                    }
                    if (var434 == 410) {
                        var6--;
                        boolean var66 = class124.field2047[var6] != 0;
                        class7.field85.field2001.method955(arg0 + 25, var66);
                        continue;
                    }
                } else if (var434 >= 1000 && var434 < 1100 || var434 >= 2000 && var434 < 2100) {
                    class129 var422;
                    if (var434 >= 2000) {
                        var434 -= 1000;
                        var6--;
                        var422 = class257.method1713(class124.field2047[var6], 127);
                    } else {
                        var422 = var46 ? class155.field2700 : class102.field1625;
                    }
                    if (var434 == 1000) {
                        var6 -= 4;
                        var422.field2254 = class124.field2047[var6];
                        var422.field2200 = class124.field2047[var6 + 1];
                        int var423 = class124.field2047[var6 + 2];
                        if (var423 < 0) {
                            var423 = 0;
                        } else if (var423 > 5) {
                            var423 = 5;
                        }
                        int var424 = class124.field2047[var6 + 3];
                        var422.field2278 = (byte) var423;
                        if (var424 < 0) {
                            var424 = 0;
                        } else if (var424 > 5) {
                            var424 = 5;
                        }
                        var422.field2167 = (byte) var424;
                        class65.method443(var422, 0);
                        class155.method1025(var422, false);
                        continue;
                    }
                    if (var434 == 1001) {
                        var6 -= 4;
                        var422.field2166 = class124.field2047[var6];
                        var422.field2253 = class124.field2047[var6 + 1];
                        var422.field2157 = 0;
                        var422.field2260 = 0;
                        int var425 = class124.field2047[var6 + 2];
                        if (var425 < 0) {
                            var425 = 0;
                        } else if (var425 > 4) {
                            var425 = 4;
                        }
                        int var426 = class124.field2047[var6 + 3];
                        if (var426 < 0) {
                            var426 = 0;
                        } else if (var426 > 4) {
                            var426 = 4;
                        }
                        var422.field2264 = (byte) var426;
                        var422.field2182 = (byte) var425;
                        class65.method443(var422, arg0 + 6);
                        if (var422.field2230 == 0) {
                            class149.method993(arg0 ^ 0xFFFFD810, false, var422);
                        }
                        class155.method1025(var422, false);
                        continue;
                    }
                    if (var434 == 1003) {
                        var6--;
                        boolean var427 = class124.field2047[var6] == 1;
                        if (var422.field2289 != var427) {
                            var422.field2289 = var427;
                            class65.method443(var422, 0);
                        }
                        continue;
                    }
                    if (var434 == 1004) {
                        var6 -= 2;
                        var422.field2237 = class124.field2047[var6];
                        var422.field2268 = class124.field2047[var6 + 1];
                        class65.method443(var422, 0);
                        if (var422.field2230 == 0) {
                            class149.method993(10218, false, var422);
                        }
                        class155.method1025(var422, false);
                        continue;
                    }
                } else if (var434 >= 1100 && var434 < 1200 || var434 >= 2100 && var434 < 2200) {
                    class129 var67;
                    if (var434 < 2000) {
                        var67 = var46 ? class155.field2700 : class102.field1625;
                    } else {
                        var6--;
                        var67 = class257.method1713(class124.field2047[var6], 127);
                        var434 -= 1000;
                    }
                    if (var434 == 1100) {
                        var6 -= 2;
                        var67.field2203 = class124.field2047[var6];
                        if (var67.field2271 - var67.field2175 < var67.field2203) {
                            var67.field2203 = var67.field2271 - var67.field2175;
                        }
                        if (var67.field2203 < 0) {
                            var67.field2203 = 0;
                        }
                        var67.field2224 = class124.field2047[var6 + 1];
                        if (var67.field2291 - var67.field2210 < var67.field2224) {
                            var67.field2224 = var67.field2291 - var67.field2210;
                        }
                        if (var67.field2224 < 0) {
                            var67.field2224 = 0;
                        }
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1101) {
                        var6--;
                        var67.field2137 = class124.field2047[var6];
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1102) {
                        var6--;
                        var67.field2177 = class124.field2047[var6] == 1;
                        class65.method443(var67, arg0 + 6);
                        continue;
                    }
                    if (var434 == 1103) {
                        var6--;
                        var67.field2225 = class124.field2047[var6];
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1104) {
                        var6--;
                        var67.field2127 = class124.field2047[var6];
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1105) {
                        var6--;
                        var67.field2281 = class124.field2047[var6];
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1106) {
                        var6--;
                        var67.field2188 = class124.field2047[var6];
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1107) {
                        var6--;
                        var67.field2283 = class124.field2047[var6] == 1;
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1108) {
                        var67.field2180 = 1;
                        var6--;
                        var67.field2259 = class124.field2047[var6];
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1109) {
                        var6 -= 6;
                        var67.field2246 = class124.field2047[var6];
                        var67.field2161 = class124.field2047[var6 + 1];
                        var67.field2124 = class124.field2047[var6 + 2];
                        var67.field2186 = class124.field2047[var6 + 3];
                        var67.field2163 = class124.field2047[var6 + 4];
                        var67.field2154 = class124.field2047[var6 + 5];
                        class65.method443(var67, arg0 ^ 0xFFFFFFFA);
                        continue;
                    }
                    if (var434 == 1110) {
                        var6--;
                        int var68 = class124.field2047[var6];
                        if (var67.field2239 != var68) {
                            var67.field2172 = 0;
                            var67.field2239 = var68;
                            var67.field2229 = 0;
                            class65.method443(var67, 0);
                        }
                        continue;
                    }
                    if (var434 == 1111) {
                        var6--;
                        var67.field2205 = class124.field2047[var6] == 1;
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1112) {
                        var10--;
                        class168 var69 = class27.field324[var10];
                        if (!var69.method1111(arg0 + 101, var67.field2164)) {
                            var67.field2164 = var69;
                            class65.method443(var67, 0);
                        }
                        continue;
                    }
                    if (var434 == 1113) {
                        var6--;
                        var67.field2147 = class124.field2047[var6];
                        class65.method443(var67, arg0 + 6);
                        continue;
                    }
                    if (var434 == 1114) {
                        var6 -= 3;
                        var67.field2286 = class124.field2047[var6];
                        var67.field2193 = class124.field2047[var6 + 1];
                        var67.field2132 = class124.field2047[var6 + 2];
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1115) {
                        var6--;
                        var67.field2288 = class124.field2047[var6] == 1;
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1116) {
                        var6--;
                        var67.field2146 = class124.field2047[var6];
                        class65.method443(var67, arg0 + 6);
                        continue;
                    }
                    if (var434 == 1117) {
                        var6--;
                        var67.field2240 = class124.field2047[var6];
                        class65.method443(var67, arg0 + 6);
                        continue;
                    }
                    if (var434 == 1118) {
                        var6--;
                        var67.field2262 = class124.field2047[var6] == 1;
                        class65.method443(var67, arg0 ^ 0xFFFFFFFA);
                        continue;
                    }
                    if (var434 == 1119) {
                        var6--;
                        var67.field2261 = class124.field2047[var6] == 1;
                        class65.method443(var67, 0);
                        continue;
                    }
                    if (var434 == 1120) {
                        var6 -= 2;
                        var67.field2271 = class124.field2047[var6];
                        var67.field2291 = class124.field2047[var6 + 1];
                        class65.method443(var67, 0);
                        if (var67.field2230 == 0) {
                            class149.method993(10218, false, var67);
                        }
                        continue;
                    }
                    if (var434 == 1121) {
                        class65.method443(var67, arg0 ^ 0xFFFFFFFA);
                        var6 -= 2;
                        continue;
                    }
                    if (var434 == 1122) {
                        var6--;
                        var67.field2178 = class124.field2047[var6] == 1;
                        class65.method443(var67, arg0 + 6);
                        continue;
                    }
                } else if (var434 >= 1200 && var434 < 1300 || var434 >= 2200 && var434 < 2300) {
                    class129 var70;
                    if (var434 < 2000) {
                        var70 = var46 ? class155.field2700 : class102.field1625;
                    } else {
                        var434 -= 1000;
                        var6--;
                        var70 = class257.method1713(class124.field2047[var6], 126);
                    }
                    class65.method443(var70, 0);
                    if (var434 == 1200 || var434 == 1205) {
                        var6 -= 2;
                        int var71 = class124.field2047[var6 + 1];
                        int var72 = class124.field2047[var6];
                        if (var72 == -1) {
                            var70.field2180 = 1;
                            var70.field2187 = -1;
                            var70.field2259 = -1;
                        } else {
                            var70.field2195 = var71;
                            var70.field2187 = var72;
                            class242 var73 = class151.method1005(520, var72);
                            var70.field2154 = var73.field4193;
                            if (var434 == 1205) {
                                var70.field2256 = false;
                            } else {
                                var70.field2256 = true;
                            }
                            var70.field2161 = var73.field4163;
                            var70.field2246 = var73.field4185;
                            var70.field2124 = var73.field4149;
                            var70.field2186 = var73.field4161;
                            var70.field2163 = var73.field4189;
                            if (var70.field2157 > 0) {
                                var70.field2154 = var70.field2154 * 32 / var70.field2157;
                            } else if (var70.field2166 > 0) {
                                var70.field2154 = var70.field2154 * 32 / var70.field2166;
                            }
                        }
                        continue;
                    }
                    if (var434 == 1201) {
                        var70.field2180 = 2;
                        var6--;
                        var70.field2259 = class124.field2047[var6];
                        continue;
                    }
                    if (var434 == 1202) {
                        var70.field2180 = 3;
                        var70.field2259 = class7.field85.field2001.method954((byte) 127);
                        continue;
                    }
                    if (var434 == 1203) {
                        var70.field2180 = 6;
                        var6--;
                        var70.field2259 = class124.field2047[var6];
                        continue;
                    }
                    if (var434 == 1204) {
                        var70.field2180 = 5;
                        var6--;
                        var70.field2259 = class124.field2047[var6];
                        continue;
                    }
                } else if ((var434 < 1300 || var434 >= 1400) && (var434 < 2300 || var434 >= 2400)) {
                    if (var434 >= 1400 && var434 < 1500 || var434 >= 2400 && var434 < 2500) {
                        class129 var411;
                        if (var434 < 2000) {
                            var411 = var46 ? class155.field2700 : class102.field1625;
                        } else {
                            var434 -= 1000;
                            var6--;
                            var411 = class257.method1713(class124.field2047[var6], arg0 + 132);
                        }
                        int[] var412 = null;
                        var10--;
                        class168 var413 = class27.field324[var10];
                        if (var413.method1109((byte) 66) > 0 && var413.method1110(255, var413.method1109((byte) 31) - 1) == 89) {
                            var6--;
                            int var414 = class124.field2047[var6];
                            if (var414 > 0) {
                                var412 = new int[var414];
                                while (var414-- > 0) {
                                    var6--;
                                    var412[var414] = class124.field2047[var6];
                                }
                            }
                            var413 = var413.method1078(0, (byte) -75, var413.method1109((byte) 65) - 1);
                        }
                        Object[] var415 = new Object[var413.method1109((byte) 38) + 1];
                        for (int var416 = var415.length - 1; var416 >= 1; var416--) {
                            if (var413.method1110(arg0 ^ 0xFFFFFF05, var416 - 1) == 115) {
                                var10--;
                                var415[var416] = class27.field324[var10];
                            } else {
                                var6--;
                                var415[var416] = Integer.valueOf(class124.field2047[var6]);
                            }
                        }
                        var6--;
                        int var417 = class124.field2047[var6];
                        if (var417 == -1) {
                            var415 = null;
                        } else {
                            var415[0] = Integer.valueOf(var417);
                        }
                        var411.field2215 = true;
                        if (var434 == 1400) {
                            var411.field2155 = var415;
                        } else if (var434 == 1401) {
                            var411.field2290 = var415;
                        } else if (var434 == 1402) {
                            var411.field2145 = var415;
                        } else if (var434 == 1403) {
                            var411.field2160 = var415;
                        } else if (var434 == 1404) {
                            var411.field2131 = var415;
                        } else if (var434 == 1405) {
                            var411.field2130 = var415;
                        } else if (var434 == 1406) {
                            var411.field2192 = var415;
                        } else if (var434 == 1407) {
                            var411.field2236 = var412;
                            var411.field2212 = var415;
                        } else if (var434 == 1408) {
                            var411.field2279 = var415;
                        } else if (var434 == 1409) {
                            var411.field2201 = var415;
                        } else if (var434 == 1410) {
                            var411.field2213 = var415;
                        } else if (var434 == 1411) {
                            var411.field2274 = var415;
                        } else if (var434 == 1412) {
                            var411.field2242 = var415;
                        } else if (var434 == 1414) {
                            var411.field2129 = var415;
                            var411.field2255 = var412;
                        } else if (var434 == 1415) {
                            var411.field2218 = var415;
                            var411.field2251 = var412;
                        } else if (var434 == 1416) {
                            var411.field2216 = var415;
                        } else if (var434 == 1417) {
                            var411.field2226 = var415;
                        } else if (var434 == 1418) {
                            var411.field2202 = var415;
                        } else if (var434 == 1419) {
                            var411.field2204 = var415;
                        } else if (var434 == 1420) {
                            var411.field2143 = var415;
                        } else if (var434 == 1421) {
                            var411.field2134 = var415;
                        } else if (var434 == 1422) {
                            var411.field2171 = var415;
                        } else if (var434 == 1423) {
                            var411.field2250 = var415;
                        } else if (var434 == 1424) {
                            var411.field2170 = var415;
                        } else if (var434 == 1425) {
                            var411.field2267 = var415;
                        } else if (var434 == 1426) {
                            var411.field2211 = var415;
                        } else if (var434 == 1427) {
                            var411.field2138 = var415;
                        } else if (var434 == 1428) {
                            var411.field2277 = var412;
                            var411.field2247 = var415;
                        } else if (var434 == 1429) {
                            var411.field2209 = var412;
                            var411.field2197 = var415;
                        }
                        continue;
                    }
                    if (var434 < 1600) {
                        class129 var74 = var46 ? class155.field2700 : class102.field1625;
                        if (var434 == 1500) {
                            class124.field2047[var6++] = var74.field2139;
                            continue;
                        }
                        if (var434 == 1501) {
                            class124.field2047[var6++] = var74.field2231;
                            continue;
                        }
                        if (var434 == 1502) {
                            class124.field2047[var6++] = var74.field2175;
                            continue;
                        }
                        if (var434 == 1503) {
                            class124.field2047[var6++] = var74.field2210;
                            continue;
                        }
                        if (var434 == 1504) {
                            class124.field2047[var6++] = var74.field2289 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 1505) {
                            class124.field2047[var6++] = var74.field2276;
                            continue;
                        }
                    } else if (var434 < 1700) {
                        class129 var75 = var46 ? class155.field2700 : class102.field1625;
                        if (var434 == 1600) {
                            class124.field2047[var6++] = var75.field2203;
                            continue;
                        }
                        if (var434 == 1601) {
                            class124.field2047[var6++] = var75.field2224;
                            continue;
                        }
                        if (var434 == 1602) {
                            class27.field324[var10++] = var75.field2164;
                            continue;
                        }
                        if (var434 == 1603) {
                            class124.field2047[var6++] = var75.field2271;
                            continue;
                        }
                        if (var434 == 1604) {
                            class124.field2047[var6++] = var75.field2291;
                            continue;
                        }
                        if (var434 == 1605) {
                            class124.field2047[var6++] = var75.field2154;
                            continue;
                        }
                        if (var434 == 1606) {
                            class124.field2047[var6++] = var75.field2124;
                            continue;
                        }
                        if (var434 == 1607) {
                            class124.field2047[var6++] = var75.field2163;
                            continue;
                        }
                        if (var434 == 1608) {
                            class124.field2047[var6++] = var75.field2186;
                            continue;
                        }
                        if (var434 == 1609) {
                            class124.field2047[var6++] = var75.field2225;
                            continue;
                        }
                    } else if (var434 < 1800) {
                        class129 var410 = var46 ? class155.field2700 : class102.field1625;
                        if (var434 == 1700) {
                            class124.field2047[var6++] = var410.field2187;
                            continue;
                        }
                        if (var434 == 1701) {
                            if (var410.field2187 == -1) {
                                class124.field2047[var6++] = 0;
                            } else {
                                class124.field2047[var6++] = var410.field2195;
                            }
                            continue;
                        }
                        if (var434 == 1702) {
                            class124.field2047[var6++] = var410.field2123;
                            continue;
                        }
                    } else if (var434 < 1900) {
                        class129 var76 = var46 ? class155.field2700 : class102.field1625;
                        if (var434 == 1800) {
                            class124.field2047[var6++] = class1.method4(client.method266(var76), -701);
                            continue;
                        }
                        if (var434 == 1801) {
                            var6--;
                            int var77 = class124.field2047[var6];
                            int var435 = var77 - 1;
                            if (var76.field2174 != null && var435 < var76.field2174.length && var76.field2174[var435] != null) {
                                class27.field324[var10++] = var76.field2174[var435];
                                continue;
                            }
                            class27.field324[var10++] = class244.field4232;
                            continue;
                        }
                        if (var434 == 1802) {
                            if (var76.field2148 == null) {
                                class27.field324[var10++] = class244.field4232;
                            } else {
                                class27.field324[var10++] = var76.field2148;
                            }
                            continue;
                        }
                    } else if (var434 < 2600) {
                        var6--;
                        class129 var78 = class257.method1713(class124.field2047[var6], 127);
                        if (var434 == 2500) {
                            class124.field2047[var6++] = var78.field2139;
                            continue;
                        }
                        if (var434 == 2501) {
                            class124.field2047[var6++] = var78.field2231;
                            continue;
                        }
                        if (var434 == 2502) {
                            class124.field2047[var6++] = var78.field2175;
                            continue;
                        }
                        if (var434 == 2503) {
                            class124.field2047[var6++] = var78.field2210;
                            continue;
                        }
                        if (var434 == 2504) {
                            class124.field2047[var6++] = var78.field2289 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 2505) {
                            class124.field2047[var6++] = var78.field2276;
                            continue;
                        }
                    } else if (var434 < 2700) {
                        var6--;
                        class129 var409 = class257.method1713(class124.field2047[var6], 126);
                        if (var434 == 2600) {
                            class124.field2047[var6++] = var409.field2203;
                            continue;
                        }
                        if (var434 == 2601) {
                            class124.field2047[var6++] = var409.field2224;
                            continue;
                        }
                        if (var434 == 2602) {
                            class27.field324[var10++] = var409.field2164;
                            continue;
                        }
                        if (var434 == 2603) {
                            class124.field2047[var6++] = var409.field2271;
                            continue;
                        }
                        if (var434 == 2604) {
                            class124.field2047[var6++] = var409.field2291;
                            continue;
                        }
                        if (var434 == 2605) {
                            class124.field2047[var6++] = var409.field2154;
                            continue;
                        }
                        if (var434 == 2606) {
                            class124.field2047[var6++] = var409.field2124;
                            continue;
                        }
                        if (var434 == 2607) {
                            class124.field2047[var6++] = var409.field2163;
                            continue;
                        }
                        if (var434 == 2608) {
                            class124.field2047[var6++] = var409.field2186;
                            continue;
                        }
                        if (var434 == 2609) {
                            class124.field2047[var6++] = var409.field2225;
                            continue;
                        }
                    } else if (var434 < 2800) {
                        if (var434 == 2700) {
                            var6--;
                            class129 var79 = class257.method1713(class124.field2047[var6], arg0 ^ 0xFFFFFF84);
                            class124.field2047[var6++] = var79.field2187;
                            continue;
                        }
                        if (var434 == 2701) {
                            var6--;
                            class129 var80 = class257.method1713(class124.field2047[var6], arg0 ^ 0xFFFFFF85);
                            if (var80.field2187 == -1) {
                                class124.field2047[var6++] = 0;
                            } else {
                                class124.field2047[var6++] = var80.field2195;
                            }
                            continue;
                        }
                        if (var434 == 2702) {
                            var6--;
                            int var81 = class124.field2047[var6];
                            class114 var82 = (class114) class176.field3079.method1527((long) var81, (byte) -96);
                            if (var82 == null) {
                                class124.field2047[var6++] = 0;
                            } else {
                                class124.field2047[var6++] = 1;
                            }
                            continue;
                        }
                        if (var434 == 2703) {
                            var6--;
                            class129 var83 = class257.method1713(class124.field2047[var6], 126);
                            if (var83.field2263 == null) {
                                class124.field2047[var6++] = 0;
                                continue;
                            }
                            int var84 = var83.field2263.length;
                            for (int var85 = 0; var85 < var83.field2263.length; var85++) {
                                if (var83.field2263[var85] == null) {
                                    var84 = var85;
                                    break;
                                }
                            }
                            class124.field2047[var6++] = var84;
                            continue;
                        }
                        if (var434 == 2704 || var434 == 2705) {
                            var6 -= 2;
                            int var86 = class124.field2047[var6];
                            int var87 = class124.field2047[var6 + 1];
                            class114 var88 = (class114) class176.field3079.method1527((long) var86, (byte) -95);
                            if (var88 != null && var88.field1853 == var87) {
                                class124.field2047[var6++] = 1;
                                continue;
                            }
                            class124.field2047[var6++] = 0;
                            continue;
                        }
                    } else if (var434 < 2900) {
                        var6--;
                        class129 var407 = class257.method1713(class124.field2047[var6], 126);
                        if (var434 == 2800) {
                            class124.field2047[var6++] = class1.method4(client.method266(var407), -701);
                            continue;
                        }
                        if (var434 == 2801) {
                            var6--;
                            int var408 = class124.field2047[var6];
                            int var436 = var408 - 1;
                            if (var407.field2174 != null && var407.field2174.length > var436 && var407.field2174[var436] != null) {
                                class27.field324[var10++] = var407.field2174[var436];
                                continue;
                            }
                            class27.field324[var10++] = class244.field4232;
                            continue;
                        }
                        if (var434 == 2802) {
                            if (var407.field2148 == null) {
                                class27.field324[var10++] = class244.field4232;
                            } else {
                                class27.field324[var10++] = var407.field2148;
                            }
                            continue;
                        }
                    } else if (var434 < 3200) {
                        if (var434 == 3100) {
                            var10--;
                            class168 var392 = class27.field324[var10];
                            class229.method1475(class244.field4232, var392, -1, 0);
                            continue;
                        }
                        if (var434 == 3101) {
                            var6 -= 2;
                            class134.method905(class7.field85, class124.field2047[var6 + 1], class124.field2047[var6], -17431);
                            continue;
                        }
                        if (var434 == 3103) {
                            class176.method1164(105);
                            continue;
                        }
                        if (var434 == 3104) {
                            class128.field2113++;
                            var10--;
                            class168 var393 = class27.field324[var10];
                            int var394 = 0;
                            if (var393.method1075(arg0 + 16)) {
                                var394 = var393.method1085((byte) -125);
                            }
                            class87.field1348.method672(186, arg0 + 244);
                            class87.field1348.method770(var394, (byte) -10);
                            continue;
                        }
                        if (var434 == 3105) {
                            class167.field2849++;
                            var10--;
                            class168 var395 = class27.field324[var10];
                            class87.field1348.method672(132, 238);
                            class87.field1348.method739(var395.method1084(32383), arg0 ^ 0x5A6F);
                            continue;
                        }
                        if (var434 == 3106) {
                            class114.field1864++;
                            var10--;
                            class168 var396 = class27.field324[var10];
                            class87.field1348.method672(33, arg0 ^ 0xFFFFFF14);
                            class87.field1348.method768(var396.method1109((byte) 28) + 1, arg0 ^ 0xFFFFE385);
                            class87.field1348.method721(var396, true);
                            continue;
                        }
                        if (var434 == 3107) {
                            var6--;
                            int var397 = class124.field2047[var6];
                            var10--;
                            class168 var398 = class27.field324[var10];
                            class192.method1246(var398, var397, (byte) -104);
                            continue;
                        }
                        if (var434 == 3108) {
                            var6 -= 3;
                            int var399 = class124.field2047[var6 + 1];
                            int var400 = class124.field2047[var6];
                            int var401 = class124.field2047[var6 + 2];
                            class129 var402 = class257.method1713(var401, 126);
                            class191.method1236(var400, -23005, var399, var402);
                            continue;
                        }
                        if (var434 == 3109) {
                            var6 -= 2;
                            int var403 = class124.field2047[var6 + 1];
                            int var404 = class124.field2047[var6];
                            class129 var405 = var46 ? class155.field2700 : class102.field1625;
                            class191.method1236(var404, -23005, var403, var405);
                            continue;
                        }
                        if (var434 == 3110) {
                            var6--;
                            int var406 = class124.field2047[var6];
                            class87.field1348.method672(146, arg0 + 244);
                            class6.field67++;
                            class87.field1348.method753(var406, arg0 ^ 0xE6CB452);
                            continue;
                        }
                    } else if (var434 < 3300) {
                        if (var434 == 3200) {
                            var6 -= 3;
                            class114.method788(class124.field2047[var6 + 1], class124.field2047[var6 + 2], class124.field2047[var6], 104);
                            continue;
                        }
                        if (var434 == 3201) {
                            var6--;
                            class127.method862(0, class124.field2047[var6]);
                            continue;
                        }
                        if (var434 == 3202) {
                            var6 -= 2;
                            class27.method180((byte) -83, class124.field2047[var6], class124.field2047[var6 + 1]);
                            continue;
                        }
                    } else if (var434 < 3400) {
                        if (var434 == 3300) {
                            class124.field2047[var6++] = class133.field2326;
                            continue;
                        }
                        if (var434 == 3301) {
                            var6 -= 2;
                            int var370 = class124.field2047[var6];
                            int var371 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = class223.method1460(true, var371, var370);
                            continue;
                        }
                        if (var434 == 3302) {
                            var6 -= 2;
                            int var372 = class124.field2047[var6 + 1];
                            int var373 = class124.field2047[var6];
                            class124.field2047[var6++] = class251.method1656(0, var373, var372);
                            continue;
                        }
                        if (var434 == 3303) {
                            var6 -= 2;
                            int var374 = class124.field2047[var6];
                            int var375 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = class1.method2(var375, false, var374);
                            continue;
                        }
                        if (var434 == 3304) {
                            var6--;
                            int var376 = class124.field2047[var6];
                            class124.field2047[var6++] = class243.method1597(var376, -25901).field1347;
                            continue;
                        }
                        if (var434 == 3305) {
                            var6--;
                            int var377 = class124.field2047[var6];
                            class124.field2047[var6++] = class173.field3011[var377];
                            continue;
                        }
                        if (var434 == 3306) {
                            var6--;
                            int var378 = class124.field2047[var6];
                            class124.field2047[var6++] = class177.field3119[var378];
                            continue;
                        }
                        if (var434 == 3307) {
                            var6--;
                            int var379 = class124.field2047[var6];
                            class124.field2047[var6++] = class179.field3154[var379];
                            continue;
                        }
                        if (var434 == 3308) {
                            int var380 = class196.field3401;
                            int var381 = (class7.field85.field190 >> 7) + class246.field4261;
                            int var382 = (class7.field85.field166 >> 7) + class125.field2060;
                            class124.field2047[var6++] = (var381 << 14) + (var380 << 28) + var382;
                            continue;
                        }
                        if (var434 == 3309) {
                            var6--;
                            int var383 = class124.field2047[var6];
                            class124.field2047[var6++] = class86.method571(16383, var383 >> 14);
                            continue;
                        }
                        if (var434 == 3310) {
                            var6--;
                            int var384 = class124.field2047[var6];
                            class124.field2047[var6++] = var384 >> 28;
                            continue;
                        }
                        if (var434 == 3311) {
                            var6--;
                            int var385 = class124.field2047[var6];
                            class124.field2047[var6++] = class86.method571(var385, 16383);
                            continue;
                        }
                        if (var434 == 3312) {
                            class124.field2047[var6++] = class59.field811 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3313) {
                            var6 -= 2;
                            int var386 = class124.field2047[var6 + 1];
                            int var387 = class124.field2047[var6] + 32768;
                            class124.field2047[var6++] = class223.method1460(true, var386, var387);
                            continue;
                        }
                        if (var434 == 3314) {
                            var6 -= 2;
                            int var388 = class124.field2047[var6] + 32768;
                            int var389 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = class251.method1656(0, var388, var389);
                            continue;
                        }
                        if (var434 == 3315) {
                            var6 -= 2;
                            int var390 = class124.field2047[var6] + 32768;
                            int var391 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = class1.method2(var391, false, var390);
                            continue;
                        }
                        if (var434 == 3316) {
                            if (class29.field356 >= 2) {
                                class124.field2047[var6++] = class29.field356;
                            } else {
                                class124.field2047[var6++] = 0;
                            }
                            continue;
                        }
                        if (var434 == 3317) {
                            class124.field2047[var6++] = class147.field2558;
                            continue;
                        }
                        if (var434 == 3318) {
                            class124.field2047[var6++] = class83.field1272;
                            continue;
                        }
                        if (var434 == 3321) {
                            class124.field2047[var6++] = class2.field21;
                            continue;
                        }
                        if (var434 == 3322) {
                            class124.field2047[var6++] = class165.field2809;
                            continue;
                        }
                        if (var434 == 3323) {
                            if (class135.field2367 >= 5 && class135.field2367 <= 9) {
                                class124.field2047[var6++] = 1;
                                continue;
                            }
                            class124.field2047[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3324) {
                            if (class135.field2367 >= 5 && class135.field2367 <= 9) {
                                class124.field2047[var6++] = class135.field2367;
                                continue;
                            }
                            class124.field2047[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3325) {
                            if (class101.field1610 > 0) {
                                class124.field2047[var6++] = 1;
                            } else {
                                class124.field2047[var6++] = 0;
                            }
                            continue;
                        }
                        if (var434 == 3326) {
                            class124.field2047[var6++] = class7.field85.field1993;
                            continue;
                        }
                        if (var434 == 3327) {
                            class124.field2047[var6++] = class7.field85.field2001.field2458 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3328) {
                            class124.field2047[var6++] = class17.field155;
                            continue;
                        }
                        if (var434 == 3329) {
                            class124.field2047[var6++] = class95.field1501;
                            continue;
                        }
                    } else if (var434 < 3500) {
                        if (var434 == 3400) {
                            var6 -= 2;
                            int var362 = class124.field2047[var6];
                            int var363 = class124.field2047[var6 + 1];
                            class194 var364 = class171.method1133(var362, (byte) -114);
                            class27.field324[var10++] = var364.method1254(var363, (byte) 114);
                            continue;
                        }
                        if (var434 == 3408) {
                            var6 -= 4;
                            int var365 = class124.field2047[var6];
                            int var366 = class124.field2047[var6 + 2];
                            int var367 = class124.field2047[var6 + 3];
                            int var368 = class124.field2047[var6 + 1];
                            class194 var369 = class171.method1133(var366, (byte) -61);
                            if (var369.field3384 == var365 && var369.field3380 == var368) {
                                if (var368 == 115) {
                                    class27.field324[var10++] = var369.method1254(var367, (byte) 114);
                                } else {
                                    class124.field2047[var6++] = var369.method1252(88, var367);
                                }
                                continue;
                            }
                            if (var368 == 115) {
                                class27.field324[var10++] = class25.field306;
                            } else {
                                class124.field2047[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var434 < 3700) {
                        if (var434 == 3600) {
                            if (class191.field3336 == 0) {
                                class124.field2047[var6++] = -2;
                            } else if (class191.field3336 == 1) {
                                class124.field2047[var6++] = -1;
                            } else {
                                class124.field2047[var6++] = class103.field1662;
                            }
                            continue;
                        }
                        if (var434 == 3601) {
                            var6--;
                            int var89 = class124.field2047[var6];
                            if (class191.field3336 == 2 && class103.field1662 > var89) {
                                class27.field324[var10++] = class32.field382[var89];
                                continue;
                            }
                            class27.field324[var10++] = class244.field4232;
                            continue;
                        }
                        if (var434 == 3602) {
                            var6--;
                            int var90 = class124.field2047[var6];
                            if (class191.field3336 == 2 && var90 < class103.field1662) {
                                class124.field2047[var6++] = class138.field2439[var90];
                                continue;
                            }
                            class124.field2047[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3603) {
                            var6--;
                            int var91 = class124.field2047[var6];
                            if (class191.field3336 == 2 && class103.field1662 > var91) {
                                class124.field2047[var6++] = class84.field1289[var91];
                                continue;
                            }
                            class124.field2047[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3604) {
                            var10--;
                            class168 var92 = class27.field324[var10];
                            var6--;
                            int var93 = class124.field2047[var6];
                            class29.method189(var93, var92, (byte) 67);
                            continue;
                        }
                        if (var434 == 3605) {
                            var10--;
                            class168 var94 = class27.field324[var10];
                            class232.method1498(var94.method1084(32383), (byte) -69);
                            continue;
                        }
                        if (var434 == 3606) {
                            var10--;
                            class168 var95 = class27.field324[var10];
                            class169.method1125((byte) 47, var95.method1084(32383));
                            continue;
                        }
                        if (var434 == 3607) {
                            var10--;
                            class168 var96 = class27.field324[var10];
                            class111.method719(var96.method1084(32383), 41);
                            continue;
                        }
                        if (var434 == 3608) {
                            var10--;
                            class168 var97 = class27.field324[var10];
                            class173.method1138(0, var97.method1084(32383));
                            continue;
                        }
                        if (var434 == 3609) {
                            var10--;
                            class168 var98 = class27.field324[var10];
                            if (var98.method1095(class202.field3474, true) || var98.method1095(class89.field1392, true)) {
                                var98 = var98.method1120(7, 29);
                            }
                            class124.field2047[var6++] = class252.method1661(-124, var98) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3610) {
                            var6--;
                            int var99 = class124.field2047[var6];
                            if (class191.field3336 == 2 && var99 < class103.field1662) {
                                class27.field324[var10++] = class30.field365[var99];
                                continue;
                            }
                            class27.field324[var10++] = class244.field4232;
                            continue;
                        }
                        if (var434 == 3611) {
                            if (class25.field304 == null) {
                                class27.field324[var10++] = class244.field4232;
                            } else {
                                class27.field324[var10++] = class25.field304.method1116(0);
                            }
                            continue;
                        }
                        if (var434 == 3612) {
                            if (class25.field304 == null) {
                                class124.field2047[var6++] = 0;
                            } else {
                                class124.field2047[var6++] = class83.field1269;
                            }
                            continue;
                        }
                        if (var434 == 3613) {
                            var6--;
                            int var100 = class124.field2047[var6];
                            if (class25.field304 != null && var100 < class83.field1269) {
                                class27.field324[var10++] = class154.field2690[var100].field740.method1116(0);
                                continue;
                            }
                            class27.field324[var10++] = class244.field4232;
                            continue;
                        }
                        if (var434 == 3614) {
                            var6--;
                            int var101 = class124.field2047[var6];
                            if (class25.field304 != null && var101 < class83.field1269) {
                                class124.field2047[var6++] = class154.field2690[var101].field743;
                                continue;
                            }
                            class124.field2047[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3615) {
                            var6--;
                            int var102 = class124.field2047[var6];
                            if (class25.field304 != null && var102 < class83.field1269) {
                                class124.field2047[var6++] = class154.field2690[var102].field739;
                                continue;
                            }
                            class124.field2047[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3616) {
                            class124.field2047[var6++] = class204.field3557;
                            continue;
                        }
                        if (var434 == 3617) {
                            var10--;
                            class168 var103 = class27.field324[var10];
                            class74.method502(var103, false);
                            continue;
                        }
                        if (var434 == 3618) {
                            class124.field2047[var6++] = class106.field1695;
                            continue;
                        }
                        if (var434 == 3619) {
                            var10--;
                            class168 var104 = class27.field324[var10];
                            class209.method1358(true, var104.method1084(32383));
                            continue;
                        }
                        if (var434 == 3620) {
                            class71.method487((byte) 85);
                            continue;
                        }
                        if (var434 == 3621) {
                            if (class191.field3336 == 0) {
                                class124.field2047[var6++] = -1;
                            } else {
                                class124.field2047[var6++] = class173.field3024;
                            }
                            continue;
                        }
                        if (var434 == 3622) {
                            var6--;
                            int var105 = class124.field2047[var6];
                            if (class191.field3336 != 0 && class173.field3024 > var105) {
                                class27.field324[var10++] = class80.method532(class150.field2626[var105], (byte) -100).method1116(0);
                                continue;
                            }
                            class27.field324[var10++] = class244.field4232;
                            continue;
                        }
                        if (var434 == 3623) {
                            var10--;
                            class168 var106 = class27.field324[var10];
                            if (var106.method1095(class202.field3474, true) || var106.method1095(class89.field1392, true)) {
                                var106 = var106.method1120(7, 87);
                            }
                            class124.field2047[var6++] = class153.method1008(112, var106) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3624) {
                            var6--;
                            int var107 = class124.field2047[var6];
                            if (class154.field2690 != null && var107 < class83.field1269 && class154.field2690[var107].field740.method1106(arg0 - 85, class7.field85.field2000)) {
                                class124.field2047[var6++] = 1;
                                continue;
                            }
                            class124.field2047[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3625) {
                            if (class104.field1672 == null) {
                                class27.field324[var10++] = class244.field4232;
                            } else {
                                class27.field324[var10++] = class104.field1672.method1116(arg0 + 6);
                            }
                            continue;
                        }
                        if (var434 == 3626) {
                            var6--;
                            int var108 = class124.field2047[var6];
                            if (class25.field304 != null && var108 < class83.field1269) {
                                class27.field324[var10++] = class154.field2690[var108].field745;
                                continue;
                            }
                            class27.field324[var10++] = class244.field4232;
                            continue;
                        }
                        if (var434 == 3627) {
                            var6--;
                            int var109 = class124.field2047[var6];
                            if (class191.field3336 == 2 && var109 >= 0 && var109 < class103.field1662) {
                                class124.field2047[var6++] = class116.field1893[var109] ? 1 : 0;
                                continue;
                            }
                            class124.field2047[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3628) {
                            var10--;
                            class168 var110 = class27.field324[var10];
                            if (var110.method1095(class202.field3474, true) || var110.method1095(class89.field1392, true)) {
                                var110 = var110.method1120(7, 68);
                            }
                            class124.field2047[var6++] = class26.method176(var110, true);
                            continue;
                        }
                    } else if (var434 < 4000) {
                        if (var434 == 3903) {
                            var6--;
                            int var348 = class124.field2047[var6];
                            class124.field2047[var6++] = class162.field2786[var348].method815(false);
                            continue;
                        }
                        if (var434 == 3904) {
                            var6--;
                            int var349 = class124.field2047[var6];
                            class124.field2047[var6++] = class162.field2786[var349].field1949;
                            continue;
                        }
                        if (var434 == 3905) {
                            var6--;
                            int var350 = class124.field2047[var6];
                            class124.field2047[var6++] = class162.field2786[var350].field1952;
                            continue;
                        }
                        if (var434 == 3906) {
                            var6--;
                            int var351 = class124.field2047[var6];
                            class124.field2047[var6++] = class162.field2786[var351].field1939;
                            continue;
                        }
                        if (var434 == 3907) {
                            var6--;
                            int var352 = class124.field2047[var6];
                            class124.field2047[var6++] = class162.field2786[var352].field1950;
                            continue;
                        }
                        if (var434 == 3908) {
                            var6--;
                            int var353 = class124.field2047[var6];
                            class124.field2047[var6++] = class162.field2786[var353].field1946;
                            continue;
                        }
                        if (var434 == 3910) {
                            var6--;
                            int var354 = class124.field2047[var6];
                            int var355 = class162.field2786[var354].method814(arg0 ^ 0xD);
                            class124.field2047[var6++] = var355 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3911) {
                            var6--;
                            int var356 = class124.field2047[var6];
                            int var357 = class162.field2786[var356].method814(-9);
                            class124.field2047[var6++] = var357 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3912) {
                            var6--;
                            int var358 = class124.field2047[var6];
                            int var359 = class162.field2786[var358].method814(-9);
                            class124.field2047[var6++] = var359 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3913) {
                            var6--;
                            int var360 = class124.field2047[var6];
                            int var361 = class162.field2786[var360].method814(-9);
                            class124.field2047[var6++] = var361 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var434 < 4100) {
                        if (var434 == 4000) {
                            var6 -= 2;
                            int var303 = class124.field2047[var6];
                            int var304 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = var303 + var304;
                            continue;
                        }
                        if (var434 == 4001) {
                            var6 -= 2;
                            int var305 = class124.field2047[var6];
                            int var306 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = var305 - var306;
                            continue;
                        }
                        if (var434 == 4002) {
                            var6 -= 2;
                            int var307 = class124.field2047[var6];
                            int var308 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = var307 * var308;
                            continue;
                        }
                        if (var434 == 4003) {
                            var6 -= 2;
                            int var309 = class124.field2047[var6];
                            int var310 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = var309 / var310;
                            continue;
                        }
                        if (var434 == 4004) {
                            var6--;
                            int var311 = class124.field2047[var6];
                            class124.field2047[var6++] = (int) (Math.random() * (double) var311);
                            continue;
                        }
                        if (var434 == 4005) {
                            var6--;
                            int var312 = class124.field2047[var6];
                            class124.field2047[var6++] = (int) (Math.random() * (double) (var312 + 1));
                            continue;
                        }
                        if (var434 == 4006) {
                            var6 -= 5;
                            int var313 = class124.field2047[var6];
                            int var314 = class124.field2047[var6 + 1];
                            int var315 = class124.field2047[var6 + 3];
                            int var316 = class124.field2047[var6 + 2];
                            int var317 = class124.field2047[var6 + 4];
                            class124.field2047[var6++] = (var314 - var313) * (-var316 + var317) / (var315 - var316) + var313;
                            continue;
                        }
                        if (var434 == 4007) {
                            var6 -= 2;
                            long var318 = (long) class124.field2047[var6];
                            long var320 = (long) class124.field2047[var6 + 1];
                            class124.field2047[var6++] = (int) (var318 * var320 / 100L + var318);
                            continue;
                        }
                        if (var434 == 4008) {
                            var6 -= 2;
                            int var322 = class124.field2047[var6];
                            int var323 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = class102.method675(var322, 0x1 << var323);
                            continue;
                        }
                        if (var434 == 4009) {
                            var6 -= 2;
                            int var324 = class124.field2047[var6 + 1];
                            int var325 = class124.field2047[var6];
                            class124.field2047[var6++] = class86.method571(-(0x1 << var324) - 1, var325);
                            continue;
                        }
                        if (var434 == 4010) {
                            var6 -= 2;
                            int var326 = class124.field2047[var6];
                            int var327 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = class86.method571(var326, 0x1 << var327) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var434 == 4011) {
                            var6 -= 2;
                            int var328 = class124.field2047[var6 + 1];
                            int var329 = class124.field2047[var6];
                            class124.field2047[var6++] = var329 % var328;
                            continue;
                        }
                        if (var434 == 4012) {
                            var6 -= 2;
                            int var330 = class124.field2047[var6 + 1];
                            int var331 = class124.field2047[var6];
                            if (var331 == 0) {
                                class124.field2047[var6++] = 0;
                            } else {
                                class124.field2047[var6++] = (int) Math.pow((double) var331, (double) var330);
                            }
                            continue;
                        }
                        if (var434 == 4013) {
                            var6 -= 2;
                            int var332 = class124.field2047[var6];
                            int var333 = class124.field2047[var6 + 1];
                            if (var332 == 0) {
                                class124.field2047[var6++] = 0;
                            } else if (var333 == 0) {
                                class124.field2047[var6++] = Integer.MAX_VALUE;
                            } else {
                                class124.field2047[var6++] = (int) Math.pow((double) var332, 1.0D / (double) var333);
                            }
                            continue;
                        }
                        if (var434 == 4014) {
                            var6 -= 2;
                            int var334 = class124.field2047[var6 + 1];
                            int var335 = class124.field2047[var6];
                            class124.field2047[var6++] = class86.method571(var334, var335);
                            continue;
                        }
                        if (var434 == 4015) {
                            var6 -= 2;
                            int var336 = class124.field2047[var6];
                            int var337 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = class102.method675(var336, var337);
                            continue;
                        }
                        if (var434 == 4016) {
                            var6 -= 2;
                            int var338 = class124.field2047[var6];
                            int var339 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = var338 < var339 ? var338 : var339;
                            continue;
                        }
                        if (var434 == 4017) {
                            var6 -= 2;
                            int var340 = class124.field2047[var6 + 1];
                            int var341 = class124.field2047[var6];
                            class124.field2047[var6++] = var341 > var340 ? var341 : var340;
                            continue;
                        }
                        if (var434 == 4018) {
                            var6 -= 3;
                            long var342 = (long) class124.field2047[var6 + 1];
                            long var344 = (long) class124.field2047[var6 + 2];
                            long var346 = (long) class124.field2047[var6];
                            class124.field2047[var6++] = (int) (var344 * var346 / var342);
                            continue;
                        }
                    } else if (var434 < 4200) {
                        if (var434 == 4100) {
                            var10--;
                            class168 var111 = class27.field324[var10];
                            var6--;
                            int var112 = class124.field2047[var6];
                            class27.field324[var10++] = class50.method347(2, new class168[] { var111, class128.method867((byte) 94, var112) });
                            continue;
                        }
                        if (var434 == 4101) {
                            var10 -= 2;
                            class168 var113 = class27.field324[var10];
                            class168 var114 = class27.field324[var10 + 1];
                            class27.field324[var10++] = class50.method347(arg0 + 8, new class168[] { var113, var114 });
                            continue;
                        }
                        if (var434 == 4102) {
                            var10--;
                            class168 var115 = class27.field324[var10];
                            var6--;
                            int var116 = class124.field2047[var6];
                            class27.field324[var10++] = class50.method347(arg0 + 8, new class168[] { var115, class87.method574(arg0 + 26213, true, var116) });
                            continue;
                        }
                        if (var434 == 4103) {
                            var10--;
                            class168 var117 = class27.field324[var10];
                            class27.field324[var10++] = var117.method1073(false);
                            continue;
                        }
                        if (var434 == 4104) {
                            var6--;
                            int var118 = class124.field2047[var6];
                            long var119 = ((long) var118 + 11745L) * 86400000L;
                            class71.field1092.setTime(new Date(var119));
                            int var121 = class71.field1092.get(5);
                            int var122 = class71.field1092.get(2);
                            int var123 = class71.field1092.get(1);
                            class27.field324[var10++] = class50.method347(2, new class168[] { class128.method867((byte) 79, var121), class21.field250, class81.field1219[var122], class21.field250, class128.method867((byte) 126, var123) });
                            continue;
                        }
                        if (var434 == 4105) {
                            var10 -= 2;
                            class168 var124 = class27.field324[var10];
                            class168 var125 = class27.field324[var10 + 1];
                            if (class7.field85.field2001 != null && class7.field85.field2001.field2458) {
                                class27.field324[var10++] = var125;
                                continue;
                            }
                            class27.field324[var10++] = var124;
                            continue;
                        }
                        if (var434 == 4106) {
                            var6--;
                            int var126 = class124.field2047[var6];
                            class27.field324[var10++] = class128.method867((byte) 85, var126);
                            continue;
                        }
                        if (var434 == 4107) {
                            var10 -= 2;
                            class124.field2047[var6++] = class27.field324[var10].method1072(class27.field324[var10 + 1], (byte) 126);
                            continue;
                        }
                        if (var434 == 4108) {
                            var6 -= 2;
                            int var127 = class124.field2047[var6];
                            int var128 = class124.field2047[var6 + 1];
                            var10--;
                            class168 var129 = class27.field324[var10];
                            byte[] var130 = class96.field1517.method1712(0, var128, -1);
                            class11 var131 = new class11(var130);
                            var131.method919(class222.field3809, null);
                            class124.field2047[var6++] = var131.method932(var129, var127);
                            continue;
                        }
                        if (var434 == 4109) {
                            var10--;
                            class168 var132 = class27.field324[var10];
                            var6 -= 2;
                            int var133 = class124.field2047[var6];
                            int var134 = class124.field2047[var6 + 1];
                            byte[] var135 = class96.field1517.method1712(0, var134, -1);
                            class11 var136 = new class11(var135);
                            var136.method919(class222.field3809, null);
                            class124.field2047[var6++] = var136.method926(var132, var133);
                            continue;
                        }
                        if (var434 == 4110) {
                            var10 -= 2;
                            class168 var137 = class27.field324[var10 + 1];
                            class168 var138 = class27.field324[var10];
                            var6--;
                            if (class124.field2047[var6] == 1) {
                                class27.field324[var10++] = var138;
                            } else {
                                class27.field324[var10++] = var137;
                            }
                            continue;
                        }
                        if (var434 == 4111) {
                            var10--;
                            class168 var139 = class27.field324[var10];
                            class27.field324[var10++] = class136.method933(var139);
                            continue;
                        }
                        if (var434 == 4112) {
                            var10--;
                            class168 var140 = class27.field324[var10];
                            var6--;
                            int var141 = class124.field2047[var6];
                            if (var141 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class27.field324[var10++] = var140.method1099(1, var141);
                            continue;
                        }
                        if (var434 == 4113) {
                            var6--;
                            int var142 = class124.field2047[var6];
                            class124.field2047[var6++] = class149.method994(var142, (byte) -111) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4114) {
                            var6--;
                            int var143 = class124.field2047[var6];
                            class124.field2047[var6++] = class142.method970((byte) -122, var143) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4115) {
                            var6--;
                            int var144 = class124.field2047[var6];
                            class124.field2047[var6++] = class146.method982(61, var144) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4116) {
                            var6--;
                            int var145 = class124.field2047[var6];
                            class124.field2047[var6++] = class180.method1184(41, var145) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4117) {
                            var10--;
                            class168 var146 = class27.field324[var10];
                            if (var146 == null) {
                                class124.field2047[var6++] = 0;
                            } else {
                                class124.field2047[var6++] = var146.method1109((byte) 29);
                            }
                            continue;
                        }
                        if (var434 == 4118) {
                            var6 -= 2;
                            int var147 = class124.field2047[var6 + 1];
                            var10--;
                            class168 var148 = class27.field324[var10];
                            int var149 = class124.field2047[var6];
                            class27.field324[var10++] = var148.method1078(var149, (byte) -75, var147);
                            continue;
                        }
                        if (var434 == 4119) {
                            var10--;
                            class168 var150 = class27.field324[var10];
                            boolean var151 = false;
                            class168 var152 = class168.method1105(17283, var150.method1109((byte) 112));
                            for (int var153 = 0; var153 < var150.method1109((byte) 122); var153++) {
                                int var154 = var150.method1110(255, var153);
                                if (var154 == 60) {
                                    var151 = true;
                                } else if (var154 == 62) {
                                    var151 = false;
                                } else if (!var151) {
                                    var152.method1076(729, var154);
                                }
                            }
                            var152.method1070(arg0 - 14662);
                            class27.field324[var10++] = var152;
                            continue;
                        }
                        if (var434 == 4120) {
                            var6 -= 2;
                            var10--;
                            class168 var155 = class27.field324[var10];
                            int var156 = class124.field2047[var6];
                            int var157 = class124.field2047[var6 + 1];
                            class124.field2047[var6++] = var155.method1089(var156, (byte) 103, var157);
                            continue;
                        }
                        if (var434 == 4121) {
                            var10 -= 2;
                            class168 var158 = class27.field324[var10];
                            class168 var159 = class27.field324[var10 + 1];
                            var6--;
                            int var160 = class124.field2047[var6];
                            class124.field2047[var6++] = var158.method1074(var159, (byte) 61, var160);
                            continue;
                        }
                        if (var434 == 4122) {
                            var6--;
                            int var161 = class124.field2047[var6];
                            class124.field2047[var6++] = class165.method1058(var161, true);
                            continue;
                        }
                        if (var434 == 4123) {
                            var6--;
                            int var162 = class124.field2047[var6];
                            class124.field2047[var6++] = class243.method1599(var162, -98);
                            continue;
                        }
                    } else if (var434 < 4300) {
                        if (var434 == 4200) {
                            var6--;
                            int var163 = class124.field2047[var6];
                            class27.field324[var10++] = class151.method1005(520, var163).field4167;
                            continue;
                        }
                        if (var434 == 4201) {
                            var6 -= 2;
                            int var164 = class124.field2047[var6 + 1];
                            int var165 = class124.field2047[var6];
                            class242 var166 = class151.method1005(520, var165);
                            if (var164 >= 1 && var164 <= 5 && var166.field4196[var164 - 1] != null) {
                                class27.field324[var10++] = var166.field4196[var164 - 1];
                                continue;
                            }
                            class27.field324[var10++] = class244.field4232;
                            continue;
                        }
                        if (var434 == 4202) {
                            var6 -= 2;
                            int var167 = class124.field2047[var6 + 1];
                            int var168 = class124.field2047[var6];
                            class242 var169 = class151.method1005(520, var168);
                            if (var167 >= 1 && var167 <= 5 && var169.field4158[var167 - 1] != null) {
                                class27.field324[var10++] = var169.field4158[var167 - 1];
                                continue;
                            }
                            class27.field324[var10++] = class244.field4232;
                            continue;
                        }
                        if (var434 == 4203) {
                            var6--;
                            int var170 = class124.field2047[var6];
                            class124.field2047[var6++] = class151.method1005(520, var170).field4137;
                            continue;
                        }
                        if (var434 == 4204) {
                            var6--;
                            int var171 = class124.field2047[var6];
                            class124.field2047[var6++] = class151.method1005(520, var171).field4178 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4205) {
                            var6--;
                            int var172 = class124.field2047[var6];
                            class242 var173 = class151.method1005(520, var172);
                            if (var173.field4165 == -1 && var173.field4140 >= 0) {
                                class124.field2047[var6++] = var173.field4140;
                                continue;
                            }
                            class124.field2047[var6++] = var172;
                            continue;
                        }
                        if (var434 == 4206) {
                            var6--;
                            int var174 = class124.field2047[var6];
                            class242 var175 = class151.method1005(arg0 ^ 0xFFFFFDF2, var174);
                            if (var175.field4165 >= 0 && var175.field4140 >= 0) {
                                class124.field2047[var6++] = var175.field4140;
                                continue;
                            }
                            class124.field2047[var6++] = var174;
                            continue;
                        }
                        if (var434 == 4207) {
                            var6--;
                            int var176 = class124.field2047[var6];
                            class124.field2047[var6++] = class151.method1005(520, var176).field4204 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4208) {
                            var6 -= 2;
                            int var177 = class124.field2047[var6];
                            int var178 = class124.field2047[var6 + 1];
                            class29 var179 = class89.method588(var178, -9894);
                            if (var179.method192((byte) 102)) {
                                class27.field324[var10++] = class151.method1005(520, var177).method1580(var179.field355, (byte) -121, var178);
                            } else {
                                class124.field2047[var6++] = class151.method1005(520, var177).method1576(65, var178, var179.field349);
                            }
                            continue;
                        }
                        if (var434 == 4210) {
                            var10--;
                            class168 var180 = class27.field324[var10];
                            var6--;
                            int var181 = class124.field2047[var6];
                            class173.method1147(var180, var181 == 1, false);
                            class124.field2047[var6++] = class227.field3873;
                            continue;
                        }
                        if (var434 == 4211) {
                            if (class244.field4243 != null && class227.field3873 > class150.field2612) {
                                class124.field2047[var6++] = class86.method571(class244.field4243[class150.field2612++], 65535);
                                continue;
                            }
                            class124.field2047[var6++] = -1;
                            continue;
                        }
                        if (var434 == 4212) {
                            class150.field2612 = 0;
                            continue;
                        }
                    } else if (var434 < 4400) {
                        if (var434 == 4300) {
                            var6 -= 2;
                            int var182 = class124.field2047[var6];
                            int var183 = class124.field2047[var6 + 1];
                            class29 var184 = class89.method588(var183, arg0 ^ 0x26A0);
                            if (var184.method192((byte) 127)) {
                                class27.field324[var10++] = class74.method504(var182, (byte) -59).method1196(var183, var184.field355, (byte) -120);
                            } else {
                                class124.field2047[var6++] = class74.method504(var182, (byte) -59).method1190(30504, var183, var184.field349);
                            }
                            continue;
                        }
                    } else if (var434 >= 4500) {
                        if (var434 < 4600) {
                            if (var434 == 4500) {
                                var6 -= 2;
                                int var185 = class124.field2047[var6];
                                int var186 = class124.field2047[var6 + 1];
                                class29 var187 = class89.method588(var186, -9894);
                                if (var187.method192((byte) 81)) {
                                    class27.field324[var10++] = class101.method667(var185, true).method903(var187.field355, 96, var186);
                                } else {
                                    class124.field2047[var6++] = class101.method667(var185, true).method907(var187.field349, 109, var186);
                                }
                                continue;
                            }
                        } else if (var434 < 5100) {
                            if (var434 == 5000) {
                                class124.field2047[var6++] = class21.field251;
                                continue;
                            }
                            if (var434 == 5001) {
                                class227.field3867++;
                                var6 -= 3;
                                class21.field251 = class124.field2047[var6];
                                class108.field1734 = class124.field2047[var6 + 1];
                                class241.field4120 = class124.field2047[var6 + 2];
                                class87.field1348.method672(120, 238);
                                class87.field1348.method768(class21.field251, arg0 ^ 0xFFFFE385);
                                class87.field1348.method768(class108.field1734, 7295);
                                class87.field1348.method768(class241.field4120, 7295);
                                continue;
                            }
                            if (var434 == 5002) {
                                class121.field1977++;
                                var6 -= 2;
                                int var237 = class124.field2047[var6];
                                var10--;
                                class168 var238 = class27.field324[var10];
                                int var239 = class124.field2047[var6 + 1];
                                class87.field1348.method672(9, arg0 + 244);
                                class87.field1348.method739(var238.method1084(32383), -23147);
                                class87.field1348.method768(var237 - 1, 7295);
                                class87.field1348.method768(var239, arg0 ^ 0xFFFFE385);
                                continue;
                            }
                            if (var434 == 5003) {
                                var6--;
                                int var240 = class124.field2047[var6];
                                class168 var241 = null;
                                if (var240 < 100) {
                                    var241 = class202.field3484[var240];
                                }
                                if (var241 == null) {
                                    var241 = class244.field4232;
                                }
                                class27.field324[var10++] = var241;
                                continue;
                            }
                            if (var434 == 5004) {
                                var6--;
                                int var242 = class124.field2047[var6];
                                int var243 = -1;
                                if (var242 < 100 && class202.field3484[var242] != null) {
                                    var243 = class54.field742[var242];
                                }
                                class124.field2047[var6++] = var243;
                                continue;
                            }
                            if (var434 == 5005) {
                                class124.field2047[var6++] = class108.field1734;
                                continue;
                            }
                            if (var434 == 5008) {
                                var10--;
                                class168 var244 = class27.field324[var10];
                                if (var244.method1095(class132.field2318, true)) {
                                    class2.method7(83, var244);
                                    continue;
                                }
                                if (class29.field356 == 0 && (class17.field155 == 1 || class95.field1501 == 1)) {
                                    continue;
                                }
                                class83.field1253++;
                                byte var245 = 0;
                                class168 var246 = var244.method1073(false);
                                byte var247 = 0;
                                if (var246.method1095(class56.field778, true)) {
                                    var244 = var244.method1120(class56.field778.method1109((byte) 98), 79);
                                    var247 = 0;
                                } else if (var246.method1095(class99.field1565, true)) {
                                    var244 = var244.method1120(class99.field1565.method1109((byte) 126), 114);
                                    var247 = 1;
                                } else if (var246.method1095(class116.field1894, true)) {
                                    var244 = var244.method1120(class116.field1894.method1109((byte) 40), 101);
                                    var247 = 2;
                                } else if (var246.method1095(class77.field1166, true)) {
                                    var244 = var244.method1120(class77.field1166.method1109((byte) 120), 61);
                                    var247 = 3;
                                } else if (var246.method1095(class227.field3863, true)) {
                                    var247 = 4;
                                    var244 = var244.method1120(class227.field3863.method1109((byte) 39), 87);
                                } else if (var246.method1095(class89.field1378, true)) {
                                    var244 = var244.method1120(class89.field1378.method1109((byte) 97), 40);
                                    var247 = 5;
                                } else if (var246.method1095(class93.field1472, true)) {
                                    var244 = var244.method1120(class93.field1472.method1109((byte) 28), 126);
                                    var247 = 6;
                                } else if (var246.method1095(class114.field1856, true)) {
                                    var247 = 7;
                                    var244 = var244.method1120(class114.field1856.method1109((byte) 89), arg0 ^ 0xFFFFFFC5);
                                } else if (var246.method1095(class13.field116, true)) {
                                    var247 = 8;
                                    var244 = var244.method1120(class13.field116.method1109((byte) 38), 95);
                                } else if (var246.method1095(class94.field1486, true)) {
                                    var244 = var244.method1120(class94.field1486.method1109((byte) 88), 21);
                                    var247 = 9;
                                } else if (var246.method1095(class27.field330, true)) {
                                    var247 = 10;
                                    var244 = var244.method1120(class27.field330.method1109((byte) 60), 114);
                                } else if (var246.method1095(class14.field128, true)) {
                                    var244 = var244.method1120(class14.field128.method1109((byte) 58), 28);
                                    var247 = 11;
                                } else if (class199.field3438 != 0) {
                                    if (var246.method1095(class56.field772, true)) {
                                        var247 = 0;
                                        var244 = var244.method1120(class56.field772.method1109((byte) 69), arg0 + 117);
                                    } else if (var246.method1095(class99.field1558, true)) {
                                        var244 = var244.method1120(class99.field1558.method1109((byte) 92), arg0 + 29);
                                        var247 = 1;
                                    } else if (var246.method1095(class116.field1890, true)) {
                                        var247 = 2;
                                        var244 = var244.method1120(class116.field1890.method1109((byte) 33), 117);
                                    } else if (var246.method1095(class77.field1162, true)) {
                                        var244 = var244.method1120(class77.field1162.method1109((byte) 118), 54);
                                        var247 = 3;
                                    } else if (var246.method1095(class227.field3869, true)) {
                                        var247 = 4;
                                        var244 = var244.method1120(class227.field3869.method1109((byte) 84), arg0 + 95);
                                    } else if (var246.method1095(class89.field1390, true)) {
                                        var244 = var244.method1120(class89.field1390.method1109((byte) 87), 39);
                                        var247 = 5;
                                    } else if (var246.method1095(class93.field1469, true)) {
                                        var244 = var244.method1120(class93.field1469.method1109((byte) 45), 120);
                                        var247 = 6;
                                    } else if (var246.method1095(class114.field1865, true)) {
                                        var247 = 7;
                                        var244 = var244.method1120(class114.field1865.method1109((byte) 67), 91);
                                    } else if (var246.method1095(class13.field127, true)) {
                                        var244 = var244.method1120(class13.field127.method1109((byte) 121), 103);
                                        var247 = 8;
                                    } else if (var246.method1095(class94.field1483, true)) {
                                        var247 = 9;
                                        var244 = var244.method1120(class94.field1483.method1109((byte) 92), arg0 + 56);
                                    } else if (var246.method1095(class27.field327, true)) {
                                        var244 = var244.method1120(class27.field327.method1109((byte) 56), 122);
                                        var247 = 10;
                                    } else if (var246.method1095(class14.field132, true)) {
                                        var244 = var244.method1120(class14.field132.method1109((byte) 98), 75);
                                        var247 = 11;
                                    }
                                }
                                class168 var248 = var244.method1073(false);
                                if (var248.method1095(class229.field3901, true)) {
                                    var244 = var244.method1120(class229.field3901.method1109((byte) 58), 76);
                                    var245 = 1;
                                } else if (var248.method1095(class36.field439, true)) {
                                    var244 = var244.method1120(class36.field439.method1109((byte) 67), 48);
                                    var245 = 2;
                                } else if (var248.method1095(class162.field2785, true)) {
                                    var245 = 3;
                                    var244 = var244.method1120(class162.field2785.method1109((byte) 86), 86);
                                } else if (var248.method1095(class32.field402, true)) {
                                    var244 = var244.method1120(class32.field402.method1109((byte) 127), 72);
                                    var245 = 4;
                                } else if (var248.method1095(class206.field3579, true)) {
                                    var244 = var244.method1120(class206.field3579.method1109((byte) 105), 68);
                                    var245 = 5;
                                } else if (class199.field3438 != 0) {
                                    if (var248.method1095(class229.field3897, true)) {
                                        var244 = var244.method1120(class229.field3897.method1109((byte) 119), 68);
                                        var245 = 1;
                                    } else if (var248.method1095(class36.field456, true)) {
                                        var245 = 2;
                                        var244 = var244.method1120(class36.field456.method1109((byte) 84), arg0 ^ 0xFFFFFFA8);
                                    } else if (var248.method1095(class162.field2783, true)) {
                                        var245 = 3;
                                        var244 = var244.method1120(class162.field2783.method1109((byte) 39), arg0 + 28);
                                    } else if (var248.method1095(class32.field403, true)) {
                                        var244 = var244.method1120(class32.field403.method1109((byte) 49), 24);
                                        var245 = 4;
                                    } else if (var248.method1095(class206.field3580, true)) {
                                        var244 = var244.method1120(class206.field3580.method1109((byte) 69), 54);
                                        var245 = 5;
                                    }
                                }
                                class87.field1348.method672(76, 238);
                                class87.field1348.method768(0, arg0 + 7301);
                                int var249 = class87.field1348.field1821;
                                class87.field1348.method768(var247, 7295);
                                class87.field1348.method768(var245, 7295);
                                class125.method848((byte) 121, class87.field1348, var244);
                                class87.field1348.method729(class87.field1348.field1821 - var249, -120);
                                continue;
                            }
                            if (var434 == 5009) {
                                var10 -= 2;
                                class168 var250 = class27.field324[var10];
                                class168 var251 = class27.field324[var10 + 1];
                                if (class29.field356 != 0 || class17.field155 != 1 && class95.field1501 != 1) {
                                    class240.field4103++;
                                    class87.field1348.method672(168, 238);
                                    class87.field1348.method768(0, 7295);
                                    int var252 = class87.field1348.field1821;
                                    class87.field1348.method739(var250.method1084(32383), -23147);
                                    class125.method848((byte) 91, class87.field1348, var251);
                                    class87.field1348.method729(class87.field1348.field1821 - var252, -104);
                                }
                                continue;
                            }
                            if (var434 == 5010) {
                                var6--;
                                int var253 = class124.field2047[var6];
                                class168 var254 = null;
                                if (var253 < 100) {
                                    var254 = class98.field1538[var253];
                                }
                                if (var254 == null) {
                                    var254 = class244.field4232;
                                }
                                class27.field324[var10++] = var254;
                                continue;
                            }
                            if (var434 == 5011) {
                                var6--;
                                int var255 = class124.field2047[var6];
                                class168 var256 = null;
                                if (var255 < 100) {
                                    var256 = class162.field2784[var255];
                                }
                                if (var256 == null) {
                                    var256 = class244.field4232;
                                }
                                class27.field324[var10++] = var256;
                                continue;
                            }
                            if (var434 == 5012) {
                                var6--;
                                int var257 = class124.field2047[var6];
                                int var258 = -1;
                                if (var257 < 100) {
                                    var258 = class123.field2030[var257];
                                }
                                class124.field2047[var6++] = var258;
                                continue;
                            }
                            if (var434 == 5015) {
                                class168 var259;
                                if (class7.field85 == null || class7.field85.field2000 == null) {
                                    var259 = class222.field3810;
                                } else {
                                    var259 = class7.field85.field2000;
                                }
                                class27.field324[var10++] = var259;
                                continue;
                            }
                            if (var434 == 5016) {
                                class124.field2047[var6++] = class241.field4120;
                                continue;
                            }
                            if (var434 == 5017) {
                                class124.field2047[var6++] = class139.field2463;
                                continue;
                            }
                            if (var434 == 5050) {
                                var6--;
                                int var260 = class124.field2047[var6];
                                class27.field324[var10++] = class120.method817(arg0 + 7, var260).field4356;
                                continue;
                            }
                            if (var434 == 5051) {
                                var6--;
                                int var261 = class124.field2047[var6];
                                class252 var262 = class120.method817(1, var261);
                                if (var262.field4365 == null) {
                                    class124.field2047[var6++] = 0;
                                } else {
                                    class124.field2047[var6++] = var262.field4365.length;
                                }
                                continue;
                            }
                            if (var434 == 5052) {
                                var6 -= 2;
                                int var263 = class124.field2047[var6];
                                int var264 = class124.field2047[var6 + 1];
                                class252 var265 = class120.method817(1, var263);
                                int var266 = var265.field4365[var264];
                                class124.field2047[var6++] = var266;
                                continue;
                            }
                            if (var434 == 5053) {
                                var6--;
                                int var267 = class124.field2047[var6];
                                class252 var268 = class120.method817(1, var267);
                                if (var268.field4349 == null) {
                                    class124.field2047[var6++] = 0;
                                } else {
                                    class124.field2047[var6++] = var268.field4349.length;
                                }
                                continue;
                            }
                            if (var434 == 5054) {
                                var6 -= 2;
                                int var269 = class124.field2047[var6];
                                int var270 = class124.field2047[var6 + 1];
                                class124.field2047[var6++] = class120.method817(1, var269).field4349[var270];
                                continue;
                            }
                            if (var434 == 5055) {
                                var6--;
                                int var271 = class124.field2047[var6];
                                class27.field324[var10++] = class120.method821(var271, arg0 + 131).method1483(768);
                                continue;
                            }
                            if (var434 == 5056) {
                                var6--;
                                int var272 = class124.field2047[var6];
                                class230 var273 = class120.method821(var272, -94);
                                if (var273.field3925 == null) {
                                    class124.field2047[var6++] = 0;
                                } else {
                                    class124.field2047[var6++] = var273.field3925.length;
                                }
                                continue;
                            }
                            if (var434 == 5057) {
                                var6 -= 2;
                                int var274 = class124.field2047[var6 + 1];
                                int var275 = class124.field2047[var6];
                                class124.field2047[var6++] = class120.method821(var275, class45.method298(arg0, -1)).field3925[var274];
                                continue;
                            }
                            if (var434 == 5058) {
                                class146.field2548 = new class34();
                                var6--;
                                class146.field2548.field421 = class124.field2047[var6];
                                class146.field2548.field419 = class120.method821(class146.field2548.field421, 119);
                                class146.field2548.field420 = new int[class146.field2548.field419.method1491(128)];
                                continue;
                            }
                            if (var434 == 5059) {
                                class35.field434++;
                                class87.field1348.method672(195, 238);
                                class87.field1348.method768(0, 7295);
                                int var276 = class87.field1348.field1821;
                                class87.field1348.method768(0, 7295);
                                class87.field1348.method753(class146.field2548.field421, -242005080);
                                class146.field2548.field419.method1492(class87.field1348, class146.field2548.field420, arg0 ^ 0xFFFFFF7A);
                                class87.field1348.method729(class87.field1348.field1821 - var276, -13);
                                continue;
                            }
                            if (var434 == 5060) {
                                class211.field3650++;
                                var10--;
                                class168 var277 = class27.field324[var10];
                                class87.field1348.method672(101, arg0 + 244);
                                class87.field1348.method768(0, 7295);
                                int var278 = class87.field1348.field1821;
                                class87.field1348.method739(var277.method1084(32383), -23147);
                                class87.field1348.method753(class146.field2548.field421, -242005080);
                                class146.field2548.field419.method1492(class87.field1348, class146.field2548.field420, 128);
                                class87.field1348.method729(class87.field1348.field1821 - var278, -48);
                                continue;
                            }
                            if (var434 == 5061) {
                                class87.field1348.method672(195, 238);
                                class35.field434++;
                                class87.field1348.method768(0, 7295);
                                int var279 = class87.field1348.field1821;
                                class87.field1348.method768(1, 7295);
                                class87.field1348.method753(class146.field2548.field421, -242005080);
                                class146.field2548.field419.method1492(class87.field1348, class146.field2548.field420, 128);
                                class87.field1348.method729(class87.field1348.field1821 - var279, -45);
                                continue;
                            }
                            if (var434 == 5062) {
                                var6 -= 2;
                                int var280 = class124.field2047[var6 + 1];
                                int var281 = class124.field2047[var6];
                                class124.field2047[var6++] = class120.method817(1, var281).field4350[var280];
                                continue;
                            }
                            if (var434 == 5063) {
                                var6 -= 2;
                                int var282 = class124.field2047[var6];
                                int var283 = class124.field2047[var6 + 1];
                                class124.field2047[var6++] = class120.method817(1, var282).field4361[var283];
                                continue;
                            }
                            if (var434 == 5064) {
                                var6 -= 2;
                                int var284 = class124.field2047[var6];
                                int var285 = class124.field2047[var6 + 1];
                                if (var285 == -1) {
                                    class124.field2047[var6++] = -1;
                                } else {
                                    class124.field2047[var6++] = class120.method817(1, var284).method1667(var285, -1);
                                }
                                continue;
                            }
                            if (var434 == 5065) {
                                var6 -= 2;
                                int var286 = class124.field2047[var6];
                                int var287 = class124.field2047[var6 + 1];
                                if (var287 == -1) {
                                    class124.field2047[var6++] = -1;
                                } else {
                                    class124.field2047[var6++] = class120.method817(1, var286).method1660(var287, -108);
                                }
                                continue;
                            }
                            if (var434 == 5066) {
                                var6--;
                                int var288 = class124.field2047[var6];
                                class124.field2047[var6++] = class120.method821(var288, 115).method1491(128);
                                continue;
                            }
                            if (var434 == 5067) {
                                var6 -= 2;
                                int var289 = class124.field2047[var6 + 1];
                                int var290 = class124.field2047[var6];
                                int var291 = class120.method821(var290, -89).method1485((byte) 110, var289);
                                class124.field2047[var6++] = var291;
                                continue;
                            }
                            if (var434 == 5068) {
                                var6 -= 2;
                                int var292 = class124.field2047[var6];
                                int var293 = class124.field2047[var6 + 1];
                                class146.field2548.field420[var292] = var293;
                                continue;
                            }
                            if (var434 == 5069) {
                                var6 -= 2;
                                int var294 = class124.field2047[var6];
                                int var295 = class124.field2047[var6 + 1];
                                class146.field2548.field420[var294] = var295;
                                continue;
                            }
                            if (var434 == 5070) {
                                var6 -= 3;
                                int var296 = class124.field2047[var6];
                                int var297 = class124.field2047[var6 + 1];
                                int var298 = class124.field2047[var6 + 2];
                                class230 var299 = class120.method821(var296, -46);
                                if (var299.method1485((byte) 80, var297) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class124.field2047[var6++] = var299.method1490(var297, var298, -23);
                                continue;
                            }
                        } else if (var434 < 5200) {
                            if (var434 == 5100) {
                                if (class190.field3306[86]) {
                                    class124.field2047[var6++] = 1;
                                } else {
                                    class124.field2047[var6++] = 0;
                                }
                                continue;
                            }
                            if (var434 == 5101) {
                                if (class190.field3306[82]) {
                                    class124.field2047[var6++] = 1;
                                } else {
                                    class124.field2047[var6++] = 0;
                                }
                                continue;
                            }
                            if (var434 == 5102) {
                                if (class190.field3306[81]) {
                                    class124.field2047[var6++] = 1;
                                } else {
                                    class124.field2047[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var434 < 5300) {
                            if (var434 == 5200) {
                                var6--;
                                class133.method895(class124.field2047[var6], 105);
                                continue;
                            }
                            if (var434 == 5201) {
                                class124.field2047[var6++] = class83.method547(-106);
                                continue;
                            }
                            if (var434 == 5202) {
                                var6--;
                                class149.method997(129, class124.field2047[var6]);
                                continue;
                            }
                            if (var434 == 5203) {
                                var10--;
                                class71.method490(class27.field324[var10], arg0 - 28512);
                                continue;
                            }
                            if (var434 == 5204) {
                                class27.field324[var10 - 1] = class69.method465(0, class27.field324[var10 - 1]);
                                continue;
                            }
                            if (var434 == 5205) {
                                var10--;
                                class30.method200(class27.field324[var10], false);
                                continue;
                            }
                        } else if (var434 >= 5400) {
                            if (var434 < 5500) {
                                if (var434 == 5400) {
                                    var10 -= 2;
                                    class175.field3069++;
                                    class168 var219 = class27.field324[var10 + 1];
                                    class168 var220 = class27.field324[var10];
                                    var6--;
                                    int var221 = class124.field2047[var6];
                                    class87.field1348.method672(113, arg0 + 244);
                                    class87.field1348.method768(class19.method102(var220, (byte) 1) + class19.method102(var219, (byte) 1) + 1, arg0 ^ 0xFFFFE385);
                                    class87.field1348.method721(var220, true);
                                    class87.field1348.method721(var219, true);
                                    class87.field1348.method768(var221, 7295);
                                    continue;
                                }
                                if (var434 == 5401) {
                                    var6 -= 2;
                                    class59.field815[class124.field2047[var6]] = (short) class35.method219(28583, class124.field2047[var6 + 1]);
                                    class61.method413(arg0 + 19398);
                                    class16.method84((byte) -114);
                                    class52.method371(-127);
                                    class246.method1616(0);
                                    class200.method1278((byte) 89);
                                    continue;
                                }
                                if (var434 == 5402) {
                                    var10 -= 2;
                                    class222.field3810 = class27.field324[var10];
                                    class222.field3805 = class27.field324[var10 + 1];
                                    if (class254.field4403 != 10) {
                                        continue;
                                    }
                                    if (!class222.field3810.method1111(60, class244.field4232) && !class222.field3805.method1111(113, class244.field4232)) {
                                        class84.method555(arg0 + 11, 20);
                                        continue;
                                    }
                                    class26.field320 = 3;
                                    continue;
                                }
                                if (var434 == 5403) {
                                    class124.field2047[var6++] = class26.field320;
                                    continue;
                                }
                                if (var434 == 5404) {
                                    class124.field2047[var6++] = class84.field1284 / 60;
                                    continue;
                                }
                                if (var434 == 5405) {
                                    var6 -= 2;
                                    int var222 = class124.field2047[var6];
                                    int var223 = class124.field2047[var6 + 1];
                                    if (var222 >= 0 && var222 < 2) {
                                        class32.field404[var222] = new int[var223 << 1][4];
                                    }
                                    continue;
                                }
                                if (var434 == 5406) {
                                    var6 -= 7;
                                    int var224 = class124.field2047[var6];
                                    int var225 = class124.field2047[var6 + 1] << 1;
                                    int var226 = class124.field2047[var6 + 2];
                                    int var227 = class124.field2047[var6 + 3];
                                    int var228 = class124.field2047[var6 + 4];
                                    int var229 = class124.field2047[var6 + 5];
                                    int var230 = class124.field2047[var6 + 6];
                                    if (var224 >= 0 && var224 < 2 && class32.field404[var224] != null && var225 >= 0 && var225 < class32.field404[var224].length) {
                                        class32.field404[var224][var225] = new int[] { (class86.method571(var226, 268434852) >> 14) * 128, var227, class86.method571(var226, 16383) * 128, var230 };
                                        class32.field404[var224][var225 + 1] = new int[] { (class86.method571(var228, 268423980) >> 14) * 128, var229, class86.method571(16383, var228) * 128 };
                                    }
                                    continue;
                                }
                                if (var434 == 5407) {
                                    var6--;
                                    int var231 = class32.field404[class124.field2047[var6]].length >> 1;
                                    class124.field2047[var6++] = var231;
                                    continue;
                                }
                                if (var434 == 5408) {
                                    class124.field2047[var6++] = 0;
                                    continue;
                                }
                                if (var434 == 5409) {
                                    class234.method1512(122);
                                    continue;
                                }
                                if (var434 == 5411) {
                                    if (class58.field803 == null) {
                                        class93.method616(false, 4, class25.method166((byte) 98));
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var434 == 5412) {
                                    var6 -= 4;
                                    if (class142.field2505 == 0) {
                                        class85.method561(arg0 ^ 0xFFFFFFFB, class124.field2047[var6], class124.field2047[var6 + 3], class124.field2047[var6 + 1], class124.field2047[var6 + 2]);
                                    }
                                    continue;
                                }
                                if (var434 == 5413) {
                                    class124.field2047[var6++] = class117.field1909;
                                    continue;
                                }
                                if (var434 == 5414) {
                                    var10--;
                                    if (class142.field2505 == 0) {
                                        class87.method576(class27.field324[var10].method1084(arg0 ^ 0xFFFF8185), (byte) 28);
                                    }
                                    continue;
                                }
                                if (var434 == 5415) {
                                    class124.field2047[var6++] = class189.field3297;
                                    continue;
                                }
                                if (var434 == 5416) {
                                    var6 -= 4;
                                    var10 -= 2;
                                    if (class142.field2505 == 0) {
                                        class53.method380(class27.field324[var10].method1084(32383), class124.field2047[var6 + 3], class124.field2047[var6 + 1], class124.field2047[var6], class27.field324[var10 + 1], class124.field2047[var6 + 2], (byte) -45);
                                    }
                                    continue;
                                }
                                if (var434 == 5417) {
                                    class124.field2047[var6++] = class223.field3835;
                                    continue;
                                }
                                if (var434 == 5418) {
                                    for (int var232 = 0; var232 < 5; var232++) {
                                        class27.field324[var10++] = var232 < class153.field2655.length ? class153.field2655[var232] : class244.field4232;
                                    }
                                    class153.field2655 = null;
                                    continue;
                                }
                                if (var434 == 5419) {
                                    class168 var233 = class244.field4232;
                                    if (class64.field899 != null) {
                                        var233 = method290(class64.field899.field61, (byte) 63);
                                        try {
                                            if (class64.field899.field59 != null) {
                                                byte[] var234 = ((String) class64.field899.field59).getBytes("ISO-8859-1");
                                                var233 = class119.method812((byte) 83, var234.length, 0, var234);
                                            }
                                        } catch (UnsupportedEncodingException var432) {
                                        }
                                    }
                                    class27.field324[var10++] = var233;
                                    continue;
                                }
                                if (var434 == 5420) {
                                    class124.field2047[var6++] = class46.field604 == 2 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 5421) {
                                    var10--;
                                    class168 var235 = class27.field324[var10];
                                    var6--;
                                    boolean var236 = class124.field2047[var6] == 1;
                                    class93.method616(var236, 108, class50.method347(arg0 ^ 0xFFFFFFF8, new class168[] { class25.method166((byte) -70), var235 }));
                                    continue;
                                }
                            } else if (var434 < 5600) {
                                if (var434 == 5500) {
                                    var6 -= 4;
                                    int var207 = class124.field2047[var6 + 2];
                                    int var208 = class124.field2047[var6 + 1];
                                    int var209 = class124.field2047[var6];
                                    int var210 = class124.field2047[var6 + 3];
                                    class155.method1021((var209 >> 14 & 0x3FFF) - class246.field4261, var207, 31145, (var209 & 0x3FFF) - class125.field2060, var210, false, var208);
                                    continue;
                                }
                                if (var434 == 5501) {
                                    var6 -= 4;
                                    int var211 = class124.field2047[var6];
                                    int var212 = class124.field2047[var6 + 1];
                                    int var213 = class124.field2047[var6 + 3];
                                    int var214 = class124.field2047[var6 + 2];
                                    class169.method1126(var212, (var211 >> 14 & 0x3FFF) - class246.field4261, 1, var214, (var211 & 0x3FFF) - class125.field2060, var213);
                                    continue;
                                }
                                if (var434 == 5502) {
                                    var6 -= 6;
                                    int var215 = class124.field2047[var6];
                                    if (var215 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class168.field2879 = var215;
                                    int var216 = class124.field2047[var6 + 1];
                                    if (class32.field404[class168.field2879].length >> 1 <= var216 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class151.field2630 = 0;
                                    class168.field2912 = var216;
                                    class154.field2682 = class124.field2047[var6 + 2];
                                    class162.field2776 = class124.field2047[var6 + 3];
                                    int var217 = class124.field2047[var6 + 4];
                                    if (var217 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class62.field856 = var217;
                                    int var218 = class124.field2047[var6 + 5];
                                    if (class32.field404[class62.field856].length >> 1 <= var218 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class240.field4107 = var218;
                                    class31.field379 = 3;
                                    continue;
                                }
                                if (var434 == 5503) {
                                    class92.method609(true);
                                    continue;
                                }
                            } else if (var434 < 6100) {
                                if (var434 == 6001) {
                                    var6--;
                                    int var193 = class124.field2047[var6];
                                    if (var193 < 1) {
                                        var193 = 1;
                                    }
                                    if (var193 > 4) {
                                        var193 = 4;
                                    }
                                    class132.field2323 = var193;
                                    if (class132.field2323 == 1) {
                                        class248.method1622(0.9F);
                                    }
                                    if (class132.field2323 == 2) {
                                        class248.method1622(0.8F);
                                    }
                                    if (class132.field2323 == 3) {
                                        class248.method1622(0.7F);
                                    }
                                    if (class132.field2323 == 4) {
                                        class248.method1622(0.6F);
                                    }
                                    class16.method84((byte) -82);
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6002) {
                                    var6--;
                                    class176.method1160(class124.field2047[var6] == 1, (byte) 68);
                                    class143.method977(3);
                                    class246.method1614((byte) 83);
                                    if (class119.method816((byte) 104) && class249.field4315) {
                                        if (class198.field3418 == null) {
                                            class198.field3418 = new byte[4][104][104];
                                        }
                                        byte var194 = (byte) (class237.field4073 - 4 & 0xFF);
                                        for (int var195 = 0; var195 < 4; var195++) {
                                            for (int var196 = 0; var196 < 104; var196++) {
                                                for (int var197 = 0; var197 < 104; var197++) {
                                                    class198.field3418[var195][var196][var197] = var194;
                                                }
                                            }
                                        }
                                    }
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6003) {
                                    var6--;
                                    class249.field4315 = class124.field2047[var6] == 1;
                                    if (class119.method816((byte) 114) && class249.field4315) {
                                        byte var198 = (byte) (class237.field4073 - 4 & 0xFF);
                                        if (class198.field3418 == null) {
                                            class198.field3418 = new byte[4][104][104];
                                        }
                                        for (int var199 = 0; var199 < 4; var199++) {
                                            for (int var200 = 0; var200 < 104; var200++) {
                                                for (int var201 = 0; var201 < 104; var201++) {
                                                    class198.field3418[var199][var200][var201] = var198;
                                                }
                                            }
                                        }
                                    }
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6005) {
                                    var6--;
                                    class227.field3866 = class124.field2047[var6] == 1;
                                    class246.method1614((byte) 83);
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6006) {
                                    var6--;
                                    class3.field34 = class124.field2047[var6] == 1;
                                    ((class102) class248.field4299).method678(!class3.field34, (byte) 114);
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6007) {
                                    var6--;
                                    class17.field149 = class124.field2047[var6] == 1;
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6008) {
                                    var6--;
                                    class153.field2651 = class124.field2047[var6] == 1;
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6009) {
                                    var6--;
                                    class207.field3593 = class124.field2047[var6] == 1;
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6010) {
                                    var6--;
                                    class253.field4382 = class124.field2047[var6] == 1;
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6011) {
                                    var6--;
                                    int var202 = class124.field2047[var6];
                                    if (var202 < 0 || var202 > 2) {
                                        var202 = 0;
                                    }
                                    class112.field1781 = var202;
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6012) {
                                    var6--;
                                    class101.field1601 = class124.field2047[var6] == 1;
                                    if (class132.field2323 == 1) {
                                        class248.method1622(0.9F);
                                    }
                                    if (class132.field2323 == 2) {
                                        class248.method1622(0.8F);
                                    }
                                    if (class132.field2323 == 3) {
                                        class248.method1622(0.7F);
                                    }
                                    if (class132.field2323 == 4) {
                                        class248.method1622(0.6F);
                                    }
                                    class246.method1614((byte) 97);
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6014) {
                                    var6--;
                                    class177.field3117 = class124.field2047[var6] == 1;
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6015) {
                                    var6--;
                                    class98.field1551 = class124.field2047[var6] == 1;
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6016) {
                                    var6--;
                                    int var203 = class124.field2047[var6];
                                    if (var203 < 0 || var203 > 2) {
                                        var203 = 0;
                                    }
                                    class191.field3333 = var203;
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6017) {
                                    var6--;
                                    class247.field4284 = class124.field2047[var6] == 1;
                                    class161.method1044(1);
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6018) {
                                    var6--;
                                    int var204 = class124.field2047[var6];
                                    if (var204 < 0) {
                                        var204 = 0;
                                    }
                                    if (var204 > 127) {
                                        var204 = 127;
                                    }
                                    class62.field847 = var204;
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6019) {
                                    var6--;
                                    int var205 = class124.field2047[var6];
                                    if (var205 < 0) {
                                        var205 = 0;
                                    }
                                    if (var205 > 255) {
                                        var205 = 255;
                                    }
                                    if (class93.field1464 != var205) {
                                        if (class93.field1464 == 0 && class230.field3908 != -1) {
                                            class192.method1247(class230.field3908, class159.field2749, (byte) -77, var205, 0, false);
                                            class147.field2574 = false;
                                        } else if (var205 == 0) {
                                            class99.method651(-2);
                                            class147.field2574 = false;
                                        } else {
                                            class189.method1223(var205, true);
                                        }
                                        class93.field1464 = var205;
                                    }
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6020) {
                                    var6--;
                                    int var206 = class124.field2047[var6];
                                    if (var206 < 0) {
                                        var206 = 0;
                                    }
                                    if (var206 > 127) {
                                        var206 = 127;
                                    }
                                    class166.field2828 = var206;
                                    class200.method1277(class205.field3559, (byte) 38);
                                    class142.field2502 = false;
                                    continue;
                                }
                                if (var434 == 6021) {
                                    var6--;
                                    class112.field1809 = class124.field2047[var6] == 1;
                                    continue;
                                }
                            } else if (var434 < 6200) {
                                if (var434 == 6101) {
                                    class124.field2047[var6++] = class132.field2323;
                                    continue;
                                }
                                if (var434 == 6102) {
                                    class124.field2047[var6++] = class119.method816((byte) 14) ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6103) {
                                    class124.field2047[var6++] = class249.field4315 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6105) {
                                    class124.field2047[var6++] = class227.field3866 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6106) {
                                    class124.field2047[var6++] = class3.field34 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6107) {
                                    class124.field2047[var6++] = class17.field149 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6108) {
                                    class124.field2047[var6++] = class153.field2651 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6109) {
                                    class124.field2047[var6++] = class207.field3593 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6110) {
                                    class124.field2047[var6++] = class253.field4382 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6111) {
                                    class124.field2047[var6++] = class112.field1781;
                                    continue;
                                }
                                if (var434 == 6112) {
                                    class124.field2047[var6++] = class101.field1601 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6114) {
                                    class124.field2047[var6++] = class177.field3117 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6115) {
                                    class124.field2047[var6++] = class98.field1551 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6116) {
                                    class124.field2047[var6++] = class191.field3333;
                                    continue;
                                }
                                if (var434 == 6117) {
                                    class124.field2047[var6++] = class247.field4284 ? 1 : 0;
                                    continue;
                                }
                                if (var434 == 6118) {
                                    class124.field2047[var6++] = class62.field847;
                                    continue;
                                }
                                if (var434 == 6119) {
                                    class124.field2047[var6++] = class93.field1464;
                                    continue;
                                }
                                if (var434 == 6120) {
                                    class124.field2047[var6++] = class166.field2828;
                                    continue;
                                }
                                if (var434 == 6121) {
                                    class124.field2047[var6++] = 0;
                                    continue;
                                }
                            } else if (var434 < 6300) {
                                if (var434 == 6200) {
                                    var6 -= 2;
                                    class150.field2596 = (short) class124.field2047[var6];
                                    if (class150.field2596 <= 0) {
                                        class150.field2596 = 256;
                                    }
                                    class73.field1113 = (short) class124.field2047[var6 + 1];
                                    if (class73.field1113 <= 0) {
                                        class73.field1113 = 205;
                                    }
                                    continue;
                                }
                                if (var434 == 6201) {
                                    var6 -= 2;
                                    class95.field1500 = (short) class124.field2047[var6];
                                    if (class95.field1500 <= 0) {
                                        class95.field1500 = 256;
                                    }
                                    class70.field1020 = (short) class124.field2047[var6 + 1];
                                    if (class70.field1020 <= 0) {
                                        class70.field1020 = 320;
                                    }
                                    continue;
                                }
                                if (var434 == 6202) {
                                    var6 -= 4;
                                    class105.field1679 = (short) class124.field2047[var6];
                                    if (class105.field1679 <= 0) {
                                        class105.field1679 = 1;
                                    }
                                    class158.field2738 = (short) class124.field2047[var6 + 1];
                                    if (class158.field2738 <= 0) {
                                        class158.field2738 = 32767;
                                    } else if (class105.field1679 > class158.field2738) {
                                        class158.field2738 = class105.field1679;
                                    }
                                    class86.field1343 = (short) class124.field2047[var6 + 2];
                                    if (class86.field1343 <= 0) {
                                        class86.field1343 = 1;
                                    }
                                    class148.field2576 = (short) class124.field2047[var6 + 3];
                                    if (class148.field2576 <= 0) {
                                        class148.field2576 = 32767;
                                    } else if (class86.field1343 > class148.field2576) {
                                        class148.field2576 = class86.field1343;
                                    }
                                    continue;
                                }
                                if (var434 == 6203) {
                                    class56.method392(0, 0, 92, false, class254.field4385.field2175, class254.field4385.field2210);
                                    class124.field2047[var6++] = client.field538;
                                    class124.field2047[var6++] = class25.field296;
                                    continue;
                                }
                                if (var434 == 6204) {
                                    class124.field2047[var6++] = class95.field1500;
                                    class124.field2047[var6++] = class70.field1020;
                                    continue;
                                }
                                if (var434 == 6205) {
                                    class124.field2047[var6++] = class150.field2596;
                                    class124.field2047[var6++] = class73.field1113;
                                    continue;
                                }
                            } else if (var434 < 6400) {
                                if (var434 == 6300) {
                                    class124.field2047[var6++] = (int) (class59.method407(-51) / 60000L);
                                    continue;
                                }
                                if (var434 == 6301) {
                                    class124.field2047[var6++] = (int) (class59.method407(-68) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var434 == 6302) {
                                    var6 -= 3;
                                    int var188 = class124.field2047[var6];
                                    int var189 = class124.field2047[var6 + 1];
                                    int var190 = class124.field2047[var6 + 2];
                                    class71.field1092.clear();
                                    class71.field1092.set(11, 12);
                                    class71.field1092.set(var190, var189, var188);
                                    class124.field2047[var6++] = (int) (class71.field1092.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var434 == 6303) {
                                    class71.field1092.clear();
                                    class71.field1092.setTime(new Date(class59.method407(-110)));
                                    class124.field2047[var6++] = class71.field1092.get(1);
                                    continue;
                                }
                                if (var434 == 6304) {
                                    var6--;
                                    int var191 = class124.field2047[var6];
                                    boolean var192 = true;
                                    if (var191 < 0) {
                                        var192 = (var191 + 1) % 4 == 0;
                                    } else if (var191 < 1582) {
                                        var192 = var191 % 4 == 0;
                                    } else if (var191 % 4 != 0) {
                                        var192 = false;
                                    } else if (var191 % 100 != 0) {
                                        var192 = true;
                                    } else if (var191 % 400 != 0) {
                                        var192 = false;
                                    }
                                    class124.field2047[var6++] = var192 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var434 == 5304) {
                            class124.field2047[var6++] = 0;
                            continue;
                        }
                    } else if (var434 == 4400) {
                        var6 -= 2;
                        int var300 = class124.field2047[var6 + 1];
                        int var301 = class124.field2047[var6];
                        class29 var302 = class89.method588(var300, arg0 - 9888);
                        if (var302.method192((byte) 98)) {
                            class27.field324[var10++] = class190.method1232(var301, 13090).method469(var302.field355, 28, var300);
                        } else {
                            class124.field2047[var6++] = class190.method1232(var301, 13090).method470(var302.field349, var300, (byte) -29);
                        }
                        continue;
                    }
                } else {
                    class129 var418;
                    if (var434 >= 2000) {
                        var6--;
                        var418 = class257.method1713(class124.field2047[var6], arg0 + 132);
                        var434 -= 1000;
                    } else {
                        var418 = var46 ? class155.field2700 : class102.field1625;
                    }
                    if (var434 == 1300) {
                        var6--;
                        int var419 = class124.field2047[var6] - 1;
                        if (var419 >= 0 && var419 <= 9) {
                            var10--;
                            var418.method876(var419, class27.field324[var10], 0);
                            continue;
                        }
                        var10--;
                        continue;
                    }
                    if (var434 == 1301) {
                        var6 -= 2;
                        int var420 = class124.field2047[var6];
                        int var421 = class124.field2047[var6 + 1];
                        var418.field2273 = class58.method404(var421, false, var420);
                        continue;
                    }
                    if (var434 == 1302) {
                        var6--;
                        var418.field2144 = class124.field2047[var6] == 1;
                        continue;
                    }
                    if (var434 == 1303) {
                        var6--;
                        var418.field2227 = class124.field2047[var6];
                        continue;
                    }
                    if (var434 == 1304) {
                        var6--;
                        var418.field2270 = class124.field2047[var6];
                        continue;
                    }
                    if (var434 == 1305) {
                        var10--;
                        var418.field2148 = class27.field324[var10];
                        continue;
                    }
                    if (var434 == 1306) {
                        var10--;
                        var418.field2169 = class27.field324[var10];
                        continue;
                    }
                    if (var434 == 1307) {
                        var418.field2174 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var433) {
            if (var5.field3229 == null) {
                if (class23.field277 != 0) {
                    class229.method1475(class244.field4232, class223.field3834, -1, 0);
                }
                class112.method763(var433, "CS2 - scr:" + var5.field3308 + " op:" + var11, 82);
            } else {
                class168 var429 = class168.method1105(17283, 30);
                var429.method1090(class150.field2604, 40).method1090(var5.field3229, 40);
                for (int var430 = class92.field1459 - 1; var430 >= 0; var430--) {
                    var429.method1090(class51.field705, 40).method1090(class134.field2344[var430].field414.field3229, 40);
                }
                if (var11 == 40) {
                    int var431 = var7[var9];
                    var429.method1090(class100.field1576, 40).method1090(class128.method867((byte) 103, var431), 40);
                }
                if (class23.field277 != 0) {
                    class229.method1475(class244.field4232, class50.method347(arg0 + 8, new class168[] { class230.field3912, var5.field3229 }), -1, 0);
                }
                class112.method763(var433, "CS2 - scr:" + var5.field3308 + " op:" + var11 + new String(var429.method1081(arg0 ^ 0x7D)), 126);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB[I)Lkh;")
    private final class220 method288(int arg0, int arg1, byte arg2, int[] arg3) {
        if (arg2 > -63) {
            return null;
        }
        field572++;
        int var5 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF2);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class220 var9 = (class220) this.field571.method1527(var7, (byte) -125);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class28 var10 = class28.method188(this.field564, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class220 var11 = var10.method186();
            this.field571.method1533(var7, -118, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field3788.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B[III)Lkh;")
    private final class220 method289(byte arg0, int[] arg1, int arg2, int arg3) {
        field570++;
        int var5 = (arg3 << 4 & 0xFFF7 | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class220 var9 = (class220) this.field571.method1527(var7, (byte) -75);
        if (var9 != null) {
            return var9;
        }
        if (arg0 >= -45) {
            method285(true);
        }
        if (arg1 != null && arg1[0] <= 0) {
            return null;
        }
        class235 var10 = (class235) this.field562.method1527(var7, (byte) -91);
        if (var10 == null) {
            var10 = class235.method1525(this.field567, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            this.field562.method1533(var7, 113, var10);
        }
        class220 var11 = var10.method1518(arg1);
        if (var11 == null) {
            return null;
        } else {
            var10.method1234(17216);
            this.field571.method1533(var7, -105, var11);
            return var11;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Lqe;")
    public static final class168 method290(int arg0, byte arg1) {
        field569++;
        if (arg1 != 63) {
            method287((byte) -68, 23, null);
        }
        return class50.method347(2, new class168[] { class128.method867((byte) 84, arg0 >> 24 & 0xFF), class171.field2968, class128.method867((byte) 83, arg0 >> 16 & 0xFF), class171.field2968, class128.method867((byte) 99, arg0 >> 8 & 0xFF), class171.field2968, class128.method867((byte) 85, arg0 & 0xFF) });
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([IBI)Lkh;")
    public final class220 method291(int[] arg0, byte arg1, int arg2) {
        if (arg1 <= 39) {
            this.method291(null, (byte) 101, 2);
        }
        field573++;
        if (this.field567.method1698(126) == 1) {
            return this.method289((byte) -76, arg0, arg2, 0);
        } else if (this.field567.method1694(arg2, 28851) == 1) {
            return this.method289((byte) -124, arg0, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Loe;Loe;)V")
    public class43(class256 arg0, class256 arg1) {
        this.field564 = arg0;
        this.field567 = arg1;
    }
}
