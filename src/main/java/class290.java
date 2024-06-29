import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class290 extends class306 {

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    private int field4562 = 4096;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    private int field4565 = 4096;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    private int field4564 = 4096;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "Z")
    public static boolean field4566 = true;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field4569 = 0;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "Z")
    public static boolean field4567 = false;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "Lvh;")
    public static class62 field4561 = new class62(4);

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "Ljava/lang/String;")
    public static String field4571 = "Continue";

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "F")
    public static float field4573;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "[Lpa;")
    public static class2[] field4572;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)V", line = 6)
    public static void method2072(byte arg0) {
        if (arg0 == -105) {
            field4572 = null;
            field4561 = null;
            field4571 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILlf;I)V", line = 25)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field4568++;
        if (arg2 == 0) {
            this.field4562 = arg1.method1051(1);
        } else if (arg2 == 1) {
            this.field4565 = arg1.method1051(arg0 ^ 0xFFFFC41B);
        } else if (arg2 == 2) {
            this.field4564 = arg1.method1051(1);
        }
        if (arg0 != -15334) {
            field4561 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZI[Lne;II[BI)[I", line = 69)
    public static final int[] method2073(int arg0, boolean arg1, int arg2, class262[] arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        byte var8;
        if (arg1) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field4563++;
        if (!arg1) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg0 + var10 > 0 && (arg0 + var10) < 103 && arg7 + var11 > 0 && (arg7 + var11) < 103) {
                            arg3[var9].field4156[arg0 + var10][arg7 + var11] = class261.method1840(arg3[var9].field4156[arg0 + var10][arg7 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class143 var12 = new class143(arg6);
        int var13 = arg4 + arg7;
        int var14 = arg0 + arg2;
        int var15 = 0;
        if (arg5 != 4) {
            method2074((byte) -43, 73);
        }
        while (var8 > var15) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class311.method2198(0, arg1, var13 + var17, var12, 0, 0, false, 126, arg7 + var17, var14 + var16, arg0 + var16, var15);
                }
            }
            var15++;
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var12.field2295 < var12.field2260.length) {
            int var20 = var12.method1043(true);
            if (var20 == 128) {
                var18 = true;
                class300.field4685[0] = var12.method1051(arg5 - 3);
                class300.field4685[1] = var12.method1021(-1);
                class300.field4685[2] = var12.method1021(arg5 - 5);
                class300.field4685[3] = var12.method1021(-1);
                class300.field4685[4] = var12.method1051(1);
            } else {
                if (var20 != 129) {
                    var12.field2295--;
                    break;
                }
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var12.method1028(79030408);
                    if (var22 == 0) {
                        int var23 = arg0 + 64;
                        int var24 = arg0;
                        if (var23 < 0) {
                            var23 = 0;
                        } else if (var23 >= 104) {
                            var23 = 104;
                        }
                        int var25 = arg7;
                        if (arg0 < 0) {
                            var24 = 0;
                        } else if (arg0 >= 104) {
                            var24 = 104;
                        }
                        if (arg7 < 0) {
                            var25 = 0;
                        } else if (arg7 >= 104) {
                            var25 = 104;
                        }
                        int var26 = arg7 + 64;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        while (var23 > var24) {
                            while (var26 > var25) {
                                class207.field3132[var21][var24][var25] = 0;
                                var25++;
                            }
                            var24++;
                        }
                    } else if (var22 == 1) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                byte var29 = var12.method1028(79030408);
                                for (int var30 = arg0 + var27; var30 < arg0 + var27 + 4; var30++) {
                                    for (int var31 = arg7 + var28; var31 < (arg7 + var28 + 4); var31++) {
                                        if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                            class207.field3132[var21][var30][var31] = var29;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var32 = arg0 + 64;
                        int var33 = arg7;
                        if (arg7 < 0) {
                            var33 = 0;
                        } else if (arg7 >= 104) {
                            var33 = 104;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        int var34 = arg0;
                        if (arg0 < 0) {
                            var34 = 0;
                        } else if (arg0 >= 104) {
                            var34 = 104;
                        }
                        int var35 = arg7 + 64;
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 >= 104) {
                            var35 = 104;
                        }
                        while (var32 > var34) {
                            while (var35 > var33) {
                                class207.field3132[var21][var34][var33] = class207.field3132[var21 - 1][var34][var33];
                                var33++;
                            }
                            var34++;
                        }
                    }
                }
                var19 = true;
            }
        }
        if (class272.field4317 && !arg1) {
            class322 var36 = null;
            while (true) {
                while (var12.field2295 < var12.field2260.length) {
                    int var37 = var12.method1043(true);
                    if (var37 == 0) {
                        var36 = new class322(var12);
                    } else if (var37 == 1) {
                        int var38 = var12.method1043(true);
                        if (var38 > 0) {
                            for (int var39 = 0; var39 < var38; var39++) {
                                class244 var40 = new class244(var12);
                                if (var40.field3827 == 31) {
                                    class18 var41 = class360.method2518(true, var12.method1051(1));
                                    var40.method1729(var41.field212, var41.field214, var41.field221, (byte) 57, var41.field209);
                                }
                                var40.field3841 += arg7 << 7;
                                var40.field3839 += arg0 << 7;
                                int var42 = var40.field3839 >> 7;
                                int var43 = var40.field3841 >> 7;
                                if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                    var40.field3830 = (class225.field3398[1][var42][var43] & 0x2) != 0;
                                    var40.field3823 = class72.field902[var40.field3831][var42][var43] - var40.field3823;
                                    class195.method1357(var40);
                                }
                            }
                        }
                    } else if (var37 == 2) {
                        if (var36 == null) {
                            var36 = new class322();
                        }
                        var36.method2240(16970, var12);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var36 == null) {
                    var36 = new class322();
                }
                for (int var44 = 0; var44 < 8; var44++) {
                    for (int var45 = 0; var45 < 8; var45++) {
                        int var46 = (arg0 >> 3) + var44;
                        int var47 = (arg7 >> 3) + var45;
                        if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                            class296.field4652[var46][var47] = var36;
                        }
                    }
                }
                break;
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg0 >> 2) + var49;
                        int var52 = (arg7 >> 2) + var50;
                        if (var51 >= 0 && var51 < 26 && var52 >= 0 && var52 < 26) {
                            class207.field3132[var48][var51][var52] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class300.field4685 : null;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 599)
    public class290() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)V", line = 512)
    public static final void method2074(byte arg0, int arg1) {
        class45.field516.method387(arg1, false);
        field4560++;
        if (arg0 < -78) {
            class31.field358.method387(arg1, false);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)[[I", line = 534)
    public final int[][] method681(int arg0, byte arg1) {
        field4570++;
        int[][] var3 = this.field4752.method1866(arg0, arg1 + 119);
        if (this.field4752.field4179) {
            int[][] var4 = this.method2160(0, (byte) 121, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class31.field367; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var9[var11];
                if (var12 == var14 && var13 == var14) {
                    var7[var11] = this.field4562 * var12 >> 12;
                    var10[var11] = this.field4565 * var14 >> 12;
                    var8[var11] = this.field4564 * var13 >> 12;
                } else {
                    var7[var11] = this.field4562;
                    var10[var11] = this.field4565;
                    var8[var11] = this.field4564;
                }
            }
        }
        if (arg1 != -119) {
            this.field4562 = 38;
        }
        return var3;
    }
}
