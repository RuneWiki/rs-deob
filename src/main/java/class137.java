import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class137 implements class97 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    private int field2039 = -1;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    private int field2038 = -1;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[F")
    private float[] field2042 = new float[4];

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    private int field2041 = -1;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[F")
    private static float[] field2040 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 6)
    public final void method150(int arg0) {
        GL var2 = class272.field4310;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class353.field5617, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class144.field2303) {
                class272.method1965(class144.field2299[class272.field4280 * 64 / 100 % 64]);
            } else if (class272.field4280 != this.field2038) {
                this.field2042[0] = 0.0F;
                this.field2042[1] = 0.0F;
                this.field2042[2] = 0.0F;
                this.field2042[3] = (float) class272.field4280 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field2042, 0);
                this.field2038 = class272.field4280;
            }
        } else if (class144.field2303) {
            this.field2042[0] = 0.0F;
            this.field2042[1] = 0.0F;
            this.field2042[2] = 0.0F;
            this.field2042[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2042, 0);
        } else {
            class272.method1965(class144.field2299[0]);
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()V", line = 47)
    public final void method147() {
        class272.field4310.glCallList(this.field2039 + 1);
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()V", line = 52)
    private final void method939() {
        GL var1 = class272.field4310;
        this.field2039 = var1.glGenLists(2);
        var1.glNewList(this.field2039, 4864);
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
        if (class144.field2303) {
            var1.glBindTexture(32879, class144.field2300);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2041);
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
        var1.glNewList(this.field2039 + 1, 4864);
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
        if (class144.field2303) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()I", line = 122)
    public final int method148() {
        return 15;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "()V", line = 125)
    public static void method940() {
        field2040 = null;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 182)
    public class137() {
        this.method941();
        this.method939();
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "()V", line = 132)
    private final void method941() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class272.field4310;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2041 = var3[0];
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V", line = 151)
    public final void method152() {
        GL var1 = class272.field4310;
        class272.method1961(2);
        class272.method1947(2);
        class272.method1926();
        var1.glCallList(this.field2039);
        float var2 = 2662.4001F;
        float var3 = (float) (class54.field616 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2042[0] = 0.0F;
        this.field2042[1] = 0.0F;
        this.field2042[2] = 1.0F / (var3 - 3328.0F);
        this.field2042[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2042, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2040, 0);
    }
}
