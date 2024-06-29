import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class432 extends class446 {

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lai;")
    private class428 field6432;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lqv;")
    private class312 field6442;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lcm;")
    public static class515 field6426 = new class515(0, 0);

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field6437 = 1406;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "[I")
    public static int[] field6438 = new int[32];

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Ltm;")
    private class267 field6428;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method696(boolean arg0, byte arg1) {
        ++field6427;
        if (~super.field6642.field877 < -1) {
            float var3 = -0.5F / (float) super.field6642.field877;
            super.field6642.method392((byte) 106, 1);
            class433.field6452[2] = var3;
            class433.field6452[1] = 0.0F;
            class433.field6452[3] = super.field6642.field873 * var3 + 0.25F;
            class433.field6452[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class433.field6452, 0);
            OpenGL.glPopMatrix();
            super.field6642.method422(0.5F, (float) super.field6642.field877, false);
            super.field6642.method381((byte) 28, this.field6442);
            super.field6642.method392((byte) 106, 0);
        }
        this.field6428.method1702(-66, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
        if (arg1 != 42) {
            method2598(-52, -65, 107, -120, (byte) -82, 25);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V", line = 37)
    public final void method689(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            ++field6439;
            if (~(arg1 & 1) == -2) {
                if (!this.field6432.field6400) {
                    int var4 = super.field6642.field806 % 4000 * 16 / 4000;
                    super.field6642.method381((byte) 28, this.field6432.field6401[var4]);
                } else {
                    super.field6642.method381((byte) 28, this.field6432.field6403);
                    class433.field6452[2] = 0.0F;
                    class433.field6452[3] = (float) (super.field6642.field806 % 4000) / 4000.0F;
                    class433.field6452[1] = 0.0F;
                    class433.field6452[0] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class433.field6452, 0);
                }
            } else if (!this.field6432.field6400) {
                super.field6642.method381((byte) 28, this.field6432.field6401[0]);
            } else {
                super.field6642.method381((byte) 28, this.field6432.field6403);
                class433.field6452[1] = 0.0F;
                class433.field6452[3] = 0.0F;
                class433.field6452[2] = 0.0F;
                class433.field6452[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class433.field6452, 0);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILac;)V", line = 84)
    public final void method694(int arg0, int arg1, class381 arg2) {
        ++field6433;
        if (arg1 != 0) {
            this.field6428 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lig;B)V", line = 95)
    public static final void method2593(class163 arg0, byte arg1) {
        ++field6429;
        class358 var2 = (class358) class492.field7212.method1892(87);
        if (arg1 >= 46) {
            while (var2 != null) {
                if (var2.field5253 == arg0) {
                    if (var2.field5248 != null) {
                        class288.field4357.method2157(var2.field5248);
                        var2.field5248 = null;
                    }
                    var2.method1676(true);
                    return;
                }
                var2 = (class358) class492.field7212.method1893((byte) -2);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)[Llb;", line = 128)
    public static final class383[] method2594(int arg0) {
        ++field6434;
        int var1 = -96 / ((arg0 - -13) / 53);
        return new class383[] { class9.field137, class428.field6410, class436.field6492, class515.field7472, class490.field7190, class38.field557 };
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z", line = 138)
    public final boolean method691(byte arg0) {
        if (arg0 != -93) {
            return false;
        } else {
            ++field6440;
            return true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIII)V", line = 151)
    public static final void method2595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -73 / ((arg6 - 57) / 58);
        ++field6430;
        if (~arg2 <= -2 && ~arg4 <= -2 && class339.field5099 + -2 >= arg2 && ~(class484.field7129 + -2) <= ~arg4) {
            int var10 = arg3;
            if (arg3 < 3 && class304.method1941(arg4, arg2, 1)) {
                var10 = arg3 + 1;
            }
            if (!class186.field2990.method1783(-1, class133.field2236) && !class377.method2314(var10, class419.field6303, arg4, arg2, false)) {
                return;
            }
            if (class518.field7511 == null) {
                return;
            }
            class235.field3626.method2829(class262.field4006, class67.field1367[arg3], arg1, -115, arg2, arg3, arg4);
            if (~arg7 <= -1) {
                boolean var11 = class186.field2990.field2529;
                class186.field2990.field2529 = true;
                class235.field3626.method2837((byte) -98, arg4, arg0, class67.field1367[arg3], arg7, arg2, arg3, arg8, class262.field4006, arg5, var10);
                class186.field2990.field2529 = var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V", line = 195)
    public final void method688(int arg0) {
        ++field6443;
        this.field6428.method1702(-38, '\u0001');
        if (super.field6642.field877 > 0) {
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, (class381) null);
            super.field6642.method422(1.0F, 0.0F, false);
            super.field6642.method392((byte) 106, 0);
        }
        super.field6642.method426(8448, 8448, -24610);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        if (arg0 <= 5) {
            this.method689(24, -75, -64);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BZ)V", line = 223)
    public final void method695(byte arg0, boolean arg1) {
        if (arg0 != -33) {
            method2593((class163) null, (byte) -76);
        }
        super.field6642.method426(260, 8448, -24610);
        ++field6436;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V", line = 235)
    public static void method2596(int arg0) {
        field6438 = null;
        if (arg0 != 63357569) {
            field6435 = -18;
        }
        field6426 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 246)
    private final void method2597(byte arg0) {
        this.field6428 = new class267(super.field6642, 2);
        ++field6431;
        this.field6428.method1699((byte) 88, 0);
        super.field6642.method392((byte) 106, 1);
        super.field6642.method426(7681, 260, -24610);
        super.field6642.method412(0, 34168, 768, -86);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field6642.method392((byte) 106, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (arg0 > -81) {
            field6426 = null;
        }
        if (this.field6432.field6400) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field6428.method1700(2);
        this.field6428.method1699((byte) 88, 1);
        super.field6642.method392((byte) 106, 1);
        super.field6642.method426(8448, 8448, -24610);
        super.field6642.method412(0, 5890, 768, 93);
        OpenGL.glDisable(3168);
        super.field6642.method392((byte) 106, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field6432.field6400) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field6428.method1700(2);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lda;Lai;)V", line = 297)
    public class432(class44 arg0, class428 arg1) {
        super(arg0);
        this.field6432 = arg1;
        this.method2597((byte) -94);
        this.field6442 = new class312(super.field6642, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field6442.method1986(false, (byte) -107);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIBI)V", line = 319)
    public static final void method2598(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field6441;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg5 * arg5;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        if (arg4 > -56) {
            field6438 = null;
        }
        int var13 = (-var12 + 1) * var8 - -var10;
        int var14 = var9 - (var12 + -1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg1 + -1) * var15;
        class503.method3027(-arg5 + arg2, (byte) 127, arg2 + arg5, arg3, class316.field4797[arg0]);
        while (~var7 < -1) {
            if (~var13 > -1) {
                while (~var13 > -1) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    ++var6;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                ++var6;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            --var7;
            int var21 = arg0 - var7;
            int var22 = arg0 + var7;
            int var23 = arg2 + var6;
            int var24 = -var6 + arg2;
            class503.method3027(var24, (byte) 127, var23, arg3, class316.field4797[var21]);
            class503.method3027(var24, (byte) 127, var23, arg3, class316.field4797[var22]);
        }
    }
}
