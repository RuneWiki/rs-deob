import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class471 extends class362 {

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
    public int field6381 = 4;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
    public int field6386 = 4;

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "Z")
    public boolean field6385 = true;

    @OriginalMember(owner = "client!qv", name = "L", descriptor = "I")
    public int field6393 = 0;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
    public int field6380 = 1638;

    @OriginalMember(owner = "client!qv", name = "O", descriptor = "[B")
    private byte[] field6395 = new byte[512];

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
    public int field6383 = 4;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!qv", name = "N", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!qv", name = "Q", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!qv", name = "R", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!qv", name = "S", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!qv", name = "T", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "Ljava/awt/Font;")
    public static Font field6387;

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "[S")
    private short[] field6389;

    @OriginalMember(owner = "client!qv", name = "K", descriptor = "[S")
    private short[] field6392;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field6388;
        if (arg0 != -2026769311) {
            this.field6393 = -71;
        }
        int[] var3 = super.field4927.method808(arg0 + 2026769186, arg1);
        if (super.field4927.field1471) {
            this.method2716(var3, arg1, -45243636);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(B)V")
    public static void method2710(byte arg0) {
        field6387 = null;
        if (arg0 != -92) {
            method2711(67, 115, 25, -77, -26, -55);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIII)V")
    public static final void method2711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6397;
        int var6 = -75 % ((arg2 - -12) / 43);
        int var7 = 0;
        int var8 = arg1;
        int var9 = arg4 * arg4;
        int var10 = arg1 * arg1;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg1 << 1;
        int var14 = (-var13 + 1) * var9 + var11;
        int var15 = -((var13 + -1) * var12) + var10;
        int var16 = var9 << 2;
        int var17 = var10 << 2;
        int var18 = ((var7 << 1) - -3) * var11;
        int var19 = ((arg1 << 1) - 3) * var12;
        int var20 = (var7 - -1) * var17;
        int var21 = (arg1 + -1) * var16;
        class679.method3826(class298.field4105[arg5], arg3 + arg4, 11, -arg4 + arg3, arg0);
        while (var8 > 0) {
            if (var14 < 0) {
                while (~var14 > -1) {
                    var15 += var20;
                    var14 += var18;
                    var20 += var17;
                    var18 += var17;
                    ++var7;
                }
            }
            if (~var15 > -1) {
                var15 += var20;
                var14 += var18;
                ++var7;
                var20 += var17;
                var18 += var17;
            }
            var14 += -var21;
            var15 += -var19;
            var19 -= var16;
            var21 -= var16;
            --var8;
            int var22 = -var8 + arg5;
            int var23 = arg5 + var8;
            int var24 = arg3 - -var7;
            int var25 = -var7 + arg3;
            class679.method3826(class298.field4105[var22], var24, 11, var25, arg0);
            class679.method3826(class298.field4105[var23], var24, 11, var25, arg0);
        }
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)V")
    private final void method2712(int arg0) {
        if (~this.field6380 >= -1) {
            if (this.field6389 != null && this.field6389.length == this.field6386) {
                this.field6392 = new short[this.field6386];
                for (int var2 = 0; var2 < this.field6386; ++var2) {
                    this.field6392[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field6392 = new short[this.field6386];
            this.field6389 = new short[this.field6386];
            for (int var3 = 0; ~var3 > ~this.field6386; ++var3) {
                this.field6389[var3] = (short) ((int) (Math.pow((double) ((float) this.field6380 / 4096.0F), (double) var3) * 4096.0D));
                this.field6392[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field6391;
        if (arg0 != 0) {
            this.field6389 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(III)Ldm;")
    public static final class58 method2713(int arg0, int arg1, int arg2) {
        class549 var3 = class325.field4448[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7466;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIII)I")
    private final int method2714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6390;
        int var8 = arg4 >> 12;
        int var9 = var8 + 1;
        if (var9 >= arg5) {
            var9 = 0;
        }
        int var10 = arg4 & 4095;
        int var11 = var8 & 255;
        int var12 = var10 + -4096;
        int var13 = var9 & 255;
        int var14 = arg0 - 4096;
        int var15 = 3 & this.field6395[arg3 + var11];
        int var16 = class671.field9321[var10];
        int var17;
        if (~var15 < -2) {
            var17 = ~var15 == -3 ? -arg0 + var10 : -var10 - arg0;
        } else {
            var17 = var15 == 0 ? arg0 + var10 : arg0 - var10;
        }
        int var18 = 3 & this.field6395[arg3 + var13];
        int var19;
        if (~var18 < -2) {
            var19 = var18 == 2 ? var12 - arg0 : -arg0 + -var12;
        } else {
            var19 = var18 == 0 ? var12 - -arg0 : -var12 + arg0;
        }
        int var20 = this.field6395[arg2 + var11] & 3;
        int var21 = ((var19 - var17) * var16 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = var20 != 0 ? -var10 + var14 : var10 + var14;
        } else {
            var22 = var20 != 2 ? -var10 + -var14 : var10 - var14;
        }
        int var23 = this.field6395[var13 - -arg2] & 3;
        if (arg6 != -30592) {
            return 96;
        } else {
            int var24;
            if (var23 > 1) {
                var24 = var23 == 2 ? var12 - var14 : -var12 + -var14;
            } else {
                var24 = ~var23 == -1 ? var12 + var14 : -var12 + var14;
            }
            int var25 = ((-var22 + var24) * var16 >> 12) + var22;
            return ((-var21 + var25) * arg1 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "()V")
    public class471() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "(I)V")
    public static final void method2715(int arg0) {
        ++field6399;
        client var1 = class594.field8348;
        synchronized (class594.field8348) {
            if (class703.field9674 == null) {
                if (arg0 != 2048) {
                    method2711(-92, -29, -86, -68, 84, -35);
                }
                Container var2;
                if (class194.field2956 == null) {
                    if (class286.field3936 == null) {
                        var2 = class286.field3938;
                    } else {
                        var2 = class286.field3936;
                    }
                } else {
                    var2 = class194.field2956;
                }
                class760.field10464 = var2.getSize().width;
                class540.field7360 = var2.getSize().height;
                if (class194.field2956 == var2) {
                    Insets var3 = class194.field2956.getInsets();
                    class540.field7360 -= var3.top + var3.bottom;
                    class760.field10464 -= var3.right + var3.left;
                }
                if (class586.method3369(2) == 1) {
                    class108.field1697 = class412.field5635;
                    class732.field10098 = class374.field5075;
                    class41.field665 = 0;
                    class596.field8354 = (class760.field10464 - class374.field5075) / 2;
                } else {
                    class642.method3573(arg0 ^ 2848);
                }
                if (class556.field7850 != class517.field7028) {
                    boolean var10000;
                    if (class732.field10098 < 1024 && class108.field1697 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class558.field7896.setSize(class732.field10098, class108.field1697);
                if (class95.field1472 != null) {
                    if (class618.field8597) {
                        class146.method1180(class558.field7896, 21047);
                    } else {
                        class95.field1472.method477(class558.field7896, class732.field10098, class108.field1697);
                    }
                }
                if (class194.field2956 == var2) {
                    Insets var4 = class194.field2956.getInsets();
                    class558.field7896.setLocation(class596.field8354 + var4.left, class41.field665 + var4.top);
                } else {
                    class558.field7896.setLocation(class596.field8354, class41.field665);
                }
                if (class359.field4911 != -1) {
                    class386.method2349(0, true);
                }
                class472.method2717(0);
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "([III)V")
    public final void method2716(int[] arg0, int arg1, int arg2) {
        ++field6382;
        int var4 = class135.field2287[arg1] * this.field6381;
        if (this.field6386 == 1) {
            short var5 = this.field6389[0];
            int var6 = this.field6392[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field6381 * var6 >> 12;
            int var9 = this.field6383 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 + 1;
            if (~var11 <= ~var8) {
                var11 = 0;
            }
            int var12 = var7 & 4095;
            int var13 = 255 & this.field6395[255 & var11];
            int var14 = class671.field9321[var12];
            int var15 = 255 & this.field6395[var10 & 255];
            if (!this.field6385) {
                for (int var16 = 0; class769.field10597 > var16; ++var16) {
                    int var17 = class172.field2750[var16] * this.field6383;
                    int var18 = this.method2714(var12, var14, var13, var15, var6 * var17 >> 12, var9, -30592);
                    arg0[var16] = var5 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; ~var19 > ~class769.field10597; ++var19) {
                    int var20 = class172.field2750[var19] * this.field6383;
                    int var21 = this.method2714(var12, var14, var13, var15, var6 * var20 >> 12, var9, -30592);
                    int var22 = var5 * var21 >> 12;
                    arg0[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field6389[0];
            if (~var23 < -9 || ~var23 > 7) {
                int var24 = this.field6392[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field6381 * var24 >> 12;
                int var27 = this.field6383 * var24 >> 12;
                int var28 = var25 >> 12;
                int var29 = var28 + 1;
                if (var26 <= var29) {
                    var29 = 0;
                }
                int var30 = var25 & 4095;
                int var31 = class671.field9321[var30];
                int var32 = this.field6395[255 & var29] & 255;
                int var33 = 255 & this.field6395[var28 & 255];
                for (int var34 = 0; ~class769.field10597 < ~var34; ++var34) {
                    int var54 = class172.field2750[var34] * this.field6383;
                    int var55 = this.method2714(var30, var31, var32, var33, var24 * var54 >> 12, var27, arg2 + 45213044);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~var35 > ~this.field6386; ++var35) {
                short var36 = this.field6389[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field6392[var35] << 12;
                    int var38 = this.field6381 * var37 >> 12;
                    int var39 = var4 * var37 >> 12;
                    int var40 = this.field6383 * var37 >> 12;
                    int var41 = var39 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var39 & 4095;
                    if (~var38 >= ~var42) {
                        var42 = 0;
                    }
                    int var44 = class671.field9321[var43];
                    int var45 = 255 & this.field6395[255 & var42];
                    int var46 = this.field6395[255 & var41] & 255;
                    if (this.field6385 && ~(this.field6386 + -1) == ~var35) {
                        for (int var47 = 0; ~var47 > ~class769.field10597; ++var47) {
                            int var48 = class172.field2750[var47] * this.field6383;
                            int var49 = this.method2714(var43, var44, var45, var46, var37 * var48 >> 12, var40, -30592);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~class769.field10597 < ~var51; ++var51) {
                            int var52 = class172.field2750[var51] * this.field6383;
                            int var53 = this.method2714(var43, var44, var45, var46, var37 * var52 >> 12, var40, -30592);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
        if (arg2 != -45243636) {
            field6398 = -88;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public final void method160(int arg0) {
        ++field6396;
        this.field6395 = class61.method426(arg0 + 996226838, this.field6393);
        this.method2712(0);
        if (arg0 != -996226836) {
            method2711(-60, 96, 27, -53, -108, -2);
        }
        for (int var2 = this.field6386 - 1; var2 >= 1; --var2) {
            short var3 = this.field6389[var2];
            if (~var3 < -9 || ~var3 > 7) {
                return;
            }
            --this.field6386;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field6381 = arg0.method793((byte) 127);
                                }
                            } else {
                                this.field6383 = arg0.method793((byte) 21);
                            }
                        } else {
                            this.field6393 = arg0.method793((byte) 90);
                        }
                    } else {
                        this.field6383 = this.field6381 = arg0.method793((byte) 71);
                    }
                } else {
                    this.field6380 = arg0.method774(-4);
                    if (~this.field6380 > -1) {
                        this.field6389 = new short[this.field6386];
                        for (int var5 = 0; this.field6386 > var5; ++var5) {
                            this.field6389[var5] = (short) arg0.method774(-4);
                        }
                    }
                }
            } else {
                this.field6386 = arg0.method793((byte) 104);
            }
        } else {
            this.field6385 = ~arg0.method793((byte) 41) == -2;
        }
        if (arg2 == -1) {
            ++field6384;
        }
    }
}
