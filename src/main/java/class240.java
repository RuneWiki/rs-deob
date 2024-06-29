import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class240 implements class115 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    private int field4163 = -1;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    private int field4165 = -1;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[F")
    private float[] field4166 = new float[4];

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    private int field4164 = -1;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[F")
    private static float[] field4167 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()V", line = 7)
    public final void method64() {
        GL var1 = class147.field2479;
        class147.method1012(2);
        class147.method991(2);
        class147.method1000();
        var1.glCallList(this.field4164);
        float var2 = 2662.4001F;
        float var3 = (float) (class28.field374 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field4166[0] = 0.0F;
        this.field4166[1] = 0.0F;
        this.field4166[2] = 1.0F / (var3 - 3328.0F);
        this.field4166[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field4166, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field4167, 0);
        if (!class49.field805) {
            class147.method1002(class49.field803[class147.field2481 * 64 / 100 % 64]);
        } else if (class147.field2481 != this.field4165) {
            this.field4166[0] = 0.0F;
            this.field4166[1] = 0.0F;
            this.field4166[2] = 0.0F;
            this.field4166[3] = (float) class147.field2481 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field4166, 0);
            this.field4165 = class147.field2481;
        }
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()V", line = 44)
    public static void method1724() {
        field4167 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V", line = 161)
    public class240() {
        this.method1725();
        this.method1726();
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "()V", line = 53)
    private final void method1725() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class147.field2479;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field4163 = var3[0];
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()V", line = 69)
    public final void method65() {
        class147.field2479.glCallList(this.field4164 + 1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()I", line = 72)
    public final int method63() {
        return 15;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "()V", line = 76)
    private final void method1726() {
        GL var1 = class147.field2479;
        this.field4164 = var1.glGenLists(2);
        var1.glNewList(this.field4164, 4864);
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
        if (class49.field805) {
            var1.glBindTexture(32879, class49.field809);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field4163);
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
        var1.glNewList(this.field4164 + 1, 4864);
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
        if (class49.field805) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 144)
    public final void method66(int arg0) {
        GL var2 = class147.field2479;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class209.field3682, 0);
        var2.glActiveTexture(33984);
    }
}
