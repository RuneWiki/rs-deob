import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class18 implements class177 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    private int field244 = -1;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    private int field246 = -1;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "[F")
    private float[] field248 = new float[4];

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    private int field247 = -1;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "[F")
    private static float[] field245 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "()V", line = 5)
    public static void method122() {
        field245 = null;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "()V", line = 10)
    public final void method26() {
        GL var1 = class67.field899;
        class67.method489(2);
        class67.method457(2);
        class67.method477();
        var1.glCallList(this.field246);
        float var2 = 2662.4001F;
        float var3 = (float) (class150.field2069 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field248[0] = 0.0F;
        this.field248[1] = 0.0F;
        this.field248[2] = 1.0F / (var3 - 3328.0F);
        this.field248[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field248, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field245, 0);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 32)
    public final void method29(int arg0) {
        GL var2 = class67.field899;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class8.field82, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class69.field943) {
                class67.method479(class69.field944[class67.field900 * 64 / 100 % 64]);
            } else if (class67.field900 != this.field244) {
                this.field248[0] = 0.0F;
                this.field248[1] = 0.0F;
                this.field248[2] = 0.0F;
                this.field248[3] = (float) class67.field900 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field248, 0);
                this.field244 = class67.field900;
            }
        } else if (class69.field943) {
            this.field248[0] = 0.0F;
            this.field248[1] = 0.0F;
            this.field248[2] = 0.0F;
            this.field248[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field248, 0);
        } else {
            class67.method479(class69.field944[0]);
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "()V", line = 73)
    private final void method123() {
        GL var1 = class67.field899;
        this.field246 = var1.glGenLists(2);
        var1.glNewList(this.field246, 4864);
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
        if (class69.field943) {
            var1.glBindTexture(32879, class69.field948);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field247);
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
        var1.glNewList(this.field246 + 1, 4864);
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
        if (class69.field943) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "()V", line = 139)
    public final void method30() {
        class67.field899.glCallList(this.field246 + 1);
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 182)
    public class18() {
        this.method124();
        this.method123();
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "()V", line = 147)
    private final void method124() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class67.field899;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field247 = var3[0];
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()I", line = 167)
    public final int method25() {
        return 15;
    }
}
