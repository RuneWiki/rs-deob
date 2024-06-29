import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class269 extends class299 {

    @OriginalMember(owner = "client!fj", name = "wb", descriptor = "I")
    private int field4624 = 0;

    @OriginalMember(owner = "client!fj", name = "xb", descriptor = "I")
    private int field4625 = -1;

    @OriginalMember(owner = "client!fj", name = "yb", descriptor = "I")
    private int field4626;

    @OriginalMember(owner = "client!fj", name = "zb", descriptor = "I")
    private int field4627;

    @OriginalMember(owner = "client!fj", name = "Ab", descriptor = "[I")
    private int[] field4628;

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 6)
    public class269(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1850(arg5);
        this.method1849();
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()V", line = 13)
    private final void method1849() {
        if (this.field4628 != null) {
            return;
        }
        this.field4628 = new int[256];
        GL var1 = class45.field688;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field5044[var2] / (float) this.field4627 + var3;
            float var6 = (float) this.field5022[var2] / (float) this.field4627 + var4;
            this.field4628[var2] = var1.glGenLists(1);
            var1.glNewList(this.field4628[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field5044[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field5022[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field5044[var2], (float) (-this.field5022[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field4626 = class36.field576;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([[B)V", line = 52)
    private final void method1850(byte[][] arg0) {
        if (this.field4625 != -1) {
            return;
        }
        this.field4627 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field5022[var2] > this.field4627) {
                this.field4627 = this.field5022[var2];
            }
            if (this.field5044[var2] > this.field4627) {
                this.field4627 = this.field5044[var2];
            }
        }
        this.field4627 *= 16;
        this.field4627 = class275.method1871(this.field4627, 1110164296);
        int var3 = this.field4627 / 16;
        byte[] var4 = new byte[this.field4627 * this.field4627 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field4627 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field5022[var5];
            int var11 = this.field5044[var5];
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
                var8 += (this.field4627 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class45.field688;
        if (this.field4625 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field4625 = var17[0];
            this.field4626 = class36.field576;
        }
        class45.method321(this.field4625);
        var16.glTexImage2D(3553, 0, 6410, this.field4627, this.field4627, 0, 6410, 5121, var15);
        class36.field573 += var15.limit() - this.field4624;
        this.field4624 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V", line = 152)
    protected final void finalize() throws Throwable {
        if (this.field4625 != -1) {
            class36.method259(this.field4625, this.field4624, this.field4626);
            this.field4625 = -1;
            this.field4624 = 0;
        }
        if (this.field4628 != null) {
            for (int var1 = 0; var1 < this.field4628.length; var1++) {
                class36.method261(this.field4628[var1], this.field4626);
            }
            this.field4628 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIZ)V", line = 174)
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class124.field1872 == null) {
            class45.method309();
            GL var18 = class45.field688;
            class45.method321(this.field4625);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class45.field667 - arg2), 0.0F);
            var18.glCallList(this.field4628[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class45.method309();
        GL var8 = class45.field688;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class45.field667 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field5044[arg0] / (float) this.field4627 + var9;
        float var12 = (float) this.field5022[arg0] / (float) this.field4627 + var10;
        class45.method321(this.field4625);
        class109 var13 = class124.field1872;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field1622);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class124.field1870) / (float) var13.field1624;
        float var15 = (float) (arg2 - class124.field1874) / (float) var13.field1626;
        float var16 = (float) (arg1 + arg3 - class124.field1870) / (float) var13.field1624;
        float var17 = (float) (arg2 + arg4 - class124.field1874) / (float) var13.field1626;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field5044[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field5022[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field5044[arg0], (float) (-this.field5022[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIIZ)V", line = 239)
    public final void method560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class45.method309();
        GL var9 = class45.field688;
        class45.method321(this.field4625);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class45.field667 - arg2), 0.0F);
        var9.glCallList(this.field4628[arg0]);
        var9.glLoadIdentity();
    }
}
