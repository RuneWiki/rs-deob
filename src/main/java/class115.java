import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class115 implements class38 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    private int field1732 = -1;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    private int field1735 = -1;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "[F")
    private float[] field1734 = new float[4];

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Z")
    private static boolean field1733 = false;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()I", line = 5)
    public final int method296() {
        return 0;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "()V", line = 9)
    public static final void method728() {
        GL var0 = class264.field4313;
        var0.glClientActiveTexture(method729());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "()I", line = 15)
    public static final int method729() {
        return field1733 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 21)
    public final void method294(int arg0) {
        GL var2 = class264.field4313;
        var2.glActiveTexture(33985);
        if (field1733 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class270.field4458 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class297.field5008 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class254.field4089), (float) (-class81.field1233), (float) (-class164.field2589));
            if (field1733) {
                this.field1734[0] = 0.001F;
                this.field1734[1] = 9.0E-4F;
                this.field1734[2] = 0.0F;
                this.field1734[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1734, 0);
                this.field1734[0] = 0.0F;
                this.field1734[1] = 9.0E-4F;
                this.field1734[2] = 0.001F;
                this.field1734[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1734, 0);
                this.field1734[0] = 0.0F;
                this.field1734[1] = 0.0F;
                this.field1734[2] = 0.0F;
                this.field1734[3] = (float) class264.field4319 * 0.01F;
                var2.glTexGenfv(8194, 9474, this.field1734, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class167.method1054(-23149), 0);
            if (arg0 >= 0) {
                this.field1734[0] = 0.0F;
                this.field1734[1] = 1.0F / (float) class289.field4757;
                this.field1734[2] = 0.0F;
                this.field1734[3] = (float) arg0 * 1.0F / (float) class289.field4757;
                var2.glTexGenfv(8192, 9474, this.field1734, 0);
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

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "()V", line = 73)
    private final void method730() {
        GL var1 = class264.field4313;
        this.field1732 = var1.glGenLists(2);
        var1.glNewList(this.field1732, 4864);
        var1.glActiveTexture(33985);
        if (field1733) {
            var1.glBindTexture(32879, class136.field2203);
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
        var1.glBindTexture(3552, this.field1735);
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
        var1.glNewList(this.field1732 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1733) {
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

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V", line = 140)
    public final void method293() {
        GL var1 = class264.field4313;
        var1.glCallList(this.field1732 + 1);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 171)
    public class115() {
        if (class264.field4308 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class264.field4313;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1735 = var1[0];
            field1733 = class264.field4308 > 2 && class264.field4322;
            this.method730();
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()V", line = 149)
    public final void method295() {
        GL var1 = class264.field4313;
        var1.glCallList(this.field1732);
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "()V", line = 157)
    public static final void method731() {
        GL var0 = class264.field4313;
        var0.glClientActiveTexture(method729());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
