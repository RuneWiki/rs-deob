import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class87 implements class236 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "[F")
    private float[] field1379 = new float[4];

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    private int field1382 = -1;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    private int field1383 = -1;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    private int field1381 = -1;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "[F")
    private static float[] field1380 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "()V", line = 8)
    public static void method771() {
        field1380 = null;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "()I", line = 11)
    public final int method237() {
        return 15;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 182)
    public class87() {
        this.method773();
        this.method772();
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "()V", line = 29)
    public final void method245() {
        GL var1 = class43.field651;
        class43.method368(2);
        class43.method349(2);
        class43.method371();
        var1.glCallList(this.field1383);
        float var2 = 2662.4001F;
        float var3 = (float) (class90.field1423 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field1379[0] = 0.0F;
        this.field1379[1] = 0.0F;
        this.field1379[2] = 1.0F / (var3 - 3328.0F);
        this.field1379[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field1379, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field1380, 0);
    }

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "()V", line = 51)
    private final void method772() {
        GL var1 = class43.field651;
        this.field1383 = var1.glGenLists(2);
        var1.glNewList(this.field1383, 4864);
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
        if (class6.field85) {
            var1.glBindTexture(32879, class6.field86);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field1381);
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
        var1.glNewList(this.field1383 + 1, 4864);
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
        if (class6.field85) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "()V", line = 117)
    private final void method773() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class43.field651;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field1381 = var3[0];
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "()V", line = 136)
    public final void method243() {
        class43.field651.glCallList(this.field1383 + 1);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 140)
    public final void method239(int arg0) {
        GL var2 = class43.field651;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class188.field3158, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class6.field85) {
                class43.method390(class6.field84[class43.field675 * 64 / 100 % 64]);
            } else if (class43.field675 != this.field1382) {
                this.field1379[0] = 0.0F;
                this.field1379[1] = 0.0F;
                this.field1379[2] = 0.0F;
                this.field1379[3] = (float) class43.field675 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field1379, 0);
                this.field1382 = class43.field675;
            }
        } else if (class6.field85) {
            this.field1379[0] = 0.0F;
            this.field1379[1] = 0.0F;
            this.field1379[2] = 0.0F;
            this.field1379[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field1379, 0);
        } else {
            class43.method390(class6.field84[0]);
        }
    }
}
