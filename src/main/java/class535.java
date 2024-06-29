import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class535 extends class337 {

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
    private int field7864 = -1;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    private int field7858 = -1;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public int field7859;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    public int field7867;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    public int field7869;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "Leda;")
    public static class116 field7863 = new class116(104, -1);

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "[I")
    public static int[] field7871 = new int[256];

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "[B")
    public static byte[] field7868;

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lkfa;IIII[BI)V", line = 7)
    public class535(class382 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field7859 = arg2;
        this.field7867 = arg3;
        this.field7869 = arg4;
        super.field4696.method2295((byte) 53, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field4684, 0, super.field4685, this.field7859, this.field7867, this.field7869, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2001(540800, true);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 24)
    public final void method1475(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field7858, this.field7864, super.field4684, 0, 0, 0);
        ++field7870;
        this.field7864 = -1;
        if (arg0 <= 49) {
            this.field7859 = -71;
        }
        this.field7858 = -1;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIII)V", line = 39)
    public static final void method3136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7865;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg3 * arg3;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        if (arg0 != -29447) {
            method3138((byte) -115);
        }
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        if (~arg1 <= ~class198.field3084 && arg1 <= class627.field8931) {
            int var20 = class367.method2203(class512.field7620, class94.field1398, arg3 + arg4, true);
            int var21 = class367.method2203(class512.field7620, class94.field1398, -arg3 + arg4, true);
            class223.method1484(class657.field9275[arg1], var20, arg0 + 29367, arg2, var21);
        }
        int var22 = (arg5 + -1) * var15;
        while (var7 > 0) {
            if (~var13 > -1) {
                while (~var13 > -1) {
                    var14 += var19;
                    var13 += var17;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                ++var6;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            --var7;
            var22 -= var15;
            int var23 = arg1 - var7;
            int var24 = arg1 - -var7;
            if (~var24 <= ~class198.field3084 && ~class627.field8931 <= ~var23) {
                int var25 = class367.method2203(class512.field7620, class94.field1398, arg4 + var6, true);
                int var26 = class367.method2203(class512.field7620, class94.field1398, -var6 + arg4, true);
                if (class198.field3084 <= var23) {
                    class223.method1484(class657.field9275[var23], var25, -79, arg2, var26);
                }
                if (~class627.field8931 <= ~var24) {
                    class223.method1484(class657.field9275[var24], var25, -126, arg2, var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V", line = 140)
    public static void method3137(byte arg0) {
        if (arg0 == 39) {
            field7868 = null;
            field7871 = null;
            field7863 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(B)V", line = 157)
    public static final void method3138(byte arg0) {
        if (~class230.field3411 <= -1) {
            long var1 = class254.method1619(true);
            class230.field3411 = (int) ((long) class230.field3411 - (-class221.field3308 + var1));
            if (~class230.field3411 >= -1) {
                class202.field3120 = class348.field4921.field920;
                class94.field1395 = class348.field4921.field905;
                class296.field4188 = class348.field4921.field908;
                class26.field362 = class348.field4921.field910;
                class686.field9739 = class348.field4921.field906;
                class230.field3411 = -1;
                class123.field2023 = class348.field4921.field911;
                class125.field2052 = class348.field4921.field916;
                class275.field3910 = class348.field4921.field922;
                class595.field8618 = class348.field4921.field907;
                class104.field1710 = class348.field4921.field915;
            } else {
                int var3 = (class230.field3411 << 8) / class434.field6252;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                float var6 = -var5 + 1.0F;
                class686.field9739 = (-16711936 & (16711935 & class371.field5141) * var3 + (16711935 & class348.field4921.field906) * var4) - -((65280 & class371.field5141) * var3 + (class348.field4921.field906 & 65280) * var4 & 16711680) >>> 8;
                class275.field3910 = (-class106.field1752 + class348.field4921.field922) * var6 + class106.field1752;
                class595.field8618 = (class348.field4921.field907 - class102.field1658) * var6 + class102.field1658;
                class26.field362 = (-class570.field8330 + class348.field4921.field910) * var6 + class570.field8330;
                class202.field3120 = class538.field7892 * var3 + class348.field4921.field920 * var4 >> 8;
                class94.field1395 = (class348.field4921.field905 - class464.field6644) * var6 + class464.field6644;
                class104.field1710 = (-class108.field1765 + class348.field4921.field915) * var6 + class108.field1765;
                class123.field2023 = (class348.field4921.field911 - class584.field8555) * var6 + class584.field8555;
                class296.field4188 = ((16711935 & class457.field6573) * var3 + (16711935 & class348.field4921.field908) * var4 & -16711936) + ((class457.field6573 & 65280) * var3 + (65280 & class348.field4921.field908) * var4 & 16711680) >>> 8;
                if (class248.field3610 != class348.field4921.field916) {
                    class125.field2052 = class506.field7522.method83(class248.field3610, class348.field4921.field916, var6, class125.field2052);
                }
            }
            class221.field3308 = var1;
        }
        if (arg0 <= 110) {
            method3136(36, 83, 63, -69, 115, 49);
        }
        ++field7860;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lfu;IILrca;Lr;B)Z", line = 219)
    public static final boolean method3139(class66 arg0, int arg1, int arg2, class30 arg3, class98 arg4, byte arg5) {
        ++field7862;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field450 != null) {
            var7 = (-class161.field2643 + arg3.field428 + arg0.field951) * (-class161.field2637 + class161.field2626) / (class161.field2634 - class161.field2643) + class161.field2637;
            var8 = -((arg0.field952 + arg3.field419 + -class161.field2623) * (-class161.field2622 + class161.field2642) / (-class161.field2623 + class161.field2638)) + class161.field2642;
            var9 = -((-class161.field2623 + arg0.field952 + arg3.field408) * (-class161.field2622 + class161.field2642) / (-class161.field2623 + class161.field2638)) + class161.field2642;
            var6 = (arg0.field951 - class161.field2643 + arg3.field438) * (-class161.field2637 + class161.field2626) / (-class161.field2643 + class161.field2634) + class161.field2637;
        }
        class257 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg5 >= -52) {
            field7868 = null;
        }
        if (arg3.field415 != -1) {
            if (arg0.field947 && arg3.field440 != -1) {
                var10 = arg3.method276(-11, true, arg4);
            } else {
                var10 = arg3.method276(-11, false, arg4);
            }
            if (var10 != null) {
                var11 = arg0.field945 - (var10.method11() + 1 >> 1);
                if (~var11 > ~var6) {
                    var6 = var11;
                }
                var12 = arg0.field945 - -(var10.method11() + 1 >> 1);
                var13 = arg0.field946 + -(1 + var10.method9() >> 1);
                if (~var7 > ~var12) {
                    var7 = var12;
                }
                var14 = arg0.field946 - -(var10.method9() - -1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class292 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg3.field432 != null) {
            var15 = class625.method3528(arg3.field447, 1);
            if (var15 != null) {
                var16 = class180.field2847.method2864((class257[]) null, class629.field8943, (int[]) null, arg3.field432, 0);
                int var23 = arg0.field946;
                if (var10 != null) {
                    var17 = var23 - ((var10.method9() >> 1) + var16 * var15.method1784());
                } else {
                    var17 = var23 - var15.method1787() * var16 / 2;
                }
                for (int var24 = 0; var24 < var16; ++var24) {
                    String var25 = class629.field8943[var24];
                    if (var16 + -1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1783(var25);
                    if (~var18 > ~var26) {
                        var18 = var26;
                    }
                }
                var19 = arg0.field945 - (var18 / 2 - arg1);
                if (~var19 > ~var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg0.field945 + arg1;
                if (~var20 < ~var7) {
                    var7 = var20;
                }
                var21 = var17 - -arg2;
                var22 = arg2 + (var17 - -(var15.method1784() * var16));
                if (~var21 > ~var8) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (~var7 <= ~class161.field2637 && ~var6 >= ~class161.field2626 && var9 >= class161.field2622 && var8 <= class161.field2642) {
            if (arg3.field450 != null) {
                int[] var27 = new int[arg3.field450.length];
                for (int var28 = 0; ~(var27.length / 2) < ~var28; ++var28) {
                    int var30 = arg3.field450[var28 * 2] + arg0.field951;
                    int var31 = arg3.field450[var28 * 2 + 1] + arg0.field952;
                    var27[var28 * 2] = class161.field2637 - -((-class161.field2643 + var30) * (-class161.field2637 + class161.field2626) / (-class161.field2643 + class161.field2634));
                    var27[var28 * 2 + 1] = -((-class161.field2623 + var31) * (-class161.field2622 + class161.field2642) / (-class161.field2623 + class161.field2638)) + class161.field2642;
                }
                class559.method3269(arg4, var27, arg3.field446);
                for (int var29 = 0; var29 < var27.length / 2 + -1; ++var29) {
                    arg4.method813(var27[var29 * 2 + 2], arg3.field443, var27[var29 * 2 - -1], 125, var27[(var29 + 1) * 2 - -1], var27[var29 * 2]);
                }
                arg4.method813(var27[0], arg3.field443, var27[var27.length + -1], 114, var27[1], var27[var27.length + -2]);
            }
            if (var10 != null) {
                if (class440.field6371 > 0 && (class277.field3924 != -1 && class277.field3924 == arg0.field954 || class530.field7820 != -1 && class530.field7820 == arg3.field444)) {
                    int var32;
                    if (~class106.field1751 < -51) {
                        var32 = (-class106.field1751 + 100) * 2;
                    } else {
                        var32 = class106.field1751 * 2;
                    }
                    int var33 = 16776960 | var32 << 24;
                    arg4.method815(arg0.field946, var33, (byte) -46, arg0.field945, var10.method12() / 2 + 7);
                    arg4.method815(arg0.field946, var33, (byte) -17, arg0.field945, var10.method12() / 2 + 5);
                    arg4.method815(arg0.field946, var33, (byte) -75, arg0.field945, 3 + var10.method12() / 2);
                    arg4.method815(arg0.field946, var33, (byte) -97, arg0.field945, 1 + var10.method12() / 2);
                    arg4.method815(arg0.field946, var33, (byte) -24, arg0.field945, var10.method12() / 2);
                }
                var10.method1638(arg0.field945 - (var10.method11() >> 1), arg0.field946 + -(var10.method9() >> 1));
            }
            if (arg3.field432 != null && var15 != null) {
                class515.method3055(arg0, var18, var16, arg3, arg4, var15, -1, var17);
            }
            if (~arg3.field415 != 0 || arg3.field432 != null) {
                class436 var34 = new class436(arg0);
                var34.field6273 = var11;
                var34.field6270 = var19;
                var34.field6275 = var20;
                var34.field6283 = var13;
                var34.field6274 = var14;
                var34.field6276 = var21;
                var34.field6272 = var22;
                var34.field6269 = var12;
                class521.field7684.method3904(var34, 0);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(B)V", line = 436)
    public static final void method3140(byte arg0) {
        class382.field5412 = null;
        class528.field7731 = null;
        ++field7857;
        class355.field4981 = null;
        class666.field9357 = null;
        class275.field3909 = null;
        class180.field2849 = false;
        if (arg0 != 3) {
            method3136(61, -5, 82, -22, 57, 5);
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lkfa;IIII)V", line = 457)
    public class535(class382 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7859 = arg2;
        this.field7869 = arg4;
        this.field7867 = arg3;
        super.field4696.method2295((byte) -106, this);
        OpenGL.glTexImage3Dub(super.field4684, 0, super.field4685, this.field7859, this.field7867, this.field7869, 0, class701.method3942(super.field4685, 81), 5121, (byte[]) null, 0);
        this.method2001(540800, true);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBIIIIII)V", line = 470)
    public final void method3141(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field4696.method2295((byte) 19, this);
        ++field7866;
        OpenGL.glCopyTexSubImage3D(super.field4684, 0, arg7, arg0, arg4, arg6, arg3, arg5, arg2);
        if (arg1 != 54) {
            this.method1475(97);
        }
        OpenGL.glFlush();
    }
}
