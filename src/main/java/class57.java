import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class57 extends class175 {

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    private int field869 = -1;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    private int field872 = 0;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    private int field871;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "[I")
    private int[] field870;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V", line = 10)
    private final void method425() {
        if (this.field870 != null) {
            return;
        }
        this.field870 = new int[256];
        GL var1 = class245.field3884;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field2732[var2] / (float) this.field868 + var3;
            float var6 = (float) this.field2725[var2] / (float) this.field868 + var4;
            this.field870[var2] = var1.glGenLists(1);
            var1.glNewList(this.field870[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field2732[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field2725[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field2732[var2], (float) (-this.field2725[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field871 = class173.field2703;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([[B)V", line = 49)
    private final void method426(byte[][] arg0) {
        if (this.field869 != -1) {
            return;
        }
        this.field868 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field2725[var2] > this.field868) {
                this.field868 = this.field2725[var2];
            }
            if (this.field2732[var2] > this.field868) {
                this.field868 = this.field2732[var2];
            }
        }
        this.field868 *= 16;
        this.field868 = class329.method2347(this.field868, (byte) -96);
        int var3 = this.field868 / 16;
        byte[] var4 = new byte[this.field868 * this.field868 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field868 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field2725[var5];
            int var11 = this.field2732[var5];
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
                var8 += (this.field868 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class245.field3884;
        if (this.field869 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field869 = var17[0];
            this.field871 = class173.field2703;
        }
        class245.method1729(this.field869);
        var16.glTexImage2D(3553, 0, 6410, this.field868, this.field868, 0, 6410, 5121, var15);
        class173.field2705 += var15.limit() - this.field872;
        this.field872 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 141)
    public class57(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method426(arg5);
        this.method425();
    }

    @OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V", line = 146)
    protected final void finalize() throws Throwable {
        if (this.field869 != -1) {
            class173.method1191(this.field869, this.field872, this.field871);
            this.field869 = -1;
            this.field872 = 0;
        }
        if (this.field870 != null) {
            for (int var1 = 0; var1 < this.field870.length; var1++) {
                class173.method1195(this.field870[var1], this.field871);
            }
            this.field870 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIZ)V", line = 168)
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class335.field5428 == null) {
            class245.method1719();
            GL var18 = class245.field3884;
            class245.method1729(this.field869);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class245.field3862 - arg2), 0.0F);
            var18.glCallList(this.field870[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class245.method1719();
        GL var8 = class245.field3884;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class245.field3862 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field2732[arg0] / (float) this.field868 + var9;
        float var12 = (float) this.field2725[arg0] / (float) this.field868 + var10;
        class245.method1729(this.field869);
        class232 var13 = class335.field5428;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field3695);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class335.field5430) / (float) var13.field3693;
        float var15 = (float) (arg2 - class335.field5427) / (float) var13.field3697;
        float var16 = (float) (arg1 + arg3 - class335.field5430) / (float) var13.field3693;
        float var17 = (float) (arg2 + arg4 - class335.field5427) / (float) var13.field3697;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field2732[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field2725[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field2732[arg0], (float) (-this.field2725[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIZ)V", line = 237)
    public final void method428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class245.method1719();
        GL var9 = class245.field3884;
        class245.method1729(this.field869);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class245.field3862 - arg2), 0.0F);
        var9.glCallList(this.field870[arg0]);
        var9.glLoadIdentity();
    }
}
