import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class107 implements class243 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    private int field1791 = -1;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "[F")
    private float[] field1795 = new float[4];

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    private int field1793 = -1;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    private int field1794 = -1;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[F")
    private static float[] field1792 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 98)
    public class107() {
        this.method831();
        this.method833();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 10)
    public final void method161(int arg0) {
        GL var2 = class47.field739;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class268.field4638, 0);
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "()I", line = 16)
    public final int method163() {
        return 15;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "()V", line = 22)
    private final void method831() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class47.field739;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field1791 = var3[0];
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()V", line = 42)
    public final void method164() {
        class47.field739.glCallList(this.field1793 + 1);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()V", line = 49)
    public final void method162() {
        GL var1 = class47.field739;
        class47.method324(2);
        class47.method337(2);
        class47.method319();
        var1.glCallList(this.field1793);
        float var2 = 2662.4001F;
        float var3 = (float) (class155.field2651 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field1795[0] = 0.0F;
        this.field1795[1] = 0.0F;
        this.field1795[2] = 1.0F / (var3 - 3328.0F);
        this.field1795[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field1795, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field1792, 0);
        if (!class225.field3801) {
            class47.method317(class225.field3805[class47.field743 * 64 / 100 % 64]);
        } else if (class47.field743 != this.field1794) {
            this.field1795[0] = 0.0F;
            this.field1795[1] = 0.0F;
            this.field1795[2] = 0.0F;
            this.field1795[3] = (float) class47.field743 * 0.005F;
            var1.glTexGenfv(8194, 9473, this.field1795, 0);
            this.field1794 = class47.field743;
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "()V", line = 87)
    public static void method832() {
        field1792 = null;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "()V", line = 104)
    private final void method833() {
        GL var1 = class47.field739;
        this.field1793 = var1.glGenLists(2);
        var1.glNewList(this.field1793, 4864);
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
        if (class225.field3801) {
            var1.glBindTexture(32879, class225.field3802);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field1791);
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
        var1.glNewList(this.field1793 + 1, 4864);
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
        if (class225.field3801) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }
}
