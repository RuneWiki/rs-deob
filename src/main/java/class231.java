import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class231 extends class323 {

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    private int field3842 = 0;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    private int field3846 = -1;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    private int field3843;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    private int field3844;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "[I")
    private int[] field3845;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([[B)V", line = 7)
    private final void method1661(byte[][] arg0) {
        if (this.field3846 != -1) {
            return;
        }
        this.field3844 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field5130[var2] > this.field3844) {
                this.field3844 = this.field5130[var2];
            }
            if (this.field5125[var2] > this.field3844) {
                this.field3844 = this.field5125[var2];
            }
        }
        this.field3844 *= 16;
        this.field3844 = class168.method1318(this.field3844, false);
        int var3 = this.field3844 / 16;
        byte[] var4 = new byte[this.field3844 * this.field3844 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field3844 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field5130[var5];
            int var11 = this.field5125[var5];
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
                var8 += (this.field3844 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class43.field651;
        if (this.field3846 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field3846 = var17[0];
            this.field3843 = class151.field2669;
        }
        class43.method390(this.field3846);
        var16.glTexImage2D(3553, 0, 6410, this.field3844, this.field3844, 0, 6410, 5121, var15);
        class151.field2667 += var15.limit() - this.field3842;
        this.field3842 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 170)
    public class231(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1661(arg5);
        this.method1664();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIZ)V", line = 105)
    public final void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class169.field2937 == null) {
            class43.method383();
            GL var18 = class43.field651;
            class43.method390(this.field3846);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class43.field665 - arg2), 0.0F);
            var18.glCallList(this.field3845[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class43.method383();
        GL var8 = class43.field651;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class43.field665 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field5125[arg0] / (float) this.field3844 + var9;
        float var12 = (float) this.field5130[arg0] / (float) this.field3844 + var10;
        class43.method390(this.field3846);
        class157 var13 = class169.field2937;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field2778);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class169.field2939) / (float) var13.field2783;
        float var15 = (float) (arg2 - class169.field2940) / (float) var13.field2779;
        float var16 = (float) (arg1 + arg3 - class169.field2939) / (float) var13.field2783;
        float var17 = (float) (arg2 + arg4 - class169.field2940) / (float) var13.field2779;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field5125[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field5130[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field5125[arg0], (float) (-this.field5130[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIZ)V", line = 175)
    public final void method1663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class43.method383();
        GL var9 = class43.field651;
        class43.method390(this.field3846);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class43.field665 - arg2), 0.0F);
        var9.glCallList(this.field3845[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V", line = 187)
    protected final void finalize() throws Throwable {
        if (this.field3846 != -1) {
            class151.method1186(this.field3846, this.field3842, this.field3843);
            this.field3846 = -1;
            this.field3842 = 0;
        }
        if (this.field3845 != null) {
            for (int var1 = 0; var1 < this.field3845.length; var1++) {
                class151.method1192(this.field3845[var1], this.field3843);
            }
            this.field3845 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()V", line = 209)
    private final void method1664() {
        if (this.field3845 != null) {
            return;
        }
        this.field3845 = new int[256];
        GL var1 = class43.field651;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field5125[var2] / (float) this.field3844 + var3;
            float var6 = (float) this.field5130[var2] / (float) this.field3844 + var4;
            this.field3845[var2] = var1.glGenLists(1);
            var1.glNewList(this.field3845[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field5125[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field5130[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field5125[var2], (float) (-this.field5130[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field3843 = class151.field2669;
    }
}
