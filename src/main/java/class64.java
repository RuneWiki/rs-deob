import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class64 implements class14 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[F")
    private float[] field981 = new float[4];

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    private int field982 = -1;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    private int field983 = -1;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Z")
    private static boolean field980 = false;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "()I", line = 6)
    public static final int method481() {
        return field980 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "()V", line = 10)
    public static final void method482() {
        GL var0 = class99.field1682;
        var0.glClientActiveTexture(method481());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 17)
    public final void method84(int arg0) {
        GL var2 = class99.field1682;
        var2.glActiveTexture(33985);
        if (field980 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class203.field3348 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class263.field4398 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class97.field1626), (float) (-class1.field2), (float) (-class326.field5578));
            if (field980) {
                this.field981[0] = 0.001F;
                this.field981[1] = 9.0E-4F;
                this.field981[2] = 0.0F;
                this.field981[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field981, 0);
                this.field981[0] = 0.0F;
                this.field981[1] = 9.0E-4F;
                this.field981[2] = 0.001F;
                this.field981[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field981, 0);
                this.field981[0] = 0.0F;
                this.field981[1] = 0.0F;
                this.field981[2] = 0.0F;
                this.field981[3] = (float) class99.field1671 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field981, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class63.method454(941338512), 0);
            if (arg0 >= 0) {
                this.field981[0] = 0.0F;
                this.field981[1] = 1.0F / (float) class121.field2035;
                this.field981[2] = 0.0F;
                this.field981[3] = (float) arg0 * 1.0F / (float) class121.field2035;
                var2.glTexGenfv(8192, 9474, this.field981, 0);
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

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()I", line = 71)
    public final int method83() {
        return 0;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 171)
    public class64() {
        if (class99.field1688 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class99.field1682;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field983 = var1[0];
            field980 = class99.field1688 > 2 && class99.field1668;
            this.method483();
        }
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "()V", line = 81)
    private final void method483() {
        GL var1 = class99.field1682;
        this.field982 = var1.glGenLists(2);
        var1.glNewList(this.field982, 4864);
        var1.glActiveTexture(33985);
        if (field980) {
            var1.glBindTexture(32879, class9.field111);
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
        var1.glBindTexture(3552, this.field983);
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
        var1.glNewList(this.field982 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field980) {
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

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()V", line = 148)
    public final void method79() {
        GL var1 = class99.field1682;
        var1.glCallList(this.field982);
    }

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "()V", line = 154)
    public static final void method484() {
        GL var0 = class99.field1682;
        var0.glClientActiveTexture(method481());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()V", line = 161)
    public final void method80() {
        GL var1 = class99.field1682;
        var1.glCallList(this.field982 + 1);
    }
}
