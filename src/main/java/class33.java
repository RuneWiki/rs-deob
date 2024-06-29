import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class33 extends class101 {

    @OriginalMember(owner = "client!kc", name = "xb", descriptor = "I")
    private int field487 = -1;

    @OriginalMember(owner = "client!kc", name = "yb", descriptor = "I")
    private int field488 = 0;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!kc", name = "wb", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "[I")
    private int[] field484;

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 6)
    public class33(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method221(arg5);
        this.method219();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIZ)V", line = 14)
    public final void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class222.field3771 == null) {
            class47.method344();
            GL var18 = class47.field739;
            class47.method317(this.field487);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class47.field762 - arg2), 0.0F);
            var18.glCallList(this.field484[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class47.method344();
        GL var8 = class47.field739;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class47.field762 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field1688[arg0] / (float) this.field485 + var9;
        float var12 = (float) this.field1684[arg0] / (float) this.field485 + var10;
        class47.method317(this.field487);
        class277 var13 = class222.field3771;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field4753);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class222.field3773) / (float) var13.field4755;
        float var15 = (float) (arg2 - class222.field3775) / (float) var13.field4752;
        float var16 = (float) (arg1 + arg3 - class222.field3773) / (float) var13.field4755;
        float var17 = (float) (arg2 + arg4 - class222.field3775) / (float) var13.field4752;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field1688[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field1684[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field1688[arg0], (float) (-this.field1684[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V", line = 79)
    private final void method219() {
        if (this.field484 != null) {
            return;
        }
        this.field484 = new int[256];
        GL var1 = class47.field739;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field1688[var2] / (float) this.field485 + var3;
            float var6 = (float) this.field1684[var2] / (float) this.field485 + var4;
            this.field484[var2] = var1.glGenLists(1);
            var1.glNewList(this.field484[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field1688[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field1684[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field1688[var2], (float) (-this.field1684[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field486 = class119.field2009;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIZ)V", line = 119)
    public final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class47.method344();
        GL var9 = class47.field739;
        class47.method317(this.field487);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class47.field762 - arg2), 0.0F);
        var9.glCallList(this.field484[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([[B)V", line = 132)
    private final void method221(byte[][] arg0) {
        if (this.field487 != -1) {
            return;
        }
        this.field485 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field1684[var2] > this.field485) {
                this.field485 = this.field1684[var2];
            }
            if (this.field1688[var2] > this.field485) {
                this.field485 = this.field1688[var2];
            }
        }
        this.field485 *= 16;
        this.field485 = class118.method904(1440830960, this.field485);
        int var3 = this.field485 / 16;
        byte[] var4 = new byte[this.field485 * this.field485 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field485 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field1684[var5];
            int var11 = this.field1688[var5];
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
                var8 += (this.field485 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class47.field739;
        if (this.field487 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field487 = var17[0];
            this.field486 = class119.field2009;
        }
        class47.method317(this.field487);
        var16.glTexImage2D(3553, 0, 6410, this.field485, this.field485, 0, 6410, 5121, var15);
        class119.field2005 += var15.limit() - this.field488;
        this.field488 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V", line = 225)
    protected final void finalize() throws Throwable {
        if (this.field487 != -1) {
            class119.method909(this.field487, this.field488, this.field486);
            this.field487 = -1;
            this.field488 = 0;
        }
        if (this.field484 != null) {
            for (int var1 = 0; var1 < this.field484.length; var1++) {
                class119.method907(this.field484[var1], this.field486);
            }
            this.field484 = null;
        }
        super.finalize();
    }
}
