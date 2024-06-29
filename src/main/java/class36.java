import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class36 extends class107 {

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    private int field575 = 6;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILhd;ZI)V")
    public static final void method262(int arg0, class12 arg1, boolean arg2, int arg3) {
        if (arg2) {
            ++field578;
            if (~arg1.field900 == ~arg0 && ~arg0 != 0) {
                class91 var4 = class159.method1085((byte) -63, arg0);
                int var5 = var4.field1453;
                if (var5 == 1) {
                    arg1.field934 = 0;
                    arg1.field973 = arg3;
                    arg1.field951 = 0;
                    arg1.field984 = 1;
                    arg1.field955 = 0;
                    class252.method1710(arg1.field934, arg1.field929, var4, arg1.field994, class217.field3408 == arg1, 46);
                }
                if (~var5 == -3) {
                    arg1.field955 = 0;
                    return;
                }
            } else if (arg0 == -1 || ~arg1.field900 == 0 || class159.method1085((byte) -63, arg0).field1447 >= class159.method1085((byte) -63, arg1.field900).field1447) {
                arg1.field934 = 0;
                arg1.field984 = 1;
                arg1.field900 = arg0;
                arg1.field973 = arg3;
                arg1.field955 = 0;
                arg1.field943 = arg1.field936;
                arg1.field951 = 0;
                if (arg1.field900 == -1) {
                    return;
                }
                class252.method1710(arg1.field934, arg1.field929, class159.method1085((byte) -63, arg1.field900), arg1.field994, class217.field3408 == arg1, 78);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field572;
        int var3 = 112 % ((-34 - arg0) / 49);
        int[] var4 = super.field1661.method894(-106, arg1);
        if (super.field1661.field2115) {
            int[] var5 = this.method756(0, arg1, -29053);
            int[] var6 = this.method756(1, arg1, -29053);
            int var7 = this.field575;
            if (~var7 != -2) {
                if (~var7 != -3) {
                    if (var7 != 3) {
                        if (var7 != 4) {
                            if (var7 != 5) {
                                if (var7 != 6) {
                                    if (var7 != 7) {
                                        if (~var7 != -9) {
                                            if (var7 != 9) {
                                                if (var7 != 10) {
                                                    if (~var7 != -12) {
                                                        if (var7 == 12) {
                                                            for (int var8 = 0; ~var8 > ~class24.field443; ++var8) {
                                                                int var9 = var6[var8];
                                                                int var10 = var5[var8];
                                                                var4[var8] = -(var9 * var10 >> 11) + var9 + var10;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; class24.field443 > var11; ++var11) {
                                                            int var12 = var5[var11];
                                                            int var13 = var6[var11];
                                                            var4[var11] = var13 < var12 ? var12 - var13 : var13 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; class24.field443 > var14; ++var14) {
                                                        int var15 = var6[var14];
                                                        int var16 = var5[var14];
                                                        var4[var14] = ~var16 < ~var15 ? var16 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; class24.field443 > var17; ++var17) {
                                                    int var18 = var6[var17];
                                                    int var19 = var5[var17];
                                                    var4[var17] = var18 <= var19 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < class24.field443; ++var20) {
                                                int var21 = var5[var20];
                                                var4[var20] = ~var21 != -1 ? -((-var6[var20] + 4096 << 12) / var21) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; ~var22 > ~class24.field443; ++var22) {
                                            int var23 = var5[var22];
                                            var4[var22] = ~var23 != -4097 ? (var6[var22] << 12) / (-var23 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; ~class24.field443 < ~var24; ++var24) {
                                        int var25 = var6[var24];
                                        var4[var24] = var25 < 2048 ? var5[var24] * var25 >> 11 : -((4096 - var5[var24]) * (-var25 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class24.field443; ++var26) {
                                    var4[var26] = -((4096 - var5[var26]) * (4096 - var6[var26]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var27 = 0; var27 < class24.field443; ++var27) {
                                int var28 = var6[var27];
                                var4[var27] = var28 == 0 ? 4096 : (var5[var27] << 12) / var28;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class24.field443 < ~var29; ++var29) {
                            var4[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; ~class24.field443 < ~var30; ++var30) {
                        var4[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; class24.field443 > var31; ++var31) {
                    var4[var31] = var5[var31] - -var6[var31];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)I")
    public static final int method263(int arg0, int arg1) {
        ++field574;
        if (arg1 != -229) {
            return 59;
        } else {
            double var2 = (double) (255 & arg0) / 256.0D;
            double var4 = (double) ((arg0 & 16761022) >> 16) / 256.0D;
            double var6 = (double) (255 & arg0 >> 8) / 256.0D;
            double var8 = var4;
            if (var4 > var6) {
                var8 = var6;
            }
            if (var2 < var8) {
                var8 = var2;
            }
            double var10 = var4;
            double var12 = 0.0D;
            if (var4 < var6) {
                var10 = var6;
            }
            double var14 = 0.0D;
            if (var10 < var2) {
                var10 = var2;
            }
            double var16 = (var8 + var10) / 2.0D;
            if (var8 != var10) {
                if (var16 < 0.5D) {
                    var14 = (var10 - var8) / (var8 + var10);
                }
                if (var16 >= 0.5D) {
                    var14 = (-var8 + var10) / (2.0D - var10 - var8);
                }
                if (var4 == var10) {
                    var12 = (var6 - var2) / (var10 - var8);
                } else if (var6 == var10) {
                    var12 = (var2 - var4) / (-var8 + var10) + 2.0D;
                } else if (var2 == var10) {
                    var12 = (-var6 + var4) / (var10 - var8) + 4.0D;
                }
            }
            int var18 = (int) (var14 * 256.0D);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            double var19 = var12 / 6.0D;
            int var21 = (int) (var16 * 256.0D);
            if (~var21 > -1) {
                var21 = 0;
            } else if (~var21 < -256) {
                var21 = 255;
            }
            int var22 = (int) (var19 * 256.0D);
            if (var21 > 243) {
                var18 >>= 4;
            } else if (var21 > 217) {
                var18 >>= 3;
            } else if (~var21 < -193) {
                var18 >>= 2;
            } else if (~var21 < -180) {
                var18 >>= 1;
            }
            return (var22 >> 2 << 10) + (var18 >> 5 << 7) + (var21 >> 1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 == 28) {
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    super.field1660 = ~arg1.method1849(arg2 ^ 227) == -2;
                }
            } else {
                this.field575 = arg1.method1849(arg2 ^ 227);
            }
            ++field576;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class36() {
        super(2, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)Z")
    public static final boolean method264(byte arg0, int arg1) {
        class241 var2 = class90.method626(arg1, -32260);
        ++field573;
        if (var2 == null) {
            return false;
        } else if (~class69.field1112 != -2 && ~class69.field1112 != -3 && class41.field625 != 2) {
            String var3 = "";
            String var4 = "";
            if (~class41.field625 != -1) {
                var3 = ":" + (var2.field3764 + 7000);
            }
            if (class179.field2966 != null) {
                var4 = "/p=" + class179.field2966;
            }
            String var5 = "http://" + var2.field3766 + var3 + "/l=" + class84.field1339 + "/a=" + class215.field3396 + var4 + "/j" + (class203.field3293 ? "1" : "0") + ",o" + (!class163.field2658 ? "0" : "1") + ",a2,m" + (!class288.field4650 ? "0" : "1");
            try {
                class106.field1658.getAppletContext().showDocument(new URL(var5), "_self");
                if (arg0 < 90) {
                    method263(-74, -113);
                }
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class62.field916 = var2.field3764;
            if (~class41.field625 != -1) {
                class290.field4739 = class62.field916 + 40000;
                class274.field4460 = 50000 - -class62.field916;
                class221.field3480 = class290.field4739;
            }
            class4.field103 = var2.field3766;
            return true;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (arg1 != -117) {
            this.method195(107, (class274) null, (byte) 2);
        }
        ++field571;
        if (super.field1662.field3063) {
            int[][] var4 = this.method759(0, -128, arg0);
            int[][] var5 = this.method759(1, -128, arg0);
            int[] var6 = var3[0];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            int[] var11 = var5[1];
            int[] var12 = var4[2];
            int[] var13 = var5[0];
            int[] var14 = var5[2];
            int var15 = this.field575;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class24.field443 > var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var7[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = var19 - -var20 - (var19 * var20 >> 11);
                                                                var8[var16] = var17 - -var22 + -(var17 * var22 >> 11);
                                                                var9[var16] = -(var18 * var21 >> 11) + var21 + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class24.field443; ++var23) {
                                                            int var24 = var7[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = var28 >= var24 ? -var24 + var28 : -var28 + var24;
                                                            var8[var23] = var27 >= var26 ? -var26 + var27 : -var27 + var26;
                                                            var9[var23] = var25 >= var29 ? -var29 + var25 : -var25 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class24.field443; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var7[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = ~var33 > ~var32 ? var32 : var33;
                                                        var8[var30] = var31 > var36 ? var31 : var36;
                                                        var9[var30] = var35 > var34 ? var35 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class24.field443; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var7[var37];
                                                    int var43 = var10[var37];
                                                    var6[var37] = ~var42 <= ~var38 ? var38 : var42;
                                                    var8[var37] = ~var43 > ~var39 ? var43 : var39;
                                                    var9[var37] = var40 < var41 ? var40 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class24.field443; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var12[var44];
                                                int var47 = var7[var44];
                                                var6[var44] = var47 != 0 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = var45 != 0 ? -((-var11[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var9[var44] = var46 != 0 ? 4096 - (-var14[var44] + 4096 << 12) / var46 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class24.field443 > var48; ++var48) {
                                            int var49 = var7[var48];
                                            int var50 = var12[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var49 != 4096 ? (var13[var48] << 12) / (4096 - var49) : 4096;
                                            var8[var48] = var51 != 4096 ? (var11[var48] << 12) / (-var51 + 4096) : 4096;
                                            var9[var48] = var50 != 4096 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class24.field443; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var11[var52];
                                        var6[var52] = var54 >= 2048 ? 4096 - ((4096 - var7[var52]) * (-var54 + 4096) >> 11) : var7[var52] * var54 >> 11;
                                        var8[var52] = var55 >= 2048 ? -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var9[var52] = ~var53 <= -2049 ? -((-var12[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var12[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class24.field443 > var56; ++var56) {
                                    var6[var56] = -((4096 - var7[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var10[var56] + 4096) * (-var11[var56] + 4096) >> 12) + 4096;
                                    var9[var56] = -((-var12[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class24.field443 < ~var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var11[var57];
                                var6[var57] = var58 != 0 ? (var7[var57] << 12) / var58 : 4096;
                                var8[var57] = ~var60 == -1 ? 4096 : (var10[var57] << 12) / var60;
                                var9[var57] = ~var59 == -1 ? 4096 : (var12[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; class24.field443 > var61; ++var61) {
                            var6[var61] = var7[var61] * var13[var61] >> 12;
                            var8[var61] = var10[var61] * var11[var61] >> 12;
                            var9[var61] = var12[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class24.field443; ++var62) {
                        var6[var62] = var7[var62] + -var13[var62];
                        var8[var62] = var10[var62] + -var11[var62];
                        var9[var62] = var12[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class24.field443 < ~var63; ++var63) {
                    var6[var63] = var7[var63] + var13[var63];
                    var8[var63] = var10[var63] - -var11[var63];
                    var9[var63] = var12[var63] + var14[var63];
                }
            }
        }
        return var3;
    }
}
