import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class154 implements class210 {

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    private int field2637 = -1;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "[F")
    private float[] field2638 = new float[4];

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    private int field2639 = -1;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Z")
    private static boolean field2636 = false;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "()I", line = 5)
    public static final int method1033() {
        return field2636 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()I", line = 9)
    public final int method482() {
        return 0;
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "()V", line = 15)
    public static final void method1034() {
        GL var0 = class108.field1899;
        var0.glClientActiveTexture(method1033());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 171)
    public class154() {
        if (class108.field1921 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class108.field1899;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field2639 = var1[0];
            field2636 = class108.field1921 > 2 && class108.field1897;
            this.method1035();
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "()V", line = 26)
    public final void method483() {
        GL var1 = class108.field1899;
        var1.glCallList(this.field2637);
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "()V", line = 34)
    private final void method1035() {
        GL var1 = class108.field1899;
        this.field2637 = var1.glGenLists(2);
        var1.glNewList(this.field2637, 4864);
        var1.glActiveTexture(33985);
        if (field2636) {
            var1.glBindTexture(32879, class99.field1757);
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
        var1.glBindTexture(3552, this.field2639);
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
        var1.glNewList(this.field2637 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field2636) {
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

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()V", line = 100)
    public final void method486() {
        GL var1 = class108.field1899;
        var1.glCallList(this.field2637 + 1);
    }

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "()V", line = 105)
    public static final void method1036() {
        GL var0 = class108.field1899;
        var0.glClientActiveTexture(method1033());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 118)
    public final void method484(int arg0) {
        GL var2 = class108.field1899;
        var2.glActiveTexture(33985);
        if (field2636 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class31.field533 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class205.field3565 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class311.field5235), (float) (-class113.field2042), (float) (-class305.field5165));
            if (field2636) {
                this.field2638[0] = 0.001F;
                this.field2638[1] = 9.0E-4F;
                this.field2638[2] = 0.0F;
                this.field2638[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field2638, 0);
                this.field2638[0] = 0.0F;
                this.field2638[1] = 9.0E-4F;
                this.field2638[2] = 0.001F;
                this.field2638[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field2638, 0);
                this.field2638[0] = 0.0F;
                this.field2638[1] = 0.0F;
                this.field2638[2] = 0.0F;
                this.field2638[3] = (float) class108.field1905 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field2638, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class112.method790(-63), 0);
            if (arg0 >= 0) {
                this.field2638[0] = 0.0F;
                this.field2638[1] = 1.0F / (float) class223.field3807;
                this.field2638[2] = 0.0F;
                this.field2638[3] = (float) arg0 * 1.0F / (float) class223.field3807;
                var2.glTexGenfv(8192, 9474, this.field2638, 0);
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
