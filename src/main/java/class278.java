import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class278 extends class11 {

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    private int field4324 = 0;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    private int field4325 = -1;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    private int field4322;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    private int field4323;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "[I")
    private int[] field4321;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIZ)V", line = 5)
    public final void method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class250.method1801();
        GL var9 = class250.field3818;
        class250.method1806(this.field4325);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class250.field3820 - arg2), 0.0F);
        var9.glCallList(this.field4321[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "()V", line = 19)
    private final void method1995() {
        if (this.field4321 != null) {
            return;
        }
        this.field4321 = new int[256];
        GL var1 = class250.field3818;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field146[var2] / (float) this.field4322 + var3;
            float var6 = (float) this.field144[var2] / (float) this.field4322 + var4;
            this.field4321[var2] = var1.glGenLists(1);
            var1.glNewList(this.field4321[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field146[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field144[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field146[var2], (float) (-this.field144[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field4323 = class266.field4192;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIZ)V", line = 57)
    public final void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class306.field4736 == null) {
            class250.method1801();
            GL var18 = class250.field3818;
            class250.method1806(this.field4325);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class250.field3820 - arg2), 0.0F);
            var18.glCallList(this.field4321[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class250.method1801();
        GL var8 = class250.field3818;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class250.field3820 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field146[arg0] / (float) this.field4322 + var9;
        float var12 = (float) this.field144[arg0] / (float) this.field4322 + var10;
        class250.method1806(this.field4325);
        class202 var13 = class306.field4736;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field2850);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class306.field4737) / (float) var13.field2849;
        float var15 = (float) (arg2 - class306.field4738) / (float) var13.field2851;
        float var16 = (float) (arg1 + arg3 - class306.field4737) / (float) var13.field2849;
        float var17 = (float) (arg2 + arg4 - class306.field4738) / (float) var13.field2851;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field146[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field144[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field146[arg0], (float) (-this.field144[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([[B)V", line = 122)
    private final void method1996(byte[][] arg0) {
        if (this.field4325 != -1) {
            return;
        }
        this.field4322 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field144[var2] > this.field4322) {
                this.field4322 = this.field144[var2];
            }
            if (this.field146[var2] > this.field4322) {
                this.field4322 = this.field146[var2];
            }
        }
        this.field4322 *= 16;
        this.field4322 = class258.method1873(this.field4322, 832520144);
        int var3 = this.field4322 / 16;
        byte[] var4 = new byte[this.field4322 * this.field4322 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field4322 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field144[var5];
            int var11 = this.field146[var5];
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
                var8 += (this.field4322 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class250.field3818;
        if (this.field4325 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field4325 = var17[0];
            this.field4323 = class266.field4192;
        }
        class250.method1806(this.field4325);
        var16.glTexImage2D(3553, 0, 6410, this.field4322, this.field4322, 0, 6410, 5121, var15);
        class266.field4195 += var15.limit() - this.field4324;
        this.field4324 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 214)
    public class278(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1996(arg5);
        this.method1995();
    }

    @OriginalMember(owner = "client!vg", name = "finalize", descriptor = "()V", line = 219)
    protected final void finalize() throws Throwable {
        if (this.field4325 != -1) {
            class266.method1935(this.field4325, this.field4324, this.field4323);
            this.field4325 = -1;
            this.field4324 = 0;
        }
        if (this.field4321 != null) {
            for (int var1 = 0; var1 < this.field4321.length; var1++) {
                class266.method1932(this.field4321[var1], this.field4323);
            }
            this.field4321 = null;
        }
        super.finalize();
    }
}
