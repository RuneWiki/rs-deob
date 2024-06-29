import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class193 extends class695 {

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    private int field2640 = -1;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    private int field2647 = -1;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "[Z")
    public static boolean[] field2644 = new boolean[5];

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "Z")
    public static boolean field2651 = false;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2639;

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lbi;II)V", line = 3)
    public class193(class483 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field2643 = arg2;
        super.field9655.method2850(-46, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field9670, arg2, arg2, 0, class212.method1362(6410, super.field9670), 5121, (byte[]) null, 0);
        }
        this.method3898(true, 73);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 21)
    public final void method633(int arg0) {
        ++field2645;
        OpenGL.glFramebufferTexture2DEXT(this.field2640, this.field2647, 3553, 0, 0);
        if (arg0 > -70) {
            this.method633(16);
        }
        this.field2640 = -1;
        this.field2647 = -1;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lbi;IIZ[[I)V", line = 34)
    public class193(class483 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field2643 = arg2;
        super.field9655.method2850(-44, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field9670, arg2, arg2, 0, 32993, super.field9655.field6837, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class336.method1932(arg2, 255, arg2, super.field9655.field6837, super.field9670, var7 + 34069, 32993, arg4[var7]);
            }
        }
        this.method3898(true, 107);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lbi;IIZ[[BI)V", line = 208)
    public class193(class483 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field2643 = arg2;
        super.field9655.method2850(70, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field9670, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method3898(true, 17);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([IILij;II[I)Lsd;", line = 71)
    public static final class96 method1286(int[] arg0, int arg1, class424 arg2, int arg3, int arg4, int[] arg5) {
        if (arg4 != 0) {
            return null;
        } else {
            ++field2642;
            if (!arg2.method1985(class522.field7319, (byte) 76, class285.field3589)) {
                int[] var6 = new int[arg1 * arg3];
                for (int var7 = 0; ~var7 > ~arg1; ++var7) {
                    int var8 = arg3 * var7 - -arg5[var7];
                    for (int var9 = 0; arg0[var7] > var9; ++var9) {
                        var6[var8++] = -16777216;
                    }
                }
                return new class96(arg2, arg3, arg1, var6);
            } else {
                byte[] var10 = new byte[arg1 * arg3];
                for (int var11 = 0; arg1 > var11; ++var11) {
                    int var12 = arg3 * var11 + arg5[var11];
                    for (int var13 = 0; arg0[var11] > var13; ++var13) {
                        var10[var12++] = -1;
                    }
                }
                return new class96(arg2, arg3, arg1, var10);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 133)
    public static final void method1287(int arg0, int arg1, int arg2, Class arg3) {
        class14 var4 = class197.field2689[arg0][arg1][arg2];
        if (var4 != null) {
            for (class621 var5 = var4.field289; var5 != null; var5 = var5.field8560) {
                class556 var6 = var5.field8559;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field7734 == arg1 && var6.field7746 == arg2) {
                    class322.method1890(var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIB)V", line = 160)
    public final void method1288(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -91) {
            this.method633(-12);
        }
        OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.field9663, arg3);
        ++field2650;
        this.field2640 = arg0;
        this.field2647 = arg1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIZ)Llk;", line = 174)
    public static final class589 method1289(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2641;
        class589 var4 = null;
        if (~arg2 == -1) {
            var4 = class514.method2994(-29488, class760.field10605, class567.field7966);
            ++class334.field4255;
        }
        if (~arg2 == -2) {
            ++class273.field3425;
            var4 = class514.method2994(-29488, class760.field10605, class156.field2134);
        }
        var4.field8251.method2565(arg3, class349.field4502.method207(82, 20541) ? 1 : 0);
        var4.field8251.method2611(class332.field4232 + arg0, (byte) -37);
        var4.field8251.method2630(102, arg1 - -class447.field5936);
        class526.field7347 = false;
        if (!arg3) {
            return null;
        } else {
            class755.field10539 = arg0;
            class366.field4727 = arg1;
            class169.method1180((byte) -15);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 227)
    public static final void method1290(boolean arg0) {
        ++field2646;
        if (class22.field415 == null) {
            class22.field415 = new int[65536];
            double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);
            int var3 = 0;
            if (!arg0) {
                method1287(60, -50, -57, (Class) null);
            }
            for (int var4 = 0; var4 < 512; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (var4 & 7) / 8.0F + 0.0625F;
                for (int var7 = 0; ~var7 > -129; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = (float) (-var13) + var12;
                    float var16 = (-var6 + 1.0F) * var8;
                    float var17 = (1.0F - var6 * var15) * var8;
                    float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                    if (var14 != 0) {
                        if (var14 == 1) {
                            var11 = var16;
                            var10 = var8;
                            var9 = var17;
                        } else if (var14 == 2) {
                            var9 = var16;
                            var11 = var18;
                            var10 = var8;
                        } else if (var14 == 3) {
                            var9 = var16;
                            var11 = var8;
                            var10 = var17;
                        } else if (~var14 != -5) {
                            if (var14 == 5) {
                                var9 = var8;
                                var11 = var17;
                                var10 = var16;
                            }
                        } else {
                            var10 = var16;
                            var11 = var8;
                            var9 = var18;
                        }
                    } else {
                        var11 = var16;
                        var9 = var8;
                        var10 = var18;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = -16777216 - -var24 + (var22 << 16) + (var23 << 8);
                    class22.field415[var3++] = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V", line = 350)
    public static final void method1291(int arg0) {
        for (class184 var1 = (class184) class330.field4215.method118(-30553); var1 != null; var1 = (class184) class330.field4215.method111(22548)) {
            if (var1.field2555 > 1) {
                var1.field2555 = 0;
                class263.field3317.method3077((byte) -47, ((class277) var1.field2556.field313.field8921).field3472, var1);
                var1.field2556.method113(arg0 ^ 53);
            }
        }
        ++field2648;
        class512.field7203 = 0;
        class159.field2181 = arg0;
        class343.field4334.method3668(0);
        class543.field7569.method1161(false);
        class330.field4215.method113(40);
        class303.method1805((byte) -89, class442.field5874);
    }

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "(I)V", line = 385)
    public static void method1292(int arg0) {
        field2644 = null;
        if (arg0 != 22652) {
            field2651 = true;
        }
        field2639 = null;
    }
}
