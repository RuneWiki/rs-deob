import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class95 implements class25 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "[F")
    private float[] field1426 = new float[4];

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    private int field1428 = -1;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    private int field1427 = -1;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    private int field1430 = -1;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[F")
    private static float[] field1429 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()I", line = 7)
    public final int method17() {
        return 15;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "()V", line = 10)
    public static void method613() {
        field1429 = null;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 106)
    public class95() {
        this.method615();
        this.method614();
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "()V", line = 23)
    private final void method614() {
        GL var1 = class45.field688;
        this.field1430 = var1.glGenLists(2);
        var1.glNewList(this.field1430, 4864);
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
        if (class224.field3693) {
            var1.glBindTexture(32879, class224.field3697);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field1428);
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
        var1.glNewList(this.field1430 + 1, 4864);
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
        if (class224.field3693) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 90)
    public final void method16(int arg0) {
        GL var2 = class45.field688;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class236.field3899, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()V", line = 98)
    public final void method19() {
        class45.field688.glCallList(this.field1430 + 1);
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "()V", line = 112)
    private final void method615() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class45.field688;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field1428 = var3[0];
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "()V", line = 129)
    public final void method15() {
        GL var1 = class45.field688;
        class45.method330(2);
        class45.method305(2);
        class45.method326();
        var1.glCallList(this.field1430);
        float var2 = 2662.4001F;
        float var3 = (float) (class86.field1303 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field1426[0] = 0.0F;
        this.field1426[1] = 0.0F;
        this.field1426[2] = 1.0F / (var3 - 3328.0F);
        this.field1426[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field1426, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field1429, 0);
        if (!class224.field3693) {
            class45.method321(class224.field3694[class45.field660 * 64 / 100 % 64]);
        } else if (class45.field660 != this.field1427) {
            this.field1426[0] = 0.0F;
            this.field1426[1] = 0.0F;
            this.field1426[2] = 0.0F;
            this.field1426[3] = (float) class45.field660 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field1426, 0);
            this.field1427 = class45.field660;
        }
    }
}
