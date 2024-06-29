import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class179 extends class84 {

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    private int field2954 = -1;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    private int field2952 = 0;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    private int field2951;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "[I")
    private int[] field2953;

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 6)
    public class179(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1261(arg5);
        this.method1262();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIZ)V", line = 17)
    public final void method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class241.method1713();
        GL var9 = class241.field4012;
        class241.method1687(this.field2954);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class241.field3993 - arg2), 0.0F);
        var9.glCallList(this.field2953[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([[B)V", line = 31)
    private final void method1261(byte[][] arg0) {
        if (this.field2954 != -1) {
            return;
        }
        this.field2951 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field1447[var2] > this.field2951) {
                this.field2951 = this.field1447[var2];
            }
            if (this.field1440[var2] > this.field2951) {
                this.field2951 = this.field1440[var2];
            }
        }
        this.field2951 *= 16;
        this.field2951 = class311.method2264(this.field2951, (byte) -122);
        int var3 = this.field2951 / 16;
        byte[] var4 = new byte[this.field2951 * this.field2951 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field2951 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field1447[var5];
            int var11 = this.field1440[var5];
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
                var8 += (this.field2951 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class241.field4012;
        if (this.field2954 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field2954 = var17[0];
            this.field2950 = class239.field3974;
        }
        class241.method1687(this.field2954);
        var16.glTexImage2D(3553, 0, 6410, this.field2951, this.field2951, 0, 6410, 5121, var15);
        class239.field3976 += var15.limit() - this.field2952;
        this.field2952 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!ej", name = "finalize", descriptor = "()V", line = 123)
    protected final void finalize() throws Throwable {
        if (this.field2954 != -1) {
            class239.method1668(this.field2954, this.field2952, this.field2950);
            this.field2954 = -1;
            this.field2952 = 0;
        }
        if (this.field2953 != null) {
            for (int var1 = 0; var1 < this.field2953.length; var1++) {
                class239.method1673(this.field2953[var1], this.field2950);
            }
            this.field2953 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()V", line = 148)
    private final void method1262() {
        if (this.field2953 != null) {
            return;
        }
        this.field2953 = new int[256];
        GL var1 = class241.field4012;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field1440[var2] / (float) this.field2951 + var3;
            float var6 = (float) this.field1447[var2] / (float) this.field2951 + var4;
            this.field2953[var2] = var1.glGenLists(1);
            var1.glNewList(this.field2953[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field1440[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field1447[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field1440[var2], (float) (-this.field1447[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field2950 = class239.field3974;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIZ)V", line = 186)
    public final void method623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class337.field5351 == null) {
            class241.method1713();
            GL var18 = class241.field4012;
            class241.method1687(this.field2954);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class241.field3993 - arg2), 0.0F);
            var18.glCallList(this.field2953[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class241.method1713();
        GL var8 = class241.field4012;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class241.field3993 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field1440[arg0] / (float) this.field2951 + var9;
        float var12 = (float) this.field1447[arg0] / (float) this.field2951 + var10;
        class241.method1687(this.field2954);
        class265 var13 = class337.field5351;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field4336);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class337.field5348) / (float) var13.field4339;
        float var15 = (float) (arg2 - class337.field5350) / (float) var13.field4340;
        float var16 = (float) (arg1 + arg3 - class337.field5348) / (float) var13.field4339;
        float var17 = (float) (arg2 + arg4 - class337.field5350) / (float) var13.field4340;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field1440[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field1447[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field1440[arg0], (float) (-this.field1447[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }
}
