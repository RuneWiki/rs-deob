import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class179 extends class145 {

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    private int field2818 = -1;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    private int field2820 = 0;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    private int field2822;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "[I")
    private int[] field2819;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 105)
    public class179(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1397(arg5);
        this.method1398();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([[B)V", line = 9)
    private final void method1397(byte[][] arg0) {
        if (this.field2818 != -1) {
            return;
        }
        this.field2821 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field2377[var2] > this.field2821) {
                this.field2821 = this.field2377[var2];
            }
            if (this.field2360[var2] > this.field2821) {
                this.field2821 = this.field2360[var2];
            }
        }
        this.field2821 *= 16;
        this.field2821 = class261.method1918(this.field2821, 22);
        int var3 = this.field2821 / 16;
        byte[] var4 = new byte[this.field2821 * this.field2821 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field2821 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field2377[var5];
            int var11 = this.field2360[var5];
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
                var8 += (this.field2821 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class240.field3771;
        if (this.field2818 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field2818 = var17[0];
            this.field2822 = class28.field455;
        }
        class240.method1786(this.field2818);
        var16.glTexImage2D(3553, 0, 6410, this.field2821, this.field2821, 0, 6410, 5121, var15);
        class28.field458 += var15.limit() - this.field2820;
        this.field2820 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIZ)V", line = 110)
    public final void method672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class213.field3340 == null) {
            class240.method1813();
            GL var18 = class240.field3771;
            class240.method1786(this.field2818);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class240.field3749 - arg2), 0.0F);
            var18.glCallList(this.field2819[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class240.method1813();
        GL var8 = class240.field3771;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class240.field3749 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field2360[arg0] / (float) this.field2821 + var9;
        float var12 = (float) this.field2377[arg0] / (float) this.field2821 + var10;
        class240.method1786(this.field2818);
        class2 var13 = class213.field3340;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field8);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class213.field3342) / (float) var13.field12;
        float var15 = (float) (arg2 - class213.field3344) / (float) var13.field7;
        float var16 = (float) (arg1 + arg3 - class213.field3342) / (float) var13.field12;
        float var17 = (float) (arg2 + arg4 - class213.field3344) / (float) var13.field7;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field2360[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field2377[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field2360[arg0], (float) (-this.field2377[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()V", line = 175)
    private final void method1398() {
        if (this.field2819 != null) {
            return;
        }
        this.field2819 = new int[256];
        GL var1 = class240.field3771;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field2360[var2] / (float) this.field2821 + var3;
            float var6 = (float) this.field2377[var2] / (float) this.field2821 + var4;
            this.field2819[var2] = var1.glGenLists(1);
            var1.glNewList(this.field2819[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field2360[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field2377[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field2360[var2], (float) (-this.field2377[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field2822 = class28.field455;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIZ)V", line = 213)
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class240.method1813();
        GL var9 = class240.field3771;
        class240.method1786(this.field2818);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class240.field3749 - arg2), 0.0F);
        var9.glCallList(this.field2819[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V", line = 223)
    protected final void finalize() throws Throwable {
        if (this.field2818 != -1) {
            class28.method327(this.field2818, this.field2820, this.field2822);
            this.field2818 = -1;
            this.field2820 = 0;
        }
        if (this.field2819 != null) {
            for (int var1 = 0; var1 < this.field2819.length; var1++) {
                class28.method326(this.field2819[var1], this.field2822);
            }
            this.field2819 = null;
        }
        super.finalize();
    }
}
