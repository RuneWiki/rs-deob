import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class263 implements class217 {

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "[F")
    private float[] field4528 = new float[4];

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    private int field4526 = -1;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    private int field4527 = -1;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Z")
    private static boolean field4525 = false;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()I", line = 8)
    public final int method90() {
        return 0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 13)
    public final void method93(int arg0) {
        GL var2 = class253.field4319;
        var2.glActiveTexture(33985);
        if (field4525 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class74.field1353 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class284.field4934 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class191.field3496), (float) (-class256.field4428), (float) (-class98.field1752));
            if (field4525) {
                this.field4528[0] = 0.001F;
                this.field4528[1] = 9.0E-4F;
                this.field4528[2] = 0.0F;
                this.field4528[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field4528, 0);
                this.field4528[0] = 0.0F;
                this.field4528[1] = 9.0E-4F;
                this.field4528[2] = 0.001F;
                this.field4528[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field4528, 0);
                this.field4528[0] = 0.0F;
                this.field4528[1] = 0.0F;
                this.field4528[2] = 0.0F;
                this.field4528[3] = (float) class253.field4326 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field4528, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class247.method1667(true), 0);
            if (arg0 >= 0) {
                this.field4528[0] = 0.0F;
                this.field4528[1] = 1.0F / (float) class119.field2119;
                this.field4528[2] = 0.0F;
                this.field4528[3] = (float) arg0 * 1.0F / (float) class119.field2119;
                var2.glTexGenfv(8192, 9474, this.field4528, 0);
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

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()V", line = 65)
    public static final void method1842() {
        GL var0 = class253.field4319;
        var0.glClientActiveTexture(method1844());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 166)
    public class263() {
        if (class253.field4328 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class253.field4319;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field4527 = var1[0];
            field4525 = class253.field4328 > 2 && class253.field4299;
            this.method1845();
        }
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "()V", line = 79)
    public static final void method1843() {
        GL var0 = class253.field4319;
        var0.glClientActiveTexture(method1844());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "()I", line = 90)
    public static final int method1844() {
        return field4525 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "()V", line = 97)
    private final void method1845() {
        GL var1 = class253.field4319;
        this.field4526 = var1.glGenLists(2);
        var1.glNewList(this.field4526, 4864);
        var1.glActiveTexture(33985);
        if (field4525) {
            var1.glBindTexture(32879, class296.field5130);
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
        var1.glBindTexture(3552, this.field4527);
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
        var1.glNewList(this.field4526 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field4525) {
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

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 163)
    public final void method91() {
        GL var1 = class253.field4319;
        var1.glCallList(this.field4526 + 1);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()V", line = 198)
    public final void method95() {
        GL var1 = class253.field4319;
        var1.glCallList(this.field4526);
    }
}
