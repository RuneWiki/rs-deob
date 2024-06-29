import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class364 extends class719 {

    @OriginalMember(owner = "client!ija", name = "t", descriptor = "Z")
    private boolean field5258 = false;

    @OriginalMember(owner = "client!ija", name = "x", descriptor = "Z")
    private boolean field5262;

    @OriginalMember(owner = "client!ija", name = "y", descriptor = "[Lfaa;")
    private class165[] field5263;

    @OriginalMember(owner = "client!ija", name = "q", descriptor = "D")
    public static double field5255;

    @OriginalMember(owner = "client!ija", name = "o", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!ija", name = "p", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!ija", name = "r", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ija", name = "s", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ija", name = "u", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ija", name = "v", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ija", name = "w", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ija", name = "g", descriptor = "(I)V")
    public final void method220(int arg0) {
        if (arg0 != 23363) {
            this.field5258 = true;
        }
        ++field5256;
        if (this.field5258) {
            super.field9776.method3886(68, 1);
            super.field9776.method3882(arg0 + -23363, (class352) null);
            super.field9776.method2765(arg0 + -23424, class96.field1374);
            super.field9776.method3878((byte) 86);
            if (this.field5262) {
                super.field9776.method3911(22228, class291.field4152, class291.field4152);
                super.field9776.method3859(arg0 + -23239, 0, class790.field10851);
                super.field9776.method3867((byte) 18, class790.field10851, 0);
            } else {
                super.field9776.method3911(22228, class291.field4152, class291.field4152);
                super.field9776.method3859(117, 0, class790.field10851);
                super.field9776.method3886(arg0 ^ 23323, 2);
                super.field9776.method3911(22228, class291.field4152, class291.field4152);
                super.field9776.method3859(arg0 + -23244, 0, class790.field10851);
                super.field9776.method3859(120, 1, class417.field6010);
                super.field9776.method3867((byte) 18, class790.field10851, 0);
                super.field9776.method3882(0, (class352) null);
            }
            super.field9776.method3886(30, 0);
            this.field5258 = false;
        } else {
            super.field9776.method3867((byte) 18, class790.field10851, 0);
        }
        super.field9776.method3911(22228, class291.field4152, class291.field4152);
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(III)V")
    public final void method219(int arg0, int arg1, int arg2) {
        ++field5261;
        if (this.field5258) {
            super.field9776.method3886(59, 1);
            super.field9776.method3882(arg1, this.field5263[arg2 - 1]);
            super.field9776.method3886(71, 0);
        }
        if (arg1 != 0) {
            this.method225(false, true);
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(ZZ)V")
    public final void method225(boolean arg0, boolean arg1) {
        ++field5257;
        if (!arg0) {
            this.method219(-61, -39, -12);
        }
        super.field9776.method3911(22228, class117.field1574, class291.field4152);
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(IZ)V")
    public final void method222(int arg0, boolean arg1) {
        if (this.field5263 != null && arg1) {
            super.field9776.method3886(123, 1);
            super.field9776.method2765(-65, class16.field154);
            class532 var3 = super.field9776.method3877(3);
            var3.method825(1024);
            super.field9776.method3883((byte) 93, class480.field6741);
            if (this.field5262) {
                super.field9776.method3911(22228, class117.field1574, class175.field2307);
                super.field9776.method2812(0, false, class790.field10851, true, 0);
                super.field9776.method3867((byte) 18, class264.field3887, 0);
            } else {
                super.field9776.method3911(22228, class291.field4152, class117.field1574);
                super.field9776.method3859(121, 0, class417.field6010);
                super.field9776.method3886(110, 2);
                super.field9776.method3911(22228, class117.field1574, class175.field2307);
                super.field9776.method3859(120, 0, class417.field6010);
                super.field9776.method2812(1, false, class417.field6010, true, 0);
                super.field9776.method3867((byte) 18, class264.field3887, 0);
                super.field9776.method3882(0, super.field9776.field9539);
            }
            super.field9776.method3886(92, 0);
            this.field5258 = true;
        } else {
            super.field9776.method3867((byte) 18, class264.field3887, 0);
        }
        ++field5260;
        if (arg0 >= -126) {
            this.method222(64, true);
        }
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(Lee;)V")
    public class364(class703 arg0) {
        super(arg0);
        if (arg0.field9596) {
            this.field5262 = arg0.field9547 < 3;
            int var2 = !this.field5262 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (~var14 != -2) {
                            if (~var14 != -3) {
                                if (~var14 == -4) {
                                    var15 = -var13;
                                } else if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field5263 = new class165[3];
            this.field5263[0] = super.field9776.method2787(64, var4, false, (byte) -124);
            this.field5263[1] = super.field9776.method2787(64, var5, false, (byte) -100);
            this.field5263[2] = super.field9776.method2787(64, var3, false, (byte) -38);
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(IB)V")
    public static final void method2299(int arg0, byte arg1) {
        class535 var2 = class263.field3874;
        synchronized (class263.field3874) {
            if (arg1 != -95) {
                field5255 = 0.8048233984849443D;
            }
            class263.field3874.method3101(false, arg0);
        }
        ++field5253;
        class535 var3 = class465.field6593;
        synchronized (class465.field6593) {
            class465.field6593.method3101(false, arg0);
        }
    }

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "(B)Z")
    public final boolean method218(byte arg0) {
        if (arg0 < 16) {
            return false;
        } else {
            ++field5259;
            return true;
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(ZLb;I)V")
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        super.field9776.method3882(0, arg1);
        ++field5254;
        super.field9776.method3871(0, arg2);
        if (!arg0) {
            this.field5263 = null;
        }
    }
}
