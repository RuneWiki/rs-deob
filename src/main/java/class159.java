import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class159 extends class329 {

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    private int field2395 = -1;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
    private int field2396 = 0;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
    private int field2397;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
    private int field2398;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "[I")
    private int[] field2394;

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 7)
    public class159(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method1080(arg5);
        this.method1079();
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()V", line = 13)
    private final void method1079() {
        if (this.field2394 != null) {
            return;
        }
        this.field2394 = new int[256];
        GL var1 = class94.field1473;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field5100[var2] / (float) this.field2397 + var3;
            float var6 = (float) this.field5110[var2] / (float) this.field2397 + var4;
            this.field2394[var2] = var1.glGenLists(1);
            var1.glNewList(this.field2394[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field5100[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field5110[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field5100[var2], (float) (-this.field5110[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field2398 = class198.field2966;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([[B)V", line = 52)
    private final void method1080(byte[][] arg0) {
        if (this.field2395 != -1) {
            return;
        }
        this.field2397 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field5110[var2] > this.field2397) {
                this.field2397 = this.field5110[var2];
            }
            if (this.field5100[var2] > this.field2397) {
                this.field2397 = this.field5100[var2];
            }
        }
        this.field2397 *= 16;
        this.field2397 = class10.method73((byte) 119, this.field2397);
        int var3 = this.field2397 / 16;
        byte[] var4 = new byte[this.field2397 * this.field2397 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field2397 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field5110[var5];
            int var11 = this.field5100[var5];
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
                var8 += (this.field2397 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class94.field1473;
        if (this.field2395 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field2395 = var17[0];
            this.field2398 = class198.field2966;
        }
        class94.method698(this.field2395);
        var16.glTexImage2D(3553, 0, 6410, this.field2397, this.field2397, 0, 6410, 5121, var15);
        class198.field2964 += var15.limit() - this.field2396;
        this.field2396 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!hl", name = "finalize", descriptor = "()V", line = 152)
    protected final void finalize() throws Throwable {
        if (this.field2395 != -1) {
            class198.method1403(this.field2395, this.field2396, this.field2398);
            this.field2395 = -1;
            this.field2396 = 0;
        }
        if (this.field2394 != null) {
            for (int var1 = 0; var1 < this.field2394.length; var1++) {
                class198.method1406(this.field2394[var1], this.field2398);
            }
            this.field2394 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIIZ)V", line = 174)
    public final void method899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class94.method690();
        GL var9 = class94.field1473;
        class94.method698(this.field2395);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class94.field1513 - arg2), 0.0F);
        var9.glCallList(this.field2394[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIZ)V", line = 186)
    public final void method901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class167.field2551 == null) {
            class94.method690();
            GL var18 = class94.field1473;
            class94.method698(this.field2395);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class94.field1513 - arg2), 0.0F);
            var18.glCallList(this.field2394[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class94.method690();
        GL var8 = class94.field1473;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class94.field1513 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field5100[arg0] / (float) this.field2397 + var9;
        float var12 = (float) this.field5110[arg0] / (float) this.field2397 + var10;
        class94.method698(this.field2395);
        class86 var13 = class167.field2551;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field1396);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class167.field2550) / (float) var13.field1400;
        float var15 = (float) (arg2 - class167.field2552) / (float) var13.field1398;
        float var16 = (float) (arg1 + arg3 - class167.field2550) / (float) var13.field1400;
        float var17 = (float) (arg2 + arg4 - class167.field2552) / (float) var13.field1398;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field5100[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field5110[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field5100[arg0], (float) (-this.field5110[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }
}
