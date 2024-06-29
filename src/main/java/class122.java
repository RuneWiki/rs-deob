import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class122 extends class278 {

    @OriginalMember(owner = "client!ca", name = "Bb", descriptor = "I")
    private int field1902 = 0;

    @OriginalMember(owner = "client!ca", name = "zb", descriptor = "I")
    private int field1900 = -1;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    private int field1898;

    @OriginalMember(owner = "client!ca", name = "yb", descriptor = "I")
    private int field1899;

    @OriginalMember(owner = "client!ca", name = "Ab", descriptor = "[I")
    private int[] field1901;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([[B)V", line = 10)
    private final void method817(byte[][] arg0) {
        if (this.field1900 != -1) {
            return;
        }
        this.field1899 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            if (this.field4581[var2] > this.field1899) {
                this.field1899 = this.field4581[var2];
            }
            if (this.field4564[var2] > this.field1899) {
                this.field1899 = this.field4564[var2];
            }
        }
        this.field1899 *= 16;
        this.field1899 = class140.method925(this.field1899, (byte) 125);
        int var3 = this.field1899 / 16;
        byte[] var4 = new byte[this.field1899 * this.field1899 * 2];
        for (int var5 = 0; var5 < 256; var5++) {
            int var6 = var5 % 16 * var3;
            int var7 = var5 / 16 * var3;
            int var8 = (this.field1899 * var7 + var6) * 2;
            int var9 = 0;
            int var10 = this.field4581[var5];
            int var11 = this.field4564[var5];
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
                var8 += (this.field1899 - var11) * 2;
            }
        }
        ByteBuffer var15 = ByteBuffer.wrap(var4);
        GL var16 = class264.field4313;
        if (this.field1900 == -1) {
            int[] var17 = new int[1];
            var16.glGenTextures(1, var17, 0);
            this.field1900 = var17[0];
            this.field1898 = class143.field2280;
        }
        class264.method1722(this.field1900);
        var16.glTexImage2D(3553, 0, 6410, this.field1899, this.field1899, 0, 6410, 5121, var15);
        class143.field2277 += var15.limit() - this.field1902;
        this.field1902 = var15.limit();
        var16.glTexParameteri(3553, 10241, 9728);
        var16.glTexParameteri(3553, 10240, 9728);
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V", line = 104)
    protected final void finalize() throws Throwable {
        if (this.field1900 != -1) {
            class143.method939(this.field1900, this.field1902, this.field1898);
            this.field1900 = -1;
            this.field1902 = 0;
        }
        if (this.field1901 != null) {
            for (int var1 = 0; var1 < this.field1901.length; var1++) {
                class143.method938(this.field1901[var1], this.field1898);
            }
            this.field1901 = null;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIIIII)V", line = 126)
    public final void method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264.method1707();
        GL var7 = class264.field4313;
        class264.method1722(this.field1900);
        var7.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var7.glTranslatef((float) arg1, (float) (class264.field4290 - arg2), 0.0F);
        var7.glCallList(this.field1901[arg0]);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIII)V", line = 137)
    public final void method819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264.method1707();
        GL var7 = class264.field4313;
        class264.method1722(this.field1900);
        var7.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
        var7.glTranslatef((float) arg1, (float) (class264.field4290 - arg2), 0.0F);
        var7.glCallList(this.field1901[arg0]);
        var7.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()V", line = 147)
    private final void method820() {
        if (this.field1901 != null) {
            return;
        }
        this.field1901 = new int[256];
        GL var1 = class264.field4313;
        for (int var2 = 0; var2 < 256; var2++) {
            float var3 = (float) (var2 % 16) / 16.0F;
            float var4 = (float) (var2 / 16) / 16.0F;
            float var5 = (float) this.field4564[var2] / (float) this.field1899 + var3;
            float var6 = (float) this.field4581[var2] / (float) this.field1899 + var4;
            this.field1901[var2] = var1.glGenLists(1);
            var1.glNewList(this.field1901[var2], 4864);
            var1.glBegin(6);
            var1.glTexCoord2f(var5, var4);
            var1.glVertex2f((float) this.field4564[var2], 0.0F);
            var1.glTexCoord2f(var3, var4);
            var1.glVertex2f(0.0F, 0.0F);
            var1.glTexCoord2f(var3, var6);
            var1.glVertex2f(0.0F, (float) (-this.field4581[var2]));
            var1.glTexCoord2f(var5, var6);
            var1.glVertex2f((float) this.field4564[var2], (float) (-this.field4581[var2]));
            var1.glEnd();
            var1.glEndList();
        }
        this.field1898 = class143.field2280;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V", line = 185)
    public final void method821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class264.method1707();
        GL var8 = class264.field4313;
        class264.method1722(this.field1900);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var8.glTranslatef((float) arg1, (float) (class264.field4290 - arg2), 0.0F);
        var8.glCallList(this.field1901[arg0]);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIIIIII)V", line = 195)
    public final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class264.method1707();
        GL var8 = class264.field4313;
        class264.method1722(this.field1900);
        var8.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
        var8.glTranslatef((float) arg1, (float) (class264.field4290 - arg2), 0.0F);
        var8.glCallList(this.field1901[arg0]);
        var8.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 206)
    public class122(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.method817(arg5);
        this.method820();
    }
}
