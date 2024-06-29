import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class296 implements class147 {

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    private int field5267 = -1;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[F")
    private float[] field5266 = new float[4];

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    private int field5265 = -1;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    private int field5268 = -1;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[F")
    private static float[] field5264 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()V", line = 10)
    public final void method73() {
        class97.field1801.glCallList(this.field5267 + 1);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 182)
    public class296() {
        this.method2097();
        this.method2095();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 18)
    public final void method75(int arg0) {
        GL var2 = class97.field1801;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class28.field678, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class129.field2358) {
                class97.method803(class129.field2356[class97.field1816 * 64 / 100 % 64]);
            } else if (class97.field1816 != this.field5268) {
                this.field5266[0] = 0.0F;
                this.field5266[1] = 0.0F;
                this.field5266[2] = 0.0F;
                this.field5266[3] = (float) class97.field1816 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field5266, 0);
                this.field5268 = class97.field1816;
            }
        } else if (class129.field2358) {
            this.field5266[0] = 0.0F;
            this.field5266[1] = 0.0F;
            this.field5266[2] = 0.0F;
            this.field5266[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field5266, 0);
        } else {
            class97.method803(class129.field2356[0]);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V", line = 59)
    public final void method76() {
        GL var1 = class97.field1801;
        class97.method835(2);
        class97.method811(2);
        class97.method829();
        var1.glCallList(this.field5267);
        float var2 = 2662.4001F;
        float var3 = (float) (class260.field4627 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field5266[0] = 0.0F;
        this.field5266[1] = 0.0F;
        this.field5266[2] = 1.0F / (var3 - 3328.0F);
        this.field5266[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field5266, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field5264, 0);
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()V", line = 83)
    private final void method2095() {
        GL var1 = class97.field1801;
        this.field5267 = var1.glGenLists(2);
        var1.glNewList(this.field5267, 4864);
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
        if (class129.field2358) {
            var1.glBindTexture(32879, class129.field2357);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field5265);
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
        var1.glNewList(this.field5267 + 1, 4864);
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
        if (class129.field2358) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()I", line = 151)
    public final int method72() {
        return 15;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()V", line = 157)
    public static void method2096() {
        field5264 = null;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "()V", line = 161)
    private final void method2097() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class97.field1801;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field5265 = var3[0];
    }
}
