import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class114 implements class147 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    private int field2088 = -1;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[F")
    private float[] field2087 = new float[4];

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    private int field2089 = -1;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Z")
    private static boolean field2086 = false;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()V", line = 8)
    private final void method922() {
        GL var1 = class97.field1801;
        this.field2089 = var1.glGenLists(2);
        var1.glNewList(this.field2089, 4864);
        var1.glActiveTexture(33985);
        if (field2086) {
            var1.glBindTexture(32879, class129.field2357);
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
        var1.glBindTexture(3552, this.field2088);
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
        var1.glNewList(this.field2089 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field2086) {
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

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "()I", line = 75)
    public static final int method923() {
        return field2086 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 80)
    public final void method76() {
        GL var1 = class97.field1801;
        var1.glCallList(this.field2089);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 88)
    public final void method75(int arg0) {
        GL var2 = class97.field1801;
        var2.glActiveTexture(33985);
        if (field2086 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class260.field4627 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class268.field4810 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class143.field2601), (float) (-class101.field1891), (float) (-class170.field3077));
            if (field2086) {
                this.field2087[0] = 0.001F;
                this.field2087[1] = 9.0E-4F;
                this.field2087[2] = 0.0F;
                this.field2087[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field2087, 0);
                this.field2087[0] = 0.0F;
                this.field2087[1] = 9.0E-4F;
                this.field2087[2] = 0.001F;
                this.field2087[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field2087, 0);
                this.field2087[0] = 0.0F;
                this.field2087[1] = 0.0F;
                this.field2087[2] = 0.0F;
                this.field2087[3] = (float) class97.field1816 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field2087, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class294.method2090((byte) -110), 0);
            if (arg0 >= 0) {
                this.field2087[0] = 0.0F;
                this.field2087[1] = 1.0F / (float) class91.field1718;
                this.field2087[2] = 0.0F;
                this.field2087[3] = (float) arg0 * 1.0F / (float) class91.field1718;
                var2.glTexGenfv(8192, 9474, this.field2087, 0);
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

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "()V", line = 140)
    public static final void method924() {
        GL var0 = class97.field1801;
        var0.glClientActiveTexture(method923());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()I", line = 146)
    public final int method72() {
        return 0;
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "()V", line = 151)
    public static final void method925() {
        GL var0 = class97.field1801;
        var0.glClientActiveTexture(method923());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 171)
    public class114() {
        if (class97.field1821 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class97.field1801;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field2088 = var1[0];
            field2086 = class97.field1821 > 2 && class97.field1799;
            this.method922();
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()V", line = 165)
    public final void method73() {
        GL var1 = class97.field1801;
        var1.glCallList(this.field2089 + 1);
    }
}
