import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class88 implements class13 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    private int field1347 = -1;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[F")
    private float[] field1348 = new float[4];

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    private int field1349 = -1;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Z")
    private static boolean field1346 = false;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()I", line = 6)
    public static final int method600() {
        return field1346 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()V", line = 13)
    public final void method49() {
        GL var1 = class90.field1390;
        var1.glCallList(this.field1349);
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "()V", line = 19)
    private final void method601() {
        GL var1 = class90.field1390;
        this.field1349 = var1.glGenLists(2);
        var1.glNewList(this.field1349, 4864);
        var1.glActiveTexture(33985);
        if (field1346) {
            var1.glBindTexture(32879, class184.field2949);
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
        var1.glBindTexture(3552, this.field1347);
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
        var1.glNewList(this.field1349 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1346) {
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

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "()V", line = 86)
    public static final void method602() {
        GL var0 = class90.field1390;
        var0.glClientActiveTexture(method600());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "()V", line = 93)
    public static final void method603() {
        GL var0 = class90.field1390;
        var0.glClientActiveTexture(method600());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 171)
    public class88() {
        if (class90.field1360 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class90.field1390;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1347 = var1[0];
            field1346 = class90.field1360 > 2 && class90.field1358;
            this.method601();
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()V", line = 107)
    public final void method50() {
        GL var1 = class90.field1390;
        var1.glCallList(this.field1349 + 1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 118)
    public final void method47(int arg0) {
        GL var2 = class90.field1390;
        var2.glActiveTexture(33985);
        if (field1346 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class83.field1259 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class87.field1340 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class288.field4850), (float) (-class297.field5024), (float) (-class79.field1134));
            if (field1346) {
                this.field1348[0] = 0.001F;
                this.field1348[1] = 9.0E-4F;
                this.field1348[2] = 0.0F;
                this.field1348[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1348, 0);
                this.field1348[0] = 0.0F;
                this.field1348[1] = 9.0E-4F;
                this.field1348[2] = 0.001F;
                this.field1348[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1348, 0);
                this.field1348[0] = 0.0F;
                this.field1348[1] = 0.0F;
                this.field1348[2] = 0.0F;
                this.field1348[3] = (float) class90.field1388 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field1348, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class289.method1985(true), 0);
            if (arg0 >= 0) {
                this.field1348[0] = 0.0F;
                this.field1348[1] = 1.0F / (float) class254.field4349;
                this.field1348[2] = 0.0F;
                this.field1348[3] = (float) arg0 * 1.0F / (float) class254.field4349;
                var2.glTexGenfv(8192, 9474, this.field1348, 0);
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

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()I", line = 169)
    public final int method48() {
        return 0;
    }
}
