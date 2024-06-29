import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class286 implements class87 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[F")
    private float[] field4895 = new float[4];

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    private int field4896 = -1;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    private int field4898 = -1;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    private int field4899 = -1;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[F")
    private static float[] field4897 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V", line = 5)
    public final void method502() {
        class247.field4253.glCallList(this.field4899 + 1);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()I", line = 8)
    public final int method499() {
        return 15;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()V", line = 12)
    private final void method1975() {
        GL var1 = class247.field4253;
        this.field4899 = var1.glGenLists(2);
        var1.glNewList(this.field4899, 4864);
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
        if (class179.field3142) {
            var1.glBindTexture(32879, class179.field3143);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field4898);
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
        var1.glNewList(this.field4899 + 1, 4864);
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
        if (class179.field3142) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()V", line = 77)
    public static void method1976() {
        field4897 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 164)
    public class286() {
        this.method1977();
        this.method1975();
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "()V", line = 87)
    private final void method1977() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class247.field4253;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field4898 = var3[0];
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 107)
    public final void method503(int arg0) {
        GL var2 = class247.field4253;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class123.field2090, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()V", line = 118)
    public final void method501() {
        GL var1 = class247.field4253;
        class247.method1701(2);
        class247.method1687(2);
        class247.method1710();
        var1.glCallList(this.field4899);
        float var2 = 2662.4001F;
        float var3 = (float) (class6.field130 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field4895[0] = 0.0F;
        this.field4895[1] = 0.0F;
        this.field4895[2] = 1.0F / (var3 - 3328.0F);
        this.field4895[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field4895, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field4897, 0);
        if (!class179.field3142) {
            class247.method1691(class179.field3139[class247.field4243 * 64 / 100 % 64]);
        } else if (class247.field4243 != this.field4896) {
            this.field4895[0] = 0.0F;
            this.field4895[1] = 0.0F;
            this.field4895[2] = 0.0F;
            this.field4895[3] = (float) class247.field4243 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field4895, 0);
            this.field4896 = class247.field4243;
        }
    }
}
