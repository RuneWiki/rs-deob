import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class155 implements class66 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    private int field2608 = -1;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[F")
    private float[] field2611 = new float[4];

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    private int field2610 = -1;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Z")
    private static boolean field2609 = false;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()I", line = 10)
    public static final int method1203() {
        return field2609 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V", line = 16)
    public final void method93() {
        GL var1 = class21.field377;
        var1.glCallList(this.field2610 + 1);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()V", line = 21)
    public final void method92() {
        GL var1 = class21.field377;
        var1.glCallList(this.field2610);
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "()V", line = 26)
    private final void method1204() {
        GL var1 = class21.field377;
        this.field2610 = var1.glGenLists(2);
        var1.glNewList(this.field2610, 4864);
        var1.glActiveTexture(33985);
        if (field2609) {
            var1.glBindTexture(32879, class176.field2896);
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
        var1.glBindTexture(3552, this.field2608);
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
        var1.glNewList(this.field2610 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field2609) {
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

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 164)
    public class155() {
        if (class21.field365 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class21.field377;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field2608 = var1[0];
            field2609 = class21.field365 > 2 && class21.field384;
            this.method1204();
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 97)
    public final void method94(int arg0) {
        GL var2 = class21.field377;
        var2.glActiveTexture(33985);
        if (field2609 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class240.field3977 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class7.field110 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class19.field324), (float) (-class1.field6), (float) (-class242.field3989));
            if (field2609) {
                this.field2611[0] = 0.001F;
                this.field2611[1] = 9.0E-4F;
                this.field2611[2] = 0.0F;
                this.field2611[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field2611, 0);
                this.field2611[0] = 0.0F;
                this.field2611[1] = 9.0E-4F;
                this.field2611[2] = 0.001F;
                this.field2611[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field2611, 0);
                this.field2611[0] = 0.0F;
                this.field2611[1] = 0.0F;
                this.field2611[2] = 0.0F;
                this.field2611[3] = (float) class21.field357 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field2611, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class87.method674(0), 0);
            if (arg0 >= 0) {
                this.field2611[0] = 0.0F;
                this.field2611[1] = 1.0F / (float) class300.field5026;
                this.field2611[2] = 0.0F;
                this.field2611[3] = (float) arg0 * 1.0F / (float) class300.field5026;
                var2.glTexGenfv(8192, 9474, this.field2611, 0);
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

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()I", line = 149)
    public final int method91() {
        return 0;
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "()V", line = 159)
    public static final void method1205() {
        GL var0 = class21.field377;
        var0.glClientActiveTexture(method1203());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "()V", line = 196)
    public static final void method1206() {
        GL var0 = class21.field377;
        var0.glClientActiveTexture(method1203());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
