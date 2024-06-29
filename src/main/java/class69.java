import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class69 implements class188 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[F")
    private float[] field1136 = new float[4];

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    private int field1135 = -1;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    private int field1137 = -1;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Z")
    private static boolean field1138 = false;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V", line = 6)
    public final void method509() {
        GL var1 = class271.field4641;
        var1.glCallList(this.field1137);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()V", line = 11)
    private final void method510() {
        GL var1 = class271.field4641;
        this.field1137 = var1.glGenLists(2);
        var1.glNewList(this.field1137, 4864);
        var1.glActiveTexture(33985);
        if (field1138) {
            var1.glBindTexture(32879, class243.field4038);
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
        var1.glBindTexture(3552, this.field1135);
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
        var1.glNewList(this.field1137 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1138) {
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

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()V", line = 77)
    public static final void method511() {
        GL var0 = class271.field4641;
        var0.glClientActiveTexture(method516());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 87)
    public final void method512(int arg0) {
        GL var2 = class271.field4641;
        var2.glActiveTexture(33985);
        if (field1138 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class211.field3492 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class263.field4374 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class56.field999), (float) (-class211.field3498), (float) (-class223.field3717));
            if (field1138) {
                this.field1136[0] = 0.001F;
                this.field1136[1] = 9.0E-4F;
                this.field1136[2] = 0.0F;
                this.field1136[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1136, 0);
                this.field1136[0] = 0.0F;
                this.field1136[1] = 9.0E-4F;
                this.field1136[2] = 0.001F;
                this.field1136[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1136, 0);
                this.field1136[0] = 0.0F;
                this.field1136[1] = 0.0F;
                this.field1136[2] = 0.0F;
                this.field1136[3] = (float) class271.field4635 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field1136, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class51.method416(-118), 0);
            if (arg0 >= 0) {
                this.field1136[0] = 0.0F;
                this.field1136[1] = 1.0F / (float) class202.field3373;
                this.field1136[2] = 0.0F;
                this.field1136[3] = (float) arg0 * 1.0F / (float) class202.field3373;
                var2.glTexGenfv(8192, 9474, this.field1136, 0);
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

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()V", line = 140)
    public static final void method513() {
        GL var0 = class271.field4641;
        var0.glClientActiveTexture(method516());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 168)
    public class69() {
        if (class271.field4627 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class271.field4641;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1135 = var1[0];
            field1138 = class271.field4627 > 2 && class271.field4649;
            this.method510();
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()V", line = 156)
    public final void method514() {
        GL var1 = class271.field4641;
        var1.glCallList(this.field1137 + 1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()I", line = 160)
    public final int method515() {
        return 0;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "()I", line = 199)
    public static final int method516() {
        return field1138 ? 33986 : 33985;
    }
}
