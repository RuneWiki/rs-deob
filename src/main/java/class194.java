import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class194 extends class369 {

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "Z")
    private boolean field2248 = false;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "Z")
    private boolean field2254;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[Lica;")
    private class219[] field2246;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "[B")
    public static byte[] field2249 = new byte[2048];

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "Z")
    public static boolean field2250;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "[I")
    public static int[] field2239;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
    public static final void method1176(byte arg0) {
        ++field2251;
        if (arg0 != 45) {
            method1179(false, -14);
        }
        class5 var1 = null;
        try {
            class88 var2 = class353.field4757.method2682("3", false, (byte) -16);
            while (~var2.field884 == -1) {
                class452.method2602(1L, (byte) -97);
            }
            if (~var2.field884 == -3) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class5) var2.field886;
            byte[] var3 = new byte[(int) var1.method36(false)];
            if (~var3.length != -1) {
                int var5;
                for (int var4 = 0; var3.length > var4; var4 += var5) {
                    var5 = var1.method41(var3, var4, var3.length - var4, arg0 ^ 31595);
                    if (~var5 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class115 var6 = new class115(var3);
                int var7 = var6.method620((byte) -27);
                if (~var7 < -121) {
                    throw new RuntimeException("Bad length");
                }
                var6.field1218 = var7 + 1;
                if (!var6.method635((byte) 39)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field1218 = 1;
                int var8 = var6.method620((byte) 101);
                if (~var8 < -4) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class705.field9907 = var6.method638(false);
                class136.field1497 = var6.method638(false);
                if (var8 >= 1) {
                    class680.field9593 = var6.method643((byte) -77);
                } else {
                    class680.field9593 = class112.field1186;
                }
                if (var8 >= 2) {
                    class452.field6474 = var6.method671(0);
                } else {
                    class452.field6474 = class658.field9243;
                }
                if (~var8 > -4) {
                    class73.field771 = class359.field4829;
                } else if (var6.method620((byte) -128) != 1) {
                    class73.field771 = null;
                } else {
                    class73.field771 = var6.method638(false);
                }
            } else {
                class705.field9907 = "";
                class136.field1497 = "";
            }
        } catch (Exception var10) {
            class136.field1497 = "";
            class705.field9907 = "";
        }
        try {
            if (var1 != null) {
                var1.method37(-1);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        int var2 = 20 % ((arg0 - 37) / 36);
        ++field2237;
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lwp;I)V")
    public static final void method1177(class452 arg0, int arg1) {
        ++field2242;
        if (~class676.field9399 == ~arg0.field6335) {
            if (class362.field4859.field2893 == null) {
                arg0.field6402 = 0;
                arg0.field6406 = 0;
            } else {
                arg0.field6473 = 150;
                arg0.field6422 = (int) (Math.sin((double) class678.field9539 / 40.0D) * 256.0D) & 2047;
                arg0.field6402 = class392.field5314;
                arg0.field6322 = 5;
                arg0.field6406 = class183.method1112(class362.field4859.field2893, false);
                arg0.field6378 = class362.field4859.field9487;
                arg0.field6433 = class362.field4859.field9502;
                arg0.field6341 = 0;
                arg0.field6470 = class362.field4859.field9503;
                class257 var2 = arg0.field6378 != -1 ? class265.field3301.method3043(arg0.field6378, -8191) : null;
                if (var2 != null) {
                    class579.method3274(var2, arg0.field6433, (byte) -106);
                }
            }
        } else if (arg1 >= -73) {
            method1182((byte) -115);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lmj;)V")
    public class194(class344 arg0) {
        super(arg0);
        if (arg0.field4613) {
            this.field2254 = ~arg0.field4612 > -4;
            int var2 = this.field2254 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (~var14 == -3) {
                                var15 = var12;
                            } else if (var14 == 3) {
                                var15 = -var12;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field2246 = new class219[3];
            this.field2246[0] = super.field5047.method1321(64, false, var4, (byte) 52);
            this.field2246[1] = super.field5047.method1321(64, false, var5, (byte) 52);
            this.field2246[2] = super.field5047.method1321(64, false, var3, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1178(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2255;
        int var8 = arg7 + -334;
        if (~var8 > -1) {
            var8 = 0;
        } else if (~var8 < -101) {
            var8 = 100;
        }
        int var9 = (-class124.field1389 + class176.field1963) * var8 / 100 + class124.field1389;
        int var10 = arg5 * var9 >> 8;
        int var11 = -arg4 + 16384 & 16383;
        int var12 = -arg6 + 16384 & 16383;
        if (arg1 != -62) {
            method1177((class452) null, 79);
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (~var11 != -1) {
            var14 = class435.field6134[var11] * -var10 >> 14;
            var15 = class435.field6135[var11] * var10 >> 14;
        }
        if (~var12 != -1) {
            var13 = class435.field6134[var12] * var15 >> 14;
            var15 = class435.field6135[var12] * var15 >> 14;
        }
        class485.field6986 = arg4;
        class516.field7360 = arg2 - var13;
        class689.field9698 = -var15 + arg3;
        class605.field8502 = 0;
        class505.field7273 = arg6;
        class44.field432 = -var14 + arg0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(ZI)V")
    public static final void method1179(boolean arg0, int arg1) {
        ++field2240;
        class530.method2975((byte) 116);
        if (class578.method3271(class421.field5601, true)) {
            ++class79.field808;
            if (arg1 <= class79.field808 || arg0) {
                class79.field808 = 0;
                if (!class163.field1818 && class99.field1061 != null) {
                    ++class445.field6269;
                    class653 var2 = class699.method3845((byte) 45, class39.field395, class494.field7149);
                    class568.method3220(var2, (byte) 109);
                    try {
                        class160.method869((byte) -124);
                    } catch (IOException var3) {
                        class163.field1818 = true;
                    }
                }
                class530.method2975((byte) 95);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
    public final void method5(int arg0, boolean arg1) {
        ++field2243;
        super.field5047.method1994(-30, class428.field6081, class250.field3133);
        if (arg0 != 382) {
            method1181((byte) 21);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
    public final void method3(byte arg0) {
        if (!this.field2248) {
            super.field5047.method1979(0, class304.field3769, (byte) -124);
        } else {
            super.field5047.method2015(1, -2);
            super.field5047.method1997(126, (class686) null);
            super.field5047.method1335(class158.field1768, (byte) -125);
            super.field5047.method2010(127);
            if (this.field2254) {
                super.field5047.method1994(-30, class250.field3133, class250.field3133);
                super.field5047.method2012((byte) -114, 0, class304.field3769);
                super.field5047.method1979(0, class304.field3769, (byte) -43);
            } else {
                super.field5047.method1994(-30, class250.field3133, class250.field3133);
                super.field5047.method2012((byte) -84, 0, class304.field3769);
                super.field5047.method2015(2, -2);
                super.field5047.method1994(-30, class250.field3133, class250.field3133);
                super.field5047.method2012((byte) -70, 0, class304.field3769);
                super.field5047.method2012((byte) -62, 1, class692.field9717);
                super.field5047.method1979(0, class304.field3769, (byte) -44);
                super.field5047.method1997(126, (class686) null);
            }
            super.field5047.method2015(0, -2);
            this.field2248 = false;
        }
        ++field2238;
        int var2 = -6 % ((54 - arg0) / 47);
        super.field5047.method1994(-30, class250.field3133, class250.field3133);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1180(byte arg0, byte[] arg1) {
        ++field2241;
        if (arg0 > -54) {
            field2250 = false;
        }
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class567.method3213(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
    public final void method10(boolean arg0, int arg1) {
        if (arg1 == -14330) {
            ++field2252;
            if (this.field2246 != null && arg0) {
                super.field5047.method2015(1, -2);
                super.field5047.method1335(class73.field764, (byte) -65);
                class537 var3 = super.field5047.method2044(74);
                var3.method20(1024);
                super.field5047.method1999(class36.field355, false);
                if (!this.field2254) {
                    super.field5047.method1994(-30, class250.field3133, class428.field6081);
                    super.field5047.method2012((byte) -41, 0, class692.field9717);
                    super.field5047.method2015(2, -2);
                    super.field5047.method1994(-30, class428.field6081, class644.field9099);
                    super.field5047.method2012((byte) -107, 0, class692.field9717);
                    super.field5047.method1328(1, false, true, true, class692.field9717);
                    super.field5047.method1979(0, class590.field8337, (byte) -56);
                    super.field5047.method1997(126, super.field5047.field4582);
                } else {
                    super.field5047.method1994(-30, class428.field6081, class644.field9099);
                    super.field5047.method1328(0, false, true, true, class304.field3769);
                    super.field5047.method1979(0, class590.field8337, (byte) -68);
                }
                super.field5047.method2015(0, -2);
                this.field2248 = true;
            } else {
                super.field5047.method1979(0, class590.field8337, (byte) -30);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(B)Z")
    public static final boolean method1181(byte arg0) {
        if (arg0 != 57) {
            field2250 = false;
        }
        ++field2245;
        return !class166.method908("jaclib", (byte) 113) ? false : class166.method908("hw3d", (byte) 73);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILlc;)V")
    public final void method9(byte arg0, int arg1, class686 arg2) {
        super.field5047.method1997(127, arg2);
        ++field2253;
        if (arg0 != -94) {
            this.field2254 = true;
        }
        super.field5047.method2004(arg1, 2);
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(B)V")
    public static void method1182(byte arg0) {
        field2249 = null;
        field2239 = null;
        if (arg0 > -43) {
            field2250 = false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V")
    public static final void method1183(boolean arg0) {
        ++field2247;
        if (class209.field2466 != -1) {
            int var1 = class108.field1166.method253(true);
            int var2 = class108.field1166.method252(7);
            if (!arg0) {
                class103 var3 = (class103) class156.field1744.method3434((byte) 2);
                if (var3 != null) {
                    var1 = var3.method194((byte) -106);
                    var2 = var3.method193((byte) -68);
                }
                class635.method3571(class209.field2466, var1, 0, class146.field1618, var2, 0, 0, 0, class338.field4244, (byte) 74);
                if (class677.field9478 != null) {
                    class154.method838(var2, var1, 3228);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public final void method7(int arg0, int arg1, int arg2) {
        if (arg1 == 8250) {
            ++field2244;
            if (this.field2248) {
                super.field5047.method2015(1, -2);
                super.field5047.method1997(127, this.field2246[arg0 - 1]);
                super.field5047.method2015(0, -2);
            }
        }
    }
}
