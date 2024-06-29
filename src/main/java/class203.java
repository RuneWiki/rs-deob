import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class203 implements class335 {

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    private int field3162 = -1;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[F")
    private float[] field3163 = new float[4];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    private int field3164 = -1;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    private int field3165 = -1;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[F")
    private static float[] field3166 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()V", line = 7)
    public static void method1455() {
        field3166 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 11)
    public final void method786(int arg0) {
        GL var2 = class162.field2654;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class55.field849, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class252.field3709) {
                class162.method1219(class252.field3713[class162.field2656 * 64 / 100 % 64]);
            } else if (class162.field2656 != this.field3165) {
                this.field3163[0] = 0.0F;
                this.field3163[1] = 0.0F;
                this.field3163[2] = 0.0F;
                this.field3163[3] = (float) class162.field2656 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field3163, 0);
                this.field3165 = class162.field2656;
            }
        } else if (class252.field3709) {
            this.field3163[0] = 0.0F;
            this.field3163[1] = 0.0F;
            this.field3163[2] = 0.0F;
            this.field3163[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field3163, 0);
        } else {
            class162.method1219(class252.field3713[0]);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()V", line = 53)
    public final void method785() {
        GL var1 = class162.field2654;
        class162.method1206(2);
        class162.method1211(2);
        class162.method1214();
        var1.glCallList(this.field3164);
        float var2 = 2662.4001F;
        float var3 = (float) (class331.field5160 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field3163[0] = 0.0F;
        this.field3163[1] = 0.0F;
        this.field3163[2] = 1.0F / (var3 - 3328.0F);
        this.field3163[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field3163, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field3166, 0);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()V", line = 76)
    public final void method787() {
        class162.field2654.glCallList(this.field3164 + 1);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 182)
    public class203() {
        this.method1457();
        this.method1456();
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "()V", line = 89)
    private final void method1456() {
        GL var1 = class162.field2654;
        this.field3164 = var1.glGenLists(2);
        var1.glNewList(this.field3164, 4864);
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
        if (class252.field3709) {
            var1.glBindTexture(32879, class252.field3712);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field3162);
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
        var1.glNewList(this.field3164 + 1, 4864);
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
        if (class252.field3709) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()I", line = 155)
    public final int method784() {
        return 15;
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "()V", line = 159)
    private final void method1457() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class162.field2654;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field3162 = var3[0];
    }
}
