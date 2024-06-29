import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class300 implements class335 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[F")
    private float[] field4792 = new float[4];

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    private int field4791 = -1;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    private int field4793 = -1;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Z")
    private static boolean field4790 = false;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()V", line = 6)
    public final void method787() {
        GL var1 = class162.field2654;
        var1.glCallList(this.field4793 + 1);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 11)
    public static final int method2122() {
        return field4790 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()V", line = 17)
    public final void method785() {
        GL var1 = class162.field2654;
        var1.glCallList(this.field4793);
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "()V", line = 25)
    public static final void method2123() {
        GL var0 = class162.field2654;
        var0.glClientActiveTexture(method2122());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 168)
    public class300() {
        if (class162.field2641 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class162.field2654;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field4791 = var1[0];
            field4790 = class162.field2641 > 2 && class162.field2643;
            this.method2125();
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 37)
    public final void method786(int arg0) {
        GL var2 = class162.field2654;
        var2.glActiveTexture(33985);
        if (field4790 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class331.field5160 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class332.field5185 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class77.field1213), (float) (-class117.field1894), (float) (-class124.field2006));
            if (field4790) {
                this.field4792[0] = 0.001F;
                this.field4792[1] = 9.0E-4F;
                this.field4792[2] = 0.0F;
                this.field4792[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field4792, 0);
                this.field4792[0] = 0.0F;
                this.field4792[1] = 9.0E-4F;
                this.field4792[2] = 0.001F;
                this.field4792[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field4792, 0);
                this.field4792[0] = 0.0F;
                this.field4792[1] = 0.0F;
                this.field4792[2] = 0.0F;
                this.field4792[3] = (float) class162.field2656 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field4792, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class204.method1466(124), 0);
            if (arg0 >= 0) {
                this.field4792[0] = 0.0F;
                this.field4792[1] = 1.0F / (float) class30.field476;
                this.field4792[2] = 0.0F;
                this.field4792[3] = (float) arg0 * 1.0F / (float) class30.field476;
                var2.glTexGenfv(8192, 9474, this.field4792, 0);
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

    @OriginalMember(owner = "client!j", name = "f", descriptor = "()V", line = 92)
    public static final void method2124() {
        GL var0 = class162.field2654;
        var0.glClientActiveTexture(method2122());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "()V", line = 101)
    private final void method2125() {
        GL var1 = class162.field2654;
        this.field4793 = var1.glGenLists(2);
        var1.glNewList(this.field4793, 4864);
        var1.glActiveTexture(33985);
        if (field4790) {
            var1.glBindTexture(32879, class252.field3712);
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
        var1.glBindTexture(3552, this.field4791);
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
        var1.glNewList(this.field4793 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field4790) {
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

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 199)
    public final int method784() {
        return 0;
    }
}
