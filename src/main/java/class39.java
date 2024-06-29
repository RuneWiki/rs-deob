import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class39 implements class163 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[F")
    private float[] field570 = new float[4];

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    private int field571 = -1;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    private int field573 = -1;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Z")
    private static boolean field572 = false;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()I", line = 5)
    public final int method281() {
        return 0;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()V", line = 10)
    public static final void method282() {
        GL var0 = class141.field2025;
        var0.glClientActiveTexture(method285());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()V", line = 18)
    public final void method283() {
        GL var1 = class141.field2025;
        var1.glCallList(this.field573);
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "()V", line = 23)
    public static final void method284() {
        GL var0 = class141.field2025;
        var0.glClientActiveTexture(method285());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 171)
    public class39() {
        if (class141.field2054 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class141.field2025;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field571 = var1[0];
            field572 = class141.field2054 > 2 && class141.field2012;
            this.method287();
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "()I", line = 33)
    public static final int method285() {
        return field572 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 37)
    public final void method286(int arg0) {
        GL var2 = class141.field2025;
        var2.glActiveTexture(33985);
        if (field572 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class303.field4530 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class126.field1829 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class112.field1630), (float) (-class59.field872), (float) (-class145.field2094));
            if (field572) {
                this.field570[0] = 0.001F;
                this.field570[1] = 9.0E-4F;
                this.field570[2] = 0.0F;
                this.field570[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field570, 0);
                this.field570[0] = 0.0F;
                this.field570[1] = 9.0E-4F;
                this.field570[2] = 0.001F;
                this.field570[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field570, 0);
                this.field570[0] = 0.0F;
                this.field570[1] = 0.0F;
                this.field570[2] = 0.0F;
                this.field570[3] = (float) class141.field2045 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field570, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class221.method1619(1), 0);
            if (arg0 >= 0) {
                this.field570[0] = 0.0F;
                this.field570[1] = 1.0F / (float) class40.field586;
                this.field570[2] = 0.0F;
                this.field570[3] = (float) arg0 * 1.0F / (float) class40.field586;
                var2.glTexGenfv(8192, 9474, this.field570, 0);
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

    @OriginalMember(owner = "client!je", name = "g", descriptor = "()V", line = 90)
    private final void method287() {
        GL var1 = class141.field2025;
        this.field573 = var1.glGenLists(2);
        var1.glNewList(this.field573, 4864);
        var1.glActiveTexture(33985);
        if (field572) {
            var1.glBindTexture(32879, class245.field3646);
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
        var1.glBindTexture(3552, this.field571);
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
        var1.glNewList(this.field573 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field572) {
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

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V", line = 157)
    public final void method288() {
        GL var1 = class141.field2025;
        var1.glCallList(this.field573 + 1);
    }
}
