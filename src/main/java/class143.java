import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class143 implements class2 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    private int field2160 = -1;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    private int field2162 = -1;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[F")
    private float[] field2161 = new float[4];

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    private int field2164 = -1;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "[F")
    private static float[] field2163 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 6)
    public final void method3(int arg0) {
        GL var2 = class117.field1801;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class151.field2275, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class133.field2039) {
                class117.method814(class133.field2041[class117.field1818 * 64 / 100 % 64]);
            } else if (class117.field1818 != this.field2160) {
                this.field2161[0] = 0.0F;
                this.field2161[1] = 0.0F;
                this.field2161[2] = 0.0F;
                this.field2161[3] = (float) class117.field1818 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field2161, 0);
                this.field2160 = class117.field1818;
            }
        } else if (class133.field2039) {
            this.field2161[0] = 0.0F;
            this.field2161[1] = 0.0F;
            this.field2161[2] = 0.0F;
            this.field2161[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2161, 0);
        } else {
            class117.method814(class133.field2041[0]);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()V", line = 47)
    public final void method1() {
        class117.field1801.glCallList(this.field2162 + 1);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()V", line = 53)
    public static void method1023() {
        field2163 = null;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 182)
    public class143() {
        this.method1024();
        this.method1025();
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "()V", line = 65)
    private final void method1024() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class117.field1801;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2164 = var3[0];
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()I", line = 86)
    public final int method2() {
        return 15;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "()V", line = 90)
    public final void method4() {
        GL var1 = class117.field1801;
        class117.method809(2);
        class117.method823(2);
        class117.method821();
        var1.glCallList(this.field2162);
        float var2 = 2662.4001F;
        float var3 = (float) (class250.field3732 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2161[0] = 0.0F;
        this.field2161[1] = 0.0F;
        this.field2161[2] = 1.0F / (var3 - 3328.0F);
        this.field2161[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2161, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2163, 0);
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "()V", line = 112)
    private final void method1025() {
        GL var1 = class117.field1801;
        this.field2162 = var1.glGenLists(2);
        var1.glNewList(this.field2162, 4864);
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
        if (class133.field2039) {
            var1.glBindTexture(32879, class133.field2040);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2164);
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
        var1.glNewList(this.field2162 + 1, 4864);
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
        if (class133.field2039) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
