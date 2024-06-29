import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class76 implements class203 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[F")
    private float[] field1217 = new float[4];

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    private int field1218 = -1;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    private int field1220 = -1;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Z")
    private static boolean field1219 = false;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "()V", line = 6)
    public static final void method598() {
        GL var0 = class55.field812;
        var0.glClientActiveTexture(method599());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "()I", line = 13)
    public static final int method599() {
        return field1219 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()V", line = 17)
    public final void method13() {
        GL var1 = class55.field812;
        var1.glCallList(this.field1218);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()V", line = 23)
    public final void method12() {
        GL var1 = class55.field812;
        var1.glCallList(this.field1218 + 1);
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "()V", line = 28)
    private final void method600() {
        GL var1 = class55.field812;
        this.field1218 = var1.glGenLists(2);
        var1.glNewList(this.field1218, 4864);
        var1.glActiveTexture(33985);
        if (field1219) {
            var1.glBindTexture(32879, class278.field4767);
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
        var1.glBindTexture(3552, this.field1220);
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
        var1.glNewList(this.field1218 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1219) {
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

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 170)
    public class76() {
        if (class55.field825 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class55.field812;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1220 = var1[0];
            field1219 = class55.field825 > 2 && class55.field827;
            this.method600();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 97)
    public final void method11(int arg0) {
        GL var2 = class55.field812;
        var2.glActiveTexture(33985);
        if (field1219 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class84.field1320 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class194.field3218 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class198.field3285), (float) (-class190.field3183), (float) (-class216.field3527));
            if (field1219) {
                this.field1217[0] = 0.001F;
                this.field1217[1] = 9.0E-4F;
                this.field1217[2] = 0.0F;
                this.field1217[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1217, 0);
                this.field1217[0] = 0.0F;
                this.field1217[1] = 9.0E-4F;
                this.field1217[2] = 0.001F;
                this.field1217[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1217, 0);
                this.field1217[0] = 0.0F;
                this.field1217[1] = 0.0F;
                this.field1217[2] = 0.0F;
                this.field1217[3] = (float) class55.field821 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field1217, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class313.method2158((byte) 60), 0);
            if (arg0 >= 0) {
                this.field1217[0] = 0.0F;
                this.field1217[1] = 1.0F / (float) class123.field2033;
                this.field1217[2] = 0.0F;
                this.field1217[3] = (float) arg0 * 1.0F / (float) class123.field2033;
                var2.glTexGenfv(8192, 9474, this.field1217, 0);
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

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "()V", line = 149)
    public static final void method601() {
        GL var0 = class55.field812;
        var0.glClientActiveTexture(method599());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()I", line = 157)
    public final int method14() {
        return 0;
    }
}
