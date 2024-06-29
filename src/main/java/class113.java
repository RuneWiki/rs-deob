import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class113 implements class321 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    private int field1854 = -1;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    private int field1856 = -1;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[F")
    private float[] field1855 = new float[4];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Z")
    private static boolean field1853 = false;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "()I", line = 5)
    public static final int method859() {
        return field1853 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "()V", line = 9)
    public static final void method860() {
        GL var0 = class265.field4099;
        var0.glClientActiveTexture(method859());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()I", line = 15)
    public final int method852() {
        return 0;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()V", line = 21)
    public final void method857() {
        GL var1 = class265.field4099;
        var1.glCallList(this.field1856 + 1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V", line = 26)
    public final void method855() {
        GL var1 = class265.field4099;
        var1.glCallList(this.field1856);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 171)
    public class113() {
        if (class265.field4116 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class265.field4099;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1854 = var1[0];
            field1853 = class265.field4116 > 2 && class265.field4105;
            this.method862();
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "()V", line = 42)
    public static final void method861() {
        GL var0 = class265.field4099;
        var0.glClientActiveTexture(method859());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "()V", line = 49)
    private final void method862() {
        GL var1 = class265.field4099;
        this.field1856 = var1.glGenLists(2);
        var1.glNewList(this.field1856, 4864);
        var1.glActiveTexture(33985);
        if (field1853) {
            var1.glBindTexture(32879, class184.field2931);
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
        var1.glBindTexture(3552, this.field1854);
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
        var1.glNewList(this.field1856 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1853) {
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

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 121)
    public final void method854(int arg0) {
        GL var2 = class265.field4099;
        var2.glActiveTexture(33985);
        if (field1853 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class231.field3670 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class48.field806 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class19.field358), (float) (-class228.field3643), (float) (-class125.field1995));
            if (field1853) {
                this.field1855[0] = 0.001F;
                this.field1855[1] = 9.0E-4F;
                this.field1855[2] = 0.0F;
                this.field1855[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1855, 0);
                this.field1855[0] = 0.0F;
                this.field1855[1] = 9.0E-4F;
                this.field1855[2] = 0.001F;
                this.field1855[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1855, 0);
                this.field1855[0] = 0.0F;
                this.field1855[1] = 0.0F;
                this.field1855[2] = 0.0F;
                this.field1855[3] = (float) class265.field4118 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field1855, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class64.method494(-65), 0);
            if (arg0 >= 0) {
                this.field1855[0] = 0.0F;
                this.field1855[1] = 1.0F / (float) class219.field3506;
                this.field1855[2] = 0.0F;
                this.field1855[3] = (float) arg0 * 1.0F / (float) class219.field3506;
                var2.glTexGenfv(8192, 9474, this.field1855, 0);
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
