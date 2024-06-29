import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class359 extends class292 {

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "Z")
    private boolean field5346 = false;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "Z")
    private boolean field5350;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "[Lpu;")
    private class524[] field5353;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "[S")
    public static short[] field5352 = new short[] { 50, 45, 30, 9, 23, 4, 21, 8 };

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "Lsb;")
    public static class266 field5345 = new class266(71, 7);

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        ++field5348;
        if (arg0 < 27) {
            this.method604(-25);
        }
        if (!this.field5346) {
            super.field4393.method3224(0, (byte) -80, class435.field6296);
        } else {
            super.field4393.method3223(15, 1);
            super.field4393.method3266(-2, (class116) null);
            super.field4393.method2858((byte) 61, class277.field4153);
            super.field4393.method3220((byte) -63);
            if (!this.field5350) {
                super.field4393.method3232(class509.field7205, class509.field7205, (byte) -122);
                super.field4393.method3231(0, class435.field6296, (byte) -59);
                super.field4393.method3223(15, 2);
                super.field4393.method3232(class509.field7205, class509.field7205, (byte) -106);
                super.field4393.method3231(0, class435.field6296, (byte) -102);
                super.field4393.method3231(1, class661.field9521, (byte) -47);
                super.field4393.method3224(0, (byte) -80, class435.field6296);
                super.field4393.method3266(-2, (class116) null);
            } else {
                super.field4393.method3232(class509.field7205, class509.field7205, (byte) -117);
                super.field4393.method3231(0, class435.field6296, (byte) -114);
                super.field4393.method3224(0, (byte) -80, class435.field6296);
            }
            super.field4393.method3223(15, 0);
            this.field5346 = false;
        }
        super.field4393.method3232(class509.field7205, class509.field7205, (byte) -110);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        super.field4393.method3232(class509.field7205, class525.field7399, (byte) -108);
        if (arg1 != 54) {
            method2295((byte) -60);
        }
        ++field5349;
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(B)V")
    public static void method2295(byte arg0) {
        field5345 = null;
        if (arg0 != 82) {
            method2295((byte) -10);
        }
        field5352 = null;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        ++field5347;
        if (arg0 != 24561) {
            this.field5350 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        ++field5343;
        int var4 = -67 % ((-45 - arg1) / 59);
        if (this.field5346) {
            super.field4393.method3223(15, 1);
            super.field4393.method3266(-2, this.field5353[arg0 + -1]);
            super.field4393.method3223(15, 0);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        if (this.field5353 != null && arg0) {
            super.field4393.method3223(15, 1);
            super.field4393.method2858((byte) 61, class356.field5328);
            class391 var3 = super.field4393.method3240(true);
            var3.method893(1024);
            super.field4393.method3265((byte) -88, class537.field7515);
            if (!this.field5350) {
                super.field4393.method3232(class525.field7399, class509.field7205, (byte) -118);
                super.field4393.method3231(0, class661.field9521, (byte) -37);
                super.field4393.method3223(15, 2);
                super.field4393.method3232(class121.field2184, class525.field7399, (byte) -113);
                super.field4393.method3231(0, class661.field9521, (byte) -71);
                super.field4393.method2845(class661.field9521, arg1 + 200, true, false, 1);
                super.field4393.method3224(0, (byte) -80, class20.field843);
                super.field4393.method3266(-2, super.field4393.field8174);
            } else {
                super.field4393.method3232(class121.field2184, class525.field7399, (byte) -93);
                super.field4393.method2845(class435.field6296, 34, true, false, 0);
                super.field4393.method3224(0, (byte) -80, class20.field843);
            }
            super.field4393.method3223(15, 0);
            this.field5346 = true;
        } else {
            super.field4393.method3224(0, (byte) -80, class20.field843);
        }
        ++field5354;
        if (arg1 != -116) {
            this.method604(-66);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lcf;)V")
    public class359(class562 arg0) {
        super(arg0);
        if (arg0.field8122) {
            this.field5350 = ~arg0.field8189 > -4;
            int var2 = !this.field5350 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (var14 != 2) {
                                if (~var14 != -4) {
                                    if (~var14 == -5) {
                                        var15 = var11;
                                    } else {
                                        var15 = -var11;
                                    }
                                } else {
                                    var15 = -var12;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
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
            this.field5353 = new class524[3];
            this.field5353[0] = super.field4393.method2844(false, var4, 64, 127);
            this.field5353[1] = super.field4393.method2844(false, var5, 64, 127);
            this.field5353[2] = super.field4393.method2844(false, var3, 64, 125);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        ++field5344;
        if (arg0 <= 28) {
            this.method602(true, (byte) 19);
        }
        super.field4393.method3266(-2, arg2);
        super.field4393.method3195(-12, arg1);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method2296(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != -115) {
            method2295((byte) 33);
        }
        ++field5351;
        if (class225.method1539(arg9, 4)) {
            if (class91.field1668[arg9] != null) {
                client.method1815(class91.field1668[arg9], -1, arg3, arg4, arg0, arg2, arg6, arg5, arg8, arg7);
            } else {
                client.method1815(class156.field2667[arg9], -1, arg3, arg4, arg0, arg2, arg6, arg5, arg8, arg7);
            }
        }
    }
}
