import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class74 implements class173 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[F")
    private float[] field1010 = new float[4];

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    private int field1009 = -1;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    private int field1011 = -1;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Z")
    private static boolean field1008 = false;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V", line = 10)
    private final void method561() {
        GL var1 = class109.field1456;
        this.field1011 = var1.glGenLists(2);
        var1.glNewList(this.field1011, 4864);
        var1.glActiveTexture(33985);
        if (field1008) {
            var1.glBindTexture(32879, class148.field2330);
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
        var1.glBindTexture(3552, this.field1009);
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
        var1.glNewList(this.field1011 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1008) {
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

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 171)
    public class74() {
        if (class109.field1489 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class109.field1456;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1009 = var1[0];
            field1008 = class109.field1489 > 2 && class109.field1469;
            this.method561();
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()V", line = 79)
    public final void method354() {
        GL var1 = class109.field1456;
        var1.glCallList(this.field1011);
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()I", line = 84)
    public final int method352() {
        return 0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V", line = 91)
    public final void method355() {
        GL var1 = class109.field1456;
        var1.glCallList(this.field1011 + 1);
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()V", line = 96)
    public static final void method562() {
        GL var0 = class109.field1456;
        var0.glClientActiveTexture(method563());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()I", line = 102)
    public static final int method563() {
        return field1008 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()V", line = 107)
    public static final void method564() {
        GL var0 = class109.field1456;
        var0.glClientActiveTexture(method563());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 120)
    public final void method353(int arg0) {
        GL var2 = class109.field1456;
        var2.glActiveTexture(33985);
        if (field1008 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class339.field5296 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class179.field2918 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class327.field5129), (float) (-class15.field258), (float) (-class235.field3668));
            if (field1008) {
                this.field1010[0] = 0.001F;
                this.field1010[1] = 9.0E-4F;
                this.field1010[2] = 0.0F;
                this.field1010[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1010, 0);
                this.field1010[0] = 0.0F;
                this.field1010[1] = 9.0E-4F;
                this.field1010[2] = 0.001F;
                this.field1010[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1010, 0);
                this.field1010[0] = 0.0F;
                this.field1010[1] = 0.0F;
                this.field1010[2] = 0.0F;
                this.field1010[3] = (float) class109.field1472 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field1010, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class25.method241(22985), 0);
            if (arg0 >= 0) {
                this.field1010[0] = 0.0F;
                this.field1010[1] = 1.0F / (float) class138.field2204;
                this.field1010[2] = 0.0F;
                this.field1010[3] = (float) arg0 * 1.0F / (float) class138.field2204;
                var2.glTexGenfv(8192, 9474, this.field1010, 0);
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
