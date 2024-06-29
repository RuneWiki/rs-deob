import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class5 implements class177 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[F")
    private float[] field43 = new float[4];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    private int field41 = -1;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    private int field44 = -1;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Z")
    private static boolean field42 = false;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()V", line = 6)
    public static final void method23() {
        GL var0 = class67.field899;
        var0.glClientActiveTexture(method27());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "()V", line = 13)
    private final void method24() {
        GL var1 = class67.field899;
        this.field44 = var1.glGenLists(2);
        var1.glNewList(this.field44, 4864);
        var1.glActiveTexture(33985);
        if (field42) {
            var1.glBindTexture(32879, class69.field948);
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
        var1.glBindTexture(3552, this.field41);
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
        var1.glNewList(this.field44 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field42) {
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

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()I", line = 79)
    public final int method25() {
        return 0;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V", line = 83)
    public final void method26() {
        GL var1 = class67.field899;
        var1.glCallList(this.field44);
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "()I", line = 93)
    public static final int method27() {
        return field42 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "()V", line = 97)
    public static final void method28() {
        GL var0 = class67.field899;
        var0.glClientActiveTexture(method27());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 104)
    public final void method29(int arg0) {
        GL var2 = class67.field899;
        var2.glActiveTexture(33985);
        if (field42 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class150.field2069 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class259.field3820 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class271.field4059), (float) (-class189.field2610), (float) (-class236.field3351));
            if (field42) {
                this.field43[0] = 0.001F;
                this.field43[1] = 9.0E-4F;
                this.field43[2] = 0.0F;
                this.field43[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field43, 0);
                this.field43[0] = 0.0F;
                this.field43[1] = 9.0E-4F;
                this.field43[2] = 0.001F;
                this.field43[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field43, 0);
                this.field43[0] = 0.0F;
                this.field43[1] = 0.0F;
                this.field43[2] = 0.0F;
                this.field43[3] = (float) class67.field900 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field43, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class6.method34(-18072), 0);
            if (arg0 >= 0) {
                this.field43[0] = 0.0F;
                this.field43[1] = 1.0F / (float) class243.field3472;
                this.field43[2] = 0.0F;
                this.field43[3] = (float) arg0 * 1.0F / (float) class243.field3472;
                var2.glTexGenfv(8192, 9474, this.field43, 0);
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

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 166)
    public class5() {
        if (class67.field881 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class67.field899;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field41 = var1[0];
            field42 = class67.field881 > 2 && class67.field912;
            this.method24();
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V", line = 198)
    public final void method30() {
        GL var1 = class67.field899;
        var1.glCallList(this.field44 + 1);
    }
}
