import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class316 implements class8 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    private int field4917 = -1;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "[F")
    private float[] field4919 = new float[4];

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    private int field4918 = -1;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    private int field4920 = -1;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[F")
    private static float[] field4916 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()V", line = 7)
    private final void method2171() {
        GL var1 = class36.field518;
        this.field4917 = var1.glGenLists(2);
        var1.glNewList(this.field4917, 4864);
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
        if (class19.field211) {
            var1.glBindTexture(32879, class19.field212);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field4918);
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
        var1.glNewList(this.field4917 + 1, 4864);
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
        if (class19.field211) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "()V", line = 72)
    public static void method2172() {
        field4916 = null;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "()V", line = 76)
    private final void method2173() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class36.field518;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field4918 = var3[0];
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V", line = 93)
    public final void method70() {
        GL var1 = class36.field518;
        class36.method313(2);
        class36.method314(2);
        class36.method320();
        var1.glCallList(this.field4917);
        float var2 = 2662.4001F;
        float var3 = (float) (class137.field2137 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field4919[0] = 0.0F;
        this.field4919[1] = 0.0F;
        this.field4919[2] = 1.0F / (var3 - 3328.0F);
        this.field4919[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field4919, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field4916, 0);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()V", line = 115)
    public final void method73() {
        class36.field518.glCallList(this.field4917 + 1);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 182)
    public class316() {
        this.method2173();
        this.method2171();
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()I", line = 130)
    public final int method71() {
        return 15;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 137)
    public final void method72(int arg0) {
        GL var2 = class36.field518;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class35.field503, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class19.field211) {
                class36.method310(class19.field215[class36.field514 * 64 / 100 % 64]);
            } else if (class36.field514 != this.field4920) {
                this.field4919[0] = 0.0F;
                this.field4919[1] = 0.0F;
                this.field4919[2] = 0.0F;
                this.field4919[3] = (float) class36.field514 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field4919, 0);
                this.field4920 = class36.field514;
            }
        } else if (class19.field211) {
            this.field4919[0] = 0.0F;
            this.field4919[1] = 0.0F;
            this.field4919[2] = 0.0F;
            this.field4919[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field4919, 0);
        } else {
            class36.method310(class19.field215[0]);
        }
    }
}
