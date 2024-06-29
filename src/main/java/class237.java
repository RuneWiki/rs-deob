import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class237 extends class74 {

    @OriginalMember(owner = "client!al", name = "X", descriptor = "I")
    private int field3661 = 1024;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "I")
    private int field3664 = 0;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    private int field3655 = 1024;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "I")
    private int field3663 = 0;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    private int field3652 = 2048;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "I")
    private int field3662 = 1024;

    @OriginalMember(owner = "client!al", name = "hb", descriptor = "I")
    private int field3671 = 1024;

    @OriginalMember(owner = "client!al", name = "jb", descriptor = "I")
    private int field3673 = 819;

    @OriginalMember(owner = "client!al", name = "gb", descriptor = "I")
    private int field3670 = 409;

    @OriginalMember(owner = "client!al", name = "lb", descriptor = "[I")
    public static int[] field3675 = new int[100];

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!al", name = "db", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!al", name = "eb", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!al", name = "fb", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!al", name = "ib", descriptor = "I")
    private int field3672;

    @OriginalMember(owner = "client!al", name = "mb", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!al", name = "kb", descriptor = "Luf;")
    public static class176 field3674;

    @OriginalMember(owner = "client!al", name = "cb", descriptor = "[I")
    public static int[] field3666;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "[S")
    public static short[] field3665;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III[[IILjava/util/Random;I)V")
    private final void method1591(int arg0, int arg1, int arg2, int[][] arg3, int arg4, Random arg5, int arg6) {
        int var8 = ~this.field3655 < -1 ? -class167.method1104(this.field3655, (byte) -99, arg5) + 4096 : 4096;
        if (arg2 == -22095) {
            int var9 = this.field3672 * this.field3661 >> 12;
            ++field3669;
            int var10 = this.field3672 - (var9 <= 0 ? 0 : class167.method1104(var9, (byte) -84, arg5));
            if (class178.field2662 <= arg0) {
                arg0 -= class178.field2662;
            }
            if (~var10 >= -1) {
                if (arg0 + arg1 > class178.field2662) {
                    int var11 = -arg0 + class178.field2662;
                    for (int var12 = 0; var12 < arg4; ++var12) {
                        int[] var13 = arg3[arg6 + var12];
                        class236.method1587(var13, arg0, var11, var8);
                        class236.method1587(var13, 0, -var11 + arg1, var8);
                    }
                } else {
                    for (int var14 = 0; var14 < arg4; ++var14) {
                        class236.method1587(arg3[arg6 + var14], arg0, arg1, var8);
                    }
                }
            } else if (~arg4 < -1 && ~arg1 < -1) {
                int var15 = arg1 / 2;
                int var16 = arg4 / 2;
                int var17 = ~var10 >= ~var15 ? var10 : var15;
                int var18 = var10 > var16 ? var16 : var10;
                int var19 = -(var17 * 2) + arg1;
                int var20 = arg0 + var17;
                for (int var21 = 0; ~var21 > ~arg4; ++var21) {
                    int[] var22 = arg3[arg6 + var21];
                    if (var21 < var18) {
                        int var23 = var8 * var21 / var18;
                        if (~this.field3663 != -1) {
                            for (int var24 = 0; var24 < var17; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class3.method48(arg0 + var24, class129.field2012)] = var22[class3.method48(-var24 + arg0 - -arg1 - 1, class129.field2012)] = var23 <= var25 ? var23 : var25;
                            }
                        } else {
                            for (int var26 = 0; var17 > var26; ++var26) {
                                int var28 = var8 * var26 / var17;
                                var22[class3.method48(class129.field2012, arg0 + var26)] = var22[class3.method48(class129.field2012, arg0 + arg1 - (var26 + 1))] = var23 * var28 >> 12;
                            }
                        }
                        if (~(var19 + var20) < ~class178.field2662) {
                            int var27 = class178.field2662 - var20;
                            class236.method1587(var22, var20, var27, var23);
                            class236.method1587(var22, 0, -var27 + var19, var23);
                        } else {
                            class236.method1587(var22, var20, var19, var23);
                        }
                    } else {
                        int var29 = -var21 + -1 + arg4;
                        if (~var29 > ~var18) {
                            int var30 = var8 * var29 / var18;
                            if (this.field3663 != 0) {
                                for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class3.method48(arg0 + var31, class129.field2012)] = var22[class3.method48(arg0 + -1 - -arg1 - var31, class129.field2012)] = var30 > var32 ? var32 : var30;
                                }
                            } else {
                                for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                    int var35 = var8 * var33 / var17;
                                    var22[class3.method48(class129.field2012, arg0 + var33)] = var22[class3.method48(class129.field2012, -var33 + -1 + arg0 + arg1)] = var30 * var35 >> 12;
                                }
                            }
                            if (var19 + var20 <= class178.field2662) {
                                class236.method1587(var22, var20, var19, var30);
                            } else {
                                int var34 = -var20 + class178.field2662;
                                class236.method1587(var22, var20, var34, var30);
                                class236.method1587(var22, 0, -var34 + var19, var30);
                            }
                        } else {
                            for (int var36 = 0; ~var36 > ~var17; ++var36) {
                                var22[class3.method48(arg0 - -var36, class129.field2012)] = var22[class3.method48(class129.field2012, arg0 + arg1 + -1 + -var36)] = var8 * var36 / var17;
                            }
                            if (var19 + var20 <= class178.field2662) {
                                class236.method1587(var22, var20, var19, var8);
                            } else {
                                int var37 = -var20 + class178.field2662;
                                class236.method1587(var22, var20, var37, var8);
                                class236.method1587(var22, 0, var19 - var37, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLag;)V")
    public static final void method1592(byte arg0, class188 arg1) {
        int var2 = arg1.field2950;
        ++field3654;
        if (~var2 == -325) {
            if (~class267.field4264 == 0) {
                class267.field4264 = arg1.field2888;
                class136.field2119 = arg1.field2916;
            }
            if (!class296.field4670.field3752) {
                arg1.field2888 = class136.field2119;
            } else {
                arg1.field2888 = class267.field4264;
            }
        } else {
            int var3 = -112 % ((arg0 - -64) / 40);
            if (~var2 == -326) {
                if (class267.field4264 == -1) {
                    class267.field4264 = arg1.field2888;
                    class136.field2119 = arg1.field2916;
                }
                if (!class296.field4670.field3752) {
                    arg1.field2888 = class267.field4264;
                } else {
                    arg1.field2888 = class136.field2119;
                }
            } else if (~var2 == -328) {
                arg1.field2945 = 150;
                arg1.field2933 = 2047 & (int) (256.0D * Math.sin((double) class267.field4256 / 40.0D));
                arg1.field2947 = 5;
                arg1.field2993 = -1;
            } else if (var2 == 328) {
                if (class261.field4058.field446 == null) {
                    arg1.field2993 = 0;
                } else {
                    arg1.field2945 = 150;
                    arg1.field2933 = (int) (Math.sin((double) class267.field4256 / 40.0D) * 256.0D) & 2047;
                    arg1.field2947 = 5;
                    arg1.field2993 = 2047 + ((int) class247.method1668(class261.field4058.field446, true) << 11);
                    arg1.field2857 = class261.field4058.field4148;
                    arg1.field2974 = 0;
                    arg1.field2833 = class261.field4058.field4164;
                    arg1.field2868 = class261.field4058.field4175;
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(IB)I")
    public static final int method1593(int arg0, byte arg1) {
        if (arg1 != -55) {
            return -31;
        } else {
            ++field3676;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLcd;)I")
    public static final int method1594(byte arg0, class28 arg1) {
        int var2 = arg1.field432;
        if (arg0 != 88) {
            method1593(98, (byte) 61);
        }
        ++field3668;
        class8 var3 = arg1.method1801((byte) 115);
        if (~arg1.field4148 != ~var3.field142) {
            if (~arg1.field4148 != ~var3.field167 && arg1.field4148 != var3.field144 && arg1.field4148 != var3.field155 && arg1.field4148 != var3.field164) {
                if (arg1.field4148 == var3.field148 || arg1.field4148 == var3.field159 || arg1.field4148 == var3.field166 || arg1.field4148 == var3.field153) {
                    var2 = arg1.field422;
                }
            } else {
                var2 = arg1.field413;
            }
        } else {
            var2 = arg1.field416;
        }
        return var2;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field3655 = arg1.method293(122);
                                        }
                                    } else {
                                        this.field3661 = arg1.method293(-51);
                                    }
                                } else {
                                    this.field3663 = arg1.method333((byte) -59);
                                }
                            } else {
                                this.field3662 = arg1.method293(92);
                            }
                        } else {
                            this.field3673 = arg1.method293(111);
                        }
                    } else {
                        this.field3670 = arg1.method293(-2);
                    }
                } else {
                    this.field3652 = arg1.method293(arg0 + 30);
                }
            } else {
                this.field3671 = arg1.method293(124);
            }
        } else {
            this.field3664 = arg1.method333((byte) -59);
        }
        if (arg0 != -79) {
            method1599((byte) -33, -48);
        }
        ++field3657;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        ++field3653;
        if (arg0) {
            field3666 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field3660;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            return null;
        } else if (super.field1254.field3118) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int[][] var8 = super.field1254.method1325(0);
            boolean var9 = true;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = class178.field2662 * this.field3671 >> 12;
            boolean var14 = true;
            int var15 = class178.field2662 * this.field3652 >> 12;
            int var16 = class209.field3248 * this.field3670 >> 12;
            int var17 = class209.field3248 * this.field3673 >> 12;
            if (var17 <= 1) {
                return var8[arg1];
            } else {
                this.field3672 = class178.field2662 / 8 * this.field3662 >> 12;
                int var18 = class178.field2662 / var13 + 1;
                int[][] var19 = new int[var18][3];
                Random var20 = new Random((long) this.field3664);
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = var13 + class167.method1104(-var13 + var15, (byte) -103, var20);
                        int var23 = var16 + class167.method1104(-var16 + var17, (byte) -82, var20);
                        int var24 = var7 + var22;
                        if (class178.field2662 < var24) {
                            var22 = -var7 + class178.field2662;
                            var24 = class178.field2662;
                        }
                        int var28;
                        if (var14) {
                            var28 = 0;
                        } else {
                            int var25 = var6;
                            int[] var26 = var21[var6];
                            int var27 = 0;
                            var28 = var26[2];
                            int var29 = var24 - -var5;
                            if (~var29 > -1) {
                                var29 += class178.field2662;
                            }
                            if (~class178.field2662 > ~var29) {
                                var29 -= class178.field2662;
                            }
                            while (true) {
                                int[] var30 = var21[var25];
                                if (~var29 <= ~var30[0] && ~var29 >= ~var30[1]) {
                                    if (~var6 != ~var25) {
                                        int var31 = var5 + var7;
                                        if (~var31 > -1) {
                                            var31 += class178.field2662;
                                        }
                                        if (var31 > class178.field2662) {
                                            var31 -= class178.field2662;
                                        }
                                        for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                            int[] var40 = var21[(var6 - -var32) % var12];
                                            var28 = Math.max(var28, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var27; ++var33) {
                                            int[] var34 = var21[(var6 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var28 != var35) {
                                                int var36 = var34[1];
                                                int var37 = var34[0];
                                                int var38;
                                                int var39;
                                                if (var31 >= var29) {
                                                    if (var37 != 0) {
                                                        var38 = Math.max(var31, var37);
                                                        var39 = class178.field2662;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var36);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var37);
                                                    var39 = Math.min(var29, var36);
                                                }
                                                this.method1591(var38 - -var4, -var38 + var39, -22095, var8, -var35 + var28, var20, var35);
                                            }
                                        }
                                    }
                                    var6 = var25;
                                    break;
                                }
                                ++var27;
                                ++var25;
                                if (var12 <= var25) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (var23 + var28 > class209.field3248) {
                            var23 = -var28 + class209.field3248;
                        } else {
                            var9 = false;
                        }
                        if (~class178.field2662 != ~var24) {
                            int[] var41 = var19[var11++];
                            var41[1] = var24;
                            var41[2] = var23 + var28;
                            var41[0] = var7;
                            this.method1591(var7 + var10, var22, arg0 ^ -22091, var8, var23, var20, var28);
                            var7 = var24;
                        } else {
                            this.method1591(var7 + var10, var22, -22095, var8, var23, var20, var28);
                            if (var9) {
                                return var3;
                            }
                            var4 = var10;
                            int[] var42 = var19[var11++];
                            var12 = var11;
                            var42[0] = var7;
                            var42[2] = var23 + var28;
                            var7 = 0;
                            var11 = 0;
                            var14 = false;
                            int[][] var43 = var21;
                            var42[1] = var24;
                            var6 = 0;
                            var10 = class167.method1104(class178.field2662, (byte) -88, var20);
                            var9 = true;
                            var5 = var10 - var4;
                            int var44 = var5;
                            var21 = var19;
                            if (var5 < 0) {
                                var44 = class178.field2662 + var5;
                            }
                            if (var44 > class178.field2662) {
                                var44 -= class178.field2662;
                            }
                            while (true) {
                                int[] var45 = var21[var6];
                                if (~var44 <= ~var45[0] && ~var45[1] <= ~var44) {
                                    var19 = var43;
                                    break;
                                }
                                ++var6;
                                if (var6 >= var12) {
                                    var6 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class46 var10 = null;
        class46 var11 = (class46) class208.field3232.method1010(115);
        ++field3667;
        while (var11 != null) {
            if (var11.field733 == arg3 && ~var11.field729 == ~arg6 && var11.field728 == arg4 && ~var11.field725 == ~arg7) {
                var10 = var11;
                break;
            }
            var11 = (class46) class208.field3232.method1008((byte) 88);
        }
        if (var10 == null) {
            var10 = new class46();
            var10.field733 = arg3;
            var10.field728 = arg4;
            var10.field725 = arg7;
            var10.field729 = arg6;
            class156.method1050(-126, var10);
            class208.field3232.method1013(arg9 + 312991604, var10);
        }
        var10.field726 = arg1;
        var10.field736 = arg0;
        var10.field738 = arg5;
        var10.field730 = arg2;
        if (arg9 != 0) {
            method1592((byte) -110, (class188) null);
        }
        var10.field735 = arg8;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(III)Lam;")
    public static final class180 method1596(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class180 var4 = var3.field363;
            var3.field363 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
    public class237() {
        super(0, true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lka;B)V")
    public static final void method1597(class264 arg0, byte arg1) {
        class8 var2 = arg0.method1801((byte) 116);
        arg0.field4148 = var2.field142;
        if (arg1 == -2) {
            ++field3658;
            if (arg0.field4208 != 0) {
                if (~arg0.field4210 != 0 && arg0.field4179 == 0) {
                    class223 var3 = class28.method224(arg0.field4210, 54);
                    if (~arg0.field4151 < -1 && var3.field3502 == 0) {
                        ++arg0.field4178;
                        return;
                    }
                    if (~arg0.field4151 >= -1 && var3.field3489 == 0) {
                        ++arg0.field4178;
                        return;
                    }
                }
                if (~arg0.field4135 != 0 && ~arg0.field4174 >= ~class267.field4256) {
                    class259 var4 = class23.method189(arg0.field4135, (byte) 112);
                    if (var4.field3959 && var4.field3963 != -1) {
                        class223 var5 = class28.method224(var4.field3963, 51);
                        if (~arg0.field4151 < -1 && ~var5.field3502 == -1) {
                            ++arg0.field4178;
                            return;
                        }
                        if (arg0.field4151 <= 0 && ~var5.field3489 == -1) {
                            ++arg0.field4178;
                            return;
                        }
                    }
                }
                int var6 = arg0.field4176;
                int var7 = arg0.field4123;
                int var8 = arg0.field4204[arg0.field4208 + -1] * 128 + 64 * arg0.method226((byte) -97);
                int var9 = arg0.field4143[arg0.field4208 + -1] * 128 + arg0.method226((byte) -97) * 64;
                if (~(var8 - var6) < -257 || -var6 + var8 < -256 || var9 - var7 > 256 || ~(var9 - var7) > 255) {
                    arg0.field4176 = var8;
                    arg0.field4123 = var9;
                    return;
                }
                if (var6 < var8) {
                    if (var9 > var7) {
                        arg0.field4199 = 1280;
                    } else if (var9 < var7) {
                        arg0.field4199 = 1792;
                    } else {
                        arg0.field4199 = 1536;
                    }
                } else if (~var8 <= ~var6) {
                    if (var7 < var9) {
                        arg0.field4199 = 1024;
                    } else if (var9 < var7) {
                        arg0.field4199 = 0;
                    }
                } else if (var9 > var7) {
                    arg0.field4199 = 768;
                } else if (var9 >= var7) {
                    arg0.field4199 = 512;
                } else {
                    arg0.field4199 = 256;
                }
                int var10 = var2.field145;
                int var11 = 2047 & -arg0.field4159 + arg0.field4199;
                int var12 = 4;
                if (var11 > 1024) {
                    var11 -= 2048;
                }
                boolean var13 = true;
                byte var14 = 1;
                if (var11 >= -256 && var11 <= 256) {
                    var10 = var2.field165;
                } else if (~var11 <= -257 && var11 < 768) {
                    var10 = var2.field141;
                } else if (var11 >= -768 && ~var11 >= 255) {
                    var10 = var2.field173;
                }
                if (~var10 == 0) {
                    var10 = var2.field165;
                }
                arg0.field4148 = var10;
                if (arg0 instanceof class32) {
                    var13 = ((class32) arg0).field518.field3364;
                }
                if (!var13) {
                    if (~arg0.field4208 < -2) {
                        var12 = 6;
                    }
                    if (~arg0.field4208 < -3) {
                        var12 = 8;
                    }
                    if (arg0.field4178 > 0 && arg0.field4208 > 1) {
                        var12 = 8;
                        --arg0.field4178;
                    }
                } else {
                    if (arg0.field4199 != arg0.field4159 && arg0.field4140 == -1 && arg0.field4167 != 0) {
                        var12 = 2;
                    }
                    if (arg0.field4208 > 2) {
                        var12 = 6;
                    }
                    if (~arg0.field4208 < -4) {
                        var12 = 8;
                    }
                    if (~arg0.field4178 < -1 && ~arg0.field4208 < -2) {
                        var12 = 8;
                        --arg0.field4178;
                    }
                }
                if (arg0.field4193[arg0.field4208 - 1] != 2) {
                    if (arg0.field4193[arg0.field4208 - 1] == 0) {
                        var14 = 0;
                        var12 >>= 1;
                    }
                } else {
                    var14 = 2;
                    var12 <<= 1;
                }
                if (~var12 <= -9 && var2.field167 != -1) {
                    if (~arg0.field4148 == ~var2.field145 && var2.field144 != -1) {
                        arg0.field4148 = var2.field144;
                    } else if (arg0.field4148 == var2.field173 && var2.field164 != -1) {
                        arg0.field4148 = var2.field164;
                    } else if (~arg0.field4148 == ~var2.field141 && ~var2.field155 != 0) {
                        arg0.field4148 = var2.field155;
                    } else {
                        arg0.field4148 = var2.field167;
                    }
                } else if (~var2.field148 != 0 && var14 == 0) {
                    if (~arg0.field4148 == ~var2.field145 && var2.field159 != -1) {
                        arg0.field4148 = var2.field159;
                    } else if (~arg0.field4148 == ~var2.field173 && var2.field153 != -1) {
                        arg0.field4148 = var2.field153;
                    } else if (~arg0.field4148 == ~var2.field141 && ~var2.field166 != 0) {
                        arg0.field4148 = var2.field166;
                    } else {
                        arg0.field4148 = var2.field148;
                    }
                }
                if (~var2.field139 != 0) {
                    int var15 = var12 << 7;
                    if (~arg0.field4208 != -2) {
                        if (var15 <= arg0.field4209) {
                            if (~arg0.field4209 < -1) {
                                arg0.field4209 -= var2.field139;
                                if (arg0.field4209 < 0) {
                                    arg0.field4209 = 0;
                                }
                            }
                        } else {
                            arg0.field4209 += var2.field139;
                            if (~arg0.field4209 < ~var15) {
                                arg0.field4209 = var15;
                            }
                        }
                    } else {
                        int var16 = arg0.field4209 * arg0.field4209;
                        int var17 = (arg0.field4123 > var9 ? -var9 + arg0.field4123 : -arg0.field4123 + var9) << 7;
                        int var18 = (arg0.field4176 <= var8 ? -arg0.field4176 + var8 : -var8 + arg0.field4176) << 7;
                        int var19 = ~var18 >= ~var17 ? var17 : var18;
                        int var20 = var2.field139 * 2 * var19;
                        if (var16 <= var20) {
                            if (var16 / 2 > var19) {
                                arg0.field4209 -= var2.field139;
                                if (arg0.field4209 < 0) {
                                    arg0.field4209 = 0;
                                }
                            } else if (var15 > arg0.field4209) {
                                arg0.field4209 += var2.field139;
                                if (arg0.field4209 > var15) {
                                    arg0.field4209 = var15;
                                }
                            }
                        } else {
                            arg0.field4209 /= 2;
                        }
                    }
                    var12 = arg0.field4209 >> 7;
                    if (~var12 > -2) {
                        var12 = 1;
                    }
                }
                if (var8 > var6) {
                    arg0.field4176 += var12;
                    if (var8 < arg0.field4176) {
                        arg0.field4176 = var8;
                    }
                } else if (~var8 > ~var6) {
                    arg0.field4176 -= var12;
                    if (~arg0.field4176 > ~var8) {
                        arg0.field4176 = var8;
                    }
                }
                if (~var7 <= ~var9) {
                    if (~var7 < ~var9) {
                        arg0.field4123 -= var12;
                        if (~var9 < ~arg0.field4123) {
                            arg0.field4123 = var9;
                        }
                    }
                } else {
                    arg0.field4123 += var12;
                    if (arg0.field4123 > var9) {
                        arg0.field4123 = var9;
                    }
                }
                if (arg0.field4176 == var8 && ~arg0.field4123 == ~var9) {
                    if (arg0.field4151 > 0) {
                        --arg0.field4151;
                    }
                    --arg0.field4208;
                    return;
                }
            } else {
                arg0.field4178 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
    public static void method1598(byte arg0) {
        field3674 = null;
        field3665 = null;
        field3666 = null;
        if (arg0 <= 19) {
            method1595(-41, -60, -83, -64, -114, -35, 126, -97, -121, 44);
        }
        field3675 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)I")
    public static final int method1599(byte arg0, int arg1) {
        int var2 = -34 % ((arg0 - 65) / 59);
        ++field3659;
        return arg1 == 16711935 ? -1 : class139.method965(arg1, (byte) 115);
    }
}
