import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class49 extends class238 {

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    private int field788 = -1;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    private int field789 = 0;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    private int field791 = -1;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    private int field794 = 0;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    private int field790;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    private int field792;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V", line = 7)
    public final void method351(int arg0, int arg1) {
        class47.method328();
        int var3 = this.field4005 + arg0;
        int var4 = this.field4002 + arg1;
        GL var5 = class47.field739;
        class47.method317(this.field788);
        this.method353(1);
        var5.glTranslatef((float) var3, (float) (class47.field762 - var4), 0.0F);
        var5.glCallList(this.field791);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 169)
    public class49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3997 = arg0;
        this.field3996 = arg1;
        this.field4005 = arg2;
        this.field4002 = arg3;
        this.field4007 = arg4;
        this.field3999 = arg5;
        this.method354(arg6, arg7);
        this.method352();
    }

    @OriginalMember(owner = "client!vh", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() throws Throwable {
        if (this.field788 != -1) {
            class119.method909(this.field788, this.field789, this.field793);
            this.field788 = -1;
            this.field789 = 0;
        }
        if (this.field791 != -1) {
            class119.method907(this.field791, this.field793);
            this.field791 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V", line = 40)
    private final void method352() {
        float var1 = (float) this.field4007 / (float) this.field792;
        float var2 = (float) this.field3999 / (float) this.field790;
        GL var3 = class47.field739;
        if (this.field791 == -1) {
            this.field791 = var3.glGenLists(1);
            this.field793 = class119.field2009;
        }
        var3.glNewList(this.field791, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field4007, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3999));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field4007, (float) (-this.field3999));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 65)
    private final void method353(int arg0) {
        if (this.field794 == arg0) {
            return;
        }
        this.field794 = arg0;
        GL var2 = class47.field739;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([B[I)V", line = 84)
    private final void method354(byte[] arg0, int[] arg1) {
        this.field792 = class118.method904(1440830960, this.field4007);
        this.field790 = class118.method904(1440830960, this.field3999);
        byte[] var3 = new byte[this.field792 * this.field790 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3999; var6++) {
            for (int var7 = 0; var7 < this.field4007; var7++) {
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
            var4 += (this.field792 - this.field4007) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class47.field739;
        if (this.field788 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field788 = var12[0];
            this.field793 = class119.field2009;
        }
        class47.method317(this.field788);
        var11.glTexImage2D(3553, 0, 6408, this.field792, this.field790, 0, 6408, 5121, var10);
        class119.field2005 += var10.limit() - this.field789;
        this.field789 = var10.limit();
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V", line = 151)
    public final void method355(int arg0, int arg1, int arg2) {
        class47.method323();
        int var4 = this.field4005 + arg0;
        int var5 = this.field4002 + arg1;
        GL var6 = class47.field739;
        class47.method317(this.field788);
        this.method353(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class47.field762 - var5), 0.0F);
        var6.glCallList(this.field791);
        var6.glLoadIdentity();
    }
}
