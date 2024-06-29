import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class219 extends class179 {

    @OriginalMember(owner = "client!mj", name = "ub", descriptor = "I")
    private int field3715 = -1;

    @OriginalMember(owner = "client!mj", name = "rb", descriptor = "I")
    private int field3712 = 0;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    private int field3711;

    @OriginalMember(owner = "client!mj", name = "tb", descriptor = "I")
    private int field3714;

    @OriginalMember(owner = "client!mj", name = "sb", descriptor = "[I")
    private int[] field3713;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIIZ)V", line = 5)
    public final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class123.method898();
        GL var9 = class123.field2212;
        class123.method867(this.field3715);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class123.field2207 - arg2), 0.0F);
        var9.glCallList(this.field3713[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!mj", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() throws Throwable {
        if (this.field3715 != -1) {
            class285.method1974(this.field3715, this.field3712, this.field3714);
            this.field3715 = -1;
            this.field3712 = 0;
        }
        if (this.field3713 != null) {
            for (int var1 = 0; var1 < this.field3713.length; var1++) {
                class285.method1976(this.field3713[var1], this.field3714);
            }
            this.field3713 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([[B)V", line = 39)
    private final void method1564(byte[][] arg0) {
        if (this.field3715 != -1) {
            return;
        }
        this.field3711 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field3054[var2] > this.field3711) {
                this.field3711 = this.field3054[var2];
            }
            if (this.field3042[var2] > this.field3711) {
                this.field3711 = this.field3042[var2];
            }
        }
        this.field3711 *= 16;
        this.field3711 = class143.method1013((byte) 35, this.field3711);
        int var3 = this.field3711 / 16;
        byte[] var4 = new byte[this.field3711 * this.field3711 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field3711 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field3054[var5];
            int var11 = this.field3042[var5];
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
                var8 += (this.field3711 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class123.field2212;
        if (this.field3715 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field3715 = var17[0];
            this.field3714 = class285.field4893;
        }
        class123.method867(this.field3715);
        var16.glTexImage2D(3553, 0, 6410, this.field3711, this.field3711, 0, 6410, 5121, var15);
        class285.field4890 += var15.limit() - this.field3712;
        this.field3712 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIZ)V", line = 133)
    public final void method1253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class21.field369 == null) {
            class123.method898();
            GL var18 = class123.field2212;
            class123.method867(this.field3715);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class123.field2207 - arg2), 0.0F);
            var18.glCallList(this.field3713[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class123.method898();
        GL var8 = class123.field2212;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class123.field2207 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field3042[arg0] / (float) this.field3711 + var9;
        float var12 = (float) this.field3054[arg0] / (float) this.field3711 + var10;
        class123.method867(this.field3715);
        class136 var13 = class21.field369;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field2422);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class21.field367) / (float) var13.field2419;
        float var15 = (float) (arg2 - class21.field371) / (float) var13.field2423;
        float var16 = (float) (arg1 + arg3 - class21.field367) / (float) var13.field2419;
        float var17 = (float) (arg2 + arg4 - class21.field371) / (float) var13.field2423;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field3042[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field3054[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field3042[arg0], (float) (-this.field3054[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()V", line = 199)
    private final void method1565() {
        if (this.field3713 != null) {
            return;
        }
        this.field3713 = new int[256];
        GL var1 = class123.field2212;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field3042[var2] / (float) this.field3711 + var3;
            float var6 = (float) this.field3054[var2] / (float) this.field3711 + var4;
            this.field3713[var2] = var1.glGenLists(1);
            var1.glNewList(this.field3713[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field3042[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field3054[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field3042[var2], (float) (-this.field3054[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field3714 = class285.field4893;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 237)
    public class219(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1564(arg5);
        this.method1565();
    }
}
