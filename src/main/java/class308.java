import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class308 extends class30 {

    @OriginalMember(owner = "client!nb", name = "Bb", descriptor = "I")
    private int field5246 = -1;

    @OriginalMember(owner = "client!nb", name = "Cb", descriptor = "I")
    private int field5247 = 0;

    @OriginalMember(owner = "client!nb", name = "Ab", descriptor = "I")
    private int field5245;

    @OriginalMember(owner = "client!nb", name = "Db", descriptor = "I")
    private int field5248;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "[I")
    private int[] field5244;

    @OriginalMember(owner = "client!nb", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        if (this.field5246 != -1) {
            class68.method503(this.field5246, this.field5247, this.field5248);
            this.field5246 = -1;
            this.field5247 = 0;
        }
        if (this.field5244 != null) {
            for (int var1 = 0; var1 < this.field5244.length; var1++) {
                class68.method502(this.field5244[var1], this.field5248);
            }
            this.field5244 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 28)
    public class308(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method2174(arg5);
        this.method2175();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIZ)V", line = 35)
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class131.field2224 == null) {
            class271.method1977();
            GL var18 = class271.field4641;
            class271.method1978(this.field5246);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class271.field4628 - arg2), 0.0F);
            var18.glCallList(this.field5244[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class271.method1977();
        GL var8 = class271.field4641;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class271.field4628 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field546[arg0] / (float) this.field5245 + var9;
        float var12 = (float) this.field537[arg0] / (float) this.field5245 + var10;
        class271.method1978(this.field5246);
        class8 var13 = class131.field2224;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field168);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class131.field2223) / (float) var13.field173;
        float var15 = (float) (arg2 - class131.field2221) / (float) var13.field172;
        float var16 = (float) (arg1 + arg3 - class131.field2223) / (float) var13.field173;
        float var17 = (float) (arg2 + arg4 - class131.field2221) / (float) var13.field172;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field546[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field537[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field546[arg0], (float) (-this.field537[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([[B)V", line = 100)
    private final void method2174(byte[][] arg0) {
        if (this.field5246 != -1) {
            return;
        }
        this.field5245 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field537[var2] > this.field5245) {
                this.field5245 = this.field537[var2];
            }
            if (this.field546[var2] > this.field5245) {
                this.field5245 = this.field546[var2];
            }
        }
        this.field5245 *= 16;
        this.field5245 = class272.method1993(this.field5245, 116);
        int var3 = this.field5245 / 16;
        byte[] var4 = new byte[this.field5245 * this.field5245 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field5245 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field537[var5];
            int var11 = this.field546[var5];
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
                var8 += (this.field5245 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class271.field4641;
        if (this.field5246 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field5246 = var17[0];
            this.field5248 = class68.field1125;
        }
        class271.method1978(this.field5246);
        var16.glTexImage2D(3553, 0, 6410, this.field5245, this.field5245, 0, 6410, 5121, var15);
        class68.field1129 += var15.limit() - this.field5247;
        this.field5247 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIZ)V", line = 193)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class271.method1977();
        GL var9 = class271.field4641;
        class271.method1978(this.field5246);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class271.field4628 - arg2), 0.0F);
        var9.glCallList(this.field5244[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V", line = 203)
    private final void method2175() {
        if (this.field5244 != null) {
            return;
        }
        this.field5244 = new int[256];
        GL var1 = class271.field4641;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field546[var2] / (float) this.field5245 + var3;
            float var6 = (float) this.field537[var2] / (float) this.field5245 + var4;
            this.field5244[var2] = var1.glGenLists(1);
            var1.glNewList(this.field5244[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field546[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field537[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field546[var2], (float) (-this.field537[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field5248 = class68.field1125;
    }
}
