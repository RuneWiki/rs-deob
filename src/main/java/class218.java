import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class218 extends class155 {

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Z")
    private boolean field3218 = false;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Z")
    private boolean field3215;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "[Lpj;")
    private class158[] field3213;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Lvl;")
    public static class15 field3214 = new class15(56, 3);

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "Lad;")
    public static class448 field3219 = new class448();

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILfl;)V")
    public static final void method1507(int arg0, class771 arg1) {
        if (arg0 != 4096) {
            method1509(-24);
        }
        ++field3212;
        class570 var2 = (class570) class663.field9213.method337((long) arg1.field5288, 1);
        if (var2 != null) {
            if (var2.field8114 != null) {
                class456.field6213.method352(var2.field8114);
                var2.field8114 = null;
            }
            var2.method1207(100);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lbr;II)V")
    public final void method259(class416 arg0, int arg1, int arg2) {
        super.field2533.method3090(arg0, (byte) -55);
        if (arg1 >= -71) {
            this.method255(109);
        }
        ++field3207;
        super.field2533.method3113(-3334, arg2);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)Z")
    public final boolean method250(int arg0) {
        ++field3216;
        int var2 = 79 / ((-8 - arg0) / 41);
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lfca;I)Leja;")
    public static final class765 method1508(class93 arg0, int arg1) {
        ++field3208;
        String var2 = arg0.method752(0);
        if (arg1 != 15645) {
            return null;
        } else {
            class528 var3 = class405.method2421((byte) 127)[arg0.method793((byte) 84)];
            class494 var4 = class74.method638(-45)[arg0.method793((byte) 105)];
            int var5 = arg0.method774(-4);
            int var6 = arg0.method774(-4);
            int var7 = arg0.method793((byte) 90);
            int var8 = arg0.method793((byte) 43);
            int var9 = arg0.method793((byte) 6);
            int var10 = arg0.method763(85);
            int var11 = arg0.method763(74);
            int var12 = arg0.method773(3);
            int var13 = arg0.method773(3);
            int var14 = arg0.method773(arg1 ^ 15646);
            return new class765(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V")
    public final void method254(int arg0, int arg1, byte arg2) {
        ++field3217;
        if (arg2 == -92) {
            if (this.field3218) {
                super.field2533.method3114(1, false);
                super.field2533.method3090(this.field3213[arg0 + -1], (byte) -91);
                super.field2533.method3114(0, false);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZZ)V")
    public final void method257(boolean arg0, boolean arg1) {
        super.field2533.method3118(class371.field5051, class671.field9318, 0);
        if (arg0) {
            field3214 = null;
        }
        ++field3206;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)V")
    public final void method258(int arg0, boolean arg1) {
        ++field3211;
        if (this.field3213 != null && arg1) {
            super.field2533.method3114(1, false);
            super.field2533.method853(class5.field69, (byte) -22);
            class421 var3 = super.field2533.method3125(arg0 + -205);
            var3.method1884(1024);
            super.field2533.method3099(111, class758.field10447);
            if (!this.field3215) {
                super.field2533.method3118(class671.field9318, class371.field5051, arg0 ^ 205);
                super.field2533.method3143(class606.field8459, true, 0);
                super.field2533.method3114(2, false);
                super.field2533.method3118(class371.field5051, class639.field8801, 0);
                super.field2533.method3143(class606.field8459, true, 0);
                super.field2533.method841(class606.field8459, true, 1, false, 18680);
                super.field2533.method3168((byte) 86, 0, class620.field8626);
                super.field2533.method3090(super.field2533.field7686, (byte) -109);
            } else {
                super.field2533.method3118(class371.field5051, class639.field8801, arg0 ^ 205);
                super.field2533.method841(class327.field4459, true, 0, false, 18680);
                super.field2533.method3168((byte) 36, 0, class620.field8626);
            }
            super.field2533.method3114(0, false);
            this.field3218 = true;
        } else {
            super.field2533.method3168((byte) 69, 0, class620.field8626);
        }
        if (arg0 != 205) {
            this.field3215 = false;
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
    public static void method1509(int arg0) {
        if (arg0 <= -43) {
            field3214 = null;
            field3219 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILha;IILd;II)V")
    public static final void method1510(int arg0, class66 arg1, int arg2, int arg3, class162 arg4, int arg5, int arg6) {
        ++field3209;
        if (~class394.field5442 > -101) {
            class602.method3419(arg4, (byte) -68, arg1);
        }
        arg1.method512(arg5, arg0, arg5 - -arg2, arg0 - -arg3);
        if (arg6 != -15301) {
            field3219 = null;
        }
        if (~class394.field5442 > -101) {
            byte var7 = 20;
            int var8 = arg2 / 2 + arg5;
            int var9 = arg3 / 2 + -18 + arg0 + -var7;
            arg1.method537(arg5, arg0, arg2, arg3, -16777216, 0);
            arg1.method519(var8 - 152, var9, 304, 34, class753.field10391[class289.field3986].getRGB(), 0);
            arg1.method537(var8 + -150, var9 - -2, class394.field5442 * 3, 30, class236.field3393[class289.field3986].getRGB(), 0);
            class557.field7861.method613(var8, -1, class641.field8836.method3566((byte) 126, class464.field6309), class615.field8567[class289.field3986].getRGB(), true, var7 + var9);
        } else {
            int var10 = -((int) ((float) arg2 / class64.field891)) + class215.field3194;
            int var11 = (int) ((float) arg3 / class64.field891) + class211.field3161;
            int var12 = class215.field3194 - -((int) ((float) arg2 / class64.field891));
            int var13 = class211.field3161 - (int) ((float) arg3 / class64.field891);
            class220.field3223 = (int) ((float) (arg3 * 2) / class64.field891);
            class157.field2557 = class215.field3194 - (int) ((float) arg2 / class64.field891);
            class474.field6419 = (int) ((float) (arg2 * 2) / class64.field891);
            class121.field2199 = class211.field3161 - (int) ((float) arg3 / class64.field891);
            class64.method451(class64.field907 + var10, class64.field914 + var11, class64.field907 + var12, class64.field914 + var13, arg5, arg0, arg2 + arg5, arg0 + arg3 - -1);
            class64.method446(arg1);
            class645 var14 = class64.method442(arg1);
            class647.method3633(0, -107, 0, var14, arg1);
            if (~class439.field5965 < -1) {
                --class299.field4116;
                if (class299.field4116 == 0) {
                    class299.field4116 = 20;
                    --class439.field5965;
                }
            }
            if (class236.field3391) {
                int var15 = arg5 + -5 - -arg2;
                int var16 = arg0 - -arg3 - 8;
                class359.field4908.method605(var16, var15, "Fps:" + class698.field9637, -1, 16776960, (byte) -106);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (~var18 < -65537) {
                    var19 = 16711680;
                }
                class359.field4908.method605(var20, var15, "Mem:" + var18 + "k", -1, var19, (byte) -27);
                var16 = var20 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lsf;)V")
    public class218(class551 arg0) {
        super(arg0);
        if (arg0.field7745) {
            this.field3215 = ~arg0.field7754 > -4;
            int var2 = this.field3215 ? 48 : 127;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (var14 != 1) {
                                if (var14 == 2) {
                                    var15 = var12;
                                } else if (var14 == 3) {
                                    var15 = -var12;
                                } else if (~var14 == -5) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = var13;
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
            this.field3213 = new class158[3];
            this.field3213[0] = super.field2533.method847(64, (byte) -41, false, var4);
            this.field3213[1] = super.field2533.method847(64, (byte) -116, false, var5);
            this.field3213[2] = super.field2533.method847(64, (byte) -63, false, var3);
        }
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
    public final void method255(int arg0) {
        if (!this.field3218) {
            super.field2533.method3168((byte) 46, 0, class327.field4459);
        } else {
            super.field2533.method3114(1, false);
            super.field2533.method3090((class416) null, (byte) 103);
            super.field2533.method853(class110.field1712, (byte) -22);
            super.field2533.method3108(3);
            if (!this.field3215) {
                super.field2533.method3118(class671.field9318, class671.field9318, 0);
                super.field2533.method3143(class327.field4459, true, 0);
                super.field2533.method3114(2, false);
                super.field2533.method3118(class671.field9318, class671.field9318, 0);
                super.field2533.method3143(class327.field4459, true, 0);
                super.field2533.method3143(class606.field8459, true, 1);
                super.field2533.method3168((byte) 100, 0, class327.field4459);
                super.field2533.method3090((class416) null, (byte) 58);
            } else {
                super.field2533.method3118(class671.field9318, class671.field9318, 0);
                super.field2533.method3143(class327.field4459, true, 0);
                super.field2533.method3168((byte) 74, 0, class327.field4459);
            }
            super.field2533.method3114(0, false);
            this.field3218 = false;
        }
        ++field3210;
        super.field2533.method3118(class671.field9318, class671.field9318, 0);
        if (arg0 > -119) {
            this.method255(8);
        }
    }
}
