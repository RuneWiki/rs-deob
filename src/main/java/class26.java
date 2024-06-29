import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class26 extends class1 {

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    private int field561 = 6;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
    public static int field555 = 0;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "[S")
    public static short[] field562;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
    public static final void method203(boolean arg0) {
        ++field563;
        int var1 = class1.field34.method645(8, (byte) 10);
        if (class47.field961 > var1) {
            for (int var2 = var1; var2 < class47.field961; ++var2) {
                class163.field2942[class21.field462++] = class159.field2866[var2];
            }
        }
        if (class47.field961 < var1) {
            throw new RuntimeException("gppov1");
        } else {
            class47.field961 = 0;
            if (arg0) {
                for (int var3 = 0; ~var1 < ~var3; ++var3) {
                    int var4 = class159.field2866[var3];
                    class20 var5 = class179.field3229[var4];
                    int var6 = class1.field34.method645(1, (byte) 10);
                    if (~var6 == -1) {
                        class159.field2866[class47.field961++] = var4;
                        var5.field4028 = class200.field3541;
                    } else {
                        int var7 = class1.field34.method645(2, (byte) 10);
                        if (var7 == 0) {
                            class159.field2866[class47.field961++] = var4;
                            var5.field4028 = class200.field3541;
                            class218.field3800[class111.field1956++] = var4;
                        } else if (~var7 == -2) {
                            class159.field2866[class47.field961++] = var4;
                            var5.field4028 = class200.field3541;
                            int var8 = class1.field34.method645(3, (byte) 10);
                            var5.method1430(false, var8, -10527);
                            int var9 = class1.field34.method645(1, (byte) 10);
                            if (var9 == 1) {
                                class218.field3800[class111.field1956++] = var4;
                            }
                        } else if (~var7 == -3) {
                            class159.field2866[class47.field961++] = var4;
                            var5.field4028 = class200.field3541;
                            int var10 = class1.field34.method645(3, (byte) 10);
                            var5.method1430(true, var10, -10527);
                            int var11 = class1.field34.method645(3, (byte) 10);
                            var5.method1430(true, var11, -10527);
                            int var12 = class1.field34.method645(1, (byte) 10);
                            if (~var12 == -2) {
                                class218.field3800[class111.field1956++] = var4;
                            }
                        } else if (var7 == 3) {
                            class163.field2942[class21.field462++] = var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg0 == 0) {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    super.field27 = ~arg2.method1475(255) == -2;
                }
            } else {
                this.field561 = arg2.method1475(255);
            }
            ++field560;
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)V")
    public static void method204(byte arg0) {
        if (arg0 < -13) {
            field562 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class26() {
        super(2, false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIBI)V")
    public static final void method205(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field557;
        class221.method1386(arg4, arg2, arg4 - -arg1, arg0 + arg2);
        class61.method404();
        class221.method1375(arg4, arg2, arg1, arg0, 0);
        if (class124.field2239 >= 100) {
            class180.method1138(class217.field3788, 0, class27.field581, 0, arg1 + arg4, arg2, false, arg4, arg0 + arg2);
            int var5 = class58.field1155 * arg1 / class217.field3788 + arg4;
            int var6 = arg2 - -(class233.field4283 * arg0 / class27.field581);
            int var7 = class109.field1926 * arg1 / class217.field3788;
            int var8 = class53.field1078 * arg0 / class27.field581;
            if (arg3 != -106) {
                method203(false);
            }
            class221.method1384(var5, var6, var7, var8, 16711680, 128);
            class221.method1374(var5, var6, var7, var8, 16711680);
            if (~class169.field3083 < -1 && class169.field3083 % 10 < 5) {
                for (class117 var9 = (class117) client.field699.method1358(-29726); var9 != null; var9 = (class117) client.field699.method1360(true)) {
                    if (~class42.field866 == ~var9.field2107) {
                        int var10 = var9.field2106 * arg1 / class217.field3788 + arg4;
                        int var11 = var9.field2102 * arg0 / class27.field581 + arg2;
                        class221.method1375(var10 + -2, var11 - 2, 4, 4, 16776960);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != -81) {
            return null;
        } else {
            ++field559;
            int[][] var3 = super.field13.method578(arg0, -1);
            if (super.field13.field1658) {
                int[][] var4 = this.method8(0, (byte) 38, arg0);
                int[][] var5 = this.method8(1, (byte) -125, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var4[1];
                int[] var9 = var3[2];
                int[] var10 = var4[0];
                int[] var11 = var5[1];
                int[] var12 = var5[0];
                int[] var13 = var5[2];
                int[] var14 = var4[2];
                int var15 = this.field561;
                if (var15 != 1) {
                    if (var15 != 2) {
                        if (var15 != 3) {
                            if (var15 != 4) {
                                if (~var15 != -6) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (~var15 != -9) {
                                                if (var15 != 9) {
                                                    if (~var15 != -11) {
                                                        if (var15 != 11) {
                                                            if (~var15 == -13) {
                                                                for (int var16 = 0; ~class202.field3603 < ~var16; ++var16) {
                                                                    int var17 = var13[var16];
                                                                    int var18 = var12[var16];
                                                                    int var19 = var8[var16];
                                                                    int var20 = var14[var16];
                                                                    int var21 = var11[var16];
                                                                    int var22 = var10[var16];
                                                                    var6[var16] = var18 + var22 + -(var18 * var22 >> 11);
                                                                    var7[var16] = -(var19 * var21 >> 11) + var19 - -var21;
                                                                    var9[var16] = var20 - (var17 * var20 >> 11) + var17;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; ~class202.field3603 < ~var23; ++var23) {
                                                                int var24 = var11[var23];
                                                                int var25 = var10[var23];
                                                                int var26 = var8[var23];
                                                                int var27 = var13[var23];
                                                                int var28 = var14[var23];
                                                                int var29 = var12[var23];
                                                                var6[var23] = ~var25 < ~var29 ? var25 - var29 : var29 - var25;
                                                                var7[var23] = ~var24 > ~var26 ? var26 - var24 : var24 - var26;
                                                                var9[var23] = var27 >= var28 ? -var28 + var27 : -var27 + var28;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; ~class202.field3603 < ~var30; ++var30) {
                                                            int var31 = var14[var30];
                                                            int var32 = var12[var30];
                                                            int var33 = var11[var30];
                                                            int var34 = var13[var30];
                                                            int var35 = var10[var30];
                                                            int var36 = var8[var30];
                                                            var6[var30] = ~var35 < ~var32 ? var35 : var32;
                                                            var7[var30] = ~var33 <= ~var36 ? var33 : var36;
                                                            var9[var30] = var31 > var34 ? var31 : var34;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class202.field3603; ++var37) {
                                                        int var38 = var11[var37];
                                                        int var39 = var12[var37];
                                                        int var40 = var10[var37];
                                                        int var41 = var14[var37];
                                                        int var42 = var8[var37];
                                                        int var43 = var13[var37];
                                                        var6[var37] = var39 > var40 ? var40 : var39;
                                                        var7[var37] = ~var38 >= ~var42 ? var38 : var42;
                                                        var9[var37] = var41 >= var43 ? var43 : var41;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; var44 < class202.field3603; ++var44) {
                                                    int var45 = var8[var44];
                                                    int var46 = var10[var44];
                                                    int var47 = var14[var44];
                                                    var6[var44] = var46 != 0 ? -((-var12[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                    var7[var44] = ~var45 != -1 ? 4096 - (-var11[var44] + 4096 << 12) / var45 : 0;
                                                    var9[var44] = ~var47 == -1 ? 0 : -((4096 - var13[var44] << 12) / var47) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; var48 < class202.field3603; ++var48) {
                                                int var49 = var8[var48];
                                                int var50 = var10[var48];
                                                int var51 = var14[var48];
                                                var6[var48] = var50 != 4096 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                                var7[var48] = var49 != 4096 ? (var11[var48] << 12) / (-var49 + 4096) : 4096;
                                                var9[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; class202.field3603 > var52; ++var52) {
                                            int var53 = var13[var52];
                                            int var54 = var11[var52];
                                            int var55 = var12[var52];
                                            var6[var52] = ~var55 <= -2049 ? -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                            var7[var52] = ~var54 <= -2049 ? -((4096 - var8[var52]) * (-var54 + 4096) >> 11) + 4096 : var8[var52] * var54 >> 11;
                                            var9[var52] = ~var53 > -2049 ? var14[var52] * var53 >> 11 : 4096 - ((4096 - var14[var52]) * (-var53 + 4096) >> 11);
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; class202.field3603 > var56; ++var56) {
                                        var6[var56] = -((-var10[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((-var8[var56] + 4096) * (-var11[var56] + 4096) >> 12) + 4096;
                                        var9[var56] = -((-var13[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class202.field3603; ++var57) {
                                    int var58 = var11[var57];
                                    int var59 = var12[var57];
                                    int var60 = var13[var57];
                                    var6[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                    var7[var57] = ~var58 == -1 ? 4096 : (var8[var57] << 12) / var58;
                                    var9[var57] = var60 == 0 ? 4096 : (var14[var57] << 12) / var60;
                                }
                            }
                        } else {
                            for (int var61 = 0; class202.field3603 > var61; ++var61) {
                                var6[var61] = var10[var61] * var12[var61] >> 12;
                                var7[var61] = var8[var61] * var11[var61] >> 12;
                                var9[var61] = var13[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; var62 < class202.field3603; ++var62) {
                            var6[var62] = var10[var62] + -var12[var62];
                            var7[var62] = var8[var62] + -var11[var62];
                            var9[var62] = var14[var62] - var13[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; var63 < class202.field3603; ++var63) {
                        var6[var63] = var10[var63] - -var12[var63];
                        var7[var63] = var8[var63] + var11[var63];
                        var9[var63] = var13[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field556;
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (super.field21.field3388) {
            int[] var4 = this.method4(arg1, arg0 ^ -32, 0);
            int[] var5 = this.method4(arg1, -105, 1);
            int var6 = this.field561;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class202.field3603; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class202.field3603 > var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 > var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class202.field3603 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 > var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class202.field3603; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 < var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class202.field3603 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : 4096 - (4096 - var5[var19] << 12) / var20;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class202.field3603 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class202.field3603; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class202.field3603 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class202.field3603 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class202.field3603; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class202.field3603; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class202.field3603; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg0 != 107) {
            this.field561 = -81;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)I")
    public static int method206(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
    public static final void method207(int arg0) {
        if (arg0 != 4096) {
            method207(123);
        }
        ++field558;
        class16.field365 = false;
        class13.field300 = false;
    }
}
