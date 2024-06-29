import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class302 extends class37 {

    @OriginalMember(owner = "client!tf", name = "rb", descriptor = "I")
    private int field5097 = -1;

    @OriginalMember(owner = "client!tf", name = "ub", descriptor = "I")
    private int field5100 = 0;

    @OriginalMember(owner = "client!tf", name = "qb", descriptor = "I")
    private int field5096;

    @OriginalMember(owner = "client!tf", name = "tb", descriptor = "I")
    private int field5099;

    @OriginalMember(owner = "client!tf", name = "sb", descriptor = "[I")
    private int[] field5098;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([[B)V", line = 8)
    private final void method2057(byte[][] arg0) {
        if (this.field5097 != -1) {
            return;
        }
        this.field5096 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field439[var2] > this.field5096) {
                this.field5096 = this.field439[var2];
            }
            if (this.field445[var2] > this.field5096) {
                this.field5096 = this.field445[var2];
            }
        }
        this.field5096 *= 16;
        this.field5096 = class180.method1294(true, this.field5096);
        int var3 = this.field5096 / 16;
        byte[] var4 = new byte[this.field5096 * this.field5096 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field5096 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field439[var5];
            int var11 = this.field445[var5];
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
                var8 += (this.field5096 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class90.field1390;
        if (this.field5097 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field5097 = var17[0];
            this.field5099 = class7.field91;
        }
        class90.method617(this.field5097);
        var16.glTexImage2D(3553, 0, 6410, this.field5096, this.field5096, 0, 6410, 5121, var15);
        class7.field90 += var15.limit() - this.field5100;
        this.field5100 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 102)
    public class302(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method2057(arg5);
        this.method2058();
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIZ)V", line = 107)
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class90.method634();
        GL var9 = class90.field1390;
        class90.method617(this.field5097);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class90.field1379 - arg2), 0.0F);
        var9.glCallList(this.field5098[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!tf", name = "finalize", descriptor = "()V", line = 118)
    protected final void finalize() throws Throwable {
        if (this.field5097 != -1) {
            class7.method31(this.field5097, this.field5100, this.field5099);
            this.field5097 = -1;
            this.field5100 = 0;
        }
        if (this.field5098 != null) {
            for (int var1 = 0; var1 < this.field5098.length; var1++) {
                class7.method29(this.field5098[var1], this.field5099);
            }
            this.field5098 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIZ)V", line = 140)
    public final void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class228.field3689 == null) {
            class90.method634();
            GL var18 = class90.field1390;
            class90.method617(this.field5097);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class90.field1379 - arg2), 0.0F);
            var18.glCallList(this.field5098[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class90.method634();
        GL var8 = class90.field1390;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class90.field1379 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field445[arg0] / (float) this.field5096 + var9;
        float var12 = (float) this.field439[arg0] / (float) this.field5096 + var10;
        class90.method617(this.field5097);
        class258 var13 = class228.field3689;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field4380);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class228.field3692) / (float) var13.field4384;
        float var15 = (float) (arg2 - class228.field3693) / (float) var13.field4385;
        float var16 = (float) (arg1 + arg3 - class228.field3692) / (float) var13.field4384;
        float var17 = (float) (arg2 + arg4 - class228.field3693) / (float) var13.field4385;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field445[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field439[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field445[arg0], (float) (-this.field439[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()V", line = 209)
    private final void method2058() {
        if (this.field5098 != null) {
            return;
        }
        this.field5098 = new int[256];
        GL var1 = class90.field1390;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field445[var2] / (float) this.field5096 + var3;
            float var6 = (float) this.field439[var2] / (float) this.field5096 + var4;
            this.field5098[var2] = var1.glGenLists(1);
            var1.glNewList(this.field5098[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field445[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field439[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field445[var2], (float) (-this.field439[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field5099 = class7.field91;
    }
}
