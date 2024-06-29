import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class309 extends class229 {

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    private int field5293 = -1;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    private int field5292 = 0;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    private int field5296 = 0;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    private int field5298 = -1;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    private int field5294;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    private int field5295;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    private int field5297;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V", line = 5)
    public final void method1573(int arg0, int arg1, int arg2) {
        class217.method1455();
        int var4 = this.field3745 + arg0;
        int var5 = this.field3741 + arg1;
        GL var6 = class217.field3551;
        class217.method1457(this.field5298);
        this.method2147(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class217.field3531 - var5), 0.0F);
        var6.glCallList(this.field5293);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([B[I)V", line = 18)
    private final void method2146(byte[] arg0, int[] arg1) {
        this.field5295 = class270.method1847(this.field3746, 96);
        this.field5297 = class270.method1847(this.field3736, 96);
        byte[] var3 = new byte[this.field5297 * this.field5295 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3736; var6++) {
            for (int var7 = 0; var7 < this.field3746; var7++) {
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
            var4 += (this.field5295 - this.field3746) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class217.field3551;
        if (this.field5298 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field5298 = var12[0];
            this.field5294 = class207.field3383;
        }
        class217.method1457(this.field5298);
        var11.glTexImage2D(3553, 0, 6408, this.field5295, this.field5297, 0, 6408, 5121, var10);
        class207.field3382 += var10.limit() - this.field5296;
        this.field5296 = var10.limit();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V", line = 76)
    public final void method1572(int arg0, int arg1) {
        class217.method1477();
        int var3 = this.field3745 + arg0;
        int var4 = this.field3741 + arg1;
        GL var5 = class217.field3551;
        class217.method1457(this.field5298);
        this.method2147(1);
        var5.glTranslatef((float) var3, (float) (class217.field3531 - var4), 0.0F);
        var5.glCallList(this.field5293);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3740 = arg0;
        this.field3743 = arg1;
        this.field3745 = arg2;
        this.field3741 = arg3;
        this.field3746 = arg4;
        this.field3736 = arg5;
        this.method2146(arg6, arg7);
        this.method2148();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 101)
    private final void method2147(int arg0) {
        if (this.field5292 == arg0) {
            return;
        }
        this.field5292 = arg0;
        GL var2 = class217.field3551;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V", line = 122)
    private final void method2148() {
        float var1 = (float) this.field3746 / (float) this.field5295;
        float var2 = (float) this.field3736 / (float) this.field5297;
        GL var3 = class217.field3551;
        if (this.field5293 == -1) {
            this.field5293 = var3.glGenLists(1);
            this.field5294 = class207.field3383;
        }
        var3.glNewList(this.field5293, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3746, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3736));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3746, (float) (-this.field3736));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V", line = 147)
    protected final void finalize() throws Throwable {
        if (this.field5298 != -1) {
            class207.method1398(this.field5298, this.field5296, this.field5294);
            this.field5298 = -1;
            this.field5296 = 0;
        }
        if (this.field5293 != -1) {
            class207.method1396(this.field5293, this.field5294);
            this.field5293 = -1;
        }
        super.finalize();
    }
}
