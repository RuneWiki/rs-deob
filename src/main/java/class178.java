import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class178 extends class24 {

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    private int field2842 = 0;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    private int field2846 = -1;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    private int field2844 = -1;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    private int field2843 = 0;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    private int field2845;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    private int field2848;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([B[I)V", line = 5)
    private final void method1249(byte[] arg0, int[] arg1) {
        this.field2848 = class229.method1622(true, this.field276);
        this.field2845 = class229.method1622(true, this.field261);
        byte[] var3 = new byte[this.field2848 * this.field2845 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field261; var6++) {
            for (int var7 = 0; var7 < this.field276; var7++) {
                byte var8 = arg0[var5++];
                if (var8 == 0) {
                    var4 += 4;
                } else {
                    int var9 = arg1[var8];
                    var3[var4++] = (byte) (var9 >> 16);
                    var3[var4++] = (byte) (var9 >> 8);
                    var3[var4++] = (byte) var9;
                    var3[var4++] = -1;
                }
            }
            var4 += (this.field2848 - this.field276) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class154.field2479;
        if (this.field2844 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field2844 = var12[0];
            this.field2847 = class79.field1324;
        }
        class154.method1141(this.field2844);
        var11.glTexImage2D(3553, 0, 6408, this.field2848, this.field2845, 0, 6408, 5121, var10);
        class79.field1321 += var10.limit() - this.field2842;
        this.field2842 = var10.limit();
    }

    @OriginalMember(owner = "client!dm", name = "finalize", descriptor = "()V", line = 64)
    protected final void finalize() throws Throwable {
        if (this.field2844 != -1) {
            class79.method613(this.field2844, this.field2842, this.field2847);
            this.field2844 = -1;
            this.field2842 = 0;
        }
        if (this.field2846 != -1) {
            class79.method615(this.field2846, this.field2847);
            this.field2846 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V", line = 82)
    public final void method126(int arg0, int arg1, int arg2) {
        class154.method1143();
        int var4 = this.field270 + arg0;
        int var5 = this.field265 + arg1;
        GL var6 = class154.field2479;
        class154.method1141(this.field2844);
        this.method1250(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class154.field2464 - var5), 0.0F);
        var6.glCallList(this.field2846);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field262 = arg0;
        this.field259 = arg1;
        this.field270 = arg2;
        this.field265 = arg3;
        this.field276 = arg4;
        this.field261 = arg5;
        this.method1249(arg6, arg7);
        this.method1251();
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 99)
    private final void method1250(int arg0) {
        if (this.field2843 == arg0) {
            return;
        }
        this.field2843 = arg0;
        GL var2 = class154.field2479;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V", line = 129)
    public final void method124(int arg0, int arg1) {
        class154.method1121();
        int var3 = this.field270 + arg0;
        int var4 = this.field265 + arg1;
        GL var5 = class154.field2479;
        class154.method1141(this.field2844);
        this.method1250(1);
        var5.glTranslatef((float) var3, (float) (class154.field2464 - var4), 0.0F);
        var5.glCallList(this.field2846);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V", line = 142)
    private final void method1251() {
        float var1 = (float) this.field276 / (float) this.field2848;
        float var2 = (float) this.field261 / (float) this.field2845;
        GL var3 = class154.field2479;
        if (this.field2846 == -1) {
            this.field2846 = var3.glGenLists(1);
            this.field2847 = class79.field1324;
        }
        var3.glNewList(this.field2846, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field276, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field261));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field276, (float) (-this.field261));
        var3.glEnd();
        var3.glEndList();
    }
}
