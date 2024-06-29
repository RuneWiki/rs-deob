import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class37 extends class45 {

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Lm;")
    private class127 field401;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "Lar;")
    private class479 field411;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "D")
    public static double field403 = -1.0D;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "[B")
    public static byte[] field419 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "Lbg;")
    public static class324 field407 = new class324(77, -2);

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "[I")
    public static int[] field420 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "Lct;")
    private class98 field412;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "[I")
    public static int[] field413;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILuu;I)I")
    public static final int method277(int arg0, class188 arg1, int arg2) {
        if (arg2 >= -104) {
            method288(-93, 38, -9, -68, -37, -18);
        }
        ++field405;
        if (!client.method1380(arg1).method1783(arg0, 1) && arg1.field2643 == null) {
            return -1;
        } else {
            return arg1.field2721 != null && arg1.field2721.length > arg0 ? arg1.field2721[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lfd;Lm;)V")
    public class37(class365 arg0, class127 arg1) {
        super(arg0);
        this.field401 = arg1;
        this.method278(-11540);
        this.field411 = new class479(super.field506, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field411.method2892((byte) 35, false);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    private final void method278(int arg0) {
        ++field415;
        this.field412 = new class98(super.field506, 2);
        this.field412.method833(0, true);
        super.field506.method2219(1, -125);
        super.field506.method2195(7681, 260, true);
        super.field506.method2228((byte) 79, 0, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field506.method2219(0, -124);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field401.field1845) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field412.method834((byte) 39);
        this.field412.method833(1, true);
        super.field506.method2219(1, -128);
        super.field506.method2195(8448, 8448, true);
        super.field506.method2228((byte) 79, 0, 768, 5890);
        if (arg0 == -11540) {
            OpenGL.glDisable(3168);
            super.field506.method2219(0, -121);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field401.field1845) {
                OpenGL.glDisable(3170);
                OpenGL.glDisable(3171);
            }
            this.field412.method834((byte) 39);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZB)V")
    public final void method279(boolean arg0, byte arg1) {
        super.field506.method2195(260, 8448, true);
        ++field410;
        if (arg1 < 115) {
            field413 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
    public final boolean method280(boolean arg0) {
        if (!arg0) {
            this.method287(74);
        }
        ++field417;
        return true;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V")
    public final void method281(int arg0, boolean arg1) {
        if (~super.field506.field5428 < -1) {
            float var3 = -0.5F / (float) super.field506.field5428;
            super.field506.method2219(1, -120);
            class375.field5557[1] = 0.0F;
            class375.field5557[0] = 0.0F;
            class375.field5557[2] = var3;
            class375.field5557[3] = super.field506.field5348 * var3 + 0.25F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class375.field5557, 0);
            OpenGL.glPopMatrix();
            super.field506.method2226(0.5F, (float) super.field506.field5428, 27060);
            super.field506.method2188((byte) 78, this.field411);
            super.field506.method2219(0, arg0 ^ -125);
        }
        ++field409;
        this.field412.method832('\u0000', -1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        if (arg0 == 0) {
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
    public static void method282(int arg0) {
        if (arg0 <= 97) {
            method283(-107, 9, -47);
        }
        field407 = null;
        field419 = null;
        field413 = null;
        field420 = null;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)Z")
    public static final boolean method283(int arg0, int arg1, int arg2) {
        int var3 = 87 / ((-70 - arg1) / 51);
        ++field402;
        return ~(arg2 & 544) == -545 | (24 & arg2) != 0;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
    public static final void method284(byte arg0) {
        class104.method869(22050, class478.field7044.field3317, false, 2);
        ++field408;
        class319.field4516 = new class467();
        class319.field4516.method2823(-25296, 128, 9);
        class305.field4338 = class434.method2631(0, 2, class498.field7404, 22050, class148.field2081);
        class305.field4338.method1653(class319.field4516, (byte) -15);
        class179.method1262(class283.field4117, class319.field4516, class129.field1865, class233.field3429, (byte) -115);
        class440.field6544 = class434.method2631(1, 2, class498.field7404, 2048, class148.field2081);
        class273.field4030 = new class177();
        class440.field6544.method1653(class273.field4030, (byte) -15);
        class287.field4139 = new class179(22050, class405.field6017);
        class244.field3586 = class512.field7556.method2358("scape main", (byte) -111);
        int var1 = 49 / ((arg0 - -57) / 33);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILkj;Z)V")
    public final void method285(int arg0, class396 arg1, boolean arg2) {
        if (arg2) {
            ++field416;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V")
    public final void method286(int arg0, int arg1, int arg2) {
        ++field406;
        if ((1 & arg0) == 1) {
            if (!this.field401.field1845) {
                int var4 = super.field506.field5306 % 4000 * 16 / 4000;
                super.field506.method2188((byte) 78, this.field401.field1848[var4]);
            } else {
                super.field506.method2188((byte) 78, this.field401.field1850);
                class375.field5557[3] = (float) (super.field506.field5306 % 4000) / 4000.0F;
                class375.field5557[1] = 0.0F;
                class375.field5557[2] = 0.0F;
                class375.field5557[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class375.field5557, 0);
            }
        } else if (this.field401.field1845) {
            super.field506.method2188((byte) 78, this.field401.field1850);
            class375.field5557[0] = 0.0F;
            class375.field5557[3] = 0.0F;
            class375.field5557[2] = 0.0F;
            class375.field5557[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class375.field5557, 0);
        } else {
            super.field506.method2188((byte) 78, this.field401.field1848[0]);
        }
        if (arg1 <= 76) {
            method277(30, (class188) null, -115);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public final void method287(int arg0) {
        this.field412.method832('\u0001', -1);
        ++field414;
        if (super.field506.field5428 > arg0) {
            super.field506.method2219(1, -127);
            super.field506.method2188((byte) 78, (class396) null);
            super.field506.method2226(1.0F, 0.0F, 27060);
            super.field506.method2219(0, -125);
        }
        super.field506.method2195(8448, 8448, true);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIII)V")
    public static final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field418;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg1 * arg1;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (-var12 + 1) * var8 - -var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        class531.method3136(-arg1 + arg5, -101, arg3, arg5 - -arg1, class141.field1996[arg0]);
        int var20 = (arg4 + -1) * var15;
        if (arg2 != -484166047) {
            field420 = null;
        }
        while (~var7 < -1) {
            if (~var13 > -1) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    ++var6;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                ++var6;
            }
            var13 += -var20;
            var14 += -var18;
            --var7;
            var20 -= var15;
            var18 -= var15;
            int var21 = -var7 + arg0;
            int var22 = arg0 + var7;
            int var23 = arg5 + var6;
            int var24 = -var6 + arg5;
            class531.method3136(var24, arg2 + 484166167, arg3, var23, class141.field1996[var21]);
            class531.method3136(var24, 126, arg3, var23, class141.field1996[var22]);
        }
    }
}
