import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 implements class91 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    private int field25 = -1;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[F")
    private float[] field27 = new float[4];

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    private int field28 = -1;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    private int field29 = -1;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[F")
    private static float[] field26 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()V", line = 6)
    private final void method12() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class255.field4181;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field28 = var3[0];
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()V", line = 23)
    public static void method13() {
        field26 = null;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "()V", line = 27)
    private final void method14() {
        GL var1 = class255.field4181;
        this.field25 = var1.glGenLists(2);
        var1.glNewList(this.field25, 4864);
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
        if (class49.field775) {
            var1.glBindTexture(32879, class49.field776);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field28);
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
        var1.glNewList(this.field25 + 1, 4864);
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
        if (class49.field775) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V", line = 92)
    public final void method15() {
        class255.field4181.glCallList(this.field25 + 1);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 181)
    public class3() {
        this.method12();
        this.method14();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 100)
    public final void method16(int arg0) {
        GL var2 = class255.field4181;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class73.field1124, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class49.field775) {
                class255.method1790(class49.field772[class255.field4168 * 64 / 100 % 64]);
            } else if (class255.field4168 != this.field29) {
                this.field27[0] = 0.0F;
                this.field27[1] = 0.0F;
                this.field27[2] = 0.0F;
                this.field27[3] = (float) class255.field4168 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field27, 0);
                this.field29 = class255.field4168;
            }
        } else if (class49.field775) {
            this.field27[0] = 0.0F;
            this.field27[1] = 0.0F;
            this.field27[2] = 0.0F;
            this.field27[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field27, 0);
        } else {
            class255.method1790(class49.field772[0]);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 148)
    public final void method17() {
        GL var1 = class255.field4181;
        class255.method1796(2);
        class255.method1787(2);
        class255.method1763();
        var1.glCallList(this.field25);
        float var2 = 2662.4001F;
        float var3 = (float) (class141.field2159 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field27[0] = 0.0F;
        this.field27[1] = 0.0F;
        this.field27[2] = 1.0F / (var3 - 3328.0F);
        this.field27[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field27, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field26, 0);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()I", line = 169)
    public final int method18() {
        return 15;
    }
}
