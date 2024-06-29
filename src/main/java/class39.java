import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class39 extends class281 {

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    private int field486 = 0;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    private int field488 = -1;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "[I")
    private int[] field485;

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 5)
    public class39(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method278(arg5);
        this.method279();
    }

    @OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V", line = 13)
    protected final void finalize() throws Throwable {
        if (this.field488 != -1) {
            class298.method2039(this.field488, this.field486, this.field484);
            this.field488 = -1;
            this.field486 = 0;
        }
        if (this.field485 != null) {
            for (int var1 = 0; var1 < this.field485.length; var1++) {
                class298.method2034(this.field485[var1], this.field484);
            }
            this.field485 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIZ)V", line = 35)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class47.method347();
        GL var9 = class47.field592;
        class47.method357(this.field488);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class47.field621 - arg2), 0.0F);
        var9.glCallList(this.field485[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIZ)V", line = 46)
    public final void method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class129.field1764 == null) {
            class47.method347();
            GL var18 = class47.field592;
            class47.method357(this.field488);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class47.field621 - arg2), 0.0F);
            var18.glCallList(this.field485[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class47.method347();
        GL var8 = class47.field592;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class47.field621 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field4006[arg0] / (float) this.field487 + var9;
        float var12 = (float) this.field3997[arg0] / (float) this.field487 + var10;
        class47.method357(this.field488);
        class361 var13 = class129.field1764;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field5639);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class129.field1763) / (float) var13.field5642;
        float var15 = (float) (arg2 - class129.field1766) / (float) var13.field5645;
        float var16 = (float) (arg1 + arg3 - class129.field1763) / (float) var13.field5642;
        float var17 = (float) (arg2 + arg4 - class129.field1766) / (float) var13.field5645;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field4006[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field3997[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field4006[arg0], (float) (-this.field3997[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([[B)V", line = 112)
    private final void method278(byte[][] arg0) {
        if (this.field488 != -1) {
            return;
        }
        this.field487 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field3997[var2] > this.field487) {
                this.field487 = this.field3997[var2];
            }
            if (this.field4006[var2] > this.field487) {
                this.field487 = this.field4006[var2];
            }
        }
        this.field487 *= 16;
        this.field487 = class262.method1805(this.field487, (byte) -9);
        int var3 = this.field487 / 16;
        byte[] var4 = new byte[this.field487 * this.field487 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field487 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field3997[var5];
            int var11 = this.field4006[var5];
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
                var8 += (this.field487 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class47.field592;
        if (this.field488 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field488 = var17[0];
            this.field484 = class298.field4320;
        }
        class47.method357(this.field488);
        var16.glTexImage2D(3553, 0, 6410, this.field487, this.field487, 0, 6410, 5121, var15);
        class298.field4323 += var15.limit() - this.field486;
        this.field486 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "()V", line = 210)
    private final void method279() {
        if (this.field485 != null) {
            return;
        }
        this.field485 = new int[256];
        GL var1 = class47.field592;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field4006[var2] / (float) this.field487 + var3;
            float var6 = (float) this.field3997[var2] / (float) this.field487 + var4;
            this.field485[var2] = var1.glGenLists(1);
            var1.glNewList(this.field485[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field4006[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field3997[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field4006[var2], (float) (-this.field3997[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field484 = class298.field4320;
    }
}
