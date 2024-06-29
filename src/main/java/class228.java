import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class228 implements class18 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    private int field3269 = -1;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    private int field3270 = -1;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    private int field3271 = -1;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "[F")
    private float[] field3273 = new float[4];

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "[F")
    private static float[] field3272 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "()V", line = 6)
    private final void method1637() {
        GL var1 = class47.field592;
        this.field3271 = var1.glGenLists(2);
        var1.glNewList(this.field3271, 4864);
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
        if (class57.field732) {
            var1.glBindTexture(32879, class57.field731);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field3269);
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
        var1.glNewList(this.field3271 + 1, 4864);
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
        if (class57.field732) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 182)
    public class228() {
        this.method1638();
        this.method1637();
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()I", line = 75)
    public final int method128() {
        return 15;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "()V", line = 84)
    private final void method1638() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class47.field592;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field3269 = var3[0];
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "()V", line = 100)
    public static void method1639() {
        field3272 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V", line = 104)
    public final void method126() {
        class47.field592.glCallList(this.field3271 + 1);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()V", line = 108)
    public final void method127() {
        GL var1 = class47.field592;
        class47.method354(2);
        class47.method364(2);
        class47.method352();
        var1.glCallList(this.field3271);
        float var2 = 2662.4001F;
        float var3 = (float) (class255.field3738 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field3273[0] = 0.0F;
        this.field3273[1] = 0.0F;
        this.field3273[2] = 1.0F / (var3 - 3328.0F);
        this.field3273[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field3273, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field3272, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 130)
    public final void method129(int arg0) {
        GL var2 = class47.field592;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class206.field2870, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class57.field732) {
                class47.method357(class57.field729[class47.field625 * 64 / 100 % 64]);
            } else if (class47.field625 != this.field3270) {
                this.field3273[0] = 0.0F;
                this.field3273[1] = 0.0F;
                this.field3273[2] = 0.0F;
                this.field3273[3] = (float) class47.field625 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field3273, 0);
                this.field3270 = class47.field625;
            }
        } else if (class57.field732) {
            this.field3273[0] = 0.0F;
            this.field3273[1] = 0.0F;
            this.field3273[2] = 0.0F;
            this.field3273[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field3273, 0);
        } else {
            class47.method357(class57.field729[0]);
        }
    }
}
