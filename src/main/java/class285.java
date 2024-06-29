import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class285 extends class244 {

    @OriginalMember(owner = "client!jg", name = "Jb", descriptor = "I")
    private int field4858 = 0;

    @OriginalMember(owner = "client!jg", name = "Kb", descriptor = "I")
    private int field4859 = -1;

    @OriginalMember(owner = "client!jg", name = "Lb", descriptor = "I")
    private int field4860;

    @OriginalMember(owner = "client!jg", name = "Nb", descriptor = "I")
    private int field4862;

    @OriginalMember(owner = "client!jg", name = "Mb", descriptor = "[I")
    private int[] field4861;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIZ)V", line = 6)
    public final void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class311.field5301 == null) {
            class167.method1040();
            GL var18 = class167.field2806;
            class167.method1033(this.field4859);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class167.field2808 - arg2), 0.0F);
            var18.glCallList(this.field4861[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class167.method1040();
        GL var8 = class167.field2806;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class167.field2808 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field4135[arg0] / (float) this.field4862 + var9;
        float var12 = (float) this.field4119[arg0] / (float) this.field4862 + var10;
        class167.method1033(this.field4859);
        class266 var13 = class311.field5301;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field4508);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class311.field5300) / (float) var13.field4511;
        float var15 = (float) (arg2 - class311.field5302) / (float) var13.field4507;
        float var16 = (float) (arg1 + arg3 - class311.field5300) / (float) var13.field4511;
        float var17 = (float) (arg2 + arg4 - class311.field5302) / (float) var13.field4507;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field4135[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field4119[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field4135[arg0], (float) (-this.field4119[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!jg", name = "finalize", descriptor = "()V", line = 71)
    protected final void finalize() throws Throwable {
        if (this.field4859 != -1) {
            class101.method671(this.field4859, this.field4858, this.field4860);
            this.field4859 = -1;
            this.field4858 = 0;
        }
        if (this.field4861 != null) {
            for (int var1 = 0; var1 < this.field4861.length; var1++) {
                class101.method670(this.field4861[var1], this.field4860);
            }
            this.field4861 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 94)
    public class285(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1961(arg5);
        this.method1960();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIZ)V", line = 108)
    public final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class167.method1040();
        GL var9 = class167.field2806;
        class167.method1033(this.field4859);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class167.field2808 - arg2), 0.0F);
        var9.glCallList(this.field4861[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "()V", line = 119)
    private final void method1960() {
        if (this.field4861 != null) {
            return;
        }
        this.field4861 = new int[256];
        GL var1 = class167.field2806;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field4135[var2] / (float) this.field4862 + var3;
            float var6 = (float) this.field4119[var2] / (float) this.field4862 + var4;
            this.field4861[var2] = var1.glGenLists(1);
            var1.glNewList(this.field4861[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field4135[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field4119[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field4135[var2], (float) (-this.field4119[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field4860 = class101.field1723;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([[B)V", line = 157)
    private final void method1961(byte[][] arg0) {
        if (this.field4859 != -1) {
            return;
        }
        this.field4862 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field4119[var2] > this.field4862) {
                this.field4862 = this.field4119[var2];
            }
            if (this.field4135[var2] > this.field4862) {
                this.field4862 = this.field4135[var2];
            }
        }
        this.field4862 *= 16;
        this.field4862 = class53.method336(-1753429918, this.field4862);
        int var3 = this.field4862 / 16;
        byte[] var4 = new byte[this.field4862 * this.field4862 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field4862 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field4119[var5];
            int var11 = this.field4135[var5];
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
                var8 += (this.field4862 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class167.field2806;
        if (this.field4859 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field4859 = var17[0];
            this.field4860 = class101.field1723;
        }
        class167.method1033(this.field4859);
        var16.glTexImage2D(3553, 0, 6410, this.field4862, this.field4862, 0, 6410, 5121, var15);
        class101.field1722 += var15.limit() - this.field4858;
        this.field4858 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }
}
