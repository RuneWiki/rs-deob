import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class65 implements class41 {

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "[F")
    private float[] field1038 = new float[4];

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    private int field1040 = -1;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    private int field1039 = -1;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    private int field1041 = -1;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[F")
    private static float[] field1037 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 164)
    public class65() {
        this.method450();
        this.method448();
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "()V", line = 11)
    private final void method448() {
        GL var1 = class231.field4052;
        this.field1041 = var1.glGenLists(2);
        var1.glNewList(this.field1041, 4864);
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
        if (class138.field2435) {
            var1.glBindTexture(32879, class138.field2430);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field1040);
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
        var1.glNewList(this.field1041 + 1, 4864);
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
        if (class138.field2435) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()V", line = 78)
    public final void method220() {
        GL var1 = class231.field4052;
        class231.method1589(2);
        class231.method1572(2);
        class231.method1580();
        var1.glCallList(this.field1041);
        float var2 = 2662.4001F;
        float var3 = (float) (class249.field4305 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field1038[0] = 0.0F;
        this.field1038[1] = 0.0F;
        this.field1038[2] = 1.0F / (var3 - 3328.0F);
        this.field1038[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field1038, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field1037, 0);
        if (!class138.field2435) {
            class231.method1597(class138.field2432[class231.field4050 * 64 / 100 % 64]);
        } else if (class231.field4050 != this.field1039) {
            this.field1038[0] = 0.0F;
            this.field1038[1] = 0.0F;
            this.field1038[2] = 0.0F;
            this.field1038[3] = (float) class231.field4050 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field1038, 0);
            this.field1039 = class231.field4050;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "()V", line = 120)
    public final void method223() {
        class231.field4052.glCallList(this.field1041 + 1);
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "()V", line = 123)
    public static void method449() {
        field1037 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 127)
    public final void method219(int arg0) {
        GL var2 = class231.field4052;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class29.field431, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()I", line = 134)
    public final int method218() {
        return 15;
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "()V", line = 138)
    private final void method450() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class231.field4052;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field1040 = var3[0];
    }
}
