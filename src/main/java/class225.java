import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class225 extends class212 {

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    private int field3898 = 0;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    private int field3897 = -1;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    private int field3899 = 0;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    private int field3902 = -1;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    private int field3900;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    private int field3901;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    private int field3903;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 6)
    private final void method1605(int arg0) {
        if (this.field3898 == arg0) {
            return;
        }
        this.field3898 = arg0;
        GL var2 = class147.field2479;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()V", line = 27)
    private final void method1606() {
        float var1 = (float) this.field3711 / (float) this.field3903;
        float var2 = (float) this.field3718 / (float) this.field3901;
        GL var3 = class147.field2479;
        if (this.field3902 == -1) {
            this.field3902 = var3.glGenLists(1);
            this.field3900 = class6.field47;
        }
        var3.glNewList(this.field3902, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3711, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3718));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3711, (float) (-this.field3718));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([B[I)V", line = 52)
    private final void method1607(byte[] arg0, int[] arg1) {
        this.field3903 = class135.method922(21793, this.field3711);
        this.field3901 = class135.method922(21793, this.field3718);
        byte[] var3 = new byte[this.field3903 * this.field3901 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3718; var6++) {
            for (int var7 = 0; var7 < this.field3711; var7++) {
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
            var4 += (this.field3903 - this.field3711) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class147.field2479;
        if (this.field3897 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field3897 = var12[0];
            this.field3900 = class6.field47;
        }
        class147.method1002(this.field3897);
        var11.glTexImage2D(3553, 0, 6408, this.field3903, this.field3901, 0, 6408, 5121, var10);
        class6.field48 += var10.limit() - this.field3899;
        this.field3899 = var10.limit();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)V", line = 112)
    public final void method1283(int arg0, int arg1, int arg2) {
        class147.method1021();
        int var4 = this.field3720 + arg0;
        int var5 = this.field3709 + arg1;
        GL var6 = class147.field2479;
        class147.method1002(this.field3897);
        this.method1605(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class147.field2495 - var5), 0.0F);
        var6.glCallList(this.field3902);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3715 = arg0;
        this.field3721 = arg1;
        this.field3720 = arg2;
        this.field3709 = arg3;
        this.field3711 = arg4;
        this.field3718 = arg5;
        this.method1607(arg6, arg7);
        this.method1606();
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V", line = 142)
    public final void method1284(int arg0, int arg1) {
        class147.method1015();
        int var3 = this.field3720 + arg0;
        int var4 = this.field3709 + arg1;
        GL var5 = class147.field2479;
        class147.method1002(this.field3897);
        this.method1605(1);
        var5.glTranslatef((float) var3, (float) (class147.field2495 - var4), 0.0F);
        var5.glCallList(this.field3902);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!hl", name = "finalize", descriptor = "()V", line = 154)
    protected final void finalize() throws Throwable {
        if (this.field3897 != -1) {
            class6.method36(this.field3897, this.field3899, this.field3900);
            this.field3897 = -1;
            this.field3899 = 0;
        }
        if (this.field3902 != -1) {
            class6.method40(this.field3902, this.field3900);
            this.field3902 = -1;
        }
        super.finalize();
    }
}
