import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class67 extends class143 {

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
    private int field871 = -1;

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    private int field870 = 0;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    private int field869;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "[I")
    private int[] field872;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIZ)V", line = 7)
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class344.field5357 == null) {
            class186.method1296();
            GL var18 = class186.field2990;
            class186.method1288(this.field871);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class186.field2980 - arg2), 0.0F);
            var18.glCallList(this.field872[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class186.method1296();
        GL var8 = class186.field2990;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class186.field2980 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field2139[arg0] / (float) this.field869 + var9;
        float var12 = (float) this.field2146[arg0] / (float) this.field869 + var10;
        class186.method1288(this.field871);
        class14 var13 = class344.field5357;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field166);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class344.field5359) / (float) var13.field165;
        float var15 = (float) (arg2 - class344.field5356) / (float) var13.field171;
        float var16 = (float) (arg1 + arg3 - class344.field5359) / (float) var13.field165;
        float var17 = (float) (arg2 + arg4 - class344.field5356) / (float) var13.field171;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field2139[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field2146[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field2139[arg0], (float) (-this.field2146[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "()V", line = 72)
    private final void method438() {
        if (this.field872 != null) {
            return;
        }
        this.field872 = new int[256];
        GL var1 = class186.field2990;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field2139[var2] / (float) this.field869 + var3;
            float var6 = (float) this.field2146[var2] / (float) this.field869 + var4;
            this.field872[var2] = var1.glGenLists(1);
            var1.glNewList(this.field872[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field2139[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field2146[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field2139[var2], (float) (-this.field2146[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field868 = class275.field4359;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 110)
    public class67(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method440(arg5);
        this.method438();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIZ)V", line = 117)
    public final void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class186.method1296();
        GL var9 = class186.field2990;
        class186.method1288(this.field871);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class186.field2980 - arg2), 0.0F);
        var9.glCallList(this.field872[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([[B)V", line = 128)
    private final void method440(byte[][] arg0) {
        if (this.field871 != -1) {
            return;
        }
        this.field869 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field2146[var2] > this.field869) {
                this.field869 = this.field2146[var2];
            }
            if (this.field2139[var2] > this.field869) {
                this.field869 = this.field2139[var2];
            }
        }
        this.field869 *= 16;
        this.field869 = class290.method2032(105, this.field869);
        int var3 = this.field869 / 16;
        byte[] var4 = new byte[this.field869 * this.field869 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field869 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field2146[var5];
            int var11 = this.field2139[var5];
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
                var8 += (this.field869 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class186.field2990;
        if (this.field871 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field871 = var17[0];
            this.field868 = class275.field4359;
        }
        class186.method1288(this.field871);
        var16.glTexImage2D(3553, 0, 6410, this.field869, this.field869, 0, 6410, 5121, var15);
        class275.field4357 += var15.limit() - this.field870;
        this.field870 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V", line = 223)
    protected final void finalize() throws Throwable {
        if (this.field871 != -1) {
            class275.method1961(this.field871, this.field870, this.field868);
            this.field871 = -1;
            this.field870 = 0;
        }
        if (this.field872 != null) {
            for (int var1 = 0; var1 < this.field872.length; var1++) {
                class275.method1964(this.field872[var1], this.field868);
            }
            this.field872 = null;
        }
        super.finalize();
    }
}
