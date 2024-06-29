import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class67 extends class152 {

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    private int field1276 = 0;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    private int field1278 = -1;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    private int field1275 = -1;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    private int field1281 = 0;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V", line = 5)
    public final void method448(int arg0, int arg1) {
        class247.method1689();
        int var3 = this.field2626 + arg0;
        int var4 = this.field2615 + arg1;
        GL var5 = class247.field4253;
        class247.method1691(this.field1278);
        this.method449(1);
        var5.glTranslatef((float) var3, (float) (class247.field4246 - var4), 0.0F);
        var5.glCallList(this.field1275);
        var5.glLoadIdentity();
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 17)
    private final void method449(int arg0) {
        if (this.field1281 == arg0) {
            return;
        }
        this.field1281 = arg0;
        GL var2 = class247.field4253;
        if (arg0 == 2) {
            var2.glTexParameteri(3553, 10241, 9729);
            var2.glTexParameteri(3553, 10240, 9729);
        } else {
            var2.glTexParameteri(3553, 10241, 9728);
            var2.glTexParameteri(3553, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V", line = 36)
    public final void method450(int arg0, int arg1, int arg2) {
        class247.method1696();
        int var4 = this.field2626 + arg0;
        int var5 = this.field2615 + arg1;
        GL var6 = class247.field4253;
        class247.method1691(this.field1278);
        this.method449(1);
        var6.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
        var6.glTranslatef((float) var4, (float) (class247.field4246 - var5), 0.0F);
        var6.glCallList(this.field1275);
        var6.glLoadIdentity();
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 50)
    protected final void finalize() throws Throwable {
        if (this.field1278 != -1) {
            class274.method1921(this.field1278, this.field1276, this.field1277);
            this.field1278 = -1;
            this.field1276 = 0;
        }
        if (this.field1275 != -1) {
            class274.method1923(this.field1275, this.field1277);
            this.field1275 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([B[I)V", line = 68)
    private final void method451(byte[] arg0, int[] arg1) {
        this.field1279 = class58.method383((byte) -63, this.field2625);
        this.field1280 = class58.method383((byte) -114, this.field2610);
        byte[] var3 = new byte[this.field1280 * this.field1279 * 4];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2610; var6++) {
            for (int var7 = 0; var7 < this.field2625; var7++) {
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
            var4 += (this.field1279 - this.field2625) * 4;
        }
        ByteBuffer var10 = ByteBuffer.wrap(var3);
        GL var11 = class247.field4253;
        if (this.field1278 == -1) {
            int[] var12 = new int[1];
            var11.glGenTextures(1, var12, 0);
            this.field1278 = var12[0];
            this.field1277 = class274.field4748;
        }
        class247.method1691(this.field1278);
        var11.glTexImage2D(3553, 0, 6408, this.field1279, this.field1280, 0, 6408, 5121, var10);
        class274.field4746 += var10.limit() - this.field1276;
        this.field1276 = var10.limit();
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 170)
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field2619 = arg0;
        this.field2611 = arg1;
        this.field2626 = arg2;
        this.field2615 = arg3;
        this.field2625 = arg4;
        this.field2610 = arg5;
        this.method451(arg6, arg7);
        this.method452();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V", line = 135)
    private final void method452() {
        float var1 = (float) this.field2625 / (float) this.field1279;
        float var2 = (float) this.field2610 / (float) this.field1280;
        GL var3 = class247.field4253;
        if (this.field1275 == -1) {
            this.field1275 = var3.glGenLists(1);
            this.field1277 = class274.field4748;
        }
        var3.glNewList(this.field1275, 4864);
        var3.glBegin(6);
        var3.glTexCoord2f(var1, 0.0F);
        var3.glVertex2f((float) this.field2625, 0.0F);
        var3.glTexCoord2f(0.0F, 0.0F);
        var3.glVertex2f(0.0F, 0.0F);
        var3.glTexCoord2f(0.0F, var2);
        var3.glVertex2f(0.0F, (float) (-this.field2610));
        var3.glTexCoord2f(var1, var2);
        var3.glVertex2f((float) this.field2625, (float) (-this.field2610));
        var3.glEnd();
        var3.glEndList();
    }
}
