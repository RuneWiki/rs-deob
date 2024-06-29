import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class598 extends class460 {

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "Lul;")
    private class440 field8646;

    @OriginalMember(owner = "client!iea", name = "s", descriptor = "Laaa;")
    private class227 field8648;

    @OriginalMember(owner = "client!iea", name = "o", descriptor = "I")
    public static int field8644 = -1;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
    public static int field8642 = 0;

    @OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
    public static int field8647 = 0;

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "Ldc;")
    public static class303 field8645 = new class303(14, 0, 4, 1);

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
    public static int field8641;

    @OriginalMember(owner = "client!iea", name = "t", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!iea", name = "v", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!iea", name = "w", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!iea", name = "y", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!iea", name = "x", descriptor = "Luq;")
    private class458 field8653;

    @OriginalMember(owner = "client!iea", name = "n", descriptor = "[Lis;")
    public static class101[] field8643;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(III)V", line = 3)
    public final void method1170(int arg0, int arg1, int arg2) {
        ++field8652;
        if (~(arg1 & arg2) != -2) {
            if (this.field8646.field6360) {
                super.field6621.method2295((byte) 13, this.field8646.field6364);
                class576.field8440[1] = 0.0F;
                class576.field8440[2] = 0.0F;
                class576.field8440[3] = 0.0F;
                class576.field8440[0] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class576.field8440, 0);
            } else {
                super.field6621.method2295((byte) -97, this.field8646.field6370[0]);
            }
        } else if (this.field8646.field6360) {
            super.field6621.method2295((byte) -101, this.field8646.field6364);
            class576.field8440[1] = 0.0F;
            class576.field8440[0] = 0.0F;
            class576.field8440[3] = (float) (super.field6621.field5456 % 4000) / 4000.0F;
            class576.field8440[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class576.field8440, 0);
        } else {
            int var4 = super.field6621.field5456 % 4000 * 16 / 4000;
            super.field6621.method2295((byte) -103, this.field8646.field6370[var4]);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILjo;I)V", line = 45)
    public final void method1169(int arg0, class337 arg1, int arg2) {
        int var4 = 121 / ((arg2 - 65) / 53);
        ++field8649;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(BZ)V", line = 56)
    public final void method1177(byte arg0, boolean arg1) {
        ++field8651;
        super.field6621.method2328(260, -97, 8448);
        int var3 = 2 / ((arg0 - -85) / 38);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)Z", line = 67)
    public final boolean method1168(int arg0) {
        if (arg0 != 2048) {
            return false;
        } else {
            ++field8639;
            return true;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZI)V", line = 91)
    public final void method1175(boolean arg0, int arg1) {
        if (~super.field6621.field5510 < -1) {
            float var3 = -0.5F / (float) super.field6621.field5510;
            super.field6621.method2308(1, -15115);
            class576.field8440[1] = 0.0F;
            class576.field8440[3] = super.field6621.field5551 * var3 + 0.25F;
            class576.field8440[2] = var3;
            class576.field8440[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class576.field8440, 0);
            OpenGL.glPopMatrix();
            super.field6621.method2289((float) super.field6621.field5510, (byte) 109, 0.5F);
            super.field6621.method2295((byte) -122, this.field8648);
            super.field6621.method2308(0, arg1 + -15115);
        }
        ++field8640;
        this.field8653.method2658(arg1 ^ arg1, '\u0000');
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V", line = 125)
    public final void method1174(byte arg0) {
        ++field8654;
        this.field8653.method2658(0, '\u0001');
        if (super.field6621.field5510 > 0) {
            super.field6621.method2308(1, -15115);
            super.field6621.method2295((byte) -113, (class337) null);
            super.field6621.method2289(0.0F, (byte) 116, 1.0F);
            super.field6621.method2308(0, -15115);
        }
        super.field6621.method2328(8448, 83, 8448);
        OpenGL.glMatrixMode(5890);
        if (arg0 <= -56) {
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILjava/lang/String;)V", line = 149)
    public static final void method3415(int arg0, String arg1) {
        if (arg0 != 12067) {
            field8645 = null;
        }
        ++field8638;
        class418.method2478(0, "", "", arg1, 0, "", 0);
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lkfa;Lul;)V", line = 161)
    public class598(class382 arg0, class440 arg1) {
        super(arg0);
        this.field8646 = arg1;
        this.method3416(3168);
        this.field8648 = new class227(super.field6621, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field8648.method1493((byte) -122, false);
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V", line = 173)
    private final void method3416(int arg0) {
        this.field8653 = new class458(super.field6621, 2);
        ++field8650;
        this.field8653.method2656(0, (byte) 76);
        super.field6621.method2308(1, -15115);
        super.field6621.method2328(7681, -116, 260);
        super.field6621.method2262(34168, 0, arg0 + 31008, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(arg0);
        super.field6621.method2308(0, -15115);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field8646.field6360) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field8653.method2657(0);
        this.field8653.method2656(1, (byte) 76);
        super.field6621.method2308(1, -15115);
        super.field6621.method2328(8448, -72, 8448);
        super.field6621.method2262(5890, 0, 34176, 768);
        OpenGL.glDisable(3168);
        super.field6621.method2308(0, -15115);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field8646.field6360) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field8653.method2657(0);
    }

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "(I)V", line = 223)
    public static void method3417(int arg0) {
        if (arg0 > -62) {
            method3417(22);
        }
        field8643 = null;
        field8645 = null;
    }
}
