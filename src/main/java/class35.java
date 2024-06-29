import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class35 extends class251 {

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "I")
    private int field469 = -1;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
    private int field471 = 0;

    @OriginalMember(owner = "client!w", name = "db", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!w", name = "gb", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!w", name = "fb", descriptor = "[I")
    private int[] field472;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIZ)V", line = 9)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class232.method1669();
        GL var9 = class232.field3716;
        class232.method1662(this.field469);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class232.field3731 - arg2), 0.0F);
        var9.glCallList(this.field472[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([[B)V", line = 20)
    private final void method191(byte[][] arg0) {
        if (this.field469 != -1) {
            return;
        }
        this.field470 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field4003[var2] > this.field470) {
                this.field470 = this.field4003[var2];
            }
            if (this.field4005[var2] > this.field470) {
                this.field470 = this.field4005[var2];
            }
        }
        this.field470 *= 16;
        this.field470 = class120.method843(62, this.field470);
        int var3 = this.field470 / 16;
        byte[] var4 = new byte[this.field470 * this.field470 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field470 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field4003[var5];
            int var11 = this.field4005[var5];
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
                var8 += (this.field470 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class232.field3716;
        if (this.field469 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field469 = var17[0];
            this.field473 = class230.field3658;
        }
        class232.method1662(this.field469);
        var16.glTexImage2D(3553, 0, 6410, this.field470, this.field470, 0, 6410, 5121, var15);
        class230.field3662 += var15.limit() - this.field471;
        this.field471 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 113)
    public class35(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method191(arg5);
        this.method192();
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V", line = 119)
    private final void method192() {
        if (this.field472 != null) {
            return;
        }
        this.field472 = new int[256];
        GL var1 = class232.field3716;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field4005[var2] / (float) this.field470 + var3;
            float var6 = (float) this.field4003[var2] / (float) this.field470 + var4;
            this.field472[var2] = var1.glGenLists(1);
            var1.glNewList(this.field472[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field4005[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field4003[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field4005[var2], (float) (-this.field4003[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field473 = class230.field3658;
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 161)
    protected final void finalize() throws Throwable {
        if (this.field469 != -1) {
            class230.method1627(this.field469, this.field471, this.field473);
            this.field469 = -1;
            this.field471 = 0;
        }
        if (this.field472 != null) {
            for (int var1 = 0; var1 < this.field472.length; var1++) {
                class230.method1635(this.field472[var1], this.field473);
            }
            this.field472 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIZ)V", line = 183)
    public final void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class75.field1053 == null) {
            class232.method1669();
            GL var18 = class232.field3716;
            class232.method1662(this.field469);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class232.field3731 - arg2), 0.0F);
            var18.glCallList(this.field472[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class232.method1669();
        GL var8 = class232.field3716;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class232.field3731 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field4005[arg0] / (float) this.field470 + var9;
        float var12 = (float) this.field4003[arg0] / (float) this.field470 + var10;
        class232.method1662(this.field469);
        class314 var13 = class75.field1053;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field4868);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class75.field1056) / (float) var13.field4870;
        float var15 = (float) (arg2 - class75.field1054) / (float) var13.field4867;
        float var16 = (float) (arg1 + arg3 - class75.field1056) / (float) var13.field4870;
        float var17 = (float) (arg2 + arg4 - class75.field1054) / (float) var13.field4867;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field4005[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field4003[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field4005[arg0], (float) (-this.field4003[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }
}
