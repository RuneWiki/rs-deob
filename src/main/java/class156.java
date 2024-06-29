import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class156 extends class424 {

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    private int field2221 = 6;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "Ltn;")
    public static class109 field2220 = new class109(16);

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "Lhc;")
    public static class368 field2222 = new class368("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "I")
    public static int field2225 = -1;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "(I)V")
    public static void method1134(int arg0) {
        if (arg0 <= 118) {
            method1135(-3, -123, 67);
        }
        field2222 = null;
        field2220 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field2219;
        int[] var3 = super.field5892.method783(arg0, (byte) 92);
        if (arg1 != -10) {
            method1135(115, 21, -96);
        }
        if (super.field5892.field1427) {
            int[] var4 = this.method2621(0, -114, arg0);
            int[] var5 = this.method2621(1, -119, arg0);
            int var6 = this.field2221;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class303.field4135 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class303.field4135; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 >= ~var11 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class303.field4135; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class303.field4135; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class303.field4135 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class303.field4135 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class303.field4135; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class303.field4135 < ~var25; ++var25) {
                                    var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class303.field4135; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class303.field4135; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class303.field4135 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class303.field4135 > var30; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(III)I")
    public static final int method1135(int arg0, int arg1, int arg2) {
        int var3 = -58 / ((-48 - arg2) / 53);
        ++field2217;
        if (~arg0 == 1) {
            return 12345678;
        } else if (arg0 == -1) {
            if (~arg1 > -3) {
                arg1 = 2;
            } else if (~arg1 < -127) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var4 = (127 & arg0) * arg1 >> 7;
            if (~var4 <= -3) {
                if (~var4 < -127) {
                    var4 = 126;
                }
            } else {
                var4 = 2;
            }
            return (arg0 & 65408) + var4;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field2215;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[][] var4 = this.method2624(true, 0, arg0);
            int[][] var5 = this.method2624(true, 1, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field2221;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class303.field4135; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = var20 + var22 + -(var20 * var22 >> 11);
                                                                var7[var16] = var17 + var18 + -(var17 * var18 >> 11);
                                                                var8[var16] = -(var19 * var21 >> 11) + var19 - -var21;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class303.field4135; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = ~var26 > ~var28 ? -var26 + var28 : -var28 + var26;
                                                            var7[var23] = var25 < var29 ? var29 - var25 : -var29 + var25;
                                                            var8[var23] = var24 >= var27 ? -var27 + var24 : -var24 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class303.field4135 > var30; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = ~var31 < ~var36 ? var31 : var36;
                                                        var7[var30] = var33 >= var34 ? var33 : var34;
                                                        var8[var30] = var35 >= var32 ? var35 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class303.field4135 < ~var37; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = ~var38 < ~var43 ? var43 : var38;
                                                    var7[var37] = ~var42 >= ~var41 ? var42 : var41;
                                                    var8[var37] = ~var39 > ~var40 ? var39 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class303.field4135 > var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var45 != -1 ? 4096 - (-var12[var44] + 4096 << 12) / var45 : 0;
                                                var7[var44] = ~var46 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var46) + 4096;
                                                var8[var44] = var47 != 0 ? -((-var14[var44] + 4096 << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class303.field4135 > var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 != 4096 ? (var12[var48] << 12) / (4096 - var51) : 4096;
                                            var7[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (4096 - var49) : 4096;
                                            var8[var48] = var50 != 4096 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class303.field4135; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var52] = var54 < 2048 ? var11[var52] * var54 >> 11 : -((4096 - var54) * (-var11[var52] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class303.field4135 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class303.field4135; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var59 == -1 ? 4096 : (var9[var57] << 12) / var59;
                                var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class303.field4135; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class303.field4135; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class303.field4135 > var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BIIII)V")
    public static final void method1136(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~(-arg4 + arg3) <= ~class80.field1119 && ~(arg3 - -arg4) >= ~class430.field6003 && ~(-arg4 + arg2) <= ~class143.field2090 && class42.field543 >= arg2 - -arg4) {
            class407.method2515(arg3, arg0 ^ 69, arg4, arg1, arg2);
        } else {
            class144.method1047(2, arg3, arg1, arg2, arg4);
        }
        ++field2218;
        if (arg0 != 68) {
            method1137((Object[]) null, (int[]) null, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class156() {
        super(2, false);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([Ljava/lang/Object;[IB)V")
    public static final void method1137(Object[] arg0, int[] arg1, byte arg2) {
        class356.method2138(0, arg1.length - 1, (byte) -108, arg1, arg0);
        ++field2223;
        if (arg2 != 110) {
            field2222 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field5893 = arg0.method2306((byte) 80) == 1;
            }
        } else {
            this.field2221 = arg0.method2306((byte) 78);
        }
        if (arg1 != -48) {
            method1137((Object[]) null, (int[]) null, (byte) -108);
        }
        ++field2216;
    }
}
