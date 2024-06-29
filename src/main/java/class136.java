import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class136 implements class5 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "[F")
    private float[] field2266 = new float[4];

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    private int field2267 = -1;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    private int field2270 = -1;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    private int field2269 = -1;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[F")
    private static float[] field2268 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "()V", line = 6)
    private final void method1033() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class42.field627;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2269 = var3[0];
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 24)
    public final void method19(int arg0) {
        GL var2 = class42.field627;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class140.field2307, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class150.field2394) {
                class42.method273(class150.field2393[class42.field609 * 64 / 100 % 64]);
            } else if (class42.field609 != this.field2267) {
                this.field2266[0] = 0.0F;
                this.field2266[1] = 0.0F;
                this.field2266[2] = 0.0F;
                this.field2266[3] = (float) class42.field609 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field2266, 0);
                this.field2267 = class42.field609;
            }
        } else if (class150.field2394) {
            this.field2266[0] = 0.0F;
            this.field2266[1] = 0.0F;
            this.field2266[2] = 0.0F;
            this.field2266[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2266, 0);
        } else {
            class42.method273(class150.field2393[0]);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 182)
    public class136() {
        this.method1033();
        this.method1035();
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "()V", line = 70)
    public static void method1034() {
        field2268 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()V", line = 73)
    public final void method18() {
        class42.field627.glCallList(this.field2270 + 1);
    }

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "()V", line = 77)
    private final void method1035() {
        GL var1 = class42.field627;
        this.field2270 = var1.glGenLists(2);
        var1.glNewList(this.field2270, 4864);
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
        if (class150.field2394) {
            var1.glBindTexture(32879, class150.field2389);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2269);
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
        var1.glNewList(this.field2270 + 1, 4864);
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
        if (class150.field2394) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()I", line = 150)
    public final int method20() {
        return 15;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "()V", line = 159)
    public final void method21() {
        GL var1 = class42.field627;
        class42.method275(2);
        class42.method277(2);
        class42.method299();
        var1.glCallList(this.field2270);
        float var2 = 2662.4001F;
        float var3 = (float) (class113.field1848 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2266[0] = 0.0F;
        this.field2266[1] = 0.0F;
        this.field2266[2] = 1.0F / (var3 - 3328.0F);
        this.field2266[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2266, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2268, 0);
    }
}
