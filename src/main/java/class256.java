import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class256 implements class203 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "[F")
    private float[] field4248 = new float[4];

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    private int field4252 = -1;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    private int field4251 = -1;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    private int field4249 = -1;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "[F")
    private static float[] field4250 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()I", line = 7)
    public final int method14() {
        return 15;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()V", line = 13)
    private final void method1780() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class55.field812;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field4251 = var3[0];
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()V", line = 29)
    public final void method12() {
        class55.field812.glCallList(this.field4252 + 1);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 164)
    public class256() {
        this.method1780();
        this.method1781();
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()V", line = 37)
    public final void method13() {
        GL var1 = class55.field812;
        class55.method386(2);
        class55.method405(2);
        class55.method414();
        var1.glCallList(this.field4252);
        float var2 = 2662.4001F;
        float var3 = (float) (class84.field1320 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field4248[0] = 0.0F;
        this.field4248[1] = 0.0F;
        this.field4248[2] = 1.0F / (var3 - 3328.0F);
        this.field4248[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field4248, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field4250, 0);
        if (!class278.field4769) {
            class55.method407(class278.field4766[class55.field821 * 64 / 100 % 64]);
        } else if (class55.field821 != this.field4249) {
            this.field4248[0] = 0.0F;
            this.field4248[1] = 0.0F;
            this.field4248[2] = 0.0F;
            this.field4248[3] = (float) class55.field821 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field4248, 0);
            this.field4249 = class55.field821;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V", line = 76)
    private final void method1781() {
        GL var1 = class55.field812;
        this.field4252 = var1.glGenLists(2);
        var1.glNewList(this.field4252, 4864);
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
        if (class278.field4769) {
            var1.glBindTexture(32879, class278.field4767);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field4251);
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
        var1.glNewList(this.field4252 + 1, 4864);
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
        if (class278.field4769) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 143)
    public final void method11(int arg0) {
        GL var2 = class55.field812;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class300.field5137, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()V", line = 159)
    public static void method1782() {
        field4250 = null;
    }
}
