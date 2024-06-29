import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class593 extends class165 {

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "Lfa;")
    private class565 field8544;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "Lgw;")
    private class687 field8549;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "Lgca;")
    public static class209 field8546 = new class209(16);

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public static int field8555;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "Lrj;")
    private class359 field8547;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V", line = 6)
    public final void method679(byte arg0) {
        this.field8547.method2021(-125, '\u0001');
        ++field8545;
        if (super.field2260.field5042 > 0) {
            super.field2260.method2196(1, (byte) 89);
            super.field2260.method2154((class396) null, -2);
            super.field2260.method2169(0.0F, 1.0F, 7425);
            super.field2260.method2196(0, (byte) 89);
        }
        super.field2260.method2207(8448, 8448, -25248);
        if (arg0 > -97) {
            this.method3520(12);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)V", line = 30)
    public final void method678(boolean arg0, int arg1) {
        super.field2260.method2207(260, 8448, -25248);
        if (arg1 != 0) {
            this.field8547 = null;
        }
        ++field8551;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lep;Lfa;)V", line = 45)
    public class593(class371 arg0, class565 arg1) {
        super(arg0);
        this.field8544 = arg1;
        this.method3520(0);
        this.field8549 = new class687(super.field2260, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field8549.method3915(-5697, false);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZLhl;)V", line = 56)
    public final void method671(int arg0, boolean arg1, class396 arg2) {
        ++field8555;
        if (!arg1) {
            this.method672((byte) -8);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)Z", line = 68)
    public final boolean method672(byte arg0) {
        if (arg0 <= 11) {
            return false;
        } else {
            ++field8548;
            return true;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IBI)V", line = 79)
    public final void method675(int arg0, byte arg1, int arg2) {
        if (~(arg0 & 1) == -2) {
            if (!this.field8544.field8037) {
                int var4 = super.field2260.field4947 % 4000 * 16 / 4000;
                super.field2260.method2154(this.field8544.field8034[var4], -2);
            } else {
                super.field2260.method2154(this.field8544.field8036, -2);
                class465.field6359[1] = 0.0F;
                class465.field6359[3] = (float) (super.field2260.field4947 % 4000) / 4000.0F;
                class465.field6359[2] = 0.0F;
                class465.field6359[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class465.field6359, 0);
            }
        } else if (!this.field8544.field8037) {
            super.field2260.method2154(this.field8544.field8034[0], -2);
        } else {
            super.field2260.method2154(this.field8544.field8036, -2);
            class465.field6359[0] = 0.0F;
            class465.field6359[3] = 0.0F;
            class465.field6359[1] = 0.0F;
            class465.field6359[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class465.field6359, 0);
        }
        if (arg1 < 3) {
            this.field8544 = null;
        }
        ++field8550;
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V", line = 125)
    public static void method3519(byte arg0) {
        if (arg0 == -61) {
            field8546 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V", line = 135)
    private final void method3520(int arg0) {
        this.field8547 = new class359(super.field2260, 2);
        ++field8552;
        this.field8547.method2024(0, 104);
        super.field2260.method2196(1, (byte) 89);
        super.field2260.method2207(7681, 260, arg0 ^ -25248);
        super.field2260.method2202(390803672, 768, 34168, 0);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field2260.method2196(0, (byte) 89);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field8544.field8037) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field8547.method2022(arg0);
        this.field8547.method2024(1, arg0 ^ 88);
        super.field2260.method2196(1, (byte) 89);
        super.field2260.method2207(8448, 8448, -25248);
        super.field2260.method2202(390803672, 768, 5890, 0);
        OpenGL.glDisable(3168);
        super.field2260.method2196(0, (byte) 89);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field8544.field8037) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field8547.method2022(arg0);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZ)V", line = 185)
    public final void method673(int arg0, boolean arg1) {
        if (arg0 <= -115) {
            if (~super.field2260.field5042 < -1) {
                float var3 = -0.5F / (float) super.field2260.field5042;
                super.field2260.method2196(1, (byte) 89);
                class465.field6359[1] = 0.0F;
                class465.field6359[3] = super.field2260.field5063 * var3 + 0.25F;
                class465.field6359[2] = var3;
                class465.field6359[0] = 0.0F;
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glTexGenfv(8192, 9474, class465.field6359, 0);
                OpenGL.glPopMatrix();
                super.field2260.method2169((float) super.field2260.field5042, 0.5F, 7425);
                super.field2260.method2154(this.field8549, -2);
                super.field2260.method2196(0, (byte) 89);
            }
            ++field8553;
            this.field8547.method2021(-63, '\u0000');
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(0.25F, 0.25F, 1.0F);
            OpenGL.glMatrixMode(5888);
        }
    }
}
