import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class299 implements class321 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    private int field4717 = -1;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    private int field4720 = -1;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "[F")
    private float[] field4718 = new float[4];

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    private int field4719 = -1;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "[F")
    private static float[] field4721 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()V", line = 5)
    public final void method857() {
        class265.field4099.glCallList(this.field4719 + 1);
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()V", line = 9)
    public static void method2086() {
        field4721 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 182)
    public class299() {
        this.method2087();
        this.method2088();
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()V", line = 20)
    private final void method2087() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class265.field4099;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field4717 = var3[0];
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()I", line = 38)
    public final int method852() {
        return 15;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V", line = 42)
    public final void method855() {
        GL var1 = class265.field4099;
        class265.method1899(2);
        class265.method1898(2);
        class265.method1910();
        var1.glCallList(this.field4719);
        float var2 = 2662.4001F;
        float var3 = (float) (class231.field3670 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field4718[0] = 0.0F;
        this.field4718[1] = 0.0F;
        this.field4718[2] = 1.0F / (var3 - 3328.0F);
        this.field4718[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field4718, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field4721, 0);
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "()V", line = 71)
    private final void method2088() {
        GL var1 = class265.field4099;
        this.field4719 = var1.glGenLists(2);
        var1.glNewList(this.field4719, 4864);
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
        if (class184.field2930) {
            var1.glBindTexture(32879, class184.field2931);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field4717);
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
        var1.glNewList(this.field4719 + 1, 4864);
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
        if (class184.field2930) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 140)
    public final void method854(int arg0) {
        GL var2 = class265.field4099;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class180.field2886, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class184.field2930) {
                class265.method1889(class184.field2932[class265.field4118 * 64 / 100 % 64]);
            } else if (class265.field4118 != this.field4720) {
                this.field4718[0] = 0.0F;
                this.field4718[1] = 0.0F;
                this.field4718[2] = 0.0F;
                this.field4718[3] = (float) class265.field4118 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field4718, 0);
                this.field4720 = class265.field4118;
            }
        } else if (class184.field2930) {
            this.field4718[0] = 0.0F;
            this.field4718[1] = 0.0F;
            this.field4718[2] = 0.0F;
            this.field4718[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field4718, 0);
        } else {
            class265.method1889(class184.field2932[0]);
        }
    }
}
