import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class705 extends class615 {

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
    public static int field9908 = 0;

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
    public static int field9909;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "[[[Lfba;")
    public static class24[][][] field9916;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)V")
    public static final void method3890(int arg0) {
        ++field9915;
        class666 var1 = class603.field8015;
        synchronized (class603.field8015) {
            class603.field8015.method3748(arg0 + 24709);
            if (arg0 != -24703) {
                method3890(-64);
            }
        }
        class666 var2 = class174.field2680;
        synchronized (class174.field2680) {
            class174.field2680.method3748(6);
        }
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(B)V")
    public static void method3891(byte arg0) {
        field9916 = null;
        if (arg0 <= 38) {
            method3895(18, false, 27, -53, 20, (class519) null);
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
    public class705() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
    public static final void method3892(boolean arg0) {
        ++field9912;
        if (class446.field6101 == null) {
            class446.field6101 = new int[65536];
            double var1 = 0.7D + (0.03D * Math.random() - 0.015D);
            int var3 = 0;
            for (int var4 = 0; ~var4 > -513; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (var4 & 7) / 8.0F + 0.0625F;
                for (int var7 = 0; ~var7 > -129; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = var12 - (float) var13;
                    float var16 = (1.0F - var6) * var8;
                    float var17 = (-(var6 * var15) + 1.0F) * var8;
                    float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                    if (var14 == 0) {
                        var10 = var18;
                        var11 = var16;
                        var9 = var8;
                    } else if (~var14 == -2) {
                        var10 = var8;
                        var9 = var17;
                        var11 = var16;
                    } else if (~var14 != -3) {
                        if (~var14 != -4) {
                            if (var14 == 4) {
                                var10 = var16;
                                var11 = var8;
                                var9 = var18;
                            } else if (~var14 == -6) {
                                var9 = var8;
                                var11 = var17;
                                var10 = var16;
                            }
                        } else {
                            var11 = var8;
                            var9 = var16;
                            var10 = var17;
                        }
                    } else {
                        var10 = var8;
                        var11 = var18;
                        var9 = var16;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var22 << 16) + -16777216 + (var23 << 8) + var24;
                    class446.field6101[var3++] = var25;
                }
            }
            if (!arg0) {
                field9916 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIB)I")
    private final int method3893(int arg0, int arg1, byte arg2) {
        ++field9913;
        int var4 = arg1 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        int var6 = 66 % ((arg2 - 74) / 32);
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII[FII)V")
    public static final void method3894(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        ++field9914;
        if (~arg5 < -1 && !class230.method1441(true, arg5)) {
            throw new IllegalArgumentException("");
        } else if (~arg2 < -1 && !class230.method1441(true, arg2)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class73.method549(-6411, arg3);
            int var8 = 0;
            int var9 = ~arg2 < ~arg5 ? arg5 : arg2;
            int var10 = arg5 >> 1;
            int var11 = arg2 >> 1;
            float[] var12 = arg4;
            if (arg1 == -15189) {
                float[] var13 = new float[var7 * var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Df(arg6, var8, arg0, arg5, arg2, 0, arg3, 5126, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = arg5 * var7;
                    float[] var15 = var13;
                    for (int var16 = 0; var16 < var7; ++var16) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; ++var20) {
                            for (int var21 = 0; ~var10 < ~var21; ++var21) {
                                float var22 = var12[var18];
                                int var23 = var7 + var18;
                                float var24 = var12[var23] + var22;
                                float var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                float var27 = var12[var26] + var25;
                                var19 = var7 + var26;
                                var13[var17] = var27 * 0.25F;
                                var17 += var7;
                            }
                            var18 += var14;
                            var19 += var14;
                        }
                    }
                    var13 = var12;
                    arg2 = var11;
                    var12 = var15;
                    arg5 = var10;
                    ++var8;
                    var9 >>= 1;
                    var11 >>= 1;
                    var10 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 != -18) {
            return null;
        } else {
            ++field9911;
            int[] var3 = super.field8125.method298(arg0, -8);
            if (super.field8125.field579) {
                int var4 = class402.field5353[arg0];
                for (int var5 = 0; class505.field6740 > var5; ++var5) {
                    var3[var5] = this.method3893(class168.field2599[var5], var4, (byte) -14) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZIIILii;)Ljava/awt/Frame;")
    public static final Frame method3895(int arg0, boolean arg1, int arg2, int arg3, int arg4, class519 arg5) {
        ++field9910;
        if (!arg5.method2893(-34)) {
            return null;
        } else {
            if (arg1) {
                method3892(true);
            }
            if (~arg0 == -1) {
                class480[] var6 = class637.method3518(-8114, arg5);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var8 < var6.length; ++var8) {
                    if (~var6[var8].field6403 == ~arg4 && ~var6[var8].field6410 == ~arg2 && (arg3 == 0 || ~var6[var8].field6406 == ~arg3) && (!var7 || arg0 < var6[var8].field6401)) {
                        arg0 = var6[var8].field6401;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class192 var9 = arg5.method2905(arg2, arg3, (byte) -124, arg0, arg4);
            while (~var9.field2816 == -1) {
                class486.method2722(0, 10L);
            }
            Frame var10 = (Frame) var9.field2820;
            if (var10 == null) {
                return null;
            } else if (var9.field2816 == 2) {
                class232.method1450(var10, arg5, 3);
                return null;
            } else {
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method3896(int arg0, String arg1) {
        ++field9909;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 != -19214) {
            method3892(true);
        }
        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = arg1.charAt(var4);
            if (var5 > 0 && ~var5 > -129 || ~var5 <= -161 && var5 <= 255) {
                var3[var4] = (byte) var5;
            } else if (var5 != 8364) {
                if (~var5 == -8219) {
                    var3[var4] = -126;
                } else if (~var5 != -403) {
                    if (var5 == 8222) {
                        var3[var4] = -124;
                    } else if (~var5 == -8231) {
                        var3[var4] = -123;
                    } else if (~var5 != -8225) {
                        if (var5 != 8225) {
                            if (var5 == 710) {
                                var3[var4] = -120;
                            } else if (~var5 != -8241) {
                                if (var5 != 352) {
                                    if (~var5 == -8250) {
                                        var3[var4] = -117;
                                    } else if (~var5 == -339) {
                                        var3[var4] = -116;
                                    } else if (~var5 == -382) {
                                        var3[var4] = -114;
                                    } else if (var5 != 8216) {
                                        if (var5 != 8217) {
                                            if (var5 == 8220) {
                                                var3[var4] = -109;
                                            } else if (~var5 == -8222) {
                                                var3[var4] = -108;
                                            } else if (~var5 == -8227) {
                                                var3[var4] = -107;
                                            } else if (~var5 != -8212) {
                                                if (var5 == 8212) {
                                                    var3[var4] = -105;
                                                } else if (~var5 == -733) {
                                                    var3[var4] = -104;
                                                } else if (~var5 != -8483) {
                                                    if (~var5 != -354) {
                                                        if (~var5 == -8251) {
                                                            var3[var4] = -101;
                                                        } else if (var5 != 339) {
                                                            if (~var5 != -383) {
                                                                if (~var5 != -377) {
                                                                    var3[var4] = 63;
                                                                } else {
                                                                    var3[var4] = -97;
                                                                }
                                                            } else {
                                                                var3[var4] = -98;
                                                            }
                                                        } else {
                                                            var3[var4] = -100;
                                                        }
                                                    } else {
                                                        var3[var4] = -102;
                                                    }
                                                } else {
                                                    var3[var4] = -103;
                                                }
                                            } else {
                                                var3[var4] = -106;
                                            }
                                        } else {
                                            var3[var4] = -110;
                                        }
                                    } else {
                                        var3[var4] = -111;
                                    }
                                } else {
                                    var3[var4] = -118;
                                }
                            } else {
                                var3[var4] = -119;
                            }
                        } else {
                            var3[var4] = -121;
                        }
                    } else {
                        var3[var4] = -122;
                    }
                } else {
                    var3[var4] = -125;
                }
            } else {
                var3[var4] = -128;
            }
        }
        return var3;
    }
}
