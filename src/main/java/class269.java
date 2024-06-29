import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class269 implements class5 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    private int field4490 = -1;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    private int field4491 = -1;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "[F")
    private float[] field4492 = new float[4];

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Z")
    private static boolean field4489 = false;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "()V", line = 6)
    public static final void method2029() {
        GL var0 = class42.field627;
        var0.glClientActiveTexture(method2032());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 14)
    public final void method19(int arg0) {
        GL var2 = class42.field627;
        var2.glActiveTexture(33985);
        if (field4489 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class113.field1848 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class21.field234 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class247.field4043), (float) (-class93.field1569), (float) (-class176.field2832));
            if (field4489) {
                this.field4492[0] = 0.001F;
                this.field4492[1] = 9.0E-4F;
                this.field4492[2] = 0.0F;
                this.field4492[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field4492, 0);
                this.field4492[0] = 0.0F;
                this.field4492[1] = 9.0E-4F;
                this.field4492[2] = 0.001F;
                this.field4492[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field4492, 0);
                this.field4492[0] = 0.0F;
                this.field4492[1] = 0.0F;
                this.field4492[2] = 0.0F;
                this.field4492[3] = (float) class42.field609 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field4492, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class329.method2320((byte) 127), 0);
            if (arg0 >= 0) {
                this.field4492[0] = 0.0F;
                this.field4492[1] = 1.0F / (float) class209.field3298;
                this.field4492[2] = 0.0F;
                this.field4492[3] = (float) arg0 * 1.0F / (float) class209.field3298;
                var2.glTexGenfv(8192, 9474, this.field4492, 0);
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

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "()V", line = 66)
    public static final void method2030() {
        GL var0 = class42.field627;
        var0.glClientActiveTexture(method2032());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "()V", line = 74)
    public final void method21() {
        GL var1 = class42.field627;
        var1.glCallList(this.field4491);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()I", line = 79)
    public final int method20() {
        return 0;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "()V", line = 83)
    private final void method2031() {
        GL var1 = class42.field627;
        this.field4491 = var1.glGenLists(2);
        var1.glNewList(this.field4491, 4864);
        var1.glActiveTexture(33985);
        if (field4489) {
            var1.glBindTexture(32879, class150.field2389);
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
        var1.glBindTexture(3552, this.field4490);
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
        var1.glNewList(this.field4491 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field4489) {
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

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "()I", line = 148)
    public static final int method2032() {
        return field4489 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 171)
    public class269() {
        if (class42.field603 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class42.field627;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field4490 = var1[0];
            field4489 = class42.field603 > 2 && class42.field617;
            this.method2031();
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()V", line = 160)
    public final void method18() {
        GL var1 = class42.field627;
        var1.glCallList(this.field4491 + 1);
    }
}
