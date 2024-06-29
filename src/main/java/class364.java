import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class364 extends class220 {

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
    private int field5323 = 3216;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "[I")
    private int[] field5319 = new int[3];

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    private int field5324 = 4096;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    private int field5326 = 3216;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "[Lkj;")
    public static class236[] field5321 = new class236[14];

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "Lfl;")
    public static class386 field5327;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([Lbi;IZII[BIIIIILnr;)[I", line = 12)
    public static final int[] method2387(class138[] arg0, int arg1, boolean arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class437 arg11) {
        ++field5328;
        int var12 = (7 & arg1) * 8;
        int var13 = (arg7 & 7) * 8;
        byte var14;
        if (arg2) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        if (!arg2) {
            class138 var15 = arg0[arg8];
            for (int var16 = 0; ~var16 > -9; ++var16) {
                for (int var17 = 0; ~var17 > -9; ++var17) {
                    int var18 = class189.method1177(arg6, 7 & var17, true, var16 & 7) + arg10;
                    int var19 = arg4 + class255.method1602(1, var17 & 7, var16 & 7, arg6);
                    if (var18 > 0 && ~var18 > ~(class324.field4652 + -1) && var19 > 0 && ~var19 > ~(class336.field4964 + -1)) {
                        var15.method926(true, var18, var19);
                    }
                }
            }
        }
        class265 var20 = new class265(arg5);
        int var21 = (-8 & arg1) << 3;
        int var22 = (arg7 & -8) << 3;
        if (arg9 != -27837) {
            method2389(true);
        }
        byte var23 = 0;
        byte var24 = 0;
        if (~arg6 == -2) {
            var24 = 1;
        } else if (arg6 != 2) {
            if (~arg6 == -4) {
                var23 = 1;
            }
        } else {
            var23 = 1;
            var24 = 1;
        }
        for (int var25 = 0; ~var25 > ~var14; ++var25) {
            for (int var58 = 0; var58 < 64; ++var58) {
                for (int var59 = 0; ~var59 > -65; ++var59) {
                    if (arg3 == var25 && var58 >= var12 && ~(var12 + 8) <= ~var58 && var59 >= var13 && ~(var13 + 8) <= ~var59) {
                        if (~(var12 + 8) != ~var58 && ~(var13 - -8) != ~var59) {
                            int var60 = class189.method1177(arg6, 7 & var59, true, 7 & var58) + arg10;
                            int var61 = arg4 + class255.method1602(arg9 + 27838, 7 & var59, var58 & 7, arg6);
                            class79.method498(arg2, var22 + var59, false, var60, arg6, false, var20, arg8, var24, var23, var61, var21 + var58);
                            if (var58 == 63 || var59 == 63) {
                                int var62 = ~var58 == -64 ? 64 : var58;
                                int var63 = var59 != 63 ? var59 : 64;
                                int var64;
                                int var65;
                                if (~arg6 == -1) {
                                    var64 = arg4 - (-var63 + var13);
                                    var65 = -var12 - (-var62 - arg10);
                                } else if (arg6 != 1) {
                                    if (arg6 != 2) {
                                        var64 = -var12 - (-var62 - arg4);
                                        var65 = arg10 - -8 + (var13 - var63);
                                    } else {
                                        var65 = var12 - (var62 - arg10) + 8;
                                        var64 = arg4 - -8 - var63 + var13;
                                    }
                                } else {
                                    var64 = arg4 - (-8 - -var62 + -var12);
                                    var65 = -var13 - (-var63 - arg10);
                                }
                                if (var65 >= 0 && ~class324.field4652 < ~var65 && ~var64 <= -1 && ~var64 > ~class336.field4964) {
                                    class128.field1703[arg8][var65][var64] = class128.field1703[arg8][var23 + var60][var24 + var61];
                                }
                            }
                        } else {
                            int var66;
                            int var67;
                            if (arg6 != 0) {
                                if (arg6 == 1) {
                                    var66 = -var58 + arg4 + var12 + 8;
                                    var67 = arg10 - (-var59 + var13);
                                } else if (arg6 == 2) {
                                    var67 = arg10 - -8 + -var58 + var12;
                                    var66 = -var59 - (-var13 - 8) + arg4;
                                } else {
                                    var67 = arg10 + 8 - (-var13 + var59);
                                    var66 = -var12 + arg4 + var58;
                                }
                            } else {
                                var67 = arg10 - -var58 - var12;
                                var66 = var59 - var13 + arg4;
                            }
                            class79.method498(arg2, var22 + var59, false, var67, 0, true, var20, arg8, 0, 0, var66, var21 + var58);
                        }
                    } else {
                        class79.method498(arg2, 0, false, -1, 0, false, var20, 0, 0, 0, -1, 0);
                    }
                }
            }
        }
        boolean var26 = false;
        boolean var27 = false;
        while (var20.field3915 < var20.field3879.length) {
            int var28 = var20.method1697(-57);
            if (var28 == 128) {
                class176.field2310[0] = var20.method1685(8104);
                class176.field2310[1] = var20.method1698(1625554944);
                class176.field2310[2] = var20.method1698(1625554944);
                class176.field2310[3] = var20.method1698(1625554944);
                var26 = true;
                class176.field2310[4] = var20.method1685(8104);
            } else {
                if (var28 != 129) {
                    --var20.field3915;
                    break;
                }
                if (class193.field2750 == null) {
                    class193.field2750 = new byte[4][][];
                }
                for (int var29 = 0; var29 < 4; ++var29) {
                    byte var30 = var20.method1708((byte) 127);
                    if (~var30 == -1 && class193.field2750[arg8] != null) {
                        if (~arg3 <= ~var29) {
                            int var31 = arg10;
                            int var32 = arg10 - -7;
                            int var33 = arg4;
                            if (~arg4 <= -1) {
                                if (arg4 >= class336.field4964) {
                                    var33 = class336.field4964;
                                }
                            } else {
                                var33 = 0;
                            }
                            int var34 = arg4 + 7;
                            if (var32 < 0) {
                                var32 = 0;
                            } else if (class324.field4652 <= var32) {
                                var32 = class324.field4652;
                            }
                            if (~arg10 > -1) {
                                var31 = 0;
                            } else if (class324.field4652 <= arg10) {
                                var31 = class324.field4652;
                            }
                            if (~var34 > -1) {
                                var34 = 0;
                            } else if (~var34 <= ~class336.field4964) {
                                var34 = class336.field4964;
                            }
                            while (var32 > var31) {
                                while (var34 > var33) {
                                    class193.field2750[arg8][var31][var33] = 0;
                                    ++var33;
                                }
                                ++var31;
                            }
                        }
                    } else if (~var30 == -2) {
                        if (class193.field2750[arg8] == null) {
                            class193.field2750[arg8] = new byte[class324.field4652 + 1][class336.field4964 - -1];
                        }
                        for (int var35 = 0; ~var35 > -65; var35 += 4) {
                            for (int var36 = 0; ~var36 > -65; var36 += 4) {
                                byte var37 = var20.method1708((byte) 127);
                                if (var29 <= arg3) {
                                    for (int var38 = var35; ~var38 > ~(var35 + 4); ++var38) {
                                        for (int var39 = var36; var39 < var36 + 4; ++var39) {
                                            if (var12 <= var38 && ~(var12 + 8) < ~var38 && var13 <= var39 && var13 + 8 > var13) {
                                                int var40 = class189.method1177(arg6, var39 & 7, true, 7 & var38) + arg10;
                                                int var41 = class255.method1602(1, var39 & 7, var38 & 7, arg6) + arg4;
                                                if (var40 >= 0 && ~var40 > ~class324.field4652 && ~var41 <= -1 && class336.field4964 > var41) {
                                                    class193.field2750[arg8][var40][var41] = var37;
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
        if (!arg2) {
            class262 var42 = null;
            label292: while (true) {
                int var44;
                label285: do {
                    while (true) {
                        while (var20.field3879.length > var20.field3915) {
                            int var43 = var20.method1697(-91);
                            if (var43 != 0) {
                                if (var43 == 1) {
                                    var44 = var20.method1697(-36);
                                    continue label285;
                                }
                                if (var43 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var42 == null) {
                                    var42 = new class262();
                                }
                                var42.method1644(8, var20);
                            } else {
                                var42 = new class262(var20);
                            }
                        }
                        if (var42 != null) {
                            class130.method888(arg10 >> 3, arg4 >> 3, true, var42);
                        }
                        break label292;
                    }
                } while (var44 <= 0);
                for (int var45 = 0; ~var44 < ~var45; ++var45) {
                    class413 var46 = new class413(var20);
                    if (~var46.field6186 == -32) {
                        class232 var47 = class405.method2642(var20.method1685(arg9 + 35941), 2);
                        var46.method2678(var47.field3267, var47.field3270, -125, var47.field3281, var47.field3282);
                    }
                    int var48 = var46.field5994 >> 7;
                    int var49 = var46.field5990 >> 7;
                    if (var46.field6171 == arg3 && var12 <= var48 && var12 + 8 > var48 && ~var13 >= ~var49 && ~(var13 + 8) < ~var49) {
                        int var50 = class142.method947(1023 & var46.field5994, 1023 & var46.field5990, arg6, (byte) 74) + (arg10 << 7);
                        int var51 = (arg4 << 7) + class16.method113(arg9 ^ -27837, var46.field5994 & 1023, var46.field5990 & 1023, arg6);
                        var46.field5990 = var51;
                        var46.field5994 = var50;
                        int var52 = var46.field5994 >> 7;
                        int var53 = var46.field5990 >> 7;
                        if (~var52 <= -1 && var53 >= 0 && var52 < class324.field4652 && class336.field4964 > var53) {
                            var46.field5984 = class128.field1703[arg3][var52][var53] + -var46.field5984;
                            if (arg11.method2110() > 0) {
                                class38.method300(var46);
                            }
                        }
                    }
                }
            }
        }
        if (!var27 && class193.field2750 != null && class193.field2750[arg8] != null) {
            int var54 = arg10 + 7;
            int var55 = arg4 + 7;
            for (int var56 = arg10; var54 > var56; ++var56) {
                for (int var57 = arg4; ~var55 < ~var57; ++var57) {
                    class193.field2750[arg8][var56][var57] = 0;
                }
            }
        }
        if (!var26) {
            return null;
        } else {
            return class176.field2310;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)[I", line = 485)
    public final int[] method43(int arg0, int arg1) {
        if (arg0 != -11543) {
            field5327 = null;
        }
        ++field5325;
        int[] var3 = super.field3125.method2005(arg1, (byte) 108);
        if (super.field3125.field4676) {
            int var4 = class232.field3274 * this.field5324 >> 12;
            int[] var5 = this.method1366(0, (byte) -40, arg1 + -1 & class315.field4510);
            int[] var6 = this.method1366(0, (byte) -40, arg1);
            int[] var7 = this.method1366(0, (byte) -40, class315.field4510 & arg1 + 1);
            for (int var8 = 0; class344.field5043 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class392.field5887 & var8 + -1] + -var6[class392.field5887 & var8 - -1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class381.field5715[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field5319[2] * var15 >> 12;
                int var18 = this.field5319[0] * var16 >> 12;
                int var19 = this.field5319[1] * var14 >> 12;
                var3[var8] = var18 - -var19 - -var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V", line = 557)
    private final void method2388(int arg0) {
        if (arg0 != 18105) {
            this.field5326 = -41;
        }
        ++field5322;
        double var2 = Math.cos((double) ((float) this.field5323 / 4096.0F));
        this.field5319[0] = (int) (4096.0D * Math.sin((double) ((float) this.field5326 / 4096.0F)) * var2);
        this.field5319[1] = (int) (Math.cos((double) ((float) this.field5326 / 4096.0F)) * var2 * 4096.0D);
        this.field5319[2] = (int) (4096.0D * Math.sin((double) ((float) this.field5323 / 4096.0F)));
        int var4 = this.field5319[0] * this.field5319[0] >> 12;
        int var5 = this.field5319[1] * this.field5319[1] >> 12;
        int var6 = this.field5319[2] * this.field5319[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 - -var5 >> 12)));
        if (~var7 != -1) {
            this.field5319[1] = (this.field5319[1] << 12) / var7;
            this.field5319[0] = (this.field5319[0] << 12) / var7;
            this.field5319[2] = (this.field5319[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 591)
    public class364() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V", line = 604)
    public final void method440(int arg0) {
        this.method2388(18105);
        if (arg0 == 0) {
            ++field5318;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V", line = 624)
    public static void method2389(boolean arg0) {
        if (arg0) {
            field5321 = null;
            field5327 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBLil;)V", line = 638)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg1 == -49) {
            ++field5320;
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field5323 = arg2.method1685(arg1 ^ -8089);
                    }
                } else {
                    this.field5326 = arg2.method1685(8104);
                }
            } else {
                this.field5324 = arg2.method1685(8104);
            }
        }
    }
}
