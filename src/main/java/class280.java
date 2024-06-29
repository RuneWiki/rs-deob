import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class280 extends class253 {

    @OriginalMember(owner = "client!b", name = "Cb", descriptor = "I")
    private int field4566 = 0;

    @OriginalMember(owner = "client!b", name = "Bb", descriptor = "I")
    private int field4565 = -1;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    private int field4563;

    @OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
    private int field4567;

    @OriginalMember(owner = "client!b", name = "Ab", descriptor = "[I")
    private int[] field4564;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIZ)V", line = 10)
    public final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class166.method1158();
        GL var9 = class166.field2648;
        class166.method1182(this.field4565);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class166.field2651 - arg2), 0.0F);
        var9.glCallList(this.field4564[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([[B)V", line = 20)
    private final void method1977(byte[][] arg0) {
        if (this.field4565 != -1) {
            return;
        }
        this.field4567 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field4050[var2] > this.field4567) {
                this.field4567 = this.field4050[var2];
            }
            if (this.field4020[var2] > this.field4567) {
                this.field4567 = this.field4020[var2];
            }
        }
        this.field4567 *= 16;
        this.field4567 = class110.method746(this.field4567, -705295902);
        int var3 = this.field4567 / 16;
        byte[] var4 = new byte[this.field4567 * this.field4567 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field4567 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field4050[var5];
            int var11 = this.field4020[var5];
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
                var8 += (this.field4567 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class166.field2648;
        if (this.field4565 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field4565 = var17[0];
            this.field4563 = class103.field1460;
        }
        class166.method1182(this.field4565);
        var16.glTexImage2D(3553, 0, 6410, this.field4567, this.field4567, 0, 6410, 5121, var15);
        class103.field1458 += var15.limit() - this.field4566;
        this.field4566 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 244)
    public class280(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1977(arg5);
        this.method1978();
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 115)
    protected final void finalize() throws Throwable {
        if (this.field4565 != -1) {
            class103.method713(this.field4565, this.field4566, this.field4563);
            this.field4565 = -1;
            this.field4566 = 0;
        }
        if (this.field4564 != null) {
            for (int var1 = 0; var1 < this.field4564.length; var1++) {
                class103.method716(this.field4564[var1], this.field4563);
            }
            this.field4564 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 137)
    private final void method1978() {
        if (this.field4564 != null) {
            return;
        }
        this.field4564 = new int[256];
        GL var1 = class166.field2648;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field4020[var2] / (float) this.field4567 + var3;
            float var6 = (float) this.field4050[var2] / (float) this.field4567 + var4;
            this.field4564[var2] = var1.glGenLists(1);
            var1.glNewList(this.field4564[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field4020[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field4050[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field4020[var2], (float) (-this.field4050[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field4563 = class103.field1460;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIZ)V", line = 178)
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class190.field3076 == null) {
            class166.method1158();
            GL var18 = class166.field2648;
            class166.method1182(this.field4565);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class166.field2651 - arg2), 0.0F);
            var18.glCallList(this.field4564[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class166.method1158();
        GL var8 = class166.field2648;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class166.field2651 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field4020[arg0] / (float) this.field4567 + var9;
        float var12 = (float) this.field4050[arg0] / (float) this.field4567 + var10;
        class166.method1182(this.field4565);
        class17 var13 = class190.field3076;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field222);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class190.field3075) / (float) var13.field220;
        float var15 = (float) (arg2 - class190.field3073) / (float) var13.field221;
        float var16 = (float) (arg1 + arg3 - class190.field3075) / (float) var13.field220;
        float var17 = (float) (arg2 + arg4 - class190.field3073) / (float) var13.field221;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field4020[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field4050[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field4020[arg0], (float) (-this.field4050[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }
}
