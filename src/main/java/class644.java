import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class644 extends class666 {

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    private int field9111 = 409;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "[I")
    private int[] field9112 = new int[3];

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    private int field9120 = 4096;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    private int field9116 = 4096;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    private int field9118 = 4096;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field9114 = -1;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "[I")
    public static int[] field9122 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method3610(int arg0, int arg1, boolean arg2) {
        ++field9109;
        if (arg2) {
            field9114 = -86;
        }
        return class323.method1825(arg0, 16, arg1) | ~(393216 & arg0) != -1 || class626.method3510(arg1, arg0, (byte) 109);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lba;ILgr;BII)V")
    public static final void method3611(class350 arg0, int arg1, class396 arg2, byte arg3, int arg4, int arg5) {
        if (arg3 >= -56) {
            method3615((byte) 108);
        }
        ++field9110;
        if (arg0 != null) {
            arg2.method2162((byte) -124, arg4, arg0.method872(), arg0.method880(), arg1, arg0.method912(), arg0.method913(), arg0.method864(), arg0.method876(), arg0.method875(), arg5);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3612(boolean arg0, int arg1) {
        ++field9119;
        if (arg0) {
            method3613((String) null, -89, (String) null, 31);
        }
        return ~(arg1 & -arg1) == ~arg1;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class644() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
    public static final int method3613(String arg0, int arg1, String arg2, int arg3) {
        ++field9115;
        int var4 = arg0.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (~var4 < ~(var6 - var8) || ~var5 < ~(-var9 + var7)) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (-var9 + var7 >= var5) {
                return 1;
            }
            char var22;
            if (~var8 != -1) {
                var22 = var8;
                boolean var23 = false;
            } else {
                var22 = arg0.charAt(var6++);
            }
            char var24;
            if (~var9 == -1) {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class328.method1855(var22, 53);
            var9 = class328.method1855(var24, arg1 ^ 54);
            char var26 = class184.method1070(arg1 + 24153, var22, arg3);
            char var27 = class184.method1070(24153, var24, arg3);
            if (var26 != var27 && ~Character.toUpperCase(var26) != ~Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class272.method1555(-118, var28, arg3) + -class272.method1555(-18, var29, arg3);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; ~var11 > ~var10; ++var11) {
            int var16;
            int var17;
            if (arg3 != 2) {
                var16 = var11;
                var17 = var11;
            } else {
                var16 = var5 - (var11 + 1);
                var17 = var4 - (1 - -var11);
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (~var18 != ~var19 && ~Character.toUpperCase(var18) != ~Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class272.method1555(55, var20, arg3) + -class272.method1555(arg1 + -12, var21, arg3);
                }
            }
        }
        int var12 = -var5 + var4;
        if (arg1 != var12) {
            return var12;
        } else {
            for (int var13 = 0; ~var13 > ~var10; ++var13) {
                char var14 = arg0.charAt(var13);
                char var15 = arg2.charAt(var13);
                if (var14 != var15) {
                    return class272.method1555(21, var14, arg3) + -class272.method1555(-119, var15, arg3);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILfp;Z)V")
    public static final void method3614(int arg0, class292 arg1, boolean arg2) {
        ++field9121;
        class468 var3 = arg1.method1653(1);
        if (arg1.field3835 == 0) {
            class86.field915 = -1;
            arg1.field3837 = 0;
            class370.field4802 = 0;
        } else {
            if (arg1.field3778 != -1 && ~arg1.field3797 == -1) {
                class576 var4 = class618.field8696.method124(24006, arg1.field3778);
                if (~arg1.field3840 < -1 && ~var4.field8232 == -1) {
                    class370.field4802 = 0;
                    ++arg1.field3837;
                    class86.field915 = -1;
                    return;
                }
                if (~arg1.field3840 >= -1 && var4.field8223 == 0) {
                    class370.field4802 = 0;
                    ++arg1.field3837;
                    class86.field915 = -1;
                    return;
                }
            }
            if (~arg1.field3774 != 0 && ~class469.field6549 <= ~arg1.field3801) {
                class135 var5 = class203.field2487.method2045((byte) 58, arg1.field3774);
                if (var5.field1520 && var5.field1516 != -1) {
                    class576 var6 = class618.field8696.method124(24006, var5.field1516);
                    if (arg1.field3840 > 0 && var6.field8232 == 0) {
                        ++arg1.field3837;
                        class86.field915 = -1;
                        class370.field4802 = 0;
                        return;
                    }
                    if (arg1.field3840 <= 0 && ~var6.field8223 == -1) {
                        class370.field4802 = 0;
                        ++arg1.field3837;
                        class86.field915 = -1;
                        return;
                    }
                }
            }
            if (~arg1.field3774 != 0 && arg1.field3801 <= class469.field6549) {
                class135 var7 = class203.field2487.method2045((byte) -126, arg1.field3774);
                if (var7.field1520 && var7.field1516 != -1) {
                    class576 var8 = class618.field8696.method124(24006, var7.field1516);
                    if (arg1.field3840 > 0 && var8.field8232 == 0) {
                        class370.field4802 = 0;
                        class86.field915 = -1;
                        ++arg1.field3837;
                        return;
                    }
                    if (arg1.field3840 <= 0 && var8.field8223 == 0) {
                        class370.field4802 = 0;
                        ++arg1.field3837;
                        class86.field915 = -1;
                        return;
                    }
                }
            }
            int var9 = arg1.field4641;
            int var10 = arg1.field4647;
            int var11 = arg1.field3839[arg1.field3835 - 1] * 512 + arg1.method1656(true) * 256;
            int var12 = arg1.field3841[arg1.field3835 + -1] * 512 - -(256 * arg1.method1656(true));
            if (~var9 <= ~var11) {
                if (var11 >= var9) {
                    if (~var12 < ~var10) {
                        arg1.method1657(8192, -10652);
                    } else if (~var10 < ~var12) {
                        arg1.method1657(0, -10652);
                    }
                } else if (var10 < var12) {
                    arg1.method1657(6144, arg0 + -20676);
                } else if (var12 < var10) {
                    arg1.method1657(2048, arg0 + -20676);
                } else {
                    arg1.method1657(4096, -10652);
                }
            } else if (var12 > var10) {
                arg1.method1657(10240, -10652);
            } else if (~var12 <= ~var10) {
                arg1.method1657(12288, -10652);
            } else {
                arg1.method1657(14336, -10652);
            }
            byte var13 = arg1.field3842[arg1.field3835 - 1];
            if (arg2 || ~(-var9 + var11) >= -1025 && ~(-var9 + var11) <= 1023 && -var10 + var12 <= 1024 && var12 - var10 >= -1024) {
                int var14 = 16;
                boolean var15 = true;
                if (arg1 instanceof class625) {
                    var15 = ((class625) arg1).field8855.field274;
                }
                if (!var15) {
                    if (!arg2 && ~arg1.field3835 < -2) {
                        var14 = 24;
                    }
                    if (!arg2 && ~arg1.field3835 < -3) {
                        var14 = 32;
                    }
                } else {
                    int var16 = -arg1.field3765.field3532 + arg1.field3749;
                    if (var16 != 0 && ~arg1.field3803 == 0 && ~arg1.field3792 != -1) {
                        var14 = 8;
                    }
                    if (!arg2 && ~arg1.field3835 < -3) {
                        var14 = 24;
                    }
                    if (!arg2 && arg1.field3835 > 3) {
                        var14 = 32;
                    }
                }
                if (~arg1.field3837 < -1 && arg1.field3835 > 1) {
                    --arg1.field3837;
                    var14 = 32;
                }
                if (var13 != 2) {
                    if (~var13 == -1) {
                        var14 >>= 1;
                    }
                } else {
                    var14 <<= 1;
                }
                class370.field4802 = 0;
                if (~var3.field6495 != 0) {
                    int var17 = var14 << 9;
                    if (~arg1.field3835 != -2) {
                        if (arg1.field3838 < var17) {
                            arg1.field3838 += var3.field6495;
                            if (arg1.field3838 > var17) {
                                arg1.field3838 = var17;
                            }
                        } else if (arg1.field3838 > 0) {
                            arg1.field3838 -= var3.field6495;
                            if (arg1.field3838 < 0) {
                                arg1.field3838 = 0;
                            }
                        }
                    } else {
                        int var18 = arg1.field3838 * arg1.field3838;
                        int var19 = (arg1.field4641 <= var11 ? -arg1.field4641 + var11 : arg1.field4641 - var11) << 9;
                        int var20 = (var12 >= arg1.field4647 ? -arg1.field4647 + var12 : arg1.field4647 - var12) << 9;
                        int var21 = ~var19 >= ~var20 ? var20 : var19;
                        int var22 = var3.field6495 * 2 * var21;
                        if (~var22 <= ~var18) {
                            if (~var21 > ~(var18 / 2)) {
                                arg1.field3838 -= var3.field6495;
                                if (~arg1.field3838 > -1) {
                                    arg1.field3838 = 0;
                                }
                            } else if (arg1.field3838 < var17) {
                                arg1.field3838 += var3.field6495;
                                if (var17 < arg1.field3838) {
                                    arg1.field3838 = var17;
                                }
                            }
                        } else {
                            arg1.field3838 /= 2;
                        }
                    }
                    var14 = arg1.field3838 >> 9;
                    if (~var14 > -2) {
                        var14 = 1;
                    }
                }
                if (var9 == var11 && var10 == var12) {
                    class86.field915 = -1;
                } else {
                    if (~var11 < ~var9) {
                        class370.field4802 |= 4;
                        arg1.field4641 += var14;
                        if (arg1.field4641 > var11) {
                            arg1.field4641 = var11;
                        }
                    } else if (var9 > var11) {
                        class370.field4802 |= 8;
                        arg1.field4641 -= var14;
                        if (~arg1.field4641 > ~var11) {
                            arg1.field4641 = var11;
                        }
                    }
                    if (var12 > var10) {
                        arg1.field4647 += var14;
                        class370.field4802 |= 1;
                        if (arg1.field4647 > var12) {
                            arg1.field4647 = var12;
                        }
                    } else if (var12 < var10) {
                        arg1.field4647 -= var14;
                        class370.field4802 |= 2;
                        if (arg1.field4647 < var12) {
                            arg1.field4647 = var12;
                        }
                    }
                    if (var14 < 32) {
                        class86.field915 = var13;
                    } else {
                        class86.field915 = 2;
                    }
                }
                if (~arg1.field4641 == ~var11 && arg1.field4647 == var12) {
                    --arg1.field3835;
                    if (~arg1.field3840 < -1) {
                        --arg1.field3840;
                    }
                }
                if (arg0 != 10024) {
                    field9122 = null;
                }
            } else {
                arg1.field4641 = var11;
                arg1.field4647 = var12;
                arg1.method1648(false, arg1.field3749, (byte) 100);
                if (arg1.field3840 > 0) {
                    --arg1.field3840;
                }
                class86.field915 = -1;
                --arg1.field3835;
                class370.field4802 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        ++field9113;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var5 = arg1.method2524(3);
                            this.field9112[0] = class203.method1246(var5 << 4, 267386880);
                            this.field9112[1] = class203.method1246(var5, 65280) >> 4;
                            this.field9112[2] = class203.method1246(var5, 255) >> 12;
                        }
                    } else {
                        this.field9116 = arg1.method2574(-1758460248);
                    }
                } else {
                    this.field9118 = arg1.method2574(-1758460248);
                }
            } else {
                this.field9120 = arg1.method2574(-1758460248);
            }
        } else {
            this.field9111 = arg1.method2574(-1758460248);
        }
        if (!arg2) {
            this.method1251(-123, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1251(int arg0, byte arg1) {
        ++field9117;
        if (arg1 != 98) {
            return null;
        } else {
            int[][] var3 = super.field9471.method3639(73, arg0);
            if (super.field9471.field9180) {
                int[][] var4 = this.method3737(arg0, 0, 3);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class501.field7222 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field9112[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (~var13 < ~this.field9111) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field9112[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var15 < ~this.field9111) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field9112[2] + var16;
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (var17 > this.field9111) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field9116 * var12 >> 12;
                                var9[var11] = this.field9118 * var14 >> 12;
                                var10[var11] = this.field9120 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method3615(byte arg0) {
        field9122 = null;
        if (arg0 != 47) {
            method3610(0, -44, false);
        }
    }
}
