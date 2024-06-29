import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class66 extends class327 {

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    private int field954 = 0;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    private int field952 = -1;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    private int field956 = 0;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    private int field953 = -1;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    private int field957;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 5)
    private final void method475(int arg0) {
        if (this.field956 == arg0) {
            return;
        }
        this.field956 = arg0;
        GL var2 = class73.field1051;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V", line = 29)
    public final void method324(int arg0, int arg1, int arg2) {
        class73.method533();
        int var4 = this.field5044 + arg0;
        int var5 = this.field5045 + arg1;
        GL var6 = class73.field1051;
        class73.method537(this.field953);
        this.method475(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class73.field1080 - var5), 0.0F);
        var6.glCallList(this.field952);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([B[I)V", line = 42)
    private final void method476(byte[] arg0, int[] arg1) {
        this.field951 = class312.method2135(984942384, this.field5047);
        this.field957 = class312.method2135(984942384, this.field5049);
        byte[] var3 = new byte[this.field957 * this.field951 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field5049; var6++) {
            for (int var7 = 0; var7 < this.field5047; var7++) {
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
            var4 += (this.field951 - this.field5047) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class73.field1051;
        if (this.field953 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field953 = var12[0];
            this.field955 = class80.field1183;
        }
        class73.method537(this.field953);
        var11.glTexImage2D(3553, 0, 6408, this.field951, this.field957, 0, 6408, 5121, var10);
        class80.field1184 += var10.limit() - this.field954;
        this.field954 = var10.limit();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V", line = 103)
    private final void method477() {
        float var1 = (float) this.field5047 / (float) this.field951;
        float var2 = (float) this.field5049 / (float) this.field957;
        GL var3 = class73.field1051;
        if (this.field952 == -1) {
            this.field952 = var3.glGenLists(1);
            this.field955 = class80.field1183;
        }
        var3.glNewList(this.field952, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field5047, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field5049));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field5047, (float) (-this.field5049));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field5052 = arg0;
        this.field5051 = arg1;
        this.field5044 = arg2;
        this.field5045 = arg3;
        this.field5047 = arg4;
        this.field5049 = arg5;
        this.method476(arg6, arg7);
        this.method477();
    }

    @OriginalMember(owner = "client!vf", name = "finalize", descriptor = "()V", line = 131)
    protected final void finalize() throws Throwable {
        if (this.field953 != -1) {
            class80.method619(this.field953, this.field954, this.field955);
            this.field953 = -1;
            this.field954 = 0;
        }
        if (this.field952 != -1) {
            class80.method623(this.field952, this.field955);
            this.field952 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V", line = 159)
    public final void method322(int arg0, int arg1) {
        class73.method557();
        int var3 = this.field5044 + arg0;
        int var4 = this.field5045 + arg1;
        GL var5 = class73.field1051;
        class73.method537(this.field953);
        this.method475(1);
        var5.glTranslatef((float) var3, (float) (class73.field1080 - var4), 0.0F);
        var5.glCallList(this.field952);
        var5.glLoadIdentity();
    }
}
