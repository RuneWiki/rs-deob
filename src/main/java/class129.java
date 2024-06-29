import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class129 implements class13 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "[F")
    private float[] field2007 = new float[4];

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    private int field2010 = -1;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    private int field2006 = -1;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    private int field2008 = -1;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "[F")
    private static float[] field2009 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "()V", line = 8)
    public static void method906() {
        field2009 = null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 15)
    public final void method49() {
        GL var1 = class90.field1390;
        class90.method609(2);
        class90.method615(2);
        class90.method632();
        var1.glCallList(this.field2008);
        float var2 = 2662.4001F;
        float var3 = (float) (class83.field1259 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2007[0] = 0.0F;
        this.field2007[1] = 0.0F;
        this.field2007[2] = 1.0F / (var3 - 3328.0F);
        this.field2007[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2007, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2009, 0);
        if (!class184.field2951) {
            class90.method617(class184.field2952[class90.field1388 * 64 / 100 % 64]);
        } else if (class90.field1388 != this.field2010) {
            this.field2007[0] = 0.0F;
            this.field2007[1] = 0.0F;
            this.field2007[2] = 0.0F;
            this.field2007[3] = (float) class90.field1388 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field2007, 0);
            this.field2010 = class90.field1388;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 161)
    public class129() {
        this.method908();
        this.method907();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I", line = 56)
    public final int method48() {
        return 15;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "()V", line = 63)
    private final void method907() {
        GL var1 = class90.field1390;
        this.field2008 = var1.glGenLists(2);
        var1.glNewList(this.field2008, 4864);
        var1.glTexEnvi(8960, 34192, 768);
        var1.glTexEnvi(8960, 34177, 34166);
        var1.glTexEnvf(8960, 34163, 2.0F);
        var1.glTexEnvi(8960, 34185, 34166);
        var1.glTexGeni(8192, 9472, 9217);
        var1.glTexGeni(8193, 9472, 9217);
        var1.glTexGenfv(8192, 9473, new float[] { 9.765625E-4F, 0.0F, 0.0F, 0.0F }, 0);
        var1.glTexGenfv(8193, 9473, new float[] { 0.0F, 0.0F, 9.765625E-4F, 0.0F }, 0);
        var1.glEnable(3168);
        var1.glEnable(3169);
        if (class184.field2951) {
            var1.glBindTexture(32879, class184.field2949);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2006);
        var1.glTexEnvi(8960, 34161, 34165);
        var1.glTexEnvi(8960, 34176, 34166);
        var1.glTexEnvi(8960, 34178, 5890);
        var1.glTexEnvi(8960, 34162, 34165);
        var1.glTexEnvi(8960, 34184, 34166);
        var1.glTexEnvi(8960, 34186, 5890);
        var1.glEnable(3168);
        var1.glTexGeni(8192, 9472, 9216);
        var1.glPushMatrix();
        var1.glLoadIdentity();
        var1.glEndList();
        var1.glNewList(this.field2008 + 1, 4864);
        var1.glActiveTexture(33985);
        var1.glDisable(3552);
        var1.glDisable(3168);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34176, 5890);
        var1.glTexEnvi(8960, 34178, 34166);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glTexEnvi(8960, 34186, 34166);
        var1.glActiveTexture(33984);
        var1.glTexEnvi(8960, 34192, 768);
        var1.glTexEnvi(8960, 34177, 34168);
        var1.glTexEnvf(8960, 34163, 1.0F);
        var1.glTexEnvi(8960, 34185, 34168);
        var1.glDisable(3168);
        var1.glDisable(3169);
        if (class184.field2951) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 129)
    public final void method47(int arg0) {
        GL var2 = class90.field1390;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class156.field2470, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "()V", line = 143)
    private final void method908() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class90.field1390;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2006 = var3[0];
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V", line = 166)
    public final void method50() {
        class90.field1390.glCallList(this.field2008 + 1);
    }
}
