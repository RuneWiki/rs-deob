import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class332 extends class80 {

    @OriginalMember(owner = "client!bf", name = "Db", descriptor = "I")
    private int field5665 = -1;

    @OriginalMember(owner = "client!bf", name = "Eb", descriptor = "I")
    private int field5666 = 0;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    private int field5663;

    @OriginalMember(owner = "client!bf", name = "Fb", descriptor = "I")
    private int field5667;

    @OriginalMember(owner = "client!bf", name = "Cb", descriptor = "[I")
    private int[] field5664;

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 7)
    public class332(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method2267(arg5);
        this.method2268();
    }

    @OriginalMember(owner = "client!bf", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() throws Throwable {
        if (this.field5665 != -1) {
            class124.method859(this.field5665, this.field5666, this.field5667);
            this.field5665 = -1;
            this.field5666 = 0;
        }
        if (this.field5664 != null) {
            for (int var1 = 0; var1 < this.field5664.length; var1++) {
                class124.method862(this.field5664[var1], this.field5667);
            }
            this.field5664 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([[B)V", line = 36)
    private final void method2267(byte[][] arg0) {
        if (this.field5665 != -1) {
            return;
        }
        this.field5663 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field1234[var2] > this.field5663) {
                this.field5663 = this.field1234[var2];
            }
            if (this.field1243[var2] > this.field5663) {
                this.field5663 = this.field1243[var2];
            }
        }
        this.field5663 *= 16;
        this.field5663 = class117.method832(this.field5663, (byte) 68);
        int var3 = this.field5663 / 16;
        byte[] var4 = new byte[this.field5663 * this.field5663 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field5663 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field1234[var5];
            int var11 = this.field1243[var5];
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
                var8 += (this.field5663 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class231.field4052;
        if (this.field5665 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field5665 = var17[0];
            this.field5667 = class124.field2099;
        }
        class231.method1597(this.field5665);
        var16.glTexImage2D(3553, 0, 6410, this.field5663, this.field5663, 0, 6410, 5121, var15);
        class124.field2101 += var15.limit() - this.field5666;
        this.field5666 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()V", line = 129)
    private final void method2268() {
        if (this.field5664 != null) {
            return;
        }
        this.field5664 = new int[256];
        GL var1 = class231.field4052;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field1243[var2] / (float) this.field5663 + var3;
            float var6 = (float) this.field1234[var2] / (float) this.field5663 + var4;
            this.field5664[var2] = var1.glGenLists(1);
            var1.glNewList(this.field5664[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field1243[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field1234[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field1243[var2], (float) (-this.field1234[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field5667 = class124.field2099;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIZ)V", line = 167)
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class50.field716 == null) {
            class231.method1594();
            GL var18 = class231.field4052;
            class231.method1597(this.field5665);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class231.field4079 - arg2), 0.0F);
            var18.glCallList(this.field5664[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class231.method1594();
        GL var8 = class231.field4052;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class231.field4079 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field1243[arg0] / (float) this.field5663 + var9;
        float var12 = (float) this.field1234[arg0] / (float) this.field5663 + var10;
        class231.method1597(this.field5665);
        class49 var13 = class50.field716;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field708);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class50.field717) / (float) var13.field714;
        float var15 = (float) (arg2 - class50.field719) / (float) var13.field711;
        float var16 = (float) (arg1 + arg3 - class50.field717) / (float) var13.field714;
        float var17 = (float) (arg2 + arg4 - class50.field719) / (float) var13.field711;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field1243[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field1234[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field1243[arg0], (float) (-this.field1234[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIZ)V", line = 232)
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class231.method1594();
        GL var9 = class231.field4052;
        class231.method1597(this.field5665);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class231.field4079 - arg2), 0.0F);
        var9.glCallList(this.field5664[arg0]);
        var9.glLoadIdentity();
    }
}
