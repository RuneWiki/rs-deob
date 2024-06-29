import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class223 extends class205 {

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    private int field3475 = 0;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    private int field3471 = -1;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    private int field3473;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    private int field3474;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "[I")
    private int[] field3472;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIZ)V", line = 7)
    public final void method1172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class162.method1224();
        GL var9 = class162.field2654;
        class162.method1219(this.field3471);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class162.field2618 - arg2), 0.0F);
        var9.glCallList(this.field3472[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([[B)V", line = 19)
    private final void method1633(byte[][] arg0) {
        if (this.field3471 != -1) {
            return;
        }
        this.field3473 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field3191[var2] > this.field3473) {
                this.field3473 = this.field3191[var2];
            }
            if (this.field3186[var2] > this.field3473) {
                this.field3473 = this.field3186[var2];
            }
        }
        this.field3473 *= 16;
        this.field3473 = class319.method2255(1, this.field3473);
        int var3 = this.field3473 / 16;
        byte[] var4 = new byte[this.field3473 * this.field3473 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field3473 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field3191[var5];
            int var11 = this.field3186[var5];
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
                var8 += (this.field3473 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class162.field2654;
        if (this.field3471 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field3471 = var17[0];
            this.field3474 = class177.field2819;
        }
        class162.method1219(this.field3471);
        var16.glTexImage2D(3553, 0, 6410, this.field3473, this.field3473, 0, 6410, 5121, var15);
        class177.field2821 += var15.limit() - this.field3475;
        this.field3475 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V", line = 115)
    protected final void finalize() throws Throwable {
        if (this.field3471 != -1) {
            class177.method1307(this.field3471, this.field3475, this.field3474);
            this.field3471 = -1;
            this.field3475 = 0;
        }
        if (this.field3472 != null) {
            for (int var1 = 0; var1 < this.field3472.length; var1++) {
                class177.method1302(this.field3472[var1], this.field3474);
            }
            this.field3472 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 246)
    public class223(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1633(arg5);
        this.method1634();
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()V", line = 140)
    private final void method1634() {
        if (this.field3472 != null) {
            return;
        }
        this.field3472 = new int[256];
        GL var1 = class162.field2654;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field3186[var2] / (float) this.field3473 + var3;
            float var6 = (float) this.field3191[var2] / (float) this.field3473 + var4;
            this.field3472[var2] = var1.glGenLists(1);
            var1.glNewList(this.field3472[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field3186[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field3191[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field3186[var2], (float) (-this.field3191[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field3474 = class177.field2819;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIZ)V", line = 178)
    public final void method1171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class114.field1838 == null) {
            class162.method1224();
            GL var18 = class162.field2654;
            class162.method1219(this.field3471);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class162.field2618 - arg2), 0.0F);
            var18.glCallList(this.field3472[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class162.method1224();
        GL var8 = class162.field2654;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class162.field2618 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field3186[arg0] / (float) this.field3473 + var9;
        float var12 = (float) this.field3191[arg0] / (float) this.field3473 + var10;
        class162.method1219(this.field3471);
        class196 var13 = class114.field1838;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field3026);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class114.field1836) / (float) var13.field3022;
        float var15 = (float) (arg2 - class114.field1835) / (float) var13.field3024;
        float var16 = (float) (arg1 + arg3 - class114.field1836) / (float) var13.field3022;
        float var17 = (float) (arg2 + arg4 - class114.field1835) / (float) var13.field3024;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field3186[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field3191[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field3186[arg0], (float) (-this.field3191[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }
}
