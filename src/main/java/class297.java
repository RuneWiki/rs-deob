import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class297 extends class312 {

    @OriginalMember(owner = "client!tj", name = "bb", descriptor = "I")
    private int field4521 = 0;

    @OriginalMember(owner = "client!tj", name = "eb", descriptor = "I")
    private int field4524 = -1;

    @OriginalMember(owner = "client!tj", name = "ab", descriptor = "I")
    private int field4520;

    @OriginalMember(owner = "client!tj", name = "db", descriptor = "I")
    private int field4523;

    @OriginalMember(owner = "client!tj", name = "cb", descriptor = "[I")
    private int[] field4522;

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 11)
    public class297(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1985(arg5);
        this.method1986();
    }

    @OriginalMember(owner = "client!tj", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() throws Throwable {
        if (this.field4524 != -1) {
            class258.method1730(this.field4524, this.field4521, this.field4520);
            this.field4524 = -1;
            this.field4521 = 0;
        }
        if (this.field4522 != null) {
            for (int var1 = 0; var1 < this.field4522.length; var1++) {
                class258.method1728(this.field4522[var1], this.field4520);
            }
            this.field4522 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIIZ)V", line = 40)
    public final void method1571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class249.method1672();
        GL var9 = class249.field3898;
        class249.method1689(this.field4524);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class249.field3888 - arg2), 0.0F);
        var9.glCallList(this.field4522[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIZ)V", line = 51)
    public final void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class115.field2032 == null) {
            class249.method1672();
            GL var18 = class249.field3898;
            class249.method1689(this.field4524);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class249.field3888 - arg2), 0.0F);
            var18.glCallList(this.field4522[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class249.method1672();
        GL var8 = class249.field3898;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class249.field3888 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field4739[arg0] / (float) this.field4523 + var9;
        float var12 = (float) this.field4734[arg0] / (float) this.field4523 + var10;
        class249.method1689(this.field4524);
        class137 var13 = class115.field2032;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field2292);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class115.field2030) / (float) var13.field2296;
        float var15 = (float) (arg2 - class115.field2033) / (float) var13.field2294;
        float var16 = (float) (arg1 + arg3 - class115.field2030) / (float) var13.field2296;
        float var17 = (float) (arg2 + arg4 - class115.field2033) / (float) var13.field2294;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field4739[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field4734[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field4739[arg0], (float) (-this.field4734[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([[B)V", line = 116)
    private final void method1985(byte[][] arg0) {
        if (this.field4524 != -1) {
            return;
        }
        this.field4523 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field4734[var2] > this.field4523) {
                this.field4523 = this.field4734[var2];
            }
            if (this.field4739[var2] > this.field4523) {
                this.field4523 = this.field4739[var2];
            }
        }
        this.field4523 *= 16;
        this.field4523 = class226.method1510(27147, this.field4523);
        int var3 = this.field4523 / 16;
        byte[] var4 = new byte[this.field4523 * this.field4523 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field4523 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field4734[var5];
            int var11 = this.field4739[var5];
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
                var8 += (this.field4523 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class249.field3898;
        if (this.field4524 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field4524 = var17[0];
            this.field4520 = class258.field4013;
        }
        class249.method1689(this.field4524);
        var16.glTexImage2D(3553, 0, 6410, this.field4523, this.field4523, 0, 6410, 5121, var15);
        class258.field4011 += var15.limit() - this.field4521;
        this.field4521 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "()V", line = 208)
    private final void method1986() {
        if (this.field4522 != null) {
            return;
        }
        this.field4522 = new int[256];
        GL var1 = class249.field3898;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field4739[var2] / (float) this.field4523 + var3;
            float var6 = (float) this.field4734[var2] / (float) this.field4523 + var4;
            this.field4522[var2] = var1.glGenLists(1);
            var1.glNewList(this.field4522[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field4739[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field4734[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field4739[var2], (float) (-this.field4734[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field4520 = class258.field4013;
    }
}
