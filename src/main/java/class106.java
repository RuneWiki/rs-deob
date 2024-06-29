import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class106 implements class62 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    private int field1527 = -1;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[F")
    private float[] field1529 = new float[4];

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    private int field1530 = -1;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Z")
    private static boolean field1528 = false;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()V", line = 6)
    public final void method120() {
        GL var1 = class245.field3884;
        var1.glCallList(this.field1527);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "()I", line = 10)
    public static final int method700() {
        return field1528 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "()V", line = 15)
    public static final void method701() {
        GL var0 = class245.field3884;
        var0.glClientActiveTexture(method700());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()V", line = 23)
    public final void method117() {
        GL var1 = class245.field3884;
        var1.glCallList(this.field1527 + 1);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()I", line = 27)
    public final int method121() {
        return 0;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "()V", line = 31)
    private final void method702() {
        GL var1 = class245.field3884;
        this.field1527 = var1.glGenLists(2);
        var1.glNewList(this.field1527, 4864);
        var1.glActiveTexture(33985);
        if (field1528) {
            var1.glBindTexture(32879, class43.field639);
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
        var1.glBindTexture(3552, this.field1530);
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
        var1.glNewList(this.field1527 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1528) {
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

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 163)
    public class106() {
        if (class245.field3874 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class245.field3884;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1530 = var1[0];
            field1528 = class245.field3874 > 2 && class245.field3885;
            this.method702();
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 103)
    public final void method119(int arg0) {
        GL var2 = class245.field3884;
        var2.glActiveTexture(33985);
        if (field1528 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class98.field1427 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class125.field1871 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class60.field919), (float) (-class182.field2833), (float) (-class218.field3353));
            if (field1528) {
                this.field1529[0] = 0.001F;
                this.field1529[1] = 9.0E-4F;
                this.field1529[2] = 0.0F;
                this.field1529[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1529, 0);
                this.field1529[0] = 0.0F;
                this.field1529[1] = 9.0E-4F;
                this.field1529[2] = 0.001F;
                this.field1529[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1529, 0);
                this.field1529[0] = 0.0F;
                this.field1529[1] = 0.0F;
                this.field1529[2] = 0.0F;
                this.field1529[3] = (float) class245.field3882 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field1529, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class32.method270(1), 0);
            if (arg0 >= 0) {
                this.field1529[0] = 0.0F;
                this.field1529[1] = 1.0F / (float) class13.field169;
                this.field1529[2] = 0.0F;
                this.field1529[3] = (float) arg0 * 1.0F / (float) class13.field169;
                var2.glTexGenfv(8192, 9474, this.field1529, 0);
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

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "()V", line = 195)
    public static final void method703() {
        GL var0 = class245.field3884;
        var0.glClientActiveTexture(method700());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
