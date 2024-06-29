import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class243 extends class353 {

    @OriginalMember(owner = "client!es", name = "q", descriptor = "Z")
    private boolean field3223 = false;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "Z")
    private boolean field3226;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "[Lap;")
    private class447[] field3220;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "J")
    public static long field3227 = 0L;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field3221 = 2;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "[I")
    public static int[] field3229 = new int[500];

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lum;)V")
    public class243(class528 arg0) {
        super(arg0);
        if (arg0.field7721) {
            this.field3226 = arg0.field7685 < 3;
            int var2 = this.field3226 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (var14 != 2) {
                                if (~var14 != -4) {
                                    if (var14 != 4) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = -var12;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var13;
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
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field3220 = new class447[3];
            this.field3220[0] = super.field5242.method812(1, false, var4, 64);
            this.field3220[1] = super.field5242.method812(1, false, var5, 64);
            this.field3220[2] = super.field5242.method812(1, false, var3, 64);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILqda;I)V")
    public final void method484(int arg0, class689 arg1, int arg2) {
        super.field5242.method3011(-127, arg1);
        if (arg0 != 8056) {
            this.method486(13, true, 45);
        }
        ++field3222;
        super.field5242.method3037(arg2, true);
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)V")
    public static final void method1491(boolean arg0) {
        if (arg0) {
            class603.field8695 = class591.field8590;
            class178.field2480 = class383.field5753;
        } else {
            class603.field8695 = class39.field585;
            class178.field2480 = class262.field3404;
        }
        class555.field8157 = class603.field8695.length;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZI)V")
    public final void method486(int arg0, boolean arg1, int arg2) {
        ++field3231;
        if (this.field3223) {
            super.field5242.method3050(1, 0);
            super.field5242.method3011(-128, this.field3220[arg0 + -1]);
            super.field5242.method3050(0, 0);
        }
        if (arg1) {
            this.method486(-37, true, 77);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lac;Z)V")
    public static final void method1492(class659 arg0, boolean arg1) {
        arg0.field9407 = false;
        ++field3230;
        if (arg0.field9404 != null) {
            arg0.field9404.field3306 = 0;
        }
        class659 var2 = arg0.method531();
        if (!arg1) {
            field3227 = -7L;
        }
        while (var2 != null) {
            method1492(var2, true);
            var2 = arg0.method534();
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
    public final void method491(int arg0, boolean arg1) {
        ++field3224;
        if (this.field3220 != null && arg1) {
            super.field5242.method3050(1, 0);
            super.field5242.method765(class287.field3984, (byte) 84);
            class300 var3 = super.field5242.method3032(-30);
            var3.method886(1024);
            super.field5242.method3045(-122, class22.field404);
            if (!this.field3226) {
                super.field5242.method3013(class519.field7276, 60, class492.field6998);
                super.field5242.method3025(class11.field273, -1, 0);
                super.field5242.method3050(2, 0);
                super.field5242.method3013(class65.field1041, 70, class519.field7276);
                super.field5242.method3025(class11.field273, -1, 0);
                super.field5242.method768(true, false, class11.field273, 1, 3);
                super.field5242.method3019(0, 0, class443.field6428);
                super.field5242.method3011(-128, super.field5242.field7752);
            } else {
                super.field5242.method3013(class65.field1041, 87, class519.field7276);
                super.field5242.method768(true, false, class283.field3777, 0, 3);
                super.field5242.method3019(0, 0, class443.field6428);
            }
            super.field5242.method3050(0, 0);
            this.field3223 = true;
        } else {
            super.field5242.method3019(0, 0, class443.field6428);
        }
        if (arg0 >= -121) {
            this.field3226 = true;
        }
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
    public final void method490(int arg0) {
        if (arg0 == -2144900407) {
            if (this.field3223) {
                super.field5242.method3050(1, arg0 ^ -2144900407);
                super.field5242.method3011(-128, (class689) null);
                super.field5242.method765(class497.field7032, (byte) -108);
                super.field5242.method3003(arg0 ^ -2144900408);
                if (!this.field3226) {
                    super.field5242.method3013(class492.field6998, 111, class492.field6998);
                    super.field5242.method3025(class283.field3777, -1, 0);
                    super.field5242.method3050(2, 0);
                    super.field5242.method3013(class492.field6998, 57, class492.field6998);
                    super.field5242.method3025(class283.field3777, arg0 ^ 2144900406, 0);
                    super.field5242.method3025(class11.field273, -1, 1);
                    super.field5242.method3019(0, arg0 ^ -2144900407, class283.field3777);
                    super.field5242.method3011(-128, (class689) null);
                } else {
                    super.field5242.method3013(class492.field6998, 101, class492.field6998);
                    super.field5242.method3025(class283.field3777, -1, 0);
                    super.field5242.method3019(0, 0, class283.field3777);
                }
                super.field5242.method3050(0, 0);
                this.field3223 = false;
            } else {
                super.field5242.method3019(0, 0, class283.field3777);
            }
            ++field3225;
            super.field5242.method3013(class492.field6998, arg0 ^ -2144900468, class492.field6998);
        }
    }

    @OriginalMember(owner = "client!es", name = "g", descriptor = "(I)V")
    public static void method1493(int arg0) {
        field3229 = null;
        if (arg0 != 1024) {
            field3227 = -118L;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)Z")
    public final boolean method493(byte arg0) {
        if (arg0 > -20) {
            this.method485(-64, true);
        }
        ++field3228;
        return true;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(IZ)V")
    public final void method485(int arg0, boolean arg1) {
        super.field5242.method3013(class492.field6998, 63, class519.field7276);
        ++field3232;
        if (arg0 <= 1) {
            this.method493((byte) 104);
        }
    }
}
