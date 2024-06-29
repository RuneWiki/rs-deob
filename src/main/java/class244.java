import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class244 extends class180 {

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    private int field3838 = 0;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    private int field3836 = -1;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "[I")
    private int[] field3835;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIZ)V", line = 5)
    public final void method1246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class238.field3807 == null) {
            class333.method2322();
            GL var18 = class333.field5160;
            class333.method2282(this.field3836);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class333.field5182 - arg2), 0.0F);
            var18.glCallList(this.field3835[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class333.method2322();
        GL var8 = class333.field5160;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class333.field5182 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field2772[arg0] / (float) this.field3839 + var9;
        float var12 = (float) this.field2758[arg0] / (float) this.field3839 + var10;
        class333.method2282(this.field3836);
        class186 var13 = class238.field3807;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field2834);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class238.field3808) / (float) var13.field2837;
        float var15 = (float) (arg2 - class238.field3805) / (float) var13.field2838;
        float var16 = (float) (arg1 + arg3 - class238.field3808) / (float) var13.field2837;
        float var17 = (float) (arg2 + arg4 - class238.field3805) / (float) var13.field2838;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field2772[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field2758[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field2772[arg0], (float) (-this.field2758[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([[B)V", line = 73)
    private final void method1656(byte[][] arg0) {
        if (this.field3836 != -1) {
            return;
        }
        this.field3839 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field2758[var2] > this.field3839) {
                this.field3839 = this.field2758[var2];
            }
            if (this.field2772[var2] > this.field3839) {
                this.field3839 = this.field2772[var2];
            }
        }
        this.field3839 *= 16;
        this.field3839 = class47.method330((byte) 27, this.field3839);
        int var3 = this.field3839 / 16;
        byte[] var4 = new byte[this.field3839 * this.field3839 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field3839 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field2758[var5];
            int var11 = this.field2772[var5];
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
                var8 += (this.field3839 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class333.field5160;
        if (this.field3836 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field3836 = var17[0];
            this.field3837 = class301.field4649;
        }
        class333.method2282(this.field3836);
        var16.glTexImage2D(3553, 0, 6410, this.field3839, this.field3839, 0, 6410, 5121, var15);
        class301.field4647 += var15.limit() - this.field3838;
        this.field3838 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIZ)V", line = 165)
    public final void method1242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class333.method2322();
        GL var9 = class333.field5160;
        class333.method2282(this.field3836);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class333.field5182 - arg2), 0.0F);
        var9.glCallList(this.field3835[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 176)
    public class244(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1656(arg5);
        this.method1657();
    }

    @OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V", line = 190)
    protected final void finalize() throws Throwable {
        if (this.field3836 != -1) {
            class301.method1979(this.field3836, this.field3838, this.field3837);
            this.field3836 = -1;
            this.field3838 = 0;
        }
        if (this.field3835 != null) {
            for (int var1 = 0; var1 < this.field3835.length; var1++) {
                class301.method1978(this.field3835[var1], this.field3837);
            }
            this.field3835 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()V", line = 213)
    private final void method1657() {
        if (this.field3835 != null) {
            return;
        }
        this.field3835 = new int[256];
        GL var1 = class333.field5160;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field2772[var2] / (float) this.field3839 + var3;
            float var6 = (float) this.field2758[var2] / (float) this.field3839 + var4;
            this.field3835[var2] = var1.glGenLists(1);
            var1.glNewList(this.field3835[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field2772[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field2758[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field2772[var2], (float) (-this.field2758[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field3837 = class301.field4649;
    }
}
