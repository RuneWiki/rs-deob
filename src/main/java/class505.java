import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class505 extends class478 {

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    private int field7269 = 6;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "[I")
    public static int[] field7272 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "Z")
    public static boolean field7274 = false;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public static final void method2896(int arg0) {
        ++field7268;
        if (arg0 != 1) {
            method2897((byte) 2);
        }
        if (class56.field560 != null) {
            class525[] var1 = class56.field560;
            for (int var2 = 0; ~var1.length < ~var2; ++var2) {
                class525 var3 = var1[var2];
                var3.method2458(arg0 + 10);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field7275;
            int[][] var3 = super.field6889.method2091(-123, arg1);
            if (super.field6889.field4765) {
                int[][] var4 = this.method2753(0, arg1, (byte) 11);
                int[][] var5 = this.method2753(1, arg1, (byte) 11);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field7269;
                if (~var15 != -2) {
                    if (~var15 != -3) {
                        if (~var15 != -4) {
                            if (var15 != 4) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (var15 != 7) {
                                            if (~var15 != -9) {
                                                if (var15 != 9) {
                                                    if (~var15 != -11) {
                                                        if (~var15 != -12) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; ~class436.field6154 < ~var16; ++var16) {
                                                                    int var17 = var10[var16];
                                                                    int var18 = var13[var16];
                                                                    int var19 = var9[var16];
                                                                    int var20 = var11[var16];
                                                                    int var21 = var12[var16];
                                                                    int var22 = var14[var16];
                                                                    var6[var16] = var19 - ((var19 * var21 >> 11) + -var21);
                                                                    var7[var16] = -(var17 * var18 >> 11) + var17 - -var18;
                                                                    var8[var16] = var20 - -var22 + -(var20 * var22 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; class436.field6154 > var23; ++var23) {
                                                                int var24 = var13[var23];
                                                                int var25 = var14[var23];
                                                                int var26 = var11[var23];
                                                                int var27 = var12[var23];
                                                                int var28 = var10[var23];
                                                                int var29 = var9[var23];
                                                                var6[var23] = var29 > var27 ? -var27 + var29 : -var29 + var27;
                                                                var7[var23] = var24 < var28 ? -var24 + var28 : -var28 + var24;
                                                                var8[var23] = ~var26 < ~var25 ? -var25 + var26 : -var26 + var25;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; ~var30 > ~class436.field6154; ++var30) {
                                                            int var31 = var11[var30];
                                                            int var32 = var14[var30];
                                                            int var33 = var12[var30];
                                                            int var34 = var13[var30];
                                                            int var35 = var10[var30];
                                                            int var36 = var9[var30];
                                                            var6[var30] = var36 <= var33 ? var33 : var36;
                                                            var7[var30] = var35 <= var34 ? var34 : var35;
                                                            var8[var30] = ~var32 <= ~var31 ? var32 : var31;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; var37 < class436.field6154; ++var37) {
                                                        int var38 = var10[var37];
                                                        int var39 = var12[var37];
                                                        int var40 = var9[var37];
                                                        int var41 = var13[var37];
                                                        int var42 = var11[var37];
                                                        int var43 = var14[var37];
                                                        var6[var37] = ~var40 > ~var39 ? var40 : var39;
                                                        var7[var37] = var38 >= var41 ? var41 : var38;
                                                        var8[var37] = ~var43 >= ~var42 ? var43 : var42;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; ~var44 > ~class436.field6154; ++var44) {
                                                    int var45 = var11[var44];
                                                    int var46 = var9[var44];
                                                    int var47 = var10[var44];
                                                    var6[var44] = var46 == 0 ? 0 : -((4096 - var12[var44] << 12) / var46) + 4096;
                                                    var7[var44] = var47 != 0 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                    var8[var44] = ~var45 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; ~class436.field6154 < ~var48; ++var48) {
                                                int var49 = var9[var48];
                                                int var50 = var10[var48];
                                                int var51 = var11[var48];
                                                var6[var48] = var49 != 4096 ? (var12[var48] << 12) / (4096 - var49) : 4096;
                                                var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (4096 - var50);
                                                var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; ~class436.field6154 < ~var52; ++var52) {
                                            int var53 = var13[var52];
                                            int var54 = var12[var52];
                                            int var55 = var14[var52];
                                            var6[var52] = var54 < 2048 ? var9[var52] * var54 >> 11 : 4096 - ((-var9[var52] + 4096) * (-var54 + 4096) >> 11);
                                            var7[var52] = ~var53 <= -2049 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                            var8[var52] = ~var55 <= -2049 ? 4096 - ((-var11[var52] + 4096) * (-var55 + 4096) >> 11) : var11[var52] * var55 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; class436.field6154 > var56; ++var56) {
                                        var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~var57 > ~class436.field6154; ++var57) {
                                    int var58 = var13[var57];
                                    int var59 = var14[var57];
                                    int var60 = var12[var57];
                                    var6[var57] = ~var60 == -1 ? 4096 : (var9[var57] << 12) / var60;
                                    var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                    var8[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                                }
                            }
                        } else {
                            for (int var61 = 0; ~var61 > ~class436.field6154; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class436.field6154; ++var62) {
                            var6[var62] = var9[var62] - var12[var62];
                            var7[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~var63 > ~class436.field6154; ++var63) {
                        var6[var63] = var9[var63] + var12[var63];
                        var7[var63] = var10[var63] - -var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static void method2897(byte arg0) {
        int var1 = -38 % ((arg0 - 28) / 47);
        field7272 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class505() {
        super(2, false);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -11323) {
            return null;
        } else {
            ++field7277;
            int[] var3 = super.field6886.method789(arg0, (byte) -77);
            if (super.field6886.field1592) {
                int[] var4 = this.method2752(arg0, 82, 0);
                int[] var5 = this.method2752(arg0, 111, 1);
                int var6 = this.field7269;
                if (~var6 != -2) {
                    if (~var6 != -3) {
                        if (var6 != 3) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (var6 != 7) {
                                            if (var6 != 8) {
                                                if (var6 != 9) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; ~class436.field6154 < ~var7; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class436.field6154 < ~var10; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = ~var12 <= ~var11 ? -var11 + var12 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; class436.field6154 > var13; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = var14 >= var15 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~var16 > ~class436.field6154; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = var17 < var18 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~class436.field6154 < ~var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = ~var20 == -1 ? 0 : 4096 - (4096 - var5[var19] << 12) / var20;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < class436.field6154; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; var23 < class436.field6154; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class436.field6154 < ~var25; ++var25) {
                                        var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class436.field6154; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; var28 < class436.field6154; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class436.field6154 < ~var29; ++var29) {
                            var3[var29] = var4[var29] - var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class436.field6154; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field7271;
        if (arg0 == 255) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    super.field6881 = arg1.method620((byte) -127) == 1;
                }
            } else {
                this.field7269 = arg1.method620((byte) 5);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILsp;)V")
    public static final void method2898(int arg0, int arg1, class677 arg2) {
        ++field7276;
        int var3 = -1;
        int var4 = 0;
        if (arg2.field9479 > class678.field9539) {
            class179.method1092(12288, arg2);
        } else if (class678.field9539 > arg2.field9506) {
            class119.method692(false, arg2, -2);
            var4 = class171.field1900;
            var3 = class264.field3293;
        } else {
            class387.method2213(-3, arg2);
        }
        if (arg2.field5179 < 512 || ~arg2.field5176 > -513 || ~arg2.field5179 <= ~(class142.field1574 * 512 + -512) || arg2.field5176 >= (class140.field1550 - 1) * 512) {
            arg2.field9466 = null;
            arg2.field9506 = 0;
            arg2.field9447 = -1;
            var3 = -1;
            arg2.field9504 = -1;
            var4 = 0;
            arg2.field9455 = -1;
            arg2.field9479 = 0;
            arg2.field5179 = arg2.field9517[0] * 512 + 256 * arg2.method1414(-31789);
            arg2.field5176 = arg2.field9513[0] * 512 - -(256 * arg2.method1414(-31789));
            arg2.method3739(-121);
        }
        if (arg0 >= 124) {
            if (class362.field4859 == arg2 && (~arg2.field5179 > -6145 || ~arg2.field5176 > -6145 || arg2.field5179 >= class142.field1574 * 512 + -6144 || ~arg2.field5176 <= ~(class140.field1550 * 512 + -6144))) {
                arg2.field9455 = -1;
                var3 = -1;
                arg2.field9479 = 0;
                arg2.field9504 = -1;
                arg2.field9506 = 0;
                var4 = 0;
                arg2.field9466 = null;
                arg2.field9447 = -1;
                arg2.field5179 = arg2.field9517[0] * 512 + 256 * arg2.method1414(-31789);
                arg2.field5176 = arg2.field9513[0] * 512 - -(arg2.method1414(-31789) * 256);
                arg2.method3739(-124);
            }
            int var5 = class301.method1750(arg2, -115);
            class279.method1628(38, var5, var3, arg2, var4);
            class136.method765((byte) 122, var3, arg2);
            class498.method2873(arg2, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)V")
    public static final void method2899(int arg0) {
        class102.field1106 = new class452[class551.field7882.method3877(100)][];
        ++field7270;
        class483.field6965 = new class452[class551.field7882.method3877(100)][];
        class507.field7282 = new boolean[class551.field7882.method3877(100)];
        if (arg0 <= 59) {
            method2897((byte) -38);
        }
    }
}
