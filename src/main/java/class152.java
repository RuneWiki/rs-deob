import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class152 implements class159 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    private int field2711 = -1;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[F")
    private float[] field2710 = new float[4];

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    private int field2712 = -1;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Z")
    private static boolean field2709 = false;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "()V", line = 6)
    private final void method1187() {
        GL var1 = class117.field2143;
        this.field2711 = var1.glGenLists(2);
        var1.glNewList(this.field2711, 4864);
        var1.glActiveTexture(33985);
        if (field2709) {
            var1.glBindTexture(32879, class210.field3549);
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
        var1.glBindTexture(3552, this.field2712);
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
        var1.glNewList(this.field2711 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field2709) {
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

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 73)
    public final void method32() {
        GL var1 = class117.field2143;
        var1.glCallList(this.field2711);
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "()V", line = 78)
    public static final void method1188() {
        GL var0 = class117.field2143;
        var0.glClientActiveTexture(method1190());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "()V", line = 90)
    public static final void method1189() {
        GL var0 = class117.field2143;
        var0.glClientActiveTexture(method1190());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()V", line = 97)
    public final void method34() {
        GL var1 = class117.field2143;
        var1.glCallList(this.field2711 + 1);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()I", line = 103)
    public final int method30() {
        return 0;
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "()I", line = 106)
    public static final int method1190() {
        return field2709 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 171)
    public class152() {
        if (class117.field2137 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class117.field2143;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field2712 = var1[0];
            field2709 = class117.field2137 > 2 && class117.field2132;
            this.method1187();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 121)
    public final void method29(int arg0) {
        GL var2 = class117.field2143;
        var2.glActiveTexture(33985);
        if (field2709 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class279.field4703 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class61.field951 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class190.field3256), (float) (-class43.field698), (float) (-class212.field3568));
            if (field2709) {
                this.field2710[0] = 0.001F;
                this.field2710[1] = 9.0E-4F;
                this.field2710[2] = 0.0F;
                this.field2710[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field2710, 0);
                this.field2710[0] = 0.0F;
                this.field2710[1] = 9.0E-4F;
                this.field2710[2] = 0.001F;
                this.field2710[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field2710, 0);
                this.field2710[0] = 0.0F;
                this.field2710[1] = 0.0F;
                this.field2710[2] = 0.0F;
                this.field2710[3] = (float) class117.field2127 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field2710, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class186.method1403((byte) -117), 0);
            if (arg0 >= 0) {
                this.field2710[0] = 0.0F;
                this.field2710[1] = 1.0F / (float) class229.field3810;
                this.field2710[2] = 0.0F;
                this.field2710[3] = (float) arg0 * 1.0F / (float) class229.field3810;
                var2.glTexGenfv(8192, 9474, this.field2710, 0);
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
