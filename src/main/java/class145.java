import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class145 extends class326 {

    @OriginalMember(owner = "client!on", name = "db", descriptor = "I")
    private int field2217 = 0;

    @OriginalMember(owner = "client!on", name = "fb", descriptor = "I")
    private int field2219 = -1;

    @OriginalMember(owner = "client!on", name = "bb", descriptor = "I")
    private int field2215;

    @OriginalMember(owner = "client!on", name = "eb", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!on", name = "cb", descriptor = "[I")
    private int[] field2216;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIIZ)V", line = 7)
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class175.field2816 == null) {
            class73.method516();
            GL var18 = class73.field1051;
            class73.method537(this.field2219);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class73.field1080 - arg2), 0.0F);
            var18.glCallList(this.field2216[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class73.method516();
        GL var8 = class73.field1051;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class73.field1080 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field5029[arg0] / (float) this.field2215 + var9;
        float var12 = (float) this.field5027[arg0] / (float) this.field2215 + var10;
        class73.method537(this.field2219);
        class44 var13 = class175.field2816;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field626);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class175.field2813) / (float) var13.field624;
        float var15 = (float) (arg2 - class175.field2817) / (float) var13.field628;
        float var16 = (float) (arg1 + arg3 - class175.field2813) / (float) var13.field624;
        float var17 = (float) (arg2 + arg4 - class175.field2817) / (float) var13.field628;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field5029[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field5027[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field5029[arg0], (float) (-this.field5027[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIIIZ)V", line = 72)
    public final void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class73.method516();
        GL var9 = class73.field1051;
        class73.method537(this.field2219);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class73.field1080 - arg2), 0.0F);
        var9.glCallList(this.field2216[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 82)
    public class145(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1103(arg5);
        this.method1102();
    }

    @OriginalMember(owner = "client!on", name = "finalize", descriptor = "()V", line = 90)
    protected final void finalize() throws Throwable {
        if (this.field2219 != -1) {
            class80.method619(this.field2219, this.field2217, this.field2218);
            this.field2219 = -1;
            this.field2217 = 0;
        }
        if (this.field2216 != null) {
            for (int var1 = 0; var1 < this.field2216.length; var1++) {
                class80.method623(this.field2216[var1], this.field2218);
            }
            this.field2216 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "()V", line = 118)
    private final void method1102() {
        if (this.field2216 != null) {
            return;
        }
        this.field2216 = new int[256];
        GL var1 = class73.field1051;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field5029[var2] / (float) this.field2215 + var3;
            float var6 = (float) this.field5027[var2] / (float) this.field2215 + var4;
            this.field2216[var2] = var1.glGenLists(1);
            var1.glNewList(this.field2216[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field5029[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field5027[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field5029[var2], (float) (-this.field5027[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field2218 = class80.field1183;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([[B)V", line = 159)
    private final void method1103(byte[][] arg0) {
        if (this.field2219 != -1) {
            return;
        }
        this.field2215 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field5027[var2] > this.field2215) {
                this.field2215 = this.field5027[var2];
            }
            if (this.field5029[var2] > this.field2215) {
                this.field2215 = this.field5029[var2];
            }
        }
        this.field2215 *= 16;
        this.field2215 = class312.method2135(984942384, this.field2215);
        int var3 = this.field2215 / 16;
        byte[] var4 = new byte[this.field2215 * this.field2215 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field2215 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field5027[var5];
            int var11 = this.field5029[var5];
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
                var8 += (this.field2215 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class73.field1051;
        if (this.field2219 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field2219 = var17[0];
            this.field2218 = class80.field1183;
        }
        class73.method537(this.field2219);
        var16.glTexImage2D(3553, 0, 6410, this.field2215, this.field2215, 0, 6410, 5121, var15);
        class80.field1184 += var15.limit() - this.field2217;
        this.field2217 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }
}
