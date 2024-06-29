import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class46 implements class321 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[F")
    private float[] field635 = new float[4];

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    private int field636 = -1;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    private int field637 = -1;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Z")
    private static boolean field634 = false;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "()V", line = 7)
    private final void method348() {
        GL var1 = class73.field1051;
        this.field636 = var1.glGenLists(2);
        var1.glNewList(this.field636, 4864);
        var1.glActiveTexture(33985);
        if (field634) {
            var1.glBindTexture(32879, class117.field1835);
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
        var1.glBindTexture(3552, this.field637);
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
        var1.glNewList(this.field636 + 1, 4864);
        var1.glActiveTexture(33985);
        if (field634) {
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

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "()I", line = 72)
    public static final int method349() {
        return field634 ? 33986 : 33985;
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "()V", line = 77)
    public static final void method350() {
        GL var0 = class73.field1051;
        var0.glClientActiveTexture(method349());
        var0.glEnableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "()V", line = 84)
    public final void method351() {
        GL var1 = class73.field1051;
        var1.glCallList(this.field636);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()I", line = 90)
    public final int method352() {
        return 0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 94)
    public final void method353(int arg0) {
        GL var2 = class73.field1051;
        var2.glActiveTexture(33985);
        if (field634 || arg0 >= 0) {
            var2.glPushMatrix();
            var2.glLoadIdentity();
            var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class94.field1334 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
            var2.glRotatef((float) class299.field4607 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
            var2.glTranslatef((float) (-class38.field548), (float) (-class309.field4821), (float) (-class257.field3937));
            if (field634) {
                this.field635[0] = 0.001F;
                this.field635[1] = 9.0E-4F;
                this.field635[2] = 0.0F;
                this.field635[3] = 0.0F;
                var2.glTexGenfv(8192, 9474, this.field635, 0);
                this.field635[0] = 0.0F;
                this.field635[1] = 9.0E-4F;
                this.field635[2] = 0.001F;
                this.field635[3] = 0.0F;
                var2.glTexGenfv(8193, 9474, this.field635, 0);
                this.field635[0] = 0.0F;
                this.field635[1] = 0.0F;
                this.field635[2] = 0.0F;
                this.field635[3] = (float) class73.field1071 * 0.005F;
                var2.glTexGenfv(8194, 9474, this.field635, 0);
                var2.glActiveTexture(33986);
            }
            var2.glTexEnvfv(8960, 8705, class322.method2234(22313), 0);
            if (arg0 >= 0) {
                this.field635[0] = 0.0F;
                this.field635[1] = 1.0F / (float) class27.field303;
                this.field635[2] = 0.0F;
                this.field635[3] = (float) arg0 * 1.0F / (float) class27.field303;
                var2.glTexGenfv(8192, 9474, this.field635, 0);
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

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "()V", line = 146)
    public static final void method354() {
        GL var0 = class73.field1051;
        var0.glClientActiveTexture(method349());
        var0.glDisableClientState(32888);
        var0.glClientActiveTexture(33984);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()V", line = 153)
    public final void method355() {
        GL var1 = class73.field1051;
        var1.glCallList(this.field636 + 1);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 171)
    public class46() {
        if (class73.field1046 >= 2) {
            int[] var1 = new int[1];
            byte[] var2 = new byte[8];
            int var3 = 0;
            while (var3 < 8) {
                var2[var3++] = (byte) (var3 * 159 / 8 + 96);
            }
            GL var4 = class73.field1051;
            var4.glGenTextures(1, var1, 0);
            var4.glBindTexture(3552, var1[0]);
            var4.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(var2));
            var4.glTexParameteri(3552, 10241, 9729);
            var4.glTexParameteri(3552, 10240, 9729);
            var4.glTexParameteri(3552, 10242, 33071);
            this.field637 = var1[0];
            field634 = class73.field1046 > 2 && class73.field1045;
            this.method348();
        }
    }
}
