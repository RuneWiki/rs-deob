import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class97 extends class18 {

    @OriginalMember(owner = "client!lf", name = "yb", descriptor = "I")
    private int field1759 = 0;

    @OriginalMember(owner = "client!lf", name = "Ab", descriptor = "I")
    private int field1761 = -1;

    @OriginalMember(owner = "client!lf", name = "Bb", descriptor = "I")
    private int field1762;

    @OriginalMember(owner = "client!lf", name = "Cb", descriptor = "I")
    private int field1763;

    @OriginalMember(owner = "client!lf", name = "zb", descriptor = "[I")
    private int[] field1760;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "()V", line = 7)
    private final void method671() {
        if (this.field1760 != null) {
            return;
        }
        this.field1760 = new int[256];
        GL var1 = class147.field2479;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field217[var2] / (float) this.field1763 + var3;
            float var6 = (float) this.field207[var2] / (float) this.field1763 + var4;
            this.field1760[var2] = var1.glGenLists(1);
            var1.glNewList(this.field1760[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field217[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field207[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field217[var2], (float) (-this.field207[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field1762 = class6.field47;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIZ)V", line = 45)
    public final void method125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class116.field2055 == null) {
            class147.method1007();
            GL var18 = class147.field2479;
            class147.method1002(this.field1761);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class147.field2495 - arg2), 0.0F);
            var18.glCallList(this.field1760[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class147.method1007();
        GL var8 = class147.field2479;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class147.field2495 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field217[arg0] / (float) this.field1763 + var9;
        float var12 = (float) this.field207[arg0] / (float) this.field1763 + var10;
        class147.method1002(this.field1761);
        class210 var13 = class116.field2055;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field3693);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class116.field2053) / (float) var13.field3688;
        float var15 = (float) (arg2 - class116.field2051) / (float) var13.field3690;
        float var16 = (float) (arg1 + arg3 - class116.field2053) / (float) var13.field3688;
        float var17 = (float) (arg2 + arg4 - class116.field2051) / (float) var13.field3690;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field217[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field207[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field217[arg0], (float) (-this.field207[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!lf", name = "finalize", descriptor = "()V", line = 110)
    protected final void finalize() throws Throwable {
        if (this.field1761 != -1) {
            class6.method36(this.field1761, this.field1759, this.field1762);
            this.field1761 = -1;
            this.field1759 = 0;
        }
        if (this.field1760 != null) {
            for (int var1 = 0; var1 < this.field1760.length; var1++) {
                class6.method40(this.field1760[var1], this.field1762);
            }
            this.field1760 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 132)
    public class97(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method672(arg5);
        this.method671();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIZ)V", line = 141)
    public final void method104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class147.method1007();
        GL var9 = class147.field2479;
        class147.method1002(this.field1761);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class147.field2495 - arg2), 0.0F);
        var9.glCallList(this.field1760[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([[B)V", line = 158)
    private final void method672(byte[][] arg0) {
        if (this.field1761 != -1) {
            return;
        }
        this.field1763 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field207[var2] > this.field1763) {
                this.field1763 = this.field207[var2];
            }
            if (this.field217[var2] > this.field1763) {
                this.field1763 = this.field217[var2];
            }
        }
        this.field1763 *= 16;
        this.field1763 = class135.method922(21793, this.field1763);
        int var3 = this.field1763 / 16;
        byte[] var4 = new byte[this.field1763 * this.field1763 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field1763 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field207[var5];
            int var11 = this.field217[var5];
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
                var8 += (this.field1763 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class147.field2479;
        if (this.field1761 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field1761 = var17[0];
            this.field1762 = class6.field47;
        }
        class147.method1002(this.field1761);
        var16.glTexImage2D(3553, 0, 6410, this.field1763, this.field1763, 0, 6410, 5121, var15);
        class6.field48 += var15.limit() - this.field1759;
        this.field1759 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }
}
