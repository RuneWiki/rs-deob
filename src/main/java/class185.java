import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class185 implements class39 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    private int field3178 = -1;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    private int field3180 = -1;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[F")
    private float[] field3181 = new float[4];

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    private int field3182 = -1;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "[F")
    private static float[] field3179 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 6)
    public final void method246(int arg0) {
        GL var2 = class167.field2806;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class54.field727, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()V", line = 19)
    public static void method1218() {
        field3179 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()I", line = 22)
    public final int method244() {
        return 15;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "()V", line = 28)
    private final void method1219() {
        GL var1 = class167.field2806;
        this.field3178 = var1.glGenLists(2);
        var1.glNewList(this.field3178, 4864);
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
        if (class73.field1283) {
            var1.glBindTexture(32879, class73.field1285);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field3182);
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
        var1.glNewList(this.field3178 + 1, 4864);
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
        if (class73.field1283) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "()V", line = 95)
    private final void method1220() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class167.field2806;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field3182 = var3[0];
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V", line = 111)
    public final void method245() {
        class167.field2806.glCallList(this.field3178 + 1);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()V", line = 115)
    public final void method247() {
        GL var1 = class167.field2806;
        class167.method1047(2);
        class167.method1055(2);
        class167.method1034();
        var1.glCallList(this.field3178);
        float var2 = 2662.4001F;
        float var3 = (float) (class75.field1316 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field3181[0] = 0.0F;
        this.field3181[1] = 0.0F;
        this.field3181[2] = 1.0F / (var3 - 3328.0F);
        this.field3181[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field3181, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field3179, 0);
        if (!class73.field1283) {
            class167.method1033(class73.field1282[class167.field2803 * 64 / 100 % 64]);
        } else if (class167.field2803 != this.field3180) {
            this.field3181[0] = 0.0F;
            this.field3181[1] = 0.0F;
            this.field3181[2] = 0.0F;
            this.field3181[3] = (float) class167.field2803 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field3181, 0);
            this.field3180 = class167.field2803;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 164)
    public class185() {
        this.method1220();
        this.method1219();
    }
}
