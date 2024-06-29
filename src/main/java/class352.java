import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class352 extends class125 {

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Lqf;")
    private class482 field4693;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lgt;")
    private class318 field4692;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field4700 = -1;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field4701 = 0;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lpb;")
    private class468 field4694;

    static {
        new class305("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        new class305((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(ZI)V", line = 6)
    public final void method665(boolean arg0, int arg1) {
        ++field4691;
        super.field1617.method2269(260, 8960, 8448);
        if (arg1 <= 92) {
            this.method666(-73);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)I", line = 18)
    public static final int method2062(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4690;
        int var5 = arg1 & 15;
        if (arg3 != 10673) {
            field4701 = -73;
        }
        int var6 = ~var5 > -9 ? arg4 : arg0;
        int var7 = ~var5 > -5 ? arg0 : (~var5 != -13 && var5 != 14 ? arg2 : arg4);
        return (~(1 & var5) == -1 ? var6 : -var6) + (~(var5 & 2) == -1 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILhe;I)V", line = 35)
    public final void method669(int arg0, class252 arg1, int arg2) {
        ++field4689;
        if (arg0 != 67) {
            this.field4694 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 45)
    private final void method2063(byte arg0) {
        if (arg0 <= 93) {
            method2062(20, -62, -75, 41, -7);
        }
        ++field4696;
        this.field4694 = new class468(super.field1617, 2);
        this.field4694.method2854(-112, 0);
        super.field1617.method2250((byte) 115, 1);
        super.field1617.method2269(7681, 8960, 260);
        super.field1617.method2229(34168, (byte) -18, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field1617.method2250((byte) 104, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4693.field7116) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field4694.method2855(22228);
        this.field4694.method2854(-75, 1);
        super.field1617.method2250((byte) 97, 1);
        super.field1617.method2269(8448, 8960, 8448);
        super.field1617.method2229(5890, (byte) -18, 0, 768);
        OpenGL.glDisable(3168);
        super.field1617.method2250((byte) 80, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4693.field7116) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field4694.method2855(22228);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V", line = 101)
    public final void method662(int arg0, int arg1, int arg2) {
        if (arg0 <= -35) {
            ++field4698;
            if (~(arg2 & 1) == -2) {
                if (!this.field4693.field7116) {
                    int var4 = super.field1617.field5310 % 4000 * 16 / 4000;
                    super.field1617.method2236(this.field4693.field7119[var4], 104);
                } else {
                    super.field1617.method2236(this.field4693.field7118, 125);
                    class410.field5877[3] = (float) (super.field1617.field5310 % 4000) / 4000.0F;
                    class410.field5877[1] = 0.0F;
                    class410.field5877[0] = 0.0F;
                    class410.field5877[2] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class410.field5877, 0);
                }
            } else if (this.field4693.field7116) {
                super.field1617.method2236(this.field4693.field7118, -39);
                class410.field5877[2] = 0.0F;
                class410.field5877[0] = 0.0F;
                class410.field5877[3] = 0.0F;
                class410.field5877[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class410.field5877, 0);
            } else {
                super.field1617.method2236(this.field4693.field7119[0], 6);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Z", line = 146)
    public final boolean method666(int arg0) {
        int var2 = -51 % ((arg0 - 11) / 63);
        ++field4699;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V", line = 157)
    public final void method668(boolean arg0, int arg1) {
        ++field4697;
        if (super.field1617.field5387 > arg1) {
            float var3 = -0.5F / (float) super.field1617.field5387;
            super.field1617.method2250((byte) 61, 1);
            class410.field5877[1] = 0.0F;
            class410.field5877[2] = var3;
            class410.field5877[3] = super.field1617.field5335 * var3 + 0.25F;
            class410.field5877[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class410.field5877, 0);
            OpenGL.glPopMatrix();
            super.field1617.method2242(24442, 0.5F, (float) super.field1617.field5387);
            super.field1617.method2236(this.field4692, -84);
            super.field1617.method2250((byte) 100, 0);
        }
        this.field4694.method2856('\u0000', arg1 ^ 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 189)
    public final void method667(int arg0) {
        ++field4695;
        this.field4694.method2856('\u0001', 1);
        if (super.field1617.field5387 > 0) {
            super.field1617.method2250((byte) 113, 1);
            super.field1617.method2236((class252) null, -12);
            super.field1617.method2242(24442, 1.0F, 0.0F);
            super.field1617.method2250((byte) 116, 0);
        }
        if (arg0 != -18112) {
            this.method666(-74);
        }
        super.field1617.method2269(8448, 8960, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lur;Lqf;)V", line = 215)
    public class352(class377 arg0, class482 arg1) {
        super(arg0);
        this.field4693 = arg1;
        this.method2063((byte) 124);
        this.field4692 = new class318(super.field1617, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4692.method1894(33071, false);
    }
}
