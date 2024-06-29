import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class27 {

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    private int field49 = 4096;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    private int field50 = 4096;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    private int field48 = 4096;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    private int field55 = 409;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "[I")
    private int[] field51 = new int[3];

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field45 = 0;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "Lkb;")
    public static class93 field54 = class76.method390("<col=ffffff>", 0);

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "Z")
    public static boolean field46;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class3() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)Z")
    public static final boolean method13(int arg0, int arg1) {
        ++field47;
        if (arg1 < 28) {
            method17(-30);
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIILqf;IILog;II)V")
    public static final void method14(int arg0, int arg1, int arg2, int arg3, class151 arg4, int arg5, int arg6, class134 arg7, int arg8, int arg9) {
        ++field56;
        class81 var10 = class154.method990(arg8, true);
        int var11;
        int var12;
        if (arg5 != 1 && ~arg5 != -4) {
            var11 = var10.field1487;
            var12 = var10.field1439;
        } else {
            var11 = var10.field1439;
            var12 = var10.field1487;
        }
        int[][] var13 = class151.field2935[arg2];
        int var14;
        int var15;
        if (~(arg3 + var12) >= -105) {
            var14 = (var12 + 1 >> 1) + arg3;
            var15 = (var12 >> 1) + arg3;
        } else {
            var15 = arg3;
            var14 = arg3 - -1;
        }
        int var16 = (arg3 << 7) + (var12 << 6);
        int var17 = (arg1 << 7) + arg3 + (arg8 << 14) + 1073741824;
        if (~var10.field1478 == -1) {
            var17 += Integer.MIN_VALUE;
        }
        int var18 = (arg1 << 7) + (var11 << 6);
        int var19;
        int var20;
        if (arg1 - -var11 > 104) {
            var19 = arg1;
            var20 = arg1 + 1;
        } else {
            var19 = (var11 >> 1) + arg1;
            var20 = (var11 + 1 >> 1) + arg1;
        }
        int var21 = var13[var14][var19] + var13[var15][var20] + var13[var14][var20] + var13[var15][var19] >> 2;
        int var22 = (arg5 << 6) - -arg9;
        if (~var10.field1452 == -2) {
            var22 += 256;
        }
        if (~arg9 == -23) {
            class4 var23;
            if (var10.field1494 == -1 && var10.field1482 == null) {
                var23 = var10.method413(var21, var16, var13, (byte) 16, 22, var18, arg5);
            } else {
                var23 = new class131(arg8, 22, arg5, arg2, arg3, arg1, var10.field1494, true, (class4) null);
            }
            arg7.method806(arg0, arg3, arg1, var21, var23, var17, var22);
            if (var10.field1480 == 1) {
                arg4.method939(arg3, 11243, arg1);
            }
        } else if (arg9 != 10 && ~arg9 != -12) {
            if (~arg9 <= -13) {
                class4 var24;
                if (var10.field1494 == -1 && var10.field1482 == null) {
                    var24 = var10.method413(var21, var16, var13, (byte) 16, arg9, var18, arg5);
                } else {
                    var24 = new class131(arg8, arg9, arg5, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method850(arg0, arg3, arg1, var21, 1, 1, var24, 0, var17, var22);
                if (var10.field1480 != 0) {
                    arg4.method945(arg3, var12, arg1, var10.field1441, var11, 3);
                }
            } else if (arg6 == arg9) {
                class4 var25;
                if (~var10.field1494 == 0 && var10.field1482 == null) {
                    var25 = var10.method413(var21, var16, var13, (byte) 16, 0, var18, arg5);
                } else {
                    var25 = new class131(arg8, 0, arg5, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method846(arg0, arg3, arg1, var21, var25, (class4) null, class26.field396[arg5], 0, var17, var22);
                if (var10.field1480 != 0) {
                    arg4.method941(arg9, (byte) 5, arg1, arg3, arg5, var10.field1441);
                }
            } else if (arg9 == 1) {
                class4 var26;
                if (var10.field1494 == -1 && var10.field1482 == null) {
                    var26 = var10.method413(var21, var16, var13, (byte) 16, 1, var18, arg5);
                } else {
                    var26 = new class131(arg8, 1, arg5, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method846(arg0, arg3, arg1, var21, var26, (class4) null, class40.field673[arg5], 0, var17, var22);
                if (var10.field1480 != 0) {
                    arg4.method941(arg9, (byte) 5, arg1, arg3, arg5, var10.field1441);
                }
            } else if (~arg9 == -3) {
                int var27 = arg5 + 1 & 3;
                class4 var28;
                class4 var29;
                if (~var10.field1494 == 0 && var10.field1482 == null) {
                    var28 = var10.method413(var21, var16, var13, (byte) 16, 2, var18, arg5 + 4);
                    var29 = var10.method413(var21, var16, var13, (byte) 16, 2, var18, var27);
                } else {
                    var28 = new class131(arg8, 2, 4 - -arg5, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                    var29 = new class131(arg8, 2, var27, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method846(arg0, arg3, arg1, var21, var28, var29, class26.field396[arg5], class26.field396[var27], var17, var22);
                if (~var10.field1480 != -1) {
                    arg4.method941(arg9, (byte) 5, arg1, arg3, arg5, var10.field1441);
                }
            } else if (~arg9 == -4) {
                class4 var30;
                if (~var10.field1494 == 0 && var10.field1482 == null) {
                    var30 = var10.method413(var21, var16, var13, (byte) 16, 3, var18, arg5);
                } else {
                    var30 = new class131(arg8, 3, arg5, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method846(arg0, arg3, arg1, var21, var30, (class4) null, class40.field673[arg5], 0, var17, var22);
                if (~var10.field1480 != -1) {
                    arg4.method941(arg9, (byte) 5, arg1, arg3, arg5, var10.field1441);
                }
            } else if (~arg9 == -10) {
                class4 var31;
                if (~var10.field1494 == 0 && var10.field1482 == null) {
                    var31 = var10.method413(var21, var16, var13, (byte) 16, arg9, var18, arg5);
                } else {
                    var31 = new class131(arg8, arg9, arg5, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method850(arg0, arg3, arg1, var21, 1, 1, var31, 0, var17, var22);
                if (~var10.field1480 != -1) {
                    arg4.method945(arg3, var12, arg1, var10.field1441, var11, 3);
                }
            } else if (~arg9 == -5) {
                class4 var32;
                if (var10.field1494 == -1 && var10.field1482 == null) {
                    var32 = var10.method413(var21, var16, var13, (byte) 16, 4, var18, arg5);
                } else {
                    var32 = new class131(arg8, 4, arg5, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method801(arg0, arg3, arg1, var21, var32, (class4) null, class26.field396[arg5], 0, 0, 0, var17, var22);
            } else if (~arg9 == -6) {
                int var33 = 16;
                int var34 = arg7.method844(arg0, arg3, arg1);
                if (~var34 != -1) {
                    var33 = class154.method990((var34 & 536868600) >> 14, true).field1484;
                }
                class4 var35;
                if (~var10.field1494 == 0 && var10.field1482 == null) {
                    var35 = var10.method413(var21, var16, var13, (byte) 16, 4, var18, arg5);
                } else {
                    var35 = new class131(arg8, 4, arg5, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method801(arg0, arg3, arg1, var21, var35, (class4) null, class26.field396[arg5], 0, class69.field1281[arg5] * var33, class46.field730[arg5] * var33, var17, var22);
            } else if (~arg9 == -7) {
                int var36 = 8;
                int var37 = arg7.method844(arg0, arg3, arg1);
                if (var37 != 0) {
                    var36 = class154.method990(32767 & var37 >> 14, true).field1484 / 2;
                }
                class4 var38;
                if (~var10.field1494 == 0 && var10.field1482 == null) {
                    var38 = var10.method413(var21, var16, var13, (byte) 16, 4, var18, arg5 + 4);
                } else {
                    var38 = new class131(arg8, 4, arg5 + 4, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method801(arg0, arg3, arg1, var21, var38, (class4) null, 256, arg5, class207.field4042[arg5] * var36, class171.field3394[arg5] * var36, var17, var22);
            } else if (arg9 == 7) {
                int var39 = 3 & arg5 + 2;
                class4 var40;
                if (~var10.field1494 == 0 && var10.field1482 == null) {
                    var40 = var10.method413(var21, var16, var13, (byte) 16, 4, var18, var39 + 4);
                } else {
                    var40 = new class131(arg8, 4, var39 + 4, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method801(arg0, arg3, arg1, var21, var40, (class4) null, 256, var39, 0, 0, var17, var22);
            } else if (arg9 == 8) {
                int var41 = arg7.method844(arg0, arg3, arg1);
                int var42 = 8;
                int var43 = arg5 + 2 & 3;
                if (var41 != 0) {
                    var42 = class154.method990(var41 >> 14 & 32767, true).field1484 / 2;
                }
                class4 var44;
                class4 var45;
                if (~var10.field1494 == 0 && var10.field1482 == null) {
                    var44 = var10.method413(var21, var16, var13, (byte) 16, 4, var18, arg5 + 4);
                    var45 = var10.method413(var21, var16, var13, (byte) 16, 4, var18, var43 + 4);
                } else {
                    var44 = new class131(arg8, 4, arg5 + 4, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                    var45 = new class131(arg8, 4, var43 - -4, arg2, arg3, arg1, var10.field1494, true, (class4) null);
                }
                arg7.method801(arg0, arg3, arg1, var21, var44, var45, 256, arg5, class207.field4042[arg5] * var42, class171.field3394[arg5] * var42, var17, var22);
            }
        } else {
            class4 var46;
            if (~var10.field1494 == 0 && var10.field1482 == null) {
                var46 = var10.method413(var21, var16, var13, (byte) 16, 10, var18, arg5);
            } else {
                var46 = new class131(arg8, 10, arg5, arg2, arg3, arg1, var10.field1494, true, (class4) null);
            }
            if (var46 != null) {
                arg7.method850(arg0, arg3, arg1, var21, var12, var11, var46, ~arg9 == -12 ? 256 : 0, var17, var22);
            }
            if (var10.field1480 != 0) {
                arg4.method945(arg3, var12, arg1, var10.field1441, var11, 3);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        ++field53;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg2.method1060(255);
                            this.field51[2] = class91.method479(255, var5) >> 12;
                            this.field51[0] = class91.method479(var5 << 4, 267386880);
                            this.field51[1] = class91.method479(var5, 65280) >> 4;
                        }
                    } else {
                        this.field50 = arg2.method1071(28101);
                    }
                } else {
                    this.field48 = arg2.method1071(28101);
                }
            } else {
                this.field49 = arg2.method1071(28101);
            }
        } else {
            this.field55 = arg2.method1071(28101);
        }
        if (arg0 < 106) {
            field54 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public static void method16(int arg0) {
        if (arg0 != 32767) {
            field54 = null;
        }
        field54 = null;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    public static final void method17(int arg0) {
        class51.field826.method676(30626);
        ++field52;
        if (arg0 >= -110) {
            field45 = -19;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lh;IIIIIII)V")
    public static final void method18(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class167.field3345) {
            class71.field1316 = 32;
        } else {
            class71.field1316 = 0;
        }
        ++field57;
        class167.field3345 = false;
        if (~class66.field1186 != -1) {
            if (~arg5 <= ~arg1 && arg5 < arg1 + 16 && arg3 >= arg6 && ~arg3 > ~(arg6 + 16)) {
                arg0.field1162 -= 4;
                class160.method1095(0, arg0);
            } else if (~arg5 <= ~arg1 && arg1 + 16 > arg5 && arg3 >= arg2 + arg6 + -16 && ~(arg2 + arg6) < ~arg3) {
                arg0.field1162 += 4;
                class160.method1095(0, arg0);
            } else if (~arg5 <= ~(-class71.field1316 + arg1) && ~(arg1 + 16 + class71.field1316) < ~arg5 && ~(arg6 - -16) >= ~arg3 && arg2 + arg6 + -16 > arg3) {
                int var8 = (arg2 + -32) * arg2 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = -(var8 / 2) + -arg6 + arg3 + -16;
                int var10 = arg2 - (32 - -var8);
                arg0.field1162 = (-arg2 + arg7) * var9 / var10;
                class160.method1095(0, arg0);
                class167.field3345 = true;
            }
        }
        if (~class121.field2250 != -1) {
            int var11 = arg0.field1044;
            if (~arg5 <= ~(-var11 + arg1) && ~arg3 <= ~arg6 && arg1 + 16 > arg5 && ~(arg2 + arg6) <= ~arg3) {
                arg0.field1162 += class121.field2250 * 45;
                class160.method1095(0, arg0);
            }
        }
        if (arg4 != 30819) {
            field46 = true;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        ++field58;
        int[][] var3 = super.field436.method537(0, arg1);
        int var4 = -7 % ((42 - arg0) / 54);
        if (super.field436.field1771) {
            int[][] var5 = this.method152(arg1, 0, 94);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var3[0];
            int[] var9 = var5[2];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class159.field3209; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field51[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (~var14 < ~this.field55) {
                    var8[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var9[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = -this.field51[1] + var15;
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (this.field55 < var16) {
                        var8[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var9[var12];
                    } else {
                        int var17 = var9[var12];
                        int var18 = -this.field51[2] + var17;
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (~this.field55 > ~var18) {
                            var8[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var8[var12] = this.field50 * var13 >> 12;
                            var10[var12] = this.field48 * var15 >> 12;
                            var11[var12] = this.field49 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
