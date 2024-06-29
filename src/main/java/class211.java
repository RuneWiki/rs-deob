import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class211 extends class299 {

    @OriginalMember(owner = "client!o", name = "Cb", descriptor = "I")
    private int field3549 = -1;

    @OriginalMember(owner = "client!o", name = "Bb", descriptor = "I")
    private int field3548 = 0;

    @OriginalMember(owner = "client!o", name = "Ab", descriptor = "I")
    private int field3547;

    @OriginalMember(owner = "client!o", name = "Eb", descriptor = "I")
    private int field3551;

    @OriginalMember(owner = "client!o", name = "Db", descriptor = "[I")
    private int[] field3550;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIZ)V", line = 5)
    public final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class154.method1118();
        GL var9 = class154.field2479;
        class154.method1141(this.field3549);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class154.field2464 - arg2), 0.0F);
        var9.glCallList(this.field3550[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!o", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() throws Throwable {
        if (this.field3549 != -1) {
            class79.method613(this.field3549, this.field3548, this.field3547);
            this.field3549 = -1;
            this.field3548 = 0;
        }
        if (this.field3550 != null) {
            for (int var1 = 0; var1 < this.field3550.length; var1++) {
                class79.method615(this.field3550[var1], this.field3547);
            }
            this.field3550 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([[B)V", line = 39)
    private final void method1474(byte[][] arg0) {
        if (this.field3549 != -1) {
            return;
        }
        this.field3551 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field5101[var2] > this.field3551) {
                this.field3551 = this.field5101[var2];
            }
            if (this.field5095[var2] > this.field3551) {
                this.field3551 = this.field5095[var2];
            }
        }
        this.field3551 *= 16;
        this.field3551 = class229.method1622(true, this.field3551);
        int var3 = this.field3551 / 16;
        byte[] var4 = new byte[this.field3551 * this.field3551 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field3551 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field5101[var5];
            int var11 = this.field5095[var5];
            byte[] var12 = arg0[var5];
            for (int var13 = 0; var13 < var10; var13++) {
                for (int var14 = 0; var14 < var11; var14++) {
                    if (var12[var9++] == 0) {
                        var8 += 2;
                    } else {
                        var4[var8++] = -1;
                        var4[var8++] = -1;
                    }
                }
                var8 += (this.field3551 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class154.field2479;
        if (this.field3549 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field3549 = var17[0];
            this.field3547 = class79.field1324;
        }
        class154.method1141(this.field3549);
        var16.glTexImage2D(3553, 0, 6410, this.field3551, this.field3551, 0, 6410, 5121, var15);
        class79.field1321 += var15.limit() - this.field3548;
        this.field3548 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIZ)V", line = 131)
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class311.field5306 == null) {
            class154.method1118();
            GL var18 = class154.field2479;
            class154.method1141(this.field3549);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class154.field2464 - arg2), 0.0F);
            var18.glCallList(this.field3550[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class154.method1118();
        GL var8 = class154.field2479;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class154.field2464 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field5095[arg0] / (float) this.field3551 + var9;
        float var12 = (float) this.field5101[arg0] / (float) this.field3551 + var10;
        class154.method1141(this.field3549);
        class257 var13 = class311.field5306;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field4336);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class311.field5305) / (float) var13.field4334;
        float var15 = (float) (arg2 - class311.field5304) / (float) var13.field4338;
        float var16 = (float) (arg1 + arg3 - class311.field5305) / (float) var13.field4334;
        float var17 = (float) (arg2 + arg4 - class311.field5304) / (float) var13.field4338;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field5095[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field5101[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field5095[arg0], (float) (-this.field5101[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 197)
    public class211(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1474(arg5);
        this.method1475();
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()V", line = 202)
    private final void method1475() {
        if (this.field3550 != null) {
            return;
        }
        this.field3550 = new int[256];
        GL var1 = class154.field2479;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field5095[var2] / (float) this.field3551 + var3;
            float var6 = (float) this.field5101[var2] / (float) this.field3551 + var4;
            this.field3550[var2] = var1.glGenLists(1);
            var1.glNewList(this.field3550[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field5095[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field5101[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field5095[var2], (float) (-this.field5101[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field3547 = class79.field1324;
    }
}
