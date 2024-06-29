import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class118 implements class2 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    private int field1822 = -1;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    private int field1824 = -1;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[F")
    private float[] field1823 = new float[4];

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Z")
    private static boolean field1825 = false;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V", line = 7)
    public final void method1() {
        GL var1 = class117.field1801;
        var1.glCallList(this.field1824 + 1);
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "()I", line = 11)
    public static final int method838() {
        return field1825 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "()V", line = 15)
    private final void method839() {
        GL var1 = class117.field1801;
        this.field1824 = var1.glGenLists(2);
        var1.glNewList(this.field1824, 4864);
        var1.glActiveTexture(33985);
        if (field1825) {
            var1.glBindTexture(32879, class133.field2040);
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
        var1.glBindTexture(3552, this.field1822);
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
        var1.glNewList(this.field1824 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1825) {
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

    @OriginalMember(owner = "client!s", name = "f", descriptor = "()V", line = 82)
    public static final void method840() {
        GL var0 = class117.field1801;
        var0.glClientActiveTexture(method838());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 89)
    public final void method3(int arg0) {
        GL var2 = class117.field1801;
        var2.glActiveTexture(33985);
        if (field1825 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class250.field3732 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class200.field2993 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class287.field4340), (float) (-class124.field1932), (float) (-class107.field1671));
            if (field1825) {
                this.field1823[0] = 0.001F;
                this.field1823[1] = 9.0E-4F;
                this.field1823[2] = 0.0F;
                this.field1823[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1823, 0);
                this.field1823[0] = 0.0F;
                this.field1823[1] = 9.0E-4F;
                this.field1823[2] = 0.001F;
                this.field1823[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1823, 0);
                this.field1823[0] = 0.0F;
                this.field1823[1] = 0.0F;
                this.field1823[2] = 0.0F;
                this.field1823[3] = (float) class117.field1818 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field1823, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class258.method1748(-89), 0);
            if (arg0 >= 0) {
                this.field1823[0] = 0.0F;
                this.field1823[1] = 1.0F / (float) class159.field2383;
                this.field1823[2] = 0.0F;
                this.field1823[3] = (float) arg0 * 1.0F / (float) class159.field2383;
                var2.glTexGenfv(8192, 9474, this.field1823, 0);
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

    @OriginalMember(owner = "client!s", name = "b", descriptor = "()I", line = 142)
    public final int method2() {
        return 0;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "()V", line = 146)
    public final void method4() {
        GL var1 = class117.field1801;
        var1.glCallList(this.field1824);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 171)
    public class118() {
        if (class117.field1799 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class117.field1801;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1822 = var1[0];
            field1825 = class117.field1799 > 2 && class117.field1803;
            this.method839();
        }
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "()V", line = 157)
    public static final void method841() {
        GL var0 = class117.field1801;
        var0.glClientActiveTexture(method838());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
