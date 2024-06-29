import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class241 implements class145 {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    private int field3824 = -1;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    private int field3821 = -1;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[F")
    private float[] field3825 = new float[4];

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    private int field3823 = -1;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[F")
    private static float[] field3822 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()V", line = 6)
    public final void method318() {
        class333.field5160.glCallList(this.field3821 + 1);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()V", line = 17)
    public final void method315() {
        GL var1 = class333.field5160;
        class333.method2306(2);
        class333.method2285(2);
        class333.method2300();
        var1.glCallList(this.field3821);
        float var2 = 2662.4001F;
        float var3 = (float) (class143.field2261 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field3825[0] = 0.0F;
        this.field3825[1] = 0.0F;
        this.field3825[2] = 1.0F / (var3 - 3328.0F);
        this.field3825[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field3825, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field3822, 0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()I", line = 38)
    public final int method320() {
        return 15;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "()V", line = 42)
    private final void method1644() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class333.field5160;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field3823 = var3[0];
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "()V", line = 60)
    private final void method1645() {
        GL var1 = class333.field5160;
        this.field3821 = var1.glGenLists(2);
        var1.glNewList(this.field3821, 4864);
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
        if (class49.field699) {
            var1.glBindTexture(32879, class49.field702);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field3823);
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
        var1.glNewList(this.field3821 + 1, 4864);
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
        if (class49.field699) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "()V", line = 126)
    public static void method1646() {
        field3822 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 130)
    public final void method321(int arg0) {
        GL var2 = class333.field5160;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class113.field1726, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class49.field699) {
                class333.method2282(class49.field703[class333.field5180 * 64 / 100 % 64]);
            } else if (class333.field5180 != this.field3824) {
                this.field3825[0] = 0.0F;
                this.field3825[1] = 0.0F;
                this.field3825[2] = 0.0F;
                this.field3825[3] = (float) class333.field5180 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field3825, 0);
                this.field3824 = class333.field5180;
            }
        } else if (class49.field699) {
            this.field3825[0] = 0.0F;
            this.field3825[1] = 0.0F;
            this.field3825[2] = 0.0F;
            this.field3825[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field3825, 0);
        } else {
            class333.method2282(class49.field703[0]);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 182)
    public class241() {
        this.method1644();
        this.method1645();
    }
}
