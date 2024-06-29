import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class287 extends class56 {

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "Lre;")
    private class222 field4280;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "La;")
    private class457 field4279;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "Lui;")
    public static class375 field4284 = new class375("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Lgs;")
    private class288 field4277;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "[[B")
    public static byte[][] field4285;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 3)
    public final void method381(int arg0) {
        this.field4277.method1866(13, '\u0001');
        ++field4281;
        if (super.field752.field4179 > 0) {
            super.field752.method1819(1, (byte) 107);
            super.field752.method1787((class14) null, (byte) 121);
            super.field752.method1804(1.0F, -121, 0.0F);
            super.field752.method1819(0, (byte) 126);
        }
        if (arg0 > -50) {
            field4285 = null;
        }
        super.field752.method1776(-30, 8448, 8448);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Z", line = 32)
    public final boolean method377(byte arg0) {
        ++field4276;
        if (arg0 > -8) {
            this.method1862((byte) 1);
        }
        return true;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V", line = 43)
    public final void method382(int arg0, int arg1, int arg2) {
        ++field4278;
        if (arg2 == 0) {
            if (~(arg1 & 1) == -2) {
                if (!this.field4280.field3106) {
                    int var4 = super.field752.field4086 % 4000 * 16 / 4000;
                    super.field752.method1787(this.field4280.field3104[var4], (byte) 121);
                } else {
                    super.field752.method1787(this.field4280.field3103, (byte) 121);
                    class93.field1355[3] = (float) (super.field752.field4086 % 4000) / 4000.0F;
                    class93.field1355[2] = 0.0F;
                    class93.field1355[0] = 0.0F;
                    class93.field1355[1] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class93.field1355, 0);
                }
            } else if (this.field4280.field3106) {
                super.field752.method1787(this.field4280.field3103, (byte) 121);
                class93.field1355[1] = 0.0F;
                class93.field1355[3] = 0.0F;
                class93.field1355[0] = 0.0F;
                class93.field1355[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class93.field1355, 0);
            } else {
                super.field752.method1787(this.field4280.field3104[0], (byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V", line = 88)
    public final void method380(boolean arg0, int arg1) {
        super.field752.method1776(-30, 8448, 260);
        if (arg1 <= 42) {
            field4285 = null;
        }
        ++field4275;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILkv;)V", line = 105)
    public final void method379(int arg0, int arg1, class14 arg2) {
        ++field4282;
        int var4 = -25 / ((arg1 - 81) / 39);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(ZI)V", line = 116)
    public final void method383(boolean arg0, int arg1) {
        ++field4283;
        if (super.field752.field4179 > 0) {
            float var3 = -0.5F / (float) super.field752.field4179;
            super.field752.method1819(1, (byte) 122);
            class93.field1355[3] = super.field752.field4113 * var3 + 0.25F;
            class93.field1355[0] = 0.0F;
            class93.field1355[2] = var3;
            class93.field1355[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class93.field1355, 0);
            OpenGL.glPopMatrix();
            super.field752.method1804(0.5F, -95, (float) super.field752.field4179);
            super.field752.method1787(this.field4279, (byte) 121);
            super.field752.method1819(0, (byte) 127);
        }
        this.field4277.method1866(13, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        if (arg1 > -77) {
            this.method381(5);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V", line = 149)
    private final void method1862(byte arg0) {
        this.field4277 = new class288(super.field752, 2);
        if (arg0 != -59) {
            field4284 = null;
        }
        ++field4286;
        this.field4277.method1864((byte) 80, 0);
        super.field752.method1819(1, (byte) 93);
        super.field752.method1776(-30, 260, 7681);
        super.field752.method1828(34168, 768, 0, (byte) -76);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field752.method1819(0, (byte) 119);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field4280.field3106) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field4277.method1865(-121);
        this.field4277.method1864((byte) 117, 1);
        super.field752.method1819(1, (byte) 106);
        super.field752.method1776(arg0 + 29, 8448, 8448);
        super.field752.method1828(5890, 768, 0, (byte) -107);
        OpenGL.glDisable(3168);
        super.field752.method1819(0, (byte) 120);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field4280.field3106) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field4277.method1865(-60);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V", line = 193)
    public static void method1863(int arg0) {
        field4284 = null;
        if (arg0 != 0) {
            field4284 = null;
        }
        field4285 = null;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lbv;Lre;)V", line = 208)
    public class287(class282 arg0, class222 arg1) {
        super(arg0);
        this.field4280 = arg1;
        this.method1862((byte) -59);
        this.field4279 = new class457(super.field752, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field4279.method2751((byte) 122, false);
    }
}
