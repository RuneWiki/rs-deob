import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class42 implements class215 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    private int field673 = -1;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    private int field672 = -1;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[F")
    private float[] field675 = new float[4];

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Z")
    private static boolean field674 = false;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "()V", line = 8)
    public static final void method268() {
        GL var0 = class56.field848;
        var0.glClientActiveTexture(method269());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 161)
    public class42() {
        if (class56.field840 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class56.field848;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field672 = var1[0];
            field674 = class56.field840 > 2 && class56.field849;
            this.method270();
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()V", line = 20)
    public final void method23() {
        GL var1 = class56.field848;
        var1.glCallList(this.field673 + 1);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 25)
    public final void method21(int arg0) {
        GL var2 = class56.field848;
        var2.glActiveTexture(33985);
        if (field674 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class237.field4000 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class120.field2019 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class117.field1975), (float) (-class167.field2969), (float) (-class85.field1350));
            if (field674) {
                this.field675[0] = 0.001F;
                this.field675[1] = 9.0E-4F;
                this.field675[2] = 0.0F;
                this.field675[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field675, 0);
                this.field675[0] = 0.0F;
                this.field675[1] = 9.0E-4F;
                this.field675[2] = 0.001F;
                this.field675[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field675, 0);
                this.field675[0] = 0.0F;
                this.field675[1] = 0.0F;
                this.field675[2] = 0.0F;
                this.field675[3] = (float) class56.field871 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field675, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class200.method1414(65346), 0);
            if (arg0 >= 0) {
                this.field675[0] = 0.0F;
                this.field675[1] = 1.0F / (float) class97.field1563;
                this.field675[2] = 0.0F;
                this.field675[3] = (float) arg0 * 1.0F / (float) class97.field1563;
                var2.glTexGenfv(8192, 9474, this.field675, 0);
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

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "()V", line = 77)
    public final void method18() {
        GL var1 = class56.field848;
        var1.glCallList(this.field673);
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "()I", line = 85)
    public static final int method269() {
        return field674 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "()V", line = 96)
    private final void method270() {
        GL var1 = class56.field848;
        this.field673 = var1.glGenLists(2);
        var1.glNewList(this.field673, 4864);
        var1.glActiveTexture(33985);
        if (field674) {
            var1.glBindTexture(32879, class149.field2735);
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
        var1.glBindTexture(3552, this.field672);
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
        var1.glNewList(this.field673 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field674) {
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

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()I", line = 192)
    public final int method19() {
        return 0;
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "()V", line = 196)
    public static final void method271() {
        GL var0 = class56.field848;
        var0.glClientActiveTexture(method269());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
