import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class85 implements class220 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    private int field1285 = -1;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[F")
    private float[] field1287 = new float[4];

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    private int field1288 = -1;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
    private static boolean field1286 = false;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "()V", line = 7)
    public final void method303() {
        GL var1 = class186.field2990;
        var1.glCallList(this.field1288 + 1);
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "()V", line = 12)
    private final void method622() {
        GL var1 = class186.field2990;
        this.field1288 = var1.glGenLists(2);
        var1.glNewList(this.field1288, 4864);
        var1.glActiveTexture(33985);
        if (field1286) {
            var1.glBindTexture(32879, class212.field3455);
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
        var1.glBindTexture(3552, this.field1285);
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
        var1.glNewList(this.field1288 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1286) {
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

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "()V", line = 79)
    public static final void method623() {
        GL var0 = class186.field2990;
        var0.glClientActiveTexture(method624());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "()I", line = 85)
    public static final int method624() {
        return field1286 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()V", line = 89)
    public final void method300() {
        GL var1 = class186.field2990;
        var1.glCallList(this.field1288);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 98)
    public final void method301(int arg0) {
        GL var2 = class186.field2990;
        var2.glActiveTexture(33985);
        if (field1286 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class114.field1723 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class92.field1419 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class271.field4299), (float) (-class210.field3440), (float) (-class330.field5149));
            if (field1286) {
                this.field1287[0] = 0.001F;
                this.field1287[1] = 9.0E-4F;
                this.field1287[2] = 0.0F;
                this.field1287[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1287, 0);
                this.field1287[0] = 0.0F;
                this.field1287[1] = 9.0E-4F;
                this.field1287[2] = 0.001F;
                this.field1287[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1287, 0);
                this.field1287[0] = 0.0F;
                this.field1287[1] = 0.0F;
                this.field1287[2] = 0.0F;
                this.field1287[3] = (float) class186.field2993 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field1287, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class315.method2188(5247), 0);
            if (arg0 >= 0) {
                this.field1287[0] = 0.0F;
                this.field1287[1] = 1.0F / (float) class325.field5072;
                this.field1287[2] = 0.0F;
                this.field1287[3] = (float) arg0 * 1.0F / (float) class325.field5072;
                var2.glTexGenfv(8192, 9474, this.field1287, 0);
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

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 171)
    public class85() {
        if (class186.field2985 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class186.field2990;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1285 = var1[0];
            field1286 = class186.field2985 > 2 && class186.field3003;
            this.method622();
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()I", line = 152)
    public final int method304() {
        return 0;
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "()V", line = 163)
    public static final void method625() {
        GL var0 = class186.field2990;
        var0.glClientActiveTexture(method624());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
