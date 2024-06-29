import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class337 implements class40 {

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    private int field5261 = -1;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    private int field5263 = -1;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "[F")
    private float[] field5260 = new float[4];

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    private int field5264 = -1;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "[F")
    private static float[] field5262 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()V", line = 8)
    public final void method69() {
        GL var1 = class232.field3716;
        class232.method1677(2);
        class232.method1664(2);
        class232.method1654();
        var1.glCallList(this.field5263);
        float var2 = 2662.4001F;
        float var3 = (float) (class61.field883 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field5260[0] = 0.0F;
        this.field5260[1] = 0.0F;
        this.field5260[2] = 1.0F / (var3 - 3328.0F);
        this.field5260[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field5260, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field5262, 0);
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()V", line = 30)
    public static void method2350() {
        field5262 = null;
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "()V", line = 34)
    private final void method2351() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class232.field3716;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field5261 = var3[0];
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V", line = 182)
    public class337() {
        this.method2351();
        this.method2352();
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()V", line = 67)
    public final void method71() {
        class232.field3716.glCallList(this.field5263 + 1);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()I", line = 70)
    public final int method66() {
        return 15;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 74)
    public final void method72(int arg0) {
        GL var2 = class232.field3716;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class316.field4898, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class136.field2157) {
                class232.method1662(class136.field2160[class232.field3701 * 64 / 100 % 64]);
            } else if (class232.field3701 != this.field5264) {
                this.field5260[0] = 0.0F;
                this.field5260[1] = 0.0F;
                this.field5260[2] = 0.0F;
                this.field5260[3] = (float) class232.field3701 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field5260, 0);
                this.field5264 = class232.field3701;
            }
        } else if (class136.field2157) {
            this.field5260[0] = 0.0F;
            this.field5260[1] = 0.0F;
            this.field5260[2] = 0.0F;
            this.field5260[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field5260, 0);
        } else {
            class232.method1662(class136.field2160[0]);
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "()V", line = 115)
    private final void method2352() {
        GL var1 = class232.field3716;
        this.field5263 = var1.glGenLists(2);
        var1.glNewList(this.field5263, 4864);
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
        if (class136.field2157) {
            var1.glBindTexture(32879, class136.field2156);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field5261);
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
        var1.glNewList(this.field5263 + 1, 4864);
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
        if (class136.field2157) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
