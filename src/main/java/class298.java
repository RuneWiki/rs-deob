import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class298 extends class277 {

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    private int field4418 = -1;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    private int field4420 = 0;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    private int field4416;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    private int field4417;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "[I")
    private int[] field4419;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIZ)V", line = 6)
    public final void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class102.field1398 == null) {
            class67.method481();
            GL var18 = class67.field899;
            class67.method479(this.field4418);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class67.field897 - arg2), 0.0F);
            var18.glCallList(this.field4419[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class67.method481();
        GL var8 = class67.field899;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class67.field897 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field4148[arg0] / (float) this.field4417 + var9;
        float var12 = (float) this.field4150[arg0] / (float) this.field4417 + var10;
        class67.method479(this.field4418);
        class328 var13 = class102.field1398;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field4950);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class102.field1401) / (float) var13.field4949;
        float var15 = (float) (arg2 - class102.field1400) / (float) var13.field4953;
        float var16 = (float) (arg1 + arg3 - class102.field1401) / (float) var13.field4949;
        float var17 = (float) (arg2 + arg4 - class102.field1400) / (float) var13.field4953;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field4148[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field4150[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field4148[arg0], (float) (-this.field4150[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()V", line = 71)
    private final void method2027() {
        if (this.field4419 != null) {
            return;
        }
        this.field4419 = new int[256];
        GL var1 = class67.field899;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field4148[var2] / (float) this.field4417 + var3;
            float var6 = (float) this.field4150[var2] / (float) this.field4417 + var4;
            this.field4419[var2] = var1.glGenLists(1);
            var1.glNewList(this.field4419[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field4148[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field4150[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field4148[var2], (float) (-this.field4150[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field4416 = class180.field2413;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIZ)V", line = 111)
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class67.method481();
        GL var9 = class67.field899;
        class67.method479(this.field4418);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class67.field897 - arg2), 0.0F);
        var9.glCallList(this.field4419[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ab", name = "finalize", descriptor = "()V", line = 121)
    protected final void finalize() throws Throwable {
        if (this.field4418 != -1) {
            class180.method1247(this.field4418, this.field4420, this.field4416);
            this.field4418 = -1;
            this.field4420 = 0;
        }
        if (this.field4419 != null) {
            for (int var1 = 0; var1 < this.field4419.length; var1++) {
                class180.method1244(this.field4419[var1], this.field4416);
            }
            this.field4419 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 145)
    public class298(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method2028(arg5);
        this.method2027();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([[B)V", line = 154)
    private final void method2028(byte[][] arg0) {
        if (this.field4418 != -1) {
            return;
        }
        this.field4417 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field4150[var2] > this.field4417) {
                this.field4417 = this.field4150[var2];
            }
            if (this.field4148[var2] > this.field4417) {
                this.field4417 = this.field4148[var2];
            }
        }
        this.field4417 *= 16;
        this.field4417 = class110.method804(this.field4417, (byte) 72);
        int var3 = this.field4417 / 16;
        byte[] var4 = new byte[this.field4417 * this.field4417 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field4417 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field4150[var5];
            int var11 = this.field4148[var5];
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
                var8 += (this.field4417 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class67.field899;
        if (this.field4418 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field4418 = var17[0];
            this.field4416 = class180.field2413;
        }
        class67.method479(this.field4418);
        var16.glTexImage2D(3553, 0, 6410, this.field4417, this.field4417, 0, 6410, 5121, var15);
        class180.field2414 += var15.limit() - this.field4420;
        this.field4420 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }
}
