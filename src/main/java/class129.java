import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class129 {

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Z")
    public boolean field1838 = true;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lqj;")
    public static class196 field1833 = class80.method502("(U5", -48);

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[I")
    public static int[] field1835 = new int[50];

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lqj;")
    public static class196 field1832 = class80.method502("T", -48);

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method788(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        if (arg0 < 22) {
            return;
        }
        int var9 = arg1;
        field1840++;
        int var10 = 0;
        int var11 = arg3 - arg5;
        int var12 = arg1 - arg5;
        int var13 = arg3 * arg3;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = arg1 << 1;
        int var21 = var15 << 1;
        int var22 = (1 - var20) * var13 + var18;
        int var23 = var12 << 1;
        int var24 = var16 - (var23 - 1) * var21;
        int var25 = var14 - (var20 - 1) * var17;
        int var26 = var13 << 2;
        int var27 = var14 << 2;
        int var28 = (1 - var23) * var15 + var19;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = (var23 - 3) * var21;
        int var32 = (arg1 - 1) * var26;
        int var33 = var27;
        int var34 = var18 * 3;
        int var35 = var29;
        int var36 = (var12 - 1) * var30;
        int var37 = var19 * 3;
        int var38 = (var20 - 3) * var17;
        int[] var39 = class95.field1380[arg2];
        class25.method147(arg6, 7, arg7 - arg3, var39, arg7 - var11);
        class25.method147(arg4, 7, arg7 - var11, var39, arg7 + var11);
        class25.method147(arg6, 7, arg7 + var11, var39, arg3 + arg7);
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var22 += var34;
                    var8++;
                    var34 += var27;
                    var25 += var33;
                    var33 += var27;
                }
            }
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var28 < 0) {
                    while (var28 < 0) {
                        var24 += var35;
                        var10++;
                        var28 += var37;
                        var35 += var29;
                        var37 += var29;
                    }
                }
                if (var24 < 0) {
                    var10++;
                    var24 += var35;
                    var28 += var37;
                    var37 += var29;
                    var35 += var29;
                }
                var28 += -var36;
                var24 += -var31;
                var31 -= var30;
                var36 -= var30;
            }
            var9--;
            int var41 = arg2 - var9;
            if (var25 < 0) {
                var8++;
                var22 += var34;
                var25 += var33;
                var34 += var27;
                var33 += var27;
            }
            var25 += -var38;
            var22 += -var32;
            var32 -= var26;
            var38 -= var26;
            int var42 = arg2 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 - var10;
                class25.method147(arg6, 7, var44, class95.field1380[var41], var45);
                int var46 = arg7 + var10;
                class25.method147(arg4, 7, var45, class95.field1380[var41], var46);
                class25.method147(arg6, 7, var46, class95.field1380[var41], var43);
                class25.method147(arg6, 7, var44, class95.field1380[var42], var45);
                class25.method147(arg4, 7, var45, class95.field1380[var42], var46);
                class25.method147(arg6, 7, var46, class95.field1380[var42], var43);
            } else {
                class25.method147(arg6, 7, var44, class95.field1380[var41], var43);
                class25.method147(arg6, 7, var44, class95.field1380[var42], var43);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method789(int arg0) {
        field1835 = null;
        field1833 = null;
        field1832 = null;
        if (arg0 != 5) {
            method788((byte) -28, 121, -13, -124, -112, 122, -128, -117);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILw;I)V")
    public static final void method790(int arg0, class157 arg1, int arg2) {
        field1836++;
        Object[] var3 = arg1.field2534;
        int var4 = (Integer) var3[0];
        class100 var5 = class216.method1480(arg2 ^ arg2, var4);
        if (var5 == null) {
            return;
        }
        class103.field1483 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = var5.field1430;
        byte var9 = -1;
        int var10 = -1;
        int[] var11 = var5.field1432;
        try {
            class66.field946 = new class196[var5.field1438];
            int var12 = 0;
            class21.field268 = new int[var5.field1440];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field2527;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field2530;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field2526 == null ? -1 : arg1.field2526.field3117;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field2532;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field2526 == null ? -1 : arg1.field2526.field3062;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field2525 == null ? -1 : arg1.field2525.field3117;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field2525 == null ? -1 : arg1.field2525.field3062;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field2531;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field2529;
                    }
                    class21.field268[var13++] = var16;
                } else if (var3[var14] instanceof class196) {
                    class196 var15 = (class196) var3[var14];
                    if (var15.method1326(class219.field3924, -1)) {
                        var15 = arg1.field2533;
                    }
                    class66.field946[var12++] = var15;
                }
            }
            int var17 = 0;
            label3291: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var10++;
                int var434 = var11[var10];
                if (var434 < 100) {
                    if (var434 == 0) {
                        class148.field2334[var6++] = var8[var10];
                        continue;
                    }
                    if (var434 == 1) {
                        int var18 = var8[var10];
                        class148.field2334[var6++] = class215.field3873[var18];
                        continue;
                    }
                    if (var434 == 2) {
                        int var19 = var8[var10];
                        var6--;
                        class56.method321(-124, class148.field2334[var6], var19);
                        continue;
                    }
                    if (var434 == 3) {
                        class218.field3915[var7++] = var5.field1429[var10];
                        continue;
                    }
                    if (var434 == 6) {
                        var10 += var8[var10];
                        continue;
                    }
                    if (var434 == 7) {
                        var6 -= 2;
                        if (class148.field2334[var6 + 1] != class148.field2334[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var434 == 8) {
                        var6 -= 2;
                        if (class148.field2334[var6 + 1] == class148.field2334[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var434 == 9) {
                        var6 -= 2;
                        if (class148.field2334[var6 + 1] > class148.field2334[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var434 == 10) {
                        var6 -= 2;
                        if (class148.field2334[var6 + 1] < class148.field2334[var6]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var434 == 21) {
                        if (class103.field1483 == 0) {
                            return;
                        }
                        class174 var20 = class77.field1116[--class103.field1483];
                        class21.field268 = var20.field2924;
                        var10 = var20.field2937;
                        var5 = var20.field2933;
                        var8 = var5.field1430;
                        class66.field946 = var20.field2927;
                        var11 = var5.field1432;
                        continue;
                    }
                    if (var434 == 25) {
                        int var21 = var8[var10];
                        class148.field2334[var6++] = class138.method864(0, var21);
                        continue;
                    }
                    if (var434 == 27) {
                        int var22 = var8[var10];
                        var6--;
                        class125.method774(class148.field2334[var6], var22, arg2 - 30370);
                        continue;
                    }
                    if (var434 == 31) {
                        var6 -= 2;
                        if (class148.field2334[var6] <= class148.field2334[var6 + 1]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var434 == 32) {
                        var6 -= 2;
                        if (class148.field2334[var6] >= class148.field2334[var6 + 1]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var434 == 33) {
                        class148.field2334[var6++] = class21.field268[var8[var10]];
                        continue;
                    }
                    int var10001;
                    if (var434 == 34) {
                        var10001 = var8[var10];
                        var6--;
                        class21.field268[var10001] = class148.field2334[var6];
                        continue;
                    }
                    if (var434 == 35) {
                        class218.field3915[var7++] = class66.field946[var8[var10]];
                        continue;
                    }
                    if (var434 == 36) {
                        var10001 = var8[var10];
                        var7--;
                        class66.field946[var10001] = class218.field3915[var7];
                        continue;
                    }
                    if (var434 == 37) {
                        int var23 = var8[var10];
                        var7 -= var23;
                        class196 var24 = class166.method1073(var23, class218.field3915, arg2 - 9066, var7);
                        class218.field3915[var7++] = var24;
                        continue;
                    }
                    if (var434 == 38) {
                        var6--;
                        continue;
                    }
                    if (var434 == 39) {
                        var7--;
                        continue;
                    }
                    if (var434 == 40) {
                        int var25 = var8[var10];
                        class100 var26 = class216.method1480(0, var25);
                        class196[] var27 = new class196[var26.field1438];
                        int[] var28 = new int[var26.field1440];
                        for (int var29 = 0; var29 < var26.field1435; var29++) {
                            var28[var29] = class148.field2334[var6 + var29 - var26.field1435];
                        }
                        for (int var30 = 0; var30 < var26.field1433; var30++) {
                            var27[var30] = class218.field3915[var7 + var30 - var26.field1433];
                        }
                        var7 -= var26.field1433;
                        var6 -= var26.field1435;
                        class174 var31 = new class174();
                        var31.field2933 = var5;
                        var31.field2924 = class21.field268;
                        var31.field2927 = class66.field946;
                        var31.field2937 = var10;
                        if (class103.field1483 >= class77.field1116.length) {
                            throw new RuntimeException();
                        }
                        var10 = -1;
                        var5 = var26;
                        class77.field1116[class103.field1483++] = var31;
                        class66.field946 = var27;
                        var8 = var26.field1430;
                        var11 = var26.field1432;
                        class21.field268 = var28;
                        continue;
                    }
                    if (var434 == 42) {
                        class148.field2334[var6++] = class33.field405[var8[var10]];
                        continue;
                    }
                    if (var434 == 43) {
                        int var32 = var8[var10];
                        var6--;
                        class33.field405[var32] = class148.field2334[var6];
                        class118.method719(var32, 95);
                        continue;
                    }
                    if (var434 == 44) {
                        int var33 = var8[var10] >> 16;
                        var6--;
                        int var34 = class148.field2334[var6];
                        int var35 = var8[var10] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            class135.field1966[var33] = var34;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var34 <= var37) {
                                    continue label3291;
                                }
                                class100.field1436[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var434 == 45) {
                        var6--;
                        int var38 = class148.field2334[var6];
                        int var39 = var8[var10];
                        if (var38 >= 0 && class135.field1966[var39] > var38) {
                            class148.field2334[var6++] = class100.field1436[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var434 == 46) {
                        int var40 = var8[var10];
                        var6 -= 2;
                        int var41 = class148.field2334[var6];
                        if (var41 >= 0 && var41 < class135.field1966[var40]) {
                            class100.field1436[var40][var41] = class148.field2334[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var434 == 47) {
                        class196 var42 = class253.field4482[var8[var10]];
                        if (var42 == null) {
                            var42 = class194.field3413;
                        }
                        class218.field3915[var7++] = var42;
                        continue;
                    }
                    if (var434 == 48) {
                        int var43 = var8[var10];
                        var7--;
                        class253.field4482[var43] = class218.field3915[var7];
                        class179.method1169(var43, false);
                        continue;
                    }
                    if (var434 == 51) {
                        class231 var44 = var5.field1437[var8[var10]];
                        var10001 = arg2 ^ 0xA2F8;
                        var6--;
                        class206 var45 = (class206) var44.method1551(var10001, (long) class148.field2334[var6]);
                        if (var45 != null) {
                            var10 += var45.field3702;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var8[var10] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var434 < 300) {
                    if (var434 == 100) {
                        var6 -= 3;
                        int var47 = class148.field2334[var6];
                        int var48 = class148.field2334[var6 + 1];
                        int var49 = class148.field2334[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class178 var50 = class201.method1356(var47, (byte) -58);
                        if (var50.field3087 == null) {
                            var50.field3087 = new class178[var49 + 1];
                        }
                        if (var50.field3087.length <= var49) {
                            class178[] var51 = new class178[var49 + 1];
                            for (int var52 = 0; var52 < var50.field3087.length; var52++) {
                                var51[var52] = var50.field3087[var52];
                            }
                            var50.field3087 = var51;
                        }
                        if (var49 > 0 && var50.field3087[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class178 var53 = new class178();
                        var53.field3062 = var49;
                        var53.field2990 = var53.field3117 = var50.field3117;
                        var53.field3030 = true;
                        var53.field3123 = var48;
                        var50.field3087[var49] = var53;
                        if (var46) {
                            class1.field7 = var53;
                        } else {
                            class41.field472 = var53;
                        }
                        class214.method1472(-62, var50);
                        continue;
                    }
                    if (var434 == 101) {
                        class178 var54 = var46 ? class1.field7 : class41.field472;
                        if (var54.field3062 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class178 var55 = class201.method1356(var54.field3117, (byte) -38);
                        var55.field3087[var54.field3062] = null;
                        class214.method1472(arg2 - 9055, var55);
                        continue;
                    }
                    if (var434 == 102) {
                        var6--;
                        class178 var56 = class201.method1356(class148.field2334[var6], (byte) -121);
                        var56.field3087 = null;
                        class214.method1472(92, var56);
                        continue;
                    }
                    if (var434 == 200) {
                        var6 -= 2;
                        int var57 = class148.field2334[var6];
                        int var58 = class148.field2334[var6 + 1];
                        class178 var59 = class62.method394(0, var57, var58);
                        if (var59 != null && var58 != -1) {
                            class148.field2334[var6++] = 1;
                            if (var46) {
                                class1.field7 = var59;
                            } else {
                                class41.field472 = var59;
                            }
                            continue;
                        }
                        class148.field2334[var6++] = 0;
                        continue;
                    }
                    if (var434 == 201) {
                        var6--;
                        int var60 = class148.field2334[var6];
                        class178 var61 = class201.method1356(var60, (byte) -28);
                        if (var61 == null) {
                            class148.field2334[var6++] = 0;
                        } else {
                            class148.field2334[var6++] = 1;
                            if (var46) {
                                class1.field7 = var61;
                            } else {
                                class41.field472 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var434 < 500) {
                    if (var434 == 403) {
                        var6 -= 2;
                        int var423 = class148.field2334[var6 + 1];
                        int var424 = class148.field2334[var6];
                        if (var424 >= 7) {
                            var424 -= 7;
                        }
                        class102.field1477.field1916.method417(Integer.MIN_VALUE, var423, var424);
                        continue;
                    }
                    if (var434 == 404) {
                        var6 -= 2;
                        int var425 = class148.field2334[var6];
                        int var426 = class148.field2334[var6 + 1];
                        class102.field1477.field1916.method420(false, var426, var425);
                        continue;
                    }
                    if (var434 == 410) {
                        var6--;
                        boolean var427 = class148.field2334[var6] != 0;
                        class102.field1477.field1916.method421(-107, var427);
                        continue;
                    }
                } else if (var434 >= 1000 && var434 < 1100 || var434 >= 2000 && var434 < 2100) {
                    class178 var417;
                    if (var434 >= 2000) {
                        var6--;
                        var417 = class201.method1356(class148.field2334[var6], (byte) -29);
                        var434 -= 1000;
                    } else {
                        var417 = var46 ? class1.field7 : class41.field472;
                    }
                    if (var434 == 1000) {
                        var6 -= 4;
                        var417.field3155 = class148.field2334[var6];
                        var417.field3013 = class148.field2334[var6 + 1];
                        int var418 = class148.field2334[var6 + 2];
                        if (var418 < 0) {
                            var418 = 0;
                        } else if (var418 > 5) {
                            var418 = 5;
                        }
                        int var419 = class148.field2334[var6 + 3];
                        var417.field3151 = (byte) var418;
                        if (var419 < 0) {
                            var419 = 0;
                        } else if (var419 > 5) {
                            var419 = 5;
                        }
                        var417.field3150 = (byte) var419;
                        class214.method1472(arg2 - 9027, var417);
                        class231.method1553((byte) 51, var417);
                        continue;
                    }
                    if (var434 == 1001) {
                        var6 -= 4;
                        var417.field2995 = class148.field2334[var6];
                        var417.field3082 = class148.field2334[var6 + 1];
                        var417.field3118 = 0;
                        var417.field3128 = 0;
                        int var420 = class148.field2334[var6 + 2];
                        if (var420 < 0) {
                            var420 = 0;
                        } else if (var420 > 4) {
                            var420 = 4;
                        }
                        int var421 = class148.field2334[var6 + 3];
                        if (var421 < 0) {
                            var421 = 0;
                        } else if (var421 > 4) {
                            var421 = 4;
                        }
                        var417.field2991 = (byte) var421;
                        var417.field3005 = (byte) var420;
                        class214.method1472(-82, var417);
                        if (var417.field3123 == 0) {
                            class163.method1026(false, -67, var417);
                        }
                        class231.method1553((byte) 51, var417);
                        continue;
                    }
                    if (var434 == 1003) {
                        var6--;
                        boolean var422 = class148.field2334[var6] == 1;
                        if (var422 != var417.field3116) {
                            var417.field3116 = var422;
                            class214.method1472(arg2 - 8875, var417);
                        }
                        continue;
                    }
                    if (var434 == 1004) {
                        var6 -= 2;
                        var417.field3049 = class148.field2334[var6];
                        var417.field3137 = class148.field2334[var6 + 1];
                        class214.method1472(56, var417);
                        if (var417.field3123 == 0) {
                            class163.method1026(false, -83, var417);
                        }
                        class231.method1553((byte) 51, var417);
                        continue;
                    }
                } else if (var434 >= 1100 && var434 < 1200 || var434 >= 2100 && var434 < 2200) {
                    class178 var414;
                    if (var434 >= 2000) {
                        var6--;
                        var414 = class201.method1356(class148.field2334[var6], (byte) 114);
                        var434 -= 1000;
                    } else {
                        var414 = var46 ? class1.field7 : class41.field472;
                    }
                    if (var434 == 1100) {
                        var6 -= 2;
                        var414.field3088 = class148.field2334[var6];
                        if (var414.field3088 > var414.field3070 - var414.field3085) {
                            var414.field3088 = var414.field3070 - var414.field3085;
                        }
                        if (var414.field3088 < 0) {
                            var414.field3088 = 0;
                        }
                        var414.field2998 = class148.field2334[var6 + 1];
                        if (var414.field2998 > var414.field3056 - var414.field2997) {
                            var414.field2998 = var414.field3056 - var414.field2997;
                        }
                        if (var414.field2998 < 0) {
                            var414.field2998 = 0;
                        }
                        class214.method1472(-112, var414);
                        continue;
                    }
                    if (var434 == 1101) {
                        var6--;
                        var414.field3009 = class148.field2334[var6];
                        class214.method1472(-80, var414);
                        continue;
                    }
                    if (var434 == 1102) {
                        var6--;
                        var414.field3089 = class148.field2334[var6] == 1;
                        class214.method1472(-93, var414);
                        continue;
                    }
                    if (var434 == 1103) {
                        var6--;
                        var414.field3119 = class148.field2334[var6];
                        class214.method1472(-55, var414);
                        continue;
                    }
                    if (var434 == 1104) {
                        var6--;
                        var414.field3054 = class148.field2334[var6];
                        class214.method1472(63, var414);
                        continue;
                    }
                    if (var434 == 1105) {
                        var6--;
                        var414.field3027 = class148.field2334[var6];
                        class214.method1472(arg2 - 9020, var414);
                        continue;
                    }
                    if (var434 == 1106) {
                        var6--;
                        var414.field3000 = class148.field2334[var6];
                        class214.method1472(-103, var414);
                        continue;
                    }
                    if (var434 == 1107) {
                        var6--;
                        var414.field3097 = class148.field2334[var6] == 1;
                        class214.method1472(arg2 - 9061, var414);
                        continue;
                    }
                    if (var434 == 1108) {
                        var414.field3073 = 1;
                        var6--;
                        var414.field3094 = class148.field2334[var6];
                        class214.method1472(-57, var414);
                        continue;
                    }
                    if (var434 == 1109) {
                        var6 -= 6;
                        var414.field3103 = class148.field2334[var6];
                        var414.field3078 = class148.field2334[var6 + 1];
                        var414.field3017 = class148.field2334[var6 + 2];
                        var414.field3041 = class148.field2334[var6 + 3];
                        var414.field3135 = class148.field2334[var6 + 4];
                        var414.field3132 = class148.field2334[var6 + 5];
                        class214.method1472(-75, var414);
                        continue;
                    }
                    if (var434 == 1110) {
                        var6--;
                        int var415 = class148.field2334[var6];
                        if (var414.field3143 != var415) {
                            var414.field3025 = 0;
                            var414.field3143 = var415;
                            var414.field3074 = 0;
                            class214.method1472(73, var414);
                        }
                        continue;
                    }
                    if (var434 == 1111) {
                        var6--;
                        var414.field3120 = class148.field2334[var6] == 1;
                        class214.method1472(81, var414);
                        continue;
                    }
                    if (var434 == 1112) {
                        var7--;
                        class196 var416 = class218.field3915[var7];
                        if (!var416.method1326(var414.field3046, -1)) {
                            var414.field3046 = var416;
                            class214.method1472(-113, var414);
                        }
                        continue;
                    }
                    if (var434 == 1113) {
                        var6--;
                        var414.field3037 = class148.field2334[var6];
                        class214.method1472(-104, var414);
                        continue;
                    }
                    if (var434 == 1114) {
                        var6 -= 3;
                        var414.field3067 = class148.field2334[var6];
                        var414.field3083 = class148.field2334[var6 + 1];
                        var414.field3065 = class148.field2334[var6 + 2];
                        class214.method1472(86, var414);
                        continue;
                    }
                    if (var434 == 1115) {
                        var6--;
                        var414.field3026 = class148.field2334[var6] == 1;
                        class214.method1472(arg2 ^ 0xFFFFDD38, var414);
                        continue;
                    }
                    if (var434 == 1116) {
                        var6--;
                        var414.field3064 = class148.field2334[var6];
                        class214.method1472(115, var414);
                        continue;
                    }
                    if (var434 == 1117) {
                        var6--;
                        var414.field3096 = class148.field2334[var6];
                        class214.method1472(arg2 - 8870, var414);
                        continue;
                    }
                    if (var434 == 1118) {
                        var6--;
                        var414.field3095 = class148.field2334[var6] == 1;
                        class214.method1472(arg2 - 9072, var414);
                        continue;
                    }
                    if (var434 == 1119) {
                        var6--;
                        var414.field3084 = class148.field2334[var6] == 1;
                        class214.method1472(-86, var414);
                        continue;
                    }
                    if (var434 == 1120) {
                        var6 -= 2;
                        var414.field3070 = class148.field2334[var6];
                        var414.field3056 = class148.field2334[var6 + 1];
                        class214.method1472(-84, var414);
                        if (var414.field3123 == 0) {
                            class163.method1026(false, -55, var414);
                        }
                        continue;
                    }
                    if (var434 == 1121) {
                        class214.method1472(55, var414);
                        var6 -= 2;
                        continue;
                    }
                    if (var434 == 1122) {
                        var6--;
                        var414.field3048 = class148.field2334[var6] == 1;
                        class214.method1472(arg2 ^ 0x2282, var414);
                        continue;
                    }
                } else if (var434 >= 1200 && var434 < 1300 || var434 >= 2200 && var434 < 2300) {
                    class178 var410;
                    if (var434 < 2000) {
                        var410 = var46 ? class1.field7 : class41.field472;
                    } else {
                        var6--;
                        var410 = class201.method1356(class148.field2334[var6], (byte) 84);
                        var434 -= 1000;
                    }
                    class214.method1472(-58, var410);
                    if (var434 == 1200 || var434 == 1205) {
                        var6 -= 2;
                        int var411 = class148.field2334[var6];
                        int var412 = class148.field2334[var6 + 1];
                        if (var411 == -1) {
                            var410.field3073 = 1;
                            var410.field3094 = -1;
                            var410.field3081 = -1;
                        } else {
                            var410.field3101 = var412;
                            var410.field3081 = var411;
                            class202 var413 = class178.method1154(false, var411);
                            var410.field3135 = var413.field3594;
                            var410.field3132 = var413.field3578;
                            var410.field3041 = var413.field3607;
                            if (var410.field3128 > 0) {
                                var410.field3132 = var410.field3132 * 32 / var410.field3128;
                            } else if (var410.field2995 > 0) {
                                var410.field3132 = var410.field3132 * 32 / var410.field2995;
                            }
                            if (var434 == 1205) {
                                var410.field3112 = false;
                            } else {
                                var410.field3112 = true;
                            }
                            var410.field3078 = var413.field3577;
                            var410.field3103 = var413.field3629;
                            var410.field3017 = var413.field3638;
                        }
                        continue;
                    }
                    if (var434 == 1201) {
                        var410.field3073 = 2;
                        var6--;
                        var410.field3094 = class148.field2334[var6];
                        continue;
                    }
                    if (var434 == 1202) {
                        var410.field3073 = 3;
                        var410.field3094 = class102.field1477.field1916.method423(-1126);
                        continue;
                    }
                    if (var434 == 1203) {
                        var410.field3073 = 6;
                        var6--;
                        var410.field3094 = class148.field2334[var6];
                        continue;
                    }
                    if (var434 == 1204) {
                        var410.field3073 = 5;
                        var6--;
                        var410.field3094 = class148.field2334[var6];
                        continue;
                    }
                } else if ((var434 < 1300 || var434 >= 1400) && (var434 < 2300 || var434 >= 2400)) {
                    if (var434 >= 1400 && var434 < 1500 || var434 >= 2400 && var434 < 2500) {
                        class178 var66;
                        if (var434 >= 2000) {
                            var434 -= 1000;
                            var6--;
                            var66 = class201.method1356(class148.field2334[var6], (byte) 78);
                        } else {
                            var66 = var46 ? class1.field7 : class41.field472;
                        }
                        var7--;
                        class196 var67 = class218.field3915[var7];
                        int[] var68 = null;
                        if (var67.method1299(37) > 0 && var67.method1335(var67.method1299(37) - 1, (byte) 33) == 89) {
                            var6--;
                            int var69 = class148.field2334[var6];
                            if (var69 > 0) {
                                var68 = new int[var69];
                                while (var69-- > 0) {
                                    var6--;
                                    var68[var69] = class148.field2334[var6];
                                }
                            }
                            var67 = var67.method1290(var67.method1299(37) - 1, 13324, 0);
                        }
                        Object[] var70 = new Object[var67.method1299(37) + 1];
                        for (int var71 = var70.length - 1; var71 >= 1; var71--) {
                            if (var67.method1335(var71 - 1, (byte) 33) == 115) {
                                var7--;
                                var70[var71] = class218.field3915[var7];
                            } else {
                                var6--;
                                var70[var71] = Integer.valueOf(class148.field2334[var6]);
                            }
                        }
                        var6--;
                        int var72 = class148.field2334[var6];
                        if (var72 == -1) {
                            var70 = null;
                        } else {
                            var70[0] = Integer.valueOf(var72);
                        }
                        if (var434 == 1400) {
                            var66.field3142 = var70;
                        } else if (var434 == 1401) {
                            var66.field3071 = var70;
                        } else if (var434 == 1402) {
                            var66.field3039 = var70;
                        } else if (var434 == 1403) {
                            var66.field3080 = var70;
                        } else if (var434 == 1404) {
                            var66.field3102 = var70;
                        } else if (var434 == 1405) {
                            var66.field3092 = var70;
                        } else if (var434 == 1406) {
                            var66.field3145 = var70;
                        } else if (var434 == 1407) {
                            var66.field3141 = var68;
                            var66.field3090 = var70;
                        } else if (var434 == 1408) {
                            var66.field3015 = var70;
                        } else if (var434 == 1409) {
                            var66.field3086 = var70;
                        } else if (var434 == 1410) {
                            var66.field3006 = var70;
                        } else if (var434 == 1411) {
                            var66.field3066 = var70;
                        } else if (var434 == 1412) {
                            var66.field3053 = var70;
                        } else if (var434 == 1414) {
                            var66.field3144 = var68;
                            var66.field3147 = var70;
                        } else if (var434 == 1415) {
                            var66.field3033 = var68;
                            var66.field3003 = var70;
                        } else if (var434 == 1416) {
                            var66.field3152 = var70;
                        } else if (var434 == 1417) {
                            var66.field3063 = var70;
                        } else if (var434 == 1418) {
                            var66.field3077 = var70;
                        } else if (var434 == 1419) {
                            var66.field3069 = var70;
                        } else if (var434 == 1420) {
                            var66.field3131 = var70;
                        } else if (var434 == 1421) {
                            var66.field3146 = var70;
                        } else if (var434 == 1422) {
                            var66.field3023 = var70;
                        } else if (var434 == 1423) {
                            var66.field3091 = var70;
                        } else if (var434 == 1424) {
                            var66.field3022 = var70;
                        } else if (var434 == 1425) {
                            var66.field2999 = var70;
                        } else if (var434 == 1426) {
                            var66.field3016 = var70;
                        } else if (var434 == 1427) {
                            var66.field3139 = var70;
                        } else if (var434 == 1428) {
                            var66.field2992 = var70;
                            var66.field3012 = var68;
                        } else if (var434 == 1429) {
                            var66.field3055 = var68;
                            var66.field3057 = var70;
                        }
                        var66.field3076 = true;
                        continue;
                    }
                    if (var434 < 1600) {
                        class178 var73 = var46 ? class1.field7 : class41.field472;
                        if (var434 == 1500) {
                            class148.field2334[var6++] = var73.field3042;
                            continue;
                        }
                        if (var434 == 1501) {
                            class148.field2334[var6++] = var73.field3105;
                            continue;
                        }
                        if (var434 == 1502) {
                            class148.field2334[var6++] = var73.field3085;
                            continue;
                        }
                        if (var434 == 1503) {
                            class148.field2334[var6++] = var73.field2997;
                            continue;
                        }
                        if (var434 == 1504) {
                            class148.field2334[var6++] = var73.field3116 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 1505) {
                            class148.field2334[var6++] = var73.field2990;
                            continue;
                        }
                    } else if (var434 < 1700) {
                        class178 var409 = var46 ? class1.field7 : class41.field472;
                        if (var434 == 1600) {
                            class148.field2334[var6++] = var409.field3088;
                            continue;
                        }
                        if (var434 == 1601) {
                            class148.field2334[var6++] = var409.field2998;
                            continue;
                        }
                        if (var434 == 1602) {
                            class218.field3915[var7++] = var409.field3046;
                            continue;
                        }
                        if (var434 == 1603) {
                            class148.field2334[var6++] = var409.field3070;
                            continue;
                        }
                        if (var434 == 1604) {
                            class148.field2334[var6++] = var409.field3056;
                            continue;
                        }
                        if (var434 == 1605) {
                            class148.field2334[var6++] = var409.field3132;
                            continue;
                        }
                        if (var434 == 1606) {
                            class148.field2334[var6++] = var409.field3017;
                            continue;
                        }
                        if (var434 == 1607) {
                            class148.field2334[var6++] = var409.field3135;
                            continue;
                        }
                        if (var434 == 1608) {
                            class148.field2334[var6++] = var409.field3041;
                            continue;
                        }
                        if (var434 == 1609) {
                            class148.field2334[var6++] = var409.field3119;
                            continue;
                        }
                    } else if (var434 < 1800) {
                        class178 var408 = var46 ? class1.field7 : class41.field472;
                        if (var434 == 1700) {
                            class148.field2334[var6++] = var408.field3081;
                            continue;
                        }
                        if (var434 == 1701) {
                            if (var408.field3081 == -1) {
                                class148.field2334[var6++] = 0;
                            } else {
                                class148.field2334[var6++] = var408.field3101;
                            }
                            continue;
                        }
                        if (var434 == 1702) {
                            class148.field2334[var6++] = var408.field3062;
                            continue;
                        }
                    } else if (var434 < 1900) {
                        class178 var406 = var46 ? class1.field7 : class41.field472;
                        if (var434 == 1800) {
                            class148.field2334[var6++] = class189.method1234(client.method614(var406), arg2 - 202388855);
                            continue;
                        }
                        if (var434 == 1801) {
                            var6--;
                            int var407 = class148.field2334[var6];
                            int var436 = var407 - 1;
                            if (var406.field3113 != null && var436 < var406.field3113.length && var406.field3113[var436] != null) {
                                class218.field3915[var7++] = var406.field3113[var436];
                                continue;
                            }
                            class218.field3915[var7++] = class30.field382;
                            continue;
                        }
                        if (var434 == 1802) {
                            if (var406.field3133 == null) {
                                class218.field3915[var7++] = class30.field382;
                            } else {
                                class218.field3915[var7++] = var406.field3133;
                            }
                            continue;
                        }
                    } else if (var434 < 2600) {
                        var6--;
                        class178 var405 = class201.method1356(class148.field2334[var6], (byte) 127);
                        if (var434 == 2500) {
                            class148.field2334[var6++] = var405.field3042;
                            continue;
                        }
                        if (var434 == 2501) {
                            class148.field2334[var6++] = var405.field3105;
                            continue;
                        }
                        if (var434 == 2502) {
                            class148.field2334[var6++] = var405.field3085;
                            continue;
                        }
                        if (var434 == 2503) {
                            class148.field2334[var6++] = var405.field2997;
                            continue;
                        }
                        if (var434 == 2504) {
                            class148.field2334[var6++] = var405.field3116 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 2505) {
                            class148.field2334[var6++] = var405.field2990;
                            continue;
                        }
                    } else if (var434 < 2700) {
                        var6--;
                        class178 var74 = class201.method1356(class148.field2334[var6], (byte) 124);
                        if (var434 == 2600) {
                            class148.field2334[var6++] = var74.field3088;
                            continue;
                        }
                        if (var434 == 2601) {
                            class148.field2334[var6++] = var74.field2998;
                            continue;
                        }
                        if (var434 == 2602) {
                            class218.field3915[var7++] = var74.field3046;
                            continue;
                        }
                        if (var434 == 2603) {
                            class148.field2334[var6++] = var74.field3070;
                            continue;
                        }
                        if (var434 == 2604) {
                            class148.field2334[var6++] = var74.field3056;
                            continue;
                        }
                        if (var434 == 2605) {
                            class148.field2334[var6++] = var74.field3132;
                            continue;
                        }
                        if (var434 == 2606) {
                            class148.field2334[var6++] = var74.field3017;
                            continue;
                        }
                        if (var434 == 2607) {
                            class148.field2334[var6++] = var74.field3135;
                            continue;
                        }
                        if (var434 == 2608) {
                            class148.field2334[var6++] = var74.field3041;
                            continue;
                        }
                        if (var434 == 2609) {
                            class148.field2334[var6++] = var74.field3119;
                            continue;
                        }
                    } else if (var434 < 2800) {
                        if (var434 == 2700) {
                            var6--;
                            class178 var75 = class201.method1356(class148.field2334[var6], (byte) -83);
                            class148.field2334[var6++] = var75.field3081;
                            continue;
                        }
                        if (var434 == 2701) {
                            var6--;
                            class178 var76 = class201.method1356(class148.field2334[var6], (byte) 117);
                            if (var76.field3081 == -1) {
                                class148.field2334[var6++] = 0;
                            } else {
                                class148.field2334[var6++] = var76.field3101;
                            }
                            continue;
                        }
                        if (var434 == 2702) {
                            var6--;
                            int var77 = class148.field2334[var6];
                            class63 var78 = (class63) class101.field1445.method1551(32768, (long) var77);
                            if (var78 == null) {
                                class148.field2334[var6++] = 0;
                            } else {
                                class148.field2334[var6++] = 1;
                            }
                            continue;
                        }
                        if (var434 == 2703) {
                            var6--;
                            class178 var79 = class201.method1356(class148.field2334[var6], (byte) -32);
                            if (var79.field3087 == null) {
                                class148.field2334[var6++] = 0;
                                continue;
                            }
                            int var80 = var79.field3087.length;
                            for (int var81 = 0; var81 < var79.field3087.length; var81++) {
                                if (var79.field3087[var81] == null) {
                                    var80 = var81;
                                    break;
                                }
                            }
                            class148.field2334[var6++] = var80;
                            continue;
                        }
                        if (var434 == 2704 || var434 == 2705) {
                            var6 -= 2;
                            int var82 = class148.field2334[var6];
                            int var83 = class148.field2334[var6 + 1];
                            class63 var84 = (class63) class101.field1445.method1551(arg2 + 23816, (long) var82);
                            if (var84 != null && var84.field864 == var83) {
                                class148.field2334[var6++] = 1;
                                continue;
                            }
                            class148.field2334[var6++] = 0;
                            continue;
                        }
                    } else if (var434 < 2900) {
                        var6--;
                        class178 var403 = class201.method1356(class148.field2334[var6], (byte) -28);
                        if (var434 == 2800) {
                            class148.field2334[var6++] = class189.method1234(client.method614(var403), -202379903);
                            continue;
                        }
                        if (var434 == 2801) {
                            var6--;
                            int var404 = class148.field2334[var6];
                            int var435 = var404 - 1;
                            if (var403.field3113 != null && var403.field3113.length > var435 && var403.field3113[var435] != null) {
                                class218.field3915[var7++] = var403.field3113[var435];
                                continue;
                            }
                            class218.field3915[var7++] = class30.field382;
                            continue;
                        }
                        if (var434 == 2802) {
                            if (var403.field3133 == null) {
                                class218.field3915[var7++] = class30.field382;
                            } else {
                                class218.field3915[var7++] = var403.field3133;
                            }
                            continue;
                        }
                    } else if (var434 < 3200) {
                        if (var434 == 3100) {
                            var7--;
                            class196 var388 = class218.field3915[var7];
                            class236.method1586(var388, 113, 0, class30.field382);
                            continue;
                        }
                        if (var434 == 3101) {
                            var6 -= 2;
                            class33.method172(class102.field1477, class148.field2334[var6], arg2 ^ 0x22F8, class148.field2334[var6 + 1]);
                            continue;
                        }
                        if (var434 == 3103) {
                            class92.method566(false);
                            continue;
                        }
                        if (var434 == 3104) {
                            var7--;
                            class196 var389 = class218.field3915[var7];
                            class72.field1018++;
                            int var390 = 0;
                            if (var389.method1332((byte) 92)) {
                                var390 = var389.method1286(1);
                            }
                            class44.field520.method1173(82, 14592);
                            class44.field520.method355((byte) 126, var390);
                            continue;
                        }
                        if (var434 == 3105) {
                            class50.field599++;
                            var7--;
                            class196 var391 = class218.field3915[var7];
                            class44.field520.method1173(187, 14592);
                            class44.field520.method346(var391.method1330(0), (byte) -127);
                            continue;
                        }
                        if (var434 == 3106) {
                            class69.field963++;
                            var7--;
                            class196 var392 = class218.field3915[var7];
                            class44.field520.method1173(105, 14592);
                            class44.field520.method329((byte) 90, var392.method1299(37) + 1);
                            class44.field520.method330(var392, 12865);
                            continue;
                        }
                        if (var434 == 3107) {
                            var7--;
                            class196 var393 = class218.field3915[var7];
                            var6--;
                            int var394 = class148.field2334[var6];
                            class62.method389((byte) 65, var393, var394);
                            continue;
                        }
                        if (var434 == 3108) {
                            var6 -= 3;
                            int var395 = class148.field2334[var6];
                            int var396 = class148.field2334[var6 + 1];
                            int var397 = class148.field2334[var6 + 2];
                            class178 var398 = class201.method1356(var397, (byte) -48);
                            class72.method461(var398, 0, var395, var396);
                            continue;
                        }
                        if (var434 == 3109) {
                            var6 -= 2;
                            int var399 = class148.field2334[var6];
                            class178 var400 = var46 ? class1.field7 : class41.field472;
                            int var401 = class148.field2334[var6 + 1];
                            class72.method461(var400, arg2 ^ 0x22F8, var399, var401);
                            continue;
                        }
                        if (var434 == 3110) {
                            var6--;
                            int var402 = class148.field2334[var6];
                            class156.field2511++;
                            class44.field520.method1173(200, 14592);
                            class44.field520.method310(var402, -88);
                            continue;
                        }
                    } else if (var434 < 3300) {
                        if (var434 == 3200) {
                            var6 -= 3;
                            class46.method247(class148.field2334[var6], class148.field2334[var6 + 1], class148.field2334[var6 + 2], (byte) 74);
                            continue;
                        }
                        if (var434 == 3201) {
                            var6--;
                            class30.method162((byte) 14, class148.field2334[var6]);
                            continue;
                        }
                        if (var434 == 3202) {
                            var6 -= 2;
                            class74.method474((byte) -82, class148.field2334[var6 + 1], class148.field2334[var6]);
                            continue;
                        }
                    } else if (var434 < 3400) {
                        if (var434 == 3300) {
                            class148.field2334[var6++] = class171.field2879;
                            continue;
                        }
                        if (var434 == 3301) {
                            var6 -= 2;
                            int var366 = class148.field2334[var6 + 1];
                            int var367 = class148.field2334[var6];
                            class148.field2334[var6++] = class238.method1593(var367, -1, var366);
                            continue;
                        }
                        if (var434 == 3302) {
                            var6 -= 2;
                            int var368 = class148.field2334[var6];
                            int var369 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = class101.method612(var369, var368, -38);
                            continue;
                        }
                        if (var434 == 3303) {
                            var6 -= 2;
                            int var370 = class148.field2334[var6 + 1];
                            int var371 = class148.field2334[var6];
                            class148.field2334[var6++] = class223.method1508((byte) -23, var371, var370);
                            continue;
                        }
                        if (var434 == 3304) {
                            var6--;
                            int var372 = class148.field2334[var6];
                            class148.field2334[var6++] = class163.method1024(var372, (byte) -68).field4172;
                            continue;
                        }
                        if (var434 == 3305) {
                            var6--;
                            int var373 = class148.field2334[var6];
                            class148.field2334[var6++] = class104.field1511[var373];
                            continue;
                        }
                        if (var434 == 3306) {
                            var6--;
                            int var374 = class148.field2334[var6];
                            class148.field2334[var6++] = class104.field1505[var374];
                            continue;
                        }
                        if (var434 == 3307) {
                            var6--;
                            int var375 = class148.field2334[var6];
                            class148.field2334[var6++] = class152.field2455[var375];
                            continue;
                        }
                        if (var434 == 3308) {
                            int var376 = class27.field335;
                            int var377 = (class102.field1477.field2085 >> 7) + class178.field3011;
                            int var378 = (class102.field1477.field2081 >> 7) + class106.field1523;
                            class148.field2334[var6++] = (var378 << 14) + ((var376 << 28) + var377);
                            continue;
                        }
                        if (var434 == 3309) {
                            var6--;
                            int var379 = class148.field2334[var6];
                            class148.field2334[var6++] = class65.method409(268428771, var379) >> 14;
                            continue;
                        }
                        if (var434 == 3310) {
                            var6--;
                            int var380 = class148.field2334[var6];
                            class148.field2334[var6++] = var380 >> 28;
                            continue;
                        }
                        if (var434 == 3311) {
                            var6--;
                            int var381 = class148.field2334[var6];
                            class148.field2334[var6++] = class65.method409(var381, 16383);
                            continue;
                        }
                        if (var434 == 3312) {
                            class148.field2334[var6++] = class105.field1519 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3313) {
                            var6 -= 2;
                            int var382 = class148.field2334[var6] + 32768;
                            int var383 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = class238.method1593(var382, -1, var383);
                            continue;
                        }
                        if (var434 == 3314) {
                            var6 -= 2;
                            int var384 = class148.field2334[var6] + 32768;
                            int var385 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = class101.method612(var385, var384, -72);
                            continue;
                        }
                        if (var434 == 3315) {
                            var6 -= 2;
                            int var386 = class148.field2334[var6] + 32768;
                            int var387 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = class223.method1508((byte) -23, var386, var387);
                            continue;
                        }
                        if (var434 == 3316) {
                            if (class25.field320 >= 2) {
                                class148.field2334[var6++] = class25.field320;
                            } else {
                                class148.field2334[var6++] = 0;
                            }
                            continue;
                        }
                        if (var434 == 3317) {
                            class148.field2334[var6++] = class84.field1233;
                            continue;
                        }
                        if (var434 == 3318) {
                            class148.field2334[var6++] = class158.field2549;
                            continue;
                        }
                        if (var434 == 3321) {
                            class148.field2334[var6++] = class84.field1235;
                            continue;
                        }
                        if (var434 == 3322) {
                            class148.field2334[var6++] = class29.field366;
                            continue;
                        }
                        if (var434 == 3323) {
                            if (class123.field1751 >= 5 && class123.field1751 <= 9) {
                                class148.field2334[var6++] = 1;
                                continue;
                            }
                            class148.field2334[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3324) {
                            if (class123.field1751 >= 5 && class123.field1751 <= 9) {
                                class148.field2334[var6++] = class123.field1751;
                                continue;
                            }
                            class148.field2334[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3325) {
                            if (class237.field4215 > 0) {
                                class148.field2334[var6++] = 1;
                            } else {
                                class148.field2334[var6++] = 0;
                            }
                            continue;
                        }
                        if (var434 == 3326) {
                            class148.field2334[var6++] = class102.field1477.field1939;
                            continue;
                        }
                        if (var434 == 3327) {
                            class148.field2334[var6++] = class102.field1477.field1916.field931 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3328) {
                            class148.field2334[var6++] = class33.field402;
                            continue;
                        }
                        if (var434 == 3329) {
                            class148.field2334[var6++] = class213.field3818;
                            continue;
                        }
                    } else if (var434 < 3500) {
                        if (var434 == 3400) {
                            var6 -= 2;
                            int var358 = class148.field2334[var6];
                            int var359 = class148.field2334[var6 + 1];
                            class199 var360 = class33.method176(var358, (byte) 52);
                            class218.field3915[var7++] = var360.method1348(var359, class246.method1675(arg2, 8953));
                            continue;
                        }
                        if (var434 == 3408) {
                            var6 -= 4;
                            int var361 = class148.field2334[var6];
                            int var362 = class148.field2334[var6 + 1];
                            int var363 = class148.field2334[var6 + 2];
                            int var364 = class148.field2334[var6 + 3];
                            class199 var365 = class33.method176(var363, (byte) 114);
                            if (var365.field3532 == var361 && var365.field3529 == var362) {
                                if (var362 == 115) {
                                    class218.field3915[var7++] = var365.method1348(var364, 1);
                                } else {
                                    class148.field2334[var6++] = var365.method1346(arg2 - 8947, var364);
                                }
                                continue;
                            }
                            if (var362 == 115) {
                                class218.field3915[var7++] = class194.field3413;
                            } else {
                                class148.field2334[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var434 < 3700) {
                        if (var434 == 3600) {
                            if (class174.field2929 == 0) {
                                class148.field2334[var6++] = -2;
                            } else if (class174.field2929 == 1) {
                                class148.field2334[var6++] = -1;
                            } else {
                                class148.field2334[var6++] = class156.field2514;
                            }
                            continue;
                        }
                        if (var434 == 3601) {
                            var6--;
                            int var85 = class148.field2334[var6];
                            if (class174.field2929 == 2 && class156.field2514 > var85) {
                                class218.field3915[var7++] = class212.field3811[var85];
                                continue;
                            }
                            class218.field3915[var7++] = class30.field382;
                            continue;
                        }
                        if (var434 == 3602) {
                            var6--;
                            int var86 = class148.field2334[var6];
                            if (class174.field2929 == 2 && class156.field2514 > var86) {
                                class148.field2334[var6++] = class52.field654[var86];
                                continue;
                            }
                            class148.field2334[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3603) {
                            var6--;
                            int var87 = class148.field2334[var6];
                            if (class174.field2929 == 2 && var87 < class156.field2514) {
                                class148.field2334[var6++] = class203.field3668[var87];
                                continue;
                            }
                            class148.field2334[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3604) {
                            var7--;
                            class196 var88 = class218.field3915[var7];
                            var6--;
                            int var89 = class148.field2334[var6];
                            class131.method799(var89, var88, 215);
                            continue;
                        }
                        if (var434 == 3605) {
                            var7--;
                            class196 var90 = class218.field3915[var7];
                            class145.method901(var90.method1330(0), 0);
                            continue;
                        }
                        if (var434 == 3606) {
                            var7--;
                            class196 var91 = class218.field3915[var7];
                            class169.method1102((byte) 65, var91.method1330(0));
                            continue;
                        }
                        if (var434 == 3607) {
                            var7--;
                            class196 var92 = class218.field3915[var7];
                            class153.method970((byte) -84, var92.method1330(0));
                            continue;
                        }
                        if (var434 == 3608) {
                            var7--;
                            class196 var93 = class218.field3915[var7];
                            class17.method90(var93.method1330(0), arg2 ^ 0xFFFFDD7E);
                            continue;
                        }
                        if (var434 == 3609) {
                            var7--;
                            class196 var94 = class218.field3915[var7];
                            if (var94.method1317(class218.field3908, (byte) 106) || var94.method1317(class28.field349, (byte) 24)) {
                                var94 = var94.method1296(7, -1);
                            }
                            class148.field2334[var6++] = class196.method1314(class246.method1675(arg2, 8836), var94) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3610) {
                            var6--;
                            int var95 = class148.field2334[var6];
                            if (class174.field2929 == 2 && var95 < class156.field2514) {
                                class218.field3915[var7++] = class28.field352[var95];
                                continue;
                            }
                            class218.field3915[var7++] = class30.field382;
                            continue;
                        }
                        if (var434 == 3611) {
                            if (class62.field849 == null) {
                                class218.field3915[var7++] = class30.field382;
                            } else {
                                class218.field3915[var7++] = class62.field849.method1307(-101);
                            }
                            continue;
                        }
                        if (var434 == 3612) {
                            if (class62.field849 == null) {
                                class148.field2334[var6++] = 0;
                            } else {
                                class148.field2334[var6++] = class103.field1485;
                            }
                            continue;
                        }
                        if (var434 == 3613) {
                            var6--;
                            int var96 = class148.field2334[var6];
                            if (class62.field849 != null && var96 < class103.field1485) {
                                class218.field3915[var7++] = class231.field4103[var96].field85.method1307(-121);
                                continue;
                            }
                            class218.field3915[var7++] = class30.field382;
                            continue;
                        }
                        if (var434 == 3614) {
                            var6--;
                            int var97 = class148.field2334[var6];
                            if (class62.field849 != null && class103.field1485 > var97) {
                                class148.field2334[var6++] = class231.field4103[var97].field78;
                                continue;
                            }
                            class148.field2334[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3615) {
                            var6--;
                            int var98 = class148.field2334[var6];
                            if (class62.field849 != null && var98 < class103.field1485) {
                                class148.field2334[var6++] = class231.field4103[var98].field86;
                                continue;
                            }
                            class148.field2334[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3616) {
                            class148.field2334[var6++] = class154.field2491;
                            continue;
                        }
                        if (var434 == 3617) {
                            var7--;
                            class196 var99 = class218.field3915[var7];
                            class160.method1005(61, var99);
                            continue;
                        }
                        if (var434 == 3618) {
                            class148.field2334[var6++] = class81.field1177;
                            continue;
                        }
                        if (var434 == 3619) {
                            var7--;
                            class196 var100 = class218.field3915[var7];
                            class120.method745(false, var100.method1330(0));
                            continue;
                        }
                        if (var434 == 3620) {
                            class253.method1715((byte) 124);
                            continue;
                        }
                        if (var434 == 3621) {
                            if (class174.field2929 == 0) {
                                class148.field2334[var6++] = -1;
                            } else {
                                class148.field2334[var6++] = class211.field3796;
                            }
                            continue;
                        }
                        if (var434 == 3622) {
                            var6--;
                            int var101 = class148.field2334[var6];
                            if (class174.field2929 != 0 && class211.field3796 > var101) {
                                class218.field3915[var7++] = client.method627(class116.field1680[var101], (byte) -125).method1307(arg2 - 9079);
                                continue;
                            }
                            class218.field3915[var7++] = class30.field382;
                            continue;
                        }
                        if (var434 == 3623) {
                            var7--;
                            class196 var102 = class218.field3915[var7];
                            if (var102.method1317(class218.field3908, (byte) -119) || var102.method1317(class28.field349, (byte) -121)) {
                                var102 = var102.method1296(7, -1);
                            }
                            class148.field2334[var6++] = class19.method104(var102, 2) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3624) {
                            var6--;
                            int var103 = class148.field2334[var6];
                            if (class231.field4103 != null && var103 < class103.field1485 && class231.field4103[var103].field85.method1320(false, class102.field1477.field1924)) {
                                class148.field2334[var6++] = 1;
                                continue;
                            }
                            class148.field2334[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3625) {
                            if (class103.field1484 == null) {
                                class218.field3915[var7++] = class30.field382;
                            } else {
                                class218.field3915[var7++] = class103.field1484.method1307(-125);
                            }
                            continue;
                        }
                        if (var434 == 3626) {
                            var6--;
                            int var104 = class148.field2334[var6];
                            if (class62.field849 != null && class103.field1485 > var104) {
                                class218.field3915[var7++] = class231.field4103[var104].field83;
                                continue;
                            }
                            class218.field3915[var7++] = class30.field382;
                            continue;
                        }
                        if (var434 == 3627) {
                            var6--;
                            int var105 = class148.field2334[var6];
                            if (class174.field2929 == 2 && var105 >= 0 && class156.field2514 > var105) {
                                class148.field2334[var6++] = class195.field3431[var105] ? 1 : 0;
                                continue;
                            }
                            class148.field2334[var6++] = 0;
                            continue;
                        }
                        if (var434 == 3628) {
                            var7--;
                            class196 var106 = class218.field3915[var7];
                            if (var106.method1317(class218.field3908, (byte) -121) || var106.method1317(class28.field349, (byte) -124)) {
                                var106 = var106.method1296(7, -1);
                            }
                            class148.field2334[var6++] = class111.method666(arg2 - 8952, var106);
                            continue;
                        }
                    } else if (var434 < 4000) {
                        if (var434 == 3903) {
                            var6--;
                            int var107 = class148.field2334[var6];
                            class148.field2334[var6++] = class95.field1401[var107].method373((byte) 103);
                            continue;
                        }
                        if (var434 == 3904) {
                            var6--;
                            int var108 = class148.field2334[var6];
                            class148.field2334[var6++] = class95.field1401[var108].field796;
                            continue;
                        }
                        if (var434 == 3905) {
                            var6--;
                            int var109 = class148.field2334[var6];
                            class148.field2334[var6++] = class95.field1401[var109].field788;
                            continue;
                        }
                        if (var434 == 3906) {
                            var6--;
                            int var110 = class148.field2334[var6];
                            class148.field2334[var6++] = class95.field1401[var110].field793;
                            continue;
                        }
                        if (var434 == 3907) {
                            var6--;
                            int var111 = class148.field2334[var6];
                            class148.field2334[var6++] = class95.field1401[var111].field787;
                            continue;
                        }
                        if (var434 == 3908) {
                            var6--;
                            int var112 = class148.field2334[var6];
                            class148.field2334[var6++] = class95.field1401[var112].field786;
                            continue;
                        }
                        if (var434 == 3910) {
                            var6--;
                            int var113 = class148.field2334[var6];
                            int var114 = class95.field1401[var113].method375((byte) 20);
                            class148.field2334[var6++] = var114 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3911) {
                            var6--;
                            int var115 = class148.field2334[var6];
                            int var116 = class95.field1401[var115].method375((byte) 20);
                            class148.field2334[var6++] = var116 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3912) {
                            var6--;
                            int var117 = class148.field2334[var6];
                            int var118 = class95.field1401[var117].method375((byte) 20);
                            class148.field2334[var6++] = var118 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 3913) {
                            var6--;
                            int var119 = class148.field2334[var6];
                            int var120 = class95.field1401[var119].method375((byte) 20);
                            class148.field2334[var6++] = var120 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var434 < 4100) {
                        if (var434 == 4000) {
                            var6 -= 2;
                            int var121 = class148.field2334[var6];
                            int var122 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = var121 + var122;
                            continue;
                        }
                        if (var434 == 4001) {
                            var6 -= 2;
                            int var123 = class148.field2334[var6 + 1];
                            int var124 = class148.field2334[var6];
                            class148.field2334[var6++] = var124 - var123;
                            continue;
                        }
                        if (var434 == 4002) {
                            var6 -= 2;
                            int var125 = class148.field2334[var6];
                            int var126 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = var125 * var126;
                            continue;
                        }
                        if (var434 == 4003) {
                            var6 -= 2;
                            int var127 = class148.field2334[var6 + 1];
                            int var128 = class148.field2334[var6];
                            class148.field2334[var6++] = var128 / var127;
                            continue;
                        }
                        if (var434 == 4004) {
                            var6--;
                            int var129 = class148.field2334[var6];
                            class148.field2334[var6++] = (int) ((double) var129 * Math.random());
                            continue;
                        }
                        if (var434 == 4005) {
                            var6--;
                            int var130 = class148.field2334[var6];
                            class148.field2334[var6++] = (int) ((double) (var130 + 1) * Math.random());
                            continue;
                        }
                        if (var434 == 4006) {
                            var6 -= 5;
                            int var131 = class148.field2334[var6];
                            int var132 = class148.field2334[var6 + 3];
                            int var133 = class148.field2334[var6 + 2];
                            int var134 = class148.field2334[var6 + 1];
                            int var135 = class148.field2334[var6 + 4];
                            class148.field2334[var6++] = (var134 - var131) * (-var133 + var135) / (var132 - var133) + var131;
                            continue;
                        }
                        if (var434 == 4007) {
                            var6 -= 2;
                            long var136 = (long) class148.field2334[var6];
                            long var138 = (long) class148.field2334[var6 + 1];
                            class148.field2334[var6++] = (int) (var136 * var138 / 100L + var136);
                            continue;
                        }
                        if (var434 == 4008) {
                            var6 -= 2;
                            int var140 = class148.field2334[var6];
                            int var141 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = class1.method6(0x1 << var141, var140);
                            continue;
                        }
                        if (var434 == 4009) {
                            var6 -= 2;
                            int var142 = class148.field2334[var6];
                            int var143 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = class65.method409(var142, -(0x1 << var143) - 1);
                            continue;
                        }
                        if (var434 == 4010) {
                            var6 -= 2;
                            int var144 = class148.field2334[var6 + 1];
                            int var145 = class148.field2334[var6];
                            class148.field2334[var6++] = class65.method409(0x1 << var144, var145) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var434 == 4011) {
                            var6 -= 2;
                            int var146 = class148.field2334[var6 + 1];
                            int var147 = class148.field2334[var6];
                            class148.field2334[var6++] = var147 % var146;
                            continue;
                        }
                        if (var434 == 4012) {
                            var6 -= 2;
                            int var148 = class148.field2334[var6 + 1];
                            int var149 = class148.field2334[var6];
                            if (var149 == 0) {
                                class148.field2334[var6++] = 0;
                            } else {
                                class148.field2334[var6++] = (int) Math.pow((double) var149, (double) var148);
                            }
                            continue;
                        }
                        if (var434 == 4013) {
                            var6 -= 2;
                            int var150 = class148.field2334[var6];
                            int var151 = class148.field2334[var6 + 1];
                            if (var150 == 0) {
                                class148.field2334[var6++] = 0;
                            } else if (var151 == 0) {
                                class148.field2334[var6++] = Integer.MAX_VALUE;
                            } else {
                                class148.field2334[var6++] = (int) Math.pow((double) var150, 1.0D / (double) var151);
                            }
                            continue;
                        }
                        if (var434 == 4014) {
                            var6 -= 2;
                            int var152 = class148.field2334[var6];
                            int var153 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = class65.method409(var153, var152);
                            continue;
                        }
                        if (var434 == 4015) {
                            var6 -= 2;
                            int var154 = class148.field2334[var6];
                            int var155 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = class1.method6(var155, var154);
                            continue;
                        }
                        if (var434 == 4016) {
                            var6 -= 2;
                            int var156 = class148.field2334[var6];
                            int var157 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = var156 >= var157 ? var157 : var156;
                            continue;
                        }
                        if (var434 == 4017) {
                            var6 -= 2;
                            int var158 = class148.field2334[var6];
                            int var159 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = var158 > var159 ? var158 : var159;
                            continue;
                        }
                        if (var434 == 4018) {
                            var6 -= 3;
                            long var160 = (long) class148.field2334[var6];
                            long var162 = (long) class148.field2334[var6 + 1];
                            long var164 = (long) class148.field2334[var6 + 2];
                            class148.field2334[var6++] = (int) (var160 * var164 / var162);
                            continue;
                        }
                    } else if (var434 < 4200) {
                        if (var434 == 4100) {
                            var7--;
                            class196 var166 = class218.field3915[var7];
                            var6--;
                            int var167 = class148.field2334[var6];
                            class218.field3915[var7++] = class93.method572(-91, new class196[] { var166, class163.method1029(var167, false) });
                            continue;
                        }
                        if (var434 == 4101) {
                            var7 -= 2;
                            class196 var168 = class218.field3915[var7];
                            class196 var169 = class218.field3915[var7 + 1];
                            class218.field3915[var7++] = class93.method572(-75, new class196[] { var168, var169 });
                            continue;
                        }
                        if (var434 == 4102) {
                            var7--;
                            class196 var170 = class218.field3915[var7];
                            var6--;
                            int var171 = class148.field2334[var6];
                            class218.field3915[var7++] = class93.method572(arg2 - 9026, new class196[] { var170, class136.method841(var171, (byte) -127, true) });
                            continue;
                        }
                        if (var434 == 4103) {
                            var7--;
                            class196 var172 = class218.field3915[var7];
                            class218.field3915[var7++] = var172.method1292(arg2 - 8920);
                            continue;
                        }
                        if (var434 == 4104) {
                            var6--;
                            int var173 = class148.field2334[var6];
                            long var174 = ((long) var173 + 11745L) * 86400000L;
                            class21.field264.setTime(new Date(var174));
                            int var176 = class21.field264.get(5);
                            int var177 = class21.field264.get(2);
                            int var178 = class21.field264.get(1);
                            class218.field3915[var7++] = class93.method572(arg2 - 9067, new class196[] { class163.method1029(var176, false), class35.field422, class136.field1997[var177], class35.field422, class163.method1029(var178, false) });
                            continue;
                        }
                        if (var434 == 4105) {
                            var7 -= 2;
                            class196 var179 = class218.field3915[var7];
                            class196 var180 = class218.field3915[var7 + 1];
                            if (class102.field1477.field1916 != null && class102.field1477.field1916.field931) {
                                class218.field3915[var7++] = var180;
                                continue;
                            }
                            class218.field3915[var7++] = var179;
                            continue;
                        }
                        if (var434 == 4106) {
                            var6--;
                            int var181 = class148.field2334[var6];
                            class218.field3915[var7++] = class163.method1029(var181, false);
                            continue;
                        }
                        if (var434 == 4107) {
                            var7 -= 2;
                            class148.field2334[var6++] = class218.field3915[var7].method1329(class218.field3915[var7 + 1], 99);
                            continue;
                        }
                        if (var434 == 4108) {
                            var6 -= 2;
                            int var182 = class148.field2334[var6];
                            var7--;
                            class196 var183 = class218.field3915[var7];
                            int var184 = class148.field2334[var6 + 1];
                            byte[] var185 = class160.field2573.method842(var184, (byte) 35, 0);
                            class184 var186 = new class184(var185);
                            var186.method1238(class82.field1188, null);
                            class148.field2334[var6++] = var186.method1239(var183, var182);
                            continue;
                        }
                        if (var434 == 4109) {
                            var6 -= 2;
                            var7--;
                            class196 var187 = class218.field3915[var7];
                            int var188 = class148.field2334[var6 + 1];
                            int var189 = class148.field2334[var6];
                            byte[] var190 = class160.field2573.method842(var188, (byte) -92, 0);
                            class184 var191 = new class184(var190);
                            var191.method1238(class82.field1188, null);
                            class148.field2334[var6++] = var191.method1250(var187, var189);
                            continue;
                        }
                        if (var434 == 4110) {
                            var7 -= 2;
                            class196 var192 = class218.field3915[var7];
                            class196 var193 = class218.field3915[var7 + 1];
                            var6--;
                            if (class148.field2334[var6] == 1) {
                                class218.field3915[var7++] = var192;
                            } else {
                                class218.field3915[var7++] = var193;
                            }
                            continue;
                        }
                        if (var434 == 4111) {
                            var7--;
                            class196 var194 = class218.field3915[var7];
                            class218.field3915[var7++] = class190.method1254(var194);
                            continue;
                        }
                        if (var434 == 4112) {
                            var7--;
                            class196 var195 = class218.field3915[var7];
                            var6--;
                            int var196 = class148.field2334[var6];
                            if (var196 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class218.field3915[var7++] = var195.method1306(0, var196);
                            continue;
                        }
                        if (var434 == 4113) {
                            var6--;
                            int var197 = class148.field2334[var6];
                            class148.field2334[var6++] = class90.method555(true, var197) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4114) {
                            var6--;
                            int var198 = class148.field2334[var6];
                            class148.field2334[var6++] = class7.method28((byte) 100, var198) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4115) {
                            var6--;
                            int var199 = class148.field2334[var6];
                            class148.field2334[var6++] = class17.method91(var199, (byte) -32) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4116) {
                            var6--;
                            int var200 = class148.field2334[var6];
                            class148.field2334[var6++] = class80.method501(17722, var200) ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4117) {
                            var7--;
                            class196 var201 = class218.field3915[var7];
                            if (var201 == null) {
                                class148.field2334[var6++] = 0;
                            } else {
                                class148.field2334[var6++] = var201.method1299(37);
                            }
                            continue;
                        }
                        if (var434 == 4118) {
                            var7--;
                            class196 var202 = class218.field3915[var7];
                            var6 -= 2;
                            int var203 = class148.field2334[var6 + 1];
                            int var204 = class148.field2334[var6];
                            class218.field3915[var7++] = var202.method1290(var203, 13324, var204);
                            continue;
                        }
                        if (var434 == 4119) {
                            var7--;
                            class196 var205 = class218.field3915[var7];
                            class196 var206 = class158.method994(var205.method1299(arg2 ^ 0x22DD), (byte) 110);
                            boolean var207 = false;
                            for (int var208 = 0; var208 < var205.method1299(37); var208++) {
                                int var209 = var205.method1335(var208, (byte) 33);
                                if (var209 == 60) {
                                    var207 = true;
                                } else if (var209 == 62) {
                                    var207 = false;
                                } else if (!var207) {
                                    var206.method1322(var209, arg2 - 8952);
                                }
                            }
                            var206.method1310(0);
                            class218.field3915[var7++] = var206;
                            continue;
                        }
                        if (var434 == 4120) {
                            var6 -= 2;
                            int var210 = class148.field2334[var6];
                            var7--;
                            class196 var211 = class218.field3915[var7];
                            int var212 = class148.field2334[var6 + 1];
                            class148.field2334[var6++] = var211.method1327(var212, var210, 32);
                            continue;
                        }
                        if (var434 == 4121) {
                            var7 -= 2;
                            class196 var213 = class218.field3915[var7 + 1];
                            class196 var214 = class218.field3915[var7];
                            var6--;
                            int var215 = class148.field2334[var6];
                            class148.field2334[var6++] = var214.method1303(var213, var215, 48);
                            continue;
                        }
                        if (var434 == 4122) {
                            var6--;
                            int var216 = class148.field2334[var6];
                            class148.field2334[var6++] = class135.method817((byte) -67, var216);
                            continue;
                        }
                        if (var434 == 4123) {
                            var6--;
                            int var217 = class148.field2334[var6];
                            class148.field2334[var6++] = class213.method1471(var217, false);
                            continue;
                        }
                    } else if (var434 < 4300) {
                        if (var434 == 4200) {
                            var6--;
                            int var218 = class148.field2334[var6];
                            class218.field3915[var7++] = class178.method1154(false, var218).field3613;
                            continue;
                        }
                        if (var434 == 4201) {
                            var6 -= 2;
                            int var219 = class148.field2334[var6];
                            int var220 = class148.field2334[var6 + 1];
                            class202 var221 = class178.method1154(false, var219);
                            if (var220 >= 1 && var220 <= 5 && var221.field3617[var220 - 1] != null) {
                                class218.field3915[var7++] = var221.field3617[var220 - 1];
                                continue;
                            }
                            class218.field3915[var7++] = class30.field382;
                            continue;
                        }
                        if (var434 == 4202) {
                            var6 -= 2;
                            int var222 = class148.field2334[var6 + 1];
                            int var223 = class148.field2334[var6];
                            class202 var224 = class178.method1154(false, var223);
                            if (var222 >= 1 && var222 <= 5 && var224.field3628[var222 - 1] != null) {
                                class218.field3915[var7++] = var224.field3628[var222 - 1];
                                continue;
                            }
                            class218.field3915[var7++] = class30.field382;
                            continue;
                        }
                        if (var434 == 4203) {
                            var6--;
                            int var225 = class148.field2334[var6];
                            class148.field2334[var6++] = class178.method1154(false, var225).field3581;
                            continue;
                        }
                        if (var434 == 4204) {
                            var6--;
                            int var226 = class148.field2334[var6];
                            class148.field2334[var6++] = class178.method1154(false, var226).field3637 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4205) {
                            var6--;
                            int var227 = class148.field2334[var6];
                            class202 var228 = class178.method1154(false, var227);
                            if (var228.field3640 == -1 && var228.field3574 >= 0) {
                                class148.field2334[var6++] = var228.field3574;
                                continue;
                            }
                            class148.field2334[var6++] = var227;
                            continue;
                        }
                        if (var434 == 4206) {
                            var6--;
                            int var229 = class148.field2334[var6];
                            class202 var230 = class178.method1154(false, var229);
                            if (var230.field3640 >= 0 && var230.field3574 >= 0) {
                                class148.field2334[var6++] = var230.field3574;
                                continue;
                            }
                            class148.field2334[var6++] = var229;
                            continue;
                        }
                        if (var434 == 4207) {
                            var6--;
                            int var231 = class148.field2334[var6];
                            class148.field2334[var6++] = class178.method1154(false, var231).field3611 ? 1 : 0;
                            continue;
                        }
                        if (var434 == 4208) {
                            var6 -= 2;
                            int var232 = class148.field2334[var6];
                            int var233 = class148.field2334[var6 + 1];
                            class246 var234 = class238.method1595(var233, 11);
                            if (var234.method1682(44)) {
                                class218.field3915[var7++] = class178.method1154(false, var232).method1368(arg2 - 9055, var233, var234.field4384);
                            } else {
                                class148.field2334[var6++] = class178.method1154(false, var232).method1363(var233, var234.field4375, 0);
                            }
                            continue;
                        }
                        if (var434 == 4210) {
                            var6--;
                            int var235 = class148.field2334[var6];
                            var7--;
                            class196 var236 = class218.field3915[var7];
                            class73.method467(105, var235 == 1, var236);
                            class148.field2334[var6++] = class28.field346;
                            continue;
                        }
                        if (var434 == 4211) {
                            if (class210.field3781 != null && class136.field1976 < class28.field346) {
                                class148.field2334[var6++] = class65.method409(class210.field3781[class136.field1976++], 65535);
                                continue;
                            }
                            class148.field2334[var6++] = -1;
                            continue;
                        }
                        if (var434 == 4212) {
                            class136.field1976 = 0;
                            continue;
                        }
                    } else if (var434 < 4400) {
                        if (var434 == 4300) {
                            var6 -= 2;
                            int var237 = class148.field2334[var6];
                            int var238 = class148.field2334[var6 + 1];
                            class246 var239 = class238.method1595(var238, 11);
                            if (var239.method1682(114)) {
                                class218.field3915[var7++] = class126.method777((byte) -44, var237).method657(var239.field4384, var238, (byte) 69);
                            } else {
                                class148.field2334[var6++] = class126.method777((byte) -61, var237).method667((byte) 26, var238, var239.field4375);
                            }
                            continue;
                        }
                    } else if (var434 >= 4500) {
                        if (var434 < 4600) {
                            if (var434 == 4500) {
                                var6 -= 2;
                                int var240 = class148.field2334[var6 + 1];
                                int var241 = class148.field2334[var6];
                                class246 var242 = class238.method1595(var240, arg2 - 8941);
                                if (var242.method1682(49)) {
                                    class218.field3915[var7++] = class179.method1168(var241, class246.method1675(arg2, 8832)).method649(var240, 2005, var242.field4384);
                                } else {
                                    class148.field2334[var6++] = class179.method1168(var241, 85).method648(var242.field4375, false, var240);
                                }
                                continue;
                            }
                        } else if (var434 < 5100) {
                            if (var434 == 5000) {
                                class148.field2334[var6++] = class103.field1492;
                                continue;
                            }
                            if (var434 == 5001) {
                                class136.field1980++;
                                var6 -= 3;
                                class103.field1492 = class148.field2334[var6];
                                class135.field1957 = class148.field2334[var6 + 1];
                                class183.field3216 = class148.field2334[var6 + 2];
                                class44.field520.method1173(204, 14592);
                                class44.field520.method329((byte) 77, class103.field1492);
                                class44.field520.method329((byte) 43, class135.field1957);
                                class44.field520.method329((byte) 13, class183.field3216);
                                continue;
                            }
                            if (var434 == 5002) {
                                var6 -= 2;
                                int var292 = class148.field2334[var6];
                                class111.field1601++;
                                int var293 = class148.field2334[var6 + 1];
                                var7--;
                                class196 var294 = class218.field3915[var7];
                                class44.field520.method1173(72, arg2 ^ 0x1BF8);
                                class44.field520.method346(var294.method1330(arg2 - 8952), (byte) -86);
                                class44.field520.method329((byte) 79, var292 - 1);
                                class44.field520.method329((byte) 46, var293);
                                continue;
                            }
                            if (var434 == 5003) {
                                var6--;
                                int var295 = class148.field2334[var6];
                                class196 var296 = null;
                                if (var295 < 100) {
                                    var296 = class256.field4503[var295];
                                }
                                if (var296 == null) {
                                    var296 = class30.field382;
                                }
                                class218.field3915[var7++] = var296;
                                continue;
                            }
                            if (var434 == 5004) {
                                var6--;
                                int var297 = class148.field2334[var6];
                                int var298 = -1;
                                if (var297 < 100 && class256.field4503[var297] != null) {
                                    var298 = class152.field2453[var297];
                                }
                                class148.field2334[var6++] = var298;
                                continue;
                            }
                            if (var434 == 5005) {
                                class148.field2334[var6++] = class135.field1957;
                                continue;
                            }
                            if (var434 == 5008) {
                                var7--;
                                class196 var299 = class218.field3915[var7];
                                if (var299.method1317(class136.field1995, (byte) 39)) {
                                    class113.method687(-1, var299);
                                    continue;
                                }
                                if (class25.field320 == 0 && (class33.field402 == 1 || class213.field3818 == 1)) {
                                    continue;
                                }
                                class196 var300 = var299.method1292(arg2 - 8920);
                                byte var301 = 0;
                                if (var300.method1317(class57.field769, (byte) -106)) {
                                    var301 = 0;
                                    var299 = var299.method1296(class57.field769.method1299(arg2 ^ 0x22DD), -1);
                                } else if (var300.method1317(class165.field2676, (byte) 119)) {
                                    var301 = 1;
                                    var299 = var299.method1296(class165.field2676.method1299(arg2 ^ 0x22DD), -1);
                                } else if (var300.method1317(class171.field2870, (byte) 109)) {
                                    var299 = var299.method1296(class171.field2870.method1299(arg2 ^ 0x22DD), arg2 - 8953);
                                    var301 = 2;
                                } else if (var300.method1317(class29.field361, (byte) -122)) {
                                    var299 = var299.method1296(class29.field361.method1299(37), arg2 ^ 0xFFFFDD07);
                                    var301 = 3;
                                } else if (var300.method1317(class238.field4241, (byte) 41)) {
                                    var301 = 4;
                                    var299 = var299.method1296(class238.field4241.method1299(37), -1);
                                } else if (var300.method1317(class149.field2395, (byte) -110)) {
                                    var301 = 5;
                                    var299 = var299.method1296(class149.field2395.method1299(arg2 ^ 0x22DD), -1);
                                } else if (var300.method1317(class70.field992, (byte) 111)) {
                                    var301 = 6;
                                    var299 = var299.method1296(class70.field992.method1299(37), arg2 ^ 0xFFFFDD07);
                                } else if (var300.method1317(class227.field4062, (byte) -110)) {
                                    var299 = var299.method1296(class227.field4062.method1299(37), -1);
                                    var301 = 7;
                                } else if (var300.method1317(class134.field1938, (byte) -118)) {
                                    var299 = var299.method1296(class134.field1938.method1299(37), -1);
                                    var301 = 8;
                                } else if (var300.method1317(class237.field4221, (byte) -124)) {
                                    var301 = 9;
                                    var299 = var299.method1296(class237.field4221.method1299(37), arg2 - 8953);
                                } else if (var300.method1317(class29.field367, (byte) -113)) {
                                    var299 = var299.method1296(class29.field367.method1299(37), -1);
                                    var301 = 10;
                                } else if (var300.method1317(class66.field947, (byte) 30)) {
                                    var301 = 11;
                                    var299 = var299.method1296(class66.field947.method1299(arg2 - 8915), -1);
                                } else if (class71.field1002 != 0) {
                                    if (var300.method1317(class57.field765, (byte) -128)) {
                                        var301 = 0;
                                        var299 = var299.method1296(class57.field765.method1299(37), -1);
                                    } else if (var300.method1317(class165.field2698, (byte) -106)) {
                                        var299 = var299.method1296(class165.field2698.method1299(37), -1);
                                        var301 = 1;
                                    } else if (var300.method1317(class171.field2874, (byte) -110)) {
                                        var301 = 2;
                                        var299 = var299.method1296(class171.field2874.method1299(37), -1);
                                    } else if (var300.method1317(class29.field358, (byte) 29)) {
                                        var301 = 3;
                                        var299 = var299.method1296(class29.field358.method1299(37), -1);
                                    } else if (var300.method1317(class238.field4240, (byte) -126)) {
                                        var301 = 4;
                                        var299 = var299.method1296(class238.field4240.method1299(37), -1);
                                    } else if (var300.method1317(class149.field2389, (byte) -109)) {
                                        var301 = 5;
                                        var299 = var299.method1296(class149.field2389.method1299(37), -1);
                                    } else if (var300.method1317(class70.field995, (byte) -115)) {
                                        var299 = var299.method1296(class70.field995.method1299(37), -1);
                                        var301 = 6;
                                    } else if (var300.method1317(class227.field4066, (byte) -112)) {
                                        var301 = 7;
                                        var299 = var299.method1296(class227.field4066.method1299(37), -1);
                                    } else if (var300.method1317(class134.field1934, (byte) -116)) {
                                        var299 = var299.method1296(class134.field1934.method1299(arg2 ^ 0x22DD), arg2 - 8953);
                                        var301 = 8;
                                    } else if (var300.method1317(class237.field4212, (byte) -124)) {
                                        var299 = var299.method1296(class237.field4212.method1299(arg2 - 8915), arg2 ^ 0xFFFFDD07);
                                        var301 = 9;
                                    } else if (var300.method1317(class29.field356, (byte) 123)) {
                                        var299 = var299.method1296(class29.field356.method1299(37), -1);
                                        var301 = 10;
                                    } else if (var300.method1317(class66.field944, (byte) 45)) {
                                        var299 = var299.method1296(class66.field944.method1299(arg2 - 8915), -1);
                                        var301 = 11;
                                    }
                                }
                                class73.field1060++;
                                byte var302 = 0;
                                class196 var303 = var299.method1292(32);
                                if (var303.method1317(class176.field2971, (byte) -105)) {
                                    var302 = 1;
                                    var299 = var299.method1296(class176.field2971.method1299(37), arg2 ^ 0xFFFFDD07);
                                } else if (var303.method1317(class156.field2523, (byte) -106)) {
                                    var299 = var299.method1296(class156.field2523.method1299(37), -1);
                                    var302 = 2;
                                } else if (var303.method1317(class17.field195, (byte) -120)) {
                                    var302 = 3;
                                    var299 = var299.method1296(class17.field195.method1299(37), -1);
                                } else if (var303.method1317(class146.field2315, (byte) -125)) {
                                    var302 = 4;
                                    var299 = var299.method1296(class146.field2315.method1299(arg2 - 8915), -1);
                                } else if (var303.method1317(class166.field2743, (byte) -110)) {
                                    var299 = var299.method1296(class166.field2743.method1299(37), -1);
                                    var302 = 5;
                                } else if (class71.field1002 != 0) {
                                    if (var303.method1317(class176.field2965, (byte) -111)) {
                                        var302 = 1;
                                        var299 = var299.method1296(class176.field2965.method1299(arg2 ^ 0x22DD), -1);
                                    } else if (var303.method1317(class156.field2512, (byte) 68)) {
                                        var299 = var299.method1296(class156.field2512.method1299(37), arg2 - 8953);
                                        var302 = 2;
                                    } else if (var303.method1317(class17.field192, (byte) 83)) {
                                        var299 = var299.method1296(class17.field192.method1299(37), -1);
                                        var302 = 3;
                                    } else if (var303.method1317(class146.field2301, (byte) 36)) {
                                        var299 = var299.method1296(class146.field2301.method1299(37), -1);
                                        var302 = 4;
                                    } else if (var303.method1317(class166.field2741, (byte) 114)) {
                                        var299 = var299.method1296(class166.field2741.method1299(37), -1);
                                        var302 = 5;
                                    }
                                }
                                class44.field520.method1173(4, arg2 + 5640);
                                class44.field520.method329((byte) 70, 0);
                                int var304 = class44.field520.field699;
                                class44.field520.method329((byte) 67, var301);
                                class44.field520.method329((byte) 43, var302);
                                class21.method122(class44.field520, var299, 60);
                                class44.field520.method359(class44.field520.field699 - var304, (byte) -114);
                                continue;
                            }
                            if (var434 == 5009) {
                                var7 -= 2;
                                class196 var305 = class218.field3915[var7 + 1];
                                class196 var306 = class218.field3915[var7];
                                if (class25.field320 != 0 || class33.field402 != 1 && class213.field3818 != 1) {
                                    class44.field520.method1173(183, 14592);
                                    class44.field520.method329((byte) 15, 0);
                                    int var307 = class44.field520.field699;
                                    class44.field520.method346(var306.method1330(0), (byte) -114);
                                    class21.method122(class44.field520, var305, arg2 ^ 0x22C4);
                                    class34.field415++;
                                    class44.field520.method359(class44.field520.field699 - var307, (byte) -114);
                                }
                                continue;
                            }
                            if (var434 == 5010) {
                                var6--;
                                int var308 = class148.field2334[var6];
                                class196 var309 = null;
                                if (var308 < 100) {
                                    var309 = class227.field4053[var308];
                                }
                                if (var309 == null) {
                                    var309 = class30.field382;
                                }
                                class218.field3915[var7++] = var309;
                                continue;
                            }
                            if (var434 == 5011) {
                                class196 var310 = null;
                                var6--;
                                int var311 = class148.field2334[var6];
                                if (var311 < 100) {
                                    var310 = class187.field3285[var311];
                                }
                                if (var310 == null) {
                                    var310 = class30.field382;
                                }
                                class218.field3915[var7++] = var310;
                                continue;
                            }
                            if (var434 == 5012) {
                                var6--;
                                int var312 = class148.field2334[var6];
                                int var313 = -1;
                                if (var312 < 100) {
                                    var313 = class93.field1367[var312];
                                }
                                class148.field2334[var6++] = var313;
                                continue;
                            }
                            if (var434 == 5015) {
                                class196 var314;
                                if (class102.field1477 == null || class102.field1477.field1924 == null) {
                                    var314 = class152.field2446;
                                } else {
                                    var314 = class102.field1477.field1924;
                                }
                                class218.field3915[var7++] = var314;
                                continue;
                            }
                            if (var434 == 5016) {
                                class148.field2334[var6++] = class183.field3216;
                                continue;
                            }
                            if (var434 == 5017) {
                                class148.field2334[var6++] = class243.field4333;
                                continue;
                            }
                            if (var434 == 5050) {
                                var6--;
                                int var315 = class148.field2334[var6];
                                class218.field3915[var7++] = class90.method553(var315, true).field513;
                                continue;
                            }
                            if (var434 == 5051) {
                                var6--;
                                int var316 = class148.field2334[var6];
                                class44 var317 = class90.method553(var316, true);
                                if (var317.field512 == null) {
                                    class148.field2334[var6++] = 0;
                                } else {
                                    class148.field2334[var6++] = var317.field512.length;
                                }
                                continue;
                            }
                            if (var434 == 5052) {
                                var6 -= 2;
                                int var318 = class148.field2334[var6];
                                int var319 = class148.field2334[var6 + 1];
                                class44 var320 = class90.method553(var318, true);
                                int var321 = var320.field512[var319];
                                class148.field2334[var6++] = var321;
                                continue;
                            }
                            if (var434 == 5053) {
                                var6--;
                                int var322 = class148.field2334[var6];
                                class44 var323 = class90.method553(var322, true);
                                if (var323.field507 == null) {
                                    class148.field2334[var6++] = 0;
                                } else {
                                    class148.field2334[var6++] = var323.field507.length;
                                }
                                continue;
                            }
                            if (var434 == 5054) {
                                var6 -= 2;
                                int var324 = class148.field2334[var6];
                                int var325 = class148.field2334[var6 + 1];
                                class148.field2334[var6++] = class90.method553(var324, true).field507[var325];
                                continue;
                            }
                            if (var434 == 5055) {
                                var6--;
                                int var326 = class148.field2334[var6];
                                class218.field3915[var7++] = class40.method207(var326, -124).method118(114);
                                continue;
                            }
                            if (var434 == 5056) {
                                var6--;
                                int var327 = class148.field2334[var6];
                                class21 var328 = class40.method207(var327, -92);
                                if (var328.field248 == null) {
                                    class148.field2334[var6++] = 0;
                                } else {
                                    class148.field2334[var6++] = var328.field248.length;
                                }
                                continue;
                            }
                            if (var434 == 5057) {
                                var6 -= 2;
                                int var329 = class148.field2334[var6 + 1];
                                int var330 = class148.field2334[var6];
                                class148.field2334[var6++] = class40.method207(var330, -89).field248[var329];
                                continue;
                            }
                            if (var434 == 5058) {
                                class172.field2898 = new class35();
                                var6--;
                                class172.field2898.field418 = class148.field2334[var6];
                                class172.field2898.field419 = class40.method207(class172.field2898.field418, arg2 - 9002);
                                class172.field2898.field420 = new int[class172.field2898.field419.method127(12)];
                                continue;
                            }
                            if (var434 == 5059) {
                                class44.field520.method1173(57, 14592);
                                class44.field520.method329((byte) 12, 0);
                                class78.field1128++;
                                int var331 = class44.field520.field699;
                                class44.field520.method329((byte) 122, 0);
                                class44.field520.method310(class172.field2898.field418, -125);
                                class172.field2898.field419.method124((byte) 66, class172.field2898.field420, class44.field520);
                                class44.field520.method359(class44.field520.field699 - var331, (byte) -114);
                                continue;
                            }
                            if (var434 == 5060) {
                                class78.field1140++;
                                var7--;
                                class196 var332 = class218.field3915[var7];
                                class44.field520.method1173(160, 14592);
                                class44.field520.method329((byte) 13, 0);
                                int var333 = class44.field520.field699;
                                class44.field520.method346(var332.method1330(arg2 - 8952), (byte) -106);
                                class44.field520.method310(class172.field2898.field418, -63);
                                class172.field2898.field419.method124((byte) 66, class172.field2898.field420, class44.field520);
                                class44.field520.method359(class44.field520.field699 - var333, (byte) -114);
                                continue;
                            }
                            if (var434 == 5061) {
                                class78.field1128++;
                                class44.field520.method1173(57, arg2 + 5640);
                                class44.field520.method329((byte) 54, 0);
                                int var334 = class44.field520.field699;
                                class44.field520.method329((byte) 47, 1);
                                class44.field520.method310(class172.field2898.field418, -85);
                                class172.field2898.field419.method124((byte) 66, class172.field2898.field420, class44.field520);
                                class44.field520.method359(class44.field520.field699 - var334, (byte) -114);
                                continue;
                            }
                            if (var434 == 5062) {
                                var6 -= 2;
                                int var335 = class148.field2334[var6 + 1];
                                int var336 = class148.field2334[var6];
                                class148.field2334[var6++] = class90.method553(var336, true).field504[var335];
                                continue;
                            }
                            if (var434 == 5063) {
                                var6 -= 2;
                                int var337 = class148.field2334[var6];
                                int var338 = class148.field2334[var6 + 1];
                                class148.field2334[var6++] = class90.method553(var337, true).field515[var338];
                                continue;
                            }
                            if (var434 == 5064) {
                                var6 -= 2;
                                int var339 = class148.field2334[var6];
                                int var340 = class148.field2334[var6 + 1];
                                if (var340 == -1) {
                                    class148.field2334[var6++] = -1;
                                } else {
                                    class148.field2334[var6++] = class90.method553(var339, true).method228(var340, true);
                                }
                                continue;
                            }
                            if (var434 == 5065) {
                                var6 -= 2;
                                int var341 = class148.field2334[var6];
                                int var342 = class148.field2334[var6 + 1];
                                if (var342 == -1) {
                                    class148.field2334[var6++] = -1;
                                } else {
                                    class148.field2334[var6++] = class90.method553(var341, true).method231(0, var342);
                                }
                                continue;
                            }
                            if (var434 == 5066) {
                                var6--;
                                int var343 = class148.field2334[var6];
                                class148.field2334[var6++] = class40.method207(var343, -69).method127(class246.method1675(arg2, -8878));
                                continue;
                            }
                            if (var434 == 5067) {
                                var6 -= 2;
                                int var344 = class148.field2334[var6];
                                int var345 = class148.field2334[var6 + 1];
                                int var346 = class40.method207(var344, -55).method116(arg2 ^ 0x327F, var345);
                                class148.field2334[var6++] = var346;
                                continue;
                            }
                            if (var434 == 5068) {
                                var6 -= 2;
                                int var347 = class148.field2334[var6];
                                int var348 = class148.field2334[var6 + 1];
                                class172.field2898.field420[var347] = var348;
                                continue;
                            }
                            if (var434 == 5069) {
                                var6 -= 2;
                                int var349 = class148.field2334[var6];
                                int var350 = class148.field2334[var6 + 1];
                                class172.field2898.field420[var349] = var350;
                                continue;
                            }
                            if (var434 == 5070) {
                                var6 -= 3;
                                int var351 = class148.field2334[var6 + 2];
                                int var352 = class148.field2334[var6];
                                int var353 = class148.field2334[var6 + 1];
                                class21 var354 = class40.method207(var352, -107);
                                if (var354.method116(4231, var353) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class148.field2334[var6++] = var354.method114(var351, false, var353);
                                continue;
                            }
                        } else if (var434 < 5200) {
                            if (var434 == 5100) {
                                if (class174.field2936[86]) {
                                    class148.field2334[var6++] = 1;
                                } else {
                                    class148.field2334[var6++] = 0;
                                }
                                continue;
                            }
                            if (var434 == 5101) {
                                if (class174.field2936[82]) {
                                    class148.field2334[var6++] = 1;
                                } else {
                                    class148.field2334[var6++] = 0;
                                }
                                continue;
                            }
                            if (var434 == 5102) {
                                if (class174.field2936[81]) {
                                    class148.field2334[var6++] = 1;
                                } else {
                                    class148.field2334[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var434 < 5300) {
                            if (var434 == 5200) {
                                var6--;
                                class66.method424((byte) 18, class148.field2334[var6]);
                                continue;
                            }
                            if (var434 == 5201) {
                                class148.field2334[var6++] = class148.method923((byte) -78);
                                continue;
                            }
                            int var10000;
                            if (var434 == 5202) {
                                var10000 = arg2 + 8914;
                                var6--;
                                class245.method1671(var10000, class148.field2334[var6]);
                                continue;
                            }
                            if (var434 == 5203) {
                                var10000 = arg2 - 8825;
                                var7--;
                                class155.method984(var10000, class218.field3915[var7]);
                                continue;
                            }
                            if (var434 == 5204) {
                                class218.field3915[var7 - 1] = class144.method892(class218.field3915[var7 - 1], false);
                                continue;
                            }
                            if (var434 == 5205) {
                                var7--;
                                class48.method257(-69, class218.field3915[var7]);
                                continue;
                            }
                        } else if (var434 < 5400) {
                            if (var434 == 5304) {
                                class148.field2334[var6++] = 0;
                                continue;
                            }
                        } else if (var434 < 5500) {
                            if (var434 == 5400) {
                                var7 -= 2;
                                class39.field436++;
                                class196 var274 = class218.field3915[var7];
                                var6--;
                                int var275 = class148.field2334[var6];
                                class196 var276 = class218.field3915[var7 + 1];
                                class44.field520.method1173(8, 14592);
                                class44.field520.method329((byte) 39, class17.method94(var274, (byte) -12) + class17.method94(var276, (byte) -12) + 1);
                                class44.field520.method330(var274, 12865);
                                class44.field520.method330(var276, arg2 + 3913);
                                class44.field520.method329((byte) 16, var275);
                                continue;
                            }
                            if (var434 == 5401) {
                                var6 -= 2;
                                class209.field3770[class148.field2334[var6]] = (short) class71.method456(class148.field2334[var6 + 1], false);
                                class246.method1674((byte) -43);
                                class13.method58(4478);
                                class46.method244(0);
                                class237.method1590((byte) -125);
                                class166.method1074(arg2 - 8852);
                                continue;
                            }
                            if (var434 == 5402) {
                                var7 -= 2;
                                class152.field2446 = class218.field3915[var7];
                                class152.field2456 = class218.field3915[var7 + 1];
                                if (class56.field741 != 10) {
                                    continue;
                                }
                                if (!class152.field2446.method1326(class30.field382, arg2 - 8953) && !class152.field2456.method1326(class30.field382, arg2 ^ 0xFFFFDD07)) {
                                    class180.method1182((byte) -101, 20);
                                    continue;
                                }
                                class54.field681 = 3;
                                continue;
                            }
                            if (var434 == 5403) {
                                class148.field2334[var6++] = class54.field681;
                                continue;
                            }
                            if (var434 == 5404) {
                                class148.field2334[var6++] = class164.field2647 / 60;
                                continue;
                            }
                            if (var434 == 5405) {
                                var6 -= 2;
                                int var277 = class148.field2334[var6];
                                int var278 = class148.field2334[var6 + 1];
                                if (var277 >= 0 && var277 < 2) {
                                    class168.field2816[var277] = new int[var278 << 1][4];
                                }
                                continue;
                            }
                            if (var434 == 5406) {
                                var6 -= 7;
                                int var279 = class148.field2334[var6];
                                int var280 = class148.field2334[var6 + 1] << 1;
                                int var281 = class148.field2334[var6 + 2];
                                int var282 = class148.field2334[var6 + 4];
                                int var283 = class148.field2334[var6 + 5];
                                int var284 = class148.field2334[var6 + 3];
                                int var285 = class148.field2334[var6 + 6];
                                if (var279 >= 0 && var279 < 2 && class168.field2816[var279] != null && var280 >= 0 && class168.field2816[var279].length > var280) {
                                    class168.field2816[var279][var280] = new int[] { class65.method409(16383, var281 >> 14) * 128, var284, class65.method409(var281, 16383) * 128, var285 };
                                    class168.field2816[var279][var280 + 1] = new int[] { class65.method409(16383, var282 >> 14) * 128, var283, class65.method409(16383, var282) * 128 };
                                }
                                continue;
                            }
                            if (var434 == 5407) {
                                var6--;
                                int var286 = class168.field2816[class148.field2334[var6]].length >> 1;
                                class148.field2334[var6++] = var286;
                                continue;
                            }
                            if (var434 == 5408) {
                                class148.field2334[var6++] = 0;
                                continue;
                            }
                            if (var434 == 5409) {
                                class41.method211((byte) 125);
                                continue;
                            }
                            if (var434 == 5411) {
                                if (class229.field4079 == null) {
                                    class251.method1695(class84.method531(-1), false, (byte) 124);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var434 == 5412) {
                                var6 -= 4;
                                if (class168.field2805 == 0) {
                                    class10.method46(class148.field2334[var6 + 1], class148.field2334[var6], (byte) 118, class148.field2334[var6 + 2], class148.field2334[var6 + 3]);
                                }
                                continue;
                            }
                            if (var434 == 5413) {
                                class148.field2334[var6++] = class41.field464;
                                continue;
                            }
                            if (var434 == 5414) {
                                var7--;
                                if (class168.field2805 == 0) {
                                    class84.method529(class218.field3915[var7].method1330(0), arg2 - 8952);
                                }
                                continue;
                            }
                            if (var434 == 5415) {
                                class148.field2334[var6++] = class31.field389;
                                continue;
                            }
                            if (var434 == 5416) {
                                var7 -= 2;
                                var6 -= 4;
                                if (class168.field2805 == 0) {
                                    class235.method1580(class218.field3915[var7 + 1], (byte) -113, class148.field2334[var6 + 3], class218.field3915[var7].method1330(arg2 ^ 0x22F8), class148.field2334[var6 + 1], class148.field2334[var6], class148.field2334[var6 + 2]);
                                }
                                continue;
                            }
                            if (var434 == 5417) {
                                class148.field2334[var6++] = class16.field179;
                                continue;
                            }
                            if (var434 == 5418) {
                                for (int var287 = 0; var287 < 5; var287++) {
                                    class218.field3915[var7++] = class12.field141.length > var287 ? class12.field141[var287] : class30.field382;
                                }
                                class12.field141 = null;
                                continue;
                            }
                            if (var434 == 5419) {
                                class196 var288 = class30.field382;
                                if (class57.field773 != null) {
                                    var288 = class245.method1672(class57.field773.field2139, 0);
                                    try {
                                        if (class57.field773.field2135 != null) {
                                            byte[] var289 = ((String) class57.field773.field2135).getBytes("ISO-8859-1");
                                            var288 = class16.method88(var289.length, 0, var289, 0);
                                        }
                                    } catch (UnsupportedEncodingException var432) {
                                    }
                                }
                                class218.field3915[var7++] = var288;
                                continue;
                            }
                            if (var434 == 5420) {
                                class148.field2334[var6++] = class48.field579 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 5421) {
                                var7--;
                                class196 var290 = class218.field3915[var7];
                                var6--;
                                boolean var291 = class148.field2334[var6] == 1;
                                class251.method1695(class93.method572(-93, new class196[] { class84.method531(-1), var290 }), var291, (byte) 86);
                                continue;
                            }
                        } else if (var434 < 5600) {
                            if (var434 == 5500) {
                                var6 -= 4;
                                int var262 = class148.field2334[var6];
                                int var263 = class148.field2334[var6 + 2];
                                int var264 = class148.field2334[var6 + 1];
                                int var265 = class148.field2334[var6 + 3];
                                class188.method1227((byte) -42, var265, (var262 & 0x3FFF) - class178.field3011, false, var263, (var262 >> 14 & 0x3FFF) - class106.field1523, var264);
                                continue;
                            }
                            if (var434 == 5501) {
                                var6 -= 4;
                                int var266 = class148.field2334[var6];
                                int var267 = class148.field2334[var6 + 1];
                                int var268 = class148.field2334[var6 + 2];
                                int var269 = class148.field2334[var6 + 3];
                                class173.method1132(var268, var267, (var266 & 0x3FFF) - class178.field3011, true, (var266 >> 14 & 0x3FFF) - class106.field1523, var269);
                                continue;
                            }
                            if (var434 == 5502) {
                                var6 -= 6;
                                int var270 = class148.field2334[var6];
                                if (var270 >= 2) {
                                    throw new RuntimeException();
                                }
                                class13.field146 = var270;
                                int var271 = class148.field2334[var6 + 1];
                                if (class168.field2816[class13.field146].length >> 1 <= var271 + 1) {
                                    throw new RuntimeException();
                                }
                                class215.field3867 = 0;
                                class73.field1052 = var271;
                                class227.field4063 = class148.field2334[var6 + 2];
                                class199.field3537 = class148.field2334[var6 + 3];
                                int var272 = class148.field2334[var6 + 4];
                                if (var272 >= 2) {
                                    throw new RuntimeException();
                                }
                                class235.field4181 = var272;
                                int var273 = class148.field2334[var6 + 5];
                                if (class168.field2816[class235.field4181].length >> 1 <= var273 + 1) {
                                    throw new RuntimeException();
                                }
                                class238.field4232 = var273;
                                class202.field3597 = 3;
                                continue;
                            }
                            if (var434 == 5503) {
                                class41.method210(false);
                                continue;
                            }
                        } else if (var434 < 6100) {
                            if (var434 == 6001) {
                                var6--;
                                int var248 = class148.field2334[var6];
                                if (var248 < 1) {
                                    var248 = 1;
                                }
                                if (var248 > 4) {
                                    var248 = 4;
                                }
                                class50.field602 = var248;
                                if (class50.field602 == 1) {
                                    class15.method71(0.9F);
                                }
                                if (class50.field602 == 2) {
                                    class15.method71(0.8F);
                                }
                                if (class50.field602 == 3) {
                                    class15.method71(0.7F);
                                }
                                if (class50.field602 == 4) {
                                    class15.method71(0.6F);
                                }
                                class13.method58(4478);
                                class111.method675(arg2 - 18475, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6002) {
                                var6--;
                                class111.method661(class148.field2334[var6] == 1, (byte) 38);
                                class78.method487(2);
                                class227.method1538(0);
                                if (class9.method37(0) && class240.field4271) {
                                    if (class224.field4008 == null) {
                                        class224.field4008 = new byte[4][104][104];
                                    }
                                    byte var249 = (byte) (class163.field2640 - 4 & 0xFF);
                                    for (int var250 = 0; var250 < 4; var250++) {
                                        for (int var251 = 0; var251 < 104; var251++) {
                                            for (int var252 = 0; var252 < 104; var252++) {
                                                class224.field4008[var250][var251][var252] = var249;
                                            }
                                        }
                                    }
                                }
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6003) {
                                var6--;
                                class240.field4271 = class148.field2334[var6] == 1;
                                if (class9.method37(0) && class240.field4271) {
                                    if (class224.field4008 == null) {
                                        class224.field4008 = new byte[4][104][104];
                                    }
                                    byte var253 = (byte) (class163.field2640 - 4 & 0xFF);
                                    for (int var254 = 0; var254 < 4; var254++) {
                                        for (int var255 = 0; var255 < 104; var255++) {
                                            for (int var256 = 0; var256 < 104; var256++) {
                                                class224.field4008[var254][var255][var256] = var253;
                                            }
                                        }
                                    }
                                }
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6005) {
                                var6--;
                                class219.field3919 = class148.field2334[var6] == 1;
                                class227.method1538(0);
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6006) {
                                var6--;
                                class71.field1004 = class148.field2334[var6] == 1;
                                ((class185) class15.field171).method1209(!class71.field1004, (byte) 107);
                                class111.method675(arg2 - 18475, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6007) {
                                var6--;
                                class203.field3661 = class148.field2334[var6] == 1;
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6008) {
                                var6--;
                                class133.field1898 = class148.field2334[var6] == 1;
                                class111.method675(arg2 ^ 0xFFFFF835, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6009) {
                                var6--;
                                class19.field228 = class148.field2334[var6] == 1;
                                class111.method675(arg2 ^ 0xFFFFF835, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6010) {
                                var6--;
                                class151.field2444 = class148.field2334[var6] == 1;
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6011) {
                                var6--;
                                int var257 = class148.field2334[var6];
                                if (var257 < 0 || var257 > 2) {
                                    var257 = 0;
                                }
                                class159.field2554 = var257;
                                class111.method675(arg2 ^ 0xFFFFF835, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6012) {
                                var6--;
                                class174.field2935 = class148.field2334[var6] == 1;
                                if (class50.field602 == 1) {
                                    class15.method71(0.9F);
                                }
                                if (class50.field602 == 2) {
                                    class15.method71(0.8F);
                                }
                                if (class50.field602 == 3) {
                                    class15.method71(0.7F);
                                }
                                if (class50.field602 == 4) {
                                    class15.method71(0.6F);
                                }
                                class227.method1538(0);
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6014) {
                                var6--;
                                class159.field2556 = class148.field2334[var6] == 1;
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6015) {
                                var6--;
                                class192.field3371 = class148.field2334[var6] == 1;
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6016) {
                                var6--;
                                int var258 = class148.field2334[var6];
                                if (var258 < 0 || var258 > 2) {
                                    var258 = 0;
                                }
                                class88.field1293 = var258;
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6017) {
                                var6--;
                                class45.field543 = class148.field2334[var6] == 1;
                                class153.method968(arg2 ^ 0x22F9);
                                class111.method675(arg2 - 18475, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6018) {
                                var6--;
                                int var259 = class148.field2334[var6];
                                if (var259 < 0) {
                                    var259 = 0;
                                }
                                if (var259 > 127) {
                                    var259 = 127;
                                }
                                class189.field3315 = var259;
                                class111.method675(arg2 - 18475, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6019) {
                                var6--;
                                int var260 = class148.field2334[var6];
                                if (var260 < 0) {
                                    var260 = 0;
                                }
                                if (var260 > 255) {
                                    var260 = 255;
                                }
                                if (class211.field3801 != var260) {
                                    if (class211.field3801 == 0 && class238.field4235 != -1) {
                                        class171.method1118(0, false, class238.field4235, class62.field847, var260, (byte) 114);
                                        class102.field1476 = false;
                                    } else if (var260 == 0) {
                                        class206.method1403((byte) 93);
                                        class102.field1476 = false;
                                    } else {
                                        class51.method273(-28579, var260);
                                    }
                                    class211.field3801 = var260;
                                }
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6020) {
                                var6--;
                                int var261 = class148.field2334[var6];
                                if (var261 < 0) {
                                    var261 = 0;
                                }
                                if (var261 > 127) {
                                    var261 = 127;
                                }
                                class70.field977 = var261;
                                class111.method675(-9523, class168.field2844);
                                class164.field2652 = false;
                                continue;
                            }
                            if (var434 == 6021) {
                                var6--;
                                class8.field76 = class148.field2334[var6] == 1;
                                continue;
                            }
                        } else if (var434 < 6200) {
                            if (var434 == 6101) {
                                class148.field2334[var6++] = class50.field602;
                                continue;
                            }
                            if (var434 == 6102) {
                                class148.field2334[var6++] = class9.method37(0) ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6103) {
                                class148.field2334[var6++] = class240.field4271 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6105) {
                                class148.field2334[var6++] = class219.field3919 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6106) {
                                class148.field2334[var6++] = class71.field1004 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6107) {
                                class148.field2334[var6++] = class203.field3661 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6108) {
                                class148.field2334[var6++] = class133.field1898 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6109) {
                                class148.field2334[var6++] = class19.field228 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6110) {
                                class148.field2334[var6++] = class151.field2444 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6111) {
                                class148.field2334[var6++] = class159.field2554;
                                continue;
                            }
                            if (var434 == 6112) {
                                class148.field2334[var6++] = class174.field2935 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6114) {
                                class148.field2334[var6++] = class159.field2556 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6115) {
                                class148.field2334[var6++] = class192.field3371 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6116) {
                                class148.field2334[var6++] = class88.field1293;
                                continue;
                            }
                            if (var434 == 6117) {
                                class148.field2334[var6++] = class45.field543 ? 1 : 0;
                                continue;
                            }
                            if (var434 == 6118) {
                                class148.field2334[var6++] = class189.field3315;
                                continue;
                            }
                            if (var434 == 6119) {
                                class148.field2334[var6++] = class211.field3801;
                                continue;
                            }
                            if (var434 == 6120) {
                                class148.field2334[var6++] = class70.field977;
                                continue;
                            }
                            if (var434 == 6121) {
                                class148.field2334[var6++] = 0;
                                continue;
                            }
                        } else if (var434 < 6300) {
                            if (var434 == 6200) {
                                var6 -= 2;
                                class100.field1441 = (short) class148.field2334[var6];
                                if (class100.field1441 <= 0) {
                                    class100.field1441 = 256;
                                }
                                class218.field3918 = (short) class148.field2334[var6 + 1];
                                if (class218.field3918 <= 0) {
                                    class218.field3918 = 205;
                                }
                                continue;
                            }
                            if (var434 == 6201) {
                                var6 -= 2;
                                class98.field1422 = (short) class148.field2334[var6];
                                if (class98.field1422 <= 0) {
                                    class98.field1422 = 256;
                                }
                                class102.field1479 = (short) class148.field2334[var6 + 1];
                                if (class102.field1479 <= 0) {
                                    class102.field1479 = 320;
                                }
                                continue;
                            }
                            if (var434 == 6202) {
                                var6 -= 4;
                                class153.field2479 = (short) class148.field2334[var6];
                                if (class153.field2479 <= 0) {
                                    class153.field2479 = 1;
                                }
                                class91.field1336 = (short) class148.field2334[var6 + 1];
                                if (class91.field1336 <= 0) {
                                    class91.field1336 = 32767;
                                } else if (class153.field2479 > class91.field1336) {
                                    class91.field1336 = class153.field2479;
                                }
                                class219.field3920 = (short) class148.field2334[var6 + 2];
                                if (class219.field3920 <= 0) {
                                    class219.field3920 = 1;
                                }
                                class177.field2981 = (short) class148.field2334[var6 + 3];
                                if (class177.field2981 <= 0) {
                                    class177.field2981 = 32767;
                                } else if (class219.field3920 > class177.field2981) {
                                    class177.field2981 = class219.field3920;
                                }
                                continue;
                            }
                            if (var434 == 6203) {
                                class212.method1464(class130.field1845.field2997, false, 128, class130.field1845.field3085, 0, 0);
                                class148.field2334[var6++] = class6.field50;
                                class148.field2334[var6++] = class173.field2921;
                                continue;
                            }
                            if (var434 == 6204) {
                                class148.field2334[var6++] = class98.field1422;
                                class148.field2334[var6++] = class102.field1479;
                                continue;
                            }
                            if (var434 == 6205) {
                                class148.field2334[var6++] = class100.field1441;
                                class148.field2334[var6++] = class218.field3918;
                                continue;
                            }
                        } else if (var434 < 6400) {
                            if (var434 == 6300) {
                                class148.field2334[var6++] = (int) (class183.method1195((byte) 119) / 60000L);
                                continue;
                            }
                            if (var434 == 6301) {
                                class148.field2334[var6++] = (int) (class183.method1195((byte) 125) / 86400000L) - 11745;
                                continue;
                            }
                            if (var434 == 6302) {
                                var6 -= 3;
                                int var243 = class148.field2334[var6];
                                int var244 = class148.field2334[var6 + 1];
                                int var245 = class148.field2334[var6 + 2];
                                class21.field264.clear();
                                class21.field264.set(11, 12);
                                class21.field264.set(var245, var244, var243);
                                class148.field2334[var6++] = (int) (class21.field264.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var434 == 6303) {
                                class21.field264.clear();
                                class21.field264.setTime(new Date(class183.method1195((byte) 125)));
                                class148.field2334[var6++] = class21.field264.get(1);
                                continue;
                            }
                            if (var434 == 6304) {
                                var6--;
                                int var246 = class148.field2334[var6];
                                boolean var247 = true;
                                if (var246 < 0) {
                                    var247 = (var246 + 1) % 4 == 0;
                                } else if (var246 < 1582) {
                                    var247 = var246 % 4 == 0;
                                } else if (var246 % 4 != 0) {
                                    var247 = false;
                                } else if (var246 % 100 != 0) {
                                    var247 = true;
                                } else if (var246 % 400 != 0) {
                                    var247 = false;
                                }
                                class148.field2334[var6++] = var247 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var434 == 4400) {
                        var6 -= 2;
                        int var355 = class148.field2334[var6 + 1];
                        int var356 = class148.field2334[var6];
                        class246 var357 = class238.method1595(var355, 11);
                        if (var357.method1682(93)) {
                            class218.field3915[var7++] = class83.method521(var356, (byte) 98).method906(arg2 - 8933, var357.field4384, var355);
                        } else {
                            class148.field2334[var6++] = class83.method521(var356, (byte) 58).method902((byte) 83, var357.field4375, var355);
                        }
                        continue;
                    }
                } else {
                    class178 var62;
                    if (var434 >= 2000) {
                        var6--;
                        var62 = class201.method1356(class148.field2334[var6], (byte) 123);
                        var434 -= 1000;
                    } else {
                        var62 = var46 ? class1.field7 : class41.field472;
                    }
                    if (var434 == 1300) {
                        var6--;
                        int var63 = class148.field2334[var6] - 1;
                        if (var63 >= 0 && var63 <= 9) {
                            var7--;
                            var62.method1159(class218.field3915[var7], (byte) 101, var63);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var434 == 1301) {
                        var6 -= 2;
                        int var64 = class148.field2334[var6];
                        int var65 = class148.field2334[var6 + 1];
                        var62.field3032 = class62.method394(0, var64, var65);
                        continue;
                    }
                    if (var434 == 1302) {
                        var6--;
                        var62.field3125 = class148.field2334[var6] == 1;
                        continue;
                    }
                    if (var434 == 1303) {
                        var6--;
                        var62.field3104 = class148.field2334[var6];
                        continue;
                    }
                    if (var434 == 1304) {
                        var6--;
                        var62.field3051 = class148.field2334[var6];
                        continue;
                    }
                    if (var434 == 1305) {
                        var7--;
                        var62.field3133 = class218.field3915[var7];
                        continue;
                    }
                    if (var434 == 1306) {
                        var7--;
                        var62.field3127 = class218.field3915[var7];
                        continue;
                    }
                    if (var434 == 1307) {
                        var62.field3113 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var433) {
            if (var5.field1442 == null) {
                if (class211.field3797 != 0) {
                    class236.method1586(class227.field4059, 96, 0, class30.field382);
                }
                class165.method1054(35, "CS2 - scr:" + var5.field1850 + " op:" + var9, var433);
            } else {
                class196 var429 = class158.method994(30, (byte) 106);
                var429.method1323(48, class110.field1567).method1323(48, var5.field1442);
                for (int var430 = class103.field1483 - 1; var430 >= 0; var430--) {
                    var429.method1323(arg2 - 8904, class12.field139).method1323(48, class77.field1116[var430].field2933.field1442);
                }
                if (var9 == 40) {
                    int var431 = var8[var10];
                    var429.method1323(48, class58.field780).method1323(48, class163.method1029(var431, false));
                }
                if (class211.field3797 != 0) {
                    class236.method1586(class93.method572(-123, new class196[] { class92.field1348, var5.field1442 }), 112, 0, class30.field382);
                }
                class165.method1054(35, "CS2 - scr:" + var5.field1850 + " op:" + var9 + new String(var429.method1316(arg2 ^ 0x22F8)), var433);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1838 = arg6;
        this.field1837 = arg3;
        this.field1830 = arg2;
        this.field1839 = arg1;
        this.field1834 = arg4;
        this.field1831 = arg0;
        this.field1829 = arg5;
    }
}
