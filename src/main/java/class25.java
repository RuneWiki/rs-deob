import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class25 implements class8 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[F")
    private float[] field278 = new float[4];

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    private int field279 = -1;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    private int field280 = -1;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Z")
    private static boolean field277 = false;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V", line = 7)
    public final void method70() {
        GL var1 = class36.field518;
        var1.glCallList(this.field279);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 12)
    public final void method72(int arg0) {
        GL var2 = class36.field518;
        var2.glActiveTexture(33985);
        if (field277 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class137.field2137 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class325.field5058 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class117.field1821), (float) (-class45.field699), (float) (-class53.field799));
            if (field277) {
                this.field278[0] = 0.001F;
                this.field278[1] = 9.0E-4F;
                this.field278[2] = 0.0F;
                this.field278[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field278, 0);
                this.field278[0] = 0.0F;
                this.field278[1] = 9.0E-4F;
                this.field278[2] = 0.001F;
                this.field278[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field278, 0);
                this.field278[0] = 0.0F;
                this.field278[1] = 0.0F;
                this.field278[2] = 0.0F;
                this.field278[3] = (float) class36.field514 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field278, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class257.method1786((byte) -113), 0);
            if (arg0 >= 0) {
                this.field278[0] = 0.0F;
                this.field278[1] = 1.0F / (float) class121.field1916;
                this.field278[2] = 0.0F;
                this.field278[3] = (float) arg0 * 1.0F / (float) class121.field1916;
                var2.glTexGenfv(8192, 9474, this.field278, 0);
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

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()V", line = 64)
    public static final void method154() {
        GL var0 = class36.field518;
        var0.glClientActiveTexture(method155());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "()I", line = 73)
    public static final int method155() {
        return field277 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "()V", line = 78)
    private final void method156() {
        GL var1 = class36.field518;
        this.field279 = var1.glGenLists(2);
        var1.glNewList(this.field279, 4864);
        var1.glActiveTexture(33985);
        if (field277) {
            var1.glBindTexture(32879, class19.field212);
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
        var1.glBindTexture(3552, this.field280);
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
        var1.glNewList(this.field279 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field277) {
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

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 171)
    public class25() {
        if (class36.field513 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class36.field518;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field280 = var1[0];
            field277 = class36.field513 > 2 && class36.field523;
            this.method156();
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "()V", line = 150)
    public static final void method157() {
        GL var0 = class36.field518;
        var0.glClientActiveTexture(method155());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()I", line = 157)
    public final int method71() {
        return 0;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()V", line = 164)
    public final void method73() {
        GL var1 = class36.field518;
        var1.glCallList(this.field279 + 1);
    }
}
