import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class182 implements class21 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    private int field2944 = -1;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    private int field2942 = -1;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[F")
    private float[] field2943 = new float[4];

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    private int field2946 = -1;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "[F")
    private static float[] field2945 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()I", line = 5)
    public final int method117() {
        return 15;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 9)
    public final void method116() {
        class281.field4839.glCallList(this.field2944 + 1);
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "()V", line = 14)
    public final void method118() {
        GL var1 = class281.field4839;
        class281.method1964(2);
        class281.method1983(2);
        class281.method1960();
        var1.glCallList(this.field2944);
        float var2 = 2662.4001F;
        float var3 = (float) (class13.field180 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2943[0] = 0.0F;
        this.field2943[1] = 0.0F;
        this.field2943[2] = 1.0F / (var3 - 3328.0F);
        this.field2943[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2943, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2945, 0);
        if (!class86.field1391) {
            class281.method1953(class86.field1390[class281.field4810 * 64 / 100 % 64]);
        } else if (class281.field4810 != this.field2942) {
            this.field2943[0] = 0.0F;
            this.field2943[1] = 0.0F;
            this.field2943[2] = 0.0F;
            this.field2943[3] = (float) class281.field4810 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field2943, 0);
            this.field2942 = class281.field4810;
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "()V", line = 52)
    private final void method1277() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class281.field4839;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2946 = var3[0];
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 69)
    public final void method119(int arg0) {
        GL var2 = class281.field4839;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class113.field1911, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "()V", line = 76)
    private final void method1278() {
        GL var1 = class281.field4839;
        this.field2944 = var1.glGenLists(2);
        var1.glNewList(this.field2944, 4864);
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
        if (class86.field1391) {
            var1.glBindTexture(32879, class86.field1393);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2946);
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
        var1.glNewList(this.field2944 + 1, 4864);
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
        if (class86.field1391) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 164)
    public class182() {
        this.method1277();
        this.method1278();
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "()V", line = 155)
    public static void method1279() {
        field2945 = null;
    }
}
