import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class518 extends class739 {

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    private int field7251 = 2048;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
    private int field7252 = 819;

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "I")
    private int field7258 = 1024;

    @OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
    private int field7253 = 1024;

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
    private int field7262 = 0;

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
    private int field7263 = 0;

    @OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
    private int field7265 = 1024;

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "I")
    private int field7257 = 409;

    @OriginalMember(owner = "client!cn", name = "X", descriptor = "I")
    private int field7270 = 1024;

    @OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
    private int field7254;

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!cn", name = "J", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!cn", name = "R", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!cn", name = "T", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!cn", name = "U", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!cn", name = "V", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!cn", name = "W", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 4)
    public class518() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(Lsl;Z)V", line = 21)
    public static final void method3006(class461 arg0, boolean arg1) {
        ++field7264;
        if (arg1) {
            for (int var2 = 0; class163.field2243 > var2; ++var2) {
                int var3 = arg0.method2594(3340);
                int var4 = arg0.method2566(-2);
                if (var4 == 65535) {
                    var4 = -1;
                }
                if (class444.field5900[var3] != null) {
                    class444.field5900[var3].field2101 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lsl;II)V", line = 51)
    public final void method214(class461 arg0, int arg1, int arg2) {
        ++field7269;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field7270 = arg0.method2566(arg2 + 1);
                                        }
                                    } else {
                                        this.field7265 = arg0.method2566(-2);
                                    }
                                } else {
                                    this.field7263 = arg0.method2600((byte) -126);
                                }
                            } else {
                                this.field7258 = arg0.method2566(arg2 ^ 3);
                            }
                        } else {
                            this.field7252 = arg0.method2566(-2);
                        }
                    } else {
                        this.field7257 = arg0.method2566(arg2 ^ 3);
                    }
                } else {
                    this.field7251 = arg0.method2566(-2);
                }
            } else {
                this.field7253 = arg0.method2566(-2);
            }
        } else {
            this.field7262 = arg0.method2600((byte) -123);
        }
        if (arg2 != -3) {
            this.field7252 = -3;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZC)B", line = 158)
    public static final byte method3007(boolean arg0, char arg1) {
        ++field7256;
        byte var2;
        if ((~arg1 >= -1 || ~arg1 <= -129) && (arg1 < 160 || arg1 > 255)) {
            if (~arg1 != -8365) {
                if (~arg1 == -8219) {
                    var2 = -126;
                } else if (arg1 == 402) {
                    var2 = -125;
                } else if (arg1 != 8222) {
                    if (arg1 != 8230) {
                        if (~arg1 != -8225) {
                            if (arg1 != 8225) {
                                if (arg1 != 710) {
                                    if (~arg1 == -8241) {
                                        var2 = -119;
                                    } else if (arg1 != 352) {
                                        if (arg1 != 8249) {
                                            if (arg1 == 338) {
                                                var2 = -116;
                                            } else if (arg1 != 381) {
                                                if (~arg1 != -8217) {
                                                    if (arg1 == 8217) {
                                                        var2 = -110;
                                                    } else if (arg1 == 8220) {
                                                        var2 = -109;
                                                    } else if (arg1 == 8221) {
                                                        var2 = -108;
                                                    } else if (arg1 != 8226) {
                                                        if (arg1 == 8211) {
                                                            var2 = -106;
                                                        } else if (~arg1 != -8213) {
                                                            if (~arg1 == -733) {
                                                                var2 = -104;
                                                            } else if (arg1 != 8482) {
                                                                if (arg1 == 353) {
                                                                    var2 = -102;
                                                                } else if (~arg1 != -8251) {
                                                                    if (arg1 == 339) {
                                                                        var2 = -100;
                                                                    } else if (arg1 == 382) {
                                                                        var2 = -98;
                                                                    } else if (arg1 == 376) {
                                                                        var2 = -97;
                                                                    } else {
                                                                        var2 = 63;
                                                                    }
                                                                } else {
                                                                    var2 = -101;
                                                                }
                                                            } else {
                                                                var2 = -103;
                                                            }
                                                        } else {
                                                            var2 = -105;
                                                        }
                                                    } else {
                                                        var2 = -107;
                                                    }
                                                } else {
                                                    var2 = -111;
                                                }
                                            } else {
                                                var2 = -114;
                                            }
                                        } else {
                                            var2 = -117;
                                        }
                                    } else {
                                        var2 = -118;
                                    }
                                } else {
                                    var2 = -120;
                                }
                            } else {
                                var2 = -121;
                            }
                        } else {
                            var2 = -122;
                        }
                    } else {
                        var2 = -123;
                    }
                } else {
                    var2 = -124;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg1;
        }
        if (!arg0) {
            method3007(true, (char) 65457);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V", line = 290)
    public final void method216(int arg0) {
        if (arg0 != -21773) {
            this.field7270 = -96;
        }
        ++field7266;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[I", line = 307)
    public final int[] method215(int arg0, int arg1) {
        ++field7268;
        int[] var3 = super.field10311.method2116(arg1, (byte) 82);
        if (super.field10311.field4728) {
            int[][] var4 = super.field10311.method2115(-14453);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class29.field523 * this.field7253 >> 12;
            int var15 = class29.field523 * this.field7251 >> 12;
            int var16 = class549.field7672 * this.field7257 >> 12;
            int var17 = class549.field7672 * this.field7252 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field7254 = class29.field523 / 8 * this.field7258 >> 12;
            int var18 = class29.field523 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field7262);
            label128: while (true) {
                while (true) {
                    int var22 = class596.method3377(-var14 + var15, var21, -122) + var14;
                    int var23 = class596.method3377(-var16 + var17, var21, -127) + var16;
                    int var24 = var8 + var22;
                    if (var24 > class29.field523) {
                        var22 = -var8 + class29.field523;
                        var24 = class29.field523;
                    }
                    int var29;
                    if (var11) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var5 + var24;
                        if (~var28 > -1) {
                            var28 += class29.field523;
                        }
                        if (class29.field523 < var28) {
                            var28 -= class29.field523;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (~var28 <= ~var30[0] && ~var28 >= ~var30[1]) {
                                if (var9 != var25) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class29.field523;
                                    }
                                    if (~class29.field523 > ~var31) {
                                        var31 -= class29.field523;
                                    }
                                    for (int var32 = 1; var27 >= var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; var33 <= var27; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var29 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var31 < var28) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            } else if (~var36 != -1) {
                                                var38 = Math.max(var31, var36);
                                                var39 = class29.field523;
                                            } else {
                                                var39 = Math.min(var28, var37);
                                                var38 = 0;
                                            }
                                            this.method3008(-var38 + var39, var35, -var35 + var29, var7 + var38, var4, var21, 0);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var27;
                            ++var25;
                            if (var12 <= var25) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~class549.field7672 <= ~(var29 - -var23)) {
                        var10 = false;
                    } else {
                        var23 = -var29 + class549.field7672;
                    }
                    if (~class29.field523 != ~var24) {
                        int[] var41 = var19[var13++];
                        var41[2] = var29 - -var23;
                        var41[0] = var8;
                        var41[1] = var24;
                        this.method3008(var22, var29, var23, var6 + var8, var4, var21, arg0 + 23347);
                        var8 = var24;
                    } else {
                        this.method3008(var22, var29, var23, var6 + var8, var4, var21, 0);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[0] = var8;
                        var42[2] = var23 + var29;
                        var42[1] = var24;
                        int[][] var43 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var43;
                        var7 = var6;
                        var13 = 0;
                        var6 = class596.method3377(class29.field523, var21, -107);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class29.field523 + var5;
                        }
                        if (class29.field523 < var44) {
                            var44 -= class29.field523;
                        }
                        var9 = 0;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var44 >= var45[0] && var45[1] >= var44) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -23347) {
            this.field7252 = -79;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII[[ILjava/util/Random;I)V", line = 562)
    private final void method3008(int arg0, int arg1, int arg2, int arg3, int[][] arg4, Random arg5, int arg6) {
        ++field7259;
        int var8 = this.field7270 > 0 ? 4096 - class596.method3377(this.field7270, arg5, -112) : 4096;
        int var9 = this.field7265 * this.field7254 >> 12;
        int var10 = this.field7254 - (var9 > arg6 ? class596.method3377(var9, arg5, -105) : 0);
        if (~arg3 <= ~class29.field523) {
            arg3 -= class29.field523;
        }
        if (var10 <= 0) {
            if (~(arg0 + arg3) >= ~class29.field523) {
                for (int var11 = 0; ~arg2 < ~var11; ++var11) {
                    class135.method997(arg4[arg1 + var11], arg3, arg0, var8);
                }
            } else {
                int var12 = -arg3 + class29.field523;
                for (int var13 = 0; arg2 > var13; ++var13) {
                    int[] var14 = arg4[arg1 + var13];
                    class135.method997(var14, arg3, var12, var8);
                    class135.method997(var14, 0, -var12 + arg0, var8);
                }
            }
        } else if (~arg2 < -1 && ~arg0 < -1) {
            int var15 = arg0 / 2;
            int var16 = arg2 / 2;
            int var17 = ~var10 < ~var15 ? var15 : var10;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg3 + var17;
            int var20 = -(var17 * 2) + arg0;
            for (int var21 = 0; ~var21 > ~arg2; ++var21) {
                int[] var22 = arg4[var21 - -arg1];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field7263 != -1) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class702.method3949(class346.field4366, arg3 + var24)] = var22[class702.method3949(arg0 + arg3 + -1 + -var24, class346.field4366)] = ~var23 < ~var25 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class702.method3949(arg3 + var26, class346.field4366)] = var22[class702.method3949(class346.field4366, -var26 + -1 + arg0 + arg3)] = var23 * var28 >> 12;
                        }
                    }
                    if (~class29.field523 <= ~(var19 - -var20)) {
                        class135.method997(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class29.field523;
                        class135.method997(var22, var19, var27, var23);
                        class135.method997(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + -1 + arg2;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field7263 == 0) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class702.method3949(arg3 + var31, class346.field4366)] = var22[class702.method3949(arg0 - 1 + arg3 + -var31, class346.field4366)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class702.method3949(class346.field4366, arg3 - -var33)] = var22[class702.method3949(class346.field4366, arg0 - var33 + arg3 + -1)] = ~var35 <= ~var30 ? var30 : var35;
                            }
                        }
                        if (class29.field523 >= var19 + var20) {
                            class135.method997(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class29.field523;
                            class135.method997(var22, var19, var34, var30);
                            class135.method997(var22, 0, var20 - var34, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class702.method3949(arg3 + var36, class346.field4366)] = var22[class702.method3949(class346.field4366, -var36 + -1 + arg0 + arg3)] = var8 * var36 / var17;
                        }
                        if (class29.field523 >= var19 - -var20) {
                            class135.method997(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class29.field523;
                            class135.method997(var22, var19, var37, var8);
                            class135.method997(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }
}
