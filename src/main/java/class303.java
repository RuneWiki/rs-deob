import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class303 extends RuntimeException {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5235;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Ljava/lang/String;")
    public String field5234;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lke;")
    public static class256 field5237 = class316.method2202("showingVideoAd", 27626);

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lmf;")
    public static class174 field5239 = new class174(64);

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Z")
    public static boolean field5241 = false;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field5242 = 1;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "[S")
    public static short[] field5243 = new short[500];

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field5244 = 0;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lng;")
    public static class138 field5245;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILol;)V", line = 4)
    public static final void method2119(int arg0, int arg1, class119 arg2) {
        field5240++;
        Object[] var3 = arg2.field2114;
        int var4 = (Integer) var3[0];
        class137 var5 = class192.method1389(var4, 89);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class44.field823 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field2380;
        int[] var10 = var5.field2386;
        if (arg1 != -2605) {
            method2120(true, 53);
        }
        byte var11 = -1;
        try {
            class157.field2800 = new class256[var5.field2378];
            class313.field5390 = new int[var5.field2387];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field2120;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field2109;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field2116 == null ? -1 : arg2.field2116.field3342;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field2118;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field2116 == null ? -1 : arg2.field2116.field3305;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field2122 == null ? -1 : arg2.field2122.field3342;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field2122 == null ? -1 : arg2.field2122.field3305;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field2104;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field2117;
                    }
                    class313.field5390[var12++] = var15;
                } else if (var3[var14] instanceof class256) {
                    class256 var16 = (class256) var3[var14];
                    if (var16.method1806(false, class230.field3945)) {
                        var16 = arg2.field2108;
                    }
                    class157.field2800[var13++] = var16;
                }
            }
            int var17 = 0;
            label4259: while (true) {
                var17++;
                if (arg0 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var514 = var10[var8];
                if (var514 < 100) {
                    if (var514 == 0) {
                        class98.field1751[var6++] = var9[var8];
                        continue;
                    }
                    if (var514 == 1) {
                        int var18 = var9[var8];
                        class98.field1751[var6++] = class97.field1741[var18];
                        continue;
                    }
                    if (var514 == 2) {
                        int var19 = var9[var8];
                        var6--;
                        class17.method109(-13185, class98.field1751[var6], var19);
                        continue;
                    }
                    if (var514 == 3) {
                        class7.field115[var7++] = var5.field2393[var8];
                        continue;
                    }
                    if (var514 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var514 == 7) {
                        var6 -= 2;
                        if (class98.field1751[var6 + 1] != class98.field1751[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var514 == 8) {
                        var6 -= 2;
                        if (class98.field1751[var6 + 1] == class98.field1751[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var514 == 9) {
                        var6 -= 2;
                        if (class98.field1751[var6 + 1] > class98.field1751[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var514 == 10) {
                        var6 -= 2;
                        if (class98.field1751[var6] > class98.field1751[var6 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var514 == 21) {
                        if (class44.field823 == 0) {
                            return;
                        }
                        class286 var20 = class174.field3083[--class44.field823];
                        class157.field2800 = var20.field4961;
                        var5 = var20.field4962;
                        var10 = var5.field2386;
                        class313.field5390 = var20.field4964;
                        var9 = var5.field2380;
                        var8 = var20.field4957;
                        continue;
                    }
                    if (var514 == 25) {
                        int var21 = var9[var8];
                        class98.field1751[var6++] = class21.method137(class288.method2011(arg1, 5190), var21);
                        continue;
                    }
                    if (var514 == 27) {
                        int var22 = var9[var8];
                        var6--;
                        class52.method412(class98.field1751[var6], (byte) -33, var22);
                        continue;
                    }
                    if (var514 == 31) {
                        var6 -= 2;
                        if (class98.field1751[var6 + 1] >= class98.field1751[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var514 == 32) {
                        var6 -= 2;
                        if (class98.field1751[var6] >= class98.field1751[var6 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var514 == 33) {
                        class98.field1751[var6++] = class313.field5390[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var514 == 34) {
                        var10001 = var9[var8];
                        var6--;
                        class313.field5390[var10001] = class98.field1751[var6];
                        continue;
                    }
                    if (var514 == 35) {
                        class7.field115[var7++] = class157.field2800[var9[var8]];
                        continue;
                    }
                    if (var514 == 36) {
                        var10001 = var9[var8];
                        var7--;
                        class157.field2800[var10001] = class7.field115[var7];
                        continue;
                    }
                    if (var514 == 37) {
                        int var23 = var9[var8];
                        var7 -= var23;
                        class256 var24 = class100.method719(var7, (byte) -26, class7.field115, var23);
                        class7.field115[var7++] = var24;
                        continue;
                    }
                    if (var514 == 38) {
                        var6--;
                        continue;
                    }
                    if (var514 == 39) {
                        var7--;
                        continue;
                    }
                    if (var514 == 40) {
                        int var25 = var9[var8];
                        class137 var26 = class192.method1389(var25, 112);
                        class256[] var27 = new class256[var26.field2378];
                        int[] var28 = new int[var26.field2387];
                        for (int var29 = 0; var29 < var26.field2385; var29++) {
                            var28[var29] = class98.field1751[var6 + var29 - var26.field2385];
                        }
                        for (int var30 = 0; var30 < var26.field2379; var30++) {
                            var27[var30] = class7.field115[var30 + var7 - var26.field2379];
                        }
                        var7 -= var26.field2379;
                        var6 -= var26.field2385;
                        class286 var31 = new class286();
                        var31.field4957 = var8;
                        var31.field4961 = class157.field2800;
                        var31.field4964 = class313.field5390;
                        var31.field4962 = var5;
                        if (class174.field3083.length <= class44.field823) {
                            throw new RuntimeException();
                        }
                        class174.field3083[class44.field823++] = var31;
                        var5 = var26;
                        class157.field2800 = var27;
                        var8 = -1;
                        class313.field5390 = var28;
                        var10 = var26.field2386;
                        var9 = var26.field2380;
                        continue;
                    }
                    if (var514 == 42) {
                        class98.field1751[var6++] = class17.field221[var9[var8]];
                        continue;
                    }
                    if (var514 == 43) {
                        int var32 = var9[var8];
                        var6--;
                        class17.field221[var32] = class98.field1751[var6];
                        class14.method81(-20909, var32);
                        continue;
                    }
                    if (var514 == 44) {
                        int var33 = var9[var8] >> 16;
                        int var34 = var9[var8] & 0xFFFF;
                        var6--;
                        int var35 = class98.field1751[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            class32.field522[var33] = var35;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label4259;
                                }
                                class192.field3519[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var514 == 45) {
                        var6--;
                        int var38 = class98.field1751[var6];
                        int var39 = var9[var8];
                        if (var38 >= 0 && class32.field522[var39] > var38) {
                            class98.field1751[var6++] = class192.field3519[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var514 == 46) {
                        var6 -= 2;
                        int var40 = var9[var8];
                        int var41 = class98.field1751[var6];
                        if (var41 >= 0 && var41 < class32.field522[var40]) {
                            class192.field3519[var40][var41] = class98.field1751[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var514 == 47) {
                        class256 var42 = class255.field4361[var9[var8]];
                        if (var42 == null) {
                            var42 = class132.field2311;
                        }
                        class7.field115[var7++] = var42;
                        continue;
                    }
                    if (var514 == 48) {
                        int var43 = var9[var8];
                        var7--;
                        class255.field4361[var43] = class7.field115[var7];
                        class175.method1271((byte) 51, var43);
                        continue;
                    }
                    if (var514 == 51) {
                        class254 var44 = var5.field2388[var9[var8]];
                        var6--;
                        class6 var45 = (class6) var44.method1744((byte) 126, (long) class98.field1751[var6]);
                        if (var45 != null) {
                            var8 += var45.field94;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var514 < 300) {
                    if (var514 == 100) {
                        var6 -= 3;
                        int var47 = class98.field1751[var6];
                        int var48 = class98.field1751[var6 + 1];
                        int var49 = class98.field1751[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class188 var50 = class182.method1335((byte) 118, var47);
                        if (var50.field3368 == null) {
                            var50.field3368 = new class188[var49 + 1];
                        }
                        if (var49 >= var50.field3368.length) {
                            class188[] var51 = new class188[var49 + 1];
                            for (int var52 = 0; var52 < var50.field3368.length; var52++) {
                                var51[var52] = var50.field3368[var52];
                            }
                            var50.field3368 = var51;
                        }
                        if (var49 > 0 && var50.field3368[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class188 var53 = new class188();
                        var53.field3468 = var53.field3342 = var50.field3342;
                        var53.field3396 = true;
                        var53.field3467 = var48;
                        var53.field3305 = var49;
                        var50.field3368[var49] = var53;
                        if (var46) {
                            class192.field3509 = var53;
                        } else {
                            class86.field1566 = var53;
                        }
                        class64.method500(var50, (byte) -117);
                        continue;
                    }
                    if (var514 == 101) {
                        class188 var54 = var46 ? class192.field3509 : class86.field1566;
                        if (var54.field3305 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class188 var55 = class182.method1335((byte) 106, var54.field3342);
                        var55.field3368[var54.field3305] = null;
                        class64.method500(var55, (byte) -117);
                        continue;
                    }
                    if (var514 == 102) {
                        var6--;
                        class188 var56 = class182.method1335((byte) 120, class98.field1751[var6]);
                        var56.field3368 = null;
                        class64.method500(var56, (byte) -117);
                        continue;
                    }
                    if (var514 == 200) {
                        var6 -= 2;
                        int var57 = class98.field1751[var6];
                        int var58 = class98.field1751[var6 + 1];
                        class188 var59 = client.method832(var57, arg1 + 28372, var58);
                        if (var59 != null && var58 != -1) {
                            class98.field1751[var6++] = 1;
                            if (var46) {
                                class192.field3509 = var59;
                            } else {
                                class86.field1566 = var59;
                            }
                            continue;
                        }
                        class98.field1751[var6++] = 0;
                        continue;
                    }
                    if (var514 == 201) {
                        var6--;
                        int var60 = class98.field1751[var6];
                        class188 var61 = class182.method1335((byte) 104, var60);
                        if (var61 == null) {
                            class98.field1751[var6++] = 0;
                        } else {
                            class98.field1751[var6++] = 1;
                            if (var46) {
                                class192.field3509 = var61;
                            } else {
                                class86.field1566 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var514 < 500) {
                    if (var514 == 403) {
                        var6 -= 2;
                        int var62 = class98.field1751[var6];
                        if (var62 >= 7) {
                            var62 -= 7;
                        }
                        int var63 = class98.field1751[var6 + 1];
                        class121.field2124.field2552.method389(arg1 + 2487, var63, var62);
                        continue;
                    }
                    if (var514 == 404) {
                        var6 -= 2;
                        int var64 = class98.field1751[var6];
                        int var65 = class98.field1751[var6 + 1];
                        class121.field2124.field2552.method401(var64, var65, -5578);
                        continue;
                    }
                    if (var514 == 410) {
                        var6--;
                        boolean var66 = class98.field1751[var6] != 0;
                        class121.field2124.field2552.method400((byte) -21, var66);
                        continue;
                    }
                } else if (var514 >= 1000 && var514 < 1100 || var514 >= 2000 && var514 < 2100) {
                    class188 var67;
                    if (var514 >= 2000) {
                        var6--;
                        var67 = class182.method1335((byte) 112, class98.field1751[var6]);
                        var514 -= 1000;
                    } else {
                        var67 = var46 ? class192.field3509 : class86.field1566;
                    }
                    if (var514 == 1000) {
                        var6 -= 4;
                        var67.field3403 = class98.field1751[var6];
                        var67.field3389 = class98.field1751[var6 + 1];
                        int var68 = class98.field1751[var6 + 2];
                        if (var68 < 0) {
                            var68 = 0;
                        } else if (var68 > 5) {
                            var68 = 5;
                        }
                        int var69 = class98.field1751[var6 + 3];
                        if (var69 < 0) {
                            var69 = 0;
                        } else if (var69 > 5) {
                            var69 = 5;
                        }
                        var67.field3372 = (byte) var68;
                        var67.field3437 = (byte) var69;
                        class64.method500(var67, (byte) -117);
                        class252.method1699((byte) 69, var67);
                        if (var67.field3305 == -1) {
                            class249.method1679(var67.field3342, arg1 ^ 0xFFFFF5D8);
                        }
                        continue;
                    }
                    if (var514 == 1001) {
                        var6 -= 4;
                        var67.field3364 = class98.field1751[var6];
                        var67.field3390 = class98.field1751[var6 + 1];
                        var67.field3457 = 0;
                        var67.field3335 = 0;
                        int var70 = class98.field1751[var6 + 2];
                        if (var70 < 0) {
                            var70 = 0;
                        } else if (var70 > 4) {
                            var70 = 4;
                        }
                        int var71 = class98.field1751[var6 + 3];
                        var67.field3447 = (byte) var70;
                        if (var71 < 0) {
                            var71 = 0;
                        } else if (var71 > 4) {
                            var71 = 4;
                        }
                        var67.field3339 = (byte) var71;
                        class64.method500(var67, (byte) -117);
                        class252.method1699((byte) 69, var67);
                        if (var67.field3467 == 0) {
                            class90.method675(false, var67, -1);
                        }
                        continue;
                    }
                    if (var514 == 1003) {
                        var6--;
                        boolean var72 = class98.field1751[var6] == 1;
                        if (var72 != var67.field3418) {
                            var67.field3418 = var72;
                            class64.method500(var67, (byte) -117);
                        }
                        if (var67.field3305 == -1) {
                            class271.method1872(2048, var67.field3342);
                        }
                        continue;
                    }
                    if (var514 == 1004) {
                        var6 -= 2;
                        var67.field3380 = class98.field1751[var6];
                        var67.field3369 = class98.field1751[var6 + 1];
                        class64.method500(var67, (byte) -117);
                        class252.method1699((byte) 69, var67);
                        if (var67.field3467 == 0) {
                            class90.method675(false, var67, -1);
                        }
                        continue;
                    }
                    if (var514 == 1005) {
                        var6--;
                        var67.field3350 = class98.field1751[var6] == 1;
                        continue;
                    }
                } else if (var514 >= 1100 && var514 < 1200 || var514 >= 2100 && var514 < 2200) {
                    class188 var73;
                    if (var514 < 2000) {
                        var73 = var46 ? class192.field3509 : class86.field1566;
                    } else {
                        var514 -= 1000;
                        var6--;
                        var73 = class182.method1335((byte) 89, class98.field1751[var6]);
                    }
                    if (var514 == 1100) {
                        var6 -= 2;
                        var73.field3442 = class98.field1751[var6];
                        if (var73.field3442 > (var73.field3407 - var73.field3391)) {
                            var73.field3442 = var73.field3407 - var73.field3391;
                        }
                        if (var73.field3442 < 0) {
                            var73.field3442 = 0;
                        }
                        var73.field3463 = class98.field1751[var6 + 1];
                        if (var73.field3463 > var73.field3393 - var73.field3343) {
                            var73.field3463 = var73.field3393 - var73.field3343;
                        }
                        if (var73.field3463 < 0) {
                            var73.field3463 = 0;
                        }
                        class64.method500(var73, (byte) -117);
                        if (var73.field3305 == -1) {
                            class168.method1222((byte) -124, var73.field3342);
                        }
                        continue;
                    }
                    if (var514 == 1101) {
                        var6--;
                        var73.field3332 = class98.field1751[var6];
                        class64.method500(var73, (byte) -117);
                        if (var73.field3305 == -1) {
                            class72.method548(var73.field3342, -101);
                        }
                        continue;
                    }
                    if (var514 == 1102) {
                        var6--;
                        var73.field3427 = class98.field1751[var6] == 1;
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1103) {
                        var6--;
                        var73.field3307 = class98.field1751[var6];
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1104) {
                        var6--;
                        var73.field3383 = class98.field1751[var6];
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1105) {
                        var6--;
                        var73.field3425 = class98.field1751[var6];
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1106) {
                        var6--;
                        var73.field3433 = class98.field1751[var6];
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1107) {
                        var6--;
                        var73.field3309 = class98.field1751[var6] == 1;
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1108) {
                        var73.field3434 = 1;
                        var6--;
                        var73.field3306 = class98.field1751[var6];
                        class64.method500(var73, (byte) -117);
                        if (var73.field3305 == -1) {
                            class252.method1694(var73.field3342, (byte) 38);
                        }
                        continue;
                    }
                    if (var514 == 1109) {
                        var6 -= 6;
                        var73.field3317 = class98.field1751[var6];
                        var73.field3395 = class98.field1751[var6 + 1];
                        var73.field3353 = class98.field1751[var6 + 2];
                        var73.field3313 = class98.field1751[var6 + 3];
                        var73.field3466 = class98.field1751[var6 + 4];
                        var73.field3450 = class98.field1751[var6 + 5];
                        class64.method500(var73, (byte) -117);
                        if (var73.field3305 == -1) {
                            class88.method651(var73.field3342, (byte) -87);
                            class155.method1155(var73.field3342, false);
                        }
                        continue;
                    }
                    if (var514 == 1110) {
                        var6--;
                        int var74 = class98.field1751[var6];
                        if (var73.field3318 != var74) {
                            var73.field3394 = 0;
                            var73.field3318 = var74;
                            var73.field3392 = 0;
                            class64.method500(var73, (byte) -117);
                        }
                        if (var73.field3305 == -1) {
                            class196.method1419(14873, var73.field3342);
                        }
                        continue;
                    }
                    if (var514 == 1111) {
                        var6--;
                        var73.field3458 = class98.field1751[var6] == 1;
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1112) {
                        var7--;
                        class256 var75 = class7.field115[var7];
                        if (!var75.method1806(false, var73.field3423)) {
                            var73.field3423 = var75;
                            class64.method500(var73, (byte) -117);
                        }
                        if (var73.field3305 == -1) {
                            class53.method425(var73.field3342, false);
                        }
                        continue;
                    }
                    if (var514 == 1113) {
                        var6--;
                        var73.field3315 = class98.field1751[var6];
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1114) {
                        var6 -= 3;
                        var73.field3381 = class98.field1751[var6];
                        var73.field3319 = class98.field1751[var6 + 1];
                        var73.field3354 = class98.field1751[var6 + 2];
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1115) {
                        var6--;
                        var73.field3376 = class98.field1751[var6] == 1;
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1116) {
                        var6--;
                        var73.field3419 = class98.field1751[var6];
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1117) {
                        var6--;
                        var73.field3411 = class98.field1751[var6];
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1118) {
                        var6--;
                        var73.field3324 = class98.field1751[var6] == 1;
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1119) {
                        var6--;
                        var73.field3378 = class98.field1751[var6] == 1;
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1120) {
                        var6 -= 2;
                        var73.field3407 = class98.field1751[var6];
                        var73.field3393 = class98.field1751[var6 + 1];
                        class64.method500(var73, (byte) -117);
                        if (var73.field3467 == 0) {
                            class90.method675(false, var73, -1);
                        }
                        continue;
                    }
                    if (var514 == 1121) {
                        var6 -= 2;
                        var73.field3320 = (short) class98.field1751[var6];
                        var73.field3441 = (short) class98.field1751[var6 + 1];
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1122) {
                        var6--;
                        var73.field3406 = class98.field1751[var6] == 1;
                        class64.method500(var73, (byte) -117);
                        continue;
                    }
                    if (var514 == 1123) {
                        var6--;
                        var73.field3450 = class98.field1751[var6];
                        class64.method500(var73, (byte) -117);
                        if (var73.field3305 == -1) {
                            class88.method651(var73.field3342, (byte) -125);
                        }
                        continue;
                    }
                } else if (var514 >= 1200 && var514 < 1300 || var514 >= 2200 && var514 < 2300) {
                    class188 var504;
                    if (var514 < 2000) {
                        var504 = var46 ? class192.field3509 : class86.field1566;
                    } else {
                        var6--;
                        var504 = class182.method1335((byte) 118, class98.field1751[var6]);
                        var514 -= 1000;
                    }
                    class64.method500(var504, (byte) -117);
                    if (var514 == 1200 || var514 == 1205) {
                        var6 -= 2;
                        int var505 = class98.field1751[var6 + 1];
                        int var506 = class98.field1751[var6];
                        if (var504.field3305 == -1) {
                            class13.method75(-4210, var504.field3342);
                            class88.method651(var504.field3342, (byte) -114);
                            class155.method1155(var504.field3342, false);
                        }
                        if (var506 == -1) {
                            var504.field3326 = -1;
                            var504.field3434 = 1;
                            var504.field3306 = -1;
                        } else {
                            var504.field3430 = var505;
                            var504.field3326 = var506;
                            class36 var507 = class254.method1753(var506, true);
                            var504.field3313 = var507.field597;
                            var504.field3317 = var507.field575;
                            var504.field3450 = var507.field626;
                            var504.field3353 = var507.field622;
                            if (var504.field3335 > 0) {
                                var504.field3450 = var504.field3450 * 32 / var504.field3335;
                            } else if (var504.field3364 > 0) {
                                var504.field3450 = var504.field3450 * 32 / var504.field3364;
                            }
                            if (var514 == 1205) {
                                var504.field3365 = false;
                            } else {
                                var504.field3365 = true;
                            }
                            var504.field3395 = var507.field607;
                            var504.field3466 = var507.field566;
                        }
                        continue;
                    }
                    if (var514 == 1201) {
                        var504.field3434 = 2;
                        var6--;
                        var504.field3306 = class98.field1751[var6];
                        if (var504.field3305 == -1) {
                            class252.method1694(var504.field3342, (byte) 101);
                        }
                        continue;
                    }
                    if (var514 == 1202) {
                        var504.field3434 = 3;
                        var504.field3306 = class121.field2124.field2552.method388((byte) -31);
                        if (var504.field3305 == -1) {
                            class252.method1694(var504.field3342, (byte) -115);
                        }
                        continue;
                    }
                    if (var514 == 1203) {
                        var504.field3434 = 6;
                        var6--;
                        var504.field3306 = class98.field1751[var6];
                        if (var504.field3305 == -1) {
                            class252.method1694(var504.field3342, (byte) 39);
                        }
                        continue;
                    }
                    if (var514 == 1204) {
                        var504.field3434 = 5;
                        var6--;
                        var504.field3306 = class98.field1751[var6];
                        if (var504.field3305 == -1) {
                            class252.method1694(var504.field3342, (byte) 83);
                        }
                        continue;
                    }
                } else if (var514 >= 1300 && var514 < 1400 || var514 >= 2300 && var514 < 2400) {
                    class188 var76;
                    if (var514 >= 2000) {
                        var514 -= 1000;
                        var6--;
                        var76 = class182.method1335((byte) 113, class98.field1751[var6]);
                    } else {
                        var76 = var46 ? class192.field3509 : class86.field1566;
                    }
                    if (var514 == 1300) {
                        var6--;
                        int var77 = class98.field1751[var6] - 1;
                        if (var77 >= 0 && var77 <= 9) {
                            var7--;
                            var76.method1364(class7.field115[var7], var77, (byte) -109);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var514 == 1301) {
                        var6 -= 2;
                        int var78 = class98.field1751[var6];
                        int var79 = class98.field1751[var6 + 1];
                        var76.field3460 = client.method832(var78, 25767, var79);
                        continue;
                    }
                    if (var514 == 1302) {
                        var6--;
                        var76.field3436 = class98.field1751[var6] == 1;
                        continue;
                    }
                    if (var514 == 1303) {
                        var6--;
                        var76.field3415 = class98.field1751[var6];
                        continue;
                    }
                    if (var514 == 1304) {
                        var6--;
                        var76.field3334 = class98.field1751[var6];
                        continue;
                    }
                    if (var514 == 1305) {
                        var7--;
                        var76.field3379 = class7.field115[var7];
                        continue;
                    }
                    if (var514 == 1306) {
                        var7--;
                        var76.field3412 = class7.field115[var7];
                        continue;
                    }
                    if (var514 == 1307) {
                        var76.field3341 = null;
                        continue;
                    }
                    if (var514 == 1309) {
                        var6--;
                        int var80 = class98.field1751[var6];
                        var6--;
                        int var81 = class98.field1751[var6];
                        if (var81 >= 1 && var81 <= 10) {
                            var76.method1370(var80, (byte) -45, var81 - 1);
                        }
                        continue;
                    }
                } else {
                    if (var514 >= 1400 && var514 < 1500 || var514 >= 2400 && var514 < 2500) {
                        class188 var497;
                        if (var514 >= 2000) {
                            var6--;
                            var497 = class182.method1335((byte) 103, class98.field1751[var6]);
                            var514 -= 1000;
                        } else {
                            var497 = var46 ? class192.field3509 : class86.field1566;
                        }
                        var7--;
                        class256 var498 = class7.field115[var7];
                        int[] var499 = null;
                        if (var498.method1799(127) > 0 && var498.method1786(-751, var498.method1799(127) - 1) == 89) {
                            var6--;
                            int var500 = class98.field1751[var6];
                            if (var500 > 0) {
                                var499 = new int[var500];
                                while (var500-- > 0) {
                                    var6--;
                                    var499[var500] = class98.field1751[var6];
                                }
                            }
                            var498 = var498.method1777(var498.method1799(127) - 1, 25163, 0);
                        }
                        Object[] var501 = new Object[var498.method1799(arg1 ^ 0xFFFFF5AC) + 1];
                        for (int var502 = var501.length - 1; var502 >= 1; var502--) {
                            if (var498.method1786(-751, var502 - 1) == 115) {
                                var7--;
                                var501[var502] = class7.field115[var7];
                            } else {
                                var6--;
                                var501[var502] = Integer.valueOf(class98.field1751[var6]);
                            }
                        }
                        var6--;
                        int var503 = class98.field1751[var6];
                        if (var503 == -1) {
                            var501 = null;
                        } else {
                            var501[0] = Integer.valueOf(var503);
                        }
                        var497.field3453 = true;
                        if (var514 == 1400) {
                            var497.field3382 = var501;
                        } else if (var514 == 1401) {
                            var497.field3443 = var501;
                        } else if (var514 == 1402) {
                            var497.field3349 = var501;
                        } else if (var514 == 1403) {
                            var497.field3451 = var501;
                        } else if (var514 == 1404) {
                            var497.field3338 = var501;
                        } else if (var514 == 1405) {
                            var497.field3420 = var501;
                        } else if (var514 == 1406) {
                            var497.field3329 = var501;
                        } else if (var514 == 1407) {
                            var497.field3328 = var499;
                            var497.field3424 = var501;
                        } else if (var514 == 1408) {
                            var497.field3377 = var501;
                        } else if (var514 == 1409) {
                            var497.field3410 = var501;
                        } else if (var514 == 1410) {
                            var497.field3448 = var501;
                        } else if (var514 == 1411) {
                            var497.field3449 = var501;
                        } else if (var514 == 1412) {
                            var497.field3465 = var501;
                        } else if (var514 == 1414) {
                            var497.field3397 = var499;
                            var497.field3438 = var501;
                        } else if (var514 == 1415) {
                            var497.field3316 = var499;
                            var497.field3385 = var501;
                        } else if (var514 == 1416) {
                            var497.field3421 = var501;
                        } else if (var514 == 1417) {
                            var497.field3361 = var501;
                        } else if (var514 == 1418) {
                            var497.field3452 = var501;
                        } else if (var514 == 1419) {
                            var497.field3375 = var501;
                        } else if (var514 == 1420) {
                            var497.field3321 = var501;
                        } else if (var514 == 1421) {
                            var497.field3366 = var501;
                        } else if (var514 == 1422) {
                            var497.field3346 = var501;
                        } else if (var514 == 1423) {
                            var497.field3363 = var501;
                        } else if (var514 == 1424) {
                            var497.field3322 = var501;
                        } else if (var514 == 1425) {
                            var497.field3325 = var501;
                        } else if (var514 == 1426) {
                            var497.field3344 = var501;
                        } else if (var514 == 1427) {
                            var497.field3454 = var501;
                        } else if (var514 == 1428) {
                            var497.field3439 = var501;
                            var497.field3401 = var499;
                        } else if (var514 == 1429) {
                            var497.field3387 = var501;
                            var497.field3308 = var499;
                        }
                        continue;
                    }
                    if (var514 < 1600) {
                        class188 var82 = var46 ? class192.field3509 : class86.field1566;
                        if (var514 == 1500) {
                            class98.field1751[var6++] = var82.field3400;
                            continue;
                        }
                        if (var514 == 1501) {
                            class98.field1751[var6++] = var82.field3333;
                            continue;
                        }
                        if (var514 == 1502) {
                            class98.field1751[var6++] = var82.field3391;
                            continue;
                        }
                        if (var514 == 1503) {
                            class98.field1751[var6++] = var82.field3343;
                            continue;
                        }
                        if (var514 == 1504) {
                            class98.field1751[var6++] = var82.field3418 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 1505) {
                            class98.field1751[var6++] = var82.field3468;
                            continue;
                        }
                    } else if (var514 < 1700) {
                        class188 var496 = var46 ? class192.field3509 : class86.field1566;
                        if (var514 == 1600) {
                            class98.field1751[var6++] = var496.field3442;
                            continue;
                        }
                        if (var514 == 1601) {
                            class98.field1751[var6++] = var496.field3463;
                            continue;
                        }
                        if (var514 == 1602) {
                            class7.field115[var7++] = var496.field3423;
                            continue;
                        }
                        if (var514 == 1603) {
                            class98.field1751[var6++] = var496.field3407;
                            continue;
                        }
                        if (var514 == 1604) {
                            class98.field1751[var6++] = var496.field3393;
                            continue;
                        }
                        if (var514 == 1605) {
                            class98.field1751[var6++] = var496.field3450;
                            continue;
                        }
                        if (var514 == 1606) {
                            class98.field1751[var6++] = var496.field3353;
                            continue;
                        }
                        if (var514 == 1607) {
                            class98.field1751[var6++] = var496.field3466;
                            continue;
                        }
                        if (var514 == 1608) {
                            class98.field1751[var6++] = var496.field3313;
                            continue;
                        }
                        if (var514 == 1609) {
                            class98.field1751[var6++] = var496.field3307;
                            continue;
                        }
                        if (var514 == 1610) {
                            class98.field1751[var6++] = var496.field3317;
                            continue;
                        }
                        if (var514 == 1611) {
                            class98.field1751[var6++] = var496.field3395;
                            continue;
                        }
                        if (var514 == 1612) {
                            class98.field1751[var6++] = var496.field3425;
                            continue;
                        }
                    } else if (var514 < 1800) {
                        class188 var495 = var46 ? class192.field3509 : class86.field1566;
                        if (var514 == 1700) {
                            class98.field1751[var6++] = var495.field3326;
                            continue;
                        }
                        if (var514 == 1701) {
                            if (var495.field3326 == -1) {
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var495.field3430;
                            }
                            continue;
                        }
                        if (var514 == 1702) {
                            class98.field1751[var6++] = var495.field3305;
                            continue;
                        }
                    } else if (var514 < 1900) {
                        class188 var83 = var46 ? class192.field3509 : class86.field1566;
                        if (var514 == 1800) {
                            class98.field1751[var6++] = class257.method1813(false, client.method828(var83));
                            continue;
                        }
                        if (var514 == 1801) {
                            var6--;
                            int var84 = class98.field1751[var6];
                            int var515 = var84 - 1;
                            if (var83.field3341 != null && var83.field3341.length > var515 && var83.field3341[var515] != null) {
                                class7.field115[var7++] = var83.field3341[var515];
                                continue;
                            }
                            class7.field115[var7++] = class34.field531;
                            continue;
                        }
                        if (var514 == 1802) {
                            if (var83.field3379 == null) {
                                class7.field115[var7++] = class34.field531;
                            } else {
                                class7.field115[var7++] = var83.field3379;
                            }
                            continue;
                        }
                    } else if (var514 < 2600) {
                        var6--;
                        class188 var494 = class182.method1335((byte) 93, class98.field1751[var6]);
                        if (var514 == 2500) {
                            class98.field1751[var6++] = var494.field3400;
                            continue;
                        }
                        if (var514 == 2501) {
                            class98.field1751[var6++] = var494.field3333;
                            continue;
                        }
                        if (var514 == 2502) {
                            class98.field1751[var6++] = var494.field3391;
                            continue;
                        }
                        if (var514 == 2503) {
                            class98.field1751[var6++] = var494.field3343;
                            continue;
                        }
                        if (var514 == 2504) {
                            class98.field1751[var6++] = var494.field3418 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 2505) {
                            class98.field1751[var6++] = var494.field3468;
                            continue;
                        }
                    } else if (var514 < 2700) {
                        var6--;
                        class188 var85 = class182.method1335((byte) 126, class98.field1751[var6]);
                        if (var514 == 2600) {
                            class98.field1751[var6++] = var85.field3442;
                            continue;
                        }
                        if (var514 == 2601) {
                            class98.field1751[var6++] = var85.field3463;
                            continue;
                        }
                        if (var514 == 2602) {
                            class7.field115[var7++] = var85.field3423;
                            continue;
                        }
                        if (var514 == 2603) {
                            class98.field1751[var6++] = var85.field3407;
                            continue;
                        }
                        if (var514 == 2604) {
                            class98.field1751[var6++] = var85.field3393;
                            continue;
                        }
                        if (var514 == 2605) {
                            class98.field1751[var6++] = var85.field3450;
                            continue;
                        }
                        if (var514 == 2606) {
                            class98.field1751[var6++] = var85.field3353;
                            continue;
                        }
                        if (var514 == 2607) {
                            class98.field1751[var6++] = var85.field3466;
                            continue;
                        }
                        if (var514 == 2608) {
                            class98.field1751[var6++] = var85.field3313;
                            continue;
                        }
                        if (var514 == 2609) {
                            class98.field1751[var6++] = var85.field3307;
                            continue;
                        }
                        if (var514 == 2610) {
                            class98.field1751[var6++] = var85.field3317;
                            continue;
                        }
                        if (var514 == 2611) {
                            class98.field1751[var6++] = var85.field3395;
                            continue;
                        }
                        if (var514 == 2612) {
                            class98.field1751[var6++] = var85.field3425;
                            continue;
                        }
                    } else if (var514 < 2800) {
                        if (var514 == 2700) {
                            var6--;
                            class188 var484 = class182.method1335((byte) 120, class98.field1751[var6]);
                            class98.field1751[var6++] = var484.field3326;
                            continue;
                        }
                        if (var514 == 2701) {
                            var6--;
                            class188 var485 = class182.method1335((byte) 90, class98.field1751[var6]);
                            if (var485.field3326 == -1) {
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var485.field3430;
                            }
                            continue;
                        }
                        if (var514 == 2702) {
                            var6--;
                            int var486 = class98.field1751[var6];
                            class316 var487 = (class316) class62.field1098.method1744((byte) 126, (long) var486);
                            if (var487 == null) {
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = 1;
                            }
                            continue;
                        }
                        if (var514 == 2703) {
                            var6--;
                            class188 var488 = class182.method1335((byte) 118, class98.field1751[var6]);
                            if (var488.field3368 == null) {
                                class98.field1751[var6++] = 0;
                                continue;
                            }
                            int var489 = var488.field3368.length;
                            for (int var490 = 0; var490 < var488.field3368.length; var490++) {
                                if (var488.field3368[var490] == null) {
                                    var489 = var490;
                                    break;
                                }
                            }
                            class98.field1751[var6++] = var489;
                            continue;
                        }
                        if (var514 == 2704 || var514 == 2705) {
                            var6 -= 2;
                            int var491 = class98.field1751[var6];
                            int var492 = class98.field1751[var6 + 1];
                            class316 var493 = (class316) class62.field1098.method1744((byte) 124, (long) var491);
                            if (var493 != null && var493.field5453 == var492) {
                                class98.field1751[var6++] = 1;
                            } else {
                                class98.field1751[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var514 < 2900) {
                        var6--;
                        class188 var86 = class182.method1335((byte) 105, class98.field1751[var6]);
                        if (var514 == 2800) {
                            class98.field1751[var6++] = class257.method1813(false, client.method828(var86));
                            continue;
                        }
                        if (var514 == 2801) {
                            var6--;
                            int var87 = class98.field1751[var6];
                            int var516 = var87 - 1;
                            if (var86.field3341 != null && var86.field3341.length > var516 && var86.field3341[var516] != null) {
                                class7.field115[var7++] = var86.field3341[var516];
                                continue;
                            }
                            class7.field115[var7++] = class34.field531;
                            continue;
                        }
                        if (var514 == 2802) {
                            if (var86.field3379 == null) {
                                class7.field115[var7++] = class34.field531;
                            } else {
                                class7.field115[var7++] = var86.field3379;
                            }
                            continue;
                        }
                    } else if (var514 < 3200) {
                        if (var514 == 3100) {
                            var7--;
                            class256 var88 = class7.field115[var7];
                            class274.method1895(0, 22156, class34.field531, var88);
                            continue;
                        }
                        if (var514 == 3101) {
                            var6 -= 2;
                            class164.method1207(class98.field1751[var6 + 1], -25800, class98.field1751[var6], class121.field2124);
                            continue;
                        }
                        if (var514 == 3103) {
                            class64.method499((byte) -106);
                            continue;
                        }
                        if (var514 == 3104) {
                            var7--;
                            class256 var89 = class7.field115[var7];
                            class213.field3808++;
                            int var90 = 0;
                            if (var89.method1785(false)) {
                                var90 = var89.method1770(0);
                            }
                            class308.field5322.method1599(234, (byte) 125);
                            class308.field5322.method365((byte) -32, var90);
                            continue;
                        }
                        if (var514 == 3105) {
                            class116.field2038++;
                            var7--;
                            class256 var91 = class7.field115[var7];
                            class308.field5322.method1599(253, (byte) -28);
                            class308.field5322.method330(255, var91.method1780(true));
                            continue;
                        }
                        if (var514 == 3106) {
                            var7--;
                            class256 var92 = class7.field115[var7];
                            class308.field5322.method1599(58, (byte) 82);
                            class260.field4497++;
                            class308.field5322.method308(var92.method1799(arg1 ^ 0xFFFFF5AC) + 1, -2);
                            class308.field5322.method361(var92, 0);
                            continue;
                        }
                        if (var514 == 3107) {
                            var6--;
                            int var93 = class98.field1751[var6];
                            var7--;
                            class256 var94 = class7.field115[var7];
                            class58.method459(var93, 3, var94);
                            continue;
                        }
                        if (var514 == 3108) {
                            var6 -= 3;
                            int var95 = class98.field1751[var6];
                            int var96 = class98.field1751[var6 + 2];
                            int var97 = class98.field1751[var6 + 1];
                            class188 var98 = class182.method1335((byte) 120, var96);
                            class102.method734(var95, var97, -5779, var98);
                            continue;
                        }
                        if (var514 == 3109) {
                            var6 -= 2;
                            int var99 = class98.field1751[var6];
                            int var100 = class98.field1751[var6 + 1];
                            class188 var101 = var46 ? class192.field3509 : class86.field1566;
                            class102.method734(var99, var100, -5779, var101);
                            continue;
                        }
                        if (var514 == 3110) {
                            class111.field1938++;
                            var6--;
                            int var102 = class98.field1751[var6];
                            class308.field5322.method1599(167, (byte) -68);
                            class308.field5322.method366(var102, -97);
                            continue;
                        }
                    } else if (var514 < 3300) {
                        if (var514 == 3200) {
                            var6 -= 3;
                            class9.method61(class98.field1751[var6], class98.field1751[var6 + 2], class98.field1751[var6 + 1], 24);
                            continue;
                        }
                        if (var514 == 3201) {
                            var6--;
                            class294.method2065(class98.field1751[var6], 22519);
                            continue;
                        }
                        if (var514 == 3202) {
                            var6 -= 2;
                            class248.method1673(class98.field1751[var6 + 1], class98.field1751[var6], arg1 + 2604);
                            continue;
                        }
                    } else if (var514 < 3400) {
                        if (var514 == 3300) {
                            class98.field1751[var6++] = class45.field840;
                            continue;
                        }
                        if (var514 == 3301) {
                            var6 -= 2;
                            int var450 = class98.field1751[var6];
                            int var451 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class11.method70(var451, var450, 2);
                            continue;
                        }
                        if (var514 == 3302) {
                            var6 -= 2;
                            int var452 = class98.field1751[var6];
                            int var453 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class285.method1996(true, var452, var453);
                            continue;
                        }
                        if (var514 == 3303) {
                            var6 -= 2;
                            int var454 = class98.field1751[var6 + 1];
                            int var455 = class98.field1751[var6];
                            class98.field1751[var6++] = class53.method419(var454, var455, (byte) -84);
                            continue;
                        }
                        if (var514 == 3304) {
                            var6--;
                            int var456 = class98.field1751[var6];
                            class98.field1751[var6++] = class146.method1064(var456, class288.method2011(arg1, -1097)).field5112;
                            continue;
                        }
                        if (var514 == 3305) {
                            var6--;
                            int var457 = class98.field1751[var6];
                            class98.field1751[var6++] = class14.field188[var457];
                            continue;
                        }
                        if (var514 == 3306) {
                            var6--;
                            int var458 = class98.field1751[var6];
                            class98.field1751[var6++] = class17.field240[var458];
                            continue;
                        }
                        if (var514 == 3307) {
                            var6--;
                            int var459 = class98.field1751[var6];
                            class98.field1751[var6++] = class30.field475[var459];
                            continue;
                        }
                        if (var514 == 3308) {
                            int var460 = (class121.field2124.field1197 >> 7) + class10.field147;
                            int var461 = class255.field4377;
                            int var462 = (class121.field2124.field1192 >> 7) + class134.field2336;
                            class98.field1751[var6++] = (var461 << 28) + (var462 << 14) + var460;
                            continue;
                        }
                        if (var514 == 3309) {
                            var6--;
                            int var463 = class98.field1751[var6];
                            class98.field1751[var6++] = class150.method1123(16383, var463 >> 14);
                            continue;
                        }
                        if (var514 == 3310) {
                            var6--;
                            int var464 = class98.field1751[var6];
                            class98.field1751[var6++] = var464 >> 28;
                            continue;
                        }
                        if (var514 == 3311) {
                            var6--;
                            int var465 = class98.field1751[var6];
                            class98.field1751[var6++] = class150.method1123(16383, var465);
                            continue;
                        }
                        if (var514 == 3312) {
                            class98.field1751[var6++] = class21.field278 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3313) {
                            var6 -= 2;
                            int var466 = class98.field1751[var6] + 32768;
                            int var467 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class11.method70(var467, var466, 2);
                            continue;
                        }
                        if (var514 == 3314) {
                            var6 -= 2;
                            int var468 = class98.field1751[var6 + 1];
                            int var469 = class98.field1751[var6] + 32768;
                            class98.field1751[var6++] = class285.method1996(true, var469, var468);
                            continue;
                        }
                        if (var514 == 3315) {
                            var6 -= 2;
                            int var470 = class98.field1751[var6] + 32768;
                            int var471 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class53.method419(var471, var470, (byte) -76);
                            continue;
                        }
                        if (var514 == 3316) {
                            if (class106.field1896 >= 2) {
                                class98.field1751[var6++] = class106.field1896;
                            } else {
                                class98.field1751[var6++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 3317) {
                            class98.field1751[var6++] = class15.field194;
                            continue;
                        }
                        if (var514 == 3318) {
                            class98.field1751[var6++] = class240.field4089;
                            continue;
                        }
                        if (var514 == 3321) {
                            class98.field1751[var6++] = class121.field2128;
                            continue;
                        }
                        if (var514 == 3322) {
                            class98.field1751[var6++] = class270.field4616;
                            continue;
                        }
                        if (var514 == 3323) {
                            if (class138.field2408 >= 5 && class138.field2408 <= 9) {
                                class98.field1751[var6++] = 1;
                                continue;
                            }
                            class98.field1751[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3324) {
                            if (class138.field2408 >= 5 && class138.field2408 <= 9) {
                                class98.field1751[var6++] = class138.field2408;
                                continue;
                            }
                            class98.field1751[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3325) {
                            class98.field1751[var6++] = class78.field1463 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3326) {
                            class98.field1751[var6++] = class121.field2124.field2549;
                            continue;
                        }
                        if (var514 == 3327) {
                            class98.field1751[var6++] = class121.field2124.field2552.field892 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3328) {
                            class98.field1751[var6++] = class36.field649 && !class316.field5454 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3329) {
                            class98.field1751[var6++] = class154.field2759 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3330) {
                            var6--;
                            int var472 = class98.field1751[var6];
                            class98.field1751[var6++] = class50.method402(class288.method2011(arg1, 2650), var472);
                            continue;
                        }
                        if (var514 == 3331) {
                            var6 -= 2;
                            int var473 = class98.field1751[var6];
                            int var474 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class152.method1139(false, var474, class288.method2011(arg1, 6160), var473);
                            continue;
                        }
                        if (var514 == 3332) {
                            var6 -= 2;
                            int var475 = class98.field1751[var6 + 1];
                            int var476 = class98.field1751[var6];
                            class98.field1751[var6++] = class152.method1139(true, var475, -4669, var476);
                            continue;
                        }
                        if (var514 == 3333) {
                            class98.field1751[var6++] = class203.field3668;
                            continue;
                        }
                        if (var514 == 3335) {
                            class98.field1751[var6++] = class204.field3699;
                            continue;
                        }
                        if (var514 == 3336) {
                            var6 -= 4;
                            int var477 = class98.field1751[var6];
                            int var478 = class98.field1751[var6 + 2];
                            int var479 = class98.field1751[var6 + 1];
                            int var480 = (var479 << 14) + var477;
                            int var481 = (var478 << 28) + var480;
                            int var482 = class98.field1751[var6 + 3];
                            int var483 = var481 + var482;
                            class98.field1751[var6++] = var483;
                            continue;
                        }
                        if (var514 == 3337) {
                            class98.field1751[var6++] = class7.field107;
                            continue;
                        }
                    } else if (var514 < 3500) {
                        if (var514 == 3400) {
                            var6 -= 2;
                            int var103 = class98.field1751[var6];
                            int var104 = class98.field1751[var6 + 1];
                            class292 var105 = class137.method990(arg1 ^ 0xFFFFDD39, var103);
                            if (var105.field5047 == 115) {
                            }
                            class7.field115[var7++] = var105.method2029(var104, -64);
                            continue;
                        }
                        if (var514 == 3408) {
                            var6 -= 4;
                            int var106 = class98.field1751[var6 + 1];
                            int var107 = class98.field1751[var6 + 2];
                            int var108 = class98.field1751[var6];
                            int var109 = class98.field1751[var6 + 3];
                            class292 var110 = class137.method990(10474, var107);
                            if (var110.field5037 == var108 && var110.field5047 == var106) {
                                if (var106 == 115) {
                                    class7.field115[var7++] = var110.method2029(var109, class288.method2011(arg1, 2579));
                                } else {
                                    class98.field1751[var6++] = var110.method2024(var109, 10288);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var514 == 3409) {
                            var6 -= 3;
                            int var111 = class98.field1751[var6];
                            int var112 = class98.field1751[var6 + 1];
                            int var113 = class98.field1751[var6 + 2];
                            if (var112 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class292 var114 = class137.method990(10474, var112);
                            if (var114.field5047 != var111) {
                                throw new RuntimeException("C3409-1");
                            }
                            class98.field1751[var6++] = var114.method2026(var113, (byte) -94) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3410) {
                            var7--;
                            class256 var115 = class7.field115[var7];
                            var6--;
                            int var116 = class98.field1751[var6];
                            if (var116 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class292 var117 = class137.method990(10474, var116);
                            if (var117.field5047 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class98.field1751[var6++] = var117.method2025(var115, 1) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3411) {
                            var6--;
                            int var118 = class98.field1751[var6];
                            class292 var119 = class137.method990(10474, var118);
                            class98.field1751[var6++] = var119.field5035.method1745(0);
                            continue;
                        }
                    } else if (var514 < 3700) {
                        if (var514 == 3600) {
                            if (class166.field2946 == 0) {
                                class98.field1751[var6++] = -2;
                            } else if (class166.field2946 == 1) {
                                class98.field1751[var6++] = -1;
                            } else {
                                class98.field1751[var6++] = class311.field5358;
                            }
                            continue;
                        }
                        if (var514 == 3601) {
                            var6--;
                            int var120 = class98.field1751[var6];
                            if (class166.field2946 == 2 && class311.field5358 > var120) {
                                class7.field115[var7++] = class124.field2203[var120];
                                continue;
                            }
                            class7.field115[var7++] = class34.field531;
                            continue;
                        }
                        if (var514 == 3602) {
                            var6--;
                            int var121 = class98.field1751[var6];
                            if (class166.field2946 == 2 && var121 < class311.field5358) {
                                class98.field1751[var6++] = class68.field1261[var121];
                                continue;
                            }
                            class98.field1751[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3603) {
                            var6--;
                            int var122 = class98.field1751[var6];
                            if (class166.field2946 == 2 && class311.field5358 > var122) {
                                class98.field1751[var6++] = class273.field4673[var122];
                                continue;
                            }
                            class98.field1751[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3604) {
                            var7--;
                            class256 var123 = class7.field115[var7];
                            var6--;
                            int var124 = class98.field1751[var6];
                            class172.method1250(var124, true, var123);
                            continue;
                        }
                        if (var514 == 3605) {
                            var7--;
                            class256 var125 = class7.field115[var7];
                            class161.method1189((byte) 87, var125.method1780(true));
                            continue;
                        }
                        if (var514 == 3606) {
                            var7--;
                            class256 var126 = class7.field115[var7];
                            class277.method1911(arg1 + 2512, var126.method1780(true));
                            continue;
                        }
                        if (var514 == 3607) {
                            var7--;
                            class256 var127 = class7.field115[var7];
                            class195.method1410(var127.method1780(true), -95);
                            continue;
                        }
                        if (var514 == 3608) {
                            var7--;
                            class256 var128 = class7.field115[var7];
                            class243.method1628(var128.method1780(true), (byte) 126);
                            continue;
                        }
                        if (var514 == 3609) {
                            var7--;
                            class256 var129 = class7.field115[var7];
                            if (var129.method1767((byte) -70, class105.field1876) || var129.method1767((byte) -93, class100.field1777)) {
                                var129 = var129.method1788(arg1 + 28215, 7);
                            }
                            class98.field1751[var6++] = class121.method811(var129, 93) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3610) {
                            var6--;
                            int var130 = class98.field1751[var6];
                            if (class166.field2946 == 2 && var130 < class311.field5358) {
                                class7.field115[var7++] = class35.field565[var130];
                                continue;
                            }
                            class7.field115[var7++] = class34.field531;
                            continue;
                        }
                        if (var514 == 3611) {
                            if (class216.field3841 == null) {
                                class7.field115[var7++] = class34.field531;
                            } else {
                                class7.field115[var7++] = class216.field3841.method1761(7);
                            }
                            continue;
                        }
                        if (var514 == 3612) {
                            if (class216.field3841 == null) {
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = class206.field3733;
                            }
                            continue;
                        }
                        if (var514 == 3613) {
                            var6--;
                            int var131 = class98.field1751[var6];
                            if (class216.field3841 != null && class206.field3733 > var131) {
                                class7.field115[var7++] = class284.field4914[var131].field3246.method1761(19);
                                continue;
                            }
                            class7.field115[var7++] = class34.field531;
                            continue;
                        }
                        if (var514 == 3614) {
                            var6--;
                            int var132 = class98.field1751[var6];
                            if (class216.field3841 != null && var132 < class206.field3733) {
                                class98.field1751[var6++] = class284.field4914[var132].field3245;
                                continue;
                            }
                            class98.field1751[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3615) {
                            var6--;
                            int var133 = class98.field1751[var6];
                            if (class216.field3841 != null && class206.field3733 > var133) {
                                class98.field1751[var6++] = class284.field4914[var133].field3249;
                                continue;
                            }
                            class98.field1751[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3616) {
                            class98.field1751[var6++] = class51.field936;
                            continue;
                        }
                        if (var514 == 3617) {
                            var7--;
                            class256 var134 = class7.field115[var7];
                            class115.method787(113, var134);
                            continue;
                        }
                        if (var514 == 3618) {
                            class98.field1751[var6++] = class246.field4181;
                            continue;
                        }
                        if (var514 == 3619) {
                            var7--;
                            class256 var135 = class7.field115[var7];
                            class170.method1242(var135.method1780(true), -103);
                            continue;
                        }
                        if (var514 == 3620) {
                            class302.method2108(0);
                            continue;
                        }
                        if (var514 == 3621) {
                            if (class166.field2946 == 0) {
                                class98.field1751[var6++] = -1;
                            } else {
                                class98.field1751[var6++] = class129.field2263;
                            }
                            continue;
                        }
                        if (var514 == 3622) {
                            var6--;
                            int var136 = class98.field1751[var6];
                            if (class166.field2946 != 0 && var136 < class129.field2263) {
                                class7.field115[var7++] = class290.method2018(7130, class62.field1090[var136]).method1761(class288.method2011(arg1, -2654));
                                continue;
                            }
                            class7.field115[var7++] = class34.field531;
                            continue;
                        }
                        if (var514 == 3623) {
                            var7--;
                            class256 var137 = class7.field115[var7];
                            if (var137.method1767((byte) -128, class105.field1876) || var137.method1767((byte) -107, class100.field1777)) {
                                var137 = var137.method1788(25610, 7);
                            }
                            class98.field1751[var6++] = class195.method1409(var137, true) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3624) {
                            var6--;
                            int var138 = class98.field1751[var6];
                            if (class284.field4914 != null && class206.field3733 > var138 && class284.field4914[var138].field3246.method1769(class121.field2124.field2532, (byte) 86)) {
                                class98.field1751[var6++] = 1;
                                continue;
                            }
                            class98.field1751[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3625) {
                            if (class8.field130 == null) {
                                class7.field115[var7++] = class34.field531;
                            } else {
                                class7.field115[var7++] = class8.field130.method1761(arg1 + 2680);
                            }
                            continue;
                        }
                        if (var514 == 3626) {
                            var6--;
                            int var139 = class98.field1751[var6];
                            if (class216.field3841 != null && class206.field3733 > var139) {
                                class7.field115[var7++] = class284.field4914[var139].field3239;
                                continue;
                            }
                            class7.field115[var7++] = class34.field531;
                            continue;
                        }
                        if (var514 == 3627) {
                            var6--;
                            int var140 = class98.field1751[var6];
                            if (class166.field2946 == 2 && var140 >= 0 && class311.field5358 > var140) {
                                class98.field1751[var6++] = class53.field979[var140] ? 1 : 0;
                                continue;
                            }
                            class98.field1751[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3628) {
                            var7--;
                            class256 var141 = class7.field115[var7];
                            if (var141.method1767((byte) -42, class105.field1876) || var141.method1767((byte) -73, class100.field1777)) {
                                var141 = var141.method1788(25610, 7);
                            }
                            class98.field1751[var6++] = class278.method1924(var141, -1);
                            continue;
                        }
                        if (var514 == 3629) {
                            class98.field1751[var6++] = class111.field1948;
                            continue;
                        }
                    } else if (var514 < 4000) {
                        if (var514 == 3903) {
                            var6--;
                            int var436 = class98.field1751[var6];
                            class98.field1751[var6++] = class229.field3931[var436].method1122(true);
                            continue;
                        }
                        if (var514 == 3904) {
                            var6--;
                            int var437 = class98.field1751[var6];
                            class98.field1751[var6++] = class229.field3931[var437].field2673;
                            continue;
                        }
                        if (var514 == 3905) {
                            var6--;
                            int var438 = class98.field1751[var6];
                            class98.field1751[var6++] = class229.field3931[var438].field2670;
                            continue;
                        }
                        if (var514 == 3906) {
                            var6--;
                            int var439 = class98.field1751[var6];
                            class98.field1751[var6++] = class229.field3931[var439].field2675;
                            continue;
                        }
                        if (var514 == 3907) {
                            var6--;
                            int var440 = class98.field1751[var6];
                            class98.field1751[var6++] = class229.field3931[var440].field2679;
                            continue;
                        }
                        if (var514 == 3908) {
                            var6--;
                            int var441 = class98.field1751[var6];
                            class98.field1751[var6++] = class229.field3931[var441].field2674;
                            continue;
                        }
                        if (var514 == 3910) {
                            var6--;
                            int var442 = class98.field1751[var6];
                            int var443 = class229.field3931[var442].method1120(7);
                            class98.field1751[var6++] = var443 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3911) {
                            var6--;
                            int var444 = class98.field1751[var6];
                            int var445 = class229.field3931[var444].method1120(7);
                            class98.field1751[var6++] = var445 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3912) {
                            var6--;
                            int var446 = class98.field1751[var6];
                            int var447 = class229.field3931[var446].method1120(7);
                            class98.field1751[var6++] = var447 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3913) {
                            var6--;
                            int var448 = class98.field1751[var6];
                            int var449 = class229.field3931[var448].method1120(7);
                            class98.field1751[var6++] = var449 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var514 < 4100) {
                        if (var514 == 4000) {
                            var6 -= 2;
                            int var142 = class98.field1751[var6];
                            int var143 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = var142 + var143;
                            continue;
                        }
                        if (var514 == 4001) {
                            var6 -= 2;
                            int var144 = class98.field1751[var6];
                            int var145 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = var144 - var145;
                            continue;
                        }
                        if (var514 == 4002) {
                            var6 -= 2;
                            int var146 = class98.field1751[var6];
                            int var147 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = var146 * var147;
                            continue;
                        }
                        if (var514 == 4003) {
                            var6 -= 2;
                            int var148 = class98.field1751[var6 + 1];
                            int var149 = class98.field1751[var6];
                            class98.field1751[var6++] = var149 / var148;
                            continue;
                        }
                        if (var514 == 4004) {
                            var6--;
                            int var150 = class98.field1751[var6];
                            class98.field1751[var6++] = (int) (Math.random() * (double) var150);
                            continue;
                        }
                        if (var514 == 4005) {
                            var6--;
                            int var151 = class98.field1751[var6];
                            class98.field1751[var6++] = (int) ((double) (var151 + 1) * Math.random());
                            continue;
                        }
                        if (var514 == 4006) {
                            var6 -= 5;
                            int var152 = class98.field1751[var6];
                            int var153 = class98.field1751[var6 + 1];
                            int var154 = class98.field1751[var6 + 3];
                            int var155 = class98.field1751[var6 + 2];
                            int var156 = class98.field1751[var6 + 4];
                            class98.field1751[var6++] = (var156 - var155) * (var153 - var152) / (var154 - var155) + var152;
                            continue;
                        }
                        if (var514 == 4007) {
                            var6 -= 2;
                            long var157 = (long) class98.field1751[var6];
                            long var159 = (long) class98.field1751[var6 + 1];
                            class98.field1751[var6++] = (int) (var157 * var159 / 100L + var157);
                            continue;
                        }
                        if (var514 == 4008) {
                            var6 -= 2;
                            int var161 = class98.field1751[var6];
                            int var162 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class100.method721(0x1 << var162, var161);
                            continue;
                        }
                        if (var514 == 4009) {
                            var6 -= 2;
                            int var163 = class98.field1751[var6];
                            int var164 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class150.method1123(var163, -(0x1 << var164) - 1);
                            continue;
                        }
                        if (var514 == 4010) {
                            var6 -= 2;
                            int var165 = class98.field1751[var6 + 1];
                            int var166 = class98.field1751[var6];
                            class98.field1751[var6++] = class150.method1123(0x1 << var165, var166) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var514 == 4011) {
                            var6 -= 2;
                            int var167 = class98.field1751[var6];
                            int var168 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = var167 % var168;
                            continue;
                        }
                        if (var514 == 4012) {
                            var6 -= 2;
                            int var169 = class98.field1751[var6 + 1];
                            int var170 = class98.field1751[var6];
                            if (var170 == 0) {
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = (int) Math.pow((double) var170, (double) var169);
                            }
                            continue;
                        }
                        if (var514 == 4013) {
                            var6 -= 2;
                            int var171 = class98.field1751[var6 + 1];
                            int var172 = class98.field1751[var6];
                            if (var172 == 0) {
                                class98.field1751[var6++] = 0;
                            } else if (var171 == 0) {
                                class98.field1751[var6++] = Integer.MAX_VALUE;
                            } else {
                                class98.field1751[var6++] = (int) Math.pow((double) var172, 1.0D / (double) var171);
                            }
                            continue;
                        }
                        if (var514 == 4014) {
                            var6 -= 2;
                            int var173 = class98.field1751[var6];
                            int var174 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class150.method1123(var173, var174);
                            continue;
                        }
                        if (var514 == 4015) {
                            var6 -= 2;
                            int var175 = class98.field1751[var6 + 1];
                            int var176 = class98.field1751[var6];
                            class98.field1751[var6++] = class100.method721(var175, var176);
                            continue;
                        }
                        if (var514 == 4016) {
                            var6 -= 2;
                            int var177 = class98.field1751[var6];
                            int var178 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = var177 < var178 ? var177 : var178;
                            continue;
                        }
                        if (var514 == 4017) {
                            var6 -= 2;
                            int var179 = class98.field1751[var6];
                            int var180 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = var179 > var180 ? var179 : var180;
                            continue;
                        }
                        if (var514 == 4018) {
                            var6 -= 3;
                            long var181 = (long) class98.field1751[var6 + 2];
                            long var183 = (long) class98.field1751[var6];
                            long var185 = (long) class98.field1751[var6 + 1];
                            class98.field1751[var6++] = (int) (var181 * var183 / var185);
                            continue;
                        }
                    } else if (var514 < 4200) {
                        if (var514 == 4100) {
                            var6--;
                            int var187 = class98.field1751[var6];
                            var7--;
                            class256 var188 = class7.field115[var7];
                            class7.field115[var7++] = class30.method214(new class256[] { var188, class305.method2125((byte) 101, var187) }, class288.method2011(arg1, -32373));
                            continue;
                        }
                        if (var514 == 4101) {
                            var7 -= 2;
                            class256 var189 = class7.field115[var7 + 1];
                            class256 var190 = class7.field115[var7];
                            class7.field115[var7++] = class30.method214(new class256[] { var190, var189 }, 29784);
                            continue;
                        }
                        if (var514 == 4102) {
                            var7--;
                            class256 var191 = class7.field115[var7];
                            var6--;
                            int var192 = class98.field1751[var6];
                            class7.field115[var7++] = class30.method214(new class256[] { var191, class182.method1330(0, var192, true) }, 29784);
                            continue;
                        }
                        if (var514 == 4103) {
                            var7--;
                            class256 var193 = class7.field115[var7];
                            class7.field115[var7++] = var193.method1771(false);
                            continue;
                        }
                        if (var514 == 4104) {
                            var6--;
                            int var194 = class98.field1751[var6];
                            long var195 = ((long) var194 + 11745L) * 86400000L;
                            class84.field1529.setTime(new Date(var195));
                            int var197 = class84.field1529.get(5);
                            int var198 = class84.field1529.get(2);
                            int var199 = class84.field1529.get(1);
                            class7.field115[var7++] = class30.method214(new class256[] { class305.method2125((byte) 124, var197), class64.field1140, class50.field912[var198], class64.field1140, class305.method2125((byte) 99, var199) }, 29784);
                            continue;
                        }
                        if (var514 == 4105) {
                            var7 -= 2;
                            class256 var200 = class7.field115[var7];
                            class256 var201 = class7.field115[var7 + 1];
                            if (class121.field2124.field2552 != null && class121.field2124.field2552.field892) {
                                class7.field115[var7++] = var201;
                                continue;
                            }
                            class7.field115[var7++] = var200;
                            continue;
                        }
                        if (var514 == 4106) {
                            var6--;
                            int var202 = class98.field1751[var6];
                            class7.field115[var7++] = class305.method2125((byte) 77, var202);
                            continue;
                        }
                        if (var514 == 4107) {
                            var7 -= 2;
                            class98.field1751[var6++] = class7.field115[var7].method1791(class7.field115[var7 + 1], (byte) 38);
                            continue;
                        }
                        if (var514 == 4108) {
                            var6 -= 2;
                            var7--;
                            class256 var203 = class7.field115[var7];
                            int var204 = class98.field1751[var6 + 1];
                            int var205 = class98.field1751[var6];
                            class98.field1751[var6++] = class222.method1527(false, var204).method2058(var203, var205);
                            continue;
                        }
                        if (var514 == 4109) {
                            var6 -= 2;
                            var7--;
                            class256 var206 = class7.field115[var7];
                            int var207 = class98.field1751[var6 + 1];
                            int var208 = class98.field1751[var6];
                            class98.field1751[var6++] = class222.method1527(false, var207).method2038(var206, var208);
                            continue;
                        }
                        if (var514 == 4110) {
                            var7 -= 2;
                            class256 var209 = class7.field115[var7];
                            class256 var210 = class7.field115[var7 + 1];
                            var6--;
                            if (class98.field1751[var6] == 1) {
                                class7.field115[var7++] = var209;
                            } else {
                                class7.field115[var7++] = var210;
                            }
                            continue;
                        }
                        if (var514 == 4111) {
                            var7--;
                            class256 var211 = class7.field115[var7];
                            class7.field115[var7++] = class293.method2047(var211);
                            continue;
                        }
                        if (var514 == 4112) {
                            var7--;
                            class256 var212 = class7.field115[var7];
                            var6--;
                            int var213 = class98.field1751[var6];
                            if (var213 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class7.field115[var7++] = var212.method1765(var213, (byte) 109);
                            continue;
                        }
                        if (var514 == 4113) {
                            var6--;
                            int var214 = class98.field1751[var6];
                            class98.field1751[var6++] = class14.method82(-128, var214) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4114) {
                            var6--;
                            int var215 = class98.field1751[var6];
                            class98.field1751[var6++] = class42.method369(1007, var215) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4115) {
                            var6--;
                            int var216 = class98.field1751[var6];
                            class98.field1751[var6++] = class264.method1847((byte) -66, var216) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4116) {
                            var6--;
                            int var217 = class98.field1751[var6];
                            class98.field1751[var6++] = class244.method1639(true, var217) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4117) {
                            var7--;
                            class256 var218 = class7.field115[var7];
                            if (var218 == null) {
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var218.method1799(arg1 + 2732);
                            }
                            continue;
                        }
                        if (var514 == 4118) {
                            var6 -= 2;
                            var7--;
                            class256 var219 = class7.field115[var7];
                            int var220 = class98.field1751[var6];
                            int var221 = class98.field1751[var6 + 1];
                            class7.field115[var7++] = var219.method1777(var221, 25163, var220);
                            continue;
                        }
                        if (var514 == 4119) {
                            var7--;
                            class256 var222 = class7.field115[var7];
                            class256 var223 = class99.method711((byte) -122, var222.method1799(127));
                            boolean var224 = false;
                            for (int var225 = 0; var225 < var222.method1799(127); var225++) {
                                int var226 = var222.method1786(arg1 + 1854, var225);
                                if (var226 == 60) {
                                    var224 = true;
                                } else if (var226 == 62) {
                                    var224 = false;
                                } else if (!var224) {
                                    var223.method1810(var226, arg1 + 2483);
                                }
                            }
                            var223.method1763((byte) -123);
                            class7.field115[var7++] = var223;
                            continue;
                        }
                        if (var514 == 4120) {
                            var6 -= 2;
                            var7--;
                            class256 var227 = class7.field115[var7];
                            int var228 = class98.field1751[var6 + 1];
                            int var229 = class98.field1751[var6];
                            class98.field1751[var6++] = var227.method1803(var229, var228, (byte) 113);
                            continue;
                        }
                        if (var514 == 4121) {
                            var7 -= 2;
                            class256 var230 = class7.field115[var7];
                            var6--;
                            int var231 = class98.field1751[var6];
                            class256 var232 = class7.field115[var7 + 1];
                            class98.field1751[var6++] = var230.method1783(-1, var231, var232);
                            continue;
                        }
                        if (var514 == 4122) {
                            var6--;
                            int var233 = class98.field1751[var6];
                            class98.field1751[var6++] = class144.method1050(class288.method2011(arg1, -2797), var233);
                            continue;
                        }
                        if (var514 == 4123) {
                            var6--;
                            int var234 = class98.field1751[var6];
                            class98.field1751[var6++] = class307.method2137(var234, arg1 + 2482);
                            continue;
                        }
                        if (var514 == 4124) {
                            var6--;
                            boolean var235 = class98.field1751[var6] != 0;
                            var6--;
                            int var236 = class98.field1751[var6];
                            class7.field115[var7++] = class65.method505(0, class204.field3699, (byte) -128, (long) var236, var235);
                            continue;
                        }
                    } else if (var514 < 4300) {
                        if (var514 == 4200) {
                            var6--;
                            int var417 = class98.field1751[var6];
                            class7.field115[var7++] = class254.method1753(var417, true).field591;
                            continue;
                        }
                        if (var514 == 4201) {
                            var6 -= 2;
                            int var418 = class98.field1751[var6];
                            int var419 = class98.field1751[var6 + 1];
                            class36 var420 = class254.method1753(var418, true);
                            if (var419 >= 1 && var419 <= 5 && var420.field600[var419 - 1] != null) {
                                class7.field115[var7++] = var420.field600[var419 - 1];
                                continue;
                            }
                            class7.field115[var7++] = class34.field531;
                            continue;
                        }
                        if (var514 == 4202) {
                            var6 -= 2;
                            int var421 = class98.field1751[var6 + 1];
                            int var422 = class98.field1751[var6];
                            class36 var423 = class254.method1753(var422, true);
                            if (var421 >= 1 && var421 <= 5 && var423.field578[var421 - 1] != null) {
                                class7.field115[var7++] = var423.field578[var421 - 1];
                                continue;
                            }
                            class7.field115[var7++] = class34.field531;
                            continue;
                        }
                        if (var514 == 4203) {
                            var6--;
                            int var424 = class98.field1751[var6];
                            class98.field1751[var6++] = class254.method1753(var424, true).field576;
                            continue;
                        }
                        if (var514 == 4204) {
                            var6--;
                            int var425 = class98.field1751[var6];
                            class98.field1751[var6++] = class254.method1753(var425, true).field595 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4205) {
                            var6--;
                            int var426 = class98.field1751[var6];
                            class36 var427 = class254.method1753(var426, true);
                            if (var427.field579 == -1 && var427.field596 >= 0) {
                                class98.field1751[var6++] = var427.field596;
                                continue;
                            }
                            class98.field1751[var6++] = var426;
                            continue;
                        }
                        if (var514 == 4206) {
                            var6--;
                            int var428 = class98.field1751[var6];
                            class36 var429 = class254.method1753(var428, true);
                            if (var429.field579 >= 0 && var429.field596 >= 0) {
                                class98.field1751[var6++] = var429.field596;
                                continue;
                            }
                            class98.field1751[var6++] = var428;
                            continue;
                        }
                        if (var514 == 4207) {
                            var6--;
                            int var430 = class98.field1751[var6];
                            class98.field1751[var6++] = class254.method1753(var430, true).field590 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4208) {
                            var6 -= 2;
                            int var431 = class98.field1751[var6];
                            int var432 = class98.field1751[var6 + 1];
                            class68 var433 = class48.method387((byte) -55, var432);
                            if (var433.method528(true)) {
                                class7.field115[var7++] = class254.method1753(var431, true).method268(var432, (byte) 3, var433.field1255);
                            } else {
                                class98.field1751[var6++] = class254.method1753(var431, true).method260(var432, var433.field1265, (byte) 60);
                            }
                            continue;
                        }
                        if (var514 == 4210) {
                            var7--;
                            class256 var434 = class7.field115[var7];
                            var6--;
                            int var435 = class98.field1751[var6];
                            class237.method1592(8084, var434, var435 == 1);
                            class98.field1751[var6++] = class63.field1108;
                            continue;
                        }
                        if (var514 == 4211) {
                            if (class301.field5181 != null && class63.field1108 > class44.field832) {
                                class98.field1751[var6++] = class150.method1123(class301.field5181[class44.field832++], 65535);
                                continue;
                            }
                            class98.field1751[var6++] = -1;
                            continue;
                        }
                        if (var514 == 4212) {
                            class44.field832 = 0;
                            continue;
                        }
                    } else if (var514 < 4400) {
                        if (var514 == 4300) {
                            var6 -= 2;
                            int var407 = class98.field1751[var6];
                            int var408 = class98.field1751[var6 + 1];
                            class68 var409 = class48.method387((byte) -55, var408);
                            if (var409.method528(true)) {
                                class7.field115[var7++] = class321.method2230(var407, (byte) -41).method564(var408, var409.field1255, (byte) 127);
                            } else {
                                class98.field1751[var6++] = class321.method2230(var407, (byte) -53).method566(var409.field1265, var408, 0);
                            }
                            continue;
                        }
                        if (var514 == 4301) {
                            var6--;
                            int var410 = class98.field1751[var6];
                            class98.field1751[var6++] = class321.method2230(var410, (byte) -34).field1405;
                            continue;
                        }
                        if (var514 == 4302) {
                            var6--;
                            int var411 = class98.field1751[var6];
                            class98.field1751[var6++] = class321.method2230(var411, (byte) -120).field1403;
                            continue;
                        }
                        if (var514 == 4303) {
                            var6--;
                            int var412 = class98.field1751[var6];
                            class98.field1751[var6++] = class321.method2230(var412, (byte) -47).field1413;
                            continue;
                        }
                        if (var514 == 4304) {
                            var6--;
                            int var413 = class98.field1751[var6];
                            class98.field1751[var6++] = class321.method2230(var413, (byte) -110).field1399;
                            continue;
                        }
                        if (var514 == 4305) {
                            var6--;
                            int var414 = class98.field1751[var6];
                            class98.field1751[var6++] = class321.method2230(var414, (byte) -52).field1369;
                            continue;
                        }
                        if (var514 == 4306) {
                            var6--;
                            int var415 = class98.field1751[var6];
                            class98.field1751[var6++] = class321.method2230(var415, (byte) -40).field1356;
                            continue;
                        }
                        if (var514 == 4307) {
                            var6--;
                            int var416 = class98.field1751[var6];
                            class98.field1751[var6++] = class321.method2230(var416, (byte) -47).field1354;
                            continue;
                        }
                    } else if (var514 < 4500) {
                        if (var514 == 4400) {
                            var6 -= 2;
                            int var237 = class98.field1751[var6];
                            int var238 = class98.field1751[var6 + 1];
                            class68 var239 = class48.method387((byte) -55, var238);
                            if (var239.method528(true)) {
                                class7.field115[var7++] = class271.method1871(122, var237).method1881(var239.field1255, (byte) 60, var238);
                            } else {
                                class98.field1751[var6++] = class271.method1871(class288.method2011(arg1, -2641), var237).method1889(var238, var239.field1265, true);
                            }
                            continue;
                        }
                    } else if (var514 < 4600) {
                        if (var514 == 4500) {
                            var6 -= 2;
                            int var240 = class98.field1751[var6];
                            int var241 = class98.field1751[var6 + 1];
                            class68 var242 = class48.method387((byte) -55, var241);
                            if (var242.method528(true)) {
                                class7.field115[var7++] = class231.method1567(-28080, var240).method376(var241, var242.field1255, (byte) 40);
                            } else {
                                class98.field1751[var6++] = class231.method1567(-28080, var240).method377(var242.field1265, var241, true);
                            }
                            continue;
                        }
                    } else if (var514 < 5100) {
                        if (var514 == 5000) {
                            class98.field1751[var6++] = class267.field4556;
                            continue;
                        }
                        if (var514 == 5001) {
                            var6 -= 3;
                            class246.field4198++;
                            class267.field4556 = class98.field1751[var6];
                            class192.field3523 = class98.field1751[var6 + 1];
                            class114.field2009 = class98.field1751[var6 + 2];
                            class308.field5322.method1599(146, (byte) 73);
                            class308.field5322.method308(class267.field4556, -2);
                            class308.field5322.method308(class192.field3523, -2);
                            class308.field5322.method308(class114.field2009, -2);
                            continue;
                        }
                        if (var514 == 5002) {
                            var7--;
                            class256 var342 = class7.field115[var7];
                            class5.field88++;
                            var6 -= 2;
                            int var343 = class98.field1751[var6 + 1];
                            int var344 = class98.field1751[var6];
                            class308.field5322.method1599(185, (byte) 126);
                            class308.field5322.method330(255, var342.method1780(true));
                            class308.field5322.method308(var344 - 1, arg1 ^ 0xA2D);
                            class308.field5322.method308(var343, arg1 ^ 0xA2D);
                            continue;
                        }
                        if (var514 == 5003) {
                            var6--;
                            int var345 = class98.field1751[var6];
                            class256 var346 = null;
                            if (var345 < 100) {
                                var346 = class102.field1843[var345];
                            }
                            if (var346 == null) {
                                var346 = class34.field531;
                            }
                            class7.field115[var7++] = var346;
                            continue;
                        }
                        if (var514 == 5004) {
                            int var347 = -1;
                            var6--;
                            int var348 = class98.field1751[var6];
                            if (var348 < 100 && class102.field1843[var348] != null) {
                                var347 = class115.field2025[var348];
                            }
                            class98.field1751[var6++] = var347;
                            continue;
                        }
                        if (var514 == 5005) {
                            class98.field1751[var6++] = class192.field3523;
                            continue;
                        }
                        if (var514 == 5008) {
                            var7--;
                            class256 var349 = class7.field115[var7];
                            if (var349.method1767((byte) -79, class72.field1323)) {
                                class148.method1079(3, var349);
                                continue;
                            }
                            if (class106.field1896 == 0 && (class36.field649 && !class316.field5454 || class154.field2759)) {
                                continue;
                            }
                            class74.field1409++;
                            byte var350 = 0;
                            class256 var351 = var349.method1771(false);
                            if (var351.method1767((byte) -94, class267.field4568)) {
                                var350 = 0;
                                var349 = var349.method1788(25610, class267.field4568.method1799(127));
                            } else if (var351.method1767((byte) -78, class115.field2027)) {
                                var349 = var349.method1788(25610, class115.field2027.method1799(127));
                                var350 = 1;
                            } else if (var351.method1767((byte) -113, class6.field101)) {
                                var350 = 2;
                                var349 = var349.method1788(25610, class6.field101.method1799(127));
                            } else if (var351.method1767((byte) -38, class240.field4088)) {
                                var349 = var349.method1788(25610, class240.field4088.method1799(arg1 ^ 0xFFFFF5AC));
                                var350 = 3;
                            } else if (var351.method1767((byte) -107, class198.field3626)) {
                                var349 = var349.method1788(arg1 ^ 0xFFFF91D9, class198.field3626.method1799(127));
                                var350 = 4;
                            } else if (var351.method1767((byte) -75, class54.field987)) {
                                var350 = 5;
                                var349 = var349.method1788(25610, class54.field987.method1799(arg1 ^ 0xFFFFF5AC));
                            } else if (var351.method1767((byte) -45, class267.field4573)) {
                                var349 = var349.method1788(25610, class267.field4573.method1799(127));
                                var350 = 6;
                            } else if (var351.method1767((byte) -46, class200.field3648)) {
                                var349 = var349.method1788(25610, class200.field3648.method1799(127));
                                var350 = 7;
                            } else if (var351.method1767((byte) -83, class166.field2943)) {
                                var350 = 8;
                                var349 = var349.method1788(25610, class166.field2943.method1799(arg1 + 2732));
                            } else if (var351.method1767((byte) -119, class132.field2306)) {
                                var349 = var349.method1788(arg1 + 28215, class132.field2306.method1799(arg1 + 2732));
                                var350 = 9;
                            } else if (var351.method1767((byte) -42, class164.field2915)) {
                                var349 = var349.method1788(25610, class164.field2915.method1799(127));
                                var350 = 10;
                            } else if (var351.method1767((byte) -118, class30.field455)) {
                                var350 = 11;
                                var349 = var349.method1788(25610, class30.field455.method1799(127));
                            } else if (class204.field3699 != 0) {
                                if (var351.method1767((byte) -65, class267.field4557)) {
                                    var350 = 0;
                                    var349 = var349.method1788(25610, class267.field4557.method1799(arg1 ^ 0xFFFFF5AC));
                                } else if (var351.method1767((byte) -39, class115.field2018)) {
                                    var349 = var349.method1788(25610, class115.field2018.method1799(127));
                                    var350 = 1;
                                } else if (var351.method1767((byte) -68, class6.field93)) {
                                    var349 = var349.method1788(25610, class6.field93.method1799(127));
                                    var350 = 2;
                                } else if (var351.method1767((byte) -53, class240.field4085)) {
                                    var350 = 3;
                                    var349 = var349.method1788(25610, class240.field4085.method1799(127));
                                } else if (var351.method1767((byte) -115, class198.field3625)) {
                                    var349 = var349.method1788(25610, class198.field3625.method1799(127));
                                    var350 = 4;
                                } else if (var351.method1767((byte) -32, class54.field993)) {
                                    var350 = 5;
                                    var349 = var349.method1788(25610, class54.field993.method1799(127));
                                } else if (var351.method1767((byte) -74, class267.field4566)) {
                                    var350 = 6;
                                    var349 = var349.method1788(25610, class267.field4566.method1799(127));
                                } else if (var351.method1767((byte) -126, class200.field3654)) {
                                    var349 = var349.method1788(25610, class200.field3654.method1799(127));
                                    var350 = 7;
                                } else if (var351.method1767((byte) -55, class166.field2948)) {
                                    var350 = 8;
                                    var349 = var349.method1788(25610, class166.field2948.method1799(127));
                                } else if (var351.method1767((byte) -97, class132.field2305)) {
                                    var349 = var349.method1788(25610, class132.field2305.method1799(127));
                                    var350 = 9;
                                } else if (var351.method1767((byte) -47, class164.field2916)) {
                                    var350 = 10;
                                    var349 = var349.method1788(25610, class164.field2916.method1799(127));
                                } else if (var351.method1767((byte) -109, class30.field476)) {
                                    var350 = 11;
                                    var349 = var349.method1788(arg1 ^ 0xFFFF91D9, class30.field476.method1799(127));
                                }
                            }
                            class256 var352 = var349.method1771(false);
                            byte var353 = 0;
                            if (var352.method1767((byte) -49, class181.field3197)) {
                                var349 = var349.method1788(25610, class181.field3197.method1799(127));
                                var353 = 1;
                            } else if (var352.method1767((byte) -85, class96.field1732)) {
                                var349 = var349.method1788(arg1 + 28215, class96.field1732.method1799(127));
                                var353 = 2;
                            } else if (var352.method1767((byte) -110, class297.field5157)) {
                                var349 = var349.method1788(arg1 ^ 0xFFFF91D9, class297.field5157.method1799(127));
                                var353 = 3;
                            } else if (var352.method1767((byte) -49, class70.field1293)) {
                                var353 = 4;
                                var349 = var349.method1788(25610, class70.field1293.method1799(127));
                            } else if (var352.method1767((byte) -110, class118.field2084)) {
                                var353 = 5;
                                var349 = var349.method1788(25610, class118.field2084.method1799(arg1 + 2732));
                            } else if (class204.field3699 != 0) {
                                if (var352.method1767((byte) -86, class181.field3202)) {
                                    var349 = var349.method1788(arg1 + 28215, class181.field3202.method1799(127));
                                    var353 = 1;
                                } else if (var352.method1767((byte) -31, class96.field1700)) {
                                    var353 = 2;
                                    var349 = var349.method1788(25610, class96.field1700.method1799(arg1 ^ 0xFFFFF5AC));
                                } else if (var352.method1767((byte) -37, class297.field5159)) {
                                    var349 = var349.method1788(25610, class297.field5159.method1799(arg1 + 2732));
                                    var353 = 3;
                                } else if (var352.method1767((byte) -94, class70.field1291)) {
                                    var349 = var349.method1788(25610, class70.field1291.method1799(arg1 + 2732));
                                    var353 = 4;
                                } else if (var352.method1767((byte) -115, class118.field2078)) {
                                    var349 = var349.method1788(25610, class118.field2078.method1799(127));
                                    var353 = 5;
                                }
                            }
                            class308.field5322.method1599(38, (byte) 121);
                            class308.field5322.method308(0, arg1 ^ 0xA2D);
                            int var354 = class308.field5322.field738;
                            class308.field5322.method308(var350, arg1 ^ 0xA2D);
                            class308.field5322.method308(var353, -2);
                            class146.method1068(var349, class308.field5322, 0);
                            class308.field5322.method345(class308.field5322.field738 - var354, 1);
                            continue;
                        }
                        if (var514 == 5009) {
                            var7 -= 2;
                            class256 var355 = class7.field115[var7];
                            class256 var356 = class7.field115[var7 + 1];
                            if (class106.field1896 != 0 || (!class36.field649 || class316.field5454) && !class154.field2759) {
                                class94.field1689++;
                                class308.field5322.method1599(177, (byte) 108);
                                class308.field5322.method308(0, -2);
                                int var357 = class308.field5322.field738;
                                class308.field5322.method330(255, var355.method1780(true));
                                class146.method1068(var356, class308.field5322, 0);
                                class308.field5322.method345(class308.field5322.field738 - var357, 1);
                            }
                            continue;
                        }
                        if (var514 == 5010) {
                            var6--;
                            int var358 = class98.field1751[var6];
                            class256 var359 = null;
                            if (var358 < 100) {
                                var359 = class292.field5051[var358];
                            }
                            if (var359 == null) {
                                var359 = class34.field531;
                            }
                            class7.field115[var7++] = var359;
                            continue;
                        }
                        if (var514 == 5011) {
                            var6--;
                            int var360 = class98.field1751[var6];
                            class256 var361 = null;
                            if (var360 < 100) {
                                var361 = class292.field5055[var360];
                            }
                            if (var361 == null) {
                                var361 = class34.field531;
                            }
                            class7.field115[var7++] = var361;
                            continue;
                        }
                        if (var514 == 5012) {
                            var6--;
                            int var362 = class98.field1751[var6];
                            int var363 = -1;
                            if (var362 < 100) {
                                var363 = class72.field1315[var362];
                            }
                            class98.field1751[var6++] = var363;
                            continue;
                        }
                        if (var514 == 5015) {
                            class256 var364;
                            if (class121.field2124 == null || class121.field2124.field2532 == null) {
                                var364 = class46.field849;
                            } else {
                                var364 = class121.field2124.method1053((byte) -115);
                            }
                            class7.field115[var7++] = var364;
                            continue;
                        }
                        if (var514 == 5016) {
                            class98.field1751[var6++] = class114.field2009;
                            continue;
                        }
                        if (var514 == 5017) {
                            class98.field1751[var6++] = class145.field2562;
                            continue;
                        }
                        if (var514 == 5050) {
                            var6--;
                            int var365 = class98.field1751[var6];
                            class7.field115[var7++] = class294.method2063(var365, 86).field3472;
                            continue;
                        }
                        if (var514 == 5051) {
                            var6--;
                            int var366 = class98.field1751[var6];
                            class189 var367 = class294.method2063(var366, arg1 + 2526);
                            if (var367.field3481 == null) {
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var367.field3481.length;
                            }
                            continue;
                        }
                        if (var514 == 5052) {
                            var6 -= 2;
                            int var368 = class98.field1751[var6];
                            int var369 = class98.field1751[var6 + 1];
                            class189 var370 = class294.method2063(var368, 115);
                            int var371 = var370.field3481[var369];
                            class98.field1751[var6++] = var371;
                            continue;
                        }
                        if (var514 == 5053) {
                            var6--;
                            int var372 = class98.field1751[var6];
                            class189 var373 = class294.method2063(var372, -66);
                            if (var373.field3484 == null) {
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var373.field3484.length;
                            }
                            continue;
                        }
                        if (var514 == 5054) {
                            var6 -= 2;
                            int var374 = class98.field1751[var6];
                            int var375 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class294.method2063(var374, class288.method2011(arg1, -2626)).field3484[var375];
                            continue;
                        }
                        if (var514 == 5055) {
                            var6--;
                            int var376 = class98.field1751[var6];
                            class7.field115[var7++] = class66.method507(var376, 536870911).method106((byte) -61);
                            continue;
                        }
                        if (var514 == 5056) {
                            var6--;
                            int var377 = class98.field1751[var6];
                            class17 var378 = class66.method507(var377, 536870911);
                            if (var378.field239 == null) {
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var378.field239.length;
                            }
                            continue;
                        }
                        if (var514 == 5057) {
                            var6 -= 2;
                            int var379 = class98.field1751[var6];
                            int var380 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class66.method507(var379, 536870911).field239[var380];
                            continue;
                        }
                        if (var514 == 5058) {
                            class91.field1662 = new class200();
                            var6--;
                            class91.field1662.field3646 = class98.field1751[var6];
                            class91.field1662.field3650 = class66.method507(class91.field1662.field3646, 536870911);
                            class91.field1662.field3657 = new int[class91.field1662.field3650.method107(false)];
                            continue;
                        }
                        if (var514 == 5059) {
                            class171.field3027++;
                            class308.field5322.method1599(231, (byte) 89);
                            class308.field5322.method308(0, arg1 ^ 0xA2D);
                            int var381 = class308.field5322.field738;
                            class308.field5322.method308(0, -2);
                            class308.field5322.method366(class91.field1662.field3646, arg1 ^ 0xA4B);
                            class91.field1662.field3650.method103(class308.field5322, class91.field1662.field3657, -9222);
                            class308.field5322.method345(class308.field5322.field738 - var381, 1);
                            continue;
                        }
                        if (var514 == 5060) {
                            var7--;
                            class256 var382 = class7.field115[var7];
                            class287.field4975++;
                            class308.field5322.method1599(171, (byte) 97);
                            class308.field5322.method308(0, -2);
                            int var383 = class308.field5322.field738;
                            class308.field5322.method330(255, var382.method1780(true));
                            class308.field5322.method366(class91.field1662.field3646, arg1 ^ 0xA5E);
                            class91.field1662.field3650.method103(class308.field5322, class91.field1662.field3657, -9222);
                            class308.field5322.method345(class308.field5322.field738 - var383, 1);
                            continue;
                        }
                        if (var514 == 5061) {
                            class171.field3027++;
                            class308.field5322.method1599(231, (byte) 127);
                            class308.field5322.method308(0, -2);
                            int var384 = class308.field5322.field738;
                            class308.field5322.method308(1, -2);
                            class308.field5322.method366(class91.field1662.field3646, -119);
                            class91.field1662.field3650.method103(class308.field5322, class91.field1662.field3657, arg1 - 6617);
                            class308.field5322.method345(class308.field5322.field738 - var384, 1);
                            continue;
                        }
                        if (var514 == 5062) {
                            var6 -= 2;
                            int var385 = class98.field1751[var6];
                            int var386 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class294.method2063(var385, -119).field3476[var386];
                            continue;
                        }
                        if (var514 == 5063) {
                            var6 -= 2;
                            int var387 = class98.field1751[var6];
                            int var388 = class98.field1751[var6 + 1];
                            class98.field1751[var6++] = class294.method2063(var387, arg1 + 2499).field3490[var388];
                            continue;
                        }
                        if (var514 == 5064) {
                            var6 -= 2;
                            int var389 = class98.field1751[var6 + 1];
                            int var390 = class98.field1751[var6];
                            if (var389 == -1) {
                                class98.field1751[var6++] = -1;
                            } else {
                                class98.field1751[var6++] = class294.method2063(var390, -47).method1378((byte) 122, var389);
                            }
                            continue;
                        }
                        if (var514 == 5065) {
                            var6 -= 2;
                            int var391 = class98.field1751[var6];
                            int var392 = class98.field1751[var6 + 1];
                            if (var392 == -1) {
                                class98.field1751[var6++] = -1;
                            } else {
                                class98.field1751[var6++] = class294.method2063(var391, 117).method1376(29696, var392);
                            }
                            continue;
                        }
                        if (var514 == 5066) {
                            var6--;
                            int var393 = class98.field1751[var6];
                            class98.field1751[var6++] = class66.method507(var393, 536870911).method107(false);
                            continue;
                        }
                        if (var514 == 5067) {
                            var6 -= 2;
                            int var394 = class98.field1751[var6];
                            int var395 = class98.field1751[var6 + 1];
                            int var396 = class66.method507(var394, 536870911).method97(var395, (byte) -100);
                            class98.field1751[var6++] = var396;
                            continue;
                        }
                        if (var514 == 5068) {
                            var6 -= 2;
                            int var397 = class98.field1751[var6];
                            int var398 = class98.field1751[var6 + 1];
                            class91.field1662.field3657[var397] = var398;
                            continue;
                        }
                        if (var514 == 5069) {
                            var6 -= 2;
                            int var399 = class98.field1751[var6 + 1];
                            int var400 = class98.field1751[var6];
                            class91.field1662.field3657[var400] = var399;
                            continue;
                        }
                        if (var514 == 5070) {
                            var6 -= 3;
                            int var401 = class98.field1751[var6];
                            int var402 = class98.field1751[var6 + 2];
                            int var403 = class98.field1751[var6 + 1];
                            class17 var404 = class66.method507(var401, 536870911);
                            if (var404.method97(var403, (byte) -87) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class98.field1751[var6++] = var404.method105(126, var403, var402);
                            continue;
                        }
                        if (var514 == 5071) {
                            var7--;
                            class256 var405 = class7.field115[var7];
                            var6--;
                            boolean var406 = class98.field1751[var6] == 1;
                            class180.method1321(var406, var405, 0);
                            class98.field1751[var6++] = class63.field1108;
                            continue;
                        }
                        if (var514 == 5072) {
                            if (class301.field5181 != null && class63.field1108 > class44.field832) {
                                class98.field1751[var6++] = class150.method1123(65535, class301.field5181[class44.field832++]);
                                continue;
                            }
                            class98.field1751[var6++] = -1;
                            continue;
                        }
                        if (var514 == 5073) {
                            class44.field832 = 0;
                            continue;
                        }
                    } else if (var514 < 5200) {
                        if (var514 == 5100) {
                            if (class140.field2468[86]) {
                                class98.field1751[var6++] = 1;
                            } else {
                                class98.field1751[var6++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 5101) {
                            if (class140.field2468[82]) {
                                class98.field1751[var6++] = 1;
                            } else {
                                class98.field1751[var6++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 5102) {
                            if (class140.field2468[81]) {
                                class98.field1751[var6++] = 1;
                            } else {
                                class98.field1751[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var514 < 5300) {
                        if (var514 == 5200) {
                            var6--;
                            class44.method371(class98.field1751[var6], 66);
                            continue;
                        }
                        if (var514 == 5201) {
                            class98.field1751[var6++] = class294.method2060((byte) -105);
                            continue;
                        }
                        if (var514 == 5202) {
                            var6--;
                            class280.method1961(class98.field1751[var6], 50);
                            continue;
                        }
                        if (var514 == 5203) {
                            var7--;
                            class35.method242(class7.field115[var7], 4096);
                            continue;
                        }
                        if (var514 == 5204) {
                            class7.field115[var7 - 1] = class187.method1353(class7.field115[var7 - 1], arg1 + 2730);
                            continue;
                        }
                        if (var514 == 5205) {
                            var7--;
                            class75.method570((byte) 118, class7.field115[var7]);
                            continue;
                        }
                        if (var514 == 5206) {
                            var6--;
                            int var320 = class98.field1751[var6];
                            class31 var321 = class289.method2013(arg1 + 2568, var320 & 0x3FFF, (var320 & 0xFFFF8BC) >> 14);
                            if (var321 == null) {
                                class7.field115[var7++] = class34.field531;
                            } else {
                                class7.field115[var7++] = var321.field506;
                            }
                            continue;
                        }
                        if (var514 == 5207) {
                            var7--;
                            class31 var322 = class22.method140((byte) 119, class7.field115[var7]);
                            if (var322 != null && var322.field507 != null) {
                                class7.field115[var7++] = var322.field507;
                                continue;
                            }
                            class7.field115[var7++] = class34.field531;
                            continue;
                        }
                        if (var514 == 5208) {
                            class98.field1751[var6++] = class39.field717;
                            class98.field1751[var6++] = class310.field5348;
                            continue;
                        }
                        if (var514 == 5209) {
                            class98.field1751[var6++] = class313.field5383 + class311.field5360;
                            class98.field1751[var6++] = class154.field2753 + class8.field133 - class271.field4645 - 1;
                            continue;
                        }
                        if (var514 == 5210) {
                            class31 var323 = class142.method1042(false);
                            if (var323 == null) {
                                class98.field1751[var6++] = 0;
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var323.field501 * 64;
                                class98.field1751[var6++] = var323.field491 * 64;
                            }
                            continue;
                        }
                        if (var514 == 5211) {
                            class31 var324 = class142.method1042(false);
                            if (var324 == null) {
                                class98.field1751[var6++] = 0;
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var324.field492 - var324.field489;
                                class98.field1751[var6++] = var324.field508 - var324.field487;
                            }
                            continue;
                        }
                        if (var514 == 5212) {
                            int var325 = class177.method1282((byte) -128);
                            int var326 = 0;
                            class256 var327;
                            if (var325 == -1) {
                                var327 = class34.field531;
                            } else {
                                var327 = class301.field5189.field4124[var325];
                                var326 = class301.field5189.method1622((byte) -112, var325);
                            }
                            class256 var328 = var327.method1782((byte) -127, class80.field1493, class199.field3638);
                            class7.field115[var7++] = var328;
                            class98.field1751[var6++] = var326;
                            continue;
                        }
                        if (var514 == 5213) {
                            int var329 = class27.method182(31860);
                            int var330 = 0;
                            class256 var331;
                            if (var329 == -1) {
                                var331 = class34.field531;
                            } else {
                                var331 = class301.field5189.field4124[var329];
                                var330 = class301.field5189.method1622((byte) -112, var329);
                            }
                            class256 var332 = var331.method1782((byte) 89, class80.field1493, class199.field3638);
                            class7.field115[var7++] = var332;
                            class98.field1751[var6++] = var330;
                            continue;
                        }
                        if (var514 == 5214) {
                            var6--;
                            int var333 = class98.field1751[var6];
                            class13.method80(-1, var333 >> 14 & 0x3FFF, var333 & 0x3FFF);
                            continue;
                        }
                        if (var514 == 5215) {
                            var6--;
                            int var334 = class98.field1751[var6];
                            var7--;
                            class256 var335 = class7.field115[var7];
                            boolean var336 = false;
                            class70 var337 = class285.method1994(arg1 + 2535, var334 & 0x3FFF, (var334 & 0xFFFC3FE) >> 14);
                            for (class31 var338 = (class31) var337.method534(98); var338 != null; var338 = (class31) var337.method536((byte) -123)) {
                                if (var338.field506.method1769(var335, (byte) 117)) {
                                    var336 = true;
                                    break;
                                }
                            }
                            if (var336) {
                                class98.field1751[var6++] = 1;
                            } else {
                                class98.field1751[var6++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 5216) {
                            var6--;
                            int var339 = class98.field1751[var6];
                            class272.method1879(-1, var339);
                            continue;
                        }
                        if (var514 == 5217) {
                            var6--;
                            int var340 = class98.field1751[var6];
                            if (class139.method1029(var340, -94)) {
                                class98.field1751[var6++] = 1;
                            } else {
                                class98.field1751[var6++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 5218) {
                            class31 var341 = class142.method1042(false);
                            if (var341 == null) {
                                class98.field1751[var6++] = -1;
                            } else {
                                class98.field1751[var6++] = var341.field504;
                            }
                            continue;
                        }
                        if (var514 == 5219) {
                            var7--;
                            class278.method1942(-86, class7.field115[var7]);
                            continue;
                        }
                    } else if (var514 < 5400) {
                        if (var514 == 5300) {
                            var6 -= 2;
                            int var243 = class98.field1751[var6];
                            int var244 = class98.field1751[var6 + 1];
                            class248.method1671(var243, false, 3, var244, true);
                            class98.field1751[var6++] = class317.field5460 == null ? 0 : 1;
                            continue;
                        }
                        if (var514 == 5301) {
                            if (class317.field5460 != null) {
                                class248.method1671(-1, false, class237.field4037, -1, true);
                            }
                            continue;
                        }
                        if (var514 == 5302) {
                            class317[] var245 = class185.method1346(-1);
                            class98.field1751[var6++] = var245.length;
                            continue;
                        }
                        if (var514 == 5303) {
                            var6--;
                            int var246 = class98.field1751[var6];
                            class317[] var247 = class185.method1346(-1);
                            class98.field1751[var6++] = var247[var246].field5462;
                            class98.field1751[var6++] = var247[var246].field5465;
                            continue;
                        }
                        if (var514 == 5305) {
                            int var248 = class145.field2566;
                            int var249 = class141.field2479;
                            int var250 = -1;
                            class317[] var251 = class185.method1346(-1);
                            for (int var252 = 0; var252 < var251.length; var252++) {
                                class317 var253 = var251[var252];
                                if (var253.field5462 == var249 && var253.field5465 == var248) {
                                    var250 = var252;
                                    break;
                                }
                            }
                            class98.field1751[var6++] = var250;
                            continue;
                        }
                        if (var514 == 5306) {
                            class98.field1751[var6++] = class35.method247(0);
                            continue;
                        }
                        if (var514 == 5307) {
                            var6--;
                            int var254 = class98.field1751[var6];
                            if (var254 < 0 || var254 > 2) {
                                var254 = 0;
                            }
                            class248.method1671(-1, false, var254, -1, true);
                            continue;
                        }
                        if (var514 == 5308) {
                            class98.field1751[var6++] = class237.field4037;
                            continue;
                        }
                        if (var514 == 5309) {
                            var6--;
                            int var255 = class98.field1751[var6];
                            if (var255 < 0 || var255 > 2) {
                                var255 = 0;
                            }
                            class237.field4037 = var255;
                            class183.method1337(false, class272.field4658);
                            continue;
                        }
                    } else if (var514 < 5500) {
                        if (var514 == 5400) {
                            var7 -= 2;
                            class63.field1106++;
                            class256 var256 = class7.field115[var7];
                            class256 var257 = class7.field115[var7 + 1];
                            var6--;
                            int var258 = class98.field1751[var6];
                            class308.field5322.method1599(182, (byte) 121);
                            class308.field5322.method308(class174.method1266(1, var256) + class174.method1266(1, var257) + 1, -2);
                            class308.field5322.method361(var256, arg1 ^ 0xFFFFF5D3);
                            class308.field5322.method361(var257, 0);
                            class308.field5322.method308(var258, -2);
                            continue;
                        }
                        if (var514 == 5401) {
                            var6 -= 2;
                            class157.field2798[class98.field1751[var6]] = (short) class145.method1060(class98.field1751[var6 + 1], 4158);
                            class242.method1625(0);
                            class13.method79(false);
                            class150.method1126((byte) -78);
                            class161.method1188(-37);
                            class301.method2105(111);
                            continue;
                        }
                        if (var514 == 5405) {
                            var6 -= 2;
                            int var259 = class98.field1751[var6 + 1];
                            int var260 = class98.field1751[var6];
                            if (var260 >= 0 && var260 < 2) {
                                class241.field4105[var260] = new int[var259 << 1][4];
                            }
                            continue;
                        }
                        if (var514 == 5406) {
                            var6 -= 7;
                            int var261 = class98.field1751[var6 + 1] << 1;
                            int var262 = class98.field1751[var6 + 2];
                            int var263 = class98.field1751[var6];
                            int var264 = class98.field1751[var6 + 3];
                            int var265 = class98.field1751[var6 + 4];
                            int var266 = class98.field1751[var6 + 5];
                            int var267 = class98.field1751[var6 + 6];
                            if (var263 >= 0 && var263 < 2 && class241.field4105[var263] != null && var261 >= 0 && class241.field4105[var263].length > var261) {
                                class241.field4105[var263][var261] = new int[] { class150.method1123(var262 >> 14, 16383) * 128, var264, class150.method1123(16383, var262) * 128, var267 };
                                class241.field4105[var263][var261 + 1] = new int[] { class150.method1123(var265 >> 14, 16383) * 128, var266, class150.method1123(16383, var265) * 128 };
                            }
                            continue;
                        }
                        if (var514 == 5407) {
                            var6--;
                            int var268 = class241.field4105[class98.field1751[var6]].length >> 1;
                            class98.field1751[var6++] = var268;
                            continue;
                        }
                        if (var514 == 5411) {
                            if (class317.field5460 != null) {
                                class248.method1671(-1, false, class237.field4037, -1, true);
                            }
                            if (class198.field3627 == null) {
                                class85.method624(false, class48.method386((byte) 119), (byte) 39);
                            } else {
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var514 == 5419) {
                            class256 var269 = class34.field531;
                            if (class288.field4980 != null) {
                                var269 = class102.method737(arg1 ^ 0xFF0099A5, class288.field4980.field1497);
                                try {
                                    if (class288.field4980.field1499 != null) {
                                        byte[] var270 = ((String) class288.field4980.field1499).getBytes("ISO-8859-1");
                                        var269 = class49.method392(var270, (byte) 109, 0, var270.length);
                                    }
                                } catch (UnsupportedEncodingException var512) {
                                }
                            }
                            class7.field115[var7++] = var269;
                            continue;
                        }
                        if (var514 == 5420) {
                            class98.field1751[var6++] = class4.field66 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 5421) {
                            if (class317.field5460 != null) {
                                class248.method1671(-1, false, class237.field4037, -1, true);
                            }
                            var7--;
                            class256 var272 = class7.field115[var7];
                            var6--;
                            boolean var273 = class98.field1751[var6] == 1;
                            class256 var274 = class30.method214(new class256[] { class48.method386((byte) 127), var272 }, 29784);
                            if (class198.field3627 != null || var273 && class4.field66 != 3 && class4.field70.startsWith("win") && !class66.field1176) {
                                class31.field509 = var274;
                                class83.field1515 = var273;
                                class24.field317 = class272.field4658.method37((byte) 8, new String(var274.method1778((byte) -90), "ISO-8859-1"));
                                continue;
                            }
                            class85.method624(var273, var274, (byte) 39);
                            continue;
                        }
                        if (var514 == 5422) {
                            var7 -= 2;
                            var6--;
                            int var275 = class98.field1751[var6];
                            class256 var276 = class7.field115[var7];
                            class256 var277 = class7.field115[var7 + 1];
                            if (var276.method1799(127) > 0) {
                                if (class290.field5022 == null) {
                                    class290.field5022 = new class256[class154.field2763[class206.field3735]];
                                }
                                class290.field5022[var275] = var276;
                            }
                            if (var277.method1799(127) > 0) {
                                if (class57.field1036 == null) {
                                    class57.field1036 = new class256[class154.field2763[class206.field3735]];
                                }
                                class57.field1036[var275] = var277;
                            }
                            continue;
                        }
                        if (var514 == 5423) {
                            var7--;
                            class7.field115[var7].method1797(-123);
                            continue;
                        }
                        if (var514 == 5424) {
                            var6 -= 11;
                            class252.field4294 = class98.field1751[var6];
                            class200.field3651 = class98.field1751[var6 + 1];
                            class308.field5325 = class98.field1751[var6 + 2];
                            class56.field1021 = class98.field1751[var6 + 3];
                            class129.field2259 = class98.field1751[var6 + 4];
                            class140.field2467 = class98.field1751[var6 + 5];
                            class247.field4213 = class98.field1751[var6 + 6];
                            class248.field4223 = class98.field1751[var6 + 7];
                            class159.field2832 = class98.field1751[var6 + 8];
                            class111.field1947 = class98.field1751[var6 + 9];
                            class213.field3811 = class98.field1751[var6 + 10];
                            class153.field2743.method1011(class129.field2259, arg1 - 21000);
                            class153.field2743.method1011(class140.field2467, -23605);
                            class153.field2743.method1011(class247.field4213, arg1 - 21000);
                            class153.field2743.method1011(class248.field4223, arg1 - 21000);
                            class153.field2743.method1011(class159.field2832, -23605);
                            class36.field650 = true;
                            continue;
                        }
                        if (var514 == 5425) {
                            class301.method2102((byte) 127);
                            class36.field650 = false;
                            continue;
                        }
                        if (var514 == 5426) {
                            var6--;
                            class30.field461 = class98.field1751[var6];
                            continue;
                        }
                        if (var514 == 5427) {
                            var6 -= 2;
                            class76.field1450 = class98.field1751[var6];
                            class241.field4106 = class98.field1751[var6 + 1];
                            continue;
                        }
                    } else if (var514 < 5600) {
                        if (var514 == 5500) {
                            var6 -= 4;
                            int var308 = class98.field1751[var6];
                            int var309 = class98.field1751[var6 + 1];
                            int var310 = class98.field1751[var6 + 2];
                            int var311 = class98.field1751[var6 + 3];
                            class54.method432(var309, var310, -1, false, (var308 & 0x3FFF) - class10.field147, ((var308 & 0xFFFEC35) >> 14) - class134.field2336, var311);
                            continue;
                        }
                        if (var514 == 5501) {
                            var6 -= 4;
                            int var312 = class98.field1751[var6];
                            int var313 = class98.field1751[var6 + 2];
                            int var314 = class98.field1751[var6 + 3];
                            int var315 = class98.field1751[var6 + 1];
                            class206.method1460(var313, ((var312 & 0xFFFC796) >> 14) - class134.field2336, 109, var314, var315, (var312 & 0x3FFF) - class10.field147);
                            continue;
                        }
                        if (var514 == 5502) {
                            var6 -= 6;
                            int var316 = class98.field1751[var6];
                            if (var316 >= 2) {
                                throw new RuntimeException();
                            }
                            class205.field3720 = var316;
                            int var317 = class98.field1751[var6 + 1];
                            if ((class241.field4105[class205.field3720].length >> 1) <= (var317 + 1)) {
                                throw new RuntimeException();
                            }
                            class35.field563 = 0;
                            class294.field5114 = var317;
                            class157.field2811 = class98.field1751[var6 + 2];
                            class88.field1576 = class98.field1751[var6 + 3];
                            int var318 = class98.field1751[var6 + 4];
                            if (var318 >= 2) {
                                throw new RuntimeException();
                            }
                            class240.field4091 = var318;
                            int var319 = class98.field1751[var6 + 5];
                            if ((class241.field4105[class240.field4091].length >> 1) <= (var319 + 1)) {
                                throw new RuntimeException();
                            }
                            class192.field3510 = 3;
                            class86.field1553 = var319;
                            continue;
                        }
                        if (var514 == 5503) {
                            class135.method964(-926);
                            continue;
                        }
                        if (var514 == 5504) {
                            var6 -= 2;
                            class114.field2014 = class98.field1751[var6];
                            class289.field5001 = class98.field1751[var6 + 1];
                            if (class192.field3510 == 2) {
                                class180.field3192 = class114.field2014;
                                class210.field3784 = class289.field5001;
                            }
                            class37.method276(-1);
                            continue;
                        }
                        if (var514 == 5505) {
                            class98.field1751[var6++] = class114.field2014;
                            continue;
                        }
                        if (var514 == 5506) {
                            class98.field1751[var6++] = class289.field5001;
                            continue;
                        }
                    } else if (var514 < 5700) {
                        if (var514 == 5600) {
                            var7 -= 2;
                            class256 var304 = class7.field115[var7 + 1];
                            class256 var305 = class7.field115[var7];
                            var6--;
                            int var306 = class98.field1751[var6];
                            if (class86.field1550 == 10 && class44.field830 == 0 && class137.field2390 == 0 && class54.field1000 == 0 && class182.field3229 == 0) {
                                class180.method1324(99999, var304, var306, var305);
                            }
                            continue;
                        }
                        if (var514 == 5601) {
                            class229.method1559(-30412);
                            continue;
                        }
                        if (var514 == 5602) {
                            if (class137.field2390 == 0) {
                                class118.field2086 = -2;
                            }
                            continue;
                        }
                        if (var514 == 5603) {
                            var6 -= 4;
                            if (class86.field1550 == 10 && class44.field830 == 0 && class137.field2390 == 0 && class54.field1000 == 0 && class182.field3229 == 0) {
                                class130.method888(class98.field1751[var6 + 3], class98.field1751[var6], class98.field1751[var6 + 1], class98.field1751[var6 + 2], (byte) -127);
                            }
                            continue;
                        }
                        if (var514 == 5604) {
                            var7--;
                            if (class86.field1550 == 10 && class44.field830 == 0 && class137.field2390 == 0 && class54.field1000 == 0 && class182.field3229 == 0) {
                                class278.method1937(class7.field115[var7].method1780(true), arg1 + 2516);
                            }
                            continue;
                        }
                        if (var514 == 5605) {
                            var7 -= 2;
                            var6 -= 4;
                            if (class86.field1550 == 10 && class44.field830 == 0 && class137.field2390 == 0 && class54.field1000 == 0 && class182.field3229 == 0) {
                                class295.method2067((byte) -122, class98.field1751[var6], class98.field1751[var6 + 3], class98.field1751[var6 + 2], class7.field115[var7 + 1], class98.field1751[var6 + 1], class7.field115[var7].method1780(true));
                            }
                            continue;
                        }
                        if (var514 == 5606) {
                            if (class54.field1000 == 0) {
                                class168.field2990 = -2;
                            }
                            continue;
                        }
                        if (var514 == 5607) {
                            class98.field1751[var6++] = class118.field2086;
                            continue;
                        }
                        if (var514 == 5608) {
                            class98.field1751[var6++] = class6.field99;
                            continue;
                        }
                        if (var514 == 5609) {
                            class98.field1751[var6++] = class168.field2990;
                            continue;
                        }
                        if (var514 == 5610) {
                            for (int var307 = 0; var307 < 5; var307++) {
                                class7.field115[var7++] = class198.field3619.length <= var307 ? class34.field531 : class198.field3619[var307].method1761(arg1 + 2668);
                            }
                            class198.field3619 = null;
                            continue;
                        }
                        if (var514 == 5611) {
                            class98.field1751[var6++] = class118.field2101;
                            continue;
                        }
                    } else if (var514 < 6100) {
                        if (var514 == 6001) {
                            var6--;
                            int var295 = class98.field1751[var6];
                            if (var295 < 1) {
                                var295 = 1;
                            }
                            if (var295 > 4) {
                                var295 = 4;
                            }
                            class106.field1895 = var295;
                            if (!class253.field4323 || !class193.field3531) {
                                if (class106.field1895 == 1) {
                                    class136.method976(0.9F);
                                }
                                if (class106.field1895 == 2) {
                                    class136.method976(0.8F);
                                }
                                if (class106.field1895 == 3) {
                                    class136.method976(0.7F);
                                }
                                if (class106.field1895 == 4) {
                                    class136.method976(0.6F);
                                }
                            }
                            if (class253.field4323) {
                                class34.method240((byte) -104);
                                if (!class193.field3531) {
                                    class135.method962((byte) 127);
                                }
                            }
                            class13.method79(false);
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6002) {
                            var6--;
                            class11.method69((byte) -113, class98.field1751[var6] == 1);
                            class214.method1502(0);
                            class135.method962((byte) 126);
                            class129.method887(arg1 + 2605);
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6003) {
                            var6--;
                            class85.field1537 = class98.field1751[var6] == 1;
                            class129.method887(arg1 ^ 0xFFFFF5D3);
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6005) {
                            var6--;
                            class65.field1167 = class98.field1751[var6] == 1;
                            class135.method962((byte) -56);
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6006) {
                            var6--;
                            class236.field4032 = class98.field1751[var6] == 1;
                            ((class27) class136.field2373).method198(!class236.field4032, 108);
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6007) {
                            var6--;
                            class95.field1695 = class98.field1751[var6] == 1;
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6008) {
                            var6--;
                            class115.field2026 = class98.field1751[var6] == 1;
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6009) {
                            var6--;
                            class11.field165 = class98.field1751[var6] == 1;
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6010) {
                            var6--;
                            class181.field3216 = class98.field1751[var6] == 1;
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6011) {
                            var6--;
                            int var296 = class98.field1751[var6];
                            if (var296 < 0 || var296 > 2) {
                                var296 = 0;
                            }
                            class17.field241 = var296;
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6012) {
                            if (class253.field4323) {
                                class277.method1910(0, 0, -19856);
                            }
                            var6--;
                            class193.field3531 = class98.field1751[var6] == 1;
                            if (class253.field4323 && class193.field3531) {
                                class136.method976(0.7F);
                            } else {
                                if (class106.field1895 == 1) {
                                    class136.method976(0.9F);
                                }
                                if (class106.field1895 == 2) {
                                    class136.method976(0.8F);
                                }
                                if (class106.field1895 == 3) {
                                    class136.method976(0.7F);
                                }
                                if (class106.field1895 == 4) {
                                    class136.method976(0.6F);
                                }
                            }
                            class135.method962((byte) -91);
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6014) {
                            var6--;
                            class281.field4880 = class98.field1751[var6] == 1;
                            if (class253.field4323) {
                                class135.method962((byte) 127);
                            }
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6015) {
                            var6--;
                            class74.field1373 = class98.field1751[var6] == 1;
                            if (class253.field4323) {
                                class34.method240((byte) -104);
                            }
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6016) {
                            var6--;
                            int var297 = class98.field1751[var6];
                            if (var297 < 0 || var297 > 2) {
                                var297 = 0;
                            }
                            class115.field2023 = var297;
                            if (class253.field4323) {
                                class277.field4765 = true;
                            }
                            continue;
                        }
                        if (var514 == 6017) {
                            var6--;
                            class171.field3050 = class98.field1751[var6] == 1;
                            class286.method2003(65535);
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6018) {
                            var6--;
                            int var298 = class98.field1751[var6];
                            if (var298 < 0) {
                                var298 = 0;
                            }
                            if (var298 > 127) {
                                var298 = 127;
                            }
                            class29.field422 = var298;
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6019) {
                            var6--;
                            int var299 = class98.field1751[var6];
                            if (var299 < 0) {
                                var299 = 0;
                            }
                            if (var299 > 255) {
                                var299 = 255;
                            }
                            if (class38.field694 != var299) {
                                if (class38.field694 == 0 && class250.field4248 != -1) {
                                    class183.method1342(class21.field277, true, false, class250.field4248, 0, var299);
                                    class250.field4242 = false;
                                } else if (var299 == 0) {
                                    class98.method701(1);
                                    class250.field4242 = false;
                                } else {
                                    class170.method1238(var299, -28708);
                                }
                                class38.field694 = var299;
                            }
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6020) {
                            var6--;
                            int var300 = class98.field1751[var6];
                            if (var300 < 0) {
                                var300 = 0;
                            }
                            if (var300 > 127) {
                                var300 = 127;
                            }
                            class70.field1292 = var300;
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            continue;
                        }
                        if (var514 == 6021) {
                            var6--;
                            class167.field2951 = class98.field1751[var6] == 1;
                            class129.method887(0);
                            continue;
                        }
                        if (var514 == 6023) {
                            var6--;
                            int var301 = class98.field1751[var6];
                            boolean var302 = false;
                            if (var301 < 0) {
                                var301 = 0;
                            }
                            if (var301 > 2) {
                                var301 = 2;
                            }
                            if (class72.field1328 < 96) {
                                var301 = 0;
                                var302 = true;
                            }
                            class283.method1979(var301);
                            class183.method1337(false, class272.field4658);
                            class17.field245 = false;
                            class98.field1751[var6++] = var302 ? 0 : 1;
                            continue;
                        }
                        if (var514 == 6024) {
                            var6--;
                            int var303 = class98.field1751[var6];
                            if (var303 < 0 || var303 > 2) {
                                var303 = 0;
                            }
                            class274.field4743 = var303;
                            class183.method1337(false, class272.field4658);
                            continue;
                        }
                        if (var514 == 6028) {
                            var6--;
                            class31.field505 = class98.field1751[var6] != 0;
                            class183.method1337(false, class272.field4658);
                            continue;
                        }
                    } else if (var514 < 6200) {
                        if (var514 == 6101) {
                            class98.field1751[var6++] = class106.field1895;
                            continue;
                        }
                        if (var514 == 6102) {
                            class98.field1751[var6++] = class216.method1512(128) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6103) {
                            class98.field1751[var6++] = class85.field1537 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6105) {
                            class98.field1751[var6++] = class65.field1167 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6106) {
                            class98.field1751[var6++] = class236.field4032 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6107) {
                            class98.field1751[var6++] = class95.field1695 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6108) {
                            class98.field1751[var6++] = class115.field2026 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6109) {
                            class98.field1751[var6++] = class11.field165 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6110) {
                            class98.field1751[var6++] = class181.field3216 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6111) {
                            class98.field1751[var6++] = class17.field241;
                            continue;
                        }
                        if (var514 == 6112) {
                            class98.field1751[var6++] = class193.field3531 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6114) {
                            class98.field1751[var6++] = class281.field4880 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6115) {
                            class98.field1751[var6++] = class74.field1373 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6116) {
                            class98.field1751[var6++] = class115.field2023;
                            continue;
                        }
                        if (var514 == 6117) {
                            class98.field1751[var6++] = class171.field3050 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6118) {
                            class98.field1751[var6++] = class29.field422;
                            continue;
                        }
                        if (var514 == 6119) {
                            class98.field1751[var6++] = class38.field694;
                            continue;
                        }
                        if (var514 == 6120) {
                            class98.field1751[var6++] = class70.field1292;
                            continue;
                        }
                        if (var514 == 6121) {
                            if (class253.field4323) {
                                class98.field1751[var6++] = class253.field4327 ? 1 : 0;
                            } else {
                                class98.field1751[var6++] = 0;
                            }
                            continue;
                        }
                        if (var514 == 6123) {
                            class98.field1751[var6++] = class283.method1978();
                            continue;
                        }
                        if (var514 == 6124) {
                            class98.field1751[var6++] = class274.field4743;
                            continue;
                        }
                        if (var514 == 6128) {
                            class98.field1751[var6++] = class31.field505 ? 1 : 0;
                            continue;
                        }
                    } else if (var514 < 6300) {
                        if (var514 == 6200) {
                            var6 -= 2;
                            class200.field3643 = (short) class98.field1751[var6];
                            if (class200.field3643 <= 0) {
                                class200.field3643 = 256;
                            }
                            class161.field2862 = (short) class98.field1751[var6 + 1];
                            if (class161.field2862 <= 0) {
                                class161.field2862 = 205;
                            }
                            continue;
                        }
                        if (var514 == 6201) {
                            var6 -= 2;
                            class214.field3822 = (short) class98.field1751[var6];
                            if (class214.field3822 <= 0) {
                                class214.field3822 = 256;
                            }
                            class181.field3208 = (short) class98.field1751[var6 + 1];
                            if (class181.field3208 <= 0) {
                                class181.field3208 = 320;
                            }
                            continue;
                        }
                        if (var514 == 6202) {
                            var6 -= 4;
                            class154.field2758 = (short) class98.field1751[var6];
                            if (class154.field2758 <= 0) {
                                class154.field2758 = 1;
                            }
                            class297.field5150 = (short) class98.field1751[var6 + 1];
                            if (class297.field5150 <= 0) {
                                class297.field5150 = 32767;
                            } else if (class154.field2758 > class297.field5150) {
                                class297.field5150 = class154.field2758;
                            }
                            class248.field4228 = (short) class98.field1751[var6 + 2];
                            if (class248.field4228 <= 0) {
                                class248.field4228 = 1;
                            }
                            class250.field4253 = (short) class98.field1751[var6 + 3];
                            if (class250.field4253 <= 0) {
                                class250.field4253 = 32767;
                            } else if (class250.field4253 < class248.field4228) {
                                class250.field4253 = class248.field4228;
                            }
                            continue;
                        }
                        if (var514 == 6203) {
                            class107.method758(0, false, 3, class204.field3695.field3343, class204.field3695.field3391, 0);
                            class98.field1751[var6++] = class68.field1262;
                            class98.field1751[var6++] = class197.field3606;
                            continue;
                        }
                        if (var514 == 6204) {
                            class98.field1751[var6++] = class214.field3822;
                            class98.field1751[var6++] = class181.field3208;
                            continue;
                        }
                        if (var514 == 6205) {
                            class98.field1751[var6++] = class200.field3643;
                            class98.field1751[var6++] = class161.field2862;
                            continue;
                        }
                    } else if (var514 < 6400) {
                        if (var514 == 6300) {
                            class98.field1751[var6++] = (int) (class224.method1536(false) / 60000L);
                            continue;
                        }
                        if (var514 == 6301) {
                            class98.field1751[var6++] = (int) (class224.method1536(false) / 86400000L) - 11745;
                            continue;
                        }
                        if (var514 == 6302) {
                            var6 -= 3;
                            int var278 = class98.field1751[var6];
                            int var279 = class98.field1751[var6 + 2];
                            int var280 = class98.field1751[var6 + 1];
                            class84.field1529.clear();
                            class84.field1529.set(11, 12);
                            class84.field1529.set(var279, var280, var278);
                            class98.field1751[var6++] = (int) (class84.field1529.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var514 == 6303) {
                            class84.field1529.clear();
                            class84.field1529.setTime(new Date(class224.method1536(false)));
                            class98.field1751[var6++] = class84.field1529.get(1);
                            continue;
                        }
                        if (var514 == 6304) {
                            boolean var281 = true;
                            var6--;
                            int var282 = class98.field1751[var6];
                            if (var282 < 0) {
                                var281 = ((var282 + 1) % 4) == 0;
                            } else if (var282 < 1582) {
                                var281 = var282 % 4 == 0;
                            } else if ((var282 % 4) != 0) {
                                var281 = false;
                            } else if (var282 % 100 != 0) {
                                var281 = true;
                            } else if ((var282 % 400) != 0) {
                                var281 = false;
                            }
                            class98.field1751[var6++] = var281 ? 1 : 0;
                            continue;
                        }
                    } else if (var514 < 6500) {
                        if (var514 == 6405) {
                            class98.field1751[var6++] = class246.method1663((byte) 98) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 6406) {
                            class98.field1751[var6++] = class56.method444(16084) ? 1 : 0;
                            continue;
                        }
                    } else if (var514 < 6600) {
                        if (var514 == 6500) {
                            if (class86.field1550 == 10 && class44.field830 == 0 && class137.field2390 == 0 && class54.field1000 == 0) {
                                class98.field1751[var6++] = class40.method305((byte) 80) == -1 ? 0 : 1;
                                continue;
                            }
                            class98.field1751[var6++] = 1;
                            continue;
                        }
                        if (var514 == 6501) {
                            class182 var283 = class138.method1004(109);
                            if (var283 == null) {
                                class98.field1751[var6++] = -1;
                                class98.field1751[var6++] = 0;
                                class7.field115[var7++] = class34.field531;
                                class98.field1751[var6++] = 0;
                                class7.field115[var7++] = class34.field531;
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var283.field3226;
                                class98.field1751[var6++] = var283.field3631;
                                class7.field115[var7++] = var283.field3225;
                                class264 var284 = var283.method1332((byte) 126);
                                class98.field1751[var6++] = var284.field4537;
                                class7.field115[var7++] = var284.field4536;
                                class98.field1751[var6++] = var283.field3633;
                            }
                            continue;
                        }
                        if (var514 == 6502) {
                            class182 var285 = class79.method595(arg1 ^ 0xFFFFF5D3);
                            if (var285 == null) {
                                class98.field1751[var6++] = -1;
                                class98.field1751[var6++] = 0;
                                class7.field115[var7++] = class34.field531;
                                class98.field1751[var6++] = 0;
                                class7.field115[var7++] = class34.field531;
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var285.field3226;
                                class98.field1751[var6++] = var285.field3631;
                                class7.field115[var7++] = var285.field3225;
                                class264 var286 = var285.method1332((byte) 120);
                                class98.field1751[var6++] = var286.field4537;
                                class7.field115[var7++] = var286.field4536;
                                class98.field1751[var6++] = var285.field3633;
                            }
                            continue;
                        }
                        if (var514 == 6503) {
                            var6--;
                            int var287 = class98.field1751[var6];
                            if (class86.field1550 == 10 && class44.field830 == 0 && class137.field2390 == 0 && class54.field1000 == 0) {
                                class98.field1751[var6++] = class154.method1154(class288.method2011(arg1, 2647), var287) ? 1 : 0;
                                continue;
                            }
                            class98.field1751[var6++] = 0;
                            continue;
                        }
                        if (var514 == 6504) {
                            var6--;
                            class236.field4024 = class98.field1751[var6];
                            class183.method1337(false, class272.field4658);
                            continue;
                        }
                        if (var514 == 6505) {
                            class98.field1751[var6++] = class236.field4024;
                            continue;
                        }
                        if (var514 == 6506) {
                            var6--;
                            int var288 = class98.field1751[var6];
                            class182 var289 = class84.method622(false, var288);
                            if (var289 == null) {
                                class98.field1751[var6++] = -1;
                                class7.field115[var7++] = class34.field531;
                                class98.field1751[var6++] = 0;
                                class7.field115[var7++] = class34.field531;
                                class98.field1751[var6++] = 0;
                            } else {
                                class98.field1751[var6++] = var289.field3631;
                                class7.field115[var7++] = var289.field3225;
                                class264 var290 = var289.method1332((byte) 117);
                                class98.field1751[var6++] = var290.field4537;
                                class7.field115[var7++] = var290.field4536;
                                class98.field1751[var6++] = var289.field3633;
                            }
                            continue;
                        }
                        if (var514 == 6507) {
                            var6 -= 4;
                            int var291 = class98.field1751[var6];
                            boolean var292 = class98.field1751[var6 + 1] == 1;
                            int var293 = class98.field1751[var6 + 2];
                            boolean var294 = class98.field1751[var6 + 3] == 1;
                            class317.method2208(var291, (byte) 43, var292, var294, var293);
                            continue;
                        }
                    } else if (var514 < 6700) {
                        if (var514 == 6600) {
                            var6--;
                            class154.field2746 = class98.field1751[var6] == 1;
                            class183.method1337(false, class272.field4658);
                            continue;
                        }
                        if (var514 == 6601) {
                            class98.field1751[var6++] = class154.field2746 ? 1 : 0;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var513) {
            if (var5.field2382 == null) {
                if (class40.field724 != 0) {
                    class274.method1895(0, arg1 ^ 0xFFFFA35F, class34.field531, class237.field4036);
                }
                class7.method48("CS2 - scr:" + var5.field2895 + " op:" + var11, (byte) 107, var513);
            } else {
                class256 var509 = class99.method711((byte) -122, 30);
                var509.method1793((byte) 37, class65.field1158).method1793((byte) 37, var5.field2382);
                for (int var510 = class44.field823 - 1; var510 >= 0; var510--) {
                    var509.method1793((byte) 37, class27.field339).method1793((byte) 37, class174.field3083[var510].field4962.field2382);
                }
                if (var11 == 40) {
                    int var511 = var9[var8];
                    var509.method1793((byte) 37, class116.field2037).method1793((byte) 37, class305.method2125((byte) 28, var511));
                }
                if (class40.field724 != 0) {
                    class274.method1895(0, arg1 ^ 0xFFFFA35F, class34.field531, class30.method214(new class256[] { class167.field2953, var5.field2382 }, 29784));
                }
                class7.method48("CS2 - scr:" + var5.field2895 + " op:" + var11 + new String(var509.method1778((byte) -68)), (byte) 86, var513);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)Z", line = 6289)
    public static final boolean method2120(boolean arg0, int arg1) {
        field5238++;
        if (arg0) {
            field5245 = (class138) null;
        }
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 6302)
    public static void method2121(byte arg0) {
        field5237 = null;
        int var1 = -105 % ((arg0 - 26) / 51);
        field5243 = null;
        field5239 = null;
        field5245 = null;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 6312)
    public class303(Throwable arg0, String arg1) {
        this.field5235 = arg0;
        this.field5234 = arg1;
    }
}
