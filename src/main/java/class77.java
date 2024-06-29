import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class77 extends class362 {

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    private int field1327;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Ljl;")
    public static class332 field1342 = new class332(32);

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field1344 = -1;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field1343 = 0;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 8)
    public static void method636(int arg0) {
        field1342 = null;
        int var1 = 69 / ((4 - arg0) / 42);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLqm;)La;", line = 18)
    public static final class310 method637(byte arg0, class227 arg1) {
        if (arg0 != 117) {
            return (class310) null;
        }
        field1328++;
        arg1.method1720((byte) -51);
        int var2 = arg1.method1720((byte) -81);
        class310 var3 = class310.method2202(var2, (byte) 87);
        var3.field4948 = arg1.method1720((byte) -61);
        int var4 = arg1.method1720((byte) -13);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1720((byte) -32);
            var3.method75(arg1, arg0 ^ 0xFFFFF62F, var6);
        }
        var3.method553((byte) -86);
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V", line = 59)
    public static final void method638(int arg0) {
        class272.field4518 = 0;
        if (arg0 != 3118) {
            return;
        }
        int var1 = (class6.field55.field3577 >> 7) + class93.field1562;
        field1331++;
        int var2 = (class6.field55.field3511 >> 7) + class275.field4546;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class272.field4518 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class272.field4518 = 1;
        }
        if (class272.field4518 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class272.field4518 = 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILwf;III)V", line = 87)
    public static final void method639(int arg0, class250 arg1, int arg2, int arg3, int arg4) {
        class195.method1506(false);
        if (class42.field607) {
            class244.method1871(arg0, arg2, arg1.field4081 + arg0, arg2 - -arg1.field4157);
        } else {
            class246.method1889(arg0, arg2, arg1.field4081 + arg0, arg1.field4157 + arg2);
        }
        if (class338.field5387 != 2 && class338.field5387 != 5 && class190.field3046 != null) {
            int var5;
            int var6;
            int var7;
            int var8;
            if (class112.field1827 == 4) {
                var5 = class350.field5565;
                var6 = 256;
                var7 = class240.field3954;
                var8 = (int) class261.field4396 & 0x7FF;
            } else {
                var5 = class6.field55.field3577;
                var7 = class6.field55.field3511;
                var8 = (int) class261.field4396 + class79.field1372 & 0x7FF;
                var6 = class4.field41 + 256;
            }
            int var9 = 464 - (var7 / 32);
            int var10 = var5 / 32 + 48;
            if (class42.field607) {
                ((class58) class190.field3046).method495(arg0, arg2, arg1.field4081, arg1.field4157, var10, var9, var8, var6, (class58) arg1.method1940((byte) 93, false));
            } else {
                ((class351) class190.field3046).method945(arg0, arg2, arg1.field4081, arg1.field4157, var10, var9, var8, var6, arg1.field4208, arg1.field4188);
            }
            if (class267.field4470 != null) {
                for (int var11 = 0; var11 < class267.field4470.field3980; var11++) {
                    if (class267.field4470.field3981[var11] != null && class267.field4470.field3977[var11] >> 28 == class186.field2991) {
                        int var12 = ((class267.field4470.field3977[var11] & 0xFFFEBCD) >> 14) - class93.field1562;
                        int var13 = (class267.field4470.field3977[var11] & 0x3FFF) - class275.field4546;
                        if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                            int var14 = var12 * 4 + 2 - (var5 / 32);
                            int var15 = var13 * 4 + 2 - (var7 / 32);
                            class257.method1970(var14, class267.field4470.field3981[var11].field1011, var15, arg0, arg1, arg2, -1);
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < class232.field3856; var16++) {
                int var17 = class216.field3454[var16] * 4 + 2 - (var7 / 32);
                int var18 = class340.field5431[var16] * 4 + 2 - (var5 / 32);
                class29 var19 = class166.method1292(0, class25.field311[var16]);
                if (var19.field418 != null) {
                    var19 = var19.method177(5000);
                    if (var19 == null || var19.field388 == -1) {
                        continue;
                    }
                }
                class257.method1970(var18, var19.field388, var17, arg0, arg1, arg2, -1);
            }
            for (int var20 = 0; var20 < 104; var20++) {
                for (int var21 = 0; var21 < 104; var21++) {
                    class327 var22 = class211.field3372[class186.field2991][var20][var21];
                    if (var22 != null) {
                        int var23 = var20 * 4 + 2 - (var5 / 32);
                        int var24 = var21 * 4 + 2 - (var7 / 32);
                        class344.method2423(arg1, (byte) -118, arg2, var23, var24, arg0, class87.field1487[0]);
                    }
                }
            }
            for (int var25 = 0; var25 < class35.field508; var25++) {
                class288 var26 = class165.field2621[class330.field5253[var25]];
                if (var26 != null && var26.method1646((byte) -7)) {
                    class121 var27 = var26.field4692;
                    if (var27 != null && var27.field2066 != null) {
                        var27 = var27.method958((byte) -115);
                    }
                    if (var27 != null && var27.field2077 && var27.field2036) {
                        int var28 = var26.field3511 / 32 - var7 / 32;
                        int var29 = var26.field3577 / 32 - (var5 / 32);
                        if (var27.field2047 == -1) {
                            class344.method2423(arg1, (byte) -127, arg2, var29, var28, arg0, class87.field1487[1]);
                        } else {
                            class257.method1970(var29, var27.field2047, var28, arg0, arg1, arg2, -1);
                        }
                    }
                }
            }
            for (int var30 = 0; var30 < class345.field5501; var30++) {
                class258 var31 = class56.field924[class306.field4895[var30]];
                if (var31 != null && var31.method1646((byte) -7)) {
                    int var32 = var31.field3577 / 32 - (var5 / 32);
                    int var33 = var31.field3511 / 32 - var7 / 32;
                    boolean var34 = false;
                    for (int var35 = 0; var35 < class38.field570; var35++) {
                        if (var31.field4349.equals(class241.field3986[var35]) && class65.field1147[var35] != 0) {
                            var34 = true;
                            break;
                        }
                    }
                    boolean var36 = false;
                    for (int var37 = 0; var37 < class313.field4980; var37++) {
                        if (var31.field4349.equals(class306.field4891[var37].field1813)) {
                            var36 = true;
                            break;
                        }
                    }
                    boolean var38 = false;
                    if (class6.field55.field4317 != 0 && var31.field4317 != 0 && class6.field55.field4317 == var31.field4317) {
                        var38 = true;
                    }
                    if (var34) {
                        class344.method2423(arg1, (byte) -119, arg2, var32, var33, arg0, class87.field1487[3]);
                    } else if (var36) {
                        class344.method2423(arg1, (byte) -115, arg2, var32, var33, arg0, class87.field1487[5]);
                    } else if (var38) {
                        class344.method2423(arg1, (byte) -125, arg2, var32, var33, arg0, class87.field1487[4]);
                    } else {
                        class344.method2423(arg1, (byte) -113, arg2, var32, var33, arg0, class87.field1487[2]);
                    }
                }
            }
            class273[] var39 = class74.field1261;
            for (int var40 = 0; var40 < var39.length; var40++) {
                class273 var41 = var39[var40];
                if (var41 != null && var41.field4529 != 0 && class332.field5261 % 20 < 10) {
                    if (var41.field4529 == 1 && var41.field4525 >= 0 && var41.field4525 < class165.field2621.length) {
                        class288 var42 = class165.field2621[var41.field4525];
                        if (var42 != null) {
                            int var43 = var42.field3577 / 32 - (var5 / 32);
                            int var44 = var42.field3511 / 32 - var7 / 32;
                            class45.method332(16, var41.field4531, var43, var44, arg0, arg1, arg2, 360000);
                        }
                    }
                    if (var41.field4529 == 2) {
                        int var45 = (var41.field4532 - class275.field4546) * 4 + 2 - var7 / 32;
                        int var46 = (var41.field4534 - class93.field1562) * 4 + 2 - (var5 / 32);
                        int var47 = var41.field4530 * 4;
                        int var48 = var47 * var47;
                        class45.method332(16, var41.field4531, var46, var45, arg0, arg1, arg2, var48);
                    }
                    if (var41.field4529 == 10 && var41.field4525 >= 0 && class56.field924.length > var41.field4525) {
                        class258 var49 = class56.field924[var41.field4525];
                        if (var49 != null) {
                            int var50 = var49.field3577 / 32 - (var5 / 32);
                            int var51 = var49.field3511 / 32 - var7 / 32;
                            class45.method332(16, var41.field4531, var50, var51, arg0, arg1, arg2, 360000);
                        }
                    }
                }
            }
            if (class112.field1827 != 4) {
                if (class241.field3988 != 0) {
                    int var52 = (class241.field3988 * 4 - (-(class6.field55.method1634(-1) * 2) - -2)) + 2 - (var5 / 32);
                    int var53 = class335.field5305 * 4 + (-(var7 / 32) - (-(class6.field55.method1634(-1) * 2) + 2)) + 2;
                    class344.method2423(arg1, (byte) -125, arg2, var52, var53, arg0, class48.field771[class326.field5182 ? 1 : 0]);
                }
                if (class42.field607) {
                    class244.method1862(arg1.field4081 / 2 + arg0 - 1, arg1.field4157 / 2 + -1 + arg2, 3, 3, 16777215);
                } else {
                    class246.method1885(arg1.field4081 / 2 + arg0 - 1, arg1.field4157 / 2 + arg2 - 1, 3, 3, 16777215);
                }
            }
        } else if (class42.field607) {
            class17 var54 = arg1.method1940((byte) 99, false);
            if (var54 != null) {
                var54.method89(arg0, arg2);
            }
        } else {
            class246.method1895(arg0, arg2, 0, arg1.field4208, arg1.field4188);
        }
        field1330++;
        int var55 = -110 / ((arg4 + 54) / 38);
        class12.field115[arg3] = true;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 422)
    public class77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1341 = arg4;
        this.field1326 = arg6;
        this.field1336 = arg1;
        this.field1327 = arg5;
        this.field1332 = arg3;
        this.field1325 = arg0;
        this.field1329 = arg7;
        this.field1335 = arg2;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V", line = 439)
    public static final void method640(int arg0, int arg1) {
        field1333++;
        if (arg0 > -21) {
            method637((byte) 61, (class227) null);
        }
        class321 var2 = class46.method370(2, (byte) -106, arg1);
        var2.method2261(-129);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I", line = 455)
    public static final int method641(int arg0, int arg1, int arg2) {
        field1340++;
        class354 var3 = (class354) class329.field5229.method1268(-35, (long) arg0);
        if (var3 == null) {
            return -1;
        } else {
            if (arg1 <= 103) {
                field1343 = -111;
            }
            return arg2 >= 0 && arg2 < var3.field5617.length ? var3.field5617[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V", line = 475)
    public final void method642(byte arg0, int arg1, int arg2) {
        if (arg0 > 12) {
            field1339++;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZI)V", line = 487)
    public final void method643(int arg0, boolean arg1, int arg2) {
        field1338++;
        if (!arg1) {
            this.field1332 = -65;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZII)V", line = 498)
    public final void method644(boolean arg0, int arg1, int arg2) {
        int var4 = this.field1325 * arg2 >> 12;
        field1334++;
        int var5 = this.field1336 * arg1 >> 12;
        int var6 = this.field1341 * arg2 >> 12;
        int var7 = this.field1327 * arg1 >> 12;
        int var8 = this.field1335 * arg2 >> 12;
        int var9 = this.field1326 * arg2 >> 12;
        int var10 = this.field1332 * arg1 >> 12;
        int var11 = this.field1329 * arg1 >> 12;
        class226.method1706(var7, var5, var11, var9, var6, var4, var8, 83, this.field5744, var10);
        if (!arg0) {
            this.field1327 = 96;
        }
    }
}
