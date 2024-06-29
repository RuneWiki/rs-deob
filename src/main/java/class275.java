import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class275 implements class182 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "[F")
    private float[] field4257 = new float[4];

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    private int field4258 = -1;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    private int field4259 = -1;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    private int field4256 = -1;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "[F")
    private static float[] field4260 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 6)
    public final void method229(int arg0) {
        GL var2 = class240.field3771;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class270.field4167, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class333.field5106) {
                class240.method1786(class333.field5100[class240.field3748 * 64 / 100 % 64]);
            } else if (class240.field3748 != this.field4259) {
                this.field4257[0] = 0.0F;
                this.field4257[1] = 0.0F;
                this.field4257[2] = 0.0F;
                this.field4257[3] = (float) class240.field3748 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field4257, 0);
                this.field4259 = class240.field3748;
            }
        } else if (class333.field5106) {
            this.field4257[0] = 0.0F;
            this.field4257[1] = 0.0F;
            this.field4257[2] = 0.0F;
            this.field4257[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field4257, 0);
        } else {
            class240.method1786(class333.field5100[0]);
        }
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "()V", line = 50)
    private final void method2020() {
        GL var1 = class240.field3771;
        this.field4258 = var1.glGenLists(2);
        var1.glNewList(this.field4258, 4864);
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
        if (class333.field5106) {
            var1.glBindTexture(32879, class333.field5104);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field4256);
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
        var1.glNewList(this.field4258 + 1, 4864);
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
        if (class333.field5106) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V", line = 116)
    public final void method231() {
        GL var1 = class240.field3771;
        class240.method1814(2);
        class240.method1806(2);
        class240.method1805();
        var1.glCallList(this.field4258);
        float var2 = 2662.4001F;
        float var3 = (float) (class290.field4516 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field4257[0] = 0.0F;
        this.field4257[1] = 0.0F;
        this.field4257[2] = 1.0F / (var3 - 3328.0F);
        this.field4257[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field4257, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field4260, 0);
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "()V", line = 138)
    public static void method2021() {
        field4260 = null;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 181)
    public class275() {
        this.method2022();
        this.method2020();
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()V", line = 149)
    public final void method232() {
        class240.field3771.glCallList(this.field4258 + 1);
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()I", line = 159)
    public final int method230() {
        return 15;
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "()V", line = 166)
    private final void method2022() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class240.field3771;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field4256 = var3[0];
    }
}
