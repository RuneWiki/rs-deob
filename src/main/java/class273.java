import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class273 extends class307 {

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    private int field4279 = -1;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    private int field4283 = 0;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    private int field4281 = -1;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    private int field4282 = 0;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    private int field4278;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    private int field4280;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 8)
    private final void method1972(int arg0) {
        if (this.field4282 == arg0) {
            return;
        }
        this.field4282 = arg0;
        GL var2 = class250.field3818;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ik", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() throws Throwable {
        if (this.field4279 != -1) {
            class266.method1935(this.field4279, this.field4283, this.field4284);
            this.field4279 = -1;
            this.field4283 = 0;
        }
        if (this.field4281 != -1) {
            class266.method1932(this.field4281, this.field4284);
            this.field4281 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field4741 = arg0;
        this.field4744 = arg1;
        this.field4748 = arg2;
        this.field4751 = arg3;
        this.field4743 = arg4;
        this.field4749 = arg5;
        this.method1974(arg6, arg7);
        this.method1973();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V", line = 53)
    public final void method1653(int arg0, int arg1, int arg2) {
        class250.method1829();
        int var4 = this.field4748 + arg0;
        int var5 = this.field4751 + arg1;
        GL var6 = class250.field3818;
        class250.method1806(this.field4279);
        this.method1972(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class250.field3820 - var5), 0.0F);
        var6.glCallList(this.field4281);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()V", line = 70)
    private final void method1973() {
        float var1 = (float) this.field4743 / (float) this.field4278;
        float var2 = (float) this.field4749 / (float) this.field4280;
        GL var3 = class250.field3818;
        if (this.field4281 == -1) {
            this.field4281 = var3.glGenLists(1);
            this.field4284 = class266.field4192;
        }
        var3.glNewList(this.field4281, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4743, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field4749));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4743, (float) (-this.field4749));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([B[I)V", line = 95)
    private final void method1974(byte[] arg0, int[] arg1) {
        this.field4278 = class258.method1873(this.field4743, 832520144);
        this.field4280 = class258.method1873(this.field4749, 832520144);
        byte[] var3 = new byte[this.field4280 * this.field4278 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field4749; var6++) {
            for (int var7 = 0; var7 < this.field4743; var7++) {
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
            var4 += (this.field4278 - this.field4743) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class250.field3818;
        if (this.field4279 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field4279 = var12[0];
            this.field4284 = class266.field4192;
        }
        class250.method1806(this.field4279);
        var11.glTexImage2D(3553, 0, 6408, this.field4278, this.field4280, 0, 6408, 5121, var10);
        class266.field4195 += var10.limit() - this.field4283;
        this.field4283 = var10.limit();
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V", line = 153)
    public final void method1657(int arg0, int arg1) {
        class250.method1825();
        int var3 = this.field4748 + arg0;
        int var4 = this.field4751 + arg1;
        GL var5 = class250.field3818;
        class250.method1806(this.field4279);
        this.method1972(1);
        var5.glTranslatef((float) var3, (float) (class250.field3820 - var4), 0.0F);
        var5.glCallList(this.field4281);
        var5.glLoadIdentity();
    }
}
