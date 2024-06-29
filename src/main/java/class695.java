import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class695 extends class384 {

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "Lwt;")
    private class309 field9791;

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "Ljfa;")
    private class288 field9793;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "Z")
    private boolean field9786;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!sea", name = "n", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!sea", name = "o", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!sea", name = "r", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!sea", name = "u", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!sea", name = "v", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "Z")
    private boolean field9790;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lke;BI)V", line = 3)
    public final void method27(class596 arg0, byte arg1, int arg2) {
        ++field9792;
        if (arg1 == 123) {
            if (!this.field9790) {
                super.field5349.method2207((byte) -61, arg0);
                super.field5349.method2255(arg2, arg1 + 15695);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIZ)V", line = 23)
    public final void method32(int arg0, int arg1, boolean arg2) {
        ++field9789;
        if (arg2) {
            if (this.field9790) {
                int var4 = 1 << (arg0 & 3);
                float var5 = (float) (1 << ((61 & arg0) >> 3)) / 32.0F;
                int var6 = arg1 & 65535;
                float var7 = (float) ((255478 & arg1) >> 16) / 8.0F;
                long var8 = this.field9793.field3545;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field5349.field5152 * var4 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILat;IIII)V", line = 52)
    public static final void method3917(int arg0, class376 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9796;
        if (arg1.field4847 != -1 || arg1.field4840 != null) {
            if (arg0 < -119) {
                int var6 = 0;
                int var7 = arg1.field4838 * class654.field9334.field9861.method1500(93) >> 8;
                if (arg4 <= arg1.field4845) {
                    if (~arg4 > ~arg1.field4852) {
                        var6 += -arg4 + arg1.field4852;
                    }
                } else {
                    var6 += -arg1.field4845 + arg4;
                }
                if (arg2 > arg1.field4839) {
                    var6 += -arg1.field4839 + arg2;
                } else if (arg1.field4858 > arg2) {
                    var6 += -arg2 + arg1.field4858;
                }
                if (~arg1.field4832 != -1 && var6 + -256 <= arg1.field4832 && ~class654.field9334.field9861.method1500(33) != -1 && ~arg1.field4837 == ~arg5) {
                    var6 -= 256;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    int var8 = (-var6 + arg1.field4832) * var7 / arg1.field4832;
                    class90.field937.method1128(-1);
                    int var9 = 8192;
                    int var10 = (arg1.field4845 - -arg1.field4852) / 2 + -arg4;
                    int var11 = (arg1.field4858 + arg1.field4839) / 2 - arg2;
                    if (var10 != 0 || ~var11 != -1) {
                        int var12 = -class152.field1670 + -((int) (2607.5945876176133D * Math.atan2((double) var10, (double) var11))) + -4096 & 16383;
                        if (~var12 < -8193) {
                            var12 = -var12 + 16384;
                        }
                        int var13;
                        if (var6 > 0) {
                            if (var6 < 4096) {
                                var13 = var6 * 8192 / 4096 + 8192;
                            } else {
                                var13 = 16384;
                            }
                        } else {
                            var13 = 8192;
                        }
                        var9 = (-var13 + 16384 >> 1) + var12 * var13 / 8192;
                    }
                    if (arg1.field4859 != null) {
                        arg1.field4859.method665(var8);
                        arg1.field4859.method651(var9);
                    } else if (~arg1.field4847 <= -1) {
                        int var14 = arg1.field4842 == 256 && ~arg1.field4844 == -257 ? 256 : class625.method3585(arg1.field4842, arg1.field4844, 2);
                        if (!arg1.field4851) {
                            class273 var15 = class273.method1619(class296.field3674, arg1.field4847, 0);
                            if (var15 != null) {
                                class548 var16 = var15.method1618().method3221(class638.field9168);
                                class95 var17 = class95.method666(var16, var14, var8 << 6, var9);
                                var17.method656(-1);
                                class597.field8470.method1689(var17);
                                arg1.field4859 = var17;
                            }
                        } else {
                            if (arg1.field4835 == null) {
                                arg1.field4835 = class571.method3311(class88.field921, arg1.field4847);
                            }
                            if (arg1.field4835 != null) {
                                if (arg1.field4849 == null) {
                                    arg1.field4849 = arg1.field4835.method3321(new int[] { 22050 });
                                }
                                if (arg1.field4849 != null) {
                                    class95 var18 = class95.method666(arg1.field4849, var14, var8 << 6, var9);
                                    var18.method656(-1);
                                    class597.field8470.method1689(var18);
                                    arg1.field4859 = var18;
                                }
                            }
                        }
                    }
                    if (arg1.field4848 == null) {
                        if (arg1.field4840 != null && (arg1.field4834 -= arg3) <= 0) {
                            int var19 = ~arg1.field4842 == -257 && ~arg1.field4844 == -257 ? 256 : arg1.field4844 + (int) (Math.random() * (double) (-arg1.field4844 + arg1.field4842));
                            if (!arg1.field4829) {
                                int var20 = (int) (Math.random() * (double) arg1.field4840.length);
                                class273 var21 = class273.method1619(class296.field3674, arg1.field4840[var20], 0);
                                if (var21 != null) {
                                    class548 var22 = var21.method1618().method3221(class638.field9168);
                                    class95 var23 = class95.method666(var22, var19, var8 << 6, var9);
                                    var23.method656(0);
                                    class597.field8470.method1689(var23);
                                    arg1.field4834 = arg1.field4857 + (int) (Math.random() * (double) (-arg1.field4857 + arg1.field4841));
                                    arg1.field4848 = var23;
                                    return;
                                }
                                return;
                            }
                            if (arg1.field4836 == null) {
                                int var24 = (int) ((double) arg1.field4840.length * Math.random());
                                arg1.field4836 = class571.method3311(class88.field921, arg1.field4840[var24]);
                            }
                            if (arg1.field4836 != null) {
                                if (arg1.field4853 == null) {
                                    arg1.field4853 = arg1.field4836.method3321(new int[] { 22050 });
                                }
                                if (arg1.field4853 != null) {
                                    class95 var25 = class95.method666(arg1.field4853, var19, var8 << 6, var9);
                                    var25.method656(0);
                                    class597.field8470.method1689(var25);
                                    arg1.field4848 = var25;
                                    arg1.field4834 = (int) (Math.random() * (double) (arg1.field4841 - arg1.field4857)) + arg1.field4857;
                                    return;
                                }
                            }
                        }
                    } else {
                        arg1.field4848.method665(var8);
                        arg1.field4848.method651(var9);
                        if (arg1.field4848.method863(124)) {
                            return;
                        }
                        arg1.field4836 = null;
                        arg1.field4853 = null;
                        arg1.field4848 = null;
                    }
                } else {
                    if (arg1.field4859 != null) {
                        class597.field8470.method1690(arg1.field4859);
                        arg1.field4859 = null;
                        arg1.field4835 = null;
                        arg1.field4849 = null;
                    }
                    if (arg1.field4848 != null) {
                        class597.field8470.method1690(arg1.field4848);
                        arg1.field4848 = null;
                        arg1.field4853 = null;
                        arg1.field4836 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V", line = 320)
    public final void method31(byte arg0) {
        if (this.field9790) {
            super.field5349.method2217(1, 15);
            super.field5349.method2207((byte) -61, (class596) null);
            super.field5349.method2217(0, 25);
            super.field5349.method2207((byte) -61, (class596) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field9790 = false;
        }
        ++field9788;
        if (arg0 >= -18) {
            method3918(-99, -76, (class58) null, 10, 107, 27, -63, 58, -78, -66, (byte[][][]) null, 126, 99);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IILha;IIIIIII[[[BII)V", line = 340)
    public static final void method3918(int arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[][][] arg10, int arg11, int arg12) {
        ++field9787;
        if (arg7 == 255478) {
            if (~arg11 != -1 && arg8 != 0) {
                if (arg11 == 9) {
                    arg11 = 1;
                    arg9 = arg9 + 1 & 3;
                }
                if (~arg11 == -11) {
                    arg9 = arg9 + 3 & 3;
                    arg11 = 1;
                }
                if (~arg11 == -12) {
                    arg11 = 8;
                    arg9 = arg9 + 3 & 3;
                }
                arg2.method416(arg5, arg6, arg1, arg0, arg3, arg12, arg10[arg11 + -1][arg9], arg8, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lai;Loh;Lwt;)V", line = 373)
    public class695(class597 arg0, class404 arg1, class309 arg2) {
        super(arg0);
        this.field9791 = arg2;
        if (arg1 != null && arg0.field8507 && arg0.field8511) {
            class592 var4 = class123.method789(35633, arg0, arg1.method2471((byte) -89, "gl", "environment_mapped_water_v"), -125);
            class592 var5 = class123.method789(35632, arg0, arg1.method2471((byte) -113, "gl", "environment_mapped_water_f"), 75);
            this.field9793 = class237.method1400(arg0, new class592[] { var4, var5 }, -110);
            this.field9786 = this.field9793 != null && this.field9791.method1841(-15461);
        } else {
            this.field9786 = false;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZB)V", line = 394)
    public final void method30(boolean arg0, byte arg1) {
        ++field9785;
        if (arg1 < 78) {
            this.field9786 = true;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)V", line = 404)
    public final void method24(boolean arg0, int arg1) {
        ++field9795;
        class460 var3 = super.field5349.method2238(1);
        if (this.field9786 && var3 != null) {
            super.field5349.method2217(1, 120);
            super.field5349.method2207((byte) -61, var3);
            super.field5349.method2217(0, 70);
            super.field5349.method2207((byte) -61, this.field9791.field3839);
            long var4 = this.field9793.field3545;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), -super.field5349.field5076[0], -super.field5349.field5076[1], -super.field5349.field5076[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field5349.field5078, super.field5349.field5067, super.field5349.field5079, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), Math.abs(super.field5349.field5076[1]) * 928.0F + 96.0F);
            this.field9790 = true;
        }
        if (arg1 != -1) {
            this.method31((byte) -47);
        }
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)Z", line = 433)
    public final boolean method26(int arg0) {
        ++field9794;
        return arg0 != 13326 ? true : this.field9786;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)I", line = 449)
    public static int method3919(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
