import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class46 extends class113 {

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    private int field690 = -1;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    private int field693 = 0;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    private int field695 = 0;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    private int field694 = -1;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    private int field692;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    private int field696;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V", line = 5)
    public final void method378(int arg0, int arg1) {
        class257.method1742();
        int var3 = this.field1952 + arg0;
        int var4 = this.field1953 + arg1;
        GL var5 = class257.field4409;
        class257.method1736(this.field694);
        this.method379(1);
        var5.glTranslatef((float) var3, (float) (class257.field4423 - var4), 0.0F);
        var5.glCallList(this.field690);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 18)
    private final void method379(int arg0) {
        if (this.field693 == arg0) {
            return;
        }
        this.field693 = arg0;
        GL var2 = class257.field4409;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V", line = 43)
    private final void method380() {
        float var1 = (float) this.field1950 / (float) this.field692;
        float var2 = (float) this.field1948 / (float) this.field696;
        GL var3 = class257.field4409;
        if (this.field690 == -1) {
            this.field690 = var3.glGenLists(1);
            this.field691 = class196.field3439;
        }
        var3.glNewList(this.field690, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field1950, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field1948));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field1950, (float) (-this.field1948));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V", line = 68)
    protected final void finalize() throws Throwable {
        if (this.field694 != -1) {
            class196.method1317(this.field694, this.field695, this.field691);
            this.field694 = -1;
            this.field695 = 0;
        }
        if (this.field690 != -1) {
            class196.method1316(this.field690, this.field691);
            this.field690 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field1944 = arg0;
        this.field1955 = arg1;
        this.field1952 = arg2;
        this.field1953 = arg3;
        this.field1950 = arg4;
        this.field1948 = arg5;
        this.method381(arg6, arg7);
        this.method380();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([B[I)V", line = 89)
    private final void method381(byte[] arg0, int[] arg1) {
        this.field692 = class286.method2014(this.field1950, 783135696);
        this.field696 = class286.method2014(this.field1948, 783135696);
        byte[] var3 = new byte[this.field696 * this.field692 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1948; var6++) {
            for (int var7 = 0; var7 < this.field1950; var7++) {
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
            var4 += (this.field692 - this.field1950) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class257.field4409;
        if (this.field694 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field694 = var12[0];
            this.field691 = class196.field3439;
        }
        class257.method1736(this.field694);
        var11.glTexImage2D(3553, 0, 6408, this.field692, this.field696, 0, 6408, 5121, var10);
        class196.field3440 += var10.limit() - this.field695;
        this.field695 = var10.limit();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V", line = 151)
    public final void method382(int arg0, int arg1, int arg2) {
        class257.method1739();
        int var4 = this.field1952 + arg0;
        int var5 = this.field1953 + arg1;
        GL var6 = class257.field4409;
        class257.method1736(this.field694);
        this.method379(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class257.field4423 - var5), 0.0F);
        var6.glCallList(this.field690);
        var6.glLoadIdentity();
    }
}
