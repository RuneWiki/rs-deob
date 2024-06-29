import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class252 extends class106 {

    @OriginalMember(owner = "client!mv", name = "r", descriptor = "Lpo;")
    private class389 field3597;

    @OriginalMember(owner = "client!mv", name = "m", descriptor = "Lni;")
    private class360 field3592;

    @OriginalMember(owner = "client!mv", name = "y", descriptor = "I")
    public static int field3604 = 0;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "Lrn;")
    public static class174 field3598 = new class174(25, 1);

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "Lpi;")
    public static class342 field3605 = new class342("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!mv", name = "n", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!mv", name = "o", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!mv", name = "w", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!mv", name = "x", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!mv", name = "p", descriptor = "Lsc;")
    private class229 field3595;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IBI)V")
    public final void method347(int arg0, byte arg1, int arg2) {
        ++field3600;
        if ((1 & arg0) != 1) {
            if (this.field3597.field5850) {
                super.field1770.method1990(this.field3597.field5856, 11864);
                class412.field6160[0] = 0.0F;
                class412.field6160[1] = 0.0F;
                class412.field6160[2] = 0.0F;
                class412.field6160[3] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class412.field6160, 0);
            } else {
                super.field1770.method1990(this.field3597.field5845[0], 11864);
            }
        } else if (!this.field3597.field5850) {
            int var4 = super.field1770.field4490 % 4000 * 16 / 4000;
            super.field1770.method1990(this.field3597.field5845[var4], 11864);
        } else {
            super.field1770.method1990(this.field3597.field5856, 11864);
            class412.field6160[3] = (float) (super.field1770.field4490 % 4000) / 4000.0F;
            class412.field6160[0] = 0.0F;
            class412.field6160[2] = 0.0F;
            class412.field6160[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class412.field6160, 0);
        }
        if (arg1 != 43) {
            this.method342(59);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZB)V")
    public final void method344(boolean arg0, byte arg1) {
        ++field3599;
        if (arg1 < 102) {
            this.method343(false, -69);
        }
        super.field1770.method1951((byte) -111, 260, 8448);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILih;)V")
    public final void method346(int arg0, int arg1, class492 arg2) {
        ++field3601;
        if (arg0 != 128) {
            field3604 = 82;
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(Z)V")
    private final void method1621(boolean arg0) {
        this.field3595 = new class229(super.field1770, 2);
        if (arg0) {
            ++field3603;
            this.field3595.method1495(0, (byte) -115);
            super.field1770.method1929(1, (byte) 105);
            super.field1770.method1951((byte) 96, 7681, 260);
            super.field1770.method1921(768, 34168, (byte) 56, 0);
            OpenGL.glTexGeni(8192, 9472, 9216);
            OpenGL.glEnable(3168);
            super.field1770.method1929(0, (byte) 109);
            OpenGL.glTexEnvf(8960, 34163, 2.0F);
            if (this.field3597.field5850) {
                OpenGL.glTexGeni(8194, 9472, 9217);
                OpenGL.glTexGeni(8195, 9472, 9217);
                OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
                OpenGL.glEnable(3170);
                OpenGL.glEnable(3171);
            }
            this.field3595.method1493((byte) -107);
            this.field3595.method1495(1, (byte) -115);
            super.field1770.method1929(1, (byte) 106);
            super.field1770.method1951((byte) -122, 8448, 8448);
            super.field1770.method1921(768, 5890, (byte) -127, 0);
            OpenGL.glDisable(3168);
            super.field1770.method1929(0, (byte) 64);
            OpenGL.glTexEnvf(8960, 34163, 1.0F);
            if (this.field3597.field5850) {
                OpenGL.glDisable(3170);
                OpenGL.glDisable(3171);
            }
            this.field3595.method1493((byte) -101);
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        ++field3593;
        return arg0 == -22884;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lvj;Lpo;)V")
    public class252(class303 arg0, class389 arg1) {
        super(arg0);
        this.field3597 = arg1;
        this.method1621(true);
        this.field3592 = new class360(super.field1770, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3592.method2267(true, false);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZI)V")
    public final void method343(boolean arg0, int arg1) {
        if (super.field1770.field4531 > 0) {
            float var3 = -0.5F / (float) super.field1770.field4531;
            super.field1770.method1929(1, (byte) 126);
            class412.field6160[2] = var3;
            class412.field6160[3] = super.field1770.field4614 * var3 + 0.25F;
            class412.field6160[0] = 0.0F;
            class412.field6160[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class412.field6160, 0);
            OpenGL.glPopMatrix();
            super.field1770.method1980(0.5F, arg1 + -1, (float) super.field1770.field4531);
            super.field1770.method1990(this.field3592, 11864);
            super.field1770.method1929(0, (byte) 78);
        }
        ++field3594;
        this.field3595.method1494('\u0000', false);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, (float) arg1);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        if (arg0 != 3) {
            field3604 = 66;
        }
        this.field3595.method1494('\u0001', false);
        ++field3596;
        if (~super.field1770.field4531 < -1) {
            super.field1770.method1929(1, (byte) 108);
            super.field1770.method1990((class492) null, 11864);
            super.field1770.method1980(1.0F, arg0 ^ 3, 0.0F);
            super.field1770.method1929(0, (byte) 59);
        }
        super.field1770.method1951((byte) 118, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)V")
    public static void method1622(int arg0) {
        field3605 = null;
        field3598 = null;
        if (arg0 != 4185) {
            method1622(-121);
        }
    }
}
