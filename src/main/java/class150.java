import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class150 implements class41 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "[F")
    private float[] field2727 = new float[4];

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    private int field2730 = -1;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    private int field2728 = -1;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Z")
    private static boolean field2729 = false;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()V", line = 6)
    public final void method223() {
        GL var1 = class231.field4052;
        var1.glCallList(this.field2728 + 1);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()V", line = 11)
    public final void method220() {
        GL var1 = class231.field4052;
        var1.glCallList(this.field2728);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "()V", line = 16)
    public static final void method1065() {
        GL var0 = class231.field4052;
        var0.glClientActiveTexture(method1066());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()I", line = 25)
    public final int method218() {
        return 0;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 171)
    public class150() {
        if (class231.field4067 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class231.field4052;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field2730 = var1[0];
            field2729 = class231.field4067 > 2 && class231.field4085;
            this.method1067();
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "()I", line = 35)
    public static final int method1066() {
        return field2729 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "()V", line = 42)
    private final void method1067() {
        GL var1 = class231.field4052;
        this.field2728 = var1.glGenLists(2);
        var1.glNewList(this.field2728, 4864);
        var1.glActiveTexture(33985);
        if (field2729) {
            var1.glBindTexture(32879, class138.field2430);
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
        var1.glBindTexture(3552, this.field2730);
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
        var1.glNewList(this.field2728 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field2729) {
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

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "()V", line = 108)
    public static final void method1068() {
        GL var0 = class231.field4052;
        var0.glClientActiveTexture(method1066());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 118)
    public final void method219(int arg0) {
        GL var2 = class231.field4052;
        var2.glActiveTexture(33985);
        if (field2729 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class249.field4305 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class151.field2744 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class149.field2722), (float) (-class58.field871), (float) (-class86.field1366));
            if (field2729) {
                this.field2727[0] = 0.001F;
                this.field2727[1] = 9.0E-4F;
                this.field2727[2] = 0.0F;
                this.field2727[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field2727, 0);
                this.field2727[0] = 0.0F;
                this.field2727[1] = 9.0E-4F;
                this.field2727[2] = 0.001F;
                this.field2727[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field2727, 0);
                this.field2727[0] = 0.0F;
                this.field2727[1] = 0.0F;
                this.field2727[2] = 0.0F;
                this.field2727[3] = (float) class231.field4050 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field2727, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class288.method2059(0), 0);
            if (arg0 >= 0) {
                this.field2727[0] = 0.0F;
                this.field2727[1] = 1.0F / (float) class53.field778;
                this.field2727[2] = 0.0F;
                this.field2727[3] = (float) arg0 * 1.0F / (float) class53.field778;
                var2.glTexGenfv(8192, 9474, this.field2727, 0);
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
}
