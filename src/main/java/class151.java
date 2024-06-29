import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class151 extends class149 {

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
    private int field2172 = 4096;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    private int field2170 = 4096;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
    private int field2175 = 409;

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "[I")
    private int[] field2178 = new int[3];

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "I")
    private int field2176 = 4096;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "[Lrk;")
    public static class194[] field2174 = new class194[32768];

    @OriginalMember(owner = "client!iq", name = "S", descriptor = "Lui;")
    public static class375 field2180 = new class375("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!iq", name = "T", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(IZI)Z")
    public static final boolean method987(int arg0, boolean arg1, int arg2) {
        ++field2173;
        if (arg1) {
            return false;
        } else {
            return ~(262144 & arg2) != -1 | class81.method524(arg0, -115, arg2) || class170.method1196(arg2, 45056, arg0);
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
    public class151() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V")
    public static final void method988(int arg0) {
        ++field2179;
        int var1 = class96.field1399.method1738(arg0 + -97, class441.field6563);
        if (arg0 == var1) {
            class307.field4504 = null;
            class424.method2555(0, -76);
        } else if (~var1 != -2) {
            class430.method2580((byte) 13, (byte) (255 & class527.field7787 - 4));
            class424.method2555(2, -121);
        } else {
            class430.method2580((byte) 13, (byte) 0);
            class424.method2555(512, arg0 ^ -127);
            if (class129.field1816 != null) {
                class208.method1444(28307);
            }
        }
        class8.field123 = class195.field2770;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 != 35) {
            field2180 = null;
        }
        ++field2181;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            int var5 = arg2.method641(32455);
                            this.field2178[1] = class494.method2942(65280, var5) >> 4;
                            this.field2178[0] = class494.method2942(267386880, var5 << 4);
                            this.field2178[2] = class494.method2942(var5, 255) >> 12;
                        }
                    } else {
                        this.field2176 = arg2.method631(arg1 + 10459);
                    }
                } else {
                    this.field2172 = arg2.method631(10494);
                }
            } else {
                this.field2170 = arg2.method631(10494);
            }
        } else {
            this.field2175 = arg2.method631(10494);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIILqa;I)V")
    public static final void method989(int arg0, int arg1, int arg2, int arg3, class496 arg4, int arg5) {
        arg4.method1046(arg5, arg1, arg3 + arg5, arg1 + arg2);
        ++field2177;
        arg4.method2952(arg3, arg2, arg5, -16777216, (byte) -53, arg1);
        if (~class369.field5668 <= -101) {
            float var6 = (float) class135.field1968 / (float) class135.field1986;
            int var7 = arg3;
            int var8 = arg2;
            if (!(var6 < 1.0F)) {
                var7 = (int) ((float) arg2 / var6);
            } else {
                var8 = (int) ((float) arg3 * var6);
            }
            int var9 = (-var8 + arg2) / 2 + arg1;
            int var10 = (-var7 + arg3) / 2 + arg5;
            if (class233.field3304 == null || arg3 != class233.field3304.method220() || arg2 != class233.field3304.method214()) {
                class135.method889(class135.field1969, class135.field1974 + class135.field1968, class135.field1986 + class135.field1969, class135.field1974, var10, var9, var7 + var10, var8 + var9);
                class135.method897(arg4);
                class233.field3304 = arg4.method1134(var10, var9, var7, var8, false);
            }
            class233.field3304.method1332(var10, var9);
            int var11 = class288.field4294 * var7 / class135.field1986;
            int var12 = class520.field7712 * var8 / class135.field1968;
            int var13 = var10 - -(class302.field4451 * var7 / class135.field1986);
            int var14 = var9 - (-var8 + var12) + -(class407.field6153 * var8 / class135.field1968);
            int var15 = -1996554240;
            if (class393.field5983 == class259.field3610) {
                var15 = -1996488705;
            }
            arg4.method1112(var13, var14, var11, var12, var15, 1);
            arg4.method1125(var13, var14, var11, var12, var15, 0);
            if (class56.field756 > 0) {
                int var16;
                if (class480.field7013 > 50) {
                    var16 = (-class480.field7013 + 100) * 5;
                } else {
                    var16 = class480.field7013 * 5;
                }
                for (class5 var17 = (class5) class135.field1967.method1970(64); var17 != null; var17 = (class5) class135.field1967.method1960(24)) {
                    class24 var18 = class135.field1953.method356(arg0 + 20754, var17.field65);
                    if (class292.method1890((byte) -120, var18)) {
                        if (~class13.field207 != ~var17.field65) {
                            if (class80.field1072 != -1 && ~class80.field1072 == ~var18.field393) {
                                int var19 = var17.field69 * var7 / class135.field1986 + var10;
                                int var20 = var9 - -((-var17.field66 + class135.field1968) * var8 / class135.field1968);
                                arg4.method2952(4, 4, var19 + -2, 16776960 | var16 << 24, (byte) -53, var20 + -2);
                            }
                        } else {
                            int var21 = var17.field69 * var7 / class135.field1986 + var10;
                            int var22 = var9 - -((-var17.field66 + class135.field1968) * var8 / class135.field1968);
                            arg4.method2952(4, 4, var21 + -2, 16776960 | var16 << 24, (byte) -53, var22 + -2);
                        }
                    }
                }
            }
            if (arg0 != -20755) {
                method987(91, true, 76);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)[[I")
    public final int[][] method139(byte arg0, int arg1) {
        ++field2171;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (super.field2147.field6664) {
            int[][] var4 = this.method984((byte) 107, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class316.field4838 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2178[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field2175 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field2178[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field2175) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2178[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field2175 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2176 * var12 >> 12;
                            var9[var11] = this.field2172 * var14 >> 12;
                            var10[var11] = this.field2170 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg0 > -45) {
            method990(-47);
        }
        return var3;
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)V")
    public static void method990(int arg0) {
        int var1 = -12 % ((arg0 - 41) / 56);
        field2180 = null;
        field2174 = null;
    }
}
