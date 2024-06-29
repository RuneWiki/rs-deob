import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class161 implements class39 {

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    private int field2647 = -1;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    private int field2646 = -1;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[F")
    private float[] field2648 = new float[4];

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Z")
    private static boolean field2645 = false;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "()V", line = 6)
    public static final void method977() {
        GL var0 = class167.field2806;
        var0.glClientActiveTexture(method978());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "()I", line = 14)
    public static final int method978() {
        return field2645 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "()V", line = 18)
    public static final void method979() {
        GL var0 = class167.field2806;
        var0.glClientActiveTexture(method978());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 25)
    public final void method246(int arg0) {
        GL var2 = class167.field2806;
        var2.glActiveTexture(33985);
        if (field2645 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class75.field1316 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class45.field615 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class128.field2134), (float) (-class36.field533), (float) (-class277.field4629));
            if (field2645) {
                this.field2648[0] = 0.001F;
                this.field2648[1] = 9.0E-4F;
                this.field2648[2] = 0.0F;
                this.field2648[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field2648, 0);
                this.field2648[0] = 0.0F;
                this.field2648[1] = 9.0E-4F;
                this.field2648[2] = 0.001F;
                this.field2648[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field2648, 0);
                this.field2648[0] = 0.0F;
                this.field2648[1] = 0.0F;
                this.field2648[2] = 0.0F;
                this.field2648[3] = (float) class167.field2803 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field2648, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class81.method529(-21663), 0);
            if (arg0 >= 0) {
                this.field2648[0] = 0.0F;
                this.field2648[1] = 1.0F / (float) class60.field830;
                this.field2648[2] = 0.0F;
                this.field2648[3] = (float) arg0 * 1.0F / (float) class60.field830;
                var2.glTexGenfv(8192, 9474, this.field2648, 0);
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

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()V", line = 77)
    public final void method245() {
        GL var1 = class167.field2806;
        var1.glCallList(this.field2647 + 1);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()V", line = 88)
    public final void method247() {
        GL var1 = class167.field2806;
        var1.glCallList(this.field2647);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()I", line = 92)
    public final int method244() {
        return 0;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 171)
    public class161() {
        if (class167.field2782 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class167.field2806;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field2646 = var1[0];
            field2645 = class167.field2782 > 2 && class167.field2801;
            this.method980();
        }
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "()V", line = 107)
    private final void method980() {
        GL var1 = class167.field2806;
        this.field2647 = var1.glGenLists(2);
        var1.glNewList(this.field2647, 4864);
        var1.glActiveTexture(33985);
        if (field2645) {
            var1.glBindTexture(32879, class73.field1285);
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
        var1.glBindTexture(3552, this.field2646);
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
        var1.glNewList(this.field2647 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field2645) {
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
}
