import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class191 implements class215 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "[F")
    private float[] field3272 = new float[4];

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    private int field3275 = -1;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    private int field3274 = -1;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    private int field3276 = -1;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "[F")
    private static float[] field3273 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "()V", line = 6)
    private final void method1362() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class56.field848;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field3275 = var3[0];
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "()V", line = 22)
    public final void method23() {
        class56.field848.glCallList(this.field3274 + 1);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()I", line = 26)
    public final int method19() {
        return 15;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "()V", line = 32)
    public final void method18() {
        GL var1 = class56.field848;
        class56.method381(2);
        class56.method351(2);
        class56.method382();
        var1.glCallList(this.field3274);
        float var2 = 2662.4001F;
        float var3 = (float) (class237.field4000 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field3272[0] = 0.0F;
        this.field3272[1] = 0.0F;
        this.field3272[2] = 1.0F / (var3 - 3328.0F);
        this.field3272[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field3272, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field3273, 0);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 54)
    public final void method21(int arg0) {
        GL var2 = class56.field848;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class209.field3594, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class149.field2738) {
                class56.method354(class149.field2740[class56.field871 * 64 / 100 % 64]);
            } else if (class56.field871 != this.field3276) {
                this.field3272[0] = 0.0F;
                this.field3272[1] = 0.0F;
                this.field3272[2] = 0.0F;
                this.field3272[3] = (float) class56.field871 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field3272, 0);
                this.field3276 = class56.field871;
            }
        } else if (class149.field2738) {
            this.field3272[0] = 0.0F;
            this.field3272[1] = 0.0F;
            this.field3272[2] = 0.0F;
            this.field3272[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field3272, 0);
        } else {
            class56.method354(class149.field2740[0]);
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 182)
    public class191() {
        this.method1362();
        this.method1363();
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "()V", line = 102)
    private final void method1363() {
        GL var1 = class56.field848;
        this.field3274 = var1.glGenLists(2);
        var1.glNewList(this.field3274, 4864);
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
        if (class149.field2738) {
            var1.glBindTexture(32879, class149.field2735);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field3275);
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
        var1.glNewList(this.field3274 + 1, 4864);
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
        if (class149.field2738) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "()V", line = 176)
    public static void method1364() {
        field3273 = null;
    }
}
