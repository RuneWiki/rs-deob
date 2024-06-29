import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class134 implements class21 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    private int field2223 = -1;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    private int field2226 = -1;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "[F")
    private float[] field2225 = new float[4];

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Z")
    private static boolean field2224 = false;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()I", line = 6)
    public final int method117() {
        return 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V", line = 10)
    public final void method116() {
        GL var1 = class281.field4839;
        var1.glCallList(this.field2226 + 1);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 15)
    public final void method119(int arg0) {
        GL var2 = class281.field4839;
        var2.glActiveTexture(33985);
        if (field2224 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class13.field180 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class213.field3641 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class258.field4388), (float) (-class224.field3751), (float) (-class276.field4738));
            if (field2224) {
                this.field2225[0] = 0.001F;
                this.field2225[1] = 9.0E-4F;
                this.field2225[2] = 0.0F;
                this.field2225[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field2225, 0);
                this.field2225[0] = 0.0F;
                this.field2225[1] = 9.0E-4F;
                this.field2225[2] = 0.001F;
                this.field2225[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field2225, 0);
                this.field2225[0] = 0.0F;
                this.field2225[1] = 0.0F;
                this.field2225[2] = 0.0F;
                this.field2225[3] = (float) class281.field4810 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field2225, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class305.method2118(117), 0);
            if (arg0 >= 0) {
                this.field2225[0] = 0.0F;
                this.field2225[1] = 1.0F / (float) class284.field4892;
                this.field2225[2] = 0.0F;
                this.field2225[3] = (float) arg0 * 1.0F / (float) class284.field4892;
                var2.glTexGenfv(8192, 9474, this.field2225, 0);
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

    @OriginalMember(owner = "client!d", name = "d", descriptor = "()I", line = 66)
    public static final int method999() {
        return field2224 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "()V", line = 71)
    public static final void method1000() {
        GL var0 = class281.field4839;
        var0.glClientActiveTexture(method999());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "()V", line = 80)
    public static final void method1001() {
        GL var0 = class281.field4839;
        var0.glClientActiveTexture(method999());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()V", line = 87)
    public final void method118() {
        GL var1 = class281.field4839;
        var1.glCallList(this.field2226);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 171)
    public class134() {
        if (class281.field4817 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class281.field4839;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field2223 = var1[0];
            field2224 = class281.field4817 > 2 && class281.field4832;
            this.method1002();
        }
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "()V", line = 100)
    private final void method1002() {
        GL var1 = class281.field4839;
        this.field2226 = var1.glGenLists(2);
        var1.glNewList(this.field2226, 4864);
        var1.glActiveTexture(33985);
        if (field2224) {
            var1.glBindTexture(32879, class86.field1393);
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
        var1.glBindTexture(3552, this.field2223);
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
        var1.glNewList(this.field2226 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field2224) {
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
}
