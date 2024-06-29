import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class613 extends class182 {

    @OriginalMember(owner = "client!wfa", name = "s", descriptor = "Lica;")
    private class215 field8505;

    @OriginalMember(owner = "client!wfa", name = "r", descriptor = "Log;")
    private class100 field8504;

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "Ltt;")
    public static class338 field8502 = new class338(59, -1);

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "Lcl;")
    private class75 field8497;

    @OriginalMember(owner = "client!wfa", name = "q", descriptor = "Ljava/lang/String;")
    public static String field8503;

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lag;Lica;)V", line = 3)
    public class613(class469 arg0, class215 arg1) {
        super(arg0);
        this.field8505 = arg1;
        this.method3394((byte) -91);
        this.field8504 = new class100(super.field2540, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field8504.method565(false, 10242);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILvfa;B)V", line = 17)
    public final void method83(int arg0, class262 arg1, byte arg2) {
        if (arg2 <= 87) {
            method3393(106);
        }
        ++field8493;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZI)V", line = 27)
    public final void method79(boolean arg0, int arg1) {
        super.field2540.method2669(8448, 38, 260);
        ++field8501;
        if (arg1 >= -21) {
            this.method3394((byte) 32);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZZ)V", line = 40)
    public final void method84(boolean arg0, boolean arg1) {
        ++field8495;
        if (!arg0) {
            method3392((class27[]) null, 80, -98);
        }
        if (super.field2540.field6509 > 0) {
            float var3 = -0.5F / (float) super.field2540.field6509;
            super.field2540.method2625(20296, 1);
            class306.field4087[1] = 0.0F;
            class306.field4087[3] = super.field2540.field6499 * var3 + 0.25F;
            class306.field4087[2] = var3;
            class306.field4087[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class306.field4087, 0);
            OpenGL.glPopMatrix();
            super.field2540.method2690((float) super.field2540.field6509, 0.5F, -1642);
            super.field2540.method2627(67, this.field8504);
            super.field2540.method2625(20296, 0);
        }
        this.field8497.method412('\u0000', -126);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "([Lir;II)V", line = 75)
    public static final void method3392(class27[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class27 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field383;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field383 > (var7 & 1) + var6) {
                    class27 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method3392(arg0, arg1, var4 - 1);
            method3392(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)Z", line = 116)
    public final boolean method77(byte arg0) {
        ++field8499;
        if (arg0 != -96) {
            field8502 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V", line = 133)
    public static void method3393(int arg0) {
        field8502 = null;
        int var1 = 66 % ((-49 - arg0) / 55);
        field8503 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "(B)V", line = 143)
    private final void method3394(byte arg0) {
        ++field8500;
        this.field8497 = new class75(super.field2540, 2);
        this.field8497.method414((byte) 126, 0);
        super.field2540.method2625(20296, 1);
        super.field2540.method2669(260, 28, 7681);
        super.field2540.method2636(0, 768, 34168, -104);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2540.method2625(20296, 0);
        int var2 = 16 % ((arg0 - -30) / 53);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field8505.field2829) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field8497.method415(false);
        this.field8497.method414((byte) 126, 1);
        super.field2540.method2625(20296, 1);
        super.field2540.method2669(8448, -128, 8448);
        super.field2540.method2636(0, 768, 5890, -91);
        OpenGL.glDisable(3168);
        super.field2540.method2625(20296, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field8505.field2829) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field8497.method415(false);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 187)
    public final void method82(int arg0) {
        ++field8494;
        this.field8497.method412('\u0001', -103);
        if (~super.field2540.field6509 < -1) {
            super.field2540.method2625(arg0 + -6517, 1);
            super.field2540.method2627(88, (class262) null);
            super.field2540.method2690(0.0F, 1.0F, arg0 ^ -28373);
            super.field2540.method2625(20296, 0);
        }
        super.field2540.method2669(8448, -120, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
        if (arg0 != 26813) {
            this.field8497 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)V", line = 212)
    public final void method81(int arg0, int arg1, int arg2) {
        if ((arg2 & 1) == 1) {
            if (!this.field8505.field2829) {
                int var4 = super.field2540.field6393 % 4000 * 16 / 4000;
                super.field2540.method2627(arg0 + 90, this.field8505.field2832[var4]);
            } else {
                super.field2540.method2627(arg0 + 69, this.field8505.field2831);
                class306.field4087[1] = 0.0F;
                class306.field4087[0] = 0.0F;
                class306.field4087[3] = (float) (super.field2540.field6393 % 4000) / 4000.0F;
                class306.field4087[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class306.field4087, 0);
            }
        } else if (this.field8505.field2829) {
            super.field2540.method2627(59, this.field8505.field2831);
            class306.field4087[0] = 0.0F;
            class306.field4087[3] = 0.0F;
            class306.field4087[2] = 0.0F;
            class306.field4087[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class306.field4087, 0);
        } else {
            super.field2540.method2627(34, this.field8505.field2832[0]);
        }
        if (arg0 == 2) {
            ++field8498;
        }
    }
}
