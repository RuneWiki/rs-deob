import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class259 {

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public int field3963 = -1;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
    public boolean field3960 = false;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Z")
    public boolean field3959 = false;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    private int field3969 = 0;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    private int field3975 = 0;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    private int field3973 = 128;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    private int field3981 = 128;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    private int field3986 = 0;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
    public static int[] field3958 = new int[2];

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field3961 = 0;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field3967 = 0;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field3985 = 255;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3984 = "glow1:";

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field3978 = -2;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    private int field3970;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Luf;")
    public static class176 field3983;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "[S")
    private short[] field3964;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[S")
    private short[] field3965;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "[S")
    private short[] field3971;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[S")
    private short[] field3974;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "[[B")
    public static byte[][] field3987;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLf;)V")
    public final void method1714(byte arg0, class37 arg1) {
        if (arg0 != -79) {
            this.method1718(109, (class37) null, (byte) -108);
        }
        field3982++;
        while (true) {
            int var3 = arg1.method333((byte) -59);
            if (var3 == 0) {
                return;
            }
            this.method1718(var3, arg1, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lwd;Z)V")
    public static final void method1715(class23 arg0, boolean arg1) {
        class241.field3722.method1013(312991604, arg0);
        while (true) {
            class23 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class23[][] var7;
            class23 var66;
            do {
                class23 var65;
                do {
                    class23 var64;
                    do {
                        class23 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class23) class241.field3722.method1011(118);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field362);
                                            var3 = var2.field357;
                                            var4 = var2.field350;
                                            var5 = var2.field359;
                                            var6 = var2.field364;
                                            var7 = class255.field3907[var5];
                                            if (!var2.field349) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class23 var8 = class255.field3907[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field362) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class117.field1818 && var3 > class19.field297) {
                                                    class23 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field362 && (var9.field349 || (var2.field340 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class117.field1818 && var3 < class41.field670 - 1) {
                                                    class23 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field362 && (var10.field349 || (var2.field340 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class195.field3076 && var4 > class202.field3161) {
                                                    class23 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field362 && (var11.field349 || (var2.field340 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class195.field3076 && var4 < class47.field780 - 1) {
                                                    class23 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field362 && (var12.field349 || (var2.field340 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field349 = false;
                                            if (var2.field343 != null) {
                                                class23 var13 = var2.field343;
                                                if (var13.field347 == null) {
                                                    if (var13.field342 != null) {
                                                        if (class228.method1513(0, var3, var4)) {
                                                            class239.method1609(var13.field342, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var3, var4, true);
                                                        } else {
                                                            class239.method1609(var13.field342, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class228.method1513(0, var3, var4)) {
                                                    class70.method547(var13.field347, 0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var3, var4, true);
                                                } else {
                                                    class70.method547(var13.field347, 0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var3, var4, false);
                                                }
                                                class228 var14 = var13.field344;
                                                if (var14 != null) {
                                                    var14.field3565.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var14.field3561 - class102.field1630, var14.field3563 - class58.field894, var14.field3574 - class239.field3713, var14.field3564, var5, (class240) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field360; var15++) {
                                                    class172 var16 = var13.field358[var15];
                                                    if (var16 != null) {
                                                        var16.field2566.method225(var16.field2552, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var16.field2568 - class102.field1630, var16.field2559 - class58.field894, var16.field2570 - class239.field3713, var16.field2569, var5, (class240) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field347 == null) {
                                                if (var2.field342 != null) {
                                                    if (class228.method1513(var6, var3, var4)) {
                                                        class239.method1609(var2.field342, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class239.method1609(var2.field342, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var3, var4, false);
                                                    }
                                                }
                                            } else if (class228.method1513(var6, var3, var4)) {
                                                class70.method547(var2.field347, var6, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field347.field3771 != 12345678 || class222.field3479 && var5 <= class48.field793) {
                                                    class70.method547(var2.field347, var6, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class180 var18 = var2.field363;
                                                if (var18 != null && (var18.field2686 & 0x80000000L) != 0L) {
                                                    var18.field2689.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var18.field2692 - class102.field1630, var18.field2687 - class58.field894, var18.field2688 - class239.field3713, var18.field2686, var5, (class240) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class228 var21 = var2.field344;
                                            class247 var22 = var2.field356;
                                            if (var21 != null || var22 != null) {
                                                if (class117.field1818 == var3) {
                                                    var19++;
                                                } else if (class117.field1818 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class195.field3076 == var4) {
                                                    var19 += 3;
                                                } else if (class195.field3076 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class146.field2261[var19];
                                                var2.field352 = class109.field1727[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3571 & class45.field721[var19]) == 0) {
                                                    var2.field355 = 0;
                                                } else if (var21.field3571 == 16) {
                                                    var2.field355 = 3;
                                                    var2.field353 = class249.field3842[var19];
                                                    var2.field341 = 3 - var2.field353;
                                                } else if (var21.field3571 == 32) {
                                                    var2.field355 = 6;
                                                    var2.field353 = class111.field1748[var19];
                                                    var2.field341 = 6 - var2.field353;
                                                } else if (var21.field3571 == 64) {
                                                    var2.field355 = 12;
                                                    var2.field353 = class5.field95[var19];
                                                    var2.field341 = 12 - var2.field353;
                                                } else {
                                                    var2.field355 = 9;
                                                    var2.field353 = class164.field2493[var19];
                                                    var2.field341 = 9 - var2.field353;
                                                }
                                                if ((var21.field3571 & var20) != 0 && !class120.method861(var6, var3, var4, var21.field3571)) {
                                                    var21.field3565.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var21.field3561 - class102.field1630, var21.field3563 - class58.field894, var21.field3574 - class239.field3713, var21.field3564, var5, (class240) null);
                                                }
                                                if ((var21.field3572 & var20) != 0 && !class120.method861(var6, var3, var4, var21.field3572)) {
                                                    var21.field3570.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var21.field3561 - class102.field1630, var21.field3563 - class58.field894, var21.field3574 - class239.field3713, var21.field3564, var5, (class240) null);
                                                }
                                            }
                                            if (var22 != null && !class202.method1359(var6, var3, var4, var22.field3814.method223())) {
                                                if ((var22.field3813 & var20) != 0) {
                                                    var22.field3814.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var22.field3821 + var22.field3809 - class102.field1630, var22.field3823 - class58.field894, var22.field3811 + var22.field3810 - class239.field3713, var22.field3820, var5, (class240) null);
                                                } else if (var22.field3813 == 256) {
                                                    int var23 = var22.field3821 - class102.field1630;
                                                    int var24 = var22.field3823 - class58.field894;
                                                    int var25 = var22.field3811 - class239.field3713;
                                                    int var26 = var22.field3815;
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
                                                        var22.field3814.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var22.field3809 + var23, var24, var22.field3810 + var25, var22.field3820, var5, (class240) null);
                                                    } else if (var22.field3816 != null) {
                                                        var22.field3816.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var23, var24, var25, var22.field3820, var5, (class240) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class180 var29 = var2.field363;
                                                if (var29 != null && (var29.field2686 & 0x80000000L) == 0L) {
                                                    var29.field2689.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var29.field2692 - class102.field1630, var29.field2687 - class58.field894, var29.field2688 - class239.field3713, var29.field2686, var5, (class240) null);
                                                }
                                                class175 var30 = var2.field345;
                                                if (var30 != null && var30.field2603 == 0) {
                                                    if (var30.field2602 != null) {
                                                        var30.field2602.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var30.field2598 - class102.field1630, var30.field2600 - class58.field894, var30.field2604 - class239.field3713, var30.field2596, var5, (class240) null);
                                                    }
                                                    if (var30.field2593 != null) {
                                                        var30.field2593.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var30.field2598 - class102.field1630, var30.field2600 - class58.field894, var30.field2604 - class239.field3713, var30.field2596, var5, (class240) null);
                                                    }
                                                    if (var30.field2606 != null) {
                                                        var30.field2606.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var30.field2598 - class102.field1630, var30.field2600 - class58.field894, var30.field2604 - class239.field3713, var30.field2596, var5, (class240) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field340;
                                            if (var31 != 0) {
                                                if (var3 < class117.field1818 && (var31 & 0x4) != 0) {
                                                    class23 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field362) {
                                                        class241.field3722.method1013(312991604, var32);
                                                    }
                                                }
                                                if (var4 < class195.field3076 && (var31 & 0x2) != 0) {
                                                    class23 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field362) {
                                                        class241.field3722.method1013(312991604, var33);
                                                    }
                                                }
                                                if (var3 > class117.field1818 && (var31 & 0x1) != 0) {
                                                    class23 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field362) {
                                                        class241.field3722.method1013(312991604, var34);
                                                    }
                                                }
                                                if (var4 > class195.field3076 && (var31 & 0x8) != 0) {
                                                    class23 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field362) {
                                                        class241.field3722.method1013(312991604, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field355 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field360; var37++) {
                                                if (class90.field1449 != var2.field358[var37].field2556 && (var2.field346[var37] & var2.field355) == var2.field353) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class228 var38 = var2.field344;
                                                if (!class120.method861(var6, var3, var4, var38.field3571)) {
                                                    var38.field3565.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var38.field3561 - class102.field1630, var38.field3563 - class58.field894, var38.field3574 - class239.field3713, var38.field3564, var5, (class240) null);
                                                }
                                                var2.field355 = 0;
                                            }
                                        }
                                        if (!var2.field351) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field360;
                                            var2.field351 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class172 var42 = var2.field358[var41];
                                                if (class90.field1449 != var42.field2556) {
                                                    for (int var43 = var42.field2558; var43 <= var42.field2565; var43++) {
                                                        for (int var44 = var42.field2560; var44 <= var42.field2563; var44++) {
                                                            class23 var45 = var7[var43][var44];
                                                            if (var45.field349) {
                                                                var2.field351 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field355 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2558) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2565) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2560) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2563) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field355) == var2.field341) {
                                                                    var2.field351 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class295.field4642[var40++] = var42;
                                                    int var47 = class117.field1818 - var42.field2558;
                                                    int var48 = var42.field2565 - class117.field1818;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class195.field3076 - var42.field2560;
                                                    int var50 = var42.field2563 - class195.field3076;
                                                    if (var50 > var49) {
                                                        var42.field2557 = var47 + var50;
                                                    } else {
                                                        var42.field2557 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class172 var54 = class295.field4642[var53];
                                                    if (class90.field1449 != var54.field2556) {
                                                        if (var54.field2557 > var51) {
                                                            var51 = var54.field2557;
                                                            var52 = var53;
                                                        } else if (var54.field2557 == var51) {
                                                            int var55 = var54.field2568 - class102.field1630;
                                                            int var56 = var54.field2570 - class239.field3713;
                                                            int var57 = class295.field4642[var52].field2568 - class102.field1630;
                                                            int var58 = class295.field4642[var52].field2570 - class239.field3713;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class172 var59 = class295.field4642[var52];
                                                var59.field2556 = class90.field1449;
                                                if (!class13.method133(var6, var59.field2558, var59.field2565, var59.field2560, var59.field2563, var59.field2566.method223())) {
                                                    var59.field2566.method225(var59.field2552, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var59.field2568 - class102.field1630, var59.field2559 - class58.field894, var59.field2570 - class239.field3713, var59.field2569, var5, (class240) null);
                                                }
                                                for (int var60 = var59.field2558; var60 <= var59.field2565; var60++) {
                                                    for (int var61 = var59.field2560; var61 <= var59.field2563; var61++) {
                                                        class23 var62 = var7[var60][var61];
                                                        if (var62.field355 != 0) {
                                                            class241.field3722.method1013(312991604, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field362) {
                                                            class241.field3722.method1013(312991604, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field351) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field351 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field362);
                            } while (var2.field355 != 0);
                            if (var3 > class117.field1818 || var3 <= class19.field297) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field362);
                        if (var3 < class117.field1818 || var3 >= class41.field670 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field362);
                    if (var4 > class195.field3076 || var4 <= class202.field3161) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field362);
                if (var4 < class195.field3076 || var4 >= class47.field780 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field362);
            var2.field362 = false;
            class44.field704--;
            class175 var67 = var2.field345;
            if (var67 != null && var67.field2603 != 0) {
                if (var67.field2602 != null) {
                    var67.field2602.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var67.field2598 - class102.field1630, var67.field2600 - class58.field894 - var67.field2603, var67.field2604 - class239.field3713, var67.field2596, var5, (class240) null);
                }
                if (var67.field2593 != null) {
                    var67.field2593.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var67.field2598 - class102.field1630, var67.field2600 - class58.field894 - var67.field2603, var67.field2604 - class239.field3713, var67.field2596, var5, (class240) null);
                }
                if (var67.field2606 != null) {
                    var67.field2606.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var67.field2598 - class102.field1630, var67.field2600 - class58.field894 - var67.field2603, var67.field2604 - class239.field3713, var67.field2596, var5, (class240) null);
                }
            }
            if (var2.field352 != 0) {
                class247 var68 = var2.field356;
                if (var68 != null && !class202.method1359(var6, var3, var4, var68.field3814.method223())) {
                    if ((var68.field3813 & var2.field352) != 0) {
                        var68.field3814.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var68.field3821 + var68.field3809 - class102.field1630, var68.field3823 - class58.field894, var68.field3811 + var68.field3810 - class239.field3713, var68.field3820, var5, (class240) null);
                    } else if (var68.field3813 == 256) {
                        int var69 = var68.field3821 - class102.field1630;
                        int var70 = var68.field3823 - class58.field894;
                        int var71 = var68.field3811 - class239.field3713;
                        int var72 = var68.field3815;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field3814.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var68.field3809 + var69, var70, var68.field3810 + var71, var68.field3820, var5, (class240) null);
                        } else if (var68.field3816 != null) {
                            var68.field3816.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var69, var70, var71, var68.field3820, var5, (class240) null);
                        }
                    }
                }
                class228 var75 = var2.field344;
                if (var75 != null) {
                    if ((var75.field3572 & var2.field352) != 0 && !class120.method861(var6, var3, var4, var75.field3572)) {
                        var75.field3570.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var75.field3561 - class102.field1630, var75.field3563 - class58.field894, var75.field3574 - class239.field3713, var75.field3564, var5, (class240) null);
                    }
                    if ((var75.field3571 & var2.field352) != 0 && !class120.method861(var6, var3, var4, var75.field3571)) {
                        var75.field3565.method225(0, class84.field1385, class127.field1993, class224.field3526, class75.field1257, var75.field3561 - class102.field1630, var75.field3563 - class58.field894, var75.field3574 - class239.field3713, var75.field3564, var5, (class240) null);
                    }
                }
            }
            if (var5 < class179.field2680 - 1) {
                class23 var76 = class255.field3907[var5 + 1][var3][var4];
                if (var76 != null && var76.field362) {
                    class241.field3722.method1013(312991604, var76);
                }
            }
            if (var3 < class117.field1818) {
                class23 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field362) {
                    class241.field3722.method1013(312991604, var77);
                }
            }
            if (var4 < class195.field3076) {
                class23 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field362) {
                    class241.field3722.method1013(312991604, var78);
                }
            }
            if (var3 > class117.field1818) {
                class23 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field362) {
                    class241.field3722.method1013(312991604, var79);
                }
            }
            if (var4 > class195.field3076) {
                class23 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field362) {
                    class241.field3722.method1013(312991604, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIIBIIII)V")
    public static final void method1716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12) {
        field3957++;
        class146 var13 = new class146();
        var13.field2263 = arg10;
        var13.field2267 = arg12;
        if (arg8 != 37) {
            return;
        }
        var13.field2271 = arg11;
        var13.field2264 = arg3;
        var13.field2274 = arg4;
        var13.field2270 = arg6;
        var13.field2262 = arg1;
        var13.field2269 = arg5;
        var13.field2275 = arg7;
        var13.field2266 = arg9;
        var13.field2265 = arg0;
        var13.field2268 = arg2;
        class69.field1092.method1013(312991604, var13);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)Lrg;")
    public final class233 method1717(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -29868) {
            this.field3963 = 61;
        }
        class233 var5 = (class233) class267.field4257.method1780((long) this.field3979, (byte) -111);
        field3962++;
        if (var5 == null) {
            class183 var6 = class183.method1225(class35.field555, this.field3970, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field3971 != null) {
                for (int var7 = 0; var7 < this.field3971.length; var7++) {
                    var6.method1200(this.field3971[var7], this.field3964[var7]);
                }
            }
            if (this.field3974 != null) {
                for (int var8 = 0; var8 < this.field3974.length; var8++) {
                    var6.method1216(this.field3974[var8], this.field3965[var8]);
                }
            }
            var5 = var6.method1210(this.field3975 + 64, 850 - -this.field3986, -30, -50, -30);
            class267.field4257.method1784(var5, false, (long) this.field3979);
        }
        class233 var9;
        if (this.field3963 == -1 || arg2 == -1) {
            var9 = var5.method1537(true, true, true);
        } else {
            var9 = class28.method224(this.field3963, 53).method1485(arg2, var5, arg0, arg1, (byte) 96);
        }
        if (this.field3981 != 128 || this.field3973 != 128) {
            var9.method1544(this.field3981, this.field3973, this.field3981);
        }
        if (this.field3969 != 0) {
            if (this.field3969 == 90) {
                var9.method1528();
            }
            if (this.field3969 == 180) {
                var9.method1530();
            }
            if (this.field3969 == 270) {
                var9.method1540();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILf;B)V")
    private final void method1718(int arg0, class37 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3970 = arg1.method293(-56);
        } else if (arg0 == 2) {
            this.field3963 = arg1.method293(100);
        } else if (arg0 == 4) {
            this.field3981 = arg1.method293(-53);
        } else if (arg0 == 5) {
            this.field3973 = arg1.method293(-94);
        } else if (arg0 == 6) {
            this.field3969 = arg1.method293(118);
        } else if (arg0 == 7) {
            this.field3975 = arg1.method333((byte) -59);
        } else if (arg0 == 8) {
            this.field3986 = arg1.method333((byte) -59);
        } else if (arg0 == 9) {
            this.field3960 = true;
        } else if (arg0 == 10) {
            this.field3959 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method333((byte) -59);
            this.field3971 = new short[var4];
            this.field3964 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3971[var5] = (short) arg1.method293(90);
                this.field3964[var5] = (short) arg1.method293(-51);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method333((byte) -59);
            this.field3965 = new short[var6];
            this.field3974 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3974[var7] = (short) arg1.method293(-3);
                this.field3965[var7] = (short) arg1.method293(-4);
            }
        }
        if (arg2 <= 123) {
            method1720((byte) 35);
        }
        field3976++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static final void method1719(boolean arg0) {
        class92.field1480 = -1;
        class6.field108 = 0;
        class171.field2549 = 0;
        class8.field182 = 1;
        class35.field572 = -3;
        class297.field4686 = arg0;
        field3972++;
        class171.field2543 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method1720(byte arg0) {
        field3984 = null;
        field3983 = null;
        if (arg0 != -96) {
            method1721(-16, -72);
        }
        field3987 = null;
        field3958 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I")
    public static final int method1721(int arg0, int arg1) {
        field3980++;
        int var2 = 0;
        if (arg0 != 19049) {
            return 103;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }
}
