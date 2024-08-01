import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class class184 extends class187 {

    @OriginalMember(owner = "u", name = "Mc", descriptor = "I")
    public int field3464 = -1;

    @OriginalMember(owner = "u", name = "Oc", descriptor = "I")
    public int field3466 = 0;

    @OriginalMember(owner = "u", name = "Fc", descriptor = "Z")
    public boolean field3457 = false;

    @OriginalMember(owner = "u", name = "Sc", descriptor = "S")
    private short field3470 = 0;

    @OriginalMember(owner = "u", name = "Lc", descriptor = "I")
    public int field3463 = 0;

    @OriginalMember(owner = "u", name = "Tc", descriptor = "I")
    public int field3471 = -1;

    @OriginalMember(owner = "u", name = "Xc", descriptor = "I")
    public int field3475 = 0;

    @OriginalMember(owner = "u", name = "hd", descriptor = "I")
    public int field3485 = 0;

    @OriginalMember(owner = "u", name = "Vc", descriptor = "S")
    private short field3473 = 0;

    @OriginalMember(owner = "u", name = "fd", descriptor = "I")
    public int field3483 = 0;

    @OriginalMember(owner = "u", name = "Hc", descriptor = "Llf;")
    private static class109 field3459 = class35.method275("Choose Option", 2);

    @OriginalMember(owner = "u", name = "wc", descriptor = "[[[I")
    public static int[][][] field3448 = new int[4][105][105];

    @OriginalMember(owner = "u", name = "Kc", descriptor = "[I")
    public static int[] field3462 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "u", name = "Jc", descriptor = "Llf;")
    private static class109 field3461 = class35.method275("Prepared sound engine", 2);

    @OriginalMember(owner = "u", name = "Pc", descriptor = "Llf;")
    public static class109 field3467 = class35.method275(" Sekunde(Xn(Y -Ubertragen)3", 2);

    @OriginalMember(owner = "u", name = "Ic", descriptor = "Llf;")
    private static class109 field3460 = class35.method275(" more options", 2);

    @OriginalMember(owner = "u", name = "Bc", descriptor = "Llf;")
    public static class109 field3453 = class35.method275("<col=00ff80>", 2);

    @OriginalMember(owner = "u", name = "dd", descriptor = "Llf;")
    public static class109 field3481 = field3460;

    @OriginalMember(owner = "u", name = "cd", descriptor = "I")
    public static int field3480 = 0;

    @OriginalMember(owner = "u", name = "bd", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "u", name = "Ac", descriptor = "Llf;")
    public static class109 field3452 = class35.method275("Hidden)2", 2);

    @OriginalMember(owner = "u", name = "Nc", descriptor = "Llf;")
    public static class109 field3465 = field3459;

    @OriginalMember(owner = "u", name = "Rc", descriptor = "Llf;")
    public static class109 field3469 = class35.method275("Neuer Benutzer", 2);

    @OriginalMember(owner = "u", name = "jd", descriptor = "Llf;")
    public static class109 field3487 = field3461;

    @OriginalMember(owner = "u", name = "vc", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "u", name = "xc", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "u", name = "yc", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "u", name = "zc", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "u", name = "Cc", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "u", name = "Gc", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "u", name = "Qc", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "u", name = "Uc", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "u", name = "Wc", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "u", name = "Yc", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "u", name = "Zc", descriptor = "I")
    public int field3477;

    @OriginalMember(owner = "u", name = "ad", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "u", name = "ed", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "u", name = "gd", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "u", name = "Dc", descriptor = "Llf;")
    public class109 field3455;

    @OriginalMember(owner = "u", name = "id", descriptor = "Lbe;")
    public class16 field3486;

    @OriginalMember(owner = "u", name = "Ec", descriptor = "Lue;")
    public class189 field3456;

    @OriginalMember(owner = "u", name = "a", descriptor = "(ZLja;)V")
    public final void method1244(boolean arg0, class86 arg1) {
        ++field3468;
        arg1.field1773 = 0;
        int var3 = arg1.method598((byte) 118);
        if ((2 & var3) != 2) {
            this.field3470 = 0;
            this.field3473 = 0;
        } else {
            this.field3470 = (short) (arg1.method598((byte) 113) << 2);
            this.field3473 = (short) (arg1.method598((byte) 126) << 2);
        }
        int var4 = var3 & 1;
        super.field3612 = (var3 >> 3) + 1;
        boolean var5 = (var3 & 4) != 0;
        this.field3464 = arg1.method584(3);
        int var6 = -1;
        int[] var7 = new int[12];
        this.field3471 = arg1.method584(3);
        this.field3463 = 0;
        for (int var8 = 0; ~var8 > -13; ++var8) {
            int var9 = arg1.method598((byte) 75);
            if (~var9 == -1) {
                var7[var8] = 0;
            } else {
                int var10 = arg1.method598((byte) 95);
                int var11 = (var9 << 8) + var10;
                if (~var8 == -1 && ~var11 == -65536) {
                    var6 = arg1.method569(true);
                    break;
                }
                if (var11 >= 32768) {
                    int var15 = class202.field3977[var11 - 32768];
                    var7[var8] = class31.method262(var15, 1073741824);
                    int var16 = class128.method926(var15, -4).field1678;
                    if (var16 != 0) {
                        this.field3463 = var16;
                    }
                } else {
                    var7[var8] = class31.method262(var11 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var12 = new int[5];
        for (int var13 = 0; var13 < 5; ++var13) {
            int var14 = arg1.method598((byte) 123);
            if (var14 < 0 || ~class81.field1604[var13].length >= ~var14) {
                var14 = 0;
            }
            var12[var13] = var14;
        }
        super.field3544 = arg1.method569(true);
        if (super.field3544 == 65535) {
            super.field3544 = -1;
        }
        super.field3548 = arg1.method569(arg0);
        if (super.field3548 == 65535) {
            super.field3548 = -1;
        }
        super.field3574 = super.field3548;
        super.field3616 = arg1.method569(arg0);
        if (super.field3616 == 65535) {
            super.field3616 = -1;
        }
        super.field3559 = arg1.method569(arg0);
        if (super.field3559 == 65535) {
            super.field3559 = -1;
        }
        super.field3569 = arg1.method569(arg0);
        if (super.field3569 == 65535) {
            super.field3569 = -1;
        }
        super.field3603 = arg1.method569(arg0);
        if (~super.field3603 == -65536) {
            super.field3603 = -1;
        }
        super.field3587 = arg1.method569(true);
        if (~super.field3587 == -65536) {
            super.field3587 = -1;
        }
        this.field3455 = class136.method981((byte) 113, arg1.method572(-1495411552)).method810(true);
        this.field3475 = arg1.method598((byte) 71);
        if (var5) {
            this.field3485 = arg1.method569(true);
        }
        if (this.field3486 == null) {
            this.field3486 = new class16();
        }
        this.field3486.method106(var6, var4 == 1, var7, (byte) 110, var12);
    }

    @OriginalMember(owner = "u", name = "c", descriptor = "(I)Z")
    public final boolean method996(int arg0) {
        ++field3476;
        if (arg0 != 0) {
            return true;
        } else {
            return this.field3486 != null;
        }
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3451;
        if (this.field3486 != null) {
            class20 var11 = ~super.field3597 != 0 && ~super.field3570 == -1 ? client.method246(12, super.field3597) : null;
            class20 var12 = super.field3579 == -1 || this.field3457 || super.field3579 == super.field3544 && var11 != null ? null : client.method246(12, super.field3579);
            class189 var13 = this.field3486.method102(super.field3573, super.field3558, var11, var12, (byte) 48);
            if (var13 != null) {
                var13.method1274();
                super.field1945 = var13.field1945;
                if (this.field3470 != 0 && this.field3473 != 0) {
                    int var14 = class124.field2383[arg0];
                    int var15 = class124.field2387[arg0];
                    short var16 = this.field3470;
                    short var17 = this.field3473;
                    int var18 = -var17 / 2;
                    int var19 = -var16 / 2;
                    int var20 = var14 * var18 + var15 * var19 >> 16;
                    int var21 = var15 * var18 + -(var14 * var19) >> 16;
                    int var22 = class19.method180(super.field3609 - -var21, false, class72.field1405, super.field3549 + var20);
                    int var23 = var16 / 2;
                    int var24 = -var17 / 2;
                    int var25 = var14 * var24 + var15 * var23 >> 16;
                    int var26 = var15 * var24 - var14 * var23 >> 16;
                    int var27 = -var16 / 2;
                    int var28 = var17 / 2;
                    int var29 = class19.method180(super.field3609 + var26, false, class72.field1405, super.field3549 - -var25);
                    int var30 = var15 * var28 - var14 * var27 >> 16;
                    int var31 = var14 * var28 + var15 * var27 >> 16;
                    int var32 = class19.method180(super.field3609 + var30, false, class72.field1405, super.field3549 + var31);
                    int var33 = var16 / 2;
                    int var34 = var17 / 2;
                    int var35 = var14 * var34 - -(var15 * var33) >> 16;
                    int var36 = var15 * var34 - var14 * var33 >> 16;
                    int var37 = class19.method180(super.field3609 + var36, false, class72.field1405, super.field3549 - -var35);
                    int var38 = var37 <= var29 ? var37 : var29;
                    int var39 = ~var29 < ~var22 ? var22 : var29;
                    int var40 = ~var22 <= ~var32 ? var32 : var22;
                    int var41 = var32 < var37 ? var32 : var37;
                    int var42 = (int) (320.0D * Math.atan2((double) (-var41 + var39), (double) var17)) & 2047;
                    var13.method1275(var42);
                    int var43 = (int) (320.0D * Math.atan2((double) (-var38 + var40), (double) var16)) & 2047;
                    var13.method1276(var43);
                    int var44 = (var38 + var41 + var39 - -var40) / 4;
                    var13.method1277(0, -super.field3584 + var44, 0);
                }
                class189 var45 = null;
                class189 var46 = null;
                if (!this.field3457 && super.field3583 != -1 && ~super.field3598 != 0) {
                    var46 = class193.method1297(super.field3583, -18753).method822(super.field3598, 101);
                    if (var46 != null) {
                        var46.method1277(0, -super.field3607, 0);
                    }
                }
                if (!this.field3457 && this.field3456 != null) {
                    if (~class143.field2754 <= ~this.field3466) {
                        this.field3456 = null;
                    }
                    if (this.field3483 <= class143.field2754 && this.field3466 > class143.field2754) {
                        var45 = this.field3456;
                        var45.method1277(-super.field3549 + this.field3454, -super.field3584 + this.field3482, this.field3477 - super.field3609);
                        if (super.field3600 != 512) {
                            if (~super.field3600 != -1025) {
                                if (~super.field3600 == -1537) {
                                    var45.method1283();
                                }
                            } else {
                                var45.method1283();
                                var45.method1283();
                            }
                        } else {
                            var45.method1283();
                            var45.method1283();
                            var45.method1283();
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class66) var13).method429(var46);
                }
                if (var45 != null) {
                    var13 = ((class66) var13).method429(var45);
                }
                var13.field3625 = true;
                var13.method421(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var45 != null) {
                    if (super.field3600 != 512) {
                        if (super.field3600 != 1024) {
                            if (super.field3600 == 1536) {
                                var45.method1283();
                                var45.method1283();
                                var45.method1283();
                            }
                        } else {
                            var45.method1283();
                            var45.method1283();
                        }
                    } else {
                        var45.method1283();
                    }
                    var45.method1277(super.field3549 - this.field3454, -this.field3482 + super.field3584, super.field3609 - this.field3477);
                }
            }
        }
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(II)Llf;")
    public static final class109 method1245(int arg0, int arg1) {
        if (arg0 != -13) {
            return null;
        } else {
            ++field3474;
            class109 var2 = new class109();
            var2.field2176 = 0;
            var2.field2182 = new byte[arg1];
            return var2;
        }
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "(ZIII)V")
    public static final void method1246(boolean arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; ++var4) {
            for (int var7 = 0; var7 < 8; ++var7) {
                field3448[arg1][arg2 + var4][arg3 + var7] = 0;
            }
        }
        if (arg2 > 0) {
            for (int var5 = 1; var5 < 8; ++var5) {
                field3448[arg1][arg2][arg3 + var5] = field3448[arg1][arg2 - 1][arg3 + var5];
            }
        }
        if (arg3 > 0) {
            for (int var6 = 1; var6 < 8; ++var6) {
                field3448[arg1][arg2 + var6][arg3] = field3448[arg1][arg2 - -var6][arg3 + -1];
            }
        }
        if (!arg0) {
            ++field3484;
            if (arg2 > 0 && ~field3448[arg1][arg2 + -1][arg3] != -1) {
                field3448[arg1][arg2][arg3] = field3448[arg1][arg2 + -1][arg3];
            } else if (~arg3 < -1 && ~field3448[arg1][arg2][arg3 + -1] != -1) {
                field3448[arg1][arg2][arg3] = field3448[arg1][arg2][arg3 + -1];
            } else if (~arg2 < -1 && arg3 > 0 && field3448[arg1][arg2 - 1][arg3 + -1] != 0) {
                field3448[arg1][arg2][arg3] = field3448[arg1][arg2 - 1][arg3 - 1];
            }
        }
    }

    @OriginalMember(owner = "u", name = "e", descriptor = "(B)V")
    public static void method1247(byte arg0) {
        field3487 = null;
        field3461 = null;
        field3453 = null;
        field3469 = null;
        field3460 = null;
        field3452 = null;
        field3465 = null;
        field3448 = null;
        if (arg0 >= -101) {
            field3461 = null;
        }
        field3459 = null;
        field3462 = null;
        field3467 = null;
        field3481 = null;
    }

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public static final void method1248() {
        int var0 = class103.field2029[class209.field4076];
        class164[] var1 = class103.field2034[class209.field4076];
        class125.field2412 = 0;
        for (int var2 = 0; var2 < var0; ++var2) {
            class164 var3 = var1[var2];
            if (var3.field3069 == 1) {
                int var4 = var3.field3092 - class158.field2975 + class26.field549;
                if (var4 >= 0 && var4 <= class26.field549 + class26.field549) {
                    int var5 = var3.field3080 - class31.field735 + class26.field549;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field3075 - class31.field735 + class26.field549;
                    if (var6 > class26.field549 + class26.field549) {
                        var6 = class26.field549 + class26.field549;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class136.field2633[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class18.field371 - var3.field3093;
                        if (var8 > 32) {
                            var3.field3073 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field3073 = 2;
                            var8 = -var8;
                        }
                        var3.field3087 = (var3.field3090 - class144.field2782 << 8) / var8;
                        var3.field3079 = (var3.field3072 - class144.field2782 << 8) / var8;
                        var3.field3074 = (var3.field3089 - class178.field3369 << 8) / var8;
                        var3.field3091 = (var3.field3086 - class178.field3369 << 8) / var8;
                        class84.field1696[class125.field2412++] = var3;
                    }
                }
            } else if (var3.field3069 == 2) {
                int var9 = var3.field3080 - class31.field735 + class26.field549;
                if (var9 >= 0 && var9 <= class26.field549 + class26.field549) {
                    int var10 = var3.field3092 - class158.field2975 + class26.field549;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field3088 - class158.field2975 + class26.field549;
                    if (var11 > class26.field549 + class26.field549) {
                        var11 = class26.field549 + class26.field549;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class136.field2633[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class144.field2782 - var3.field3090;
                        if (var13 > 32) {
                            var3.field3073 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field3073 = 4;
                            var13 = -var13;
                        }
                        var3.field3083 = (var3.field3093 - class18.field371 << 8) / var13;
                        var3.field3066 = (var3.field3082 - class18.field371 << 8) / var13;
                        var3.field3074 = (var3.field3089 - class178.field3369 << 8) / var13;
                        var3.field3091 = (var3.field3086 - class178.field3369 << 8) / var13;
                        class84.field1696[class125.field2412++] = var3;
                    }
                }
            } else if (var3.field3069 == 4) {
                int var14 = var3.field3089 - class178.field3369;
                if (var14 > 128) {
                    int var15 = var3.field3080 - class31.field735 + class26.field549;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field3075 - class31.field735 + class26.field549;
                    if (var16 > class26.field549 + class26.field549) {
                        var16 = class26.field549 + class26.field549;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field3092 - class158.field2975 + class26.field549;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field3088 - class158.field2975 + class26.field549;
                        if (var18 > class26.field549 + class26.field549) {
                            var18 = class26.field549 + class26.field549;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; ++var20) {
                            for (int var21 = var15; var21 <= var16; ++var21) {
                                if (class136.field2633[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field3073 = 5;
                            var3.field3083 = (var3.field3093 - class18.field371 << 8) / var14;
                            var3.field3066 = (var3.field3082 - class18.field371 << 8) / var14;
                            var3.field3087 = (var3.field3090 - class144.field2782 << 8) / var14;
                            var3.field3079 = (var3.field3072 - class144.field2782 << 8) / var14;
                            class84.field1696[class125.field2412++] = var3;
                        }
                    }
                }
            }
        }
    }
}
