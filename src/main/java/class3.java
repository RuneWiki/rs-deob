import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class3 implements class25 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    private int field26 = -1;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    private int field27 = -1;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "[F")
    private float[] field29 = new float[4];

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Z")
    private static boolean field28 = false;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "()V", line = 7)
    private final void method12() {
        GL var1 = class45.field688;
        this.field26 = var1.glGenLists(2);
        var1.glNewList(this.field26, 4864);
        var1.glActiveTexture(33985);
        if (field28) {
            var1.glBindTexture(32879, class224.field3697);
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
        var1.glBindTexture(3552, this.field27);
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
        var1.glNewList(this.field26 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field28) {
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

    @OriginalMember(owner = "client!il", name = "e", descriptor = "()I", line = 72)
    public static final int method13() {
        return field28 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "()V", line = 76)
    public static final void method14() {
        GL var0 = class45.field688;
        var0.glClientActiveTexture(method13());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "()V", line = 86)
    public final void method15() {
        GL var1 = class45.field688;
        var1.glCallList(this.field26);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 92)
    public final void method16(int arg0) {
        GL var2 = class45.field688;
        var2.glActiveTexture(33985);
        if (field28 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class86.field1303 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class89.field1332 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class282.field4789), (float) (-class223.field3687), (float) (-class150.field2167));
            if (field28) {
                this.field29[0] = 0.001F;
                this.field29[1] = 9.0E-4F;
                this.field29[2] = 0.0F;
                this.field29[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field29, 0);
                this.field29[0] = 0.0F;
                this.field29[1] = 9.0E-4F;
                this.field29[2] = 0.001F;
                this.field29[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field29, 0);
                this.field29[0] = 0.0F;
                this.field29[1] = 0.0F;
                this.field29[2] = 0.0F;
                this.field29[3] = (float) class45.field660 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field29, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class141.method905(false), 0);
            if (arg0 >= 0) {
                this.field29[0] = 0.0F;
                this.field29[1] = 1.0F / (float) class59.field921;
                this.field29[2] = 0.0F;
                this.field29[3] = (float) arg0 * 1.0F / (float) class59.field921;
                var2.glTexGenfv(8192, 9474, this.field29, 0);
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

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 166)
    public class3() {
        if (class45.field662 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class45.field688;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field27 = var1[0];
            field28 = class45.field662 > 2 && class45.field690;
            this.method12();
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()I", line = 146)
    public final int method17() {
        return 0;
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "()V", line = 154)
    public static final void method18() {
        GL var0 = class45.field688;
        var0.glClientActiveTexture(method13());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()V", line = 198)
    public final void method19() {
        GL var1 = class45.field688;
        var1.glCallList(this.field26 + 1);
    }
}
