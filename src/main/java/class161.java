import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class161 implements class163 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[F")
    private float[] field2326 = new float[4];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    private int field2325 = -1;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    private int field2328 = -1;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    private int field2329 = -1;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[F")
    private static float[] field2327 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()V", line = 6)
    public static void method1150() {
        field2327 = null;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "()V", line = 11)
    private final void method1151() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class141.field2025;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2325 = var3[0];
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()I", line = 28)
    public final int method281() {
        return 15;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 32)
    public final void method286(int arg0) {
        GL var2 = class141.field2025;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class308.field4604, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class245.field3647) {
                class141.method1000(class245.field3650[class141.field2045 * 64 / 100 % 64]);
            } else if (class141.field2045 != this.field2328) {
                this.field2326[0] = 0.0F;
                this.field2326[1] = 0.0F;
                this.field2326[2] = 0.0F;
                this.field2326[3] = (float) class141.field2045 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field2326, 0);
                this.field2328 = class141.field2045;
            }
        } else if (class245.field3647) {
            this.field2326[0] = 0.0F;
            this.field2326[1] = 0.0F;
            this.field2326[2] = 0.0F;
            this.field2326[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2326, 0);
        } else {
            class141.method1000(class245.field3650[0]);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()V", line = 73)
    public final void method283() {
        GL var1 = class141.field2025;
        class141.method986(2);
        class141.method1013(2);
        class141.method987();
        var1.glCallList(this.field2329);
        float var2 = 2662.4001F;
        float var3 = (float) (class303.field4530 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2326[0] = 0.0F;
        this.field2326[1] = 0.0F;
        this.field2326[2] = 1.0F / (var3 - 3328.0F);
        this.field2326[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2326, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2327, 0);
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 182)
    public class161() {
        this.method1151();
        this.method1152();
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()V", line = 97)
    public final void method288() {
        class141.field2025.glCallList(this.field2329 + 1);
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "()V", line = 110)
    private final void method1152() {
        GL var1 = class141.field2025;
        this.field2329 = var1.glGenLists(2);
        var1.glNewList(this.field2329, 4864);
        var1.glTexEnvi(8960, 34192, 768);
        var1.glTexEnvi(8960, 34177, 34166);
        var1.glTexEnvf(8960, 34163, 2.0F);
        var1.glTexEnvi(8960, 34185, 34166);
        var1.glTexGeni(8192, 9472, 9217);
        var1.glTexGeni(8193, 9472, 9217);
        var1.glTexGenfv(8192, 9473, new float[] { 9.765625E-4F, 0.0F, 0.0F, 0.0F }, 0);
        var1.glTexGenfv(8193, 9473, new float[] { 0.0F, 0.0F, 9.765625E-4F, 0.0F }, 0);
        var1.glEnable(3168);
        var1.glEnable(3169);
        if (class245.field3647) {
            var1.glBindTexture(32879, class245.field3646);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2325);
        var1.glTexEnvi(8960, 34161, 34165);
        var1.glTexEnvi(8960, 34176, 34166);
        var1.glTexEnvi(8960, 34178, 5890);
        var1.glTexEnvi(8960, 34162, 34165);
        var1.glTexEnvi(8960, 34184, 34166);
        var1.glTexEnvi(8960, 34186, 5890);
        var1.glEnable(3168);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glPushMatrix();
        var1.glLoadIdentity();
        var1.glEndList();
        var1.glNewList(this.field2329 + 1, 4864);
        var1.glActiveTexture(33985);
        var1.glDisable(3552);
        var1.glDisable(3168);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34176, 5890);
        var1.glTexEnvi(8960, 34178, 34166);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glTexEnvi(8960, 34186, 34166);
        var1.glActiveTexture(33984);
        var1.glTexEnvi(8960, 34192, 768);
        var1.glTexEnvi(8960, 34177, 34168);
        var1.glTexEnvf(8960, 34163, 1.0F);
        var1.glTexEnvi(8960, 34185, 34168);
        var1.glDisable(3168);
        var1.glDisable(3169);
        if (class245.field3647) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
