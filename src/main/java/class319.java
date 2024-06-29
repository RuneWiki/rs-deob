import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class319 implements class115 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[F")
    private float[] field5521 = new float[4];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    private int field5520 = -1;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    private int field5522 = -1;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Z")
    private static boolean field5519 = false;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()V", line = 8)
    public final void method65() {
        GL var1 = class147.field2479;
        var1.glCallList(this.field5522 + 1);
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "()V", line = 16)
    public static final void method2194() {
        GL var0 = class147.field2479;
        var0.glClientActiveTexture(method2197());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()I", line = 22)
    public final int method63() {
        return 0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 26)
    public final void method66(int arg0) {
        GL var2 = class147.field2479;
        var2.glActiveTexture(33985);
        if (field5519 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class28.field374 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class324.field5566 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class62.field967), (float) (-class104.field1842), (float) (-class273.field4605));
            if (field5519) {
                this.field5521[0] = 0.001F;
                this.field5521[1] = 9.0E-4F;
                this.field5521[2] = 0.0F;
                this.field5521[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field5521, 0);
                this.field5521[0] = 0.0F;
                this.field5521[1] = 9.0E-4F;
                this.field5521[2] = 0.001F;
                this.field5521[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field5521, 0);
                this.field5521[0] = 0.0F;
                this.field5521[1] = 0.0F;
                this.field5521[2] = 0.0F;
                this.field5521[3] = (float) class147.field2481 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field5521, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class51.method361(-65), 0);
            if (arg0 >= 0) {
                this.field5521[0] = 0.0F;
                this.field5521[1] = 1.0F / (float) class265.field4526;
                this.field5521[2] = 0.0F;
                this.field5521[3] = (float) arg0 * 1.0F / (float) class265.field4526;
                var2.glTexGenfv(8192, 9474, this.field5521, 0);
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

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "()V", line = 78)
    public static final void method2195() {
        GL var0 = class147.field2479;
        var0.glClientActiveTexture(method2197());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "()V", line = 87)
    public final void method64() {
        GL var1 = class147.field2479;
        var1.glCallList(this.field5522);
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "()V", line = 93)
    private final void method2196() {
        GL var1 = class147.field2479;
        this.field5522 = var1.glGenLists(2);
        var1.glNewList(this.field5522, 4864);
        var1.glActiveTexture(33985);
        if (field5519) {
            var1.glBindTexture(32879, class49.field809);
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
        var1.glBindTexture(3552, this.field5520);
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
        var1.glNewList(this.field5522 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field5519) {
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

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V", line = 171)
    public class319() {
        if (class147.field2506 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class147.field2479;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field5520 = var1[0];
            field5519 = class147.field2506 > 2 && class147.field2500;
            this.method2196();
        }
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "()I", line = 163)
    public static final int method2197() {
        return field5519 ? 33986 : 33985;
    }
}
