import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class184 extends class305 {

    @OriginalMember(owner = "client!pl", name = "Cb", descriptor = "I")
    private int field3222 = 0;

    @OriginalMember(owner = "client!pl", name = "Bb", descriptor = "I")
    private int field3221 = -1;

    @OriginalMember(owner = "client!pl", name = "zb", descriptor = "I")
    private int field3219;

    @OriginalMember(owner = "client!pl", name = "Ab", descriptor = "I")
    private int field3220;

    @OriginalMember(owner = "client!pl", name = "yb", descriptor = "[I")
    private int[] field3218;

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 6)
    public class184(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1246(arg5);
        this.method1247();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIIZ)V", line = 11)
    public final void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class247.method1704();
        GL var9 = class247.field4253;
        class247.method1691(this.field3221);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class247.field4246 - arg2), 0.0F);
        var9.glCallList(this.field3218[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() throws Throwable {
        if (this.field3221 != -1) {
            class274.method1921(this.field3221, this.field3222, this.field3219);
            this.field3221 = -1;
            this.field3222 = 0;
        }
        if (this.field3218 != null) {
            for (int var1 = 0; var1 < this.field3218.length; var1++) {
                class274.method1923(this.field3218[var1], this.field3219);
            }
            this.field3218 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([[B)V", line = 44)
    private final void method1246(byte[][] arg0) {
        if (this.field3221 != -1) {
            return;
        }
        this.field3220 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field5163[var2] > this.field3220) {
                this.field3220 = this.field5163[var2];
            }
            if (this.field5169[var2] > this.field3220) {
                this.field3220 = this.field5169[var2];
            }
        }
        this.field3220 *= 16;
        this.field3220 = class58.method383((byte) -71, this.field3220);
        int var3 = this.field3220 / 16;
        byte[] var4 = new byte[this.field3220 * this.field3220 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field3220 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field5163[var5];
            int var11 = this.field5169[var5];
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
                var8 += (this.field3220 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class247.field4253;
        if (this.field3221 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field3221 = var17[0];
            this.field3219 = class274.field4748;
        }
        class247.method1691(this.field3221);
        var16.glTexImage2D(3553, 0, 6410, this.field3220, this.field3220, 0, 6410, 5121, var15);
        class274.field4746 += var15.limit() - this.field3222;
        this.field3222 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIZ)V", line = 136)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class269.field4668 == null) {
            class247.method1704();
            GL var18 = class247.field4253;
            class247.method1691(this.field3221);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class247.field4246 - arg2), 0.0F);
            var18.glCallList(this.field3218[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class247.method1704();
        GL var8 = class247.field4253;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class247.field4246 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field5169[arg0] / (float) this.field3220 + var9;
        float var12 = (float) this.field5163[arg0] / (float) this.field3220 + var10;
        class247.method1691(this.field3221);
        class40 var13 = class269.field4668;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field842);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class269.field4667) / (float) var13.field843;
        float var15 = (float) (arg2 - class269.field4665) / (float) var13.field844;
        float var16 = (float) (arg1 + arg3 - class269.field4667) / (float) var13.field843;
        float var17 = (float) (arg2 + arg4 - class269.field4665) / (float) var13.field844;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field5169[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field5163[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field5169[arg0], (float) (-this.field5163[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "()V", line = 213)
    private final void method1247() {
        if (this.field3218 != null) {
            return;
        }
        this.field3218 = new int[256];
        GL var1 = class247.field4253;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field5169[var2] / (float) this.field3220 + var3;
            float var6 = (float) this.field5163[var2] / (float) this.field3220 + var4;
            this.field3218[var2] = var1.glGenLists(1);
            var1.glNewList(this.field3218[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field5169[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field5163[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field5169[var2], (float) (-this.field5163[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field3219 = class274.field4748;
    }
}
