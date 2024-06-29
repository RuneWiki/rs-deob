import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class268 implements class173 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    private int field4169 = -1;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    private int field4170 = -1;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[F")
    private float[] field4173 = new float[4];

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    private int field4172 = -1;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "[F")
    private static float[] field4171 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()V", line = 6)
    public final void method354() {
        GL var1 = class109.field1456;
        class109.method766(2);
        class109.method756(2);
        class109.method762();
        var1.glCallList(this.field4170);
        float var2 = 2662.4001F;
        float var3 = (float) (class339.field5296 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field4173[0] = 0.0F;
        this.field4173[1] = 0.0F;
        this.field4173[2] = 1.0F / (var3 - 3328.0F);
        this.field4173[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field4173, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field4171, 0);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()I", line = 27)
    public final int method352() {
        return 15;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V", line = 30)
    public final void method355() {
        class109.field1456.glCallList(this.field4170 + 1);
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()V", line = 33)
    public static void method1903() {
        field4171 = null;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "()V", line = 41)
    private final void method1904() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class109.field1456;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field4169 = var3[0];
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 182)
    public class268() {
        this.method1904();
        this.method1905();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 62)
    public final void method353(int arg0) {
        GL var2 = class109.field1456;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class183.field2972, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class148.field2325) {
                class109.method752(class148.field2327[class109.field1472 * 64 / 100 % 64]);
            } else if (class109.field1472 != this.field4172) {
                this.field4173[0] = 0.0F;
                this.field4173[1] = 0.0F;
                this.field4173[2] = 0.0F;
                this.field4173[3] = (float) class109.field1472 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field4173, 0);
                this.field4172 = class109.field1472;
            }
        } else if (class148.field2325) {
            this.field4173[0] = 0.0F;
            this.field4173[1] = 0.0F;
            this.field4173[2] = 0.0F;
            this.field4173[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field4173, 0);
        } else {
            class109.method752(class148.field2327[0]);
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "()V", line = 107)
    private final void method1905() {
        GL var1 = class109.field1456;
        this.field4170 = var1.glGenLists(2);
        var1.glNewList(this.field4170, 4864);
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
        if (class148.field2325) {
            var1.glBindTexture(32879, class148.field2330);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field4169);
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
        var1.glNewList(this.field4170 + 1, 4864);
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
        if (class148.field2325) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
