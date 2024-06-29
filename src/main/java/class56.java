import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class56 implements class99 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    private int field811 = -1;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    private int field812 = -1;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[F")
    private float[] field810 = new float[4];

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Z")
    private static boolean field813 = false;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()V", line = 7)
    public final void method150() {
        GL var1 = class166.field2648;
        var1.glCallList(this.field812);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()I", line = 11)
    public final int method153() {
        return 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V", line = 16)
    public final void method152() {
        GL var1 = class166.field2648;
        var1.glCallList(this.field812 + 1);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 23)
    public final void method155(int arg0) {
        GL var2 = class166.field2648;
        var2.glActiveTexture(33985);
        if (field813 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class95.field1405 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class65.field998 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class297.field4797), (float) (-class24.field371), (float) (-class315.field5326));
            if (field813) {
                this.field810[0] = 0.001F;
                this.field810[1] = 9.0E-4F;
                this.field810[2] = 0.0F;
                this.field810[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field810, 0);
                this.field810[0] = 0.0F;
                this.field810[1] = 9.0E-4F;
                this.field810[2] = 0.001F;
                this.field810[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field810, 0);
                this.field810[0] = 0.0F;
                this.field810[1] = 0.0F;
                this.field810[2] = 0.0F;
                this.field810[3] = (float) class166.field2630 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field810, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class52.method359(-61), 0);
            if (arg0 >= 0) {
                this.field810[0] = 0.0F;
                this.field810[1] = 1.0F / (float) class139.field2145;
                this.field810[2] = 0.0F;
                this.field810[3] = (float) arg0 * 1.0F / (float) class139.field2145;
                var2.glTexGenfv(8192, 9474, this.field810, 0);
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

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 160)
    public class56() {
        if (class166.field2617 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class166.field2648;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field811 = var1[0];
            field813 = class166.field2617 > 2 && class166.field2623;
            this.method394();
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()V", line = 78)
    public static final void method392() {
        GL var0 = class166.field2648;
        var0.glClientActiveTexture(method393());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "()I", line = 84)
    public static final int method393() {
        return field813 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "()V", line = 96)
    private final void method394() {
        GL var1 = class166.field2648;
        this.field812 = var1.glGenLists(2);
        var1.glNewList(this.field812, 4864);
        var1.glActiveTexture(33985);
        if (field813) {
            var1.glBindTexture(32879, class71.field1063);
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
        var1.glBindTexture(3552, this.field811);
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
        var1.glNewList(this.field812 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field813) {
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

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "()V", line = 196)
    public static final void method395() {
        GL var0 = class166.field2648;
        var0.glClientActiveTexture(method393());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
