import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class324 extends class157 {

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    private int field4883 = 0;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    private int field4886 = -1;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    private int field4888 = 0;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    private int field4887 = -1;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    private int field4882;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    private int field4884;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    private int field4885;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 5)
    public final void method396(int arg0, int arg1) {
        class117.method833();
        int var3 = this.field2362 + arg0;
        int var4 = this.field2354 + arg1;
        GL var5 = class117.field1801;
        class117.method814(this.field4886);
        this.method2215(1);
        var5.glTranslatef((float) var3, (float) (class117.field1807 - var4), 0.0F);
        var5.glCallList(this.field4887);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field2361 = arg0;
        this.field2360 = arg1;
        this.field2362 = arg2;
        this.field2354 = arg3;
        this.field2350 = arg4;
        this.field2358 = arg5;
        this.method2213(arg6, arg7);
        this.method2214();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([B[I)V", line = 24)
    private final void method2213(byte[] arg0, int[] arg1) {
        this.field4884 = class104.method731(this.field2350, -110);
        this.field4885 = class104.method731(this.field2358, -57);
        byte[] var3 = new byte[this.field4885 * this.field4884 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2358; var6++) {
            for (int var7 = 0; var7 < this.field2350; var7++) {
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
            var4 += (this.field4884 - this.field2350) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class117.field1801;
        if (this.field4886 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field4886 = var12[0];
            this.field4882 = class174.field2589;
        }
        class117.method814(this.field4886);
        var11.glTexImage2D(3553, 0, 6408, this.field4884, this.field4885, 0, 6408, 5121, var10);
        class174.field2593 += var10.limit() - this.field4883;
        this.field4883 = var10.limit();
    }

    @OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V", line = 83)
    protected final void finalize() throws Throwable {
        if (this.field4886 != -1) {
            class174.method1212(this.field4886, this.field4883, this.field4882);
            this.field4886 = -1;
            this.field4883 = 0;
        }
        if (this.field4887 != -1) {
            class174.method1209(this.field4887, this.field4882);
            this.field4887 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V", line = 105)
    private final void method2214() {
        float var1 = (float) this.field2350 / (float) this.field4884;
        float var2 = (float) this.field2358 / (float) this.field4885;
        GL var3 = class117.field1801;
        if (this.field4887 == -1) {
            this.field4887 = var3.glGenLists(1);
            this.field4882 = class174.field2589;
        }
        var3.glNewList(this.field4887, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2350, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2358));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2350, (float) (-this.field2358));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 136)
    private final void method2215(int arg0) {
        if (this.field4888 == arg0) {
            return;
        }
        this.field4888 = arg0;
        GL var2 = class117.field1801;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V", line = 155)
    public final void method397(int arg0, int arg1, int arg2) {
        class117.method803();
        int var4 = this.field2362 + arg0;
        int var5 = this.field2354 + arg1;
        GL var6 = class117.field1801;
        class117.method814(this.field4886);
        this.method2215(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class117.field1807 - var5), 0.0F);
        var6.glCallList(this.field4887);
        var6.glLoadIdentity();
    }
}
