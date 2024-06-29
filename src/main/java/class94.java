import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class94 extends class86 {

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    private int field1439 = 585;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1440 = "Allocated memory";

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1441 = "glow1:";

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "Ltn;")
    public static class252 field1434;

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 3)
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(II)V", line = 9)
    public static final void method836(int arg0, int arg1) {
        field1437++;
        int var2 = class151.field2465;
        int var3 = class64.field975;
        int var4 = class10.field143;
        int var5 = class191.field3005;
        int var6 = class15.field248;
        int var7 = (int) class313.field4846 + class106.field1592 & 0x7FF;
        int var8 = (int) class279.field4312;
        if (class66.field1004 / 256 > var8) {
            var8 = class66.field1004 / 256;
        }
        if (class32.field495[4] && (class284.field4389[4] + 128) > var8) {
            var8 = class284.field4389[4] + 128;
        }
        class118.method1003(class231.field3609, (var8 * 3) + 600, var8, class226.field3519, (byte) -126, class193.method1469(class173.field2746.field1286, class173.field2746.field1359, (byte) -47, class119.field1826) - 50, var7, arg1);
        if (class151.field2465 == var2 && class64.field975 == var3 && class10.field143 == var4 && class191.field3005 == var5 && class15.field248 == var6) {
            class314.field4858 = 1;
            return;
        }
        class236.field3671 = 10;
        class98.field1482 = 10;
        class29.field476 = 10;
        if (var5 < class191.field3005) {
            var5 += (class191.field3005 - var5) * class98.field1482 / 1000 + class29.field476;
            if (var5 < class191.field3005) {
                class191.field3005 = var5;
            }
        }
        if (var5 > class191.field3005) {
            int var9 = var5 - ((var5 - class191.field3005) * class98.field1482 / 1000 + class29.field476);
            if (class191.field3005 < var9) {
                class191.field3005 = var9;
            }
        }
        int var10 = class15.field248 - var6;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        class279.field4305 = 10;
        if (class151.field2465 > var2) {
            var2 += (class151.field2465 - var2) * class236.field3671 / 1000 + class279.field4305;
            if (var2 < class151.field2465) {
                class151.field2465 = var2;
            }
        }
        if (var2 > class151.field2465) {
            int var11 = var2 - ((var2 - class151.field2465) * class236.field3671 / 1000 + class279.field4305);
            if (class151.field2465 < var11) {
                class151.field2465 = var11;
            }
        }
        if (var3 < class64.field975) {
            var3 += class279.field4305 + ((class64.field975 - var3) * class236.field3671 / 1000);
            if (class64.field975 > var3) {
                class64.field975 = var3;
            }
        }
        if (var3 > class64.field975) {
            int var12 = var3 - ((var3 - class64.field975) * class236.field3671 / 1000 + class279.field4305);
            if (class64.field975 < var12) {
                class64.field975 = var12;
            }
        }
        if (arg0 != 0) {
            return;
        }
        if (var4 < class10.field143) {
            var4 += (class10.field143 - var4) * class236.field3671 / 1000 + class279.field4305;
            if (var4 < class10.field143) {
                class10.field143 = var4;
            }
        }
        if (var10 < -1024) {
            var10 += 2048;
        }
        if (var10 > 0) {
            int var13 = class98.field1482 * var10 / 1000 + class29.field476 + var6;
            var6 = var13 & 0x7FF;
        }
        if (class10.field143 < var4) {
            int var14 = var4 - (class279.field4305 + ((var4 - class10.field143) * class236.field3671 / 1000));
            if (var14 > class10.field143) {
                class10.field143 = var14;
            }
        }
        if (var10 < 0) {
            int var15 = var6 - (-var10 * class98.field1482 / 1000 + class29.field476);
            var6 = var15 & 0x7FF;
        }
        int var16 = class15.field248 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var10 <= 0 || var16 > 0 && var10 < 0) {
            class15.field248 = var6;
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V", line = 157)
    public static void method837(int arg0) {
        field1434 = null;
        field1441 = null;
        field1440 = null;
        if (arg0 != -22390) {
            field1440 = (String) null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZLug;)V", line = 173)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field1436++;
        if (arg0 == 0) {
            this.field1439 = arg2.method314((byte) 126);
        }
        if (arg1) {
            this.field1439 = 108;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V", line = 206)
    public static final void method838(int arg0, boolean arg1) {
        class14.field235 = new int[104];
        class297.field4608 = new int[arg0];
        field1433++;
        class317.field4889 = new int[104];
        class93.field1406 = new int[5];
        class174.field2760 = new int[104];
        class176.field2782 = 99;
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class66.field1002 = new int[104];
        class337.field5188 = new byte[var2][104][104];
        class235.field3658 = new byte[var2][105][105];
        class197.field3082 = new byte[var2][104][104];
        class239.field3722 = new byte[var2][104][104];
        class19.field314 = new byte[var2][104][104];
        class190.field2979 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lrn;Lrn;I)V", line = 233)
    public static final void method839(class18 arg0, class18 arg1, int arg2) {
        field1443++;
        class64.field978 = arg0;
        class151.field2471 = arg1;
        if (arg2 != -17381) {
            field1434 = (class252) null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[I", line = 247)
    public final int[] method158(int arg0, int arg1) {
        field1438++;
        if (arg1 < 7) {
            this.method157(118, false, (class25) null);
        }
        int[] var3 = this.field1225.method1914(arg0, 58);
        if (this.field1225.field3995) {
            int var4 = class135.field2257[arg0];
            for (int var5 = 0; var5 < class93.field1424; var5++) {
                int var6 = class347.field5515[var5];
                if (var6 > this.field1439 && 4096 - this.field1439 > var6 && var4 > 2048 - this.field1439 && (this.field1439 + 2048) > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1439);
                    var3[var5] = 4096 - var10;
                } else if ((2048 - this.field1439) < var6 && this.field1439 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field1439;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1439);
                } else if (var4 < this.field1439 || 4096 - this.field1439 < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field1439;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1439);
                } else if (this.field1439 <= var6 && (4096 - this.field1439) >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field1439);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IJ)V", line = 329)
    public static final void method840(int arg0, long arg1) {
        field1435++;
        int var3 = class46.field739 + class173.field2746.field1359;
        if (!class278.field4292) {
            class313.field4846 += (float) arg1 * class101.field1531 / 40.0F;
            class279.field4312 += (float) arg1 * class121.field1935 / 40.0F;
        }
        int var4 = class202.field3127 + class173.field2746.field1286;
        if (class231.field3609 - var3 < -500 || class231.field3609 - var3 > 500 || class226.field3519 - var4 < -500 || class226.field3519 - var4 > 500) {
            class226.field3519 = var4;
            class231.field3609 = var3;
        }
        if (class231.field3609 != var3) {
            int var5 = var3 - class231.field3609;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class231.field3609 += var6;
        }
        if (arg0 != 4) {
            method838(57, true);
        }
        if (class226.field3519 != var4) {
            int var7 = var4 - class226.field3519;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class226.field3519 += var8;
        }
        class304.method2189((byte) -101);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lqf;IIIII)V", line = 420)
    public static final void method841(class64 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class335.field5119 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class154.field2492) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class166.field2642 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class329 var14 = class170.field2689[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class277.field4290[var11][var12 + 1][var13] + class277.field4290[var11][var12][var13] + class277.field4290[var11][var12][var13 + 1] + class277.field4290[var11][var12 + 1][var13 + 1]) / 4 - (class277.field4290[arg1][arg2 + 1][arg3] + class277.field4290[arg1][arg2][arg3] + class277.field4290[arg1][arg2][arg3 + 1] + class277.field4290[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class202 var16 = var14.field5064;
                                    if (var16 != null) {
                                        if (var16.field3121.method390()) {
                                            arg0.method394(var16.field3121, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3116 != null && var16.field3116.method390()) {
                                            arg0.method394(var16.field3116, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field5063; var17++) {
                                        class297 var18 = var14.field5070[var17];
                                        if (var18 != null && var18.field4605.method390() && (var18.field4616 == var12 || var7 == var12) && (var18.field4614 == var13 || var9 == var13)) {
                                            int var19 = var18.field4606 + 1 - var18.field4616;
                                            int var20 = var18.field4612 + 1 - var18.field4614;
                                            arg0.method394(var18.field4605, (var18.field4616 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4614 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
