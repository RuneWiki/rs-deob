import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class169 implements class67 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    private int field2801 = -1;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    private int field2800 = -1;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    private int field2802 = -1;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "[F")
    private float[] field2803 = new float[4];

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "[F")
    private static float[] field2799 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()V", line = 7)
    private final void method1202() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class241.field4012;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2800 = var3[0];
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()V", line = 24)
    public final void method224() {
        GL var1 = class241.field4012;
        class241.method1719(2);
        class241.method1718(2);
        class241.method1702();
        var1.glCallList(this.field2802);
        float var2 = 2662.4001F;
        float var3 = (float) (class49.field1023 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2803[0] = 0.0F;
        this.field2803[1] = 0.0F;
        this.field2803[2] = 1.0F / (var3 - 3328.0F);
        this.field2803[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2803, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2799, 0);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()I", line = 45)
    public final int method226() {
        return 15;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "()V", line = 49)
    public static void method1203() {
        field2799 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 56)
    public final void method225(int arg0) {
        GL var2 = class241.field4012;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class105.field1924, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class106.field1934) {
                class241.method1687(class106.field1935[class241.field4024 * 64 / 100 % 64]);
            } else if (class241.field4024 != this.field2801) {
                this.field2803[0] = 0.0F;
                this.field2803[1] = 0.0F;
                this.field2803[2] = 0.0F;
                this.field2803[3] = (float) class241.field4024 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field2803, 0);
                this.field2801 = class241.field4024;
            }
        } else if (class106.field1934) {
            this.field2803[0] = 0.0F;
            this.field2803[1] = 0.0F;
            this.field2803[2] = 0.0F;
            this.field2803[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2803, 0);
        } else {
            class241.method1687(class106.field1935[0]);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 113)
    public class169() {
        this.method1202();
        this.method1204();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V", line = 118)
    public final void method222() {
        class241.field4012.glCallList(this.field2802 + 1);
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "()V", line = 122)
    private final void method1204() {
        GL var1 = class241.field4012;
        this.field2802 = var1.glGenLists(2);
        var1.glNewList(this.field2802, 4864);
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
        if (class106.field1934) {
            var1.glBindTexture(32879, class106.field1929);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2800);
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
        var1.glNewList(this.field2802 + 1, 4864);
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
        if (class106.field1934) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
