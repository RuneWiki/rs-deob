import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class114 extends class219 {

    @OriginalMember(owner = "client!wq", name = "J", descriptor = "Lnc;")
    private class21 field1714;

    @OriginalMember(owner = "client!wq", name = "H", descriptor = "S")
    private short field1712;

    @OriginalMember(owner = "client!wq", name = "F", descriptor = "S")
    private short field1710;

    @OriginalMember(owner = "client!wq", name = "D", descriptor = "S")
    private short field1708;

    @OriginalMember(owner = "client!wq", name = "I", descriptor = "S")
    private short field1713;

    @OriginalMember(owner = "client!wq", name = "C", descriptor = "S")
    private short field1707;

    @OriginalMember(owner = "client!wq", name = "E", descriptor = "I")
    private int field1709;

    @OriginalMember(owner = "client!wq", name = "G", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!wq", name = "K", descriptor = "S")
    private short field1715;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lnc;IIIIIIIIIIIZZ)V")
    public final void method815(class21 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1714 = arg0;
        super.field3050 = arg1 << class255.field3542;
        super.field3053 = arg2 << class255.field3542;
        super.field3055 = arg3 << class255.field3542;
        super.field3058 = arg9;
        this.field1710 = this.field1712 = (short) arg8;
        super.field3049 = arg10;
        super.field3056 = arg11;
        super.field3052 = arg13;
        this.field1708 = (short) arg4;
        this.field1713 = (short) arg5;
        this.field1707 = (short) arg6;
        this.field1709 = arg7;
        super.field3057 = this.field1714.field278.field7720;
        this.method818();
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(J)V")
    public final void method816(long arg0) {
        int var3 = super.field3050 >> class523.field7736 + 12;
        int var4 = super.field3055 >> class523.field7736 + 12;
        int var5 = super.field3053 >> class255.field3542;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class206.field2881 && var4 >= 0 && var4 < class371.field5427) {
            class190 var6 = this.field1714.field270;
            class94 var7 = this.field1714.field293;
            class142[] var8 = class211.field2950;
            int var9 = var8[var6.field2745].method351(var3, var4);
            int var10;
            if (var6.field2745 < class253.field3523 - 1) {
                var10 = var8[var6.field2745 + 1].method351(var3, var4);
            } else {
                var10 = var9 - (8 << class523.field7736);
            }
            if (var7.field1405) {
                if (var7.field1443 == -1 && var5 > var9) {
                    this.method819();
                    return;
                }
                if (var7.field1443 >= 0 && var5 > var8[var7.field1443].method351(var3, var4)) {
                    this.method819();
                    return;
                }
                if (var7.field1417 == -1 && var5 < var10) {
                    this.method819();
                    return;
                }
                if (var7.field1417 >= 0 && var5 < var8[var7.field1417 + 1].method351(var3, var4)) {
                    this.method819();
                    return;
                }
            }
            if (var3 >= var6.field2741 && var3 <= var6.field2744 && var4 >= var6.field2746 && var4 <= var6.field2743 && var5 <= var9 && var5 >= var10) {
                var6.field2742.field7740.method909((byte) -66, this);
            } else {
                int var11;
                for (var11 = class253.field3523 - 1; var11 > 0 && var5 > var8[var11].method351(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method351(var3, var4)) {
                    this.method819();
                } else if (class253.field3523 - 1 == var11 && var8[var11].method351(var3, var4) - var5 > 8 << class523.field7736) {
                    this.method819();
                } else {
                    class486 var12 = class89.field1305[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class89.field1305[0][var3][var4] = new class486(0, var3, var4);
                        }
                        boolean var13 = class89.field1305[0][var3][var4].field7112 != null;
                        if (var11 == 3 && var13) {
                            this.method819();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class89.field1305[var14][var3][var4] == null) {
                                var12 = class89.field1305[var14][var3][var4] = new class486(var14, var3, var4);
                                if (var13) {
                                    ++var12.field7101;
                                }
                            }
                        }
                    }
                    if (var12.field7119 == null) {
                        var12.field7119 = new class523();
                        var12.field7117 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field7117) {
                        var12.field7119.field7740.method912(7);
                        var12.field7119.field7743 = false;
                        var12.field7117 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field7119.field7740.method909((byte) -104, this);
                }
            }
        } else {
            this.method819();
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(JI)V")
    public final void method817(long arg0, int arg1) {
        this.field1712 = (short) (this.field1712 - arg1);
        if (this.field1712 <= 0) {
            this.method819();
        } else {
            int var4 = super.field3050 >> class255.field3542;
            int var5 = super.field3053 >> class255.field3542;
            int var6 = super.field3055 >> class255.field3542;
            class190 var7 = this.field1714.field270;
            class94 var8 = this.field1714.field293;
            if (var8.field1402 != 0) {
                if (this.field1710 - this.field1712 <= var8.field1411) {
                    int var9 = var8.field1420 * arg1 + (super.field3058 >> 8 & 65280) + (this.field1711 >> 16 & 255);
                    int var10 = var8.field1382 * arg1 + (this.field1711 >> 8 & 255) + (super.field3058 & 65280);
                    int var11 = var8.field1415 * arg1 + (super.field3058 << 8 & 65280) + (this.field1711 & 255);
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
                    super.field3058 &= -16777216;
                    super.field3058 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field1711 &= -16777216;
                    this.field1711 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field1710 - this.field1712 <= var8.field1400) {
                    int var12 = var8.field1408 * arg1 + (super.field3058 >> 16 & 65280) + (this.field1711 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3058 &= 16777215;
                    super.field3058 |= (var12 & 65280) << 16;
                    this.field1711 &= 16777215;
                    this.field1711 |= (var12 & 255) << 24;
                }
            }
            if (var8.field1409 != -1 && this.field1710 - this.field1712 <= var8.field1444) {
                this.field1709 += var8.field1441 * arg1;
            }
            if (var8.field1412 != -1 && this.field1710 - this.field1712 <= var8.field1422) {
                super.field3049 += var8.field1447 * arg1;
            }
            int var13 = this.field1708;
            int var14 = this.field1713;
            int var15 = this.field1707;
            boolean var16 = false;
            if (var8.field1437 == 1) {
                int var17 = var4 - this.field1714.field291;
                int var18 = var5 - this.field1714.field287;
                int var19 = var6 - this.field1714.field289;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field1387 * var20 * arg1);
                this.field1709 = (int) ((long) this.field1709 - ((long) this.field1709 * var21 >> 18));
            } else if (var8.field1437 == 2) {
                int var23 = var4 - this.field1714.field291;
                int var24 = var5 - this.field1714.field287;
                int var25 = var6 - this.field1714.field289;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field1387 * var26 * arg1);
                this.field1709 = (int) ((long) this.field1709 - ((long) this.field1709 * var27 >> 28));
            }
            if (var8.field1452 != null) {
                class260 var29 = var7.field2737.field6997;
                for (class260 var30 = var29.field3612; var29 != var30; var30 = var30.field3612) {
                    class347 var31 = (class347) var30;
                    class281 var32 = var31.field4965;
                    if (var32.field3851 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field1452.length; ++var34) {
                            if (var8.field1452[var34] == var32.field3850) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field4962;
                            int var36 = var5 - var31.field4966;
                            int var37 = var6 - var31.field4971;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3840) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field4961 * var37 + var31.field4969 * var35 + var32.field3848 * var36) * 65535L / (long) (var32.field3852 * var40);
                                if (var41 >= (long) var32.field3847) {
                                    int var43 = 0;
                                    if (var32.field3853 == 1) {
                                        var43 = (var40 >> 4) * var32.field3846;
                                    } else if (var32.field3853 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3846;
                                    }
                                    if (var32.field3845 == 0) {
                                        if (var32.field3841 == 0) {
                                            var13 += (var31.field4969 - var43) * arg1;
                                            var14 += (var32.field3848 - var43) * arg1;
                                            var15 += (var31.field4961 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field3050 += (var31.field4969 - var43) * arg1;
                                            super.field3053 += (var32.field3848 - var43) * arg1;
                                            super.field3055 += (var31.field4961 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3852;
                                        int var45 = (var36 << 15) / var40 * var32.field3852;
                                        int var46 = (var37 << 15) / var40 * var32.field3852;
                                        if (var32.field3841 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field3050 += arg1 * var44 >> 15;
                                            super.field3053 += arg1 * var45 >> 15;
                                            super.field3055 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field1426 != null) {
                for (int var47 = 0; var47 < var8.field1426.length; ++var47) {
                    class347 var48 = (class347) class451.field6652.method215((long) var8.field1426[var47], 12306);
                    while (var48 != null) {
                        class281 var49 = var48.field4965;
                        int var50 = var4 - var48.field4962;
                        int var51 = var5 - var48.field4966;
                        int var52 = var6 - var48.field4971;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3840) {
                            var48 = (class347) class451.field6652.method210((byte) -126);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field4961 * var52 + var48.field4969 * var50 + var49.field3848 * var51) * 65535L / (long) (var49.field3852 * var55);
                            if (var56 < (long) var49.field3847) {
                                var48 = (class347) class451.field6652.method210((byte) -128);
                            } else {
                                int var58 = 0;
                                if (var49.field3853 == 1) {
                                    var58 = (var55 >> 4) * var49.field3846;
                                } else if (var49.field3853 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3846;
                                }
                                if (var49.field3845 == 0) {
                                    if (var49.field3841 == 0) {
                                        var13 += (var48.field4969 - var58) * arg1;
                                        var14 += (var49.field3848 - var58) * arg1;
                                        var15 += (var48.field4961 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field3050 += (var48.field4969 - var58) * arg1;
                                        super.field3053 += (var49.field3848 - var58) * arg1;
                                        super.field3055 += (var48.field4961 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3852;
                                    int var60 = (var51 << 15) / var55 * var49.field3852;
                                    int var61 = (var52 << 15) / var55 * var49.field3852;
                                    if (var49.field3841 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field3050 += arg1 * var59 >> 15;
                                        super.field3053 += arg1 * var60 >> 15;
                                        super.field3055 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class347) class451.field6652.method210((byte) -126);
                            }
                        }
                    }
                }
            }
            if (var8.field1390 != null) {
                if (var8.field1429 == null) {
                    var8.field1429 = new int[var8.field1390.length];
                    for (int var62 = 0; var62 < var8.field1390.length; ++var62) {
                        class494.method2893(var8.field1390[var62], 0);
                        var8.field1429[var62] = ((class500) class302.field4139.method1492((long) var8.field1390[var62], 6340)).field7369;
                    }
                }
                for (int var63 = 0; var63 < var8.field1429.length; ++var63) {
                    class281 var64 = class521.field7709[var8.field1429[var63]];
                    if (var64.field3841 == 0) {
                        var13 += var64.field3849 * arg1;
                        var14 += var64.field3848 * arg1;
                        var15 += var64.field3842 * arg1;
                        var16 = true;
                    } else {
                        super.field3050 += var64.field3849 * arg1;
                        super.field3053 += var64.field3848 * arg1;
                        super.field3055 += var64.field3842 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field1708 = (short) var13;
                        this.field1713 = (short) var14;
                        this.field1707 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field1709 <<= 1;
                }
            }
            super.field3050 = (int) ((long) super.field3050 + ((long) this.field1708 * (long) this.field1709 >> 23) * (long) arg1);
            super.field3053 = (int) ((long) super.field3053 + ((long) this.field1713 * (long) this.field1709 >> 23) * (long) arg1);
            super.field3055 = (int) ((long) super.field3055 + ((long) this.field1707 * (long) this.field1709 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "()V")
    private final void method818() {
        int var1 = this.field1714.field270.field2733;
        if (this.field1714.field270.field2729[var1] != null) {
            this.field1714.field270.field2729[var1].method819();
        }
        this.field1714.field270.field2729[var1] = this;
        this.field1715 = (short) this.field1714.field270.field2733;
        this.field1714.field270.field2733 = var1 + 1 & 8191;
        this.field1714.field301.method2454(-9946, this);
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "()V")
    private final void method819() {
        this.field1714.field270.field2729[this.field1715] = null;
        class527.field7796[class266.field3670] = this;
        class266.field3670 = class266.field3670 + 1 & 1023;
        this.method1522(-59);
        this.method2020(83);
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lnc;IIIIIIIIIIIZZ)V")
    public class114(class21 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1714 = arg0;
        super.field3050 = arg1 << class255.field3542;
        super.field3053 = arg2 << class255.field3542;
        super.field3055 = arg3 << class255.field3542;
        super.field3058 = arg9;
        this.field1710 = this.field1712 = (short) arg8;
        super.field3049 = arg10;
        super.field3056 = arg11;
        super.field3052 = arg13;
        this.field1708 = (short) arg4;
        this.field1713 = (short) arg5;
        this.field1707 = (short) arg6;
        this.field1709 = arg7;
        super.field3057 = this.field1714.field278.field7720;
        this.method818();
    }
}
