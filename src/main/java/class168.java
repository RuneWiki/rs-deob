import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class168 implements class29 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    private int field2634 = -1;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "[F")
    private float[] field2635 = new float[4];

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    private int field2637 = -1;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Z")
    private static boolean field2636 = false;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "()V", line = 6)
    public static final void method1105() {
        GL var0 = class217.field3551;
        var0.glClientActiveTexture(method1107());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "()V", line = 15)
    public final void method37() {
        GL var1 = class217.field3551;
        var1.glCallList(this.field2634 + 1);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()V", line = 22)
    public final void method34() {
        GL var1 = class217.field3551;
        var1.glCallList(this.field2634);
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "()V", line = 28)
    public static final void method1106() {
        GL var0 = class217.field3551;
        var0.glClientActiveTexture(method1107());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "()I", line = 34)
    public static final int method1107() {
        return field2636 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "()V", line = 38)
    private final void method1108() {
        GL var1 = class217.field3551;
        this.field2634 = var1.glGenLists(2);
        var1.glNewList(this.field2634, 4864);
        var1.glActiveTexture(33985);
        if (field2636) {
            var1.glBindTexture(32879, class293.field5016);
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
        var1.glBindTexture(3552, this.field2637);
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
        var1.glNewList(this.field2634 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field2636) {
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

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 168)
    public class168() {
        if (class217.field3545 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class217.field3551;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field2637 = var1[0];
            field2636 = class217.field3545 > 2 && class217.field3538;
            this.method1108();
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 107)
    public final void method35(int arg0) {
        GL var2 = class217.field3551;
        var2.glActiveTexture(33985);
        if (field2636 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class131.field1997 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class62.field943 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class137.field2096), (float) (-class277.field4743), (float) (-class280.field4784));
            if (field2636) {
                this.field2635[0] = 0.001F;
                this.field2635[1] = 9.0E-4F;
                this.field2635[2] = 0.0F;
                this.field2635[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field2635, 0);
                this.field2635[0] = 0.0F;
                this.field2635[1] = 9.0E-4F;
                this.field2635[2] = 0.001F;
                this.field2635[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field2635, 0);
                this.field2635[0] = 0.0F;
                this.field2635[1] = 0.0F;
                this.field2635[2] = 0.0F;
                this.field2635[3] = (float) class217.field3521 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field2635, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class267.method1828(-82), 0);
            if (arg0 >= 0) {
                this.field2635[0] = 0.0F;
                this.field2635[1] = 1.0F / (float) class128.field1948;
                this.field2635[2] = 0.0F;
                this.field2635[3] = (float) arg0 * 1.0F / (float) class128.field1948;
                var2.glTexGenfv(8192, 9474, this.field2635, 0);
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

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "()I", line = 162)
    public final int method36() {
        return 0;
    }
}
