import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class637 extends class555 {

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "Z")
    private boolean field8810 = false;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Z")
    private boolean field8798;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "[Ljn;")
    private class530[] field8804;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lf;")
    public static class532 field8801;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Z")
    public static boolean field8806;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method117(boolean arg0, int arg1) {
        if (arg1 != -13443) {
            field8806 = false;
        }
        super.field7580.method3672((byte) -100, class298.field3941, class274.field3642);
        ++field8803;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)Llr;", line = 17)
    public static final class277 method3525(boolean arg0) {
        ++field8797;
        if (!arg0) {
            field8806 = true;
        }
        return ~class547.field7487 > ~class159.field2279.length ? class159.field2279[class547.field7487++] : null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lqq;)V", line = 32)
    public class637(class651 arg0) {
        super(arg0);
        if (arg0.field9205) {
            this.field8798 = arg0.field9217 < 3;
            int var2 = this.field8798 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (~var14 == -2) {
                            var15 = var12;
                        } else if (~var14 != -3) {
                            if (~var14 != -4) {
                                if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var13;
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
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
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
            this.field8804 = new class530[3];
            this.field8804[0] = super.field7580.method2009((byte) 55, 64, false, var4);
            this.field8804[1] = super.field7580.method2009((byte) 83, 64, false, var5);
            this.field8804[2] = super.field7580.method2009((byte) 45, 64, false, var3);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZ)V", line = 143)
    public final void method124(boolean arg0, boolean arg1) {
        if (this.field8804 != null && arg1) {
            super.field7580.method3635(true, 1);
            super.field7580.method2034((byte) -17, class446.field5908);
            class149 var3 = super.field7580.method3682(95);
            var3.method361(1024);
            super.field7580.method3616(class254.field3330, !arg0);
            if (this.field8798) {
                super.field7580.method3672((byte) -84, class298.field3941, class297.field3927);
                super.field7580.method2011(0, class630.field8719, 12080, false, true);
                super.field7580.method3666(0, class502.field6912, (byte) -83);
            } else {
                super.field7580.method3672((byte) -125, class274.field3642, class298.field3941);
                super.field7580.method3624(class533.field7324, -115, 0);
                super.field7580.method3635(true, 2);
                super.field7580.method3672((byte) -70, class298.field3941, class297.field3927);
                super.field7580.method3624(class533.field7324, -113, 0);
                super.field7580.method2011(1, class533.field7324, 12080, false, true);
                super.field7580.method3666(0, class502.field6912, (byte) -83);
                super.field7580.method3613((byte) 105, super.field7580.field9185);
            }
            super.field7580.method3635(true, 0);
            this.field8810 = true;
        } else {
            super.field7580.method3666(0, class502.field6912, (byte) -83);
        }
        ++field8800;
        if (!arg0) {
            this.field8804 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lot;BI)V", line = 185)
    public final void method127(class222 arg0, byte arg1, int arg2) {
        super.field7580.method3613((byte) 114, arg0);
        if (arg1 > -93) {
            method3528(false);
        }
        ++field8802;
        super.field7580.method3676(arg2, (byte) -84);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V", line = 198)
    public final void method126(int arg0, int arg1, int arg2) {
        if (this.field8810) {
            super.field7580.method3635(true, 1);
            super.field7580.method3613((byte) 106, this.field8804[arg1 - 1]);
            super.field7580.method3635(true, 0);
        }
        if (arg0 >= 81) {
            ++field8808;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIII)V", line = 217)
    public static final void method3526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~arg0 >= ~class151.field2071 && class6.field66 <= arg2) {
            boolean var6;
            if (~class281.field3703 < ~arg5) {
                arg5 = class281.field3703;
                var6 = false;
            } else if (~class255.field3350 <= ~arg5) {
                var6 = true;
            } else {
                var6 = false;
                arg5 = class255.field3350;
            }
            boolean var7;
            if (~arg3 <= ~class281.field3703) {
                if (~arg3 < ~class255.field3350) {
                    arg3 = class255.field3350;
                    var7 = false;
                } else {
                    var7 = true;
                }
            } else {
                var7 = false;
                arg3 = class281.field3703;
            }
            if (class6.field66 <= arg0) {
                class285.method1691(arg3, class315.field4224[arg0++], -7, arg5, arg4);
            } else {
                arg0 = class6.field66;
            }
            if (~class151.field2071 > ~arg2) {
                arg2 = class151.field2071;
            } else {
                class285.method1691(arg3, class315.field4224[arg2--], -7, arg5, arg4);
            }
            if (var6 && var7) {
                for (int var8 = arg0; ~var8 >= ~arg2; ++var8) {
                    int[] var9 = class315.field4224[var8];
                    var9[arg5] = var9[arg3] = arg4;
                }
            } else if (var6) {
                for (int var10 = arg0; arg2 >= var10; ++var10) {
                    class315.field4224[var10][arg5] = arg4;
                }
            } else if (var7) {
                for (int var11 = arg0; arg2 >= var11; ++var11) {
                    class315.field4224[var11][arg3] = arg4;
                }
            }
        }
        if (arg1 <= 35) {
            method3528(false);
        }
        ++field8809;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I", line = 324)
    public static final int method3527(int arg0, int arg1) {
        ++field8796;
        int var2 = 98 / ((-9 - arg0) / 54);
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(Z)V", line = 334)
    public static void method3528(boolean arg0) {
        field8801 = null;
        if (!arg0) {
            method3529(71, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[B)Z", line = 347)
    public static final boolean method3529(int arg0, byte[] arg1) {
        ++field8799;
        class157 var2 = new class157(arg1);
        int var3 = var2.method930(255);
        if (~var3 != -3) {
            return false;
        } else {
            boolean var4 = var2.method930(255) == 1;
            if (var4) {
                class314.method1838(var2, arg0 + -1879);
            }
            class535.method3006(var2, arg0 + arg0);
            return true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Z", line = 372)
    public final boolean method125(int arg0) {
        if (arg0 != -20112) {
            this.field8804 = null;
        }
        ++field8807;
        return true;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V", line = 383)
    public final void method121(byte arg0) {
        if (arg0 <= 45) {
            field8801 = null;
        }
        if (this.field8810) {
            super.field7580.method3635(true, 1);
            super.field7580.method3613((byte) 103, (class222) null);
            super.field7580.method2034((byte) -17, class583.field7982);
            super.field7580.method3668(0);
            if (!this.field8798) {
                super.field7580.method3672((byte) 67, class274.field3642, class274.field3642);
                super.field7580.method3624(class630.field8719, -112, 0);
                super.field7580.method3635(true, 2);
                super.field7580.method3672((byte) 36, class274.field3642, class274.field3642);
                super.field7580.method3624(class630.field8719, -117, 0);
                super.field7580.method3624(class533.field7324, -112, 1);
                super.field7580.method3666(0, class630.field8719, (byte) -83);
                super.field7580.method3613((byte) 100, (class222) null);
            } else {
                super.field7580.method3672((byte) 105, class274.field3642, class274.field3642);
                super.field7580.method3624(class630.field8719, -115, 0);
                super.field7580.method3666(0, class630.field8719, (byte) -83);
            }
            super.field7580.method3635(true, 0);
            this.field8810 = false;
        } else {
            super.field7580.method3666(0, class630.field8719, (byte) -83);
        }
        ++field8805;
        super.field7580.method3672((byte) 117, class274.field3642, class274.field3642);
    }
}
