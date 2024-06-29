import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class68 implements class73 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    private int field1318 = -1;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[F")
    private float[] field1316 = new float[4];

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    private int field1317 = -1;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Z")
    private static boolean field1319 = false;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()V", line = 8)
    public static final void method553() {
        GL var0 = class123.field2212;
        var0.glClientActiveTexture(method560());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()I", line = 14)
    public final int method554() {
        return 0;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V", line = 20)
    public final void method555() {
        GL var1 = class123.field2212;
        var1.glCallList(this.field1318 + 1);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 171)
    public class68() {
        if (class123.field2238 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class123.field2212;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1317 = var1[0];
            field1319 = class123.field2238 > 2 && class123.field2236;
            this.method559();
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()V", line = 29)
    public final void method556() {
        GL var1 = class123.field2212;
        var1.glCallList(this.field1318);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 35)
    public final void method557(int arg0) {
        GL var2 = class123.field2212;
        var2.glActiveTexture(33985);
        if (field1319 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class306.field5238 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class218.field3709 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class65.field1294), (float) (-class296.field5099), (float) (-class53.field874));
            if (field1319) {
                this.field1316[0] = 0.001F;
                this.field1316[1] = 9.0E-4F;
                this.field1316[2] = 0.0F;
                this.field1316[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1316, 0);
                this.field1316[0] = 0.0F;
                this.field1316[1] = 9.0E-4F;
                this.field1316[2] = 0.001F;
                this.field1316[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1316, 0);
                this.field1316[0] = 0.0F;
                this.field1316[1] = 0.0F;
                this.field1316[2] = 0.0F;
                this.field1316[3] = (float) class123.field2226 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field1316, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class223.method1611(0), 0);
            if (arg0 >= 0) {
                this.field1316[0] = 0.0F;
                this.field1316[1] = 1.0F / (float) class74.field1403;
                this.field1316[2] = 0.0F;
                this.field1316[3] = (float) arg0 * 1.0F / (float) class74.field1403;
                var2.glTexGenfv(8192, 9474, this.field1316, 0);
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

    @OriginalMember(owner = "client!je", name = "e", descriptor = "()V", line = 88)
    public static final void method558() {
        GL var0 = class123.field2212;
        var0.glClientActiveTexture(method560());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "()V", line = 95)
    private final void method559() {
        GL var1 = class123.field2212;
        this.field1318 = var1.glGenLists(2);
        var1.glNewList(this.field1318, 4864);
        var1.glActiveTexture(33985);
        if (field1319) {
            var1.glBindTexture(32879, class212.field3573);
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
        var1.glBindTexture(3552, this.field1317);
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
        var1.glNewList(this.field1318 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1319) {
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

    @OriginalMember(owner = "client!je", name = "g", descriptor = "()I", line = 160)
    public static final int method560() {
        return field1319 ? 33986 : 33985;
    }
}
