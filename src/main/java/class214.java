import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class214 extends class71 {

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    private int field3644 = -1;

    @OriginalMember(owner = "client!fl", name = "ub", descriptor = "I")
    private int field3645 = 0;

    @OriginalMember(owner = "client!fl", name = "vb", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!fl", name = "wb", descriptor = "I")
    private int field3647;

    @OriginalMember(owner = "client!fl", name = "xb", descriptor = "[I")
    private int[] field3648;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "()V", line = 7)
    private final void method1529() {
        if (this.field3648 != null) {
            return;
        }
        this.field3648 = new int[256];
        GL var1 = class281.field4839;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field1140[var2] / (float) this.field3646 + var3;
            float var6 = (float) this.field1126[var2] / (float) this.field3646 + var4;
            this.field3648[var2] = var1.glGenLists(1);
            var1.glNewList(this.field3648[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field1140[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field1126[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field1140[var2], (float) (-this.field1126[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field3647 = class139.field2330;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIZ)V", line = 47)
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class126.field2088 == null) {
            class281.method1984();
            GL var18 = class281.field4839;
            class281.method1953(this.field3644);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class281.field4823 - arg2), 0.0F);
            var18.glCallList(this.field3648[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class281.method1984();
        GL var8 = class281.field4839;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class281.field4823 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field1140[arg0] / (float) this.field3646 + var9;
        float var12 = (float) this.field1126[arg0] / (float) this.field3646 + var10;
        class281.method1953(this.field3644);
        class98 var13 = class126.field2088;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field1684);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class126.field2089) / (float) var13.field1685;
        float var15 = (float) (arg2 - class126.field2090) / (float) var13.field1687;
        float var16 = (float) (arg1 + arg3 - class126.field2089) / (float) var13.field1685;
        float var17 = (float) (arg2 + arg4 - class126.field2090) / (float) var13.field1687;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field1140[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field1126[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field1140[arg0], (float) (-this.field1126[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!fl", name = "finalize", descriptor = "()V", line = 112)
    protected final void finalize() throws Throwable {
        if (this.field3644 != -1) {
            class139.method1043(this.field3644, this.field3645, this.field3647);
            this.field3644 = -1;
            this.field3645 = 0;
        }
        if (this.field3648 != null) {
            for (int var1 = 0; var1 < this.field3648.length; var1++) {
                class139.method1041(this.field3648[var1], this.field3647);
            }
            this.field3648 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIIZ)V", line = 135)
    public final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class281.method1984();
        GL var9 = class281.field4839;
        class281.method1953(this.field3644);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class281.field4823 - arg2), 0.0F);
        var9.glCallList(this.field3648[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([[B)V", line = 145)
    private final void method1530(byte[][] arg0) {
        if (this.field3644 != -1) {
            return;
        }
        this.field3646 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field1126[var2] > this.field3646) {
                this.field3646 = this.field1126[var2];
            }
            if (this.field1140[var2] > this.field3646) {
                this.field3646 = this.field1140[var2];
            }
        }
        this.field3646 *= 16;
        this.field3646 = class287.method2033(this.field3646, -1410546649);
        int var3 = this.field3646 / 16;
        byte[] var4 = new byte[this.field3646 * this.field3646 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field3646 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field1126[var5];
            int var11 = this.field1140[var5];
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
                var8 += (this.field3646 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class281.field4839;
        if (this.field3644 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field3644 = var17[0];
            this.field3647 = class139.field2330;
        }
        class281.method1953(this.field3644);
        var16.glTexImage2D(3553, 0, 6410, this.field3646, this.field3646, 0, 6410, 5121, var15);
        class139.field2325 += var15.limit() - this.field3645;
        this.field3645 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 246)
    public class214(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1530(arg5);
        this.method1529();
    }
}
