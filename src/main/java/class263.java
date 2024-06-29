import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class263 extends class5 {

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    private int field4452 = -1;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    private int field4450 = 0;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    private int field4453 = -1;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    private int field4451 = 0;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    private int field4454;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    private int field4455;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    private int field4456;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V", line = 5)
    public final void method31(int arg0, int arg1, int arg2) {
        class281.method1988();
        int var4 = this.field69 + arg0;
        int var5 = this.field68 + arg1;
        GL var6 = class281.field4839;
        class281.method1953(this.field4452);
        this.method1832(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class281.field4823 - var5), 0.0F);
        var6.glCallList(this.field4453);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V", line = 19)
    public final void method28(int arg0, int arg1) {
        class281.method1977();
        int var3 = this.field69 + arg0;
        int var4 = this.field68 + arg1;
        GL var5 = class281.field4839;
        class281.method1953(this.field4452);
        this.method1832(1);
        var5.glTranslatef((float) var3, (float) (class281.field4823 - var4), 0.0F);
        var5.glCallList(this.field4453);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!rf", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() throws Throwable {
        if (this.field4452 != -1) {
            class139.method1043(this.field4452, this.field4450, this.field4455);
            this.field4452 = -1;
            this.field4450 = 0;
        }
        if (this.field4453 != -1) {
            class139.method1041(this.field4453, this.field4455);
            this.field4453 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V", line = 50)
    private final void method1831() {
        float var1 = (float) this.field70 / (float) this.field4454;
        float var2 = (float) this.field74 / (float) this.field4456;
        GL var3 = class281.field4839;
        if (this.field4453 == -1) {
            this.field4453 = var3.glGenLists(1);
            this.field4455 = class139.field2330;
        }
        var3.glNewList(this.field4453, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field70, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field74));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field70, (float) (-this.field74));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 75)
    private final void method1832(int arg0) {
        if (this.field4451 == arg0) {
            return;
        }
        this.field4451 = arg0;
        GL var2 = class281.field4839;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 112)
    public class263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field75 = arg0;
        this.field73 = arg1;
        this.field69 = arg2;
        this.field68 = arg3;
        this.field70 = arg4;
        this.field74 = arg5;
        this.method1833(arg6, arg7);
        this.method1831();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([B[I)V", line = 123)
    private final void method1833(byte[] arg0, int[] arg1) {
        this.field4454 = class287.method2033(this.field70, -1410546649);
        this.field4456 = class287.method2033(this.field74, -1410546649);
        byte[] var3 = new byte[this.field4456 * this.field4454 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field74; var6++) {
            for (int var7 = 0; var7 < this.field70; var7++) {
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
            var4 += (this.field4454 - this.field70) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class281.field4839;
        if (this.field4452 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field4452 = var12[0];
            this.field4455 = class139.field2330;
        }
        class281.method1953(this.field4452);
        var11.glTexImage2D(3553, 0, 6408, this.field4454, this.field4456, 0, 6408, 5121, var10);
        class139.field2325 += var10.limit() - this.field4450;
        this.field4450 = var10.limit();
    }
}
