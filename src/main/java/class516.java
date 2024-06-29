import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class516 extends class251 {

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "Lra;")
    public class92 field7514;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "S")
    private short field7513;

    @OriginalMember(owner = "client!kq", name = "R", descriptor = "S")
    private short field7520;

    @OriginalMember(owner = "client!kq", name = "Q", descriptor = "S")
    private short field7519;

    @OriginalMember(owner = "client!kq", name = "S", descriptor = "S")
    private short field7521;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "S")
    private short field7518;

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "I")
    private int field7516;

    @OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
    private int field7515;

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "S")
    private short field7517;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "()V")
    public final void method3060() {
        this.field7514.field1059.field2800[this.field7517] = null;
        class472.field6987[class621.field8993] = this;
        class621.field8993 = class621.field8993 + 1 & 1023;
        this.method3488(false);
        this.method2922(false);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "()V")
    private final void method3061() {
        int var1 = this.field7514.field1059.field2797;
        if (this.field7514.field1059.field2800[var1] != null) {
            this.field7514.field1059.field2800[var1].method3060();
        }
        this.field7514.field1059.field2800[var1] = this;
        this.field7517 = (short) this.field7514.field1059.field2797;
        this.field7514.field1059.field2797 = var1 + 1 & 8191;
        this.field7514.field1076.method3293(this, (byte) 103);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lra;IIIIIIIIIIIZZ)V")
    public final void method3062(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7514 = arg0;
        super.field3569 = arg1 << 12;
        super.field3568 = arg2 << 12;
        super.field3559 = arg3 << 12;
        super.field3560 = arg9;
        this.field7520 = this.field7513 = (short) arg8;
        super.field3556 = arg10;
        super.field3562 = arg11;
        super.field3563 = arg13;
        this.field7519 = (short) arg4;
        this.field7521 = (short) arg5;
        this.field7518 = (short) arg6;
        this.field7516 = arg7;
        super.field3561 = this.field7514.field1082.field803;
        this.method3061();
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Loa;J)V")
    public final void method3063(class605 arg0, long arg1) {
        int var4 = super.field3569 >> class465.field6917 + 12;
        int var5 = super.field3559 >> class465.field6917 + 12;
        int var6 = super.field3568 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class588.field8441 && var5 >= 0 && var5 < class91.field1047) {
            class211 var7 = this.field7514.field1059;
            class409 var8 = this.field7514.field1065;
            class132[] var9 = class435.field6449;
            int var10 = var7.field2810;
            class99 var11 = class431.field6408[var7.field2810][var4][var5];
            if (var11 != null) {
                var10 = var11.field1178;
            }
            int var12 = var9[var10].method259(var4, var5);
            int var13;
            if (var10 < class637.field9161 - 1) {
                var13 = var9[var10 + 1].method259(var4, var5);
            } else {
                var13 = var12 - (8 << class465.field6917);
            }
            if (var8.field6164) {
                if (var8.field6178 == -1 && var6 > var12) {
                    this.method3060();
                    return;
                }
                if (var8.field6178 >= 0 && var6 > var9[var8.field6178].method259(var4, var5)) {
                    this.method3060();
                    return;
                }
                if (var8.field6206 == -1 && var6 < var13) {
                    this.method3060();
                    return;
                }
                if (var8.field6206 >= 0 && var6 < var9[var8.field6206 + 1].method259(var4, var5)) {
                    this.method3060();
                    return;
                }
            }
            if (var4 >= var7.field2815 && var4 <= var7.field2813 && var5 >= var7.field2812 && var5 <= var7.field2808 && var6 <= var12 && var6 >= var13) {
                var7.field2807.field378.method1486(this, false);
            } else {
                int var14;
                for (var14 = class637.field9161 - 1; var14 > 0 && var6 > var9[var14].method259(var4, var5); --var14) {
                }
                if (var8.field6205 && var14 == 0 && var6 > var9[0].method259(var4, var5)) {
                    this.method3060();
                } else if (class637.field9161 - 1 == var14 && var9[var14].method259(var4, var5) - var6 > 8 << class465.field6917) {
                    this.method3060();
                } else {
                    class99 var15 = class431.field6408[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class431.field6408[0][var4][var5] == null) {
                            var15 = class431.field6408[0][var4][var5] = new class99(0, var4, var5);
                        }
                        boolean var16 = class431.field6408[0][var4][var5].field1162 != null;
                        if (var14 == 3 && var16) {
                            this.method3060();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class431.field6408[var17][var4][var5] == null) {
                                var15 = class431.field6408[var17][var4][var5] = new class99(var17, var4, var5);
                                if (var16) {
                                    ++var15.field1178;
                                }
                            }
                        }
                    }
                    if (var8.field6169) {
                        int var18 = super.field3569 >> 12;
                        int var19 = super.field3559 >> 12;
                        if (var15.field1168 != null) {
                            class425 var20 = var15.field1168.method100(arg0, 28286);
                            if (var20 != null && var20.method2662(var18, var19, (byte) -109, var6)) {
                                this.method3060();
                                return;
                            }
                        }
                        if (var15.field1176 != null) {
                            class425 var21 = var15.field1176.method100(arg0, 28286);
                            if (var21 != null && var21.method2662(var18, var19, (byte) -119, var6)) {
                                this.method3060();
                                return;
                            }
                        }
                        if (var15.field1174 != null) {
                            class425 var22 = var15.field1174.method100(arg0, 28286);
                            if (var22 != null && var22.method2662(var18, var19, (byte) -120, var6)) {
                                this.method3060();
                                return;
                            }
                        }
                        for (class104 var23 = var15.field1167; var23 != null; var23 = var23.field1251) {
                            class425 var24 = var23.field1253.method100(arg0, 28286);
                            if (var24 != null && var24.method2662(var18, var19, (byte) -100, var6)) {
                                this.method3060();
                                return;
                            }
                        }
                    }
                    if (var15.field1171 == null) {
                        var15.field1171 = new class33();
                        var15.field1179 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field1179) {
                        var15.field1171.field378.method1485(true);
                        var15.field1171.field381 = false;
                        var15.field1179 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field1171.field378.method1486(this, false);
                }
            }
        } else {
            this.method3060();
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lra;IIIIIIIIIIIZZ)V")
    public class516(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7514 = arg0;
        super.field3569 = arg1 << 12;
        super.field3568 = arg2 << 12;
        super.field3559 = arg3 << 12;
        super.field3560 = arg9;
        this.field7520 = this.field7513 = (short) arg8;
        super.field3556 = arg10;
        super.field3562 = arg11;
        super.field3563 = arg13;
        this.field7519 = (short) arg4;
        this.field7521 = (short) arg5;
        this.field7518 = (short) arg6;
        this.field7516 = arg7;
        super.field3561 = this.field7514.field1082.field803;
        this.method3061();
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(JI)V")
    public final void method3064(long arg0, int arg1) {
        this.field7513 = (short) (this.field7513 - arg1);
        if (this.field7513 <= 0) {
            this.method3060();
        } else {
            int var4 = super.field3569 >> 12;
            int var5 = super.field3568 >> 12;
            int var6 = super.field3559 >> 12;
            class211 var7 = this.field7514.field1059;
            class409 var8 = this.field7514.field1065;
            if (var8.field6222 != 0) {
                if (this.field7520 - this.field7513 <= var8.field6220) {
                    int var9 = var8.field6224 * arg1 + (this.field7515 >> 16 & 255) + (super.field3560 >> 8 & 65280);
                    int var10 = var8.field6194 * arg1 + (this.field7515 >> 8 & 255) + (super.field3560 & 65280);
                    int var11 = var8.field6162 * arg1 + (super.field3560 << 8 & 65280) + (this.field7515 & 255);
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }
                    super.field3560 &= -16777216;
                    super.field3560 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field7515 &= -16777216;
                    this.field7515 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field7520 - this.field7513 <= var8.field6174) {
                    int var12 = var8.field6166 * arg1 + (this.field7515 >> 24 & 255) + (super.field3560 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3560 &= 16777215;
                    super.field3560 |= (var12 & 65280) << 16;
                    this.field7515 &= 16777215;
                    this.field7515 |= (var12 & 255) << 24;
                }
            }
            if (var8.field6189 != -1 && this.field7520 - this.field7513 <= var8.field6186) {
                this.field7516 += var8.field6193 * arg1;
            }
            if (var8.field6157 != -1 && this.field7520 - this.field7513 <= var8.field6161) {
                super.field3556 += var8.field6214 * arg1;
            }
            int var13 = this.field7519;
            int var14 = this.field7521;
            int var15 = this.field7518;
            boolean var16 = false;
            if (var8.field6223 == 1) {
                int var17 = var4 - this.field7514.field1072;
                int var18 = var5 - this.field7514.field1057;
                int var19 = var6 - this.field7514.field1085;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18)) >> 2;
                long var21 = (long) (var8.field6159 * var20 * arg1);
                this.field7516 = (int) ((long) this.field7516 - ((long) this.field7516 * var21 >> 18));
            } else if (var8.field6223 == 2) {
                int var23 = var4 - this.field7514.field1072;
                int var24 = var5 - this.field7514.field1057;
                int var25 = var6 - this.field7514.field1085;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field6159 * var26 * arg1);
                this.field7516 = (int) ((long) this.field7516 - ((long) this.field7516 * var27 >> 28));
            }
            if (var8.field6177 != null) {
                class324 var29 = var7.field2805.field1413;
                for (class324 var30 = var29.field4681; var29 != var30; var30 = var30.field4681) {
                    class546 var31 = (class546) var30;
                    class192 var32 = var31.field7818;
                    if (var32.field2535 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field6177.length; ++var34) {
                            if (var8.field6177[var34] == var32.field2541) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field7819;
                            int var36 = var5 - var31.field7814;
                            int var37 = var6 - var31.field7813;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field2534) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field7816 * var37 + var31.field7815 * var35 + var32.field2530 * var36) * 65535L / (long) (var32.field2526 * var40);
                                if (var41 >= (long) var32.field2533) {
                                    int var43 = 0;
                                    if (var32.field2544 == 1) {
                                        var43 = (var40 >> 4) * var32.field2528;
                                    } else if (var32.field2544 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field2528;
                                    }
                                    if (var32.field2540 == 0) {
                                        if (var32.field2536 == 0) {
                                            var13 += (var31.field7815 - var43) * arg1;
                                            var14 += (var32.field2530 - var43) * arg1;
                                            var15 += (var31.field7816 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field3569 += (var31.field7815 - var43) * arg1;
                                            super.field3568 += (var32.field2530 - var43) * arg1;
                                            super.field3559 += (var31.field7816 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field2526;
                                        int var45 = (var36 << 15) / var40 * var32.field2526;
                                        int var46 = (var37 << 15) / var40 * var32.field2526;
                                        if (var32.field2536 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field3569 += arg1 * var44 >> 15;
                                            super.field3568 += arg1 * var45 >> 15;
                                            super.field3559 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field6173 != null) {
                for (int var47 = 0; var47 < var8.field6173.length; ++var47) {
                    class546 var48 = (class546) class574.field8289.method1892((long) var8.field6173[var47], -1);
                    while (var48 != null) {
                        class192 var49 = var48.field7818;
                        int var50 = var4 - var48.field7819;
                        int var51 = var5 - var48.field7814;
                        int var52 = var6 - var48.field7813;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field2534) {
                            var48 = (class546) class574.field8289.method1894(false);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field7816 * var52 + var48.field7815 * var50 + var49.field2530 * var51) * 65535L / (long) (var49.field2526 * var55);
                            if (var56 < (long) var49.field2533) {
                                var48 = (class546) class574.field8289.method1894(false);
                            } else {
                                int var58 = 0;
                                if (var49.field2544 == 1) {
                                    var58 = (var55 >> 4) * var49.field2528;
                                } else if (var49.field2544 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field2528;
                                }
                                if (var49.field2540 == 0) {
                                    if (var49.field2536 == 0) {
                                        var13 += (var48.field7815 - var58) * arg1;
                                        var14 += (var49.field2530 - var58) * arg1;
                                        var15 += (var48.field7816 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field3569 += (var48.field7815 - var58) * arg1;
                                        super.field3568 += (var49.field2530 - var58) * arg1;
                                        super.field3559 += (var48.field7816 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field2526;
                                    int var60 = (var51 << 15) / var55 * var49.field2526;
                                    int var61 = (var52 << 15) / var55 * var49.field2526;
                                    if (var49.field2536 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field3569 += arg1 * var59 >> 15;
                                        super.field3568 += arg1 * var60 >> 15;
                                        super.field3559 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class546) class574.field8289.method1894(false);
                            }
                        }
                    }
                }
            }
            if (var8.field6188 != null) {
                if (var8.field6200 == null) {
                    var8.field6200 = new int[var8.field6188.length];
                    for (int var62 = 0; var62 < var8.field6188.length; ++var62) {
                        class216.method1426((byte) -120, var8.field6188[var62]);
                        var8.field6200[var62] = ((class388) class38.field411.method524((byte) 124, (long) var8.field6188[var62])).field5965;
                    }
                }
                for (int var63 = 0; var63 < var8.field6200.length; ++var63) {
                    class192 var64 = class132.field1657[var8.field6200[var63]];
                    if (var64.field2536 == 0) {
                        var13 += var64.field2539 * arg1;
                        var14 += var64.field2530 * arg1;
                        var15 += var64.field2531 * arg1;
                        var16 = true;
                    } else {
                        super.field3569 += var64.field2539 * arg1;
                        super.field3568 += var64.field2530 * arg1;
                        super.field3559 += var64.field2531 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field7519 = (short) var13;
                        this.field7521 = (short) var14;
                        this.field7518 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field7516 <<= 1;
                }
            }
            super.field3569 = (int) ((long) super.field3569 + ((long) (this.field7516 << 2) * (long) this.field7519 >> 23) * (long) arg1);
            super.field3568 = (int) ((long) super.field3568 + ((long) (this.field7516 << 2) * (long) this.field7521 >> 23) * (long) arg1);
            super.field3559 = (int) ((long) super.field3559 + ((long) (this.field7516 << 2) * (long) this.field7518 >> 23) * (long) arg1);
        }
    }
}
