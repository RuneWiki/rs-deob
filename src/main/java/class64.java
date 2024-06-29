import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class64 implements class67 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    private int field1228 = -1;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    private int field1227 = -1;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[F")
    private float[] field1230 = new float[4];

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Z")
    private static boolean field1229 = false;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "()V", line = 8)
    public static final void method514() {
        GL var0 = class241.field4012;
        var0.glClientActiveTexture(method515());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 150)
    public class64() {
        if (class241.field4040 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class241.field4012;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1227 = var1[0];
            field1229 = class241.field4040 > 2 && class241.field4014;
            this.method516();
        }
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "()I", line = 21)
    public static final int method515() {
        return field1229 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "()V", line = 25)
    private final void method516() {
        GL var1 = class241.field4012;
        this.field1228 = var1.glGenLists(2);
        var1.glNewList(this.field1228, 4864);
        var1.glActiveTexture(33985);
        if (field1229) {
            var1.glBindTexture(32879, class106.field1929);
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
        var1.glBindTexture(3552, this.field1227);
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
        var1.glNewList(this.field1228 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1229) {
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

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()I", line = 90)
    public final int method226() {
        return 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 100)
    public final void method225(int arg0) {
        GL var2 = class241.field4012;
        var2.glActiveTexture(33985);
        if (field1229 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class49.field1023 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class281.field4604 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class103.field1901), (float) (-class269.field4378), (float) (-class260.field4254));
            if (field1229) {
                this.field1230[0] = 0.001F;
                this.field1230[1] = 9.0E-4F;
                this.field1230[2] = 0.0F;
                this.field1230[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1230, 0);
                this.field1230[0] = 0.0F;
                this.field1230[1] = 9.0E-4F;
                this.field1230[2] = 0.001F;
                this.field1230[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1230, 0);
                this.field1230[0] = 0.0F;
                this.field1230[1] = 0.0F;
                this.field1230[2] = 0.0F;
                this.field1230[3] = (float) class241.field4024 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field1230, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class198.method1356((byte) 100), 0);
            if (arg0 >= 0) {
                this.field1230[0] = 0.0F;
                this.field1230[1] = 1.0F / (float) class216.field3607;
                this.field1230[2] = 0.0F;
                this.field1230[3] = (float) arg0 * 1.0F / (float) class216.field3607;
                var2.glTexGenfv(8192, 9474, this.field1230, 0);
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

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "()V", line = 182)
    public static final void method517() {
        GL var0 = class241.field4012;
        var0.glClientActiveTexture(method515());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V", line = 189)
    public final void method222() {
        GL var1 = class241.field4012;
        var1.glCallList(this.field1228 + 1);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()V", line = 194)
    public final void method224() {
        GL var1 = class241.field4012;
        var1.glCallList(this.field1228);
    }
}
