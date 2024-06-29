import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class422 extends class346 {

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    private int field6128 = 20;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    private int field6133 = 0;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    private int field6132 = 1365;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    private int field6139 = 0;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field6137 = 0;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "[I")
    public static int[] field6129 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "Lke;")
    public static class295 field6134;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6138;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "[I")
    public static int[] field6127;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method2653(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6136;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        class351.method2317(false, arg1 + arg2, class444.field6416[arg4], -arg1 + arg2, arg3);
        int var8 = arg0;
        while (var5 < var6) {
            var8 += 2;
            ++var5;
            var7 += var8;
            if (var7 >= 0) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class444.field6416[arg4 + var6];
                int[] var10 = class444.field6416[arg4 - var6];
                int var11 = arg2 + var5;
                int var12 = -var5 + arg2;
                class351.method2317(false, var11, var9, var12, arg3);
                class351.method2317(false, var11, var10, var12, arg3);
            }
            int var13 = arg2 + var6;
            int var14 = -var6 + arg2;
            int[] var15 = class444.field6416[arg4 + var5];
            int[] var16 = class444.field6416[-var5 + arg4];
            class351.method2317(false, var13, var15, var14, arg3);
            class351.method2317(false, var13, var16, var14, arg3);
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)I", line = 56)
    public static final int method2654(byte arg0) {
        ++field6140;
        if (arg0 < 78) {
            method2653(119, 37, 47, 15, 88);
        }
        if (class258.field3805) {
            return 0;
        } else if (!class226.method1467(0)) {
            return 1;
        } else {
            return class232.field3223 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 81)
    public class422() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[I", line = 85)
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 3) {
            field6138 = null;
        }
        ++field6130;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            for (int var4 = 0; class134.field1753 > var4; ++var4) {
                int var5 = (class361.field5340[var4] << 12) / this.field6132 + this.field6139;
                int var6 = (class436.field6337[arg0] << 12) / this.field6132 + this.field6133;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; var11 + var12 < 16384 && this.field6128 > var13; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var11 - -var7;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field6128 + -1 > var13 ? (var13 << 12) / this.field6128 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V", line = 146)
    public static void method2655(byte arg0) {
        field6129 = null;
        field6127 = null;
        field6134 = null;
        field6138 = null;
        int var1 = -121 / ((-38 - arg0) / 62);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lfb;ZI)V", line = 158)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field6141;
        if (!arg1) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (arg2 == 3) {
                            this.field6133 = arg0.method2239(-1076227960);
                        }
                    } else {
                        this.field6139 = arg0.method2239(-1076227960);
                    }
                } else {
                    this.field6128 = arg0.method2239(-1076227960);
                }
            } else {
                this.field6132 = arg0.method2239(-1076227960);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V", line = 211)
    public static final void method2656(int arg0) {
        class346.field5155 = arg0;
        for (int var1 = 0; var1 < class108.field1421; ++var1) {
            for (int var2 = 0; var2 < class186.field2554; ++var2) {
                if (class106.field1405[arg0][var1][var2] == null) {
                    class106.field1405[arg0][var1][var2] = new class77(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)V", line = 234)
    public static final void method2657(byte arg0, int arg1) {
        class345.field5141 = arg1;
        ++field6135;
        class51 var2 = class390.field5701;
        synchronized (class390.field5701) {
            int var3 = 97 % ((arg0 - 11) / 60);
            class390.field5701.method372(126);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lps;BZ)V", line = 255)
    public static final void method2658(class162 arg0, byte arg1, boolean arg2) {
        ++field6126;
        class290 var3 = arg0.method1084(-24211);
        if (~arg0.field2202 == -1) {
            arg0.field2200 = 0;
            class247.field3475 = -1;
            class252.field3691 = 0;
        } else {
            if (~arg0.field2148 != 0 && arg0.field2151 == 0) {
                class233 var4 = class73.method597(arg0.field2148, -1);
                if (~arg0.field2198 < -1 && ~var4.field3247 == -1) {
                    class252.field3691 = 0;
                    class247.field3475 = -1;
                    ++arg0.field2200;
                    return;
                }
                if (arg0.field2198 <= 0 && var4.field3235 == 0) {
                    class247.field3475 = -1;
                    class252.field3691 = 0;
                    ++arg0.field2200;
                    return;
                }
            }
            if (~arg0.field2142 != 0 && class231.field3179 >= arg0.field2160) {
                class235 var5 = class263.method1762(arg0.field2142, false);
                if (var5.field3263 && var5.field3271 != -1) {
                    class233 var6 = class73.method597(var5.field3271, -1);
                    if (~arg0.field2198 < -1 && var6.field3247 == 0) {
                        class247.field3475 = -1;
                        ++arg0.field2200;
                        class252.field3691 = 0;
                        return;
                    }
                    if (arg0.field2198 <= 0 && ~var6.field3235 == -1) {
                        class252.field3691 = 0;
                        ++arg0.field2200;
                        class247.field3475 = -1;
                        return;
                    }
                }
            }
            int var7 = arg0.field5921;
            int var8 = arg0.field5930;
            int var9 = arg0.field2190[arg0.field2202 + -1] * 128 + 64 * arg0.method1091((byte) 106);
            int var10 = arg0.field2189[arg0.field2202 + -1] * 128 + 64 * arg0.method1091((byte) -83);
            if (arg2 || ~(-var7 + var9) >= -257 && ~(var9 - var7) <= 255 && ~(-var8 + var10) >= -257 && ~(-var8 + var10) <= 255) {
                if (~var7 > ~var9) {
                    if (var8 >= var10) {
                        if (~var8 < ~var10) {
                            arg0.method1083(14336, -23640);
                        } else {
                            arg0.method1083(12288, -23640);
                        }
                    } else {
                        arg0.method1083(10240, -23640);
                    }
                } else if (var7 <= var9) {
                    if (~var10 < ~var8) {
                        arg0.method1083(8192, -23640);
                    } else if (~var8 < ~var10) {
                        arg0.method1083(0, -23640);
                    }
                } else if (var10 > var8) {
                    arg0.method1083(6144, -23640);
                } else if (~var10 > ~var8) {
                    arg0.method1083(2048, -23640);
                } else {
                    arg0.method1083(4096, -23640);
                }
                int var11 = 4;
                boolean var12 = true;
                if (arg0 instanceof class163) {
                    var12 = ((class163) arg0).field2206.field2579;
                }
                if (var12) {
                    int var13 = -arg0.field2164.field1198 + arg0.field2111;
                    if (var13 != 0 && ~arg0.field2179 == 0 && arg0.field2166 != 0) {
                        var11 = 2;
                    }
                    if (!arg2 && ~arg0.field2202 < -3) {
                        var11 = 6;
                    }
                    if (!arg2 && ~arg0.field2202 < -4) {
                        var11 = 8;
                    }
                } else {
                    if (!arg2 && arg0.field2202 > 1) {
                        var11 = 6;
                    }
                    if (!arg2 && ~arg0.field2202 < -3) {
                        var11 = 8;
                    }
                }
                if (~arg0.field2200 < -1 && ~arg0.field2202 < -2) {
                    var11 = 8;
                    --arg0.field2200;
                }
                byte var14 = arg0.field2203[arg0.field2202 + -1];
                if (var14 == 2) {
                    var11 <<= 1;
                } else if (~var14 == -1) {
                    var11 >>= 1;
                }
                class252.field3691 = 0;
                if (var3.field4368 != -1) {
                    int var15 = var11 << 7;
                    if (arg0.field2202 == 1) {
                        int var16 = arg0.field2201 * arg0.field2201;
                        int var17 = (~arg0.field5921 < ~var9 ? -var9 + arg0.field5921 : -arg0.field5921 + var9) << 7;
                        int var18 = (~arg0.field5930 < ~var10 ? -var10 + arg0.field5930 : -arg0.field5930 + var10) << 7;
                        int var19 = var18 >= var17 ? var18 : var17;
                        int var20 = var3.field4368 * var19 * 2;
                        if (~var16 >= ~var20) {
                            if (~(var16 / 2) >= ~var19) {
                                if (arg0.field2201 < var15) {
                                    arg0.field2201 += var3.field4368;
                                    if (~var15 > ~arg0.field2201) {
                                        arg0.field2201 = var15;
                                    }
                                }
                            } else {
                                arg0.field2201 -= var3.field4368;
                                if (arg0.field2201 < 0) {
                                    arg0.field2201 = 0;
                                }
                            }
                        } else {
                            arg0.field2201 /= 2;
                        }
                    } else if (var15 > arg0.field2201) {
                        arg0.field2201 += var3.field4368;
                        if (var15 < arg0.field2201) {
                            arg0.field2201 = var15;
                        }
                    } else if (arg0.field2201 > 0) {
                        arg0.field2201 -= var3.field4368;
                        if (arg0.field2201 < 0) {
                            arg0.field2201 = 0;
                        }
                    }
                    var11 = arg0.field2201 >> 7;
                    if (var11 < 1) {
                        var11 = 1;
                    }
                }
                if (~var7 <= ~var9) {
                    if (var7 > var9) {
                        class252.field3691 |= 8;
                        arg0.field5921 -= var11;
                        if (arg0.field5921 < var9) {
                            arg0.field5921 = var9;
                        }
                    }
                } else {
                    arg0.field5921 += var11;
                    class252.field3691 |= 4;
                    if (var9 < arg0.field5921) {
                        arg0.field5921 = var9;
                    }
                }
                int var21 = 48 % ((arg1 - 35) / 55);
                if (~var10 < ~var8) {
                    arg0.field5930 += var11;
                    class252.field3691 |= 1;
                    if (arg0.field5930 > var10) {
                        arg0.field5930 = var10;
                    }
                } else if (~var10 > ~var8) {
                    class252.field3691 |= 2;
                    arg0.field5930 -= var11;
                    if (~var10 < ~arg0.field5930) {
                        arg0.field5930 = var10;
                    }
                }
                if (~var11 > -9) {
                    class247.field3475 = var14;
                } else {
                    class247.field3475 = 2;
                }
                if (arg0.field5921 == var9 && ~arg0.field5930 == ~var10) {
                    --arg0.field2202;
                    if (~arg0.field2198 < -1) {
                        --arg0.field2198;
                        return;
                    }
                }
            } else {
                arg0.field5921 = var9;
                arg0.field5930 = var10;
                class252.field3691 = 0;
                class247.field3475 = -1;
            }
        }
    }
}
