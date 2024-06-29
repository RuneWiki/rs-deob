import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class249 extends class34 {

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    private int field4142 = -1;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    private int field4145 = 0;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    private int field4147 = -1;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    private int field4141 = 0;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    private int field4143;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    private int field4144;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    private int field4146;

    @OriginalMember(owner = "client!id", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        if (this.field4142 != -1) {
            class41.method307(this.field4142, this.field4145, this.field4143);
            this.field4142 = -1;
            this.field4145 = 0;
        }
        if (this.field4147 != -1) {
            class41.method303(this.field4147, this.field4143);
            this.field4147 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V", line = 26)
    public final void method272(int arg0, int arg1, int arg2) {
        class117.method932();
        int var4 = this.field545 + arg0;
        int var5 = this.field543 + arg1;
        GL var6 = class117.field2143;
        class117.method939(this.field4142);
        this.method1744(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class117.field2126 - var5), 0.0F);
        var6.glCallList(this.field4147);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V", line = 40)
    private final void method1744(int arg0) {
        if (this.field4141 == arg0) {
            return;
        }
        this.field4141 = arg0;
        GL var2 = class117.field2143;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([B[I)V", line = 59)
    private final void method1745(byte[] arg0, int[] arg1) {
        this.field4144 = class237.method1678(this.field556, -31981);
        this.field4146 = class237.method1678(this.field557, -31981);
        byte[] var3 = new byte[this.field4146 * this.field4144 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field557; var6++) {
            for (int var7 = 0; var7 < this.field556; var7++) {
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
            var4 += (this.field4144 - this.field556) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class117.field2143;
        if (this.field4142 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field4142 = var12[0];
            this.field4143 = class41.field659;
        }
        class117.method939(this.field4142);
        var11.glTexImage2D(3553, 0, 6408, this.field4144, this.field4146, 0, 6408, 5121, var10);
        class41.field661 += var10.limit() - this.field4145;
        this.field4145 = var10.limit();
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field547 = arg0;
        this.field549 = arg1;
        this.field545 = arg2;
        this.field543 = arg3;
        this.field556 = arg4;
        this.field557 = arg5;
        this.method1745(arg6, arg7);
        this.method1746();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 125)
    public final void method266(int arg0, int arg1) {
        class117.method949();
        int var3 = this.field545 + arg0;
        int var4 = this.field543 + arg1;
        GL var5 = class117.field2143;
        class117.method939(this.field4142);
        this.method1744(1);
        var5.glTranslatef((float) var3, (float) (class117.field2126 - var4), 0.0F);
        var5.glCallList(this.field4147);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V", line = 140)
    private final void method1746() {
        float var1 = (float) this.field556 / (float) this.field4144;
        float var2 = (float) this.field557 / (float) this.field4146;
        GL var3 = class117.field2143;
        if (this.field4147 == -1) {
            this.field4147 = var3.glGenLists(1);
            this.field4143 = class41.field659;
        }
        var3.glNewList(this.field4147, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field556, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field557));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field556, (float) (-this.field557));
        var3.glEnd();
        var3.glEndList();
    }
}
