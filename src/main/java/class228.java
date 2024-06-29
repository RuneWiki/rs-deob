import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class228 extends class74 {

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "Z")
    private boolean field2846 = false;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "Z")
    private boolean field2840;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "[Loq;")
    private class660[] field2838;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "[F")
    public static float[] field2837 = new float[16384];

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "[F")
    public static float[] field2839 = new float[16384];

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIB)Lni;")
    public static final class687 method1362(int arg0, int arg1, int arg2, byte arg3) {
        ++field2844;
        class75 var4 = class270.field3423[arg1][arg0][arg2];
        if (var4 == null) {
            return null;
        } else {
            class687 var5 = null;
            if (arg3 != 23) {
                return null;
            } else {
                int var6 = -1;
                for (class138 var7 = var4.field1024; var7 != null; var7 = var7.field1789) {
                    class172 var8 = var7.field1786;
                    if (var8 instanceof class687) {
                        class687 var9 = (class687) var8;
                        int var10 = 256 * (-1 + var9.method2785(-1)) - -252;
                        int var11 = var9.field6461 - var10 >> 9;
                        int var12 = -var10 + var9.field6464 >> 9;
                        int var13 = var9.field6461 + var10 >> 9;
                        int var14 = var9.field6464 + var10 >> 9;
                        if (arg0 >= var11 && ~arg2 <= ~var12 && ~arg0 >= ~var13 && var14 >= arg2) {
                            int var15 = (var13 - -1 - arg0) * (var14 - -1 - arg2);
                            if (~var15 < ~var6) {
                                var6 = var15;
                                var5 = var9;
                            }
                        }
                    }
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static void method1363(int arg0) {
        field2837 = null;
        field2839 = null;
        if (arg0 != 36) {
            method1362(-31, -36, -7, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Z")
    public final boolean method346(int arg0) {
        if (arg0 != -16777216) {
            this.method340(-13, -75, (byte) -107);
        }
        ++field2845;
        return true;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
    public static final int method1364(int arg0, int arg1) {
        return class319.field4080 != null ? class319.field4080[arg0][arg1] & 255 : 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([Llo;II)V")
    public static final void method1365(class488[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class488 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field6455;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field6455 > (var7 & 1) + var6) {
                    class488 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method1365(arg0, arg1, var4 - 1);
            method1365(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V")
    public final void method347(int arg0, boolean arg1) {
        ++field2847;
        int var3 = -79 % ((52 - arg0) / 36);
        if (this.field2838 != null && arg1) {
            super.field1011.method2589(0, 1);
            super.field1011.method1677(class31.field444, 124);
            class691 var4 = super.field1011.method2562(111);
            var4.method911(1024);
            super.field1011.method2524(125, class8.field160);
            if (this.field2840) {
                super.field1011.method2550(class88.field1235, true, class538.field7226);
                super.field1011.method1676(false, class5.field119, 0, true, (byte) 62);
                super.field1011.method2561(0, class563.field7825, -18836);
            } else {
                super.field1011.method2550(class538.field7226, true, class112.field1466);
                super.field1011.method2602(0, 1, class141.field1830);
                super.field1011.method2589(0, 2);
                super.field1011.method2550(class88.field1235, true, class538.field7226);
                super.field1011.method2602(0, 1, class141.field1830);
                super.field1011.method1676(false, class141.field1830, 1, true, (byte) 35);
                super.field1011.method2561(0, class563.field7825, -18836);
                super.field1011.method2596(super.field1011.field6246, 0);
            }
            super.field1011.method2589(0, 0);
            this.field2846 = true;
        } else {
            super.field1011.method2561(0, class563.field7825, -18836);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZ)V")
    public final void method339(boolean arg0, boolean arg1) {
        ++field2842;
        if (arg0) {
            super.field1011.method2550(class112.field1466, arg0, class538.field7226);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILhfa;)V")
    public final void method341(int arg0, int arg1, class466 arg2) {
        super.field1011.method2596(arg2, 0);
        ++field2841;
        super.field1011.method2595(arg0, 0);
        if (arg1 <= 47) {
            this.method343(-15);
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
    public final void method343(int arg0) {
        ++field2836;
        if (arg0 == -19092) {
            if (this.field2846) {
                super.field1011.method2589(arg0 ^ -19092, 1);
                super.field1011.method2596((class466) null, 0);
                super.field1011.method1677(class102.field1383, 9);
                super.field1011.method2554((byte) -70);
                if (this.field2840) {
                    super.field1011.method2550(class112.field1466, true, class112.field1466);
                    super.field1011.method2602(0, 1, class5.field119);
                    super.field1011.method2561(0, class5.field119, -18836);
                } else {
                    super.field1011.method2550(class112.field1466, true, class112.field1466);
                    super.field1011.method2602(0, 1, class5.field119);
                    super.field1011.method2589(0, 2);
                    super.field1011.method2550(class112.field1466, true, class112.field1466);
                    super.field1011.method2602(0, 1, class5.field119);
                    super.field1011.method2602(1, 1, class141.field1830);
                    super.field1011.method2561(0, class5.field119, -18836);
                    super.field1011.method2596((class466) null, 0);
                }
                super.field1011.method2589(0, 0);
                this.field2846 = false;
            } else {
                super.field1011.method2561(0, class5.field119, arg0 + 256);
            }
            super.field1011.method2550(class112.field1466, true, class112.field1466);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)V")
    public final void method340(int arg0, int arg1, byte arg2) {
        if (this.field2846) {
            super.field1011.method2589(0, 1);
            super.field1011.method2596(this.field2838[arg0 + -1], 0);
            super.field1011.method2589(arg2 ^ 65, 0);
        }
        ++field2835;
        if (arg2 != 65) {
            this.method341(-128, 117, (class466) null);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Len;)V")
    public class228(class478 arg0) {
        super(arg0);
        if (arg0.field6247) {
            this.field2840 = arg0.field6298 < 3;
            int var2 = this.field2840 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (~var14 != -2) {
                            if (~var14 == -3) {
                                var15 = var13;
                            } else if (~var14 == -4) {
                                var15 = -var13;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = var12;
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
            this.field2838 = new class660[3];
            this.field2838[0] = super.field1011.method1696(false, true, 64, var4);
            this.field2838[1] = super.field1011.method1696(false, true, 64, var5);
            this.field2838[2] = super.field1011.method1696(false, true, 64, var3);
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field2839[var2] = (float) Math.sin((double) var2 * var0);
            field2837[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
