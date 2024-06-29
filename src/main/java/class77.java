import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class77 implements class188 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[F")
    private float[] field1241 = new float[4];

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    private int field1243 = -1;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    private int field1245 = -1;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    private int field1244 = -1;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[F")
    private static float[] field1242 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "()V", line = 7)
    public static void method558() {
        field1242 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 11)
    public final void method512(int arg0) {
        GL var2 = class271.field4641;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class118.field1892, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class243.field4032) {
                class271.method1978(class243.field4036[class271.field4635 * 64 / 100 % 64]);
            } else if (class271.field4635 != this.field1245) {
                this.field1241[0] = 0.0F;
                this.field1241[1] = 0.0F;
                this.field1241[2] = 0.0F;
                this.field1241[3] = (float) class271.field4635 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field1241, 0);
                this.field1245 = class271.field4635;
            }
        } else if (class243.field4032) {
            this.field1241[0] = 0.0F;
            this.field1241[1] = 0.0F;
            this.field1241[2] = 0.0F;
            this.field1241[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field1241, 0);
        } else {
            class271.method1978(class243.field4036[0]);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()I", line = 51)
    public final int method515() {
        return 15;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 182)
    public class77() {
        this.method559();
        this.method560();
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()V", line = 61)
    public final void method514() {
        class271.field4641.glCallList(this.field1244 + 1);
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "()V", line = 68)
    private final void method559() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class271.field4641;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field1243 = var3[0];
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "()V", line = 86)
    private final void method560() {
        GL var1 = class271.field4641;
        this.field1244 = var1.glGenLists(2);
        var1.glNewList(this.field1244, 4864);
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
        if (class243.field4032) {
            var1.glBindTexture(32879, class243.field4038);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field1243);
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
        var1.glNewList(this.field1244 + 1, 4864);
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
        if (class243.field4032) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()V", line = 152)
    public final void method509() {
        GL var1 = class271.field4641;
        class271.method1974(2);
        class271.method1983(2);
        class271.method1953();
        var1.glCallList(this.field1244);
        float var2 = 2662.4001F;
        float var3 = (float) (class211.field3492 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field1241[0] = 0.0F;
        this.field1241[1] = 0.0F;
        this.field1241[2] = 1.0F / (var3 - 3328.0F);
        this.field1241[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field1241, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field1242, 0);
    }
}
