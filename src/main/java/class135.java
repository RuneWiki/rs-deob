import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class135 implements class223 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    private int field2323 = -1;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    private int field2325 = -1;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[F")
    private float[] field2326 = new float[4];

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    private int field2327 = -1;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[F")
    private static float[] field2324 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "()V", line = 6)
    private final void method950() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class257.field4409;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2325 = var3[0];
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "()V", line = 25)
    public static void method951() {
        field2324 = null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "()I", line = 28)
    public final int method423() {
        return 15;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()V", line = 33)
    public final void method424() {
        GL var1 = class257.field4409;
        class257.method1758(2);
        class257.method1750(2);
        class257.method1743();
        var1.glCallList(this.field2327);
        float var2 = 2662.4001F;
        float var3 = (float) (class204.field3533 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2326[0] = 0.0F;
        this.field2326[1] = 0.0F;
        this.field2326[2] = 1.0F / (var3 - 3328.0F);
        this.field2326[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2326, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2324, 0);
        if (!class230.field3963) {
            class257.method1736(class230.field3961[class257.field4407 * 64 / 100 % 64]);
        } else if (class257.field4407 != this.field2323) {
            this.field2326[0] = 0.0F;
            this.field2326[1] = 0.0F;
            this.field2326[2] = 0.0F;
            this.field2326[3] = (float) class257.field4407 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field2326, 0);
            this.field2323 = class257.field4407;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 164)
    public class135() {
        this.method950();
        this.method952();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 82)
    public final void method426(int arg0) {
        GL var2 = class257.field4409;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class119.field2109, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V", line = 89)
    public final void method419() {
        class257.field4409.glCallList(this.field2327 + 1);
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "()V", line = 94)
    private final void method952() {
        GL var1 = class257.field4409;
        this.field2327 = var1.glGenLists(2);
        var1.glNewList(this.field2327, 4864);
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
        if (class230.field3963) {
            var1.glBindTexture(32879, class230.field3960);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2325);
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
        var1.glNewList(this.field2327 + 1, 4864);
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
        if (class230.field3963) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
