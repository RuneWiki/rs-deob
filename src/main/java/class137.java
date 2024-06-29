import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class137 implements class220 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    private int field2059 = -1;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[F")
    private float[] field2058 = new float[4];

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    private int field2060 = -1;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    private int field2061 = -1;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[F")
    private static float[] field2062 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 6)
    public final void method301(int arg0) {
        GL var2 = class186.field2990;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class185.field2978, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class212.field3461) {
                class186.method1288(class212.field3458[class186.field2993 * 64 / 100 % 64]);
            } else if (class186.field2993 != this.field2060) {
                this.field2058[0] = 0.0F;
                this.field2058[1] = 0.0F;
                this.field2058[2] = 0.0F;
                this.field2058[3] = (float) class186.field2993 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field2058, 0);
                this.field2060 = class186.field2993;
            }
        } else if (class212.field3461) {
            this.field2058[0] = 0.0F;
            this.field2058[1] = 0.0F;
            this.field2058[2] = 0.0F;
            this.field2058[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2058, 0);
        } else {
            class186.method1288(class212.field3458[0]);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()V", line = 46)
    public final void method303() {
        class186.field2990.glCallList(this.field2061 + 1);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 182)
    public class137() {
        this.method929();
        this.method930();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V", line = 56)
    public final void method300() {
        GL var1 = class186.field2990;
        class186.method1281(2);
        class186.method1299(2);
        class186.method1287();
        var1.glCallList(this.field2061);
        float var2 = 2662.4001F;
        float var3 = (float) (class114.field1723 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2058[0] = 0.0F;
        this.field2058[1] = 0.0F;
        this.field2058[2] = 1.0F / (var3 - 3328.0F);
        this.field2058[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2058, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2062, 0);
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()V", line = 81)
    public static void method928() {
        field2062 = null;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "()V", line = 87)
    private final void method929() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class186.field2990;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2059 = var3[0];
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()I", line = 107)
    public final int method304() {
        return 15;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "()V", line = 115)
    private final void method930() {
        GL var1 = class186.field2990;
        this.field2061 = var1.glGenLists(2);
        var1.glNewList(this.field2061, 4864);
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
        if (class212.field3461) {
            var1.glBindTexture(32879, class212.field3455);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2059);
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
        var1.glNewList(this.field2061 + 1, 4864);
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
        if (class212.field3461) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
