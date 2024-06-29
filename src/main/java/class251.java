import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class251 implements class38 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    private int field4045 = -1;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    private int field4046 = -1;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    private int field4047 = -1;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "[F")
    private float[] field4048 = new float[4];

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[F")
    private static float[] field4044 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V", line = 5)
    public final void method293() {
        class264.field4313.glCallList(this.field4045 + 1);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()V", line = 13)
    public final void method295() {
        GL var1 = class264.field4313;
        class264.method1719(2);
        class264.method1720(2);
        class264.method1706();
        var1.glCallList(this.field4045);
        float var2 = 2662.4001F;
        float var3 = (float) (class270.field4458 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field4048[0] = 0.0F;
        this.field4048[1] = 0.0F;
        this.field4048[2] = 1.0F / (var3 - 3328.0F);
        this.field4048[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field4048, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field4044, 0);
        if (!class136.field2197) {
            class264.method1722(class136.field2198[class264.field4319 * 64 / 100 % 64]);
        } else if (class264.field4319 != this.field4047) {
            this.field4048[0] = 0.0F;
            this.field4048[1] = 0.0F;
            this.field4048[2] = 0.0F;
            this.field4048[3] = (float) class264.field4319 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field4048, 0);
            this.field4047 = class264.field4319;
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "()V", line = 52)
    private final void method1618() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class264.field4313;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field4046 = var3[0];
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "()V", line = 69)
    private final void method1619() {
        GL var1 = class264.field4313;
        this.field4045 = var1.glGenLists(2);
        var1.glNewList(this.field4045, 4864);
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
        if (class136.field2197) {
            var1.glBindTexture(32879, class136.field2203);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field4046);
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
        var1.glNewList(this.field4045 + 1, 4864);
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
        if (class136.field2197) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "()V", line = 134)
    public static void method1620() {
        field4044 = null;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V", line = 164)
    public class251() {
        this.method1618();
        this.method1619();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 149)
    public final void method294(int arg0) {
        GL var2 = class264.field4313;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class86.field1304, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "()I", line = 159)
    public final int method296() {
        return 15;
    }
}
