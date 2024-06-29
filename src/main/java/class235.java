import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class235 extends class21 {

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
    private int field3686 = 2048;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    private int field3687 = 1;

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "I")
    private int field3693 = 5;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "[S")
    private short[] field3688 = new short[512];

    @OriginalMember(owner = "client!ao", name = "Y", descriptor = "I")
    private int field3696 = 2;

    @OriginalMember(owner = "client!ao", name = "W", descriptor = "[B")
    private byte[] field3694 = new byte[512];

    @OriginalMember(owner = "client!ao", name = "bb", descriptor = "I")
    private int field3699 = 0;

    @OriginalMember(owner = "client!ao", name = "eb", descriptor = "I")
    private int field3702 = 5;

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3691 = "Connection lost.";

    @OriginalMember(owner = "client!ao", name = "fb", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!ao", name = "cb", descriptor = "[I")
    public static int[] field3700 = new int[14];

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ao", name = "X", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ao", name = "Z", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!ao", name = "db", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ao", name = "gb", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "Lbm;")
    public static class307 field3690;

    @OriginalMember(owner = "client!ao", name = "ab", descriptor = "Lbm;")
    public static class307 field3698;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)V", line = 5)
    private final void method1562(int arg0) {
        field3692++;
        Random var2 = new Random((long) this.field3699);
        if (arg0 != -10324) {
            return;
        }
        this.field3688 = new short[512];
        if (this.field3686 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field3688[var3] = (short) class220.method1462(var2, -861395680, this.field3686);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(B)V", line = 32)
    public final void method183(byte arg0) {
        field3695++;
        this.field3694 = class118.method773(this.field3699, true);
        if (arg0 > 82) {
            this.method1562(-10324);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[I", line = 49)
    public final int[] method177(int arg0, int arg1) {
        int[] var3 = this.field443.method1040(arg1, false);
        field3697++;
        if (this.field443.field2637) {
            int var4 = class330.field5058[arg1] * this.field3702 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class294.field4489; var7++) {
                class228.field3606 = Integer.MAX_VALUE;
                class48.field997 = Integer.MAX_VALUE;
                class24.field481 = Integer.MAX_VALUE;
                class240.field3756 = Integer.MAX_VALUE;
                int var8 = class51.field1027[var7] * this.field3693 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field3694[(var11 >= this.field3702 ? var11 - this.field3702 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field3694[var12 + (var13 >= this.field3693 ? var13 - this.field3693 : var13) & 0xFF] & 0xFF) * 2;
                        int var28 = var14 + 1;
                        int var15 = var8 - this.field3688[var14] - (var13 << 12);
                        int var16 = var4 - this.field3688[var28] - (var11 << 12);
                        int var17 = this.field3687;
                        int var20;
                        if (var17 == 1) {
                            var20 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var18 = var16 >= 0 ? var16 : -var16;
                            int var19 = var15 >= 0 ? var15 : -var15;
                            var20 = var19 <= var18 ? var18 : var19;
                        } else if (var17 == 4) {
                            int var23 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var24 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var25 = var23 + var24;
                            var20 = var25 * var25 >> 12;
                        } else if (var17 == 5) {
                            int var21 = var15 * var15;
                            int var22 = var16 * var16;
                            var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var20 = (var16 >= 0 ? var16 : -var16) + (var15 >= 0 ? var15 : -var15);
                        } else {
                            var20 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class240.field3756 > var20) {
                            class228.field3606 = class48.field997;
                            class48.field997 = class24.field481;
                            class24.field481 = class240.field3756;
                            class240.field3756 = var20;
                        } else if (class24.field481 > var20) {
                            class228.field3606 = class48.field997;
                            class48.field997 = class24.field481;
                            class24.field481 = var20;
                        } else if (var20 < class48.field997) {
                            class228.field3606 = class48.field997;
                            class48.field997 = var20;
                        } else if (class228.field3606 > var20) {
                            class228.field3606 = var20;
                        }
                    }
                }
                int var26 = this.field3696;
                if (var26 == 0) {
                    var3[var7] = class240.field3756;
                } else if (var26 == 1) {
                    var3[var7] = class24.field481;
                } else if (var26 == 3) {
                    var3[var7] = class48.field997;
                } else if (var26 == 4) {
                    var3[var7] = class228.field3606;
                } else if (var26 == 2) {
                    var3[var7] = class24.field481 - class240.field3756;
                }
            }
        }
        int var27 = 75 % ((arg0 - 33) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 259)
    public class235() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(B)V", line = 285)
    public static void method1563(byte arg0) {
        field3690 = null;
        field3698 = null;
        if (arg0 < 119) {
            field3698 = (class307) null;
        }
        field3691 = null;
        field3700 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILag;)V", line = 320)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            field3689 = 24;
        }
        field3685++;
        if (arg1 == 0) {
            this.field3693 = this.field3702 = arg2.method1317((byte) -81);
        } else if (arg1 == 1) {
            this.field3699 = arg2.method1317((byte) -126);
        } else if (arg1 == 2) {
            this.field3686 = arg2.method1315(14289);
        } else if (arg1 == 3) {
            this.field3696 = arg2.method1317((byte) -102);
        } else if (arg1 == 4) {
            this.field3687 = arg2.method1317((byte) -98);
        } else if (arg1 == 5) {
            this.field3693 = arg2.method1317((byte) -101);
        } else if (arg1 == 6) {
            this.field3702 = arg2.method1317((byte) -93);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIBII)V", line = 401)
    public static final void method1564(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3704++;
        int var7 = 87 / ((arg4 + 68) / 52);
        class151.field2468 = 0;
        for (int var8 = -1; var8 < class305.field4623 + class285.field4417; var8++) {
            class109 var9;
            if (var8 == -1) {
                var9 = class66.field1265;
            } else if (var8 < class305.field4623) {
                var9 = class97.field1715[class283.field4384[var8]];
            } else {
                var9 = class8.field179[class131.field2226[var8 - class305.field4623]];
            }
            if (var9 != null && var9.method701(-7080)) {
                if (var9 instanceof class255) {
                    class44 var10 = ((class255) var9).field3991;
                    if (var10.field888 != null) {
                        var10 = var10.method338(17911);
                    }
                    if (var10 == null) {
                        continue;
                    }
                }
                if (class305.field4623 <= var8) {
                    class44 var16 = ((class255) var9).field3991;
                    if (var16.field888 != null) {
                        var16 = var16.method338(17911);
                    }
                    if (var16.field890 >= 0 && class324.field4950.length > var16.field890) {
                        int var17;
                        if (var16.field847 == -1) {
                            var17 = var9.method703(-32768) + 15;
                        } else {
                            var17 = var16.field847 + 15;
                        }
                        class324.method2249(var17, arg5 >> 1, arg1 >> 1, arg3, var9, arg2, false);
                        if (class132.field2233 > -1) {
                            class324.field4950[var16.field890].method901(class132.field2233 + arg6 - 12, class24.field476 + arg0 + -30);
                        }
                    }
                    class339[] var18 = class342.field5313;
                    for (int var19 = 0; var19 < var18.length; var19++) {
                        class339 var20 = var18[var19];
                        if (var20 != null && var20.field5260 == 1 && class131.field2226[var8 - class305.field4623] == var20.field5258 && class25.field494 % 20 < 10) {
                            int var21;
                            if (var16.field847 == -1) {
                                var21 = var9.method703(-32768) + 15;
                            } else {
                                var21 = var16.field847 + 15;
                            }
                            class324.method2249(var21, arg5 >> 1, arg1 >> 1, arg3, var9, arg2, false);
                            if (class132.field2233 > -1) {
                                class158.field2593[var20.field5249].method901(class132.field2233 + arg6 - 12, arg0 + -28 - -class24.field476);
                            }
                        }
                    }
                } else {
                    int var11 = 30;
                    class278 var12 = (class278) var9;
                    if (var12.field4271 != -1 || var12.field4257 != -1) {
                        class324.method2249(var9.method703(-32768) + 15, arg5 >> 1, arg1 >> 1, arg3, var9, arg2, false);
                        if (class132.field2233 > -1) {
                            if (var12.field4271 != -1) {
                                class61.field1177[var12.field4271].method901(class132.field2233 + arg6 - 12, class24.field476 + arg0 - var11);
                                var11 += 25;
                            }
                            if (var12.field4257 != -1) {
                                class324.field4950[var12.field4257].method901(arg6 - (12 - class132.field2233), class24.field476 + arg0 + -var11);
                                var11 += 25;
                            }
                        }
                    }
                    if (var8 >= 0) {
                        class339[] var13 = class342.field5313;
                        for (int var14 = 0; var14 < var13.length; var14++) {
                            class339 var15 = var13[var14];
                            if (var15 != null && var15.field5260 == 10 && class283.field4384[var8] == var15.field5258) {
                                class324.method2249(var9.method703(-32768) + 15, arg5 >> 1, arg1 >> 1, arg3, var9, arg2, false);
                                if (class132.field2233 > -1) {
                                    class158.field2593[var15.field5249].method901(class132.field2233 + arg6 - 12, arg0 - (-class24.field476 - -var11));
                                }
                            }
                        }
                    }
                }
                if (var9.field1942 != null && (var8 >= class305.field4623 || class260.field4066 == 0 || class260.field4066 == 3 || class260.field4066 == 1 && class87.method610(0, ((class278) var9).field4269))) {
                    class324.method2249(var9.method703(-32768), arg5 >> 1, arg1 >> 1, arg3, var9, arg2, false);
                    if (class132.field2233 > -1 && class151.field2468 < class29.field559) {
                        class29.field560[class151.field2468] = class214.field3428.method2118(var9.field1942) / 2;
                        class29.field554[class151.field2468] = class214.field3428.field4733;
                        class29.field550[class151.field2468] = class132.field2233;
                        class29.field557[class151.field2468] = class24.field476;
                        class29.field546[class151.field2468] = var9.field1880;
                        class29.field556[class151.field2468] = var9.field1913;
                        class29.field544[class151.field2468] = var9.field1890;
                        class29.field553[class151.field2468] = var9.field1942;
                        class151.field2468++;
                    }
                }
                if (var9.field1943 > class25.field494) {
                    class283 var22 = class71.field1497[1];
                    class283 var23 = class71.field1497[0];
                    int var27;
                    if (var9 instanceof class255) {
                        class255 var24 = (class255) var9;
                        class283[] var25 = (class283[]) ((class283[]) class269.field4156.method1881(true, (long) var24.field3991.field853));
                        if (var25 == null) {
                            var25 = class6.method60(var24.field3991.field853, class154.field2514, 0, false);
                            if (var25 != null) {
                                class269.field4156.method1880(var25, (long) var24.field3991.field853, 71);
                            }
                        }
                        if (var25 != null && var25.length == 2) {
                            var23 = var25[0];
                            var22 = var25[1];
                        }
                        class44 var26 = var24.field3991;
                        if (var26.field847 == -1) {
                            var27 = var9.method703(-32768);
                        } else {
                            var27 = var26.field847;
                        }
                    } else {
                        var27 = var9.method703(-32768);
                    }
                    class324.method2249(var27 + var23.field4383 + 10, arg5 >> 1, arg1 >> 1, arg3, var9, arg2, false);
                    if (class132.field2233 > -1) {
                        int var28 = class132.field2233 + arg6 - (var23.field4377 >> 1);
                        int var29 = class24.field476 + arg0 - 3;
                        var23.method901(var28, var29);
                        int var30 = var9.field1934 * var23.field4377 / 255;
                        int var31 = var23.field4383;
                        if (class249.field3893) {
                            class115.method762(var28, var29, var28 + var30, var29 + var31);
                        } else {
                            class270.method1813(var28, var29, var28 + var30, var29 - -var31);
                        }
                        var22.method901(var28, var29);
                        if (class249.field3893) {
                            class115.method757(arg6, arg0, arg1 + arg6, arg0 + arg5);
                        } else {
                            class270.method1806(arg6, arg0, arg1 + arg6, arg0 - -arg5);
                        }
                    }
                }
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var9.field1926[var32] > class25.field494) {
                        int var35;
                        if (var9 instanceof class255) {
                            class255 var33 = (class255) var9;
                            class44 var34 = var33.field3991;
                            if (var34.field847 == -1) {
                                var35 = var9.method703(-32768) / 2;
                            } else {
                                var35 = var34.field847 / 2;
                            }
                        } else {
                            var35 = var9.method703(-32768) / 2;
                        }
                        class324.method2249(var35, arg5 >> 1, arg1 >> 1, arg3, var9, arg2, false);
                        if (class132.field2233 > -1) {
                            if (var32 == 1) {
                                class24.field476 -= 20;
                            }
                            if (var32 == 2) {
                                class24.field476 -= 10;
                                class132.field2233 -= 15;
                            }
                            if (var32 == 3) {
                                class24.field476 -= 10;
                                class132.field2233 += 15;
                            }
                            class221.field3507[var9.field1941[var32]].method901(class132.field2233 + arg6 - 12, arg0 + -12 - -class24.field476);
                            class71.field1494.method2105(Integer.toString(var9.field1929[var32]), class132.field2233 + arg6 - 1, arg0 - -class24.field476 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var36 = 0; var36 < class151.field2468; var36++) {
            int var37 = class29.field557[var36];
            int var38 = class29.field550[var36];
            int var39 = class29.field560[var36];
            int var40 = class29.field554[var36];
            boolean var41 = true;
            while (var41) {
                var41 = false;
                for (int var42 = 0; var42 < var36; var42++) {
                    if ((class29.field557[var42] - class29.field554[var42]) < (var37 + 2) && (class29.field557[var42] + 2) > (var37 - var40) && var38 - var39 < class29.field560[var42] + class29.field550[var42] && var38 + var39 > class29.field550[var42] + -class29.field560[var42] && var37 > (class29.field557[var42] - class29.field554[var42])) {
                        var37 = class29.field557[var42] - class29.field554[var42];
                        var41 = true;
                    }
                }
            }
            class132.field2233 = class29.field550[var36];
            class24.field476 = class29.field557[var36] = var37;
            String var43 = class29.field553[var36];
            if (class11.field221 == 0) {
                int var44 = 16776960;
                if (class29.field546[var36] < 6) {
                    var44 = class112.field1974[class29.field546[var36]];
                }
                if (class29.field546[var36] == 6) {
                    var44 = class158.field2589 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class29.field546[var36] == 7) {
                    var44 = class158.field2589 % 20 >= 10 ? 65535 : 255;
                }
                if (class29.field546[var36] == 8) {
                    var44 = class158.field2589 % 20 < 10 ? 45056 : 8454016;
                }
                if (class29.field546[var36] == 9) {
                    int var45 = 150 - class29.field544[var36];
                    if (var45 < 50) {
                        var44 = var45 * 1280 + 16711680;
                    } else if (var45 < 100) {
                        var44 = 16384000 + 16776960 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var44 = (var45 - 100) * 5 + 65280;
                    }
                }
                if (class29.field546[var36] == 10) {
                    int var46 = 150 - class29.field544[var36];
                    if (var46 < 50) {
                        var44 = var46 * 5 + 16711680;
                    } else if (var46 < 100) {
                        var44 = 16384000 - (var46 * 327680 - 16711935);
                    } else if (var46 < 150) {
                        var44 = ((var46 - 100) * 327680) + 755 - (var46 * 5);
                    }
                }
                if (class29.field546[var36] == 11) {
                    int var47 = 150 - class29.field544[var36];
                    if (var47 < 50) {
                        var44 = 16777215 - (var47 * 327685);
                    } else if (var47 < 100) {
                        var44 = (var47 - 50) * 327685 + 65280;
                    } else if (var47 < 150) {
                        var44 = 16777215 - ((var47 - 100) * 327680);
                    }
                }
                if (class29.field556[var36] == 0) {
                    class214.field3428.method2105(var43, class132.field2233 + arg6, class24.field476 + arg0, var44, 0);
                }
                if (class29.field556[var36] == 1) {
                    class214.field3428.method2108(var43, class132.field2233 + arg6, class24.field476 + arg0, var44, 0, class158.field2589);
                }
                if (class29.field556[var36] == 2) {
                    class214.field3428.method2112(var43, arg6 + class132.field2233, class24.field476 + arg0, var44, 0, class158.field2589);
                }
                if (class29.field556[var36] == 3) {
                    class214.field3428.method2124(var43, class132.field2233 + arg6, class24.field476 + arg0, var44, 0, class158.field2589, 150 - class29.field544[var36]);
                }
                if (class29.field556[var36] == 4) {
                    int var48 = (150 - class29.field544[var36]) * (class214.field3428.method2118(var43) + 100) / 150;
                    if (class249.field3893) {
                        class115.method762(arg6 + class132.field2233 - 50, arg0, class132.field2233 + arg6 + 50, arg0 + arg5);
                    } else {
                        class270.method1813(arg6 - (50 - class132.field2233), arg0, class132.field2233 + arg6 + 50, arg0 + arg5);
                    }
                    class214.field3428.method2120(var43, arg6 - (-class132.field2233 - 50) - var48, class24.field476 + arg0, var44, 0);
                    if (class249.field3893) {
                        class115.method757(arg6, arg0, arg1 + arg6, arg0 + arg5);
                    } else {
                        class270.method1806(arg6, arg0, arg1 + arg6, arg0 - -arg5);
                    }
                }
                if (class29.field556[var36] == 5) {
                    int var49 = 0;
                    int var50 = 150 - class29.field544[var36];
                    if (class249.field3893) {
                        class115.method762(arg6, arg0 + class24.field476 - class214.field3428.field4733 - 1, arg1 + arg6, class24.field476 + arg0 + 5);
                    } else {
                        class270.method1813(arg6, arg0 + class24.field476 - class214.field3428.field4733 - 1, arg1 + arg6, class24.field476 + arg0 + 5);
                    }
                    if (var50 < 25) {
                        var49 = var50 - 25;
                    } else if (var50 > 125) {
                        var49 = var50 - 125;
                    }
                    class214.field3428.method2105(var43, class132.field2233 + arg6, arg0 - -class24.field476 + var49, var44, 0);
                    if (class249.field3893) {
                        class115.method757(arg6, arg0, arg1 + arg6, arg0 + arg5);
                    } else {
                        class270.method1806(arg6, arg0, arg1 + arg6, arg0 - -arg5);
                    }
                }
            } else {
                class214.field3428.method2105(var43, class132.field2233 + arg6, class24.field476 + arg0, 16776960, 0);
            }
        }
    }
}
