import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class275 implements class236 {

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[F")
    private float[] field4364 = new float[4];

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    private int field4365 = -1;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    private int field4367 = -1;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Z")
    private static boolean field4366 = false;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "()V", line = 6)
    public static final void method1881() {
        GL var0 = class43.field651;
        var0.glClientActiveTexture(method1883());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()I", line = 12)
    public final int method237() {
        return 0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V", line = 16)
    public final void method245() {
        GL var1 = class43.field651;
        var1.glCallList(this.field4365);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()V", line = 23)
    public final void method243() {
        GL var1 = class43.field651;
        var1.glCallList(this.field4365 + 1);
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "()V", line = 29)
    public static final void method1882() {
        GL var0 = class43.field651;
        var0.glClientActiveTexture(method1883());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "()I", line = 35)
    public static final int method1883() {
        return field4366 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 171)
    public class275() {
        if (class43.field672 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class43.field651;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field4367 = var1[0];
            field4366 = class43.field672 > 2 && class43.field678;
            this.method1884();
        }
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "()V", line = 42)
    private final void method1884() {
        GL var1 = class43.field651;
        this.field4365 = var1.glGenLists(2);
        var1.glNewList(this.field4365, 4864);
        var1.glActiveTexture(33985);
        if (field4366) {
            var1.glBindTexture(32879, class6.field86);
            var1.glTexEnvi(8960, 34161, 260);
            var1.glTexEnvi(8960, 34192, 768);
            var1.glTexEnvi(8960, 34162, 7681);
            var1.glTexEnvi(8960, 34184, 34168);
            var1.glTexGeni(8192, 9472, 9216);
            var1.glTexGeni(8194, 9472, 9216);
            var1.glTexGeni(8193, 9472, 9216);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3168);
            var1.glEnable(3169);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
            var1.glActiveTexture(33986);
            var1.glTexEnvi(8960, 8704, 34160);
        }
        var1.glBindTexture(3552, this.field4367);
        var1.glTexEnvi(8960, 34161, 34165);
        var1.glTexEnvi(8960, 34176, 34166);
        var1.glTexEnvi(8960, 34178, 5890);
        var1.glTexEnvi(8960, 34162, 7681);
        var1.glTexEnvi(8960, 34184, 34168);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glEnable(3552);
        var1.glEnable(3168);
        var1.glActiveTexture(33984);
        var1.glEndList();
        var1.glNewList(this.field4365 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field4366) {
            var1.glTexEnvi(8960, 34161, 8448);
            var1.glTexEnvi(8960, 34192, 768);
            var1.glTexEnvi(8960, 34162, 8448);
            var1.glTexEnvi(8960, 34184, 5890);
            var1.glDisable(3168);
            var1.glDisable(3169);
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
            var1.glActiveTexture(33986);
            var1.glTexEnvi(8960, 8704, 8448);
        }
        var1.glTexEnvfv(8960, 8705, new float[] { 0.0F, 1.0F, 0.0F, 1.0F }, 0);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34176, 5890);
        var1.glTexEnvi(8960, 34178, 34166);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glDisable(3552);
        var1.glDisable(3168);
        var1.glActiveTexture(33984);
        var1.glEndList();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 116)
    public final void method239(int arg0) {
        GL var2 = class43.field651;
        var2.glActiveTexture(33985);
        if (field4366 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class90.field1423 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class142.field2598 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class180.field3041), (float) (-class51.field808), (float) (-class160.field2838));
            if (field4366) {
                this.field4364[0] = 0.001F;
                this.field4364[1] = 9.0E-4F;
                this.field4364[2] = 0.0F;
                this.field4364[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field4364, 0);
                this.field4364[0] = 0.0F;
                this.field4364[1] = 9.0E-4F;
                this.field4364[2] = 0.001F;
                this.field4364[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field4364, 0);
                this.field4364[0] = 0.0F;
                this.field4364[1] = 0.0F;
                this.field4364[2] = 0.0F;
                this.field4364[3] = (float) class43.field675 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field4364, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class344.method2409(3), 0);
            if (arg0 >= 0) {
                this.field4364[0] = 0.0F;
                this.field4364[1] = 1.0F / (float) class101.field1631;
                this.field4364[2] = 0.0F;
                this.field4364[3] = (float) arg0 * 1.0F / (float) class101.field1631;
                var2.glTexGenfv(8192, 9474, this.field4364, 0);
                var2.glEnable(3168);
            } else {
                var2.glDisable(3168);
            }
            var2.glPopMatrix();
        } else {
            var2.glDisable(3168);
        }
        var2.glActiveTexture(33984);
    }
}
