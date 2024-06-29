import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class288 extends class240 {

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    private int field4540 = -1;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    private int field4542 = 0;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    private int field4543;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    private int field4544;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "[I")
    private int[] field4541;

    @OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        if (this.field4540 != -1) {
            class1.method5(this.field4540, this.field4542, this.field4544);
            this.field4540 = -1;
            this.field4542 = 0;
        }
        if (this.field4541 != null) {
            for (int var1 = 0; var1 < this.field4541.length; var1++) {
                class1.method7(this.field4541[var1], this.field4544);
            }
            this.field4541 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 245)
    public class288(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method2063(arg5);
        this.method2064();
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIZ)V", line = 32)
    public final void method1686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class239.field3669 == null) {
            class272.method1964();
            GL var18 = class272.field4310;
            class272.method1965(this.field4540);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class272.field4311 - arg2), 0.0F);
            var18.glCallList(this.field4541[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class272.method1964();
        GL var8 = class272.field4310;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class272.field4311 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field3676[arg0] / (float) this.field4543 + var9;
        float var12 = (float) this.field3680[arg0] / (float) this.field4543 + var10;
        class272.method1965(this.field4540);
        class200 var13 = class239.field3669;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field3034);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class239.field3665) / (float) var13.field3028;
        float var15 = (float) (arg2 - class239.field3666) / (float) var13.field3030;
        float var16 = (float) (arg1 + arg3 - class239.field3665) / (float) var13.field3028;
        float var17 = (float) (arg2 + arg4 - class239.field3666) / (float) var13.field3030;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field3676[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field3680[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field3676[arg0], (float) (-this.field3680[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([[B)V", line = 97)
    private final void method2063(byte[][] arg0) {
        if (this.field4540 != -1) {
            return;
        }
        this.field4543 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field3680[var2] > this.field4543) {
                this.field4543 = this.field3680[var2];
            }
            if (this.field3676[var2] > this.field4543) {
                this.field4543 = this.field3676[var2];
            }
        }
        this.field4543 *= 16;
        this.field4543 = class226.method1571(true, this.field4543);
        int var3 = this.field4543 / 16;
        byte[] var4 = new byte[this.field4543 * this.field4543 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field4543 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field3680[var5];
            int var11 = this.field3676[var5];
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
                var8 += (this.field4543 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class272.field4310;
        if (this.field4540 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field4540 = var17[0];
            this.field4544 = class1.field3;
        }
        class272.method1965(this.field4540);
        var16.glTexImage2D(3553, 0, 6410, this.field4543, this.field4543, 0, 6410, 5121, var15);
        class1.field5 += var15.limit() - this.field4542;
        this.field4542 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()V", line = 192)
    private final void method2064() {
        if (this.field4541 != null) {
            return;
        }
        this.field4541 = new int[256];
        GL var1 = class272.field4310;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field3676[var2] / (float) this.field4543 + var3;
            float var6 = (float) this.field3680[var2] / (float) this.field4543 + var4;
            this.field4541[var2] = var1.glGenLists(1);
            var1.glNewList(this.field4541[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field3676[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field3680[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field3676[var2], (float) (-this.field3680[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field4544 = class1.field3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIZ)V", line = 233)
    public final void method1690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class272.method1964();
        GL var9 = class272.field4310;
        class272.method1965(this.field4540);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class272.field4311 - arg2), 0.0F);
        var9.glCallList(this.field4541[arg0]);
        var9.glLoadIdentity();
    }
}
