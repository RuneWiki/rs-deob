import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class5 extends class135 {

    @OriginalMember(owner = "client!gn", name = "db", descriptor = "I")
    private int field32 = 0;

    @OriginalMember(owner = "client!gn", name = "fb", descriptor = "I")
    private int field34 = -1;

    @OriginalMember(owner = "client!gn", name = "cb", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "client!gn", name = "eb", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client!gn", name = "gb", descriptor = "[I")
    private int[] field35;

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 5)
    public class5(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method18(arg5);
        this.method16();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIIIZ)V", line = 12)
    public final void method15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class265.method1913();
        GL var9 = class265.field4099;
        class265.method1889(this.field34);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class265.field4101 - arg2), 0.0F);
        var9.glCallList(this.field35[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gn", name = "finalize", descriptor = "()V", line = 25)
    protected final void finalize() throws Throwable {
        if (this.field34 != -1) {
            class214.method1551(this.field34, this.field32, this.field33);
            this.field34 = -1;
            this.field32 = 0;
        }
        if (this.field35 != null) {
            for (int var1 = 0; var1 < this.field35.length; var1++) {
                class214.method1550(this.field35[var1], this.field33);
            }
            this.field35 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "()V", line = 47)
    private final void method16() {
        if (this.field35 != null) {
            return;
        }
        this.field35 = new int[256];
        GL var1 = class265.field4099;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field2135[var2] / (float) this.field31 + var3;
            float var6 = (float) this.field2134[var2] / (float) this.field31 + var4;
            this.field35[var2] = var1.glGenLists(1);
            var1.glNewList(this.field35[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field2135[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field2134[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field2135[var2], (float) (-this.field2134[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field33 = class214.field3409;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIIZ)V", line = 89)
    public final void method17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class262.field4064 == null) {
            class265.method1913();
            GL var18 = class265.field4099;
            class265.method1889(this.field34);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class265.field4101 - arg2), 0.0F);
            var18.glCallList(this.field35[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class265.method1913();
        GL var8 = class265.field4099;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class265.field4101 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field2135[arg0] / (float) this.field31 + var9;
        float var12 = (float) this.field2134[arg0] / (float) this.field31 + var10;
        class265.method1889(this.field34);
        class105 var13 = class262.field4064;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field1776);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class262.field4066) / (float) var13.field1773;
        float var15 = (float) (arg2 - class262.field4065) / (float) var13.field1775;
        float var16 = (float) (arg1 + arg3 - class262.field4066) / (float) var13.field1773;
        float var17 = (float) (arg2 + arg4 - class262.field4065) / (float) var13.field1775;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field2135[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field2134[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field2135[arg0], (float) (-this.field2134[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([[B)V", line = 159)
    private final void method18(byte[][] arg0) {
        if (this.field34 != -1) {
            return;
        }
        this.field31 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field2134[var2] > this.field31) {
                this.field31 = this.field2134[var2];
            }
            if (this.field2135[var2] > this.field31) {
                this.field31 = this.field2135[var2];
            }
        }
        this.field31 *= 16;
        this.field31 = class210.method1532(-1429694904, this.field31);
        int var3 = this.field31 / 16;
        byte[] var4 = new byte[this.field31 * this.field31 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field31 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field2134[var5];
            int var11 = this.field2135[var5];
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
                var8 += (this.field31 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class265.field4099;
        if (this.field34 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field34 = var17[0];
            this.field33 = class214.field3409;
        }
        class265.method1889(this.field34);
        var16.glTexImage2D(3553, 0, 6410, this.field31, this.field31, 0, 6410, 5121, var15);
        class214.field3411 += var15.limit() - this.field32;
        this.field32 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }
}
