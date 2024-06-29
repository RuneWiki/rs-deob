import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class46 extends class49 {

    @OriginalMember(owner = "client!fm", name = "ub", descriptor = "I")
    private int field957 = 0;

    @OriginalMember(owner = "client!fm", name = "yb", descriptor = "I")
    private int field961 = -1;

    @OriginalMember(owner = "client!fm", name = "wb", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!fm", name = "xb", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "client!fm", name = "vb", descriptor = "[I")
    private int[] field958;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "()V", line = 5)
    private final void method390() {
        if (this.field958 != null) {
            return;
        }
        this.field958 = new int[256];
        GL var1 = class97.field1801;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field983[var2] / (float) this.field959 + var3;
            float var6 = (float) this.field987[var2] / (float) this.field959 + var4;
            this.field958[var2] = var1.glGenLists(1);
            var1.glNewList(this.field958[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field983[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field987[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field983[var2], (float) (-this.field987[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field960 = class308.field5469;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([[B)V", line = 43)
    private final void method391(byte[][] arg0) {
        if (this.field961 != -1) {
            return;
        }
        this.field959 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field987[var2] > this.field959) {
                this.field959 = this.field987[var2];
            }
            if (this.field983[var2] > this.field959) {
                this.field959 = this.field983[var2];
            }
        }
        this.field959 *= 16;
        this.field959 = class189.method1440(1, this.field959);
        int var3 = this.field959 / 16;
        byte[] var4 = new byte[this.field959 * this.field959 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field959 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field987[var5];
            int var11 = this.field983[var5];
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
                var8 += (this.field959 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class97.field1801;
        if (this.field961 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field961 = var17[0];
            this.field960 = class308.field5469;
        }
        class97.method803(this.field961);
        var16.glTexImage2D(3553, 0, 6410, this.field959, this.field959, 0, 6410, 5121, var15);
        class308.field5473 += var15.limit() - this.field957;
        this.field957 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 138)
    public class46(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method391(arg5);
        this.method390();
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIZ)V", line = 147)
    public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class256.field4556 == null) {
            class97.method809();
            GL var18 = class97.field1801;
            class97.method803(this.field961);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class97.field1809 - arg2), 0.0F);
            var18.glCallList(this.field958[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class97.method809();
        GL var8 = class97.field1801;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class97.field1809 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field983[arg0] / (float) this.field959 + var9;
        float var12 = (float) this.field987[arg0] / (float) this.field959 + var10;
        class97.method803(this.field961);
        class203 var13 = class256.field4556;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field3614);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class256.field4555) / (float) var13.field3615;
        float var15 = (float) (arg2 - class256.field4557) / (float) var13.field3612;
        float var16 = (float) (arg1 + arg3 - class256.field4555) / (float) var13.field3615;
        float var17 = (float) (arg2 + arg4 - class256.field4557) / (float) var13.field3612;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field983[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field987[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field983[arg0], (float) (-this.field987[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!fm", name = "finalize", descriptor = "()V", line = 212)
    protected final void finalize() throws Throwable {
        if (this.field961 != -1) {
            class308.method2198(this.field961, this.field957, this.field960);
            this.field961 = -1;
            this.field957 = 0;
        }
        if (this.field958 != null) {
            for (int var1 = 0; var1 < this.field958.length; var1++) {
                class308.method2195(this.field958[var1], this.field960);
            }
            this.field958 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIZ)V", line = 241)
    public final void method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class97.method809();
        GL var9 = class97.field1801;
        class97.method803(this.field961);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class97.field1809 - arg2), 0.0F);
        var9.glCallList(this.field958[arg0]);
        var9.glLoadIdentity();
    }
}
