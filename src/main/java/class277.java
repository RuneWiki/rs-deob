import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class277 implements class87 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "[F")
    private float[] field4786 = new float[4];

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    private int field4787 = -1;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    private int field4788 = -1;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Z")
    private static boolean field4789 = false;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()I", line = 6)
    public final int method499() {
        return 0;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()I", line = 11)
    public static final int method1938() {
        return field4789 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 171)
    public class277() {
        if (class247.field4239 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class247.field4253;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field4787 = var1[0];
            field4789 = class247.field4239 > 2 && class247.field4226;
            this.method1940();
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()V", line = 18)
    public final void method501() {
        GL var1 = class247.field4253;
        var1.glCallList(this.field4788);
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "()V", line = 23)
    public static final void method1939() {
        GL var0 = class247.field4253;
        var0.glClientActiveTexture(method1938());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 31)
    public final void method503(int arg0) {
        GL var2 = class247.field4253;
        var2.glActiveTexture(33985);
        if (field4789 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class6.field130 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class254.field4380 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class57.field1099), (float) (-class146.field2508), (float) (-class245.field4176));
            if (field4789) {
                this.field4786[0] = 0.001F;
                this.field4786[1] = 9.0E-4F;
                this.field4786[2] = 0.0F;
                this.field4786[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field4786, 0);
                this.field4786[0] = 0.0F;
                this.field4786[1] = 9.0E-4F;
                this.field4786[2] = 0.001F;
                this.field4786[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field4786, 0);
                this.field4786[0] = 0.0F;
                this.field4786[1] = 0.0F;
                this.field4786[2] = 0.0F;
                this.field4786[3] = (float) class247.field4243 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field4786, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class70.method468((byte) 2), 0);
            if (arg0 >= 0) {
                this.field4786[0] = 0.0F;
                this.field4786[1] = 1.0F / (float) class276.field4783;
                this.field4786[2] = 0.0F;
                this.field4786[3] = (float) arg0 * 1.0F / (float) class276.field4783;
                var2.glTexGenfv(8192, 9474, this.field4786, 0);
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

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "()V", line = 83)
    private final void method1940() {
        GL var1 = class247.field4253;
        this.field4788 = var1.glGenLists(2);
        var1.glNewList(this.field4788, 4864);
        var1.glActiveTexture(33985);
        if (field4789) {
            var1.glBindTexture(32879, class179.field3143);
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
        var1.glBindTexture(3552, this.field4787);
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
        var1.glNewList(this.field4788 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field4789) {
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

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "()V", line = 149)
    public static final void method1941() {
        GL var0 = class247.field4253;
        var0.glClientActiveTexture(method1938());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()V", line = 156)
    public final void method502() {
        GL var1 = class247.field4253;
        var1.glCallList(this.field4788 + 1);
    }
}
