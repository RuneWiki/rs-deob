import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class299 extends class312 {

    @OriginalMember(owner = "client!kb", name = "Db", descriptor = "I")
    private int field4959 = -1;

    @OriginalMember(owner = "client!kb", name = "Eb", descriptor = "I")
    private int field4960 = 0;

    @OriginalMember(owner = "client!kb", name = "Gb", descriptor = "I")
    private int field4962;

    @OriginalMember(owner = "client!kb", name = "Hb", descriptor = "I")
    private int field4963;

    @OriginalMember(owner = "client!kb", name = "Fb", descriptor = "[I")
    private int[] field4961;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIZ)V", line = 5)
    public final void method1836(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class101.field1630 == null) {
            class56.method385();
            GL var18 = class56.field848;
            class56.method354(this.field4959);
            var18.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
            var18.glTranslatef((float) arg1, (float) (class56.field870 - arg2), 0.0F);
            var18.glCallList(this.field4961[arg0]);
            var18.glLoadIdentity();
            return;
        }
        class56.method385();
        GL var8 = class56.field848;
        var8.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var8.glTranslatef((float) arg1, (float) (class56.field870 - arg2), 0.0F);
        float var9 = (float) (arg0 % 16) / 16.0F;
        float var10 = (float) (arg0 / 16) / 16.0F;
        float var11 = (float) this.field5316[arg0] / (float) this.field4962 + var9;
        float var12 = (float) this.field5286[arg0] / (float) this.field4962 + var10;
        class56.method354(this.field4959);
        class198 var13 = class101.field1630;
        var8.glActiveTexture(33985);
        var8.glEnable(3553);
        var8.glBindTexture(3553, var13.field3381);
        var8.glTexEnvi(8960, 34161, 7681);
        var8.glTexEnvi(8960, 34176, 34168);
        float var14 = (float) (arg1 - class101.field1627) / (float) var13.field3385;
        float var15 = (float) (arg2 - class101.field1629) / (float) var13.field3386;
        float var16 = (float) (arg1 + arg3 - class101.field1627) / (float) var13.field3385;
        float var17 = (float) (arg2 + arg4 - class101.field1629) / (float) var13.field3386;
        var8.glBegin(6);
        var8.glMultiTexCoord2f(33985, var16, var15);
        var8.glTexCoord2f(var11, var10);
        var8.glVertex2f((float) this.field5316[arg0], 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var15);
        var8.glTexCoord2f(var9, var10);
        var8.glVertex2f(0.0F, 0.0F);
        var8.glMultiTexCoord2f(33985, var14, var17);
        var8.glTexCoord2f(var9, var12);
        var8.glVertex2f(0.0F, (float) (-this.field5286[arg0]));
        var8.glMultiTexCoord2f(33985, var16, var17);
        var8.glTexCoord2f(var11, var12);
        var8.glVertex2f((float) this.field5316[arg0], (float) (-this.field5286[arg0]));
        var8.glEnd();
        var8.glTexEnvi(8960, 34161, 8448);
        var8.glTexEnvi(8960, 34176, 5890);
        var8.glDisable(3553);
        var8.glActiveTexture(33984);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kb", name = "finalize", descriptor = "()V", line = 73)
    protected final void finalize() throws Throwable {
        if (this.field4959 != -1) {
            class121.method793(this.field4959, this.field4960, this.field4963);
            this.field4959 = -1;
            this.field4960 = 0;
        }
        if (this.field4961 != null) {
            for (int var1 = 0; var1 < this.field4961.length; var1++) {
                class121.method791(this.field4961[var1], this.field4963);
            }
            this.field4961 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()V", line = 95)
    private final void method2014() {
        if (this.field4961 != null) {
            return;
        }
        this.field4961 = new int[256];
        GL var1 = class56.field848;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field5316[var2] / (float) this.field4962 + var3;
            float var6 = (float) this.field5286[var2] / (float) this.field4962 + var4;
            this.field4961[var2] = var1.glGenLists(1);
            var1.glNewList(this.field4961[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field5316[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field5286[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field5316[var2], (float) (-this.field5286[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field4963 = class121.field2023;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 242)
    public class299(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method2015(arg5);
        this.method2014();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIZ)V", line = 139)
    public final void method1839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        class56.method385();
        GL var9 = class56.field848;
        class56.method354(this.field4959);
        var9.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var9.glTranslatef((float) arg1, (float) (class56.field870 - arg2), 0.0F);
        var9.glCallList(this.field4961[arg0]);
        var9.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([[B)V", line = 149)
    private final void method2015(byte[][] arg0) {
        if (this.field4959 != -1) {
            return;
        }
        this.field4962 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field5286[var2] > this.field4962) {
                this.field4962 = this.field5286[var2];
            }
            if (this.field5316[var2] > this.field4962) {
                this.field4962 = this.field5316[var2];
            }
        }
        this.field4962 *= 16;
        this.field4962 = class301.method2026(this.field4962, false);
        int var3 = this.field4962 / 16;
        byte[] var4 = new byte[this.field4962 * this.field4962 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field4962 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field5286[var5];
            int var11 = this.field5316[var5];
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
                var8 += (this.field4962 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class56.field848;
        if (this.field4959 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field4959 = var17[0];
            this.field4963 = class121.field2023;
        }
        class56.method354(this.field4959);
        var16.glTexImage2D(3553, 0, 6410, this.field4962, this.field4962, 0, 6410, 5121, var15);
        class121.field2022 += var15.limit() - this.field4960;
        this.field4960 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }
}
