import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class140 implements class246 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    private int field2177 = -1;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "[F")
    private float[] field2175 = new float[4];

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    private int field2176 = -1;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    private int field2178 = -1;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[F")
    private static float[] field2179 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()V", line = 6)
    public final void method454() {
        class94.field1473.glCallList(this.field2176 + 1);
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()V", line = 9)
    public static void method1007() {
        field2179 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 14)
    public final void method457(int arg0) {
        GL var2 = class94.field1473;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class229.field3645, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class334.field5229) {
                class94.method698(class334.field5228[class94.field1499 * 64 / 100 % 64]);
            } else if (class94.field1499 != this.field2177) {
                this.field2175[0] = 0.0F;
                this.field2175[1] = 0.0F;
                this.field2175[2] = 0.0F;
                this.field2175[3] = (float) class94.field1499 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field2175, 0);
                this.field2177 = class94.field1499;
            }
        } else if (class334.field5229) {
            this.field2175[0] = 0.0F;
            this.field2175[1] = 0.0F;
            this.field2175[2] = 0.0F;
            this.field2175[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2175, 0);
        } else {
            class94.method698(class334.field5228[0]);
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 182)
    public class140() {
        this.method1008();
        this.method1009();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V", line = 64)
    public final void method458() {
        GL var1 = class94.field1473;
        class94.method677(2);
        class94.method675(2);
        class94.method695();
        var1.glCallList(this.field2176);
        float var2 = 2662.4001F;
        float var3 = (float) (class40.field607 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2175[0] = 0.0F;
        this.field2175[1] = 0.0F;
        this.field2175[2] = 1.0F / (var3 - 3328.0F);
        this.field2175[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2175, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2179, 0);
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "()V", line = 89)
    private final void method1008() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class94.field1473;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2178 = var3[0];
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "()V", line = 106)
    private final void method1009() {
        GL var1 = class94.field1473;
        this.field2176 = var1.glGenLists(2);
        var1.glNewList(this.field2176, 4864);
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
        if (class334.field5229) {
            var1.glBindTexture(32879, class334.field5224);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2178);
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
        var1.glNewList(this.field2176 + 1, 4864);
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
        if (class334.field5229) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()I", line = 171)
    public final int method452() {
        return 15;
    }
}
