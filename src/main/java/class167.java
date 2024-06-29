import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class167 implements class97 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[F")
    private float[] field2569 = new float[4];

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    private int field2572 = -1;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    private int field2571 = -1;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Z")
    private static boolean field2570 = false;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()V", line = 6)
    public static final void method1187() {
        GL var0 = class272.field4310;
        var0.glClientActiveTexture(method1190());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 13)
    public final void method150(int arg0) {
        GL var2 = class272.field4310;
        var2.glActiveTexture(33985);
        if (field2570 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class54.field616 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class189.field2840 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class328.field5286), (float) (-class32.field376), (float) (-class76.field987));
            if (field2570) {
                this.field2569[0] = 0.001F;
                this.field2569[1] = 9.0E-4F;
                this.field2569[2] = 0.0F;
                this.field2569[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field2569, 0);
                this.field2569[0] = 0.0F;
                this.field2569[1] = 9.0E-4F;
                this.field2569[2] = 0.001F;
                this.field2569[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field2569, 0);
                this.field2569[0] = 0.0F;
                this.field2569[1] = 0.0F;
                this.field2569[2] = 0.0F;
                this.field2569[3] = (float) class272.field4280 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field2569, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class70.method439((byte) 123), 0);
            if (arg0 >= 0) {
                this.field2569[0] = 0.0F;
                this.field2569[1] = 1.0F / (float) class274.field4342;
                this.field2569[2] = 0.0F;
                this.field2569[3] = (float) arg0 * 1.0F / (float) class274.field4342;
                var2.glTexGenfv(8192, 9474, this.field2569, 0);
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

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "()V", line = 65)
    public static final void method1188() {
        GL var0 = class272.field4310;
        var0.glClientActiveTexture(method1190());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()V", line = 72)
    public final void method147() {
        GL var1 = class272.field4310;
        var1.glCallList(this.field2571 + 1);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()I", line = 77)
    public final int method148() {
        return 0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V", line = 82)
    public final void method152() {
        GL var1 = class272.field4310;
        var1.glCallList(this.field2571);
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "()V", line = 87)
    private final void method1189() {
        GL var1 = class272.field4310;
        this.field2571 = var1.glGenLists(2);
        var1.glNewList(this.field2571, 4864);
        var1.glActiveTexture(33985);
        if (field2570) {
            var1.glBindTexture(32879, class144.field2300);
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
        var1.glBindTexture(3552, this.field2572);
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
        var1.glNewList(this.field2571 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field2570) {
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

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "()I", line = 154)
    public static final int method1190() {
        return field2570 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 171)
    public class167() {
        if (class272.field4297 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class272.field4310;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field2572 = var1[0];
            field2570 = class272.field4297 > 2 && class272.field4287;
            this.method1189();
        }
    }
}
