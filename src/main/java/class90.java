import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class90 extends class31 {

    @OriginalMember(owner = "client!fl", name = "wb", descriptor = "I")
    private int field1544 = -1;

    @OriginalMember(owner = "client!fl", name = "vb", descriptor = "I")
    private int field1543 = 0;

    @OriginalMember(owner = "client!fl", name = "ub", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!fl", name = "xb", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!fl", name = "yb", descriptor = "[I")
    private int[] field1546;

    @OriginalMember(owner = "client!fl", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        if (this.field1544 != -1) {
            class274.method1896(this.field1544, this.field1543, this.field1542);
            this.field1544 = -1;
            this.field1543 = 0;
        }
        if (this.field1546 != null) {
            for (int var1 = 0; var1 < this.field1546.length; var1++) {
                class274.method1901(this.field1546[var1], this.field1542);
            }
            this.field1546 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIIZ)V", line = 30)
    public final void method249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class99.method735();
        GL var9 = class99.field1682;
        class99.method749(this.field1544);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class99.field1685 - arg2), 0.0F);
        var9.glCallList(this.field1546[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 42)
    public class90(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method672(arg5);
        this.method673();
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([[B)V", line = 51)
    private final void method672(byte[][] arg0) {
        if (this.field1544 != -1) {
            return;
        }
        this.field1545 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field505[var2] > this.field1545) {
                this.field1545 = this.field505[var2];
            }
            if (this.field519[var2] > this.field1545) {
                this.field1545 = this.field519[var2];
            }
        }
        this.field1545 *= 16;
        this.field1545 = class303.method2049(this.field1545, 2539);
        int var3 = this.field1545 / 16;
        byte[] var4 = new byte[this.field1545 * this.field1545 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field1545 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field505[var5];
            int var11 = this.field519[var5];
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
                var8 += (this.field1545 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class99.field1682;
        if (this.field1544 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field1544 = var17[0];
            this.field1542 = class274.field4577;
        }
        class99.method749(this.field1544);
        var16.glTexImage2D(3553, 0, 6410, this.field1545, this.field1545, 0, 6410, 5121, var15);
        class274.field4581 += var15.limit() - this.field1543;
        this.field1543 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "()V", line = 143)
    private final void method673() {
        if (this.field1546 != null) {
            return;
        }
        this.field1546 = new int[256];
        GL var1 = class99.field1682;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field519[var2] / (float) this.field1545 + var3;
            float var6 = (float) this.field505[var2] / (float) this.field1545 + var4;
            this.field1546[var2] = var1.glGenLists(1);
            var1.glNewList(this.field1546[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field519[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field505[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field519[var2], (float) (-this.field505[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field1542 = class274.field4577;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIZ)V", line = 186)
    public final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class212.field3502 == null) {
            class99.method735();
            GL var18 = class99.field1682;
            class99.method749(this.field1544);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class99.field1685 - arg2), 0.0F);
            var18.glCallList(this.field1546[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class99.method735();
        GL var8 = class99.field1682;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class99.field1685 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field519[arg0] / (float) this.field1545 + var9;
        float var12 = (float) this.field505[arg0] / (float) this.field1545 + var10;
        class99.method749(this.field1544);
        class87 var13 = class212.field3502;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field1478);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class212.field3499) / (float) var13.field1480;
        float var15 = (float) (arg2 - class212.field3498) / (float) var13.field1479;
        float var16 = (float) (arg1 + arg3 - class212.field3499) / (float) var13.field1480;
        float var17 = (float) (arg2 + arg4 - class212.field3498) / (float) var13.field1479;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field519[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field505[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field519[arg0], (float) (-this.field505[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }
}
