import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class126 extends class171 {

    @OriginalMember(owner = "client!sk", name = "Db", descriptor = "I")
    private int field1768 = 0;

    @OriginalMember(owner = "client!sk", name = "Cb", descriptor = "I")
    private int field1767 = -1;

    @OriginalMember(owner = "client!sk", name = "zb", descriptor = "I")
    private int field1764;

    @OriginalMember(owner = "client!sk", name = "Bb", descriptor = "I")
    private int field1766;

    @OriginalMember(owner = "client!sk", name = "Ab", descriptor = "[I")
    private int[] field1765;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIZ)V", line = 5)
    public final void method799(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class13.field184 == null) {
            class217.method1474();
            GL var18 = class217.field3551;
            class217.method1457(this.field1767);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class217.field3531 - arg2), 0.0F);
            var18.glCallList(this.field1765[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class217.method1474();
        GL var8 = class217.field3551;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class217.field3531 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field2682[arg0] / (float) this.field1764 + var9;
        float var12 = (float) this.field2679[arg0] / (float) this.field1764 + var10;
        class217.method1457(this.field1767);
        class68 var13 = class13.field184;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field999);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class13.field181) / (float) var13.field998;
        float var15 = (float) (arg2 - class13.field185) / (float) var13.field1003;
        float var16 = (float) (arg1 + arg3 - class13.field181) / (float) var13.field998;
        float var17 = (float) (arg2 + arg4 - class13.field185) / (float) var13.field1003;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field2682[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field2679[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field2682[arg0], (float) (-this.field2679[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIZ)V", line = 71)
    public final void method800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class217.method1474();
        GL var9 = class217.field3551;
        class217.method1457(this.field1767);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class217.field3531 - arg2), 0.0F);
        var9.glCallList(this.field1765[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([[B)V", line = 84)
    private final void method801(byte[][] arg0) {
        if (this.field1767 != -1) {
            return;
        }
        this.field1764 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field2679[var2] > this.field1764) {
                this.field1764 = this.field2679[var2];
            }
            if (this.field2682[var2] > this.field1764) {
                this.field1764 = this.field2682[var2];
            }
        }
        this.field1764 *= 16;
        this.field1764 = class270.method1847(this.field1764, 96);
        int var3 = this.field1764 / 16;
        byte[] var4 = new byte[this.field1764 * this.field1764 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field1764 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field2679[var5];
            int var11 = this.field2682[var5];
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
                var8 += (this.field1764 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class217.field3551;
        if (this.field1767 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field1767 = var17[0];
            this.field1766 = class207.field3383;
        }
        class217.method1457(this.field1767);
        var16.glTexImage2D(3553, 0, 6410, this.field1764, this.field1764, 0, 6410, 5121, var15);
        class207.field3382 += var15.limit() - this.field1768;
        this.field1768 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 176)
    public class126(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method801(arg5);
        this.method802();
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "()V", line = 182)
    private final void method802() {
        if (this.field1765 != null) {
            return;
        }
        this.field1765 = new int[256];
        GL var1 = class217.field3551;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field2682[var2] / (float) this.field1764 + var3;
            float var6 = (float) this.field2679[var2] / (float) this.field1764 + var4;
            this.field1765[var2] = var1.glGenLists(1);
            var1.glNewList(this.field1765[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field2682[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field2679[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field2682[var2], (float) (-this.field2679[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field1766 = class207.field3383;
    }

    @OriginalMember(owner = "client!sk", name = "finalize", descriptor = "()V", line = 220)
    protected final void finalize() throws Throwable {
        if (this.field1767 != -1) {
            class207.method1398(this.field1767, this.field1768, this.field1766);
            this.field1767 = -1;
            this.field1768 = 0;
        }
        if (this.field1765 != null) {
            for (int var1 = 0; var1 < this.field1765.length; var1++) {
                class207.method1396(this.field1765[var1], this.field1766);
            }
            this.field1765 = null;
        }
        super.finalize();
    }
}
