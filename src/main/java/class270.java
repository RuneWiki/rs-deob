import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class270 implements class99 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    private int field4352 = -1;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    private int field4353 = -1;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    private int field4355 = -1;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[F")
    private float[] field4354 = new float[4];

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "[F")
    private static float[] field4351 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 6)
    public final void method155(int arg0) {
        GL var2 = class166.field2648;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class28.field415, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "()V", line = 13)
    public static void method1910() {
        field4351 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()V", line = 17)
    public final void method150() {
        GL var1 = class166.field2648;
        class166.method1160(2);
        class166.method1177(2);
        class166.method1173();
        var1.glCallList(this.field4352);
        float var2 = 2662.4001F;
        float var3 = (float) (class95.field1405 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field4354[0] = 0.0F;
        this.field4354[1] = 0.0F;
        this.field4354[2] = 1.0F / (var3 - 3328.0F);
        this.field4354[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field4354, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field4351, 0);
        if (!class71.field1067) {
            class166.method1182(class71.field1066[class166.field2630 * 64 / 100 % 64]);
        } else if (class166.field2630 != this.field4355) {
            this.field4354[0] = 0.0F;
            this.field4354[1] = 0.0F;
            this.field4354[2] = 0.0F;
            this.field4354[3] = (float) class166.field2630 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field4354, 0);
            this.field4355 = class166.field2630;
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "()V", line = 55)
    private final void method1911() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class166.field2648;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field4353 = var3[0];
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()V", line = 71)
    public final void method152() {
        class166.field2648.glCallList(this.field4352 + 1);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 164)
    public class270() {
        this.method1911();
        this.method1912();
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "()V", line = 81)
    private final void method1912() {
        GL var1 = class166.field2648;
        this.field4352 = var1.glGenLists(2);
        var1.glNewList(this.field4352, 4864);
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
        if (class71.field1067) {
            var1.glBindTexture(32879, class71.field1063);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field4353);
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
        var1.glNewList(this.field4352 + 1, 4864);
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
        if (class71.field1067) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()I", line = 151)
    public final int method153() {
        return 15;
    }
}
