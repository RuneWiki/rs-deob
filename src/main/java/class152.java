import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class152 implements class73 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    private int field2702 = -1;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    private int field2703 = -1;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    private int field2701 = -1;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[F")
    private float[] field2704 = new float[4];

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[F")
    private static float[] field2700 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "()V", line = 8)
    public final void method556() {
        GL var1 = class123.field2212;
        class123.method894(2);
        class123.method881(2);
        class123.method885();
        var1.glCallList(this.field2701);
        float var2 = 2662.4001F;
        float var3 = (float) (class306.field5238 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2704[0] = 0.0F;
        this.field2704[1] = 0.0F;
        this.field2704[2] = 1.0F / (var3 - 3328.0F);
        this.field2704[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2704, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2700, 0);
        if (!class212.field3570) {
            class123.method867(class212.field3575[class123.field2226 * 64 / 100 % 64]);
        } else if (class123.field2226 != this.field2703) {
            this.field2704[0] = 0.0F;
            this.field2704[1] = 0.0F;
            this.field2704[2] = 0.0F;
            this.field2704[3] = (float) class123.field2226 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field2704, 0);
            this.field2703 = class123.field2226;
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "()V", line = 47)
    public static void method1100() {
        field2700 = null;
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "()V", line = 51)
    private final void method1101() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class123.field2212;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2702 = var3[0];
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()I", line = 69)
    public final int method554() {
        return 15;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 98)
    public class152() {
        this.method1101();
        this.method1102();
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()V", line = 78)
    public final void method555() {
        class123.field2212.glCallList(this.field2701 + 1);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 90)
    public final void method557(int arg0) {
        GL var2 = class123.field2212;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class104.field1918, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "()V", line = 104)
    private final void method1102() {
        GL var1 = class123.field2212;
        this.field2701 = var1.glGenLists(2);
        var1.glNewList(this.field2701, 4864);
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
        if (class212.field3570) {
            var1.glBindTexture(32879, class212.field3573);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2702);
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
        var1.glNewList(this.field2701 + 1, 4864);
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
        if (class212.field3570) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
