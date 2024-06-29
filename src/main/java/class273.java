import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class273 implements class95 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "[F")
    private float[] field4633 = new float[4];

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    private int field4634 = -1;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    private int field4635 = -1;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Z")
    private static boolean field4636 = false;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()I", line = 5)
    public static final int method1867() {
        return field4636 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V", line = 10)
    public final void method384() {
        GL var1 = class154.field2479;
        var1.glCallList(this.field4635 + 1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 16)
    public final void method385(int arg0) {
        GL var2 = class154.field2479;
        var2.glActiveTexture(33985);
        if (field4636 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class173.field2794 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class113.field1882 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class100.field1643), (float) (-class107.field1737), (float) (-class49.field710));
            if (field4636) {
                this.field4633[0] = 0.001F;
                this.field4633[1] = 9.0E-4F;
                this.field4633[2] = 0.0F;
                this.field4633[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field4633, 0);
                this.field4633[0] = 0.0F;
                this.field4633[1] = 9.0E-4F;
                this.field4633[2] = 0.001F;
                this.field4633[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field4633, 0);
                this.field4633[0] = 0.0F;
                this.field4633[1] = 0.0F;
                this.field4633[2] = 0.0F;
                this.field4633[3] = (float) class154.field2455 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field4633, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class205.method1427(95), 0);
            if (arg0 >= 0) {
                this.field4633[0] = 0.0F;
                this.field4633[1] = 1.0F / (float) class101.field1659;
                this.field4633[2] = 0.0F;
                this.field4633[3] = (float) arg0 * 1.0F / (float) class101.field1659;
                var2.glTexGenfv(8192, 9474, this.field4633, 0);
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

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 171)
    public class273() {
        if (class154.field2472 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class154.field2479;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field4634 = var1[0];
            field4636 = class154.field2472 > 2 && class154.field2473;
            this.method1869();
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "()V", line = 76)
    public static final void method1868() {
        GL var0 = class154.field2479;
        var0.glClientActiveTexture(method1867());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()V", line = 83)
    public final void method387() {
        GL var1 = class154.field2479;
        var1.glCallList(this.field4635);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()I", line = 87)
    public final int method383() {
        return 0;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "()V", line = 92)
    private final void method1869() {
        GL var1 = class154.field2479;
        this.field4635 = var1.glGenLists(2);
        var1.glNewList(this.field4635, 4864);
        var1.glActiveTexture(33985);
        if (field4636) {
            var1.glBindTexture(32879, class40.field617);
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
        var1.glBindTexture(3552, this.field4634);
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
        var1.glNewList(this.field4635 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field4636) {
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

    @OriginalMember(owner = "client!od", name = "g", descriptor = "()V", line = 163)
    public static final void method1870() {
        GL var0 = class154.field2479;
        var0.glClientActiveTexture(method1867());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
