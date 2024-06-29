import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class36 implements class159 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[F")
    private float[] field593 = new float[4];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    private int field592 = -1;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    private int field596 = -1;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    private int field595 = -1;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[F")
    private static float[] field594 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()V", line = 6)
    public static void method280() {
        field594 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V", line = 10)
    public final void method32() {
        GL var1 = class117.field2143;
        class117.method961(2);
        class117.method935(2);
        class117.method959();
        var1.glCallList(this.field596);
        float var2 = 2662.4001F;
        float var3 = (float) (class279.field4703 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field593[0] = 0.0F;
        this.field593[1] = 0.0F;
        this.field593[2] = 1.0F / (var3 - 3328.0F);
        this.field593[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field593, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field594, 0);
        if (!class210.field3548) {
            class117.method939(class210.field3547[class117.field2127 * 64 / 100 % 64]);
        } else if (class117.field2127 != this.field592) {
            this.field593[0] = 0.0F;
            this.field593[1] = 0.0F;
            this.field593[2] = 0.0F;
            this.field593[3] = (float) class117.field2127 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field593, 0);
            this.field592 = class117.field2127;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 164)
    public class36() {
        this.method281();
        this.method282();
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "()V", line = 54)
    private final void method281() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class117.field2143;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field595 = var3[0];
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()I", line = 70)
    public final int method30() {
        return 15;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "()V", line = 74)
    private final void method282() {
        GL var1 = class117.field2143;
        this.field596 = var1.glGenLists(2);
        var1.glNewList(this.field596, 4864);
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
        if (class210.field3548) {
            var1.glBindTexture(32879, class210.field3549);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field595);
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
        var1.glNewList(this.field596 + 1, 4864);
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
        if (class210.field3548) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 156)
    public final void method29(int arg0) {
        GL var2 = class117.field2143;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class182.field3128, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()V", line = 162)
    public final void method34() {
        class117.field2143.glCallList(this.field596 + 1);
    }
}
