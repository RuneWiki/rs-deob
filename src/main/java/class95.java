import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class95 implements class70 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "[F")
    private float[] field1238 = new float[4];

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    private int field1240 = -1;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    private int field1241 = -1;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Z")
    private static boolean field1239 = false;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()V", line = 7)
    public final void method15() {
        GL var1 = class250.field3818;
        var1.glCallList(this.field1240 + 1);
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "()I", line = 12)
    public static final int method576() {
        return field1239 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 16)
    public final void method14(int arg0) {
        GL var2 = class250.field3818;
        var2.glActiveTexture(33985);
        if (field1239 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class319.field4906 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class230.field3362 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class329.field5020), (float) (-class261.field3955), (float) (-class166.field2296));
            if (field1239) {
                this.field1238[0] = 0.001F;
                this.field1238[1] = 9.0E-4F;
                this.field1238[2] = 0.0F;
                this.field1238[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1238, 0);
                this.field1238[0] = 0.0F;
                this.field1238[1] = 9.0E-4F;
                this.field1238[2] = 0.001F;
                this.field1238[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1238, 0);
                this.field1238[0] = 0.0F;
                this.field1238[1] = 0.0F;
                this.field1238[2] = 0.0F;
                this.field1238[3] = (float) class250.field3796 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field1238, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class264.method1905((byte) 2), 0);
            if (arg0 >= 0) {
                this.field1238[0] = 0.0F;
                this.field1238[1] = 1.0F / (float) class15.field203;
                this.field1238[2] = 0.0F;
                this.field1238[3] = (float) arg0 * 1.0F / (float) class15.field203;
                var2.glTexGenfv(8192, 9474, this.field1238, 0);
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

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 164)
    public class95() {
        if (class250.field3801 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class250.field3818;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1241 = var1[0];
            field1239 = class250.field3801 > 2 && class250.field3821;
            this.method578();
        }
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "()V", line = 72)
    public static final void method577() {
        GL var0 = class250.field3818;
        var0.glClientActiveTexture(method576());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "()V", line = 80)
    public final void method17() {
        GL var1 = class250.field3818;
        var1.glCallList(this.field1240);
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "()V", line = 91)
    private final void method578() {
        GL var1 = class250.field3818;
        this.field1240 = var1.glGenLists(2);
        var1.glNewList(this.field1240, 4864);
        var1.glActiveTexture(33985);
        if (field1239) {
            var1.glBindTexture(32879, class246.field3724);
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
        var1.glBindTexture(3552, this.field1241);
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
        var1.glNewList(this.field1240 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1239) {
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

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "()I", line = 156)
    public final int method16() {
        return 0;
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "()V", line = 196)
    public static final void method579() {
        GL var0 = class250.field3818;
        var0.glClientActiveTexture(method576());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
