import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class156 extends class35 {

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    private int field2666 = -1;

    @OriginalMember(owner = "client!lh", name = "zb", descriptor = "I")
    private int field2670 = 0;

    @OriginalMember(owner = "client!lh", name = "wb", descriptor = "I")
    private int field2667;

    @OriginalMember(owner = "client!lh", name = "xb", descriptor = "I")
    private int field2668;

    @OriginalMember(owner = "client!lh", name = "yb", descriptor = "[I")
    private int[] field2669;

    @OriginalMember(owner = "client!lh", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        if (this.field2666 != -1) {
            class196.method1317(this.field2666, this.field2670, this.field2668);
            this.field2666 = -1;
            this.field2670 = 0;
        }
        if (this.field2669 != null) {
            for (int var1 = 0; var1 < this.field2669.length; var1++) {
                class196.method1316(this.field2669[var1], this.field2668);
            }
            this.field2669 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIZ)V", line = 30)
    public final void method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class257.method1733();
        GL var9 = class257.field4409;
        class257.method1736(this.field2666);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class257.field4423 - arg2), 0.0F);
        var9.glCallList(this.field2669[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIZ)V", line = 42)
    public final void method245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class296.field5084 == null) {
            class257.method1733();
            GL var18 = class257.field4409;
            class257.method1736(this.field2666);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class257.field4423 - arg2), 0.0F);
            var18.glCallList(this.field2669[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class257.method1733();
        GL var8 = class257.field4409;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class257.field4423 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field428[arg0] / (float) this.field2667 + var9;
        float var12 = (float) this.field427[arg0] / (float) this.field2667 + var10;
        class257.method1736(this.field2666);
        class221 var13 = class296.field5084;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field3821);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class296.field5083) / (float) var13.field3822;
        float var15 = (float) (arg2 - class296.field5082) / (float) var13.field3820;
        float var16 = (float) (arg1 + arg3 - class296.field5083) / (float) var13.field3822;
        float var17 = (float) (arg2 + arg4 - class296.field5082) / (float) var13.field3820;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field428[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field427[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field428[arg0], (float) (-this.field427[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "()V", line = 107)
    private final void method1065() {
        if (this.field2669 != null) {
            return;
        }
        this.field2669 = new int[256];
        GL var1 = class257.field4409;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field428[var2] / (float) this.field2667 + var3;
            float var6 = (float) this.field427[var2] / (float) this.field2667 + var4;
            this.field2669[var2] = var1.glGenLists(1);
            var1.glNewList(this.field2669[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field428[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field427[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field428[var2], (float) (-this.field427[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field2668 = class196.field3439;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([[B)V", line = 147)
    private final void method1066(byte[][] arg0) {
        if (this.field2666 != -1) {
            return;
        }
        this.field2667 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field427[var2] > this.field2667) {
                this.field2667 = this.field427[var2];
            }
            if (this.field428[var2] > this.field2667) {
                this.field2667 = this.field428[var2];
            }
        }
        this.field2667 *= 16;
        this.field2667 = class286.method2014(this.field2667, 783135696);
        int var3 = this.field2667 / 16;
        byte[] var4 = new byte[this.field2667 * this.field2667 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field2667 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field427[var5];
            int var11 = this.field428[var5];
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
                var8 += (this.field2667 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class257.field4409;
        if (this.field2666 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field2666 = var17[0];
            this.field2668 = class196.field3439;
        }
        class257.method1736(this.field2666);
        var16.glTexImage2D(3553, 0, 6410, this.field2667, this.field2667, 0, 6410, 5121, var15);
        class196.field3440 += var15.limit() - this.field2670;
        this.field2670 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 242)
    public class156(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1066(arg5);
        this.method1065();
    }
}
