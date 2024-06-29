import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class59 implements class95 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    private int field863 = -1;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    private int field862 = -1;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[F")
    private float[] field864 = new float[4];

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    private int field866 = -1;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "[F")
    private static float[] field865 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!si", name = "b", descriptor = "()I", line = 7)
    public final int method383() {
        return 15;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 164)
    public class59() {
        this.method386();
        this.method388();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V", line = 15)
    public final void method384() {
        class154.field2479.glCallList(this.field866 + 1);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 19)
    public final void method385(int arg0) {
        GL var2 = class154.field2479;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class73.field1119, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "()V", line = 27)
    private final void method386() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class154.field2479;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field863 = var3[0];
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "()V", line = 45)
    public final void method387() {
        GL var1 = class154.field2479;
        class154.method1115(2);
        class154.method1128(2);
        class154.method1107();
        var1.glCallList(this.field866);
        float var2 = 2662.4001F;
        float var3 = (float) (class173.field2794 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field864[0] = 0.0F;
        this.field864[1] = 0.0F;
        this.field864[2] = 1.0F / (var3 - 3328.0F);
        this.field864[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field864, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field865, 0);
        if (!class40.field616) {
            class154.method1141(class40.field613[class154.field2455 * 64 / 100 % 64]);
        } else if (class154.field2455 != this.field862) {
            this.field864[0] = 0.0F;
            this.field864[1] = 0.0F;
            this.field864[2] = 0.0F;
            this.field864[3] = (float) class154.field2455 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field864, 0);
            this.field862 = class154.field2455;
        }
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "()V", line = 85)
    private final void method388() {
        GL var1 = class154.field2479;
        this.field866 = var1.glGenLists(2);
        var1.glNewList(this.field866, 4864);
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
        if (class40.field616) {
            var1.glBindTexture(32879, class40.field617);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field863);
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
        var1.glNewList(this.field866 + 1, 4864);
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
        if (class40.field616) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "()V", line = 159)
    public static void method389() {
        field865 = null;
    }
}
