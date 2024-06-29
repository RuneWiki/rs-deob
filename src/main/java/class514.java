import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class514 extends class214 {

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    private int field7454 = 6;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field7458 = 0;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lraa;IIBILaa;ILha;I)V")
    public static final void method3080(class353 arg0, int arg1, int arg2, byte arg3, int arg4, class570 arg5, int arg6, class544 arg7, int arg8) {
        if (arg3 >= -46) {
            field7458 = -27;
        }
        ++field7460;
        class277 var9 = class617.field8704.method2550(arg2, 126);
        if (var9 != null && var9.field4239 && var9.method1813((byte) 79, class422.field6216)) {
            if (var9.field4209 != null) {
                int[] var10 = new int[var9.field4209.length];
                for (int var11 = 0; var11 < var10.length / 2; ++var11) {
                    int var28;
                    if (~class639.field8978 == -5) {
                        var28 = 16383 & (int) class261.field4064;
                    } else {
                        var28 = 16383 & (int) class261.field4064 + class25.field252;
                    }
                    int var29 = class582.field8226[var28];
                    int var30 = class582.field8230[var28];
                    if (~class639.field8978 != -5) {
                        var30 = var30 * 256 / (class754.field10516 + 256);
                        var29 = var29 * 256 / (class754.field10516 + 256);
                    }
                    var10[var11 * 2] = arg1 - -(arg0.field5230 / 2) - -((var9.field4209[var11 * 2] * 4 + arg4) * var30 + (var9.field4209[var11 * 2 + 1] * 4 + arg8) * var29 >> 14);
                    var10[var11 * 2 + 1] = arg0.field5280 / 2 + arg6 + -((var9.field4209[var11 * 2 + 1] * 4 + arg8) * var30 + -((var9.field4209[var11 * 2] * 4 + arg4) * var29) >> 14);
                }
                class646.method3651(arg7, var10, var9.field4219, arg0.field5199, arg0.field5286);
                if (~var9.field4250 < -1) {
                    for (int var12 = 0; ~var12 > ~(var10.length / 2 + -1); ++var12) {
                        int var20 = var10[var12 * 2];
                        int var21 = var10[var12 * 2 + 1];
                        int var22 = var10[var12 * 2 - -2];
                        int var23 = var10[var12 * 2 + 1 - -2];
                        if (~var22 <= ~var20) {
                            if (~var20 == ~var22 && var23 < var21) {
                                int var24 = var21;
                                var21 = var23;
                                var23 = var24;
                            }
                        } else {
                            int var25 = var20;
                            int var26 = var21;
                            var20 = var22;
                            var21 = var23;
                            var22 = var25;
                            var23 = var26;
                        }
                        arg7.method290(var20, var21, var22, var23, var9.field4243[var9.field4232[var12] & 255], 1, arg5, arg1, arg6, var9.field4250, var9.field4244, var9.field4227);
                    }
                    int var13 = var10[var10.length + -2];
                    int var14 = var10[var10.length + -1];
                    int var15 = var10[0];
                    int var16 = var10[1];
                    if (~var13 >= ~var15) {
                        if (~var13 == ~var15 && ~var14 < ~var16) {
                            int var17 = var14;
                            var14 = var16;
                            var16 = var17;
                        }
                    } else {
                        int var18 = var13;
                        int var19 = var14;
                        var13 = var15;
                        var15 = var18;
                        var14 = var16;
                        var16 = var19;
                    }
                    arg7.method290(var13, var14, var15, var16, var9.field4243[255 & var9.field4232[var9.field4232.length + -1]], 1, arg5, arg1, arg6, var9.field4250, var9.field4244, var9.field4227);
                } else {
                    for (int var27 = 0; ~var27 > ~(var10.length / 2 + -1); ++var27) {
                        arg7.method348(var10[var27 * 2], var10[var27 * 2 + 1], var10[(var27 + 1) * 2], var10[var27 * 2 + 2 - -1], var9.field4243[255 & var9.field4232[var27]], 1, arg5, arg1, arg6);
                    }
                    arg7.method348(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field4243[var9.field4232[var9.field4232.length - 1] & 255], 1, arg5, arg1, arg6);
                }
            }
            class34 var31 = null;
            if (~var9.field4237 != 0) {
                var31 = var9.method1811(false, arg7, 119);
                if (var31 != null) {
                    class478.method2907(arg5, true, arg0, arg1, arg4, var31, arg6, arg8);
                }
            }
            if (var9.field4225 != null) {
                int var32 = 0;
                if (var31 != null) {
                    var32 = var31.method179();
                }
                class400 var33 = class236.field3788;
                class54 var34 = class570.field8090;
                if (var9.field4211 == 1) {
                    var34 = class594.field8343;
                    var33 = class74.field1105;
                }
                if (var9.field4211 == 2) {
                    var33 = class257.field4034;
                    var34 = class632.field8881;
                }
                class227.method1587(4, arg0, arg8, arg5, var33, arg1, var32, var9.field4225, arg6, var9.field4247, var34, arg4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class514() {
        super(2, false);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(JI)V")
    public static final void method3081(long arg0, int arg1) {
        ++field7457;
        int var3 = class590.field8319;
        if (~class701.field9907 != ~var3) {
            int var4 = -class701.field9907 + var3;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 <= 0) {
                if (var5 != 0) {
                    if (var5 < var4) {
                        var5 = var4;
                    }
                } else {
                    var5 = -1;
                }
            } else if (~var5 == -1) {
                var5 = 1;
            } else if (var4 < var5) {
                var5 = var4;
            }
            class701.field9907 += var5;
        }
        int var6 = class617.field8705;
        class261.field4064 += (float) arg0 * class285.field4394 / 40.0F * 8.0F;
        class490.field7077 += (float) arg0 * class393.field5872 / 40.0F * 8.0F;
        if (class141.field2213 != var6) {
            int var7 = -class141.field2213 + var6;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (~var8 != -1) {
                    if (~var8 < ~var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (var8 != 0) {
                if (var8 < var7) {
                    var8 = var7;
                }
            } else {
                var8 = -1;
            }
            class141.field2213 += var8;
        }
        if (arg1 <= 40) {
            field7458 = -78;
        }
        class632.method3582((byte) 85);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field7456;
        int[][] var3 = super.field3545.method2996((byte) 125, arg0);
        if (super.field3545.field7147) {
            int[][] var4 = this.method1539(true, 0, arg0);
            int[][] var5 = this.method1539(true, 1, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field7454;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class626.field8787; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = var17 + var18 + -(var17 * var18 >> 11);
                                                                var7[var16] = var19 - -var22 + -(var19 * var22 >> 11);
                                                                var8[var16] = -(var20 * var21 >> 11) + var20 + var21;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class626.field8787; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var13[var23];
                                                            var6[var23] = ~var27 < ~var28 ? -var28 + var27 : -var27 + var28;
                                                            var7[var23] = ~var29 <= ~var24 ? -var24 + var29 : var24 - var29;
                                                            var8[var23] = ~var25 >= ~var26 ? -var25 + var26 : -var26 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class626.field8787; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = ~var32 < ~var36 ? var32 : var36;
                                                        var7[var30] = var33 > var35 ? var33 : var35;
                                                        var8[var30] = ~var34 > ~var31 ? var31 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class626.field8787 < ~var37; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = var38 < var42 ? var38 : var42;
                                                    var7[var37] = var40 < var41 ? var40 : var41;
                                                    var8[var37] = var43 <= var39 ? var43 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class626.field8787; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var45 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var7[var44] = ~var46 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var46) + 4096;
                                                var8[var44] = ~var47 == -1 ? 0 : 4096 - (4096 - var14[var44] << 12) / var47;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class626.field8787; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 != 4096 ? (var12[var48] << 12) / (4096 - var51) : 4096;
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                            var8[var48] = var49 != 4096 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class626.field8787; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = var54 >= 2048 ? -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                        var8[var52] = var55 >= 2048 ? -((4096 - var55) * (-var11[var52] + 4096) >> 11) + 4096 : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class626.field8787 > var56; ++var56) {
                                    var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var7[var56] = -((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class626.field8787 > var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 == 0 ? 4096 : (var9[var57] << 12) / var60;
                                var7[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = ~var58 != -1 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class626.field8787 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class626.field8787; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class626.field8787 < ~var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        if (arg1 != -256) {
            method3080((class353) null, -86, 31, (byte) 88, 58, (class570) null, -44, (class544) null, -62);
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field7459;
        if (arg1 != 5) {
            return null;
        } else {
            int[] var3 = super.field3544.method3869(arg0, arg1 + -133);
            if (super.field3544.field9836) {
                int[] var4 = this.method1545(arg0, 0, -1);
                int[] var5 = this.method1545(arg0, 1, arg1 ^ -6);
                int var6 = this.field7454;
                if (var6 != 1) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; class626.field8787 > var7; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; class626.field8787 > var10; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = ~var12 > ~var11 ? var11 - var12 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~var13 > ~class626.field8787; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = var15 >= var14 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; var16 < class626.field8787; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = var18 <= var17 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~var19 > ~class626.field8787; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~var21 > ~class626.field8787; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~class626.field8787 < ~var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 <= -2049 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class626.field8787 < ~var25; ++var25) {
                                        var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class626.field8787; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class626.field8787; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class626.field8787 < ~var29; ++var29) {
                            var3[var29] = var4[var29] - var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class626.field8787; ++var30) {
                        var3[var30] = var4[var30] - -var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field3540 = arg1.method1987(-26) == 1;
            }
        } else {
            this.field7454 = arg1.method1987(-104);
        }
        if (arg0 < 92) {
            field7458 = -42;
        }
        ++field7453;
    }
}
