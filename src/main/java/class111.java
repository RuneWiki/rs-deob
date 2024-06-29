import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class111 implements class18 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    private int field1436 = -1;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    private int field1438 = -1;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[F")
    private float[] field1439 = new float[4];

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Z")
    private static boolean field1437 = false;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "()V", line = 9)
    public static final void method786() {
        GL var0 = class47.field592;
        var0.glClientActiveTexture(method787());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "()I", line = 15)
    public static final int method787() {
        return field1437 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()V", line = 21)
    public final void method127() {
        GL var1 = class47.field592;
        var1.glCallList(this.field1436);
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "()V", line = 26)
    public static final void method788() {
        GL var0 = class47.field592;
        var0.glClientActiveTexture(method787());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()I", line = 32)
    public final int method128() {
        return 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V", line = 39)
    public final void method126() {
        GL var1 = class47.field592;
        var1.glCallList(this.field1436 + 1);
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "()V", line = 44)
    private final void method789() {
        GL var1 = class47.field592;
        this.field1436 = var1.glGenLists(2);
        var1.glNewList(this.field1436, 4864);
        var1.glActiveTexture(33985);
        if (field1437) {
            var1.glBindTexture(32879, class57.field731);
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
        var1.glBindTexture(3552, this.field1438);
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
        var1.glNewList(this.field1436 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1437) {
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

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 171)
    public class111() {
        if (class47.field609 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class47.field592;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1438 = var1[0];
            field1437 = class47.field609 > 2 && class47.field620;
            this.method789();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 121)
    public final void method129(int arg0) {
        GL var2 = class47.field592;
        var2.glActiveTexture(33985);
        if (field1437 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class255.field3738 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class338.field5272 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class348.field5456), (float) (-class30.field357), (float) (-class163.field2311));
            if (field1437) {
                this.field1439[0] = 0.001F;
                this.field1439[1] = 9.0E-4F;
                this.field1439[2] = 0.0F;
                this.field1439[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1439, 0);
                this.field1439[0] = 0.0F;
                this.field1439[1] = 9.0E-4F;
                this.field1439[2] = 0.001F;
                this.field1439[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1439, 0);
                this.field1439[0] = 0.0F;
                this.field1439[1] = 0.0F;
                this.field1439[2] = 0.0F;
                this.field1439[3] = (float) class47.field625 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field1439, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class91.method657(113), 0);
            if (arg0 >= 0) {
                this.field1439[0] = 0.0F;
                this.field1439[1] = 1.0F / (float) class211.field2982;
                this.field1439[2] = 0.0F;
                this.field1439[3] = (float) arg0 * 1.0F / (float) class211.field2982;
                var2.glTexGenfv(8192, 9474, this.field1439, 0);
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
