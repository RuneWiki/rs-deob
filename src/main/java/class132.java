import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class132 extends class404 {

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    private int field2096 = 6;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "Loe;")
    public static class127 field2094 = new class127(28, 5);

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V", line = 10)
    public class132() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILha;I)V", line = 13)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field5873 = arg1.method257((byte) 74) == 1;
            }
        } else {
            this.field2096 = arg1.method257((byte) 41);
        }
        if (arg0 != 0) {
            this.method87(125, (class40) null, 53);
        }
        ++field2093;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II[II[I)V", line = 49)
    public static final void method876(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        ++field2099;
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; ~var10 > ~arg3; ++var10) {
                if (~arg2[var10] > ~(var7 - -(var10 & var9))) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method876(arg0, 112, arg2, var6 - 1, arg4);
            method876(var6 + 1, 100, arg2, arg3, arg4);
        }
        if (arg1 < 83) {
            field2094 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[I", line = 109)
    public final int[] method90(int arg0, int arg1) {
        ++field2095;
        int[] var3 = super.field5870.method372(arg1, (byte) 97);
        if (arg0 >= -47) {
            return null;
        } else {
            if (super.field5870.field810) {
                int[] var4 = this.method2394(0, (byte) 64, arg1);
                int[] var5 = this.method2394(1, (byte) 64, arg1);
                int var6 = this.field2096;
                if (var6 != 1) {
                    if (var6 != 2) {
                        if (var6 != 3) {
                            if (~var6 != -5) {
                                if (~var6 != -6) {
                                    if (~var6 != -7) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (var6 != 9) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; ~class431.field6348 < ~var7; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~var10 > ~class431.field6348; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = ~var11 < ~var12 ? -var12 + var11 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~var13 > ~class431.field6348; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = var15 > var14 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; class431.field6348 > var16; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = var17 > var18 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~var19 > ~class431.field6348; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~class431.field6348 < ~var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; var23 < class431.field6348; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class431.field6348 < ~var25; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~class431.field6348 < ~var26; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class431.field6348; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; class431.field6348 > var29; ++var29) {
                            var3[var29] = var4[var29] - var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~var30 > ~class431.field6348; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)[[I", line = 355)
    public final int[][] method89(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method87(-113, (class40) null, -112);
        }
        ++field2097;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (super.field5869.field7156) {
            int[][] var4 = this.method2400(-11872, arg1, 0);
            int[][] var5 = this.method2400(-11872, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field2096;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class431.field6348 > var16; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var12[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = var17 - -var19 - (var17 * var19 >> 11);
                                                                var7[var16] = -(var18 * var22 >> 11) + var22 + var18;
                                                                var8[var16] = var21 - (var20 * var21 >> 11) + var20;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class431.field6348; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = ~var25 > ~var27 ? var27 - var25 : var25 - var27;
                                                            var7[var23] = var29 > var28 ? -var28 + var29 : -var29 + var28;
                                                            var8[var23] = var26 <= var24 ? var24 - var26 : -var24 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class431.field6348; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = ~var33 > ~var35 ? var35 : var33;
                                                        var7[var30] = ~var34 < ~var32 ? var34 : var32;
                                                        var8[var30] = var36 > var31 ? var36 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class431.field6348 < ~var37; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = var38 >= var40 ? var40 : var38;
                                                    var7[var37] = var42 >= var41 ? var41 : var42;
                                                    var8[var37] = ~var39 <= ~var43 ? var43 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class431.field6348 > var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var45 == 0 ? 0 : -((4096 - var12[var44] << 12) / var45) + 4096;
                                                var7[var44] = ~var46 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var46) + 4096;
                                                var8[var44] = ~var47 == -1 ? 0 : -((4096 - var14[var44] << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class431.field6348 < ~var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var49 != 4096 ? (var12[var48] << 12) / (4096 - var49) : 4096;
                                            var7[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (4096 - var51);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class431.field6348; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var54 > -2049 ? var9[var52] * var54 >> 11 : -((4096 - var54) * (-var9[var52] + 4096) >> 11) + 4096;
                                        var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var55 <= -2049 ? 4096 - ((-var11[var52] + 4096) * (-var55 + 4096) >> 11) : var11[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class431.field6348; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (4096 - var12[var56]) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class431.field6348; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = var59 != 0 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; class431.field6348 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class431.field6348; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class431.field6348; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 676)
    public static void method877(byte arg0) {
        if (arg0 > 21) {
            field2094 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lia;II)V", line = 686)
    public static final void method878(class399 arg0, int arg1, int arg2) {
        ++field2100;
        boolean var3 = arg0.method2364(1, true) == 1;
        if (var3) {
            class341.field5098[class287.field4352++] = arg2;
        }
        int var4 = arg0.method2364(2, true);
        class47 var5 = class224.field3450[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field691 = false;
            } else if (class507.field7667 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class322 var6 = class60.field1010[arg2] = new class322();
                var6.field4837 = (var5.field3217 << 28) - (-(var5.field2232[0] + class381.field5550 >> 6 << 14) - (var5.field2239[0] + class320.field4827 >> 6));
                if (var5.field705 == -1) {
                    var6.field4839 = var5.field2211.method1302(16383);
                } else {
                    var6.field4839 = var5.field705;
                }
                var6.field4838 = var5.field2148;
                var6.field4840 = var5.field688;
                if (~var5.field702 < -1) {
                    class253.method1520(var5, -125);
                }
                class224.field3450[arg2] = null;
                if (arg0.method2364(1, true) != 0) {
                    class218.method1336(arg0, 2, arg2);
                }
            }
        } else if (~var4 == -2) {
            int var7 = arg0.method2364(3, true);
            int var8 = var5.field2232[0];
            int var9 = var5.field2239[0];
            if (~var7 != -1) {
                if (~var7 == -2) {
                    --var9;
                } else if (~var7 != -3) {
                    if (var7 == 3) {
                        --var8;
                    } else if (~var7 == -5) {
                        ++var8;
                    } else if (var7 == 5) {
                        --var8;
                        ++var9;
                    } else if (~var7 != -7) {
                        if (~var7 == -8) {
                            ++var8;
                            ++var9;
                        }
                    } else {
                        ++var9;
                    }
                } else {
                    --var9;
                    ++var8;
                }
            } else {
                --var8;
                --var9;
            }
            if (var3) {
                var5.field694 = var8;
                var5.field691 = true;
                var5.field706 = var9;
            } else {
                var5.method328(var9, (byte) -53, var8, class86.field1498[arg2]);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method2364(4, true);
            int var11 = var5.field2232[0];
            int var12 = var5.field2239[0];
            if (var10 != 0) {
                if (~var10 != -2) {
                    if (~var10 == -3) {
                        var12 -= 2;
                    } else if (var10 == 3) {
                        var12 -= 2;
                        ++var11;
                    } else if (var10 == 4) {
                        var12 -= 2;
                        var11 += 2;
                    } else if (~var10 == -6) {
                        var11 -= 2;
                        --var12;
                    } else if (~var10 != -7) {
                        if (var10 != 7) {
                            if (var10 == 8) {
                                var11 += 2;
                            } else if (var10 != 9) {
                                if (~var10 != -11) {
                                    if (var10 != 11) {
                                        if (~var10 != -13) {
                                            if (var10 == 13) {
                                                var12 += 2;
                                            } else if (var10 == 14) {
                                                var12 += 2;
                                                ++var11;
                                            } else if (~var10 == -16) {
                                                var12 += 2;
                                                var11 += 2;
                                            }
                                        } else {
                                            --var11;
                                            var12 += 2;
                                        }
                                    } else {
                                        var11 -= 2;
                                        var12 += 2;
                                    }
                                } else {
                                    var11 += 2;
                                    ++var12;
                                }
                            } else {
                                var11 -= 2;
                                ++var12;
                            }
                        } else {
                            var11 -= 2;
                        }
                    } else {
                        var11 += 2;
                        --var12;
                    }
                } else {
                    var12 -= 2;
                    --var11;
                }
            } else {
                var11 -= 2;
                var12 -= 2;
            }
            if (!var3) {
                var5.method328(var12, (byte) 115, var11, class86.field1498[arg2]);
            } else {
                var5.field694 = var11;
                var5.field706 = var12;
                var5.field691 = true;
            }
        } else {
            int var13 = arg0.method2364(1, true);
            if (~var13 == -1) {
                int var14 = arg0.method2364(12, true);
                int var15 = var14 >> 10;
                int var16 = (1023 & var14) >> 5;
                if (~var16 < -16) {
                    var16 -= 32;
                }
                int var17 = var14 & 31;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field2232[0] + var16;
                int var19 = var5.field2239[0] + var17;
                if (var3) {
                    var5.field691 = true;
                    var5.field706 = var19;
                    var5.field694 = var18;
                } else {
                    var5.method328(var19, (byte) 67, var18, class86.field1498[arg2]);
                }
                var5.field3217 = (byte) (3 & var5.field3217 + var15);
                if (~class507.field7667 == ~arg2) {
                    class362.field5339 = var5.field3217;
                }
            } else {
                int var20 = arg0.method2364(30, true);
                int var21 = var20 >> 28;
                int var22 = (var20 & 268421187) >> 14;
                int var23 = var20 & 16383;
                int var24 = (16383 & class381.field5550 + var22 + var5.field2232[0]) + -class381.field5550;
                int var25 = (var5.field2239[0] - -class320.field4827 + var23 & 16383) + -class320.field4827;
                if (var3) {
                    var5.field691 = true;
                    var5.field706 = var25;
                    var5.field694 = var24;
                } else {
                    var5.method328(var25, (byte) -33, var24, class86.field1498[arg2]);
                }
                var5.field3217 = (byte) (var5.field3217 + var21 & 3);
                if (arg1 > -120) {
                    method877((byte) -12);
                }
                if (class507.field7667 == arg2) {
                    class362.field5339 = var5.field3217;
                }
            }
        }
    }
}
