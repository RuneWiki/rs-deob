import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class12 implements class40 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[F")
    private float[] field146 = new float[4];

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    private int field147 = -1;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    private int field149 = -1;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Z")
    private static boolean field148 = false;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()V", line = 7)
    private final void method65() {
        GL var1 = class232.field3716;
        this.field147 = var1.glGenLists(2);
        var1.glNewList(this.field147, 4864);
        var1.glActiveTexture(33985);
        if (field148) {
            var1.glBindTexture(32879, class136.field2156);
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
        var1.glBindTexture(3552, this.field149);
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
        var1.glNewList(this.field147 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field148) {
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

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()I", line = 72)
    public final int method66() {
        return 0;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "()V", line = 76)
    public static final void method67() {
        GL var0 = class232.field3716;
        var0.glClientActiveTexture(method68());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "()I", line = 82)
    public static final int method68() {
        return field148 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V", line = 88)
    public final void method69() {
        GL var1 = class232.field3716;
        var1.glCallList(this.field147);
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "()V", line = 94)
    public static final void method70() {
        GL var0 = class232.field3716;
        var0.glClientActiveTexture(method68());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V", line = 101)
    public final void method71() {
        GL var1 = class232.field3716;
        var1.glCallList(this.field147 + 1);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 107)
    public final void method72(int arg0) {
        GL var2 = class232.field3716;
        var2.glActiveTexture(33985);
        if (field148 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class61.field883 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class191.field3123 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class24.field329), (float) (-class338.field5270), (float) (-class123.field1923));
            if (field148) {
                this.field146[0] = 0.001F;
                this.field146[1] = 9.0E-4F;
                this.field146[2] = 0.0F;
                this.field146[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field146, 0);
                this.field146[0] = 0.0F;
                this.field146[1] = 9.0E-4F;
                this.field146[2] = 0.001F;
                this.field146[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field146, 0);
                this.field146[0] = 0.0F;
                this.field146[1] = 0.0F;
                this.field146[2] = 0.0F;
                this.field146[3] = (float) class232.field3701 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field146, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class208.method1508((byte) -97), 0);
            if (arg0 >= 0) {
                this.field146[0] = 0.0F;
                this.field146[1] = 1.0F / (float) class111.field1654;
                this.field146[2] = 0.0F;
                this.field146[3] = (float) arg0 * 1.0F / (float) class111.field1654;
                var2.glTexGenfv(8192, 9474, this.field146, 0);
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

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 171)
    public class12() {
        if (class232.field3721 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class232.field3716;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field149 = var1[0];
            field148 = class232.field3721 > 2 && class232.field3708;
            this.method65();
        }
    }
}
