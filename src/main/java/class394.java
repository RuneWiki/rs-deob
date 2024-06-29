import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class394 extends class193 {

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "Lpl;")
    private class462 field5296;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "Lsf;")
    private class364 field5291;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "Z")
    public static boolean field5285 = false;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "Lbu;")
    private class17 field5293;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
    public static final void method2264(byte arg0) {
        ++field5289;
        if (arg0 == -90) {
            class153 var1 = class75.method656(15, 255, 0);
            var1.method997((byte) 93);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public final void method92(byte arg0) {
        if (arg0 < -56) {
            this.field5293.method149('\u0001', 4864);
            ++field5284;
            if (~super.field2498.field5588 < -1) {
                super.field2498.method2321(1, 25322);
                super.field2498.method2322((class119) null, 14);
                super.field2498.method2332(96, 1.0F, 0.0F);
                super.field2498.method2321(0, 25322);
            }
            super.field2498.method2271(-2, 8448, 8448);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
    private final void method2265(int arg0) {
        this.field5293 = new class17(super.field2498, 2);
        ++field5286;
        this.field5293.method152((byte) 63, 0);
        super.field2498.method2321(1, 25322);
        super.field2498.method2271(-125, 7681, 260);
        super.field2498.method2338(34168, 0, false, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2498.method2321(0, 25322);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field5296.field6613) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field5293.method150((byte) 120);
        this.field5293.method152((byte) 63, 1);
        super.field2498.method2321(1, 25322);
        super.field2498.method2271(arg0 + -34084, 8448, 8448);
        super.field2498.method2338(5890, 0, false, 768);
        OpenGL.glDisable(3168);
        super.field2498.method2321(0, 25322);
        OpenGL.glTexEnvf(8960, arg0, 1.0F);
        if (this.field5296.field6613) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field5293.method150((byte) 114);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZZ)V")
    public final void method94(boolean arg0, boolean arg1) {
        ++field5283;
        if (~super.field2498.field5588 < -1) {
            float var3 = -0.5F / (float) super.field2498.field5588;
            super.field2498.method2321(1, 25322);
            class418.field5940[2] = var3;
            class418.field5940[3] = super.field2498.field5544 * var3 + 0.25F;
            class418.field5940[1] = 0.0F;
            class418.field5940[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class418.field5940, 0);
            OpenGL.glPopMatrix();
            super.field2498.method2332(115, 0.5F, (float) super.field2498.field5588);
            super.field2498.method2322(this.field5291, 14);
            super.field2498.method2321(0, 25322);
        }
        this.field5293.method149('\u0000', 4864);
        if (!arg0) {
            this.field5293 = null;
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)[Lni;")
    public static final class363[] method2266(byte arg0) {
        ++field5288;
        int var1 = -7 % ((-77 - arg0) / 46);
        return new class363[] { class324.field4107, class68.field884, class115.field1545, class45.field533, class128.field1703, class33.field419 };
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIZ)V")
    public final void method99(int arg0, int arg1, boolean arg2) {
        if (~(1 & arg0) == -2) {
            if (this.field5296.field6613) {
                super.field2498.method2322(this.field5296.field6609, 14);
                class418.field5940[0] = 0.0F;
                class418.field5940[3] = (float) (super.field2498.field5503 % 4000) / 4000.0F;
                class418.field5940[2] = 0.0F;
                class418.field5940[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class418.field5940, 0);
            } else {
                int var4 = super.field2498.field5503 % 4000 * 16 / 4000;
                super.field2498.method2322(this.field5296.field6612[var4], 14);
            }
        } else if (!this.field5296.field6613) {
            super.field2498.method2322(this.field5296.field6612[0], 14);
        } else {
            super.field2498.method2322(this.field5296.field6609, 14);
            class418.field5940[2] = 0.0F;
            class418.field5940[1] = 0.0F;
            class418.field5940[3] = 0.0F;
            class418.field5940[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class418.field5940, 0);
        }
        ++field5295;
        if (arg2) {
            field5287 = 117;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lsq;II)V")
    public final void method97(class119 arg0, int arg1, int arg2) {
        ++field5292;
        if (arg2 != 36) {
            this.method95(true, false);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2267(int arg0, int arg1, byte arg2) {
        if (arg2 < 0) {
            field5287 = -98;
        }
        ++field5282;
        return (arg0 & 32) != 0;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(ZZ)V")
    public final void method95(boolean arg0, boolean arg1) {
        ++field5290;
        if (!arg1) {
            method2266((byte) 105);
        }
        super.field2498.method2271(-119, 260, 8448);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILta;)V")
    public static final void method2268(int arg0, class143 arg1) {
        class520.field7520[arg0] = arg1;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)Z")
    public final boolean method93(boolean arg0) {
        ++field5294;
        return !arg0;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lug;Lpl;)V")
    public class394(class395 arg0, class462 arg1) {
        super(arg0);
        this.field5296 = arg1;
        this.method2265(34163);
        this.field5291 = new class364(super.field2498, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field5291.method2085(false, (byte) 119);
    }
}
