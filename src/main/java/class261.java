import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class261 implements class14 {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[F")
    private float[] field4364 = new float[4];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    private int field4361 = -1;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    private int field4362 = -1;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    private int field4365 = -1;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[F")
    private static float[] field4363 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "()V", line = 7)
    private final void method1817() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class99.field1682;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field4361 = var3[0];
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()V", line = 26)
    public final void method79() {
        GL var1 = class99.field1682;
        class99.method758(2);
        class99.method765(2);
        class99.method750();
        var1.glCallList(this.field4362);
        float var2 = 2662.4001F;
        float var3 = (float) (class203.field3348 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field4364[0] = 0.0F;
        this.field4364[1] = 0.0F;
        this.field4364[2] = 1.0F / (var3 - 3328.0F);
        this.field4364[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field4364, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field4363, 0);
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "()V", line = 50)
    private final void method1818() {
        GL var1 = class99.field1682;
        this.field4362 = var1.glGenLists(2);
        var1.glNewList(this.field4362, 4864);
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
        if (class9.field116) {
            var1.glBindTexture(32879, class9.field111);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field4361);
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
        var1.glNewList(this.field4362 + 1, 4864);
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
        if (class9.field116) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "()V", line = 117)
    public static void method1819() {
        field4363 = null;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 182)
    public class261() {
        this.method1817();
        this.method1818();
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()I", line = 126)
    public final int method83() {
        return 15;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()V", line = 132)
    public final void method80() {
        class99.field1682.glCallList(this.field4362 + 1);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 137)
    public final void method84(int arg0) {
        GL var2 = class99.field1682;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class275.field4596, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class9.field116) {
                class99.method749(class9.field113[class99.field1671 * 64 / 100 % 64]);
            } else if (class99.field1671 != this.field4365) {
                this.field4364[0] = 0.0F;
                this.field4364[1] = 0.0F;
                this.field4364[2] = 0.0F;
                this.field4364[3] = (float) class99.field1671 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field4364, 0);
                this.field4365 = class99.field1671;
            }
        } else if (class9.field116) {
            this.field4364[0] = 0.0F;
            this.field4364[1] = 0.0F;
            this.field4364[2] = 0.0F;
            this.field4364[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field4364, 0);
        } else {
            class99.method749(class9.field113[0]);
        }
    }
}
