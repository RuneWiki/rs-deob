import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class65 implements class210 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    private int field1117 = -1;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    private int field1118 = -1;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "[F")
    private float[] field1120 = new float[4];

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    private int field1121 = -1;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "[F")
    private static float[] field1119 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()I", line = 5)
    public final int method482() {
        return 15;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "()V", line = 9)
    public final void method483() {
        GL var1 = class108.field1899;
        class108.method766(2);
        class108.method765(2);
        class108.method764();
        var1.glCallList(this.field1118);
        float var2 = 2662.4001F;
        float var3 = (float) (class31.field533 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field1120[0] = 0.0F;
        this.field1120[1] = 0.0F;
        this.field1120[2] = 1.0F / (var3 - 3328.0F);
        this.field1120[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field1120, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field1119, 0);
        if (!class99.field1755) {
            class108.method736(class99.field1756[class108.field1905 * 64 / 100 % 64]);
        } else if (class108.field1905 != this.field1117) {
            this.field1120[0] = 0.0F;
            this.field1120[1] = 0.0F;
            this.field1120[2] = 0.0F;
            this.field1120[3] = (float) class108.field1905 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field1120, 0);
            this.field1117 = class108.field1905;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 47)
    public final void method484(int arg0) {
        GL var2 = class108.field1899;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class323.field5437, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 98)
    public class65() {
        this.method487();
        this.method488();
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "()V", line = 61)
    public static void method485() {
        field1119 = null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()V", line = 64)
    public final void method486() {
        class108.field1899.glCallList(this.field1118 + 1);
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "()V", line = 71)
    private final void method487() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class108.field1899;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field1121 = var3[0];
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "()V", line = 104)
    private final void method488() {
        GL var1 = class108.field1899;
        this.field1118 = var1.glGenLists(2);
        var1.glNewList(this.field1118, 4864);
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
        if (class99.field1755) {
            var1.glBindTexture(32879, class99.field1757);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field1121);
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
        var1.glNewList(this.field1118 + 1, 4864);
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
        if (class99.field1755) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
