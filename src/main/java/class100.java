import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class100 implements class246 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    private int field1578 = -1;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    private int field1579 = -1;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[F")
    private float[] field1580 = new float[4];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Z")
    private static boolean field1577 = false;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()I", line = 5)
    public final int method452() {
        return 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 10)
    public final void method457(int arg0) {
        GL var2 = class94.field1473;
        var2.glActiveTexture(33985);
        if (field1577 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class40.field607 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class77.field1239 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class300.field4683), (float) (-class285.field4469), (float) (-class22.field344));
            if (field1577) {
                this.field1580[0] = 0.001F;
                this.field1580[1] = 9.0E-4F;
                this.field1580[2] = 0.0F;
                this.field1580[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field1580, 0);
                this.field1580[0] = 0.0F;
                this.field1580[1] = 9.0E-4F;
                this.field1580[2] = 0.001F;
                this.field1580[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field1580, 0);
                this.field1580[0] = 0.0F;
                this.field1580[1] = 0.0F;
                this.field1580[2] = 0.0F;
                this.field1580[3] = (float) class94.field1499 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field1580, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class62.method483(8713), 0);
            if (arg0 >= 0) {
                this.field1580[0] = 0.0F;
                this.field1580[1] = 1.0F / (float) class307.field4768;
                this.field1580[2] = 0.0F;
                this.field1580[3] = (float) arg0 * 1.0F / (float) class307.field4768;
                var2.glTexGenfv(8192, 9474, this.field1580, 0);
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

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()V", line = 62)
    public final void method454() {
        GL var1 = class94.field1473;
        var1.glCallList(this.field1579 + 1);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V", line = 68)
    public final void method458() {
        GL var1 = class94.field1473;
        var1.glCallList(this.field1579);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 171)
    public class100() {
        if (class94.field1477 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class94.field1473;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field1578 = var1[0];
            field1577 = class94.field1477 > 2 && class94.field1500;
            this.method735();
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()V", line = 77)
    public static final void method734() {
        GL var0 = class94.field1473;
        var0.glClientActiveTexture(method736());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "()V", line = 93)
    private final void method735() {
        GL var1 = class94.field1473;
        this.field1579 = var1.glGenLists(2);
        var1.glNewList(this.field1579, 4864);
        var1.glActiveTexture(33985);
        if (field1577) {
            var1.glBindTexture(32879, class334.field5224);
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
        var1.glBindTexture(3552, this.field1578);
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
        var1.glNewList(this.field1579 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field1577) {
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

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "()I", line = 161)
    public static final int method736() {
        return field1577 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "()V", line = 165)
    public static final void method737() {
        GL var0 = class94.field1473;
        var0.glClientActiveTexture(method736());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }
}
