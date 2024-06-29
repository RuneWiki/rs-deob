import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class160 implements class243 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[F")
    private float[] field2722 = new float[4];

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    private int field2724 = -1;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    private int field2723 = -1;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Z")
    private static boolean field2721 = false;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()I", line = 6)
    public static final int method1202() {
        return field2721 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "()V", line = 10)
    public static final void method1203() {
        GL var0 = class47.field739;
        var0.glClientActiveTexture(method1202());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 18)
    public final void method161(int arg0) {
        GL var2 = class47.field739;
        var2.glActiveTexture(33985);
        if (field2721 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class155.field2651 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class69.field1182 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class82.field1368), (float) (-class287.field4934), (float) (-class145.field2502));
            if (field2721) {
                this.field2722[0] = 0.001F;
                this.field2722[1] = 9.0E-4F;
                this.field2722[2] = 0.0F;
                this.field2722[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field2722, 0);
                this.field2722[0] = 0.0F;
                this.field2722[1] = 9.0E-4F;
                this.field2722[2] = 0.001F;
                this.field2722[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field2722, 0);
                this.field2722[0] = 0.0F;
                this.field2722[1] = 0.0F;
                this.field2722[2] = 0.0F;
                this.field2722[3] = (float) class47.field743 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field2722, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class123.method931(1), 0);
            if (arg0 >= 0) {
                this.field2722[0] = 0.0F;
                this.field2722[1] = 1.0F / (float) class178.field3005;
                this.field2722[2] = 0.0F;
                this.field2722[3] = (float) arg0 * 1.0F / (float) class178.field3005;
                var2.glTexGenfv(8192, 9474, this.field2722, 0);
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

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()V", line = 70)
    public final void method162() {
        GL var1 = class47.field739;
        var1.glCallList(this.field2724);
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "()V", line = 76)
    private final void method1204() {
        GL var1 = class47.field739;
        this.field2724 = var1.glGenLists(2);
        var1.glNewList(this.field2724, 4864);
        var1.glActiveTexture(33985);
        if (field2721) {
            var1.glBindTexture(32879, class225.field3802);
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
        var1.glBindTexture(3552, this.field2723);
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
        var1.glNewList(this.field2724 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field2721) {
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

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "()V", line = 142)
    public static final void method1205() {
        GL var0 = class47.field739;
        var0.glClientActiveTexture(method1202());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 163)
    public class160() {
        if (class47.field756 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class47.field739;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field2723 = var1[0];
            field2721 = class47.field756 > 2 && class47.field754;
            this.method1204();
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()I", line = 161)
    public final int method163() {
        return 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V", line = 195)
    public final void method164() {
        GL var1 = class47.field739;
        var1.glCallList(this.field2724 + 1);
    }
}
