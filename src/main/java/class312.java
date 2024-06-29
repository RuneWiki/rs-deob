import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class312 extends class260 {

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    private int field4855 = -1;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    private int field4859 = -1;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    private int field4858 = 0;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    private int field4856 = 0;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    private int field4853;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    private int field4854;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!gh", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        if (this.field4859 != -1) {
            class230.method1627(this.field4859, this.field4856, this.field4854);
            this.field4859 = -1;
            this.field4856 = 0;
        }
        if (this.field4855 != -1) {
            class230.method1635(this.field4855, this.field4854);
            this.field4855 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V", line = 23)
    public final void method1856(int arg0, int arg1) {
        class232.method1652();
        int var3 = this.field4161 + arg0;
        int var4 = this.field4157 + arg1;
        GL var5 = class232.field3716;
        class232.method1662(this.field4859);
        this.method2196(1);
        var5.glTranslatef((float) var3, (float) (class232.field3731 - var4), 0.0F);
        var5.glCallList(this.field4855);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4154 = arg0;
        this.field4158 = arg1;
        this.field4161 = arg2;
        this.field4157 = arg3;
        this.field4163 = arg4;
        this.field4155 = arg5;
        this.method2197(arg6, arg7);
        this.method2198();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V", line = 42)
    public final void method1859(int arg0, int arg1, int arg2) {
        class232.method1678();
        int var4 = this.field4161 + arg0;
        int var5 = this.field4157 + arg1;
        GL var6 = class232.field3716;
        class232.method1662(this.field4859);
        this.method2196(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class232.field3731 - var5), 0.0F);
        var6.glCallList(this.field4855);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 57)
    private final void method2196(int arg0) {
        if (this.field4858 == arg0) {
            return;
        }
        this.field4858 = arg0;
        GL var2 = class232.field3716;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([B[I)V", line = 76)
    private final void method2197(byte[] arg0, int[] arg1) {
        this.field4853 = class120.method843(16, this.field4163);
        this.field4857 = class120.method843(89, this.field4155);
        byte[] var3 = new byte[this.field4857 * this.field4853 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4155; var6++) {
            for (int var7 = 0; var7 < this.field4163; var7++) {
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
            var4 += (this.field4853 - this.field4163) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class232.field3716;
        if (this.field4859 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field4859 = var12[0];
            this.field4854 = class230.field3658;
        }
        class232.method1662(this.field4859);
        var11.glTexImage2D(3553, 0, 6408, this.field4853, this.field4857, 0, 6408, 5121, var10);
        class230.field3662 += var10.limit() - this.field4856;
        this.field4856 = var10.limit();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V", line = 142)
    private final void method2198() {
        float var1 = (float) this.field4163 / (float) this.field4853;
        float var2 = (float) this.field4155 / (float) this.field4857;
        GL var3 = class232.field3716;
        if (this.field4855 == -1) {
            this.field4855 = var3.glGenLists(1);
            this.field4854 = class230.field3658;
        }
        var3.glNewList(this.field4855, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4163, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4155));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4163, (float) (-this.field4155));
        var3.glEnd();
        var3.glEndList();
    }
}
