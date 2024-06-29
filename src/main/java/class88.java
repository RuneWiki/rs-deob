import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class88 implements class321 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field1253 = -1;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    private int field1252 = -1;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[F")
    private float[] field1255 = new float[4];

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    private int field1256 = -1;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[F")
    private static float[] field1254 = new float[] { 0.1F, 0.1F, 0.15F, 0.1F };

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()V", line = 5)
    public static void method648() {
        field1254 = null;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "()V", line = 11)
    private final void method649() {
        byte[] var1 = new byte[] { 0, -1 };
        GL var2 = class73.field1051;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        var2.glBindTexture(3552, var3[0]);
        var2.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(var1));
        var2.glTexParameteri(3552, 10241, 9729);
        var2.glTexParameteri(3552, 10240, 9729);
        var2.glTexParameteri(3552, 10242, 33071);
        this.field1252 = var3[0];
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V", line = 27)
    public final void method355() {
        class73.field1051.glCallList(this.field1256 + 1);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 182)
    public class88() {
        this.method649();
        this.method650();
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "()V", line = 36)
    private final void method650() {
        GL var1 = class73.field1051;
        this.field1256 = var1.glGenLists(2);
        var1.glNewList(this.field1256, 4864);
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
        if (class117.field1832) {
            var1.glBindTexture(32879, class117.field1835);
            var1.glTexGeni(8194, 9472, 9217);
            var1.glTexGeni(8195, 9472, 9217);
            var1.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var1.glEnable(3170);
            var1.glEnable(3171);
            var1.glEnable(32879);
        }
        var1.glActiveTexture(33985);
        var1.glEnable(3552);
        var1.glBindTexture(3552, this.field1252);
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
        var1.glNewList(this.field1256 + 1, 4864);
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
        if (class117.field1832) {
            var1.glDisable(3170);
            var1.glDisable(3171);
            var1.glDisable(32879);
        }
        var1.glEndList();
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()V", line = 102)
    public final void method351() {
        GL var1 = class73.field1051;
        class73.method519(2);
        class73.method548(2);
        class73.method552();
        var1.glCallList(this.field1256);
        float var2 = 2662.4001F;
        float var3 = (float) (class94.field1334 - 128) * 0.5F + var2;
        if (var3 >= 3328.0F) {
            var3 = 3327.0F;
        }
        this.field1255[0] = 0.0F;
        this.field1255[1] = 0.0F;
        this.field1255[2] = 1.0F / (var3 - 3328.0F);
        this.field1255[3] = var3 / (var3 - 3328.0F);
        var1.glTexGenfv(8192, 9474, this.field1255, 0);
        var1.glPopMatrix();
        var1.glActiveTexture(33984);
        var1.glTexEnvfv(8960, 8705, field1254, 0);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()I", line = 126)
    public final int method352() {
        return 15;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 130)
    public final void method353(int arg0) {
        GL var2 = class73.field1051;
        var2.glActiveTexture(33985);
        var2.glTexEnvfv(8960, 8705, class34.field491, 0);
        var2.glActiveTexture(33984);
        if ((arg0 & 0x1) == 1) {
            if (!class117.field1832) {
                class73.method537(class117.field1834[class73.field1071 * 64 / 100 % 64]);
            } else if (class73.field1071 != this.field1253) {
                this.field1255[0] = 0.0F;
                this.field1255[1] = 0.0F;
                this.field1255[2] = 0.0F;
                this.field1255[3] = (float) class73.field1071 * 0.005F;
                var2.glTexGenfv(8194, 9473, this.field1255, 0);
                this.field1253 = class73.field1071;
            }
        } else if (class117.field1832) {
            this.field1255[0] = 0.0F;
            this.field1255[1] = 0.0F;
            this.field1255[2] = 0.0F;
            this.field1255[3] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field1255, 0);
        } else {
            class73.method537(class117.field1834[0]);
        }
    }
}
