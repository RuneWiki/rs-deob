import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class103 implements class29 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    private int field1481 = -1;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    private int field1482 = -1;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[F")
    private float[] field1483 = new float[4];

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    private int field1484 = -1;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "[F")
    private static float[] field1480 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "()V", line = 5)
    public static void method697() {
        field1480 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()V", line = 9)
    public final void method37() {
        class217.field3551.glCallList(this.field1484 + 1);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()V", line = 13)
    public final void method34() {
        GL var1 = class217.field3551;
        class217.method1454(2);
        class217.method1475(2);
        class217.method1458();
        var1.glCallList(this.field1484);
        float var2 = 2662.4001F;
        float var3 = (float) (class131.field1997 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field1483[0] = 0.0F;
        this.field1483[1] = 0.0F;
        this.field1483[2] = 1.0F / (var3 - 3328.0F);
        this.field1483[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field1483, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field1480, 0);
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "()V", line = 36)
    private final void method698() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class217.field3551;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field1482 = var3[0];
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 182)
    public class103() {
        this.method698();
        this.method699();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 57)
    public final void method35(int arg0) {
        GL var2 = class217.field3551;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class136.field2087, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class293.field5014) {
                class217.method1457(class293.field5015[class217.field3521 * 64 / 100 % 64]);
            } else if (class217.field3521 != this.field1481) {
                this.field1483[0] = 0.0F;
                this.field1483[1] = 0.0F;
                this.field1483[2] = 0.0F;
                this.field1483[3] = (float) class217.field3521 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field1483, 0);
                this.field1481 = class217.field3521;
            }
        } else if (class293.field5014) {
            this.field1483[0] = 0.0F;
            this.field1483[1] = 0.0F;
            this.field1483[2] = 0.0F;
            this.field1483[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field1483, 0);
        } else {
            class217.method1457(class293.field5015[0]);
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "()I", line = 98)
    public final int method36() {
        return 15;
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "()V", line = 102)
    private final void method699() {
        GL var1 = class217.field3551;
        this.field1484 = var1.glGenLists(2);
        var1.glNewList(this.field1484, 4864);
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
        if (class293.field5014) {
            var1.glBindTexture(32879, class293.field5016);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field1482);
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
        var1.glNewList(this.field1484 + 1, 4864);
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
        if (class293.field5014) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
