import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class193 implements class62 {

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    private int field2981 = -1;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    private int field2982 = -1;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "[F")
    private float[] field2983 = new float[4];

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    private int field2984 = -1;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "[F")
    private static float[] field2980 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "()V", line = 6)
    public final void method117() {
        class245.field3884.glCallList(this.field2984 + 1);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "()V", line = 10)
    public final void method120() {
        GL var1 = class245.field3884;
        class245.method1721(2);
        class245.method1709(2);
        class245.method1710();
        var1.glCallList(this.field2984);
        float var2 = 2662.4001F;
        float var3 = (float) (class98.field1427 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field2983[0] = 0.0F;
        this.field2983[1] = 0.0F;
        this.field2983[2] = 1.0F / (var3 - 3328.0F);
        this.field2983[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field2983, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field2980, 0);
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "()V", line = 32)
    private final void method1328() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class245.field3884;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field2982 = var3[0];
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 179)
    public class193() {
        this.method1328();
        this.method1329();
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "()V", line = 59)
    private final void method1329() {
        GL var1 = class245.field3884;
        this.field2984 = var1.glGenLists(2);
        var1.glNewList(this.field2984, 4864);
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
        if (class43.field635) {
            var1.glBindTexture(32879, class43.field639);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field2982);
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
        var1.glNewList(this.field2984 + 1, 4864);
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
        if (class43.field635) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 125)
    public final void method119(int arg0) {
        GL var2 = class245.field3884;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class153.field2482, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class43.field635) {
                class245.method1729(class43.field636[class245.field3882 * 64 / 100 % 64]);
            } else if (class245.field3882 != this.field2981) {
                this.field2983[0] = 0.0F;
                this.field2983[1] = 0.0F;
                this.field2983[2] = 0.0F;
                this.field2983[3] = (float) class245.field3882 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field2983, 0);
                this.field2981 = class245.field3882;
            }
        } else if (class43.field635) {
            this.field2983[0] = 0.0F;
            this.field2983[1] = 0.0F;
            this.field2983[2] = 0.0F;
            this.field2983[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2983, 0);
        } else {
            class245.method1729(class43.field636[0]);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "()I", line = 167)
    public final int method121() {
        return 15;
    }

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "()V", line = 184)
    public static void method1330() {
        field2980 = null;
    }
}
