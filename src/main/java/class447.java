import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class447 extends class11 {

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "Lme;")
    private class168 field6679;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "Lut;")
    private class107 field6680;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "Lub;")
    private class19 field6678;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public final void method63(int arg0) {
        int var2 = 45 / ((arg0 - -61) / 40);
        ++field6677;
        this.field6678.method122('\u0001', (byte) 50);
        if (super.field95.field5424 > 0) {
            super.field95.method2269((byte) -105, 1);
            super.field95.method2295(-111, (class507) null);
            super.field95.method2280(1.0F, 0.0F, false);
            super.field95.method2269((byte) 100, 0);
        }
        super.field95.method2320(8448, 8448, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Z")
    public final boolean method68(byte arg0) {
        if (arg0 != 95) {
            this.method64(true, false);
        }
        ++field6676;
        return true;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZZ)V")
    public final void method64(boolean arg0, boolean arg1) {
        super.field95.method2320(8448, 260, 0);
        if (!arg0) {
            this.method64(true, false);
        }
        ++field6671;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB)V")
    public final void method62(int arg0, int arg1, byte arg2) {
        if (~(arg0 & 1) != -2) {
            if (!this.field6679.field2048) {
                super.field95.method2295(-58, this.field6679.field2054[0]);
            } else {
                super.field95.method2295(-61, this.field6679.field2057);
                class247.field3514[3] = 0.0F;
                class247.field3514[2] = 0.0F;
                class247.field3514[1] = 0.0F;
                class247.field3514[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class247.field3514, 0);
            }
        } else if (this.field6679.field2048) {
            super.field95.method2295(-120, this.field6679.field2057);
            class247.field3514[2] = 0.0F;
            class247.field3514[3] = (float) (super.field95.field5351 % 4000) / 4000.0F;
            class247.field3514[0] = 0.0F;
            class247.field3514[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class247.field3514, 0);
        } else {
            int var4 = super.field95.field5351 % 4000 * 16 / 4000;
            super.field95.method2295(-87, this.field6679.field2054[var4]);
        }
        if (arg2 <= 124) {
            this.method62(-99, -118, (byte) -76);
        }
        ++field6675;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lad;Lme;)V")
    public class447(class362 arg0, class168 arg1) {
        super(arg0);
        this.field6679 = arg1;
        this.method2779(3168);
        this.field6680 = new class107(super.field95, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field6680.method656(10497, false);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILpm;)V")
    public final void method65(int arg0, int arg1, class507 arg2) {
        ++field6672;
        if (arg1 != -1) {
            this.field6678 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
    private final void method2779(int arg0) {
        this.field6678 = new class19(super.field95, 2);
        ++field6673;
        this.field6678.method121((byte) -18, 0);
        super.field95.method2269((byte) 116, 1);
        super.field95.method2320(260, 7681, 0);
        super.field95.method2291(34168, 0, 768, (byte) -35);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(arg0);
        super.field95.method2269((byte) 118, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field6679.field2048) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field6678.method124(7);
        this.field6678.method121((byte) -18, 1);
        super.field95.method2269((byte) -109, 1);
        super.field95.method2320(8448, 8448, arg0 + -3168);
        super.field95.method2291(5890, 0, 768, (byte) -35);
        OpenGL.glDisable(3168);
        super.field95.method2269((byte) -104, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field6679.field2048) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field6678.method124(7);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZ)V")
    public final void method67(int arg0, boolean arg1) {
        if (super.field95.field5424 > 0) {
            float var3 = -0.5F / (float) super.field95.field5424;
            super.field95.method2269((byte) -107, 1);
            class247.field3514[0] = 0.0F;
            class247.field3514[3] = super.field95.field5471 * var3 + 0.25F;
            class247.field3514[1] = 0.0F;
            class247.field3514[2] = var3;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class247.field3514, 0);
            OpenGL.glPopMatrix();
            super.field95.method2280(0.5F, (float) super.field95.field5424, false);
            super.field95.method2295(-76, this.field6680);
            super.field95.method2269((byte) -99, 0);
        }
        ++field6674;
        this.field6678.method122('\u0000', (byte) 72);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
        if (arg0 <= 115) {
            this.field6680 = null;
        }
    }
}
