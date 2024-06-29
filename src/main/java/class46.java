import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class46 implements class70 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    private int field542 = -1;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    private int field544 = -1;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    private int field546 = -1;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[F")
    private float[] field545 = new float[4];

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "[F")
    private static float[] field543 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()I", line = 7)
    public final int method16() {
        return 15;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()V", line = 11)
    public final void method15() {
        class250.field3818.glCallList(this.field542 + 1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 16)
    public final void method14(int arg0) {
        GL var2 = class250.field3818;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class280.field4351, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class246.field3723) {
                class250.method1806(class246.field3721[class250.field3796 * 64 / 100 % 64]);
            } else if (class250.field3796 != this.field546) {
                this.field545[0] = 0.0F;
                this.field545[1] = 0.0F;
                this.field545[2] = 0.0F;
                this.field545[3] = (float) class250.field3796 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field545, 0);
                this.field546 = class250.field3796;
            }
        } else if (class246.field3723) {
            this.field545[0] = 0.0F;
            this.field545[1] = 0.0F;
            this.field545[2] = 0.0F;
            this.field545[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field545, 0);
        } else {
            class250.method1806(class246.field3721[0]);
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()V", line = 57)
    private final void method271() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class250.field3818;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field544 = var3[0];
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 182)
    public class46() {
        this.method271();
        this.method272();
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()V", line = 90)
    private final void method272() {
        GL var1 = class250.field3818;
        this.field542 = var1.glGenLists(2);
        var1.glNewList(this.field542, 4864);
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
        if (class246.field3723) {
            var1.glBindTexture(32879, class246.field3724);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field544);
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
        var1.glNewList(this.field542 + 1, 4864);
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
        if (class246.field3723) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "()V", line = 155)
    public static void method273() {
        field543 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()V", line = 162)
    public final void method17() {
        GL var1 = class250.field3818;
        class250.method1797(2);
        class250.method1812(2);
        class250.method1834();
        var1.glCallList(this.field542);
        float var2 = 2662.4001F;
        float var3 = (float) (class319.field4906 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field545[0] = 0.0F;
        this.field545[1] = 0.0F;
        this.field545[2] = 1.0F / (var3 - 3328.0F);
        this.field545[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field545, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field543, 0);
    }
}
