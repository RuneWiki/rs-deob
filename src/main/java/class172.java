import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class172 extends class532 {

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "Z")
    private boolean field2058 = false;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "Z")
    private boolean field2059;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "[Lmia;")
    private class69[] field2060;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "[I")
    public static int[] field2053 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "[[[Ldq;")
    public static class727[][][] field2057;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(B)Z")
    public final boolean method703(byte arg0) {
        ++field2052;
        if (arg0 < 126) {
            this.method702(true, (byte) -55);
        }
        return true;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)B")
    public static final byte method1167(int arg0, int arg1, int arg2) {
        if (arg0 >= -62) {
            field2053 = null;
        }
        ++field2056;
        if (arg1 != 9) {
            return 0;
        } else {
            return (byte) (~(1 & arg2) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBI)V")
    public final void method700(int arg0, byte arg1, int arg2) {
        ++field2061;
        if (this.field2058) {
            super.field7494.method2691(false, 1);
            super.field7494.method2643(-2, this.field2060[arg0 + -1]);
            super.field7494.method2691(false, 0);
        }
        if (arg1 != 94) {
            field2053 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)V")
    public final void method707(boolean arg0, int arg1) {
        if (arg1 == 30902) {
            ++field2063;
            super.field7494.method2716(class75.field1039, 122, class269.field3180);
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lwg;)V")
    public class172(class449 arg0) {
        super(arg0);
        if (arg0.field6240) {
            this.field2059 = ~arg0.field6272 > -4;
            int var2 = !this.field2059 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (var14 == 1) {
                                var15 = var12;
                            } else if (var14 != 2) {
                                if (~var14 != -4) {
                                    if (var14 == 4) {
                                        var15 = var11;
                                    } else {
                                        var15 = -var11;
                                    }
                                } else {
                                    var15 = -var13;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field2060 = new class69[3];
            this.field2060[0] = super.field7494.method46(false, 125, var4, 64);
            this.field2060[1] = super.field7494.method46(false, 126, var5, 64);
            this.field2060[2] = super.field7494.method46(false, -92, var3, 64);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZB)V")
    public final void method702(boolean arg0, byte arg1) {
        if (this.field2060 != null && arg0) {
            super.field7494.method2691(false, 1);
            super.field7494.method59(class790.field10873, arg1 ^ -239);
            class256 var3 = super.field7494.method2710(-116);
            var3.method138(1024);
            super.field7494.method2720(class444.field5955, (byte) 115);
            if (!this.field2059) {
                super.field7494.method2716(class269.field3180, 112, class75.field1039);
                super.field7494.method2694((byte) -49, 0, class616.field8291);
                super.field7494.method2691(false, 2);
                super.field7494.method2716(class75.field1039, 72, class555.field7726);
                super.field7494.method2694((byte) -49, 0, class616.field8291);
                super.field7494.method4(class616.field8291, true, (byte) 77, false, 1);
                super.field7494.method2703(class606.field8160, (byte) 122, 0);
                super.field7494.method2643(-2, super.field7494.field6257);
            } else {
                super.field7494.method2716(class75.field1039, arg1 + 84, class555.field7726);
                super.field7494.method4(class507.field7214, true, (byte) 108, false, 0);
                super.field7494.method2703(class606.field8160, (byte) -120, 0);
            }
            super.field7494.method2691(false, 0);
            this.field2058 = true;
        } else {
            super.field7494.method2703(class606.field8160, (byte) 60, 0);
        }
        ++field2062;
        if (arg1 != -10) {
            field2053 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
    public final void method699(boolean arg0) {
        if (!this.field2058) {
            super.field7494.method2703(class507.field7214, (byte) 118, 0);
        } else {
            super.field7494.method2691(false, 1);
            super.field7494.method2643(-2, (class315) null);
            super.field7494.method59(class204.field2443, 231);
            super.field7494.method2671(89);
            if (!this.field2059) {
                super.field7494.method2716(class269.field3180, 88, class269.field3180);
                super.field7494.method2694((byte) -49, 0, class507.field7214);
                super.field7494.method2691(false, 2);
                super.field7494.method2716(class269.field3180, 112, class269.field3180);
                super.field7494.method2694((byte) -49, 0, class507.field7214);
                super.field7494.method2694((byte) -49, 1, class616.field8291);
                super.field7494.method2703(class507.field7214, (byte) 74, 0);
                super.field7494.method2643(-2, (class315) null);
            } else {
                super.field7494.method2716(class269.field3180, 119, class269.field3180);
                super.field7494.method2694((byte) -49, 0, class507.field7214);
                super.field7494.method2703(class507.field7214, (byte) -103, 0);
            }
            super.field7494.method2691(arg0, 0);
            this.field2058 = false;
        }
        ++field2055;
        super.field7494.method2716(class269.field3180, 63, class269.field3180);
        if (arg0) {
            method1167(72, -63, -40);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZILgaa;)V")
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        if (!arg0) {
            this.method707(false, -80);
        }
        ++field2064;
        super.field7494.method2643(-2, arg2);
        super.field7494.method2649((byte) 126, arg1);
    }

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)V")
    public static void method1168(int arg0) {
        field2057 = null;
        if (arg0 == 30950) {
            field2053 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILjw;I)V")
    public static final void method1169(int arg0, int arg1, class581 arg2, int arg3) {
        ++field2054;
        if (class672.field9218) {
            int var4 = 0;
            class75 var5 = (class75) arg2.field7925.method1003((byte) 53);
            int var6 = 10 % ((-38 - arg0) / 62);
            while (var5 != null) {
                int var11 = class711.method4029((byte) 118, var5);
                if (var11 > var4) {
                    var4 = var11;
                }
                var5 = (class75) arg2.field7925.method1004(true);
            }
            var4 += 8;
            class711.field9978 = (!class35.field536 ? 22 : 26) + arg2.field7927 * 16;
            int var7 = arg2.field7927 * 16 - -21;
            int var8 = class705.field9916 + class119.field1505;
            if (~class701.field9880 > ~(var8 - -var4)) {
                var8 = -var4 + class705.field9916;
            }
            if (var8 < 0) {
                var8 = 0;
            }
            int var9 = !class35.field536 ? 31 : 33;
            int var10 = arg3 - var9 + 13;
            if (~class705.field9921 > ~(var10 - -var7)) {
                var10 = class705.field9921 - var7;
            }
            if (~var10 > -1) {
                var10 = 0;
            }
            class743.field10352 = var8;
            class189.field2275 = var4;
            class656.field9045 = var10;
            class288.field3466 = arg2;
        }
    }
}
