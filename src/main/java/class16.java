import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class16 implements class217 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    private int field209 = -1;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "[F")
    private float[] field211 = new float[4];

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    private int field212 = -1;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    private int field213 = -1;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "[F")
    private static float[] field210 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()I", line = 5)
    public final int method90() {
        return 15;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 182)
    public class16() {
        this.method94();
        this.method96();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()V", line = 14)
    public final void method91() {
        class253.field4319.glCallList(this.field212 + 1);
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "()V", line = 17)
    public static void method92() {
        field210 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 21)
    public final void method93(int arg0) {
        GL var2 = class253.field4319;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class124.field2204, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class296.field5127) {
                class253.method1714(class296.field5128[class253.field4326 * 64 / 100 % 64]);
            } else if (class253.field4326 != this.field209) {
                this.field211[0] = 0.0F;
                this.field211[1] = 0.0F;
                this.field211[2] = 0.0F;
                this.field211[3] = (float) class253.field4326 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field211, 0);
                this.field209 = class253.field4326;
            }
        } else if (class296.field5127) {
            this.field211[0] = 0.0F;
            this.field211[1] = 0.0F;
            this.field211[2] = 0.0F;
            this.field211[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field211, 0);
        } else {
            class253.method1714(class296.field5128[0]);
        }
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "()V", line = 63)
    private final void method94() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class253.field4319;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field213 = var3[0];
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "()V", line = 80)
    public final void method95() {
        GL var1 = class253.field4319;
        class253.method1704(2);
        class253.method1731(2);
        class253.method1737();
        var1.glCallList(this.field212);
        float var2 = 2662.4001F;
        float var3 = (float) (class74.field1353 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field211[0] = 0.0F;
        this.field211[1] = 0.0F;
        this.field211[2] = 1.0F / (var3 - 3328.0F);
        this.field211[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field211, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field210, 0);
    }

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "()V", line = 112)
    private final void method96() {
        GL var1 = class253.field4319;
        this.field212 = var1.glGenLists(2);
        var1.glNewList(this.field212, 4864);
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
        if (class296.field5127) {
            var1.glBindTexture(32879, class296.field5130);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field213);
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
        var1.glNewList(this.field212 + 1, 4864);
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
        if (class296.field5127) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
