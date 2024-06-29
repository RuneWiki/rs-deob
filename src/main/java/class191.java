import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class191 extends class276 {

    @OriginalMember(owner = "client!uj", name = "zb", descriptor = "I")
    private int field3258 = -1;

    @OriginalMember(owner = "client!uj", name = "Bb", descriptor = "I")
    private int field3260 = 0;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    private int field3257;

    @OriginalMember(owner = "client!uj", name = "Cb", descriptor = "I")
    private int field3261;

    @OriginalMember(owner = "client!uj", name = "Ab", descriptor = "[I")
    private int[] field3259;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIZ)V", line = 6)
    public final void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class117.method946();
        GL var9 = class117.field2143;
        class117.method939(this.field3258);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class117.field2126 - arg2), 0.0F);
        var9.glCallList(this.field3259[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([[B)V", line = 17)
    private final void method1419(byte[][] arg0) {
        if (this.field3258 != -1) {
            return;
        }
        this.field3261 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field4598[var2] > this.field3261) {
                this.field3261 = this.field4598[var2];
            }
            if (this.field4609[var2] > this.field3261) {
                this.field3261 = this.field4609[var2];
            }
        }
        this.field3261 *= 16;
        this.field3261 = class237.method1678(this.field3261, -31981);
        int var3 = this.field3261 / 16;
        byte[] var4 = new byte[this.field3261 * this.field3261 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field3261 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field4598[var5];
            int var11 = this.field4609[var5];
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
                var8 += (this.field3261 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class117.field2143;
        if (this.field3258 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field3258 = var17[0];
            this.field3257 = class41.field659;
        }
        class117.method939(this.field3258);
        var16.glTexImage2D(3553, 0, 6410, this.field3261, this.field3261, 0, 6410, 5121, var15);
        class41.field661 += var15.limit() - this.field3260;
        this.field3260 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "()V", line = 110)
    private final void method1420() {
        if (this.field3259 != null) {
            return;
        }
        this.field3259 = new int[256];
        GL var1 = class117.field2143;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field4609[var2] / (float) this.field3261 + var3;
            float var6 = (float) this.field4598[var2] / (float) this.field3261 + var4;
            this.field3259[var2] = var1.glGenLists(1);
            var1.glNewList(this.field3259[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field4609[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field4598[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field4609[var2], (float) (-this.field4598[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field3257 = class41.field659;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIZ)V", line = 149)
    public final void method1411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class16.field238 == null) {
            class117.method946();
            GL var18 = class117.field2143;
            class117.method939(this.field3258);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class117.field2126 - arg2), 0.0F);
            var18.glCallList(this.field3259[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class117.method946();
        GL var8 = class117.field2143;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class117.field2126 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field4609[arg0] / (float) this.field3261 + var9;
        float var12 = (float) this.field4598[arg0] / (float) this.field3261 + var10;
        class117.method939(this.field3258);
        class140 var13 = class16.field238;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field2489);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class16.field240) / (float) var13.field2495;
        float var15 = (float) (arg2 - class16.field239) / (float) var13.field2493;
        float var16 = (float) (arg1 + arg3 - class16.field240) / (float) var13.field2495;
        float var17 = (float) (arg2 + arg4 - class16.field239) / (float) var13.field2493;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field4609[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field4598[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field4609[arg0], (float) (-this.field4598[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 244)
    public class191(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1419(arg5);
        this.method1420();
    }

    @OriginalMember(owner = "client!uj", name = "finalize", descriptor = "()V", line = 218)
    protected final void finalize() throws Throwable {
        if (this.field3258 != -1) {
            class41.method307(this.field3258, this.field3260, this.field3257);
            this.field3258 = -1;
            this.field3260 = 0;
        }
        if (this.field3259 != null) {
            for (int var1 = 0; var1 < this.field3259.length; var1++) {
                class41.method303(this.field3259[var1], this.field3257);
            }
            this.field3259 = null;
        }
        super.finalize();
    }
}
