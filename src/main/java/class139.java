import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class139 implements class323 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[F")
    private float[] field2308 = new float[4];

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    private int field2307 = -1;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    private int field2310 = -1;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    private int field2309 = -1;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[F")
    private static float[] field2311 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 7)
    public final void method186(int arg0) {
        GL var2 = class249.field3898;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class33.field668, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class207.field3354) {
                class249.method1689(class207.field3356[class249.field3892 * 64 / 100 % 64]);
            } else if (class249.field3892 != this.field2307) {
                this.field2308[0] = 0.0F;
                this.field2308[1] = 0.0F;
                this.field2308[2] = 0.0F;
                this.field2308[3] = (float) class249.field3892 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field2308, 0);
                this.field2307 = class249.field3892;
            }
        } else if (class207.field3354) {
            this.field2308[0] = 0.0F;
            this.field2308[1] = 0.0F;
            this.field2308[2] = 0.0F;
            this.field2308[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2308, 0);
        } else {
            class249.method1689(class207.field3356[0]);
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()V", line = 51)
    public static void method908() {
        field2311 = null;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 158)
    public class139() {
        this.method910();
        this.method909();
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()V", line = 62)
    public final void method188() {
        GL var1 = class249.field3898;
        class249.method1653(2);
        class249.method1681(2);
        class249.method1657();
        var1.glCallList(this.field2310);
        float var2 = 2662.4001F;
        float var3 = (float) (class283.field4380 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2308[0] = 0.0F;
        this.field2308[1] = 0.0F;
        this.field2308[2] = 1.0F / (var3 - 3328.0F);
        this.field2308[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2308, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2311, 0);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()V", line = 83)
    public final void method185() {
        class249.field3898.glCallList(this.field2310 + 1);
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "()V", line = 87)
    private final void method909() {
        GL var1 = class249.field3898;
        this.field2310 = var1.glGenLists(2);
        var1.glNewList(this.field2310, 4864);
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
        if (class207.field3354) {
            var1.glBindTexture(32879, class207.field3360);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2309);
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
        var1.glNewList(this.field2310 + 1, 4864);
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
        if (class207.field3354) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "()V", line = 164)
    private final void method910() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class249.field3898;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2309 = var3[0];
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()I", line = 180)
    public final int method187() {
        return 15;
    }
}
