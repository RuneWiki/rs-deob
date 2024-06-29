import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class234 implements class46 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "Z")
    public static boolean field4209 = true;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Z")
    public static boolean field4212 = true;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "Lcc;")
    private static class209 field4214 = class95.method669(96, "Close");

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Lcc;")
    public static class209 field4208 = field4214;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4211 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lbj;")
    public static class154 field4215;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lsj;")
    public static class49 field4217;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "[I")
    public static int[] field4219;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "[Lsb;")
    public static class224[] field4218;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "[Lji;")
    public static class42[] field4216;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "[[[B")
    public static byte[][][] field4213;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
    public static final void method1625(int arg0, int arg1, int arg2) {
        class195 var3 = class178.method1229(arg1, arg2, 5);
        var3.method1338(arg2 ^ 0x1);
        field4210++;
        var3.field3511 = arg0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([IJII)Lcc;")
    public final class209 method341(int[] arg0, long arg1, int arg2, int arg3) {
        field4206++;
        int var6 = 6 / ((-arg2 - 12) / 58);
        if (arg3 == 0) {
            class176 var7 = class100.method697(arg0[0], 256);
            return var7.method1216((int) arg1, (byte) -79);
        } else if (arg3 == 1 || arg3 == 10) {
            class82 var8 = class249.method1728((int) arg1, true);
            return var8.field1629;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class100.method697(arg0[0], 256).method1216((int) arg1, (byte) 104);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static final void method1626(int arg0) {
        field4207++;
        int var1 = 0;
        if (arg0 != 20224) {
            method1627((class109) null, false);
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class166.method1147(38, true, var1, class106.field2089, var2, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lfi;Z)V")
    public static final void method1627(class109 arg0, boolean arg1) {
        class73.field1386.method1123(arg0, (byte) -127);
        while (true) {
            class109 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class109[][] var7;
            class109 var82;
            do {
                class109 var81;
                do {
                    class109 var80;
                    do {
                        class109 var79;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class109) class73.field1386.method1124((byte) 127);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2190);
                                            var3 = var2.field2196;
                                            var4 = var2.field2215;
                                            var5 = var2.field2208;
                                            var6 = var2.field2193;
                                            var7 = class106.field2089[var5];
                                            if (!var2.field2206) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class109 var8 = class106.field2089[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2190) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class20.field390 && var3 > class21.field401) {
                                                    class109 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2190 && (var9.field2206 || (var2.field2199 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class20.field390 && var3 < class102.field1954 - 1) {
                                                    class109 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2190 && (var10.field2206 || (var2.field2199 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class126.field2442 && var4 > class52.field1025) {
                                                    class109 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2190 && (var11.field2206 || (var2.field2199 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class126.field2442 && var4 < class206.field3675 - 1) {
                                                    class109 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2190 && (var12.field2206 || (var2.field2199 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2206 = false;
                                            if (var2.field2216 != null) {
                                                class109 var13 = var2.field2216;
                                                if (var13.field2217 == null) {
                                                    if (var13.field2214 != null) {
                                                        if (class224.method1579(0, var3, var4)) {
                                                            class154.method1067(var13.field2214, class201.field3595, class167.field3015, class5.field76, class209.field3789, var3, var4, true);
                                                        } else {
                                                            class154.method1067(var13.field2214, class201.field3595, class167.field3015, class5.field76, class209.field3789, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class224.method1579(0, var3, var4)) {
                                                    class32.method256(var13.field2217, 0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var3, var4, true);
                                                } else {
                                                    class32.method256(var13.field2217, 0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var3, var4, false);
                                                }
                                                class187 var14 = var13.field2213;
                                                if (var14 != null) {
                                                    var14.field3377.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var14.field3380 - class272.field4824, var14.field3372 - class215.field3878, var14.field3378 - class87.field1732, var14.field3385, var5, (class221) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field2203; var15++) {
                                                    class264 var16 = var13.field2189[var15];
                                                    if (var16 != null) {
                                                        var16.field4735.method208(var16.field4736, class201.field3595, class167.field3015, class5.field76, class209.field3789, var16.field4734 - class272.field4824, var16.field4743 - class215.field3878, var16.field4740 - class87.field1732, var16.field4733, var5, (class221) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2217 == null) {
                                                if (var2.field2214 != null) {
                                                    if (class224.method1579(var6, var3, var4)) {
                                                        class154.method1067(var2.field2214, class201.field3595, class167.field3015, class5.field76, class209.field3789, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class154.method1067(var2.field2214, class201.field3595, class167.field3015, class5.field76, class209.field3789, var3, var4, false);
                                                    }
                                                }
                                            } else if (class224.method1579(var6, var3, var4)) {
                                                class32.method256(var2.field2217, var6, class201.field3595, class167.field3015, class5.field76, class209.field3789, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2217.field1148 != 12345678 || class224.field4080 && var5 <= class110.field2227) {
                                                    class32.method256(var2.field2217, var6, class201.field3595, class167.field3015, class5.field76, class209.field3789, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class230 var18 = var2.field2198;
                                                if (var18 != null && (var18.field4171 & 0x80000000L) != 0L) {
                                                    var18.field4183.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var18.field4175 - class272.field4824, var18.field4179 - class215.field3878, var18.field4180 - class87.field1732, var18.field4171, var5, (class221) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class187 var21 = var2.field2213;
                                            class181 var22 = var2.field2218;
                                            if (var21 != null || var22 != null) {
                                                if (class20.field390 == var3) {
                                                    var19++;
                                                } else if (class20.field390 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class126.field2442 == var4) {
                                                    var19 += 3;
                                                } else if (class126.field2442 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class210.field3827[var19];
                                                var2.field2191 = class131.field2506[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3376 & class11.field211[var19]) == 0) {
                                                    var2.field2204 = 0;
                                                } else if (var21.field3376 == 16) {
                                                    var2.field2204 = 3;
                                                    var2.field2209 = class220.field4007[var19];
                                                    var2.field2197 = 3 - var2.field2209;
                                                } else if (var21.field3376 == 32) {
                                                    var2.field2204 = 6;
                                                    var2.field2209 = class115.field2322[var19];
                                                    var2.field2197 = 6 - var2.field2209;
                                                } else if (var21.field3376 == 64) {
                                                    var2.field2204 = 12;
                                                    var2.field2209 = class28.field495[var19];
                                                    var2.field2197 = 12 - var2.field2209;
                                                } else {
                                                    var2.field2204 = 9;
                                                    var2.field2209 = class214.field3859[var19];
                                                    var2.field2197 = 9 - var2.field2209;
                                                }
                                                if ((var21.field3376 & var20) != 0 && !class18.method173(var6, var3, var4, var21.field3376)) {
                                                    var21.field3377.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var21.field3380 - class272.field4824, var21.field3372 - class215.field3878, var21.field3378 - class87.field1732, var21.field3385, var5, (class221) null);
                                                }
                                                if ((var21.field3371 & var20) != 0 && !class18.method173(var6, var3, var4, var21.field3371)) {
                                                    var21.field3387.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var21.field3380 - class272.field4824, var21.field3372 - class215.field3878, var21.field3378 - class87.field1732, var21.field3385, var5, (class221) null);
                                                }
                                            }
                                            if (var22 != null && !class174.method1198(var6, var3, var4, var22.field3269.method216())) {
                                                if ((var22.field3275 & var20) != 0) {
                                                    var22.field3269.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var22.field3266 + var22.field3281 - class272.field4824, var22.field3274 - class215.field3878, var22.field3280 + var22.field3262 - class87.field1732, var22.field3270, var5, (class221) null);
                                                } else if (var22.field3275 == 256) {
                                                    int var23 = var22.field3266 - class272.field4824;
                                                    int var24 = var22.field3274 - class215.field3878;
                                                    int var25 = var22.field3280 - class87.field1732;
                                                    int var26 = var22.field3277;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3269.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var22.field3281 + var23, var24, var22.field3262 + var25, var22.field3270, var5, (class221) null);
                                                    } else if (var22.field3265 != null) {
                                                        var22.field3265.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var23, var24, var25, var22.field3270, var5, (class221) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class230 var29 = var2.field2198;
                                                if (var29 != null && (var29.field4171 & 0x80000000L) == 0L) {
                                                    var29.field4183.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var29.field4175 - class272.field4824, var29.field4179 - class215.field3878, var29.field4180 - class87.field1732, var29.field4171, var5, (class221) null);
                                                }
                                                class253 var30 = var2.field2201;
                                                if (var30 != null && var30.field4548 == 0) {
                                                    if (var30.field4559 != null) {
                                                        var30.field4559.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var30.field4558 - class272.field4824, var30.field4549 - class215.field3878, var30.field4554 - class87.field1732, var30.field4551, var5, (class221) null);
                                                    }
                                                    if (var30.field4553 != null) {
                                                        var30.field4553.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var30.field4558 - class272.field4824, var30.field4549 - class215.field3878, var30.field4554 - class87.field1732, var30.field4551, var5, (class221) null);
                                                    }
                                                    if (var30.field4570 != null) {
                                                        var30.field4570.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var30.field4558 - class272.field4824, var30.field4549 - class215.field3878, var30.field4554 - class87.field1732, var30.field4551, var5, (class221) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2199;
                                            if (var31 != 0) {
                                                if (var3 < class20.field390 && (var31 & 0x4) != 0) {
                                                    class109 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2190) {
                                                        class73.field1386.method1123(var32, (byte) -127);
                                                    }
                                                }
                                                if (var4 < class126.field2442 && (var31 & 0x2) != 0) {
                                                    class109 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2190) {
                                                        class73.field1386.method1123(var33, (byte) -127);
                                                    }
                                                }
                                                if (var3 > class20.field390 && (var31 & 0x1) != 0) {
                                                    class109 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2190) {
                                                        class73.field1386.method1123(var34, (byte) -128);
                                                    }
                                                }
                                                if (var4 > class126.field2442 && (var31 & 0x8) != 0) {
                                                    class109 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2190) {
                                                        class73.field1386.method1123(var35, (byte) -128);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2204 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2203; var37++) {
                                                if (class261.field4695 != var2.field2189[var37].field4739 && (var2.field2194[var37] & var2.field2204) == var2.field2209) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class187 var38 = var2.field2213;
                                                if (!class18.method173(var6, var3, var4, var38.field3376)) {
                                                    var38.field3377.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var38.field3380 - class272.field4824, var38.field3372 - class215.field3878, var38.field3378 - class87.field1732, var38.field3385, var5, (class221) null);
                                                }
                                                var2.field2204 = 0;
                                            }
                                        }
                                        if (!var2.field2200) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2203;
                                            var2.field2200 = false;
                                            int var40 = 0;
                                            label584: for (int var41 = 0; var41 < var39; var41++) {
                                                class264 var42 = var2.field2189[var41];
                                                if (class261.field4695 != var42.field4739) {
                                                    for (int var43 = var42.field4746; var43 <= var42.field4747; var43++) {
                                                        for (int var44 = var42.field4741; var44 <= var42.field4731; var44++) {
                                                            class109 var45 = var7[var43][var44];
                                                            if (var45.field2206) {
                                                                var2.field2200 = true;
                                                                continue label584;
                                                            }
                                                            if (var45.field2204 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field4746) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field4747) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field4741) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field4731) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2204) == var2.field2197) {
                                                                    var2.field2200 = true;
                                                                    continue label584;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class195.field3513[var40++] = var42;
                                                    int var47 = class20.field390 - var42.field4746;
                                                    int var48 = var42.field4747 - class20.field390;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class126.field2442 - var42.field4741;
                                                    int var50 = var42.field4731 - class126.field2442;
                                                    if (var50 > var49) {
                                                        var42.field4748 = var47 + var50;
                                                    } else {
                                                        var42.field4748 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class264 var54 = class195.field3513[var53];
                                                    if (class261.field4695 != var54.field4739) {
                                                        if (var54.field4748 > var51) {
                                                            var51 = var54.field4748;
                                                            var52 = var53;
                                                        } else if (var54.field4748 == var51) {
                                                            int var55 = var54.field4734 - class272.field4824;
                                                            int var56 = var54.field4740 - class87.field1732;
                                                            int var57 = class195.field3513[var52].field4734 - class272.field4824;
                                                            int var58 = class195.field3513[var52].field4740 - class87.field1732;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class264 var59 = class195.field3513[var52];
                                                var59.field4739 = class261.field4695;
                                                if (!class170.method1166(var6, var59.field4746, var59.field4747, var59.field4741, var59.field4731, var59.field4735.method216())) {
                                                    var59.field4735.method208(var59.field4736, class201.field3595, class167.field3015, class5.field76, class209.field3789, var59.field4734 - class272.field4824, var59.field4743 - class215.field3878, var59.field4740 - class87.field1732, var59.field4733, var5, (class221) null);
                                                }
                                                for (int var60 = var59.field4746; var60 <= var59.field4747; var60++) {
                                                    for (int var61 = var59.field4741; var61 <= var59.field4731; var61++) {
                                                        class109 var62 = var7[var60][var61];
                                                        if (var62.field2204 != 0) {
                                                            class73.field1386.method1123(var62, (byte) -127);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2190) {
                                                            class73.field1386.method1123(var62, (byte) -128);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2200) {
                                                break;
                                            }
                                        } catch (Exception var97) {
                                            var2.field2200 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field2205 != null) {
                                        int var63 = class221.field4013 + class15.field281;
                                        int var64 = class221.field4018 + class15.field284;
                                        class10 var65 = var2.field2205.field4488;
                                        for (class10 var66 = var65.field198; var66 != var65; var66 = var66.field198) {
                                            class225 var67 = (class225) var66;
                                            if (var67.field4099 != null && !var67.field4099.field1971.field4024) {
                                                if ((byte) ((int) (var67.field4099.field1971.field4030 & 0xFFL)) != var2.field2219) {
                                                    var2.field2205 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field4097 >> 12) - class272.field4824;
                                                int var69 = (var67.field4098 >> 12) - class215.field3878;
                                                int var70 = (var67.field4103 >> 12) - class87.field1732;
                                                int var71 = class5.field76 * var70 + class209.field3789 * var68 >> 16;
                                                int var72 = class209.field3789 * var70 - class5.field76 * var68 >> 16;
                                                int var74 = class167.field3015 * var69 - class201.field3595 * var72 >> 16;
                                                int var75 = class201.field3595 * var69 + class167.field3015 * var72 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    class4.method38(var77, var78, var67.field4099.field1991.field3092 >> 2, var67.field4102, var67.field4102 >> 24 & 0xFF);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field2190);
                            } while (var2.field2204 != 0);
                            if (var3 > class20.field390 || var3 <= class21.field401) {
                                break;
                            }
                            var79 = var7[var3 - 1][var4];
                        } while (var79 != null && var79.field2190);
                        if (var3 < class20.field390 || var3 >= class102.field1954 - 1) {
                            break;
                        }
                        var80 = var7[var3 + 1][var4];
                    } while (var80 != null && var80.field2190);
                    if (var4 > class126.field2442 || var4 <= class52.field1025) {
                        break;
                    }
                    var81 = var7[var3][var4 - 1];
                } while (var81 != null && var81.field2190);
                if (var4 < class126.field2442 || var4 >= class206.field3675 - 1) {
                    break;
                }
                var82 = var7[var3][var4 + 1];
            } while (var82 != null && var82.field2190);
            var2.field2190 = false;
            class52.field1028--;
            class253 var83 = var2.field2201;
            if (var83 != null && var83.field4548 != 0) {
                if (var83.field4559 != null) {
                    var83.field4559.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var83.field4558 - class272.field4824, var83.field4549 - class215.field3878 - var83.field4548, var83.field4554 - class87.field1732, var83.field4551, var5, (class221) null);
                }
                if (var83.field4553 != null) {
                    var83.field4553.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var83.field4558 - class272.field4824, var83.field4549 - class215.field3878 - var83.field4548, var83.field4554 - class87.field1732, var83.field4551, var5, (class221) null);
                }
                if (var83.field4570 != null) {
                    var83.field4570.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var83.field4558 - class272.field4824, var83.field4549 - class215.field3878 - var83.field4548, var83.field4554 - class87.field1732, var83.field4551, var5, (class221) null);
                }
            }
            if (var2.field2191 != 0) {
                class181 var84 = var2.field2218;
                if (var84 != null && !class174.method1198(var6, var3, var4, var84.field3269.method216())) {
                    if ((var84.field3275 & var2.field2191) != 0) {
                        var84.field3269.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var84.field3266 + var84.field3281 - class272.field4824, var84.field3274 - class215.field3878, var84.field3280 + var84.field3262 - class87.field1732, var84.field3270, var5, (class221) null);
                    } else if (var84.field3275 == 256) {
                        int var85 = var84.field3266 - class272.field4824;
                        int var86 = var84.field3274 - class215.field3878;
                        int var87 = var84.field3280 - class87.field1732;
                        int var88 = var84.field3277;
                        int var89;
                        if (var88 == 1 || var88 == 2) {
                            var89 = -var85;
                        } else {
                            var89 = var85;
                        }
                        int var90;
                        if (var88 == 2 || var88 == 3) {
                            var90 = -var87;
                        } else {
                            var90 = var87;
                        }
                        if (var90 >= var89) {
                            var84.field3269.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var84.field3281 + var85, var86, var84.field3262 + var87, var84.field3270, var5, (class221) null);
                        } else if (var84.field3265 != null) {
                            var84.field3265.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var85, var86, var87, var84.field3270, var5, (class221) null);
                        }
                    }
                }
                class187 var91 = var2.field2213;
                if (var91 != null) {
                    if ((var91.field3371 & var2.field2191) != 0 && !class18.method173(var6, var3, var4, var91.field3371)) {
                        var91.field3387.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var91.field3380 - class272.field4824, var91.field3372 - class215.field3878, var91.field3378 - class87.field1732, var91.field3385, var5, (class221) null);
                    }
                    if ((var91.field3376 & var2.field2191) != 0 && !class18.method173(var6, var3, var4, var91.field3376)) {
                        var91.field3377.method208(0, class201.field3595, class167.field3015, class5.field76, class209.field3789, var91.field3380 - class272.field4824, var91.field3372 - class215.field3878, var91.field3378 - class87.field1732, var91.field3385, var5, (class221) null);
                    }
                }
            }
            if (var5 < class50.field983 - 1) {
                class109 var92 = class106.field2089[var5 + 1][var3][var4];
                if (var92 != null && var92.field2190) {
                    class73.field1386.method1123(var92, (byte) -128);
                }
            }
            if (var3 < class20.field390) {
                class109 var93 = var7[var3 + 1][var4];
                if (var93 != null && var93.field2190) {
                    class73.field1386.method1123(var93, (byte) -127);
                }
            }
            if (var4 < class126.field2442) {
                class109 var94 = var7[var3][var4 + 1];
                if (var94 != null && var94.field2190) {
                    class73.field1386.method1123(var94, (byte) -128);
                }
            }
            if (var3 > class20.field390) {
                class109 var95 = var7[var3 - 1][var4];
                if (var95 != null && var95.field2190) {
                    class73.field1386.method1123(var95, (byte) -128);
                }
            }
            if (var4 > class126.field2442) {
                class109 var96 = var7[var3][var4 - 1];
                if (var96 != null && var96.field2190) {
                    class73.field1386.method1123(var96, (byte) -127);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public static void method1628(int arg0) {
        field4208 = null;
        field4217 = null;
        field4219 = null;
        field4215 = null;
        field4211 = null;
        field4218 = null;
        field4213 = null;
        field4214 = null;
        field4216 = null;
        if (arg0 != 4) {
            field4220 = 122;
        }
    }
}
