import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class321 implements class145 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[F")
    private float[] field5016 = new float[4];

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    private int field5015 = -1;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    private int field5018 = -1;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Z")
    private static boolean field5017 = false;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()V", line = 6)
    public final void method315() {
        GL var1 = class333.field5160;
        var1.glCallList(this.field5018);
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()I", line = 10)
    public static final int method2174() {
        return field5017 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "()V", line = 14)
    public static final void method2175() {
        GL var0 = class333.field5160;
        var0.glClientActiveTexture(method2174());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 23)
    public final void method321(int arg0) {
        GL var2 = class333.field5160;
        var2.glActiveTexture(33985);
        if (field5017 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class143.field2261 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class225.field3597 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class160.field2494), (float) (-class45.field635), (float) (-class277.field4276));
            if (field5017) {
                this.field5016[0] = 0.001F;
                this.field5016[1] = 9.0E-4F;
                this.field5016[2] = 0.0F;
                this.field5016[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field5016, 0);
                this.field5016[0] = 0.0F;
                this.field5016[1] = 9.0E-4F;
                this.field5016[2] = 0.001F;
                this.field5016[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field5016, 0);
                this.field5016[0] = 0.0F;
                this.field5016[1] = 0.0F;
                this.field5016[2] = 0.0F;
                this.field5016[3] = (float) class333.field5180 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field5016, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class124.method840((byte) 124), 0);
            if (arg0 >= 0) {
                this.field5016[0] = 0.0F;
                this.field5016[1] = 1.0F / (float) class78.field1164;
                this.field5016[2] = 0.0F;
                this.field5016[3] = (float) arg0 * 1.0F / (float) class78.field1164;
                var2.glTexGenfv(8192, 9474, this.field5016, 0);
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

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()I", line = 74)
    public final int method320() {
        return 0;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "()V", line = 78)
    private final void method2176() {
        GL var1 = class333.field5160;
        this.field5018 = var1.glGenLists(2);
        var1.glNewList(this.field5018, 4864);
        var1.glActiveTexture(33985);
        if (field5017) {
            var1.glBindTexture(32879, class49.field702);
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
        var1.glBindTexture(3552, this.field5015);
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
        var1.glNewList(this.field5018 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field5017) {
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

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 171)
    public class321() {
        if (class333.field5174 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class333.field5160;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field5015 = var1[0];
            field5017 = class333.field5174 > 2 && class333.field5184;
            this.method2176();
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "()V", line = 148)
    public static final void method2177() {
        GL var0 = class333.field5160;
        var0.glClientActiveTexture(method2174());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()V", line = 156)
    public final void method318() {
        GL var1 = class333.field5160;
        var1.glCallList(this.field5018 + 1);
    }
}
