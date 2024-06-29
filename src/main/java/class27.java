import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class27 extends class89 {

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    private int field373 = 0;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    private int field372 = -1;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "[I")
    private int[] field375;

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 7)
    public class27(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method172(arg5);
        this.method174();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([[B)V", line = 13)
    private final void method172(byte[][] arg0) {
        if (this.field372 != -1) {
            return;
        }
        this.field374 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field1316[var2] > this.field374) {
                this.field374 = this.field1316[var2];
            }
            if (this.field1326[var2] > this.field374) {
                this.field374 = this.field1326[var2];
            }
        }
        this.field374 *= 16;
        this.field374 = class104.method731(this.field374, -100);
        int var3 = this.field374 / 16;
        byte[] var4 = new byte[this.field374 * this.field374 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field374 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field1316[var5];
            int var11 = this.field1326[var5];
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
                var8 += (this.field374 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class117.field1801;
        if (this.field372 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field372 = var17[0];
            this.field376 = class174.field2589;
        }
        class117.method814(this.field372);
        var16.glTexImage2D(3553, 0, 6410, this.field374, this.field374, 0, 6410, 5121, var15);
        class174.field2593 += var15.limit() - this.field373;
        this.field373 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIZ)V", line = 105)
    public final void method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class308.field4687 == null) {
            class117.method804();
            GL var18 = class117.field1801;
            class117.method814(this.field372);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class117.field1807 - arg2), 0.0F);
            var18.glCallList(this.field375[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class117.method804();
        GL var8 = class117.field1801;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class117.field1807 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field1326[arg0] / (float) this.field374 + var9;
        float var12 = (float) this.field1316[arg0] / (float) this.field374 + var10;
        class117.method814(this.field372);
        class303 var13 = class308.field4687;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field4618);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class308.field4690) / (float) var13.field4621;
        float var15 = (float) (arg2 - class308.field4691) / (float) var13.field4623;
        float var16 = (float) (arg1 + arg3 - class308.field4690) / (float) var13.field4621;
        float var17 = (float) (arg2 + arg4 - class308.field4691) / (float) var13.field4623;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field1326[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field1316[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field1326[arg0], (float) (-this.field1316[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V", line = 172)
    private final void method174() {
        if (this.field375 != null) {
            return;
        }
        this.field375 = new int[256];
        GL var1 = class117.field1801;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field1326[var2] / (float) this.field374 + var3;
            float var6 = (float) this.field1316[var2] / (float) this.field374 + var4;
            this.field375[var2] = var1.glGenLists(1);
            var1.glNewList(this.field375[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field1326[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field1316[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field1326[var2], (float) (-this.field1316[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field376 = class174.field2589;
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V", line = 217)
    protected final void finalize() throws Throwable {
        if (this.field372 != -1) {
            class174.method1212(this.field372, this.field373, this.field376);
            this.field372 = -1;
            this.field373 = 0;
        }
        if (this.field375 != null) {
            for (int var1 = 0; var1 < this.field375.length; var1++) {
                class174.method1209(this.field375[var1], this.field376);
            }
            this.field375 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIZ)V", line = 240)
    public final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class117.method804();
        GL var9 = class117.field1801;
        class117.method814(this.field372);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class117.field1807 - arg2), 0.0F);
        var9.glCallList(this.field375[arg0]);
        var9.glLoadIdentity();
    }
}
