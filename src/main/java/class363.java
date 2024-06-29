import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class363 extends class29 {

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    private int field5753 = 0;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
    private int field5751 = -1;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    private int field5749;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    private int field5750;

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "[I")
    private int[] field5752;

    @OriginalMember(owner = "client!jk", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        if (this.field5751 != -1) {
            class305.method2143(this.field5751, this.field5753, this.field5750);
            this.field5751 = -1;
            this.field5753 = 0;
        }
        if (this.field5752 != null) {
            for (int var1 = 0; var1 < this.field5752.length; var1++) {
                class305.method2147(this.field5752[var1], this.field5750);
            }
            this.field5752 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIZ)V", line = 31)
    public final void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class205.field3007 == null) {
            class141.method991();
            GL var18 = class141.field2025;
            class141.method1000(this.field5751);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class141.field2044 - arg2), 0.0F);
            var18.glCallList(this.field5752[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class141.method991();
        GL var8 = class141.field2025;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class141.field2044 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field414[arg0] / (float) this.field5749 + var9;
        float var12 = (float) this.field404[arg0] / (float) this.field5749 + var10;
        class141.method1000(this.field5751);
        class325 var13 = class205.field3007;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field4891);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class205.field3004) / (float) var13.field4889;
        float var15 = (float) (arg2 - class205.field3006) / (float) var13.field4890;
        float var16 = (float) (arg1 + arg3 - class205.field3004) / (float) var13.field4889;
        float var17 = (float) (arg2 + arg4 - class205.field3006) / (float) var13.field4890;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field414[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field404[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field414[arg0], (float) (-this.field404[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([[B)V", line = 97)
    private final void method2549(byte[][] arg0) {
        if (this.field5751 != -1) {
            return;
        }
        this.field5749 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field404[var2] > this.field5749) {
                this.field5749 = this.field404[var2];
            }
            if (this.field414[var2] > this.field5749) {
                this.field5749 = this.field414[var2];
            }
        }
        this.field5749 *= 16;
        this.field5749 = class344.method2409(this.field5749, -24724);
        int var3 = this.field5749 / 16;
        byte[] var4 = new byte[this.field5749 * this.field5749 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field5749 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field404[var5];
            int var11 = this.field414[var5];
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
                var8 += (this.field5749 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class141.field2025;
        if (this.field5751 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field5751 = var17[0];
            this.field5750 = class305.field4573;
        }
        class141.method1000(this.field5751);
        var16.glTexImage2D(3553, 0, 6410, this.field5749, this.field5749, 0, 6410, 5121, var15);
        class305.field4569 += var15.limit() - this.field5753;
        this.field5753 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "()V", line = 189)
    private final void method2550() {
        if (this.field5752 != null) {
            return;
        }
        this.field5752 = new int[256];
        GL var1 = class141.field2025;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field414[var2] / (float) this.field5749 + var3;
            float var6 = (float) this.field404[var2] / (float) this.field5749 + var4;
            this.field5752[var2] = var1.glGenLists(1);
            var1.glNewList(this.field5752[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field414[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field404[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field414[var2], (float) (-this.field404[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field5750 = class305.field4573;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 229)
    public class363(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method2549(arg5);
        this.method2550();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIIZ)V", line = 237)
    public final void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class141.method991();
        GL var9 = class141.field2025;
        class141.method1000(this.field5751);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class141.field2044 - arg2), 0.0F);
        var9.glCallList(this.field5752[arg0]);
        var9.glLoadIdentity();
    }
}
