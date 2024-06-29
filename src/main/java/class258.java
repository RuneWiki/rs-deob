import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class258 extends class220 {

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    private int field4306 = 0;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    private int field4310 = -1;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    private int field4311 = -1;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    private int field4309 = 0;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    private int field4305;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    private int field4307;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    private int field4308;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 6)
    private final void method1791() {
        float var1 = (float) this.field3621 / (float) this.field4305;
        float var2 = (float) this.field3615 / (float) this.field4308;
        GL var3 = class99.field1682;
        if (this.field4310 == -1) {
            this.field4310 = var3.glGenLists(1);
            this.field4307 = class274.field4577;
        }
        var3.glNewList(this.field4310, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field3621, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field3615));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field3621, (float) (-this.field3615));
        var3.glEnd();
        var3.glEndList();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V", line = 36)
    public final void method271(int arg0, int arg1) {
        class99.method752();
        int var3 = this.field3614 + arg0;
        int var4 = this.field3619 + arg1;
        GL var5 = class99.field1682;
        class99.method749(this.field4311);
        this.method1793(1);
        var5.glTranslatef((float) var3, (float) (class99.field1685 - var4), 0.0F);
        var5.glCallList(this.field4310);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V", line = 50)
    public final void method266(int arg0, int arg1, int arg2) {
        class99.method761();
        int var4 = this.field3614 + arg0;
        int var5 = this.field3619 + arg1;
        GL var6 = class99.field1682;
        class99.method749(this.field4311);
        this.method1793(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class99.field1685 - var5), 0.0F);
        var6.glCallList(this.field4310);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V", line = 63)
    protected final void finalize() throws Throwable {
        if (this.field4311 != -1) {
            class274.method1896(this.field4311, this.field4309, this.field4307);
            this.field4311 = -1;
            this.field4309 = 0;
        }
        if (this.field4310 != -1) {
            class274.method1901(this.field4310, this.field4307);
            this.field4310 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field3610 = arg0;
        this.field3611 = arg1;
        this.field3614 = arg2;
        this.field3619 = arg3;
        this.field3621 = arg4;
        this.field3615 = arg5;
        this.method1792(arg6, arg7);
        this.method1791();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([B[I)V", line = 84)
    private final void method1792(byte[] arg0, int[] arg1) {
        this.field4305 = class303.method2049(this.field3621, 2539);
        this.field4308 = class303.method2049(this.field3615, 2539);
        byte[] var3 = new byte[this.field4308 * this.field4305 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3615; var6++) {
            for (int var7 = 0; var7 < this.field3621; var7++) {
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
            var4 += (this.field4305 - this.field3621) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class99.field1682;
        if (this.field4311 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field4311 = var12[0];
            this.field4307 = class274.field4577;
        }
        class99.method749(this.field4311);
        var11.glTexImage2D(3553, 0, 6408, this.field4305, this.field4308, 0, 6408, 5121, var10);
        class274.field4581 += var10.limit() - this.field4309;
        this.field4309 = var10.limit();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 142)
    private final void method1793(int arg0) {
        if (this.field4306 == arg0) {
            return;
        }
        this.field4306 = arg0;
        GL var2 = class99.field1682;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }
}
