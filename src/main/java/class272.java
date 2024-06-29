import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class272 implements class182 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    private int field4197 = -1;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    private int field4198 = -1;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "[F")
    private float[] field4196 = new float[4];

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Z")
    private static boolean field4199 = false;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()I", line = 7)
    public static final int method1989() {
        return field4199 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "()V", line = 12)
    private final void method1990() {
        GL var1 = class240.field3771;
        this.field4198 = var1.glGenLists(2);
        var1.glNewList(this.field4198, 4864);
        var1.glActiveTexture(33985);
        if (field4199) {
            var1.glBindTexture(32879, class333.field5104);
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
        var1.glBindTexture(3552, this.field4197);
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
        var1.glNewList(this.field4198 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field4199) {
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

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "()V", line = 79)
    public static final void method1991() {
        GL var0 = class240.field3771;
        var0.glClientActiveTexture(method1989());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 154)
    public class272() {
        if (class240.field3741 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class240.field3771;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field4197 = var1[0];
            field4199 = class240.field3741 > 2 && class240.field3762;
            this.method1990();
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()I", line = 88)
    public final int method230() {
        return 0;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()V", line = 92)
    public final void method232() {
        GL var1 = class240.field3771;
        var1.glCallList(this.field4198 + 1);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 97)
    public final void method229(int arg0) {
        GL var2 = class240.field3771;
        var2.glActiveTexture(33985);
        if (field4199 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class290.field4516 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class159.field2537 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class173.field2753), (float) (-class352.field5621), (float) (-class315.field4866));
            if (field4199) {
                this.field4196[0] = 0.001F;
                this.field4196[1] = 9.0E-4F;
                this.field4196[2] = 0.0F;
                this.field4196[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field4196, 0);
                this.field4196[0] = 0.0F;
                this.field4196[1] = 9.0E-4F;
                this.field4196[2] = 0.001F;
                this.field4196[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field4196, 0);
                this.field4196[0] = 0.0F;
                this.field4196[1] = 0.0F;
                this.field4196[2] = 0.0F;
                this.field4196[3] = (float) class240.field3748 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field4196, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class109.method951(-1), 0);
            if (arg0 >= 0) {
                this.field4196[0] = 0.0F;
                this.field4196[1] = 1.0F / (float) class274.field4251;
                this.field4196[2] = 0.0F;
                this.field4196[3] = (float) arg0 * 1.0F / (float) class274.field4251;
                var2.glTexGenfv(8192, 9474, this.field4196, 0);
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

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V", line = 186)
    public final void method231() {
        GL var1 = class240.field3771;
        var1.glCallList(this.field4198);
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "()V", line = 192)
    public static final void method1992() {
        GL var0 = class240.field3771;
        var0.glClientActiveTexture(method1989());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
