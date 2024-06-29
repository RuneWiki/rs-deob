import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class421 extends class16 {

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "Lum;")
    private class479 field5609;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "Lmk;")
    private class52 field5601;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "Lbd;")
    public static class57 field5599 = new class57();

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field5604 = -1;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field5603 = 0;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "[I")
    public static int[] field5605 = new int[1];

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "Lgq;")
    private class470 field5594;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V", line = 3)
    public final void method48(byte arg0) {
        this.field5594.method2666('\u0001', (byte) 110);
        int var2 = -69 % ((-29 - arg0) / 51);
        ++field5607;
        if (~super.field141.field5991 < -1) {
            super.field141.method2380(1, (byte) -100);
            super.field141.method2388((byte) 82, (class412) null);
            super.field141.method2359(1.0F, 0.0F, -80);
            super.field141.method2380(0, (byte) -90);
        }
        super.field141.method2371(8448, 8448, -65);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V", line = 27)
    public static final void method2280(int arg0, int arg1) {
        for (class270 var2 = class464.field6451.method3232(-1); var2 != null; var2 = class464.field6451.method3236(-27646)) {
            if (~((long) arg1) == ~(var2.field3405 >> 48 & 65535L)) {
                var2.method1519((byte) 121);
            }
        }
        ++field5602;
        if (arg0 != 24918) {
            method2280(106, 106);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZB)V", line = 50)
    public final void method50(boolean arg0, byte arg1) {
        if (super.field141.field5991 > 0) {
            float var3 = -0.5F / (float) super.field141.field5991;
            super.field141.method2380(1, (byte) -112);
            class221.field2784[2] = var3;
            class221.field2784[3] = super.field141.field5997 * var3 + 0.25F;
            class221.field2784[1] = 0.0F;
            class221.field2784[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class221.field2784, 0);
            OpenGL.glPopMatrix();
            super.field141.method2359(0.5F, (float) super.field141.field5991, 116);
            super.field141.method2388((byte) -48, this.field5601);
            super.field141.method2380(0, (byte) -87);
        }
        ++field5593;
        this.field5594.method2666('\u0000', (byte) 110);
        OpenGL.glMatrixMode(5890);
        if (arg1 != 42) {
            method2283((byte) 53);
        }
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILuda;)V", line = 83)
    public final void method44(int arg0, int arg1, class412 arg2) {
        if (arg1 == -1) {
            ++field5610;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)Z", line = 93)
    public static final boolean method2281(int arg0, int arg1) {
        if (arg0 <= 6) {
            method2282(-90, 4, -27, 75, 47, -85, (byte) 56, 104);
        }
        ++field5595;
        return arg1 == 0 || ~arg1 == -5;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIBI)V", line = 104)
    public static final void method2282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field5600;
        int var8 = class512.method2932((byte) -46, arg2, class501.field7217, class58.field602);
        int var9 = class512.method2932((byte) -46, arg5, class501.field7217, class58.field602);
        int var10 = class512.method2932((byte) -46, arg7, class163.field1942, class326.field4246);
        int var11 = class512.method2932((byte) -46, arg0, class163.field1942, class326.field4246);
        int var12 = class512.method2932((byte) -46, arg2 + arg3, class501.field7217, class58.field602);
        int var13 = class512.method2932((byte) -46, -arg3 + arg5, class501.field7217, class58.field602);
        for (int var14 = var8; var14 < var12; ++var14) {
            class445.method2463(var10, 119, var11, arg1, class156.field1755[var14]);
        }
        for (int var15 = var9; var15 > var13; --var15) {
            class445.method2463(var10, 127, var11, arg1, class156.field1755[var15]);
        }
        int var16 = class512.method2932((byte) -46, arg7 - -arg3, class163.field1942, class326.field4246);
        int var17 = class512.method2932((byte) -46, -arg3 + arg0, class163.field1942, class326.field4246);
        if (arg6 > 93) {
            for (int var18 = var12; var18 <= var13; ++var18) {
                int[] var19 = class156.field1755[var18];
                class445.method2463(var10, 108, var16, arg1, var19);
                class445.method2463(var16, 111, var17, arg4, var19);
                class445.method2463(var17, 115, var11, arg1, var19);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(B)I", line = 157)
    public static final int method2283(byte arg0) {
        ++field5608;
        if (arg0 >= -6) {
            method2280(105, -70);
        }
        return 46;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lap;Lum;)V", line = 168)
    public class421(class435 arg0, class479 arg1) {
        super(arg0);
        this.field5609 = arg1;
        this.method2284(false);
        this.field5601 = new class52(super.field141, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field5601.method263(false, 3);
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V", line = 182)
    private final void method2284(boolean arg0) {
        this.field5594 = new class470(super.field141, 2);
        ++field5598;
        this.field5594.method2667(0, -30923);
        super.field141.method2380(1, (byte) -89);
        super.field141.method2371(7681, 260, -120);
        super.field141.method2372(0, arg0, 768, 34168);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field141.method2380(0, (byte) -99);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field5609.field7036) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field5594.method2668(1);
        this.field5594.method2667(1, -30923);
        super.field141.method2380(1, (byte) -74);
        super.field141.method2371(8448, 8448, -109);
        super.field141.method2372(0, false, 768, 5890);
        OpenGL.glDisable(3168);
        super.field141.method2380(0, (byte) -69);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field5609.field7036) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field5594.method2668(1);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIZ)V", line = 228)
    public final void method42(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            ++field5597;
            if ((1 & arg0) != 1) {
                if (!this.field5609.field7036) {
                    super.field141.method2388((byte) 112, this.field5609.field7034[0]);
                } else {
                    super.field141.method2388((byte) 97, this.field5609.field7033);
                    class221.field2784[3] = 0.0F;
                    class221.field2784[1] = 0.0F;
                    class221.field2784[2] = 0.0F;
                    class221.field2784[0] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class221.field2784, 0);
                }
            } else if (this.field5609.field7036) {
                super.field141.method2388((byte) -121, this.field5609.field7033);
                class221.field2784[0] = 0.0F;
                class221.field2784[1] = 0.0F;
                class221.field2784[3] = (float) (super.field141.field5926 % 4000) / 4000.0F;
                class221.field2784[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class221.field2784, 0);
            } else {
                int var4 = super.field141.field5926 % 4000 * 16 / 4000;
                super.field141.method2388((byte) 108, this.field5609.field7034[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BZ)V", line = 280)
    public final void method46(byte arg0, boolean arg1) {
        if (arg0 != -61) {
            this.method50(false, (byte) 66);
        }
        ++field5606;
        super.field141.method2371(260, 8448, -66);
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(B)V", line = 300)
    public static void method2285(byte arg0) {
        if (arg0 == 40) {
            field5605 = null;
            field5599 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)Z", line = 315)
    public final boolean method52(int arg0) {
        ++field5596;
        if (arg0 != 12733) {
            method2282(54, -1, 82, 125, 99, 113, (byte) -121, -20);
        }
        return true;
    }
}
