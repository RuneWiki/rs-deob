import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class230 extends class270 {

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    private int field3357 = 0;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    private int field3358 = 0;

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "I")
    private int field3361 = 1365;

    @OriginalMember(owner = "client!nn", name = "W", descriptor = "I")
    private int field3369 = 20;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "[I")
    public static int[] field3355 = new int[256];

    @OriginalMember(owner = "client!nn", name = "P", descriptor = "Ljl;")
    public static class391 field3362;

    @OriginalMember(owner = "client!nn", name = "R", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!nn", name = "V", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!nn", name = "U", descriptor = "[I")
    public static int[] field3367;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!nn", name = "Q", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!nn", name = "T", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!nn", name = "X", descriptor = "Lpo;")
    public static class202 field3370;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)V")
    public static void method1709(boolean arg0) {
        field3362 = null;
        field3355 = null;
        field3367 = null;
        if (!arg0) {
            field3367 = null;
        }
        field3370 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        ++field3360;
        int[] var3 = super.field4053.method396(arg1, -128);
        if (super.field4053.field815) {
            for (int var4 = 0; class161.field2445 > var4; ++var4) {
                int var5 = (class136.field2168[var4] << 12) / this.field3361 + this.field3357;
                int var6 = (class364.field5185[arg1] << 12) / this.field3361 + this.field3358;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~var13 > ~this.field3369) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - (-var7 + var12);
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 >= this.field3369 + -1 ? 0 : (var13 << 12) / this.field3369;
            }
        }
        if (arg0 < 26) {
            field3364 = 69;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)Leq;")
    public static final class140 method1710(int arg0, int arg1) {
        ++field3363;
        class140 var2 = (class140) class7.field89.method2228(~arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class132.field2126.method1355(arg0, -12607, arg1);
            if (var3 != null && ~var3.length < -2) {
                class140 var4 = class303.method2076(var3, true);
                class7.field89.method2226((long) arg1, var4, (byte) -108);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
    public class230() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V")
    public static final void method1711(int arg0) {
        ++field3359;
        int var1 = 64 % ((67 - arg0) / 54);
        class18 var2 = class205.field3011;
        synchronized (class205.field3011) {
            class205.field3011.method112(0);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lja;IIZZIIII[Lc;I[B)[I")
    public static final int[] method1712(class90 arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, class158[] arg9, int arg10, byte[] arg11) {
        ++field3354;
        int var12 = (arg5 & 7) * 8;
        int var13 = (arg7 & 7) * 8;
        if (!arg4) {
            class158 var14 = arg9[arg8];
            for (int var15 = 0; ~var15 > -9; ++var15) {
                for (int var16 = 0; ~var16 > -9; ++var16) {
                    int var17 = arg1 - -class372.method2368(arg2, var15 & 7, 7 & var16, (byte) -78);
                    int var18 = class115.method984(7 & var15, arg2, 7, var16 & 7) + arg10;
                    if (~var17 < -1 && ~var17 > ~(class183.field2703 + -1) && ~var18 < -1 && var18 < class66.field1056 - 1) {
                        var14.method1248(var18, 1, var17);
                    }
                }
            }
        }
        byte var19;
        if (arg4) {
            var19 = 1;
        } else {
            var19 = 4;
        }
        class37 var20 = new class37(arg11);
        int var21 = arg5 << 3 & -64;
        int var22 = -64 & arg7 << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (arg2 == 1) {
            var24 = 1;
        } else if (~arg2 == -3) {
            var24 = 1;
            var23 = 1;
        } else if (arg2 == 3) {
            var23 = 1;
        }
        for (int var25 = 0; var19 > var25; ++var25) {
            for (int var58 = 0; ~var58 > -65; ++var58) {
                for (int var59 = 0; ~var59 > -65; ++var59) {
                    if (arg6 == var25 && ~var12 >= ~var58 && var12 + 8 >= var58 && var13 <= var59 && ~(var13 + 8) <= ~var59) {
                        if (var12 + 8 != var58 && ~(var13 + 8) != ~var59) {
                            int var60 = class372.method2368(arg2, var58 & 7, var59 & 7, (byte) -78) + arg1;
                            int var61 = arg10 - -class115.method984(7 & var58, arg2, 7, var59 & 7);
                            class432.method2683(var24, var60, arg4, false, var23, var21 + var58, arg2, var61, -2222, arg8, var20, var22 + var59);
                            if (~var58 == -64 || ~var59 == -64) {
                                int var62 = ~var58 == -64 ? 64 : var58;
                                int var63 = var59 != 63 ? var59 : 64;
                                int var64;
                                int var65;
                                if (arg2 != 0) {
                                    if (~arg2 == -2) {
                                        var64 = -var13 - (-var63 - arg1);
                                        var65 = arg10 - -8 - (var62 - var12);
                                    } else if (~arg2 == -3) {
                                        var65 = var13 + 8 + arg10 + -var63;
                                        var64 = arg1 - -8 - -var12 - var62;
                                    } else {
                                        var64 = arg1 - (-var13 + var63) + 8;
                                        var65 = arg10 + var62 + -var12;
                                    }
                                } else {
                                    var64 = -var12 + var62 + arg1;
                                    var65 = -var13 - (-var63 - arg10);
                                }
                                if (var64 >= 0 && ~var64 > ~class183.field2703 && var65 >= 0 && var65 < class66.field1056) {
                                    class275.field4146[arg8][var64][var65] = class275.field4146[arg8][var60 - -var23][var24 + var61];
                                }
                            }
                        } else {
                            int var66;
                            int var67;
                            if (arg2 == 0) {
                                var66 = arg10 - (-var59 + var13);
                                var67 = -var12 - (-var58 - arg1);
                            } else if (arg2 != 1) {
                                if (arg2 == 2) {
                                    var67 = -var58 + 8 + var12 + arg1;
                                    var66 = arg10 + 8 + var13 + -var59;
                                } else {
                                    var66 = -var12 + var58 + arg10;
                                    var67 = -var59 + var13 + arg1 - -8;
                                }
                            } else {
                                var67 = -var13 - -var59 + arg1;
                                var66 = var12 - (var58 - 8 - arg10);
                            }
                            class432.method2683(0, var67, arg4, true, 0, var21 + var58, 0, var66, -2222, arg8, var20, var22 + var59);
                        }
                    } else {
                        class432.method2683(0, -1, arg4, false, 0, 0, 0, -1, -2222, 0, var20, 0);
                    }
                }
            }
        }
        boolean var26 = false;
        if (!arg3) {
            method1712((class90) null, -16, 11, true, true, 86, 125, 93, 118, (class158[]) null, 91, (byte[]) null);
        }
        boolean var27 = false;
        while (~var20.field565 > ~var20.field578.length) {
            int var28 = var20.method271((byte) 114);
            if (~var28 == -129) {
                class157.field2385[0] = var20.method320((byte) -87);
                class157.field2385[1] = var20.method321((byte) 99);
                class157.field2385[2] = var20.method321((byte) 114);
                class157.field2385[3] = var20.method321((byte) 127);
                class157.field2385[4] = var20.method320((byte) -87);
                var26 = true;
            } else {
                if (~var28 != -130) {
                    --var20.field565;
                    break;
                }
                if (class417.field6034 == null) {
                    class417.field6034 = new byte[4][][];
                }
                for (int var29 = 0; var29 < 4; ++var29) {
                    byte var30 = var20.method291(0);
                    if (var30 == 0 && class417.field6034[arg8] != null) {
                        if (arg6 >= var29) {
                            int var31 = arg1;
                            int var32 = arg1 + 7;
                            int var33 = arg10;
                            int var34 = arg10 + 7;
                            if (arg1 < 0) {
                                var31 = 0;
                            } else if (~arg1 <= ~class183.field2703) {
                                var31 = class183.field2703;
                            }
                            if (arg10 < 0) {
                                var33 = 0;
                            } else if (~arg10 <= ~class66.field1056) {
                                var33 = class66.field1056;
                            }
                            if (var32 >= 0) {
                                if (~var32 <= ~class183.field2703) {
                                    var32 = class183.field2703;
                                }
                            } else {
                                var32 = 0;
                            }
                            if (~var34 > -1) {
                                var34 = 0;
                            } else if (class66.field1056 <= var34) {
                                var34 = class66.field1056;
                            }
                            while (~var31 > ~var32) {
                                while (var34 > var33) {
                                    class417.field6034[arg8][var31][var33] = 0;
                                    ++var33;
                                }
                                ++var31;
                            }
                        }
                    } else if (var30 == 1) {
                        if (class417.field6034[arg8] == null) {
                            class417.field6034[arg8] = new byte[class183.field2703 + 1][class66.field1056 - -1];
                        }
                        for (int var35 = 0; ~var35 > -65; var35 += 4) {
                            for (int var36 = 0; ~var36 > -65; var36 += 4) {
                                byte var37 = var20.method291(0);
                                if (var29 <= arg6) {
                                    for (int var38 = var35; var38 < var35 + 4; ++var38) {
                                        for (int var39 = var36; var39 < var36 + 4; ++var39) {
                                            if (~var12 >= ~var38 && var38 < var12 - -8 && ~var13 >= ~var39 && var13 + 8 > var13) {
                                                int var40 = arg1 + class372.method2368(arg2, var38 & 7, var39 & 7, (byte) -78);
                                                int var41 = arg10 - -class115.method984(7 & var38, arg2, 7, var39 & 7);
                                                if (~var40 <= -1 && ~class183.field2703 < ~var40 && ~var41 <= -1 && ~var41 > ~class66.field1056) {
                                                    class417.field6034[arg8][var40][var41] = var37;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg4) {
            class283 var42 = null;
            label292: while (true) {
                int var44;
                label285: do {
                    while (true) {
                        while (var20.field578.length > var20.field565) {
                            int var43 = var20.method271((byte) 120);
                            if (~var43 != -1) {
                                if (~var43 == -2) {
                                    var44 = var20.method271((byte) 102);
                                    continue label285;
                                }
                                if (~var43 != -3) {
                                    throw new IllegalStateException();
                                }
                                if (var42 == null) {
                                    var42 = new class283();
                                }
                                var42.method2007(var20, 2955);
                            } else {
                                var42 = new class283(var20);
                            }
                        }
                        if (var42 != null) {
                            class79.method625(var42, arg1 >> 3, arg3, arg10 >> 3);
                        }
                        break label292;
                    }
                } while (~var44 >= -1);
                for (int var45 = 0; ~var45 > ~var44; ++var45) {
                    class420 var46 = new class420(var20);
                    if (var46.field6128 == 31) {
                        class75 var47 = class308.method2107(200, var20.method320((byte) -87));
                        var46.method2640(var47.field1284, var47.field1285, var47.field1287, 123, var47.field1283);
                    }
                    int var48 = var46.field942 >> 7;
                    int var49 = var46.field945 >> 7;
                    if (var46.field6124 == arg6 && ~var12 >= ~var48 && var48 < var12 + 8 && ~var49 <= ~var13 && var13 + 8 > var49) {
                        int var50 = (arg1 << 7) + class61.method476(1023 & var46.field945, arg2, 1023 & var46.field942, 118);
                        int var51 = (arg10 << 7) + class186.method1442(arg2, 1023 & var46.field942, var46.field945 & 1023, 32);
                        var46.field945 = var51;
                        var46.field942 = var50;
                        int var52 = var46.field945 >> 7;
                        int var53 = var46.field942 >> 7;
                        if (~var53 <= -1 && ~var52 <= -1 && class183.field2703 > var53 && class66.field1056 > var52) {
                            var46.field944 = class275.field4146[arg6][var53][var52] + -var46.field944;
                            if (arg0.method757() > 0) {
                                class319.method2136(var46);
                            }
                        }
                    }
                }
            }
        }
        if (!var27 && class417.field6034 != null && class417.field6034[arg8] != null) {
            int var54 = arg1 + 7;
            int var55 = arg10 + 7;
            for (int var56 = arg1; ~var56 > ~var54; ++var56) {
                for (int var57 = arg10; var55 > var57; ++var57) {
                    class417.field6034[arg8][var56][var57] = 0;
                }
            }
        }
        if (!var26) {
            return null;
        } else {
            return class157.field2385;
        }
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(B)V")
    public static final void method1713(byte arg0) {
        ++field3353;
        if (arg0 >= 10) {
            if (class360.field5124 != 2) {
                try {
                    class412.method2587(class122.field1926, -88, "tbrefresh");
                } catch (Throwable var1) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        ++field3356;
        if (arg0 != 108) {
            field3355 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field3358 = arg1.method320((byte) -87);
                    }
                } else {
                    this.field3357 = arg1.method320((byte) -87);
                }
            } else {
                this.field3369 = arg1.method320((byte) -87);
            }
        } else {
            this.field3361 = arg1.method320((byte) -87);
        }
    }

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)V")
    public static final void method1714(int arg0) {
        if (arg0 != -28016) {
            field3367 = null;
        }
        ++field3366;
        int[] var1 = new int[class100.field1555];
        int var2 = 0;
        for (int var3 = 0; ~var3 > ~class100.field1555; ++var3) {
            class124 var5 = class206.method1561(105, var3);
            if (var5.field2007 >= 0 || ~var5.field1981 <= -1) {
                var1[var2++] = var3;
            }
        }
        class391.field5722 = new int[var2];
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            class391.field5722[var4] = var1[var4];
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if (~(1 & var1) == -2) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }
            field3355[var0] = var1;
        }
        field3362 = new class391();
        field3364 = 2;
        field3365 = -1;
        field3368 = 0;
        field3367 = new int[] { 2047, 16383, 65535 };
    }
}
