import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class137 extends class1 {

    @OriginalMember(owner = "client!mi", name = "pb", descriptor = "I")
    private int field2480 = 4;

    @OriginalMember(owner = "client!mi", name = "xb", descriptor = "Z")
    private boolean field2488 = true;

    @OriginalMember(owner = "client!mi", name = "ub", descriptor = "I")
    private int field2485 = 1638;

    @OriginalMember(owner = "client!mi", name = "rb", descriptor = "I")
    private int field2482 = 4;

    @OriginalMember(owner = "client!mi", name = "Ib", descriptor = "[B")
    private byte[] field2499 = new byte[512];

    @OriginalMember(owner = "client!mi", name = "Fb", descriptor = "I")
    private int field2496 = 0;

    @OriginalMember(owner = "client!mi", name = "Jb", descriptor = "I")
    private int field2500 = 4;

    @OriginalMember(owner = "client!mi", name = "ob", descriptor = "Loc;")
    private static class151 field2479 = method873(2, "Nov");

    @OriginalMember(owner = "client!mi", name = "ib", descriptor = "Loc;")
    private static class151 field2473 = method873(2, "Mar");

    @OriginalMember(owner = "client!mi", name = "zb", descriptor = "Loc;")
    private static class151 field2490 = method873(2, "Jun");

    @OriginalMember(owner = "client!mi", name = "lb", descriptor = "Loc;")
    private static class151 field2476 = method873(2, "May");

    @OriginalMember(owner = "client!mi", name = "Bb", descriptor = "Loc;")
    private static class151 field2492 = method873(2, "Feb");

    @OriginalMember(owner = "client!mi", name = "Cb", descriptor = "Loc;")
    private static class151 field2493 = method873(2, "Jul");

    @OriginalMember(owner = "client!mi", name = "sb", descriptor = "Loc;")
    private static class151 field2483 = method873(2, "Jan");

    @OriginalMember(owner = "client!mi", name = "hb", descriptor = "Loc;")
    private static class151 field2472 = method873(2, "Oct");

    @OriginalMember(owner = "client!mi", name = "Kb", descriptor = "[I")
    public static int[] field2501 = new int[25];

    @OriginalMember(owner = "client!mi", name = "Lb", descriptor = "Loc;")
    private static class151 field2502 = method873(2, "Apr");

    @OriginalMember(owner = "client!mi", name = "Ob", descriptor = "Loc;")
    private static class151 field2505 = method873(2, "Sep");

    @OriginalMember(owner = "client!mi", name = "Mb", descriptor = "Loc;")
    private static class151 field2503 = method873(2, "Aug");

    @OriginalMember(owner = "client!mi", name = "Nb", descriptor = "Loc;")
    private static class151 field2504 = method873(2, "Dec");

    @OriginalMember(owner = "client!mi", name = "yb", descriptor = "[Loc;")
    public static class151[] field2489 = new class151[] { field2483, field2492, field2473, field2502, field2476, field2490, field2493, field2503, field2505, field2472, field2479, field2504 };

    @OriginalMember(owner = "client!mi", name = "gb", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!mi", name = "jb", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!mi", name = "kb", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!mi", name = "mb", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!mi", name = "nb", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!mi", name = "qb", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!mi", name = "vb", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!mi", name = "wb", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!mi", name = "Ab", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!mi", name = "Gb", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mi", name = "Hb", descriptor = "Lpg;")
    public static class165 field2498;

    @OriginalMember(owner = "client!mi", name = "Eb", descriptor = "Lsd;")
    public static class192 field2495;

    @OriginalMember(owner = "client!mi", name = "tb", descriptor = "[S")
    private short[] field2484;

    @OriginalMember(owner = "client!mi", name = "Db", descriptor = "[S")
    private short[] field2494;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
    private final void method868(int arg0) {
        if (this.field2485 <= 0) {
            if (this.field2484 != null && this.field2484.length == this.field2500) {
                this.field2494 = new short[this.field2500];
                for (int var2 = 0; ~this.field2500 < ~var2; ++var2) {
                    this.field2494[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field2494 = new short[this.field2500];
            this.field2484 = new short[this.field2500];
            for (int var3 = 0; this.field2500 > var3; ++var3) {
                this.field2484[var3] = (short) ((int) (Math.pow((double) ((float) this.field2485 / 4096.0F), (double) var3) * 4096.0D));
                this.field2494[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field2477;
        if (arg0 != -9) {
            method873(-94, (String) null);
        }
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V")
    private static final void method869(int arg0) {
        ++field2475;
        if (class33.field667) {
            class222.field3843 = null;
            class212.field3732 = null;
            class109.field1933 = null;
            class228.field3979 = null;
            class116.field2086 = null;
            class11.field203 = null;
            class51.field1034 = null;
            class228.field3988 = null;
            class20.field434 = null;
            class63.field1224 = null;
            class132.field2418 = null;
            class140.field2551 = null;
            int var1 = -11 % ((arg0 - -15) / 47);
            class67.field1323 = null;
            class189.field3346 = null;
            class112.field1970 = null;
            class192.field3419 = null;
            class236.field4410 = null;
            class208.field3665 = null;
            class163.field2946 = null;
            class140.field2547 = null;
            class9.field148 = null;
            class204.field3623 = null;
            class59.method396(2, 1);
            class116.method703((byte) -108, true);
            class33.field667 = false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)Lsg;")
    public static final class195 method870(int arg0, int arg1) {
        ++field2486;
        class195 var2 = (class195) class108.field1914.method1318((byte) -57, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            class195 var3 = class123.method741(class89.field1633, arg1, arg0 + 19199, false, class153.field2784);
            if (arg0 != 255) {
                method870(123, -116);
            }
            if (var3 != null) {
                class108.field1914.method1324(var3, arg0 ^ 18234, (long) arg1);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V")
    public static final void method871(int arg0, byte arg1) {
        ++field2491;
        if (class200.field3534 != arg0) {
            if (arg1 < 119) {
                method875(-106);
            }
            if (~class200.field3534 == -1) {
                class47.method338(-69);
            }
            if (arg0 == 20 || arg0 == 40) {
                class174.field3157 = 0;
                class36.field739 = 0;
                class7.field105 = 0;
            }
            if (~arg0 != -21 && ~arg0 != -41 && class44.field917 != null) {
                class44.field917.method336(-13112);
                class44.field917 = null;
            }
            if (class200.field3534 == 25) {
                class209.field3673 = 0;
                class181.field3280 = 1;
                class234.field4314 = 1;
                class91.field1671 = 0;
                class92.field1685 = 0;
            }
            if (~arg0 != -6 && ~arg0 != -11 && ~arg0 != -21) {
                method869(52);
            } else {
                class74.method484(class39.field798, class164.field2960, class23.field521, 128);
            }
            class200.field3534 = arg0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)I")
    private final int method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2474;
        int var8 = arg2 + -4096;
        int var9 = arg1 >> 12;
        int var10 = var9 + 1;
        if (arg6 != -913097364) {
            method869(44);
        }
        int var11 = arg1 & 4095;
        int var12 = var11 + -4096;
        if (var10 >= arg0) {
            var10 = 0;
        }
        int var13 = var9 & 255;
        int var14 = var10 & 255;
        int var15 = class122.field2188[var11];
        int var16 = 3 & this.field2499[arg3 + var13];
        int var17;
        if (~var16 < -2) {
            var17 = ~var16 == -3 ? -arg2 + var11 : -arg2 + -var11;
        } else {
            var17 = var16 != 0 ? arg2 - var11 : arg2 + var11;
        }
        int var18 = 3 & this.field2499[arg3 + var14];
        int var19;
        if (~var18 < -2) {
            var19 = var18 != 2 ? -arg2 + -var12 : var12 - arg2;
        } else {
            var19 = ~var18 == -1 ? arg2 + var12 : arg2 - var12;
        }
        int var20 = var17 - -((-var17 + var19) * var15 >> 12);
        int var21 = this.field2499[arg4 + var13] & 3;
        int var22;
        if (var21 > 1) {
            var22 = var21 != 2 ? -var11 - var8 : -var8 + var11;
        } else {
            var22 = var21 != 0 ? -var11 + var8 : var11 - -var8;
        }
        int var23 = 3 & this.field2499[var14 - -arg4];
        int var24;
        if (~var23 >= -2) {
            var24 = ~var23 == -1 ? var8 + var12 : -var12 + var8;
        } else {
            var24 = var23 != 2 ? -var8 + -var12 : -var8 + var12;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((-var20 + var25) * arg5 >> 12) + var20;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        this.field2499 = class205.method1297((byte) 63, this.field2496);
        this.method868(-9);
        for (int var2 = this.field2500 + -1; var2 >= 1; --var2) {
            short var3 = this.field2484[var2];
            if (var3 > 8 || ~var3 > 7) {
                break;
            }
            --this.field2500;
        }
        ++field2497;
        if (arg0 != 3) {
            field2498 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;)Loc;")
    public static final class151 method873(int arg0, String arg1) {
        ++field2487;
        byte[] var2 = arg1.getBytes();
        if (arg0 != 2) {
            return null;
        } else {
            int var3 = var2.length;
            class151 var4 = new class151();
            int var5 = 0;
            var4.field2736 = new byte[var3];
            while (var5 < var3) {
                int var6 = 255 & var2[var5++];
                if (var6 <= 45 && ~var6 <= -41) {
                    if (var5 >= var3) {
                        break;
                    }
                    int var7 = 255 & var2[var5++];
                    var4.field2736[var4.field2690++] = (byte) ((var6 + -40) * 43 - 48 + var7);
                } else if (var6 != 0) {
                    var4.field2736[var4.field2690++] = (byte) var6;
                }
            }
            var4.method975(-100);
            return var4.method991(arg0 + 4094);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field2478;
        if (arg0 != 107) {
            field2479 = null;
        }
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (super.field21.field3388) {
            int var4 = class23.field509[arg1] * this.field2480;
            if (~this.field2500 != -2) {
                short var5 = this.field2484[0];
                if (~var5 < -9 || var5 < -8) {
                    int var6 = this.field2494[0] << 12;
                    int var7 = this.field2480 * var6 >> 12;
                    int var8 = var4 * var6 >> 12;
                    int var9 = var8 >> 12;
                    int var10 = var8 & 4095;
                    int var11 = var9 - -1;
                    int var12 = class122.field2188[var10];
                    int var13 = this.field2499[var9 & 255] & 255;
                    int var14 = this.field2482 * var6 >> 12;
                    if (var7 <= var11) {
                        var11 = 0;
                    }
                    int var15 = 255 & this.field2499[var11 & 255];
                    for (int var16 = 0; ~var16 > ~class202.field3603; ++var16) {
                        int var36 = class195.field3477[var16] * this.field2482;
                        int var37 = this.method872(var14, var6 * var36 >> 12, var10, var13, var15, var12, arg0 + -913097471);
                        var3[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~this.field2500 < ~var17; ++var17) {
                    short var18 = this.field2484[var17];
                    if (var18 > 8 || var18 < -8) {
                        int var19 = this.field2494[var17] << 12;
                        int var20 = this.field2482 * var19 >> 12;
                        int var21 = var4 * var19 >> 12;
                        int var22 = var21 >> 12;
                        int var23 = var21 & 4095;
                        int var24 = this.field2480 * var19 >> 12;
                        int var25 = class122.field2188[var23];
                        int var26 = var22 + 1;
                        if (var24 <= var26) {
                            var26 = 0;
                        }
                        int var27 = 255 & this.field2499[255 & var26];
                        int var28 = 255 & this.field2499[var22 & 255];
                        if (this.field2488 && this.field2500 + -1 == var17) {
                            for (int var29 = 0; ~class202.field3603 < ~var29; ++var29) {
                                int var30 = class195.field3477[var29] * this.field2482;
                                int var31 = this.method872(var20, var19 * var30 >> 12, var23, var28, var27, var25, -913097364);
                                int var32 = var3[var29] - -(var18 * var31 >> 12);
                                var3[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; var33 < class202.field3603; ++var33) {
                                int var34 = class195.field3477[var33] * this.field2482;
                                int var35 = this.method872(var20, var19 * var34 >> 12, var23, var28, var27, var25, -913097364);
                                var3[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field2494[0] << 12;
                int var39 = this.field2482 * var38 >> 12;
                short var40 = this.field2484[0];
                int var41 = this.field2480 * var38 >> 12;
                int var42 = var4 * var38 >> 12;
                int var43 = var42 >> 12;
                int var44 = 255 & this.field2499[255 & var43];
                int var45 = var42 & 4095;
                int var46 = class122.field2188[var45];
                int var47 = var43 + 1;
                if (var41 <= var47) {
                    var47 = 0;
                }
                int var48 = this.field2499[var47 & 255] & 255;
                if (this.field2488) {
                    for (int var49 = 0; var49 < class202.field3603; ++var49) {
                        int var50 = class195.field3477[var49] * this.field2482;
                        int var51 = this.method872(var39, var38 * var50 >> 12, var45, var44, var48, var46, -913097364);
                        int var52 = var40 * var51 >> 12;
                        var3[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; class202.field3603 > var53; ++var53) {
                        int var54 = class195.field3477[var53] * this.field2482;
                        int var55 = this.method872(var39, var38 * var54 >> 12, var45, var44, var48, var46, -913097364);
                        var3[var53] = var40 * var55 >> 12;
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)Loc;")
    public static final class151 method874(int arg0, boolean arg1) {
        ++field2481;
        return arg1 ? null : class116.method709(arg0, 0, 10, false);
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class137() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)V")
    public static void method875(int arg0) {
        field2476 = null;
        field2490 = null;
        field2505 = null;
        if (arg0 != 26581) {
            method871(-7, (byte) 125);
        }
        field2502 = null;
        field2483 = null;
        field2492 = null;
        field2495 = null;
        field2493 = null;
        field2498 = null;
        field2504 = null;
        field2501 = null;
        field2503 = null;
        field2489 = null;
        field2473 = null;
        field2472 = null;
        field2479 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        ++field2471;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field2480 = arg2.method1475(255);
                                }
                            } else {
                                this.field2482 = arg2.method1475(255);
                            }
                        } else {
                            this.field2496 = arg2.method1475(255);
                        }
                    } else {
                        this.field2482 = this.field2480 = arg2.method1475(255);
                    }
                } else {
                    this.field2485 = arg2.method1466(12435);
                    if (this.field2485 < 0) {
                        this.field2484 = new short[this.field2500];
                        for (int var5 = 0; ~this.field2500 < ~var5; ++var5) {
                            this.field2484[var5] = (short) arg2.method1466(12435);
                        }
                    }
                }
            } else {
                this.field2500 = arg2.method1475(255);
            }
        } else {
            this.field2488 = ~arg2.method1475(255) == -2;
        }
        if (arg0 != 0) {
            method870(55, -30);
        }
    }
}
